package simulador;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Ventana extends javax.swing.JFrame {

    Graphics lapiz;
    Graphics2D lapiz2D;
    
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setTitle("Simulador de proyectiles");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Box = new javax.swing.JComboBox<>();
        pizarron = new javax.swing.JPanel();
        T = new javax.swing.JSlider();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        AltInicial = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VI = new javax.swing.JTextField();
        Teta = new javax.swing.JTextField();
        HI = new javax.swing.JTextField();
        Borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Posición", "Velocidad" }));

        javax.swing.GroupLayout pizarronLayout = new javax.swing.GroupLayout(pizarron);
        pizarron.setLayout(pizarronLayout);
        pizarronLayout.setHorizontalGroup(
            pizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        pizarronLayout.setVerticalGroup(
            pizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        T.setBackground(java.awt.Color.lightGray);
        T.setMajorTickSpacing(20);
        T.setPaintLabels(true);
        T.setPaintTicks(true);
        T.setValue(0);

        jRadioButton1.setBackground(java.awt.Color.lightGray);
        jRadioButton1.setText("Grados");

        jRadioButton2.setBackground(java.awt.Color.lightGray);
        jRadioButton2.setText("Radianes");

        AltInicial.setBackground(java.awt.Color.lightGray);
        AltInicial.setText("Altura inicial");

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Velocidad inicial:");

        jLabel2.setText("Tiempo:");

        jLabel3.setText("Angulo:");

        VI.setText("m/s");

        HI.setText("m");
        HI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HIActionPerformed(evt);
            }
        });

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(90, 90, 90))
                        .addComponent(Teta)
                        .addComponent(VI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(AltInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(HI, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(19, 19, 19)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(Box, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(pizarron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pizarron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Teta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AltInicial)
                            .addComponent(HI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Borrar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lapiz = pizarron.getGraphics();
        lapiz2D = (Graphics2D) lapiz;
        lapiz2D.setColor ( Color.magenta ); 
        
        int ancho = pizarron.getWidth ( );
        int alto = pizarron.getHeight ( );
        int x0 = ancho/2 ;
        int y0 = alto/2 ;
        //dibujar plano
        lapiz2D.drawLine (0 , y0 , ancho , y0 ) ;
        lapiz2D.drawLine (x0 , 0 , x0 , alto ) ;
        
        //Estilo para la linea
        lapiz2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);       
        //Velocidad inicial
        int V= Integer.parseInt(VI.getText());
        //grado de lanzamiento
        double O= Double.parseDouble(Teta.getText());
        //altura inicial
        int Y= Integer.parseInt(HI.getText());
        //Tiempo
        int t=(T.getValue())/10;
        //gravedad
        final double  g = 9.807;
        
        //Validar posicion o velocidad
        if (Box.getSelectedIndex()==1) {
            //dibujar parabola
            for (double i = 0; i <= ancho; i+=0.01) { 
                lapiz.setColor(Color.red); 
                lapiz2D.setStroke(new BasicStroke(2F));
                lapiz2D.drawLine((int) ((V * Math.cos(Math.toRadians(O)) * i)+x0), (int) (y0-( Y +( V * Math.sin(Math.toRadians(O)) * i )-(( g *Math.pow(i, 2))/2))), (int) ((V * Math.cos(Math.toRadians(O)) * i)+x0), (int) (y0-( Y +( V * Math.sin(Math.toRadians(O)) * i )-(( g *Math.pow(i, 2))/2))));
        }
        //Ancho del punto e impresión
        lapiz.setColor(Color.blue);
        lapiz2D.setStroke(new BasicStroke(4F));
        lapiz2D.drawLine((int) ((V * Math.cos(Math.toRadians(O)) * t)+x0), (int) (y0-( Y +( V * Math.sin(Math.toRadians(O)) * t )-(( g *Math.pow(t, 2))/2))), (int) ((V * Math.cos(Math.toRadians(O)) * t)+x0), (int) (y0-( Y +( V * Math.sin(Math.toRadians(O)) * t )-(( g *Math.pow(t, 2))/2))));
        
        } else {
            if (Box.getSelectedIndex()==2) {
                lapiz.setColor(Color.yellow); 
                lapiz2D.setStroke(new BasicStroke(2F));
                lapiz2D.drawLine((int) ((V * Math.cos(Math.toRadians(O)) * t)+x0), (int) (y0-( Y +( V * Math.sin(Math.toRadians(O)) * t )-(( g *Math.pow(t, 2))/2))), (int) (x0+(V * Math.cos(Math.toRadians(O)))),  (int) (y0-(( V * Math.sin(Math.toRadians(O)))-( g*t))));
            } else {
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HIActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        lapiz = pizarron.getGraphics();
        lapiz2D = (Graphics2D) lapiz;
        int anchura = pizarron.getWidth();
        int altura = pizarron.getHeight();
        lapiz.setColor(Color.white);
        lapiz.fillRect(0, 0, anchura, altura);
        int x0 = anchura / 2;
        int y0 = altura / 2;
        lapiz2D.setColor(Color.magenta);
        lapiz2D.drawLine(0, y0, anchura, y0);
        lapiz2D.drawLine(x0, 0, x0, altura);
    }//GEN-LAST:event_BorrarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AltInicial;
    private javax.swing.JButton Borrar;
    private javax.swing.JComboBox<String> Box;
    private javax.swing.JTextField HI;
    private javax.swing.JSlider T;
    private javax.swing.JTextField Teta;
    private javax.swing.JTextField VI;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel pizarron;
    // End of variables declaration//GEN-END:variables
}
