/**
 * Author : Wesley Kelly
 */
package SubstitutionCipherTool;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;


/**
 *
 * @author WesKellyPC
 */
public class MainGUIWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainGUIWindow
     */
    public MainGUIWindow() {
        initComponents();
        
        calibrationFile = null;
        cipherFile = null;
        
        FileSelector.setDialogTitle("Select File");
        this.setTitle("Substitution Cipher Tool - Wesley Kelly, James Von Eiff");
        
        calibrationValues = new double[26];
        for (int i = 0; i < 26; i++) {
            calibrationValues[i] = 0.0;
        }
        
        alphabet = new char[26];
        
    }
    
    private File calibrationFile;
    private File cipherFile;
    private double[] calibrationValues;
    private char[] alphabet;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileSelector = new javax.swing.JFileChooser();
        MainWindowPane = new javax.swing.JPanel();
        CalibrationFileSelectorLabel = new javax.swing.JLabel();
        SelectCalibrationFileButton = new javax.swing.JButton();
        CipherFileSelectorLabel = new javax.swing.JLabel();
        SelectCipherFileButton = new javax.swing.JButton();
        CalibrationFileBrowserLabel = new javax.swing.JLabel();
        CipherFileBrowserLabel = new javax.swing.JLabel();
        CalibrateButton = new javax.swing.JButton();
        CipherFileDataField = new javax.swing.JTextField();
        CalibrationDataLabel = new javax.swing.JLabel();
        CipherFileDataLabel = new javax.swing.JLabel();
        DecipherButton = new javax.swing.JButton();
        CalFreqScrollPane = new javax.swing.JScrollPane();
        CalibrationDataFieldTextArea = new javax.swing.JTextArea();
        CipherFreqScrollPane = new javax.swing.JScrollPane();
        CipherDataFieldTextArea = new javax.swing.JTextArea();
        CipherFreqLabel = new javax.swing.JLabel();

        FileSelector.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        FileSelector.setCurrentDirectory(new java.io.File("D:\\Dropbox\\Cedarville\\2-Sophomore\\Spring 2015\\Computer Security\\Programming Projects\\Proj 1\\shakespeare_cipher.txt"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainWindowPane.setName("Substitution Cipher Cracker"); // NOI18N

        CalibrationFileSelectorLabel.setText(" ");
        CalibrationFileSelectorLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SelectCalibrationFileButton.setText("Select Calibration File...");
        SelectCalibrationFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCalibrationFileButtonActionPerformed(evt);
            }
        });

        CipherFileSelectorLabel.setText("  ");
        CipherFileSelectorLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SelectCipherFileButton.setText("Select Cipher File...");
        SelectCipherFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCipherFileButtonActionPerformed(evt);
            }
        });

        CalibrationFileBrowserLabel.setText("Calibration File");

        CipherFileBrowserLabel.setText("Cipher File");

        CalibrateButton.setText("Calibrate");
        CalibrateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalibrateButtonActionPerformed(evt);
            }
        });

        CalibrationDataLabel.setText("Cal freq:");

        CipherFileDataLabel.setText("Cipher File Raw Data:");

        DecipherButton.setText("Decipher");
        DecipherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecipherButtonActionPerformed(evt);
            }
        });

        CalFreqScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CalFreqScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        CalibrationDataFieldTextArea.setEditable(false);
        CalibrationDataFieldTextArea.setColumns(20);
        CalibrationDataFieldTextArea.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        CalibrationDataFieldTextArea.setRows(4);
        CalibrationDataFieldTextArea.setTabSize(4);
        CalibrationDataFieldTextArea.setAutoscrolls(false);
        CalFreqScrollPane.setViewportView(CalibrationDataFieldTextArea);

        CipherFreqScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CipherFreqScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        CipherDataFieldTextArea.setColumns(20);
        CipherDataFieldTextArea.setRows(5);
        CipherFreqScrollPane.setViewportView(CipherDataFieldTextArea);

        CipherFreqLabel.setText("Cipher freq:");

        javax.swing.GroupLayout MainWindowPaneLayout = new javax.swing.GroupLayout(MainWindowPane);
        MainWindowPane.setLayout(MainWindowPaneLayout);
        MainWindowPaneLayout.setHorizontalGroup(
            MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainWindowPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainWindowPaneLayout.createSequentialGroup()
                        .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CalibrationFileBrowserLabel)
                            .addComponent(CipherFileBrowserLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CalibrationFileSelectorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CipherFileSelectorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SelectCalibrationFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelectCipherFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CalibrateButton)
                            .addComponent(DecipherButton)))
                    .addGroup(MainWindowPaneLayout.createSequentialGroup()
                        .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CalibrationDataLabel)
                            .addComponent(CalFreqScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CipherFreqScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CipherFreqLabel))
                        .addGap(18, 18, 18)
                        .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CipherFileDataField, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CipherFileDataLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainWindowPaneLayout.setVerticalGroup(
            MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainWindowPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SelectCalibrationFileButton)
                        .addComponent(CalibrateButton))
                    .addGroup(MainWindowPaneLayout.createSequentialGroup()
                        .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CalibrationFileSelectorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CalibrationFileBrowserLabel))
                        .addGap(3, 3, 3)))
                .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CipherFileSelectorLabel)
                    .addComponent(SelectCipherFileButton)
                    .addComponent(CipherFileBrowserLabel)
                    .addComponent(DecipherButton))
                .addGap(40, 40, 40)
                .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalibrationDataLabel)
                    .addComponent(CipherFileDataLabel)
                    .addComponent(CipherFreqLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CipherFileDataField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainWindowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CalFreqScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CipherFreqScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainWindowPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainWindowPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalibrateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalibrateButtonActionPerformed
        if (calibrationFile != null) {
            try {
                Scanner line = new Scanner(calibrationFile);
                
                int countTotalChars = 0;
                while (line.hasNext()) {
                    String nextLine = line.next();
                    for (int i = 0; i < nextLine.length(); i++) {
                        if (Character.isLetter(nextLine.charAt(i))) {
                            countTotalChars++;
                            calibrationValues[Character.toUpperCase(nextLine.charAt(i)) - 'A']++;
                            alphabet[Character.toUpperCase(nextLine.charAt(i)) - 'A'] = Character.toUpperCase(nextLine.charAt(i));
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
                
                CalibrationDataFieldTextArea.setText(calTextFieldAppend);
            }
            catch (FileNotFoundException ex) {
                System.out.println("File not found: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_CalibrateButtonActionPerformed
    
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
    
    private void SelectCipherFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectCipherFileButtonActionPerformed
        if (FileSelector.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            this.cipherFile = FileSelector.getSelectedFile();
            CipherFileSelectorLabel.setText(this.cipherFile.getName());
        }
        FileSelector.setVisible(true);
    }//GEN-LAST:event_SelectCipherFileButtonActionPerformed

    private void SelectCalibrationFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectCalibrationFileButtonActionPerformed
        if (FileSelector.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            this.calibrationFile = FileSelector.getSelectedFile();
            CalibrationFileSelectorLabel.setText(this.calibrationFile.getName());
        }
        FileSelector.setVisible(true);
    }//GEN-LAST:event_SelectCalibrationFileButtonActionPerformed

    private void DecipherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecipherButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DecipherButtonActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUIWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CalFreqScrollPane;
    private javax.swing.JButton CalibrateButton;
    private javax.swing.JTextArea CalibrationDataFieldTextArea;
    private javax.swing.JLabel CalibrationDataLabel;
    private javax.swing.JLabel CalibrationFileBrowserLabel;
    private javax.swing.JLabel CalibrationFileSelectorLabel;
    private javax.swing.JTextArea CipherDataFieldTextArea;
    private javax.swing.JLabel CipherFileBrowserLabel;
    private javax.swing.JTextField CipherFileDataField;
    private javax.swing.JLabel CipherFileDataLabel;
    private javax.swing.JLabel CipherFileSelectorLabel;
    private javax.swing.JLabel CipherFreqLabel;
    private javax.swing.JScrollPane CipherFreqScrollPane;
    private javax.swing.JButton DecipherButton;
    private javax.swing.JFileChooser FileSelector;
    private javax.swing.JPanel MainWindowPane;
    private javax.swing.JButton SelectCalibrationFileButton;
    private javax.swing.JButton SelectCipherFileButton;
    // End of variables declaration//GEN-END:variables
}
