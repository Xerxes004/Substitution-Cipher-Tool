/**
 * Title      : File Parser
 * Description: An input .txt "calibration" file is input to the system, and
 *              its letter frequencies are analyzed and made available to the
 *              user.
 * Copyright  : Copyright (c) 2015, Wesley Kelly, Cedarville University
 * Company    : N/A
 * @author    : Wesley Kelly
 * @version 1.0
 */

package SubstitutionCipherTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    /*
     * 1. Get input file
     * 2. Scan file for letters, throw out all others
     * 3. Store letter frequencies as relative frequency 
     * 4. Sort letters and frequencies by frequency
     *      -- output to console to verify
     * 5. Display 
     * 6. Allow user to get full arrays?
     */

public class FileParser {

    public FileParser() {
        calibrationFile = null;
        cipherFile = null;
        
        calibrationValues = new double[26];
        
        alphabet = new char[26];
        
        for (int i = 0; i < 26; i++) {
            calibrationValues[i] = 0.0;
            alphabet[i] = (char)('A' + i);
        }
    }
    
    private File calibrationFile;
    private File cipherFile;
    private double[] calibrationValues;
    private double[] cipherValues;
    private char[] alphabet;
    private String calibrationData;
    private String ciphertextData;
    
    public void setCalibrationFile (File newCalibrationFile) {
        calibrationFile = newCalibrationFile;
        
    }
    
    public File getCalibrationFile () {
        return calibrationFile;
    }
    
    public void setCipherFile (File newCipherFile) {
        cipherFile = newCipherFile;
    }
    
    public File getCipherFile () {
        return cipherFile;
    }
    
    private void setCalibrationData (String calData) {
        calibrationData = calData;
    }
    
    public String getCalibrationData () {
        return calibrationData;
    }
    
    private void setCiphertextData (String cipherData) {
        ciphertextData = cipherData;
    }
    
    public String getCiphertextData () {
        return ciphertextData;
    }
    
    public boolean parseAndCalibrateAllSelectedFiles () {
        boolean finishedSuccessfully = false;
        if (calibrationFile != null) {
            try {
                Scanner line = new Scanner(calibrationFile);
                    //count total characters for relative freq division
                int countTotalChars = 0;
                
                while (line.hasNext()) {
                    String nextLine = line.next();
                    for (int i = 0; i < nextLine.length(); i++) {
                        if (Character.isLetter(nextLine.charAt(i))) {
                            countTotalChars++;
                            calibrationValues[Character.toUpperCase(nextLine.charAt(i)) - 'A']++;
                        }
                    }
                }
                String calTextFieldAppend = new String();
                String nbsp = System.getProperty("line.separator");
                
                sortyByRelativeFrequency();
                
                for (int i = 0; i < 26; i++) {
                    calibrationValues[i] = calibrationValues[i] / countTotalChars;
                    calTextFieldAppend += (alphabet[i] + ": " + String.format("%.4f",calibrationValues[i]) + nbsp);
                }
                
                //CalibrationDataFieldTextArea.setText(calTextFieldAppend);
                setCalibrationData(calTextFieldAppend);
            }
            catch (FileNotFoundException ex) {
                System.out.println("File not found: " + ex.getMessage());
            }
            finishedSuccessfully = true;
        }
        
        if (cipherFile != null) {
            try {
                Scanner line = new Scanner(cipherFile);
                    //count total characters for relative freq division
                int countTotalChars = 0;
                
                while (line.hasNext()) {
                    String nextLine = line.next();
                    for (int i = 0; i < nextLine.length(); i++) {
                        if (Character.isLetter(nextLine.charAt(i))) {
                            countTotalChars++;
                            calibrationValues[Character.toUpperCase(nextLine.charAt(i)) - 'A']++;
                        }
                    }
                }
                String calTextFieldAppend = new String();
                String nbsp = System.getProperty("line.separator");
                
                sortyByRelativeFrequency();
                
                for (int i = 0; i < 26; i++) {
                    calibrationValues[i] = calibrationValues[i] / countTotalChars;
                    calTextFieldAppend += (alphabet[i] + ": " + String.format("%.4f",calibrationValues[i]) + nbsp);
                }
                
                //CalibrationDataFieldTextArea.setText(calTextFieldAppend);
                setCalibrationData(calTextFieldAppend);
            }
            catch (FileNotFoundException ex) {
                System.out.println("File not found: " + ex.getMessage());
            }
            finishedSuccessfully = true;
        }
        return finishedSuccessfully;
    }
    
    private void sortyByRelativeFrequency() {
        double tempDoub;
        char tempChar;
        
        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                if (calibrationValues[j] > calibrationValues[i]) {
                    
                    tempDoub = calibrationValues[i];
                    calibrationValues[i] = calibrationValues[j];
                    calibrationValues[j] = tempDoub;
                    
                    tempChar = alphabet[i];
                    alphabet[i] = alphabet[j];
                    alphabet[j] = tempChar;
                }
            }
        }
    }
}