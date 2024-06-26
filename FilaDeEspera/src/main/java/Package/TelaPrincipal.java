package Package;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    
    int posicao = 20;
    int posicao2 = 0;
    int qtdpacientes = 0;
    String senha = "";
    String senha2 = "";
    String senha3 = "";
    String senha4 = "";
    
    Queue<Paciente> FilaOrdenada = new PriorityQueue<>(new Sistema());

    public TelaPrincipal() {
        super("Hospital");
        initComponents();
        setLocationRelativeTo(null);
        btnTriagem.setBackground(new Color(0,0,0,0));
        btnChamar.setBackground(new Color(0,0,0,0));
        TelaTriag.setVisible(false);
        txtNascimento.setBackground(new Color(0,0,0,0));
        txtNome.setBackground(new Color(0,0,0,0));
        cbxGravida.setBackground(new Color(0,0,0,0));
        cbxDor.setBackground(new Color(0,0,0,0));
        txtTemperatura.setBackground(new Color(0,0,0,0));
        btnRegistrar.setBackground(new Color(0,0,0,0));
        btnVoltar.setBackground(new Color(0,0,0,0));
        btnDoc.setBackground(new Color(0,0,0,0));
        txtSenha1.setText("");
        txtSenha2.setText("");
        txtSenha3.setText("");
        txtSenha4.setText("");
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaPrinci = new javax.swing.JPanel();
        btnDoc = new javax.swing.JButton();
        btnTriagem = new javax.swing.JButton();
        btnChamar = new javax.swing.JButton();
        PainelComScroll = new javax.swing.JScrollPane();
        PainelSemScroll = new javax.swing.JPanel();
        txtSenha2 = new javax.swing.JLabel();
        txtSenha3 = new javax.swing.JLabel();
        txtSenha4 = new javax.swing.JLabel();
        txtSenha1 = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();
        TelaTriag = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TelaPrinci.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnDoc.png"))); // NOI18N
        btnDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDocMouseExited(evt);
            }
        });
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });
        TelaPrinci.add(btnDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 120, 40));

        btnTriagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnTriagem.png"))); // NOI18N
        btnTriagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTriagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTriagemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTriagemMouseExited(evt);
            }
        });
        btnTriagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriagemActionPerformed(evt);
            }
        });
        TelaPrinci.add(btnTriagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 120, 40));

        btnChamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnChamar.png"))); // NOI18N
        btnChamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChamarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChamarMouseExited(evt);
            }
        });
        btnChamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChamarActionPerformed(evt);
            }
        });
        TelaPrinci.add(btnChamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 120, 40));

        PainelComScroll.setBorder(null);

        PainelSemScroll.setBackground(new java.awt.Color(247, 252, 255));
        PainelSemScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PainelComScroll.setViewportView(PainelSemScroll);

        TelaPrinci.add(PainelComScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 410, 430));

        txtSenha2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSenha2.setText("0");
        TelaPrinci.add(txtSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        txtSenha3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSenha3.setText("0");
        TelaPrinci.add(txtSenha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        txtSenha4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSenha4.setText("0");
        TelaPrinci.add(txtSenha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        txtSenha1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtSenha1.setText("0");
        TelaPrinci.add(txtSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imgFundo.png"))); // NOI18N
        TelaPrinci.add(imgFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(TelaPrinci, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 760));

        TelaTriag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnVoltar.png"))); // NOI18N
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarMouseExited(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        TelaTriag.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 280, 80));

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
        TelaTriag.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, 280, 80));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.setBorder(null);
        TelaTriag.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 205, 410, 45));

        sldTemp.setMaximum(500);
        sldTemp.setMinimum(300);
        sldTemp.setValue(365);
        sldTemp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldTempStateChanged(evt);
            }
        });
        TelaTriag.add(sldTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 140, -1));

        cbxGravida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxGravida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        cbxGravida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TelaTriag.add(cbxGravida, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 295, 140, 45));

        txtTemperatura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTemperatura.setText("36.5");
        txtTemperatura.setBorder(null);
        txtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaActionPerformed(evt);
            }
        });
        TelaTriag.add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 295, 130, 45));

        cbxDor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxDor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Dores", "Dores Leves", "Dores Moderadas", "Dores Severas" }));
        cbxDor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TelaTriag.add(cbxDor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 295, 200, 45));

        txtNascimento.setBorder(null);
        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascimentoActionPerformed(evt);
            }
        });
        TelaTriag.add(txtNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 205, 110, 45));

        checkLeve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLeve1ActionPerformed(evt);
            }
        });
        TelaTriag.add(checkLeve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 668, -1, -1));
        TelaTriag.add(checkMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 677, -1, -1));
        TelaTriag.add(checkMedio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 709, -1, -1));
        TelaTriag.add(checkGrave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 527, -1, -1));
        TelaTriag.add(checkGrave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 495, -1, -1));
        TelaTriag.add(checkGrave3, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 462, -1, -1));

        checGravissimo1.setBorder(null);
        checGravissimo1.setContentAreaFilled(false);
        TelaTriag.add(checGravissimo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 462, -1, -1));

        checGravissimo2.setBorder(null);
        checGravissimo2.setContentAreaFilled(false);
        TelaTriag.add(checGravissimo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 493, -1, -1));

        checGravissimo3.setBorder(null);
        checGravissimo3.setContentAreaFilled(false);
        TelaTriag.add(checGravissimo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 524, -1, -1));

        checGravissimo4.setBorder(null);
        checGravissimo4.setContentAreaFilled(false);
        TelaTriag.add(checGravissimo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 557, -1, -1));

        checGravissimo5.setBorder(null);
        checGravissimo5.setContentAreaFilled(false);
        TelaTriag.add(checGravissimo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 588, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaTriagem.png"))); // NOI18N
        TelaTriag.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(TelaTriag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTriagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriagemActionPerformed
       TelaTriag.setVisible(true);
       TelaPrinci.setVisible(false);
    }//GEN-LAST:event_btnTriagemActionPerformed

    private void btnChamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChamarActionPerformed
        Queue<Paciente> FilaOrdenadaAux = new PriorityQueue<>(FilaOrdenada);
        if (FilaOrdenada.isEmpty()){
            JOptionPane.showMessageDialog(null, "A fila está vazia!","Atenção",JOptionPane.WARNING_MESSAGE);
        }
        else{
            PainelSemScroll.removeAll();
            PainelSemScroll.revalidate();
            PainelSemScroll.repaint();
            posicao = 20;
            posicao2 = 0;
            Paciente ParaSenha = (Paciente) FilaOrdenadaAux.peek();
            senha = ParaSenha.getSenha();
            txtSenha1.setText(senha);
            txtSenha2.setText(senha2);
            txtSenha3.setText(senha3);
            txtSenha4.setText(senha4);
            senha4 = senha3;
            senha3 = senha2;
            senha2 = senha;
            
            FilaOrdenada.poll();
            FilaOrdenadaAux.poll();
            
            for(int i = 0; i < FilaOrdenada.size();i++){


                JLabel Labels = new javax.swing.JLabel();
                JLabel Nome = new javax.swing.JLabel();
                JLabel Idade = new javax.swing.JLabel();
                JLabel Sintomas = new javax.swing.JLabel();
                JLabel NumFila = new javax.swing.JLabel();
                JLabel Prioridade = new javax.swing.JLabel();
                JLabel Senha = new javax.swing.JLabel();

                Senha.setText(FilaOrdenadaAux.peek().getSenha());
                PainelSemScroll.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(286,posicao2 +46, -1, -1));

                Nome.setText(FilaOrdenadaAux.peek().getNome());
                PainelSemScroll.add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50,posicao2 +28, -1, -1));

                Idade.setText(String.valueOf(FilaOrdenadaAux.peek().getAnos()) + " anos e " + FilaOrdenadaAux.peek().getMeses() + " meses.");
                PainelSemScroll.add(Idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, posicao2 +45, -1, -1));

                Sintomas.setText(FilaOrdenadaAux.peek().getSintoma());
                PainelSemScroll.add(Sintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, posicao2 +61, -1, -1));

                NumFila.setText((i+1) + "°");
                PainelSemScroll.add(NumFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, posicao2 + 29, -1, -1));

                Prioridade.setText(FilaOrdenadaAux.peek().getPrioridade());
                PainelSemScroll.add(Prioridade, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, posicao2 +61, -1, -1));

                Labels.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Posicao" + FilaOrdenadaAux.poll().getPrioridade()+ ".png"))); // NOI18N
                PainelSemScroll.add(Labels, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, posicao, 386, 69));

                revalidate();
                posicao += 80;
                posicao2 += 80;
            }

            try {

                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(TelaPrincipal.class.getResourceAsStream("/Audios/chamada"));

                AudioFormat format = audioInputStream.getFormat();

                DataLine.Info info = new DataLine.Info(Clip.class, format);
                Clip clip = (Clip) AudioSystem.getLine(info);

                clip.open(audioInputStream);

                clip.start();

                while (!clip.isRunning()){
                    Thread.sleep(10);
                }
                while (clip.isRunning()){
                    Thread.sleep(10);
                }

                clip.close();
                audioInputStream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            revalidate();
        }
    }//GEN-LAST:event_btnChamarActionPerformed

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnRegistrar2.png")));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnRegistrar.png")));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        qtdpacientes ++;
        double posicaoFila = 0.00;
        String nome = txtNome.getText();
        String prioridade = "Azul";
        String sintomaLeve = "";
        String sintomaMedio = "";
        String sintomaGrave = "";
        String sintomaGravissimo = "";
        String sintoma = "Sem sofrimento agudo";
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

        if(cbxGravida.getSelectedIndex() != 0){
            sintomaMedio = "Grávida.";
            posicaoFila += 10;
        }
        if(anos>=60){

            sintomaMedio = "Idoso.";
            posicaoFila += 10;
        }
        int dor = cbxDor.getSelectedIndex();

        if(dor == 1){
            sintomaLeve = "Dor leve.";
            posicaoFila += 1;
        }
        else if(dor == 2){
            sintomaMedio = "Dor moderada.";
            posicaoFila += 10;
        }
        else if(dor == 3){
            sintomaGrave = "Dor Severa.";
            posicaoFila += 100;
        }
        if(37.0 <= temperatura & temperatura <= 38.0){
            sintomaLeve = "Temperatura igual a " + temperatura + ".";
            posicaoFila += 1;
        }
        else if(38.0 < temperatura & temperatura <= 39.0){
            sintomaMedio = "Temperatura igual a " + temperatura + ".";
            posicaoFila += 10;
        }
        else if(39.0 <= temperatura){
            sintomaGrave = "Temperatura igual a " + temperatura + ".";
            posicaoFila += 100;
        }

        if(checGravissimo1.isSelected()){
            sintomaGravissimo = "Comp. das vias aéreas.";
            posicaoFila += 1000;
        }
        if(checGravissimo2.isSelected()){
            sintomaGravissimo = "Respiração ineficaz.";
            posicaoFila += 1000;
        }
        if(checGravissimo3.isSelected()){
            sintomaGravissimo = "Choque.";
            posicaoFila += 1000;
        }
        if(checGravissimo4.isSelected()){
            sintomaGravissimo = "Não responde a estímulos.";
            posicaoFila += 1000;
        }
        if(checGravissimo5.isSelected()){
            sintomaGravissimo = "Em convulsão.";
            posicaoFila += 1000;
        }
        if(checkGrave1.isSelected()){
            sintomaGrave = "Trauma craniano severo.";
            posicaoFila += 100;
            
        }
        if(checkGrave2.isSelected()){
            sintomaGrave = "Distorção da consciência.";
            posicaoFila += 100;
        }
        if(checkGrave3.isSelected()){
            posicaoFila += 100;
            
            sintomaGrave = "Grande hemorragia.";
        }
        if(checkMedio.isSelected()){
            sintomaMedio = "Pequena hemorragia.";
            posicaoFila += 10;
        }
        if(checkMedio2.isSelected()){
            sintomaMedio = "Vômito persistente.";
            posicaoFila += 10;
        }
        if(checkLeve1.isSelected()){
            sintomaLeve= "Náuseas.";
            posicaoFila += 1;
        }

        if(posicaoFila >=1000 ){
            prioridade = "Vermelha";
            sintoma = sintomaGravissimo;

        }
        else if(posicaoFila >= 100 ){
            prioridade = "Laranja";
            sintoma = sintomaGrave;

        }
        else if(posicaoFila >= 10 ){
            prioridade = "Amarela";
            sintoma = sintomaMedio;

        }
        else if(posicaoFila >= 1 ){
            prioridade = "Verde";
            sintoma = sintomaLeve;

        }
        String senha = String.valueOf(qtdpacientes);
        Paciente pac = new Paciente(nome,anos,meses,sintoma,prioridade,senha,posicaoFila);
        FilaOrdenada.add(pac);

        Queue<Paciente> FilaOrdenadaAux = new PriorityQueue<>(FilaOrdenada);
        
        PainelSemScroll.removeAll();
        PainelSemScroll.revalidate();
        posicao = 20;
        posicao2 = 0;
         for(int i = 0; i < FilaOrdenada.size();i++){


            JLabel Labels = new javax.swing.JLabel();
            JLabel Nome = new javax.swing.JLabel();
            JLabel Idade = new javax.swing.JLabel();
            JLabel Sintomas = new javax.swing.JLabel();
            JLabel NumFila = new javax.swing.JLabel();
            JLabel Prioridade = new javax.swing.JLabel();
            JLabel Senha = new javax.swing.JLabel();
            
            Senha.setText(FilaOrdenadaAux.peek().getSenha());
            PainelSemScroll.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(286,posicao2 +46, -1, -1));
            
            Nome.setText(FilaOrdenadaAux.peek().getNome());
            PainelSemScroll.add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50,posicao2 +28, -1, -1));

            Idade.setText(String.valueOf(FilaOrdenadaAux.peek().getAnos()) + " anos e " + FilaOrdenadaAux.peek().getMeses() + " meses.");
            PainelSemScroll.add(Idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, posicao2 +45, -1, -1));

            Sintomas.setText(FilaOrdenadaAux.peek().getSintoma());
            PainelSemScroll.add(Sintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, posicao2 +61, -1, -1));

            NumFila.setText((i+1) + "°");
            PainelSemScroll.add(NumFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, posicao2 + 29, -1, -1));

            Prioridade.setText(FilaOrdenadaAux.peek().getPrioridade());
            PainelSemScroll.add(Prioridade, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, posicao2 +61, -1, -1));

            Labels.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Posicao" + FilaOrdenadaAux.poll().getPrioridade()+ ".png"))); // NOI18N
            PainelSemScroll.add(Labels, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, posicao, 386, 69));

            revalidate();
            posicao += 80;
            posicao2 += 80;
         }
        txtNome.setText("");
        txtNascimento.setText("");
        txtTemperatura.setText("36.5");
        sldTemp.setValue(365);
        cbxGravida.setSelectedIndex(0);
        cbxDor.setSelectedIndex(0);
        TelaPrinci.setVisible(true);
        TelaTriag.setVisible(false);
        checGravissimo1.setSelected(false);
        checGravissimo2.setSelected(false);
        checGravissimo3.setSelected(false);
        checGravissimo4.setSelected(false);
        checGravissimo5.setSelected(false);
        checkGrave1.setSelected(false);
        checkGrave2.setSelected(false);
        checkGrave3.setSelected(false);
        checkMedio.setSelected(false);
        checkMedio2.setSelected(false);
        checkLeve1.setSelected(false);
        

    }//GEN-LAST:event_btnRegistrarActionPerformed

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

    private void txtNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascimentoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrinci.setVisible(true);
        TelaTriag.setVisible(false);
        txtNome.setText("");
        txtNascimento.setText("");
        txtTemperatura.setText("36.5");
        sldTemp.setValue(365);
        cbxGravida.setSelectedIndex(0);
        cbxDor.setSelectedIndex(0);
        TelaPrinci.setVisible(true);
        TelaTriag.setVisible(false);
        checGravissimo1.setSelected(false);
        checGravissimo2.setSelected(false);
        checGravissimo3.setSelected(false);
        checGravissimo4.setSelected(false);
        checGravissimo5.setSelected(false);
        checkGrave1.setSelected(false);
        checkGrave2.setSelected(false);
        checkGrave3.setSelected(false);
        checkMedio.setSelected(false);
        checkMedio2.setSelected(false);
        checkLeve1.setSelected(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseEntered
         btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnVoltar2.png")));
    }//GEN-LAST:event_btnVoltarMouseEntered

    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseExited
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnVoltar.png")));
    }//GEN-LAST:event_btnVoltarMouseExited

    private void btnChamarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChamarMouseEntered
        btnChamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnChamar2.png")));
    }//GEN-LAST:event_btnChamarMouseEntered

    private void btnChamarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChamarMouseExited
        btnChamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnChamar.png")));
    }//GEN-LAST:event_btnChamarMouseExited

    private void btnTriagemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTriagemMouseEntered
        btnTriagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnTriagem2.png")));
    }//GEN-LAST:event_btnTriagemMouseEntered

    private void btnTriagemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTriagemMouseExited
         btnTriagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnTriagem.png")));
    }//GEN-LAST:event_btnTriagemMouseExited

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        try {
                    Desktop.getDesktop().browse(new URI("https://github.com/Andrey-de-Freitas-Souza/Projeto-EDAA/blob/main/FilaPrioridade.pdf"));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnDocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocMouseEntered
        btnDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnDoc2.png")));
    }//GEN-LAST:event_btnDocMouseEntered

    private void btnDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocMouseExited
        btnDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnDoc.png")));
    }//GEN-LAST:event_btnDocMouseExited

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PainelComScroll;
    private javax.swing.JPanel PainelSemScroll;
    private javax.swing.JPanel TelaPrinci;
    private javax.swing.JPanel TelaTriag;
    private javax.swing.JButton btnChamar;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnTriagem;
    private javax.swing.JButton btnVoltar;
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
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider sldTemp;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JLabel txtSenha1;
    private javax.swing.JLabel txtSenha2;
    private javax.swing.JLabel txtSenha3;
    private javax.swing.JLabel txtSenha4;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
