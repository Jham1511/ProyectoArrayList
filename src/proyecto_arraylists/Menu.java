/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_arraylists;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author SKX Kafei
 */
public class Menu extends javax.swing.JFrame {

   
   
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnListar = new javax.swing.JButton();
        BtnInfo = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnRegresarMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnCensurar = new javax.swing.JButton();
        BtnInterseccion = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnOpcion1 = new javax.swing.JButton();
        BtnOpcion2 = new javax.swing.JButton();
        BtnOpcion3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_arraylists/fifa-1324440157910345831.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BtnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        BtnAgregar.setText("Agregar Jugador");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BtnEliminar.setText("Eliminar Jugador");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnListar.setBackground(new java.awt.Color(255, 255, 255));
        BtnListar.setForeground(new java.awt.Color(0, 0, 0));
        BtnListar.setText("Listar Jugadores");
        BtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarActionPerformed(evt);
            }
        });

        BtnInfo.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfo.setForeground(new java.awt.Color(0, 0, 0));
        BtnInfo.setText("Informacion Jugador");
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });

        BtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        BtnModificar.setForeground(new java.awt.Color(0, 0, 0));
        BtnModificar.setText("Modificar Jugador");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnRegresarMenu.setText("Salida");
        BtnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 135, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(181, 181, 181))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnRegresarMenu)
                .addGap(216, 216, 216))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnModificar)
                .addGap(18, 18, 18)
                .addComponent(BtnRegresarMenu)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proyecto Grupal ArrayLists");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnCensurar.setBackground(new java.awt.Color(153, 153, 153));
        BtnCensurar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCensurar.setText("Censurar ");
        BtnCensurar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCensurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCensurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCensurarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCensurarMouseExited(evt);
            }
        });
        BtnCensurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCensurarActionPerformed(evt);
            }
        });

        BtnInterseccion.setBackground(new java.awt.Color(153, 153, 153));
        BtnInterseccion.setForeground(new java.awt.Color(255, 255, 255));
        BtnInterseccion.setText("Interseccion");
        BtnInterseccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnInterseccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInterseccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnInterseccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnInterseccionMouseExited(evt);
            }
        });
        BtnInterseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInterseccionActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtnSalir.setForeground(new java.awt.Color(255, 51, 51));
        BtnSalir.setText("Salir");
        BtnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_arraylists/programacion.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_arraylists/programacion.png"))); // NOI18N

        BtnOpcion1.setBackground(new java.awt.Color(153, 153, 153));
        BtnOpcion1.setForeground(new java.awt.Color(255, 255, 255));
        BtnOpcion1.setText("FIFA");
        BtnOpcion1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnOpcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnOpcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnOpcion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnOpcion1MouseExited(evt);
            }
        });
        BtnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpcion1ActionPerformed(evt);
            }
        });

        BtnOpcion2.setBackground(new java.awt.Color(153, 153, 153));
        BtnOpcion2.setForeground(new java.awt.Color(255, 255, 255));
        BtnOpcion2.setText("Instrumentos Stock");
        BtnOpcion2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnOpcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnOpcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnOpcion2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnOpcion2MouseExited(evt);
            }
        });
        BtnOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpcion2ActionPerformed(evt);
            }
        });

        BtnOpcion3.setBackground(new java.awt.Color(153, 153, 153));
        BtnOpcion3.setForeground(new java.awt.Color(255, 255, 255));
        BtnOpcion3.setText("LogIn");
        BtnOpcion3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnOpcion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnOpcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnOpcion3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnOpcion3MouseExited(evt);
            }
        });
        BtnOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpcion3ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_arraylists/java.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnCensurar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnInterseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnInterseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(BtnCensurar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpcion2ActionPerformed
        Instrumentos wndow = new Instrumentos();
        wndow.setVisible(true);
        System.out.println("Hola");
    }//GEN-LAST:event_BtnOpcion2ActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        BtnSalir.setBackground(Color.red);
        BtnSalir.setForeground(Color.white);
        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnInterseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInterseccionActionPerformed
        String StrConj1 = JOptionPane.showInputDialog(null, "Ingrese el tama??o del primer conjunto: ");
        int s1 = Integer.parseInt(StrConj1);
        String StrConj2 = JOptionPane.showInputDialog(null, "Ingrese el tama??o del segundo conjunto: ");
        int s2 = Integer.parseInt(StrConj2);

        ArrayList<Character> a = fillArray(s1, 25, 97);
        ArrayList<Character> b = fillArray(s2, 25, 97);
        ArrayList<Character> c = interseccion(a, b);

        JOptionPane.showMessageDialog(null, "ArrayList No. 1:\n" + a);
        JOptionPane.showMessageDialog(null, "ArrayList No. 2:\n" + b);
        JOptionPane.showMessageDialog(null, "Interseccion:\n" + c);
    }//GEN-LAST:event_BtnInterseccionActionPerformed

    private void BtnInterseccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInterseccionMouseExited
        BtnInterseccion.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_BtnInterseccionMouseExited

    private void BtnInterseccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInterseccionMouseEntered
        BtnInterseccion.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_BtnInterseccionMouseEntered

    private void BtnCensurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCensurarActionPerformed

        String[] tokenizedMessage;

        ArrayList<String> bannedWords = addBannedWords();

        String mensaje = JOptionPane.showInputDialog(null, "Ingrese el mensaje que desea enviar: ");

        tokenizedMessage = mensaje.split(" ");
        JOptionPane.showMessageDialog(null, printMessage(censoredMessage(bannedWords, tokenizedMessage)));
    }//GEN-LAST:event_BtnCensurarActionPerformed

    private void BtnCensurarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCensurarMouseExited
        BtnCensurar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_BtnCensurarMouseExited

    private void BtnCensurarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCensurarMouseEntered
        BtnCensurar.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_BtnCensurarMouseEntered

    private void BtnOpcion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOpcion1MouseEntered
        BtnOpcion1.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_BtnOpcion1MouseEntered

    private void BtnOpcion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOpcion2MouseEntered
        BtnOpcion2.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_BtnOpcion2MouseEntered

    private void BtnOpcion3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOpcion3MouseEntered
        BtnOpcion3.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_BtnOpcion3MouseEntered

    private void BtnOpcion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOpcion1MouseExited
        BtnOpcion1.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_BtnOpcion1MouseExited

    private void BtnOpcion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOpcion2MouseExited
        BtnOpcion2.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_BtnOpcion2MouseExited

    private void BtnOpcion3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOpcion3MouseExited
        BtnOpcion3.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_BtnOpcion3MouseExited

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        String nom = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador: ", "Jugador ", 1);

        String Ap = JOptionPane.showInputDialog(null, "Ingrese el apellido del Jugador: ", "Apellido ", 1);

        String Nac = JOptionPane.showInputDialog(null, "Ingrese la fecha de Nacimiento: ", "Nacimiento ", 1);

        int ed = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad actual: ", "Edad", 1));

        int gol = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de goles actual: ", "Goles", 1));
        Futbol Ft = new Futbol(nom, Ap, Nac, ed, gol);
        hola.add(Ft);

    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        String elim = "";
        for (int i = 0; i < hola.size(); i++) {
            elim += (i + 1) + "." + hola.get(i).getNombre() + " " + hola.get(i).getApellido() + "\n";

        }
        elim += "\n \nIngrese el numero que desea eliminar ";

        int eliminar = Integer.parseInt(JOptionPane.showInputDialog(null, elim, "Eliminacion", 1));
        hola.remove(eliminar - 1);
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarActionPerformed
        String list = "";
        for (int i = 0; i < hola.size(); i++) {
            list += (i + 1) + "." + hola.get(i).getNombre() + " " + hola.get(i).getApellido() + "\n";

        }
        JOptionPane.showMessageDialog(null, list);
    }//GEN-LAST:event_BtnListarActionPerformed

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
        String info = "";
        for (int i = 0; i < hola.size(); i++) {
            info += (i + 1) + "." + hola.get(i).getNombre() + " " + hola.get(i).getApellido() + "\n";

        }
        info += "\n \nIngrese el numero que desea informacion ";

        int Info = Integer.parseInt(JOptionPane.showInputDialog(null, info, "I", 1));
        JOptionPane.showMessageDialog(null, hola.get(Info - 1));
    }//GEN-LAST:event_BtnInfoActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        String mod = "";
        for (int i = 0; i < hola.size(); i++) {
            mod += (i + 1) + "." + hola.get(i).getNombre() + " " + hola.get(i).getApellido() + "\n";

        }
        mod += "\n \nIngrese el numero en el que desea modificar informacion ";

        int Mod = Integer.parseInt(JOptionPane.showInputDialog(null, mod, "Modificacion", 1));
        int Canmod = 0;
        int Index = Canmod;
        Futbol Infor = hola.get(Index);

        Canmod = Integer.parseInt(JOptionPane.showInputDialog(null, "Que desea modificar\n 1. Nombre de jugador \n 2. Apellido de jugador \n 3. Fecha de Nacimiento \n 4. Edad \n 5. Goles"));

        switch (Canmod - 1) {
            case 0: {
                String nom;
                nom = JOptionPane.showInputDialog(null, "Cancion Actual:  " + Infor.getNombre() + "\n Ingrese Nuevo Nombre: ");
                Infor.setNombre(nom);
            }
            break;
            case 1: {
                String Ap;
                Ap = JOptionPane.showInputDialog(null, "Album :  " + Infor.getApellido() + "\n Ingrese Nuevo Apellido: ");
                Infor.setApellido(Ap);
            }
            break;
            case 2: {
                String Nac;
                Nac = JOptionPane.showInputDialog(null, "Artista :  " + Infor.getFecha() + "\n Ingrese nueva fecha de nacimiento: ");
                Infor.setFecha(Nac);
            }
            break;
            case 3: {
                int ed;
                ed = Integer.parseInt(JOptionPane.showInputDialog(null, "Duracion:  " + Infor.getEdad() + "\n Ingrese edad: "));
                Infor.setEdad(ed);
            }
            break;
            case 4: {
                int gol;
                gol = Integer.parseInt(JOptionPane.showInputDialog(null, "A??o:  " + Infor.getGoles() + "\n Ingrese cantidad de goles: "));
                Infor.setGoles(gol);
            }
            break;

            default: {
                JOptionPane.showMessageDialog(null, "Opcion No Valida");

            }
            break;
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpcion1ActionPerformed
        jFrame1.pack();
        jFrame1.setLocationRelativeTo(this);
        jFrame1.setVisible(true);
    }//GEN-LAST:event_BtnOpcion1ActionPerformed

    private void BtnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarMenuActionPerformed
        jFrame1.dispose();
    }//GEN-LAST:event_BtnRegresarMenuActionPerformed

    private void BtnOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpcion3ActionPerformed
       InterfazUsuario window = new InterfazUsuario();
       window.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_BtnOpcion3ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    public static ArrayList<Character> fillArray(int size, int range, int start) {
        Random rand = new Random();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add((char) (start + rand.nextInt(range)));
        }
        return list;
    }

    public static ArrayList<Character> interseccion(ArrayList<Character> a, ArrayList<Character> b) {
        ArrayList<Character> intersection = new ArrayList<>();

        if (a.size() > b.size()) {
            for (int i = 0; i < b.size(); i++) {
                //Si la lista a contiene el i-esimo elemento de la lista b haga...
                //Si la lista mas grande contiene el i-esimo elemento de la lista peque??a Y la lista de interseccion NO contiene el elemento i-esimo de la lista peque??a agregue
                if (a.contains(b.get(i)) && !intersection.contains(b.get(i))) {
                    intersection.add(b.get(i));
                }
            }
        } else {
            //for each
            //Declaracion for (Tipo_de_dato nombre_de_variable_a_utilizar : nombre_de_la_coleccion_a_recorrer)

            //En el foreach, cuando accesamos nombre_de_variable_a_utilizar es como que en cada iteracion se haga lo siguiente:
            //Tipo_de_dato nombre_de_variable_a_utilizar = nombre_de_la_coleccion_a_recorrer.get(i);
            for (Character character : a) {
                if (b.contains(character) && !intersection.contains(character)) {
                    intersection.add(character);
                }
            }
        }
        return intersection;
    }

    public static ArrayList<String> addBannedWords() {
        char resp = 'n';

        ArrayList<String> bannedWords = new ArrayList<>();

        do {
            String cadena = JOptionPane.showInputDialog(null, "Ingrese una palabra que desea censurar: ");
            //nextLine() sin asignarselo a nada es necesario siempre que antes de leer una cadena se leyo cualquier otro tipo de dato
            bannedWords.add(cadena);
            String respuesta = JOptionPane.showInputDialog(null, "Desea agregar otra palabra? [s/n]: ");
            resp = respuesta.charAt(0);

        } while (resp != 'n' && resp != 'N');

        return bannedWords;
    }

    public static ArrayList<String> censoredMessage(ArrayList<String> bannedWords, String[] tokens) {
        ArrayList<String> censoredMessage = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            if (bannedWords.contains(tokens[i])) {
                censoredMessage.add(censoredWord(tokens[i]));
            } else {
                censoredMessage.add(tokens[i]);
            }
        }
        return censoredMessage;
    }

    public static String censoredWord(String word) {
        String censoredWord = "";
        for (int i = 0; i < word.length(); i++) {
            censoredWord += "*";
        }
        return censoredWord;
    }

    public static String printMessage(ArrayList<String> message) {
        String msg = "";
        for (String string : message) {
            msg += string + ' ';
        }
        return msg;
    }

    ArrayList<Futbol> hola = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnCensurar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnInterseccion;
    private javax.swing.JButton BtnListar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnOpcion1;
    private javax.swing.JButton BtnOpcion2;
    private javax.swing.JButton BtnOpcion3;
    private javax.swing.JButton BtnRegresarMenu;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
