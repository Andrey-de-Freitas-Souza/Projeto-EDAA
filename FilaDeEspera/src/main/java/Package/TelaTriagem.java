/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Package;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class TelaTriagem extends javax.swing.JFrame {

    /**
     * Creates new form TelaTriagem
     */
    public TelaTriagem() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        txtNascimento.setBackground(new Color(0,0,0,0));
        txtNome.setBackground(new Color(0,0,0,0));
        cbxGravida.setBackground(new Color(0,0,0,0));
        cbxDor.setBackground(new Color(0,0,0,0));
        txtTemperatura.setBackground(new Color(0,0,0,0));
        btnRegistrar.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        sldTemp = new javax.swing.JSlider();
        cbxGravida = new javax.swing.JComboBox<>();
        txtTemperatura = new javax.swing.JTextField();
        cbxDor = new javax.swing.JComboBox<>();
        txtNascimento = new javax.swing.JFormattedTextField();
        checkLeve1 = new javax.swing.JCheckBox();
        checkMedio = new javax.swing.JCheckBox();
        checkMedio2 = new javax.swing.JCheckBox();
        checkGrave1 = new javax.swing.JCheckBox();
        checkGrave2 = new javax.swing.JCheckBox();
        checkGrave3 = new javax.swing.JCheckBox();
        checGravissimo1 = new javax.swing.JCheckBox();
        checGravissimo2 = new javax.swing.JCheckBox();
        checGravissimo3 = new javax.swing.JCheckBox();
        checGravissimo4 = new javax.swing.JCheckBox();
        checGravissimo5 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnRegistrar.png"))); // NOI18N
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 493, 230, 60));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNome.setBorder(null);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 350, 40));

        sldTemp.setMaximum(500);
        sldTemp.setMinimum(300);
        sldTemp.setValue(370);
        sldTemp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldTempStateChanged(evt);
            }
        });
        getContentPane().add(sldTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 140, -1));

        cbxGravida.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbxGravida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        getContentPane().add(cbxGravida, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 232, 120, 40));

        txtTemperatura.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTemperatura.setText("37.0");
        txtTemperatura.setBorder(null);
        txtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaActionPerformed(evt);
            }
        });
        getContentPane().add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 232, 130, 40));

        cbxDor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbxDor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Dores", "Dores Leves", "Dores Moderadas", "Dores Severas" }));
        getContentPane().add(cbxDor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 232, 170, 40));

        txtNascimento.setBorder(null);
        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimento.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        getContentPane().add(txtNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 165, 110, 30));

        checkLeve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLeve1ActionPerformed(evt);
            }
        });
        getContentPane().add(checkLeve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 529, -1, -1));
        getContentPane().add(checkMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 537, -1, -1));
        getContentPane().add(checkMedio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 562, -1, -1));
        getContentPane().add(checkGrave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 417, -1, -1));
        getContentPane().add(checkGrave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 392, -1, -1));
        getContentPane().add(checkGrave3, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 365, -1, -1));

        checGravissimo1.setBorder(null);
        checGravissimo1.setContentAreaFilled(false);
        getContentPane().add(checGravissimo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 366, -1, -1));

        checGravissimo2.setBorder(null);
        checGravissimo2.setContentAreaFilled(false);
        getContentPane().add(checGravissimo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 391, -1, -1));

        checGravissimo3.setBorder(null);
        checGravissimo3.setContentAreaFilled(false);
        getContentPane().add(checGravissimo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 416, -1, -1));

        checGravissimo4.setBorder(null);
        checGravissimo4.setContentAreaFilled(false);
        getContentPane().add(checGravissimo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 441, -1, -1));

        checGravissimo5.setBorder(null);
        checGravissimo5.setContentAreaFilled(false);
        getContentPane().add(checGravissimo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 466, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaTriagem.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldTempStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldTempStateChanged
        double value = sldTemp.getValue() / 10.0;
        txtTemperatura.setText(String.valueOf(value));
    }//GEN-LAST:event_sldTempStateChanged

    private void txtTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperaturaActionPerformed

    private void checkLeve1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLeve1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLeve1ActionPerformed

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnRegistrar2.png")));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnRegistrar.png")));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nome = txtNome.getText();
        String prioridade = "Azul";
        int gravissimos = 0;
        int graves = 0;
        int medios = 0;
        int leves = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if(txtNascimento.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(null, "Data inválida");
        }
   
        LocalDate dataNascimento = LocalDate.parse(txtNascimento.getText(), formatter);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        double temperatura = Double.parseDouble(txtTemperatura.getText());
        boolean gravida;
        if(cbxGravida.getSelectedIndex() == 0){
            gravida = false;
        }
        else{
            gravida = true;
        }
        boolean idoso;
        if(anos>=60){
            idoso = true;
        }
        else{
            idoso = false;
        }
        int dor = cbxDor.getSelectedIndex();
        
        if(dor == 1){
            leves += 1;
        }
        else if(dor == 2){
            medios += 1;
        }
        else if(dor == 3){
            graves += 1;
        }
        if(37.0 <= temperatura & temperatura <= 38.0){
            leves += 1;
        }
        else if(38.0 < temperatura & temperatura <= 39.0){
            medios += 1;
        }
        else if(39.0 <= temperatura){
            graves += 1;
        }
        
        if(checGravissimo1.isSelected()){
            gravissimos += 1;
        }
        if(checGravissimo2.isSelected()){
            gravissimos += 1;
        }
        if(checGravissimo3.isSelected()){
            gravissimos += 1;
        }
        if(checGravissimo4.isSelected()){
            gravissimos += 1;
        }
        if(checGravissimo5.isSelected()){
            gravissimos += 1;
        }
        if(checkGrave1.isSelected()){
            graves += 1;
        }
        if(checkGrave2.isSelected()){
            graves += 1;
        }
        if(checkGrave3.isSelected()){
            graves += 1;
        }
        if(checkMedio.isSelected()){
            medios += 1;
        }
        if(checkMedio2.isSelected()){
            medios += 1;
        }
        if(checkLeve1.isSelected()){
            leves += 1;
        }
        if(gravissimos >0 ){
            prioridade = "Vermelho";
        }
        else if(graves > 0 ){
            prioridade = "Laranja";
        }
        else if(medios > 0 ){
            prioridade = "Amarelo";
        }
        else if(leves > 0 ){
            prioridade = "Verde";
        }
                
        int posicao = 0;
        Paciente pac = new Paciente(nome,anos,meses ,temperatura,gravida,idoso,dor,gravissimos,graves,medios,leves,prioridade,posicao);
        System.out.println("Nome: " + pac.getNome());  
        System.out.println("Anos: " + pac.getAnos()); 
        System.out.println("Meses: " + pac.getMeses()); 
        System.out.println("Temperatura: " + pac.getTemperatura()); 
        System.out.println("Gravida: " + pac.isGravida()); 
        System.out.println("Idoso: " + pac.isIdoso()); 
        System.out.println("Nivel dor: " + pac.getDor()); 
        System.out.println("Qtd. Gravissimos: " + pac.getGravissimos()); 
        System.out.println("Qtd. Graves: " + pac.getGraves()); 
        System.out.println("Qtd. Medios: " + pac.getMedios()); 
        System.out.println("Qtd. Leves: " + pac.getLeves()); 
        System.out.println("Prioridade: " + pac.getPrioridade());
        TelaPrincipal TP = new TelaPrincipal();  
        TP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTriagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxDor;
    private javax.swing.JComboBox<String> cbxGravida;
    private javax.swing.JCheckBox checGravissimo1;
    private javax.swing.JCheckBox checGravissimo2;
    private javax.swing.JCheckBox checGravissimo3;
    private javax.swing.JCheckBox checGravissimo4;
    private javax.swing.JCheckBox checGravissimo5;
    private javax.swing.JCheckBox checkGrave1;
    private javax.swing.JCheckBox checkGrave2;
    private javax.swing.JCheckBox checkGrave3;
    private javax.swing.JCheckBox checkLeve1;
    private javax.swing.JCheckBox checkMedio;
    private javax.swing.JCheckBox checkMedio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider sldTemp;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
