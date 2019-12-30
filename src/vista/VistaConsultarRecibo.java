/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author malico
 */
public class VistaConsultarRecibo extends javax.swing.JDialog {

    /**
     * Creates new form VistaSuma
     */
    public VistaConsultarRecibo() {
        initComponents();
    }
    
    public String getIdRecibo() {
        return etIdRecibo.getText();
    }

    public void setNumeroRecibo(String etNumeroRecibo) {
        this.etNumeroRecibo.setText(etNumeroRecibo);
    }

    public void setDniCliente(String etDniCliente) {
        this.etDniCliente.setText(etDniCliente);
    }

    public void setIdCliente(String etIdCliente) {
        this.etIdCliente.setText(etIdCliente);
    }

    public void setNomCliente(String etNomCliente) {
        this.etNomCliente.setText(etNomCliente);
    }

    public void setMedioDePago(String etMedioDePago) {
        this.etMedioDePago.setText(etMedioDePago);
    }

    public void setInformacionAdicional(String etInformacionAdicional) {
        this.etInformacionAdicional.setText(etInformacionAdicional);
    }

    public void setImporte(Double etImporte) {
        this.etImporte.setText(etImporte.toString());
    }

    public void setFecha(String etFecha) {
        this.etFecha.setText(etFecha);
    }


/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etIdRecibo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        etNumeroRecibo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etIdCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        etDniCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        etNomCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        etFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        etImporte = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        etMedioDePago = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        etInformacionAdicional = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btRetornar = new java.awt.Button();
        btConfirmar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Recibo");
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(300, 200));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(858, 586));
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(5, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Encabezado"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Id.Recibo");
        jPanel1.add(jLabel1);

        etIdRecibo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etIdRecibo.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(etIdRecibo);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Nro.Recibo");
        jPanel1.add(jLabel9);

        etNumeroRecibo.setEditable(false);
        etNumeroRecibo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etNumeroRecibo.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(etNumeroRecibo);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Id.Cliente:");
        jPanel1.add(jLabel2);

        etIdCliente.setEditable(false);
        etIdCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etIdCliente.setFocusable(false);
        etIdCliente.setPreferredSize(new java.awt.Dimension(45, 20));
        jPanel1.add(etIdCliente);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("DNI Cliente:");
        jPanel1.add(jLabel3);

        etDniCliente.setEditable(false);
        etDniCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etDniCliente.setFocusable(false);
        etDniCliente.setPreferredSize(new java.awt.Dimension(65, 20));
        jPanel1.add(etDniCliente);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Cliente:");
        jPanel1.add(jLabel4);

        etNomCliente.setEditable(false);
        etNomCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etNomCliente.setFocusable(false);
        etNomCliente.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel1.add(etNomCliente);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Fecha:");
        jPanel1.add(jLabel5);

        etFecha.setEditable(false);
        etFecha.setBackground(new java.awt.Color(255, 255, 102));
        etFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etFecha.setFocusable(false);
        etFecha.setPreferredSize(new java.awt.Dimension(75, 20));
        jPanel1.add(etFecha);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del pago"));
        jPanel2.setMinimumSize(new java.awt.Dimension(850, 440));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 440));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Importe:");
        jPanel2.add(jLabel8);

        etImporte.setEditable(false);
        etImporte.setBackground(new java.awt.Color(153, 255, 255));
        etImporte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etImporte.setForeground(new java.awt.Color(255, 0, 0));
        etImporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        etImporte.setFocusable(false);
        etImporte.setPreferredSize(new java.awt.Dimension(100, 25));
        etImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etImporteActionPerformed(evt);
            }
        });
        jPanel2.add(etImporte);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("    Medio de pago: ");
        jPanel2.add(jLabel6);

        etMedioDePago.setEditable(false);
        etMedioDePago.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etMedioDePago.setFocusable(false);
        etMedioDePago.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel2.add(etMedioDePago);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Información adicional:");
        jLabel7.setPreferredSize(new java.awt.Dimension(120, 13));
        jPanel2.add(jLabel7);

        etInformacionAdicional.setEditable(false);
        etInformacionAdicional.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etInformacionAdicional.setFocusable(false);
        etInformacionAdicional.setPreferredSize(new java.awt.Dimension(380, 20));
        jPanel2.add(etInformacionAdicional);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        btRetornar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btRetornar.setLabel("Retornar");
        jPanel3.add(btRetornar);

        btConfirmar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btConfirmar.setLabel("Confirmar");
        jPanel3.add(btConfirmar);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etImporteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Button btConfirmar;
    public java.awt.Button btRetornar;
    private javax.swing.JTextField etDniCliente;
    private javax.swing.JTextField etFecha;
    public javax.swing.JTextField etIdCliente;
    private javax.swing.JTextField etIdRecibo;
    private javax.swing.JTextField etImporte;
    private javax.swing.JTextField etInformacionAdicional;
    private javax.swing.JTextField etMedioDePago;
    private javax.swing.JTextField etNomCliente;
    private javax.swing.JTextField etNumeroRecibo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
