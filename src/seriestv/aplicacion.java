

package seriestv;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class aplicacion extends javax.swing.JFrame {

    int filasel;
    private ArrayList<datos> Lis;
    public aplicacion() {
        Lis = new ArrayList<datos>();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttempo = new javax.swing.JTextField();
        boxgenero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtactor = new javax.swing.JTextField();
        btncrear = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        seriestb = new javax.swing.JTable();
        txtsinopsis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        eti = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 1, 48)); // NOI18N
        jLabel2.setText("  SERIES TV");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seriestv/725361.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("CODIGO");

        txtcodigo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("TITULO");

        txttitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txttitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttituloActionPerformed(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("FECHA DE LANZAMIENTO");

        txtfecha.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("TEMPORADA");

        txttempo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        boxgenero.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        boxgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Acción", "Ciencia ficción", "Comedia", "Drama", "Misterio ", "Romantica", "Terror" }));
        boxgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxgeneroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("ACTORES");

        txtactor.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactorActionPerformed(evt);
            }
        });

        btncrear.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btncrear.setText("CREAR");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        btnmodificar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        seriestb.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        seriestb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "TITULO", "FECHA DE LANZAMIENTO", "TEMPORADA", "GENERO", "ACTORES", "SINOPSIS"
            }
        ));
        jScrollPane3.setViewportView(seriestb);

        txtsinopsis.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtsinopsis.setText("SINOPSIS");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("GENERO");

        eti.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("GUARDAR X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txttitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel1)
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtactor)
                                        .addComponent(boxgenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtfecha)
                                        .addComponent(txttempo)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel8))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtsinopsis)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(eti, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(11, 11, 11)))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(eti))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncrear)
                            .addComponent(btnmodificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttituloActionPerformed

    private void txtactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtactorActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        
         String x,y,z,a,b,d;
         int c, edad;
        datos aux;
        try{
            c= seriestb.getSelectedRow();
            aux= Lis.get(c);
            edad = Integer.parseInt(JOptionPane.showInputDialog("Nuevo codigo"));
            aux.setCodigo(edad);
            
            c = seriestb.getSelectedRow();
            aux= Lis.get(c);
            y= JOptionPane.showInputDialog("Digite Nuevo titulo");
            aux.setTitulo(y);
            
            c = seriestb.getSelectedRow();
            aux = Lis.get(c);
            x = JOptionPane.showInputDialog("Digite Nueva Fecha de Lanzamiento ");
            aux.setFecha(x);
            
            c = seriestb.getSelectedRow();
            aux = Lis.get(c);
            z = JOptionPane.showInputDialog("Digite Nueva temporada");
            aux.setTempo(z);
            
            c = seriestb.getSelectedRow();
            aux = Lis.get(c);
            d = JOptionPane.showInputDialog("Digite Nuevo Genero");
            aux.setGenero(d);
            
            c = seriestb.getSelectedRow();
            aux = Lis.get(c);
            a = JOptionPane.showInputDialog("Digite Nuevos Actores");
            aux.setActor(a);
            
            c = seriestb.getSelectedRow();
            aux = Lis.get(c);
            b = JOptionPane.showInputDialog("Digite Nueva Sinopsis");
            aux.setSinopsis(b);
            
            
            
            
            
         
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Escoger una SERIE para modificar");
        }
        verdatos();
        
    }//GEN-LAST:event_btnmodificarActionPerformed
    private void limpiar(){
     txttitulo.setText("");
     txtcodigo.setText("");
     txtfecha.setText("");
     txttempo.setText("");
     txtactor.setText("");
     txtsinopsis.setText("");
     eti.setText("");
     
    }
    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
         
         String titulo, fecha, tempo, acto, sinop, gene;
         int cod;
         try {
          titulo = txttitulo.getText();
          fecha = txtfecha.getText();
          tempo = txttempo.getText();
          acto= txtactor.getText();
          sinop= txtsinopsis.getText();
          gene = eti.getText();
        
          cod= Integer.parseInt(txtcodigo.getText());
          Lis.add(new datos(cod, titulo, fecha, tempo,gene,acto, sinop));
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Verifica los datos");
         
         }
         limpiar();
         verdatos();
         
    }//GEN-LAST:event_btncrearActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int c;
        try{
         c =  seriestb.getSelectedRow();
         Lis.remove(c);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Favor escoja una SERIE para eliminar");
        }
        verdatos();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void boxgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxgeneroActionPerformed
        // TODO add your handling code here:
       String mensaje = "";
       mensaje = boxgenero.getSelectedItem().toString();
       eti.setText(mensaje);
       
       
       
    }//GEN-LAST:event_boxgeneroActionPerformed
    
    private void guardar(){
     File file = new File("Archivo Series.txt");
     PrintWriter escribe; 
     if(!file.exists()){
         try{
            file.createNewFile();
         } catch (Exception e) {
         }
         
     }
         try {
          datos aux;
          escribe = new PrintWriter(file, "utf-8");
          for(int i = 0; i < Lis.size(); i++){
           aux = Lis.get(i);
           aux.guardar(escribe);
          }
          escribe.close();
         } catch (Exception e){
         }
    
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        String botones[] = {"Si", "No"};
        int n= JOptionPane.showOptionDialog(null, "Desea guardar la información?", "SERIES DE TV", 0, 0, null, botones, null);
        if(n == 0)
            guardar();
        
    }//GEN-LAST:event_formWindowClosing

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        
        filasel = seriestb.getSelectedRow();
        txtcodigo.setText(seriestb.getValueAt(filasel, 0).toString());
        txttitulo.setText(seriestb.getValueAt(filasel, 1).toString());
        txtfecha.setText(seriestb.getValueAt(filasel, 2).toString());  
        txttempo.setText(seriestb.getValueAt(filasel, 3).toString());
        txtactor.setText(seriestb.getValueAt(filasel, 4).toString());
       
        txtsinopsis.setText(seriestb.getValueAt(filasel, 6).toString());
        System.out.println("Fila seleccionada");
    }//GEN-LAST:event_buscarActionPerformed
    private void verdatos(){
     String mat[][] = new String[Lis.size()][7];
     datos aux;
     
     for (int i= 0; i< Lis.size(); i++){
         aux = Lis.get(i);
         
         mat[i][0] = Integer.toString(aux.getCodigo());
         mat[i][1] = aux.getTitulo();
         mat[i][2] = aux.getFecha();
         mat[i][3] = aux.getTempo();
         mat[i][4] = aux.getGenero();
         mat[i][5] = aux.getActor();
         mat[i][6] = aux.getSinopsis(); 
         
    }
      seriestb.setModel(new javax.swing.table.DefaultTableModel(
            mat,
            new String [] {
              "codigo", "Titulo", "Fecha", "Tempo","Genero", "Actor", "Sinopsis"
            }
        ));
    } 
    
       
    
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
            java.util.logging.Logger.getLogger(aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxgenero;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel eti;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable seriestb;
    private javax.swing.JTextField txtactor;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtsinopsis;
    private javax.swing.JTextField txttempo;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables

}
