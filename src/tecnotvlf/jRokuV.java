/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tecnotvlf;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author localadmin
 */
public class jRokuV extends javax.swing.JFrame {

    static List<String> listas;

    /**
     * Creates new form jRokuV
     */
    public jRokuV() {
        initComponents();
        listas = new ArrayList<>();
        jcbLista.setVisible(false);
        List<String> listLoaded = loadList();
        if (listLoaded != null && !sonIguales(listLoaded)) {
            System.out.println("Cargando listas previas");
            //Collections.copy(listas, listLoaded);
            listas = listLoaded;
            jbCargarCh.setEnabled(true);
            //cargarComboBox(listLoaded);
        }
        jbCargarCh.setEnabled(false);
        loadImages();
    }

    private void loadImages() {
        JLabel[] labels = {jlbCanal6, jlbCinemax, jlbDiscovery, jlbEurofilms, jlbHist, jlbNatgeo, jlbParamount, jlbTnt, jlbUniversal};
        ImageIcon[] icons = {
            new ImageIcon(jRokuV.class.getResource("/imgs/canal6.png")),
            new ImageIcon(jRokuV.class.getResource("/imgs/cinemax.png")),
            new ImageIcon(jRokuV.class.getResource("/imgs/discovery.png")),
            new ImageIcon(jRokuV.class.getResource("/imgs/eurofilmsus.png")),
            new ImageIcon(jRokuV.class.getResource("/imgs/history.png")),
            new ImageIcon(jRokuV.class.getResource("/imgs/natgeo.jpeg")),
            new ImageIcon(jRokuV.class.getResource("/imgs/paramount.png")),
            new ImageIcon(jRokuV.class.getResource("/imgs/tntusa.png")),
            new ImageIcon(jRokuV.class.getResource("/imgs/universal.png"))
        };
        // Configurar el JLabel con la imagen escalada
        for (int i = 0; i < labels.length; i++) {
            Image image = icons[i].getImage();
            Image scaledImage = image.getScaledInstance(labels[i].getWidth(), labels[i].getHeight(), Image.SCALE_SMOOTH);
            labels[i].setIcon(new ImageIcon(scaledImage));
        }
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
        jSeparator1 = new javax.swing.JSeparator();
        jbCargarCh = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jcbLista = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jlbCanal6 = new javax.swing.JLabel();
        jlbHist = new javax.swing.JLabel();
        jlbCinemax = new javax.swing.JLabel();
        jlbDiscovery = new javax.swing.JLabel();
        jlbNatgeo = new javax.swing.JLabel();
        jlbParamount = new javax.swing.JLabel();
        jlbUniversal = new javax.swing.JLabel();
        jlbTnt = new javax.swing.JLabel();
        jlbEurofilms = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/roku-logo.png"))); // NOI18N

        jbCargarCh.setText("Cargar Canales");
        jbCargarCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarChActionPerformed(evt);
            }
        });

        jcbLista.setEnabled(false);
        jcbLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbCargarCh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcbLista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCargarCh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbCanal6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/canal6.png"))); // NOI18N
        jlbCanal6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbCanal6MouseClicked(evt);
            }
        });

        jlbHist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/canal6.png"))); // NOI18N
        jlbHist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbHistMouseClicked(evt);
            }
        });

        jlbCinemax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/canal6.png"))); // NOI18N
        jlbCinemax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbCinemaxMouseClicked(evt);
            }
        });

        jlbDiscovery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/canal6.png"))); // NOI18N
        jlbDiscovery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbDiscoveryMouseClicked(evt);
            }
        });

        jlbNatgeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/canal6.png"))); // NOI18N
        jlbNatgeo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbNatgeoMouseClicked(evt);
            }
        });

        jlbParamount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/canal6.png"))); // NOI18N
        jlbParamount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbParamountMouseClicked(evt);
            }
        });

        jlbUniversal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/canal6.png"))); // NOI18N
        jlbUniversal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbUniversalMouseClicked(evt);
            }
        });

        jlbTnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/canal6.png"))); // NOI18N
        jlbTnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbTntMouseClicked(evt);
            }
        });

        jlbEurofilms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/canal6.png"))); // NOI18N
        jlbEurofilms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbEurofilmsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbCanal6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbHist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbCinemax))
                    .addComponent(jlbDiscovery)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jlbNatgeo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(590, 590, 590)
                        .addComponent(jlbParamount))
                    .addComponent(jlbUniversal)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jlbTnt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(590, 590, 590)
                        .addComponent(jlbEurofilms)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbCinemax)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbParamount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbEurofilms))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbHist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbNatgeo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbTnt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbCanal6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbDiscovery)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbUniversal)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCargarChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarChActionPerformed
        // TODO add your handling code here:ç
        cargarCanales();
    }//GEN-LAST:event_jbCargarChActionPerformed

    private void jcbListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jcbListaActionPerformed

    private void jlbCanal6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCanal6MouseClicked
        // TODO add your handling code here:
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Configs.urlRoku).append(Configs.param).append(URLEncoder.encode(Configs.canal6, "utf-8")).append(Configs.param2);
            doPOST(sb.toString());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: " + ex.getMessage());
        }
    }//GEN-LAST:event_jlbCanal6MouseClicked

    private void jlbHistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbHistMouseClicked
        // History 
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Configs.urlRoku).append(Configs.param).append(URLEncoder.encode(findChannel("History"), "utf-8")).append(Configs.param2);
            doPOST(sb.toString());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: " + ex.getMessage());
        }
    }//GEN-LAST:event_jlbHistMouseClicked

    private void jlbCinemaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCinemaxMouseClicked
        // Cinemax
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Configs.urlRoku).append(Configs.param).append(URLEncoder.encode(findChannel("Cinemax"), "utf-8")).append(Configs.param2);
            doPOST(sb.toString());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: " + ex.getMessage());
        }
    }//GEN-LAST:event_jlbCinemaxMouseClicked

    private void jlbDiscoveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbDiscoveryMouseClicked
        // Discovery
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Configs.urlRoku).append(Configs.param).append(URLEncoder.encode(findChannel("Discovery"), "utf-8")).append(Configs.param2);
            doPOST(sb.toString());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: " + ex.getMessage());
        }
    }//GEN-LAST:event_jlbDiscoveryMouseClicked

    private void jlbNatgeoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbNatgeoMouseClicked
        // Natgeo
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Configs.urlRoku).append(Configs.param).append(URLEncoder.encode(findChannel("NatGeo"), "utf-8")).append(Configs.param2);
            doPOST(sb.toString());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: " + ex.getMessage());
        }
    }//GEN-LAST:event_jlbNatgeoMouseClicked

    private void jlbParamountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbParamountMouseClicked
        // Paramount
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Configs.urlRoku).append(Configs.param).append(URLEncoder.encode(findChannel("Paramount"), "utf-8")).append(Configs.param2);
            doPOST(sb.toString());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: " + ex.getMessage());
        }
    }//GEN-LAST:event_jlbParamountMouseClicked

    private void jlbUniversalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbUniversalMouseClicked
        // Universal
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Configs.urlRoku).append(Configs.param).append(URLEncoder.encode(findChannel("Universal"), "utf-8")).append(Configs.param2);
            doPOST(sb.toString());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: " + ex.getMessage());
        }
    }//GEN-LAST:event_jlbUniversalMouseClicked

    private void jlbTntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbTntMouseClicked
        // TNT
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Configs.urlRoku).append(Configs.param).append(URLEncoder.encode(findChannel("Tnt"), "utf-8")).append(Configs.param2);
            doPOST(sb.toString());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: " + ex.getMessage());
        }
    }//GEN-LAST:event_jlbTntMouseClicked

    private void jlbEurofilmsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbEurofilmsMouseClicked
        // Film & Arts
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Configs.urlRoku).append(Configs.param).append(URLEncoder.encode(findChannel("FilmArts"), "utf-8")).append(Configs.param2);
            doPOST(sb.toString());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: " + ex.getMessage());
        }
    }//GEN-LAST:event_jlbEurofilmsMouseClicked

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
            java.util.logging.Logger.getLogger(jRokuV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jRokuV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jRokuV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jRokuV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jRokuV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbCargarCh;
    private javax.swing.JComboBox<String> jcbLista;
    private javax.swing.JLabel jlbCanal6;
    private javax.swing.JLabel jlbCinemax;
    private javax.swing.JLabel jlbDiscovery;
    private javax.swing.JLabel jlbEurofilms;
    private javax.swing.JLabel jlbHist;
    private javax.swing.JLabel jlbNatgeo;
    private javax.swing.JLabel jlbParamount;
    private javax.swing.JLabel jlbTnt;
    private javax.swing.JLabel jlbUniversal;
    // End of variables declaration//GEN-END:variables

    /*private void cargarComboBox(List<String> values) {
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel<>();
        for (String value : values) {
            dcbm.addElement(value);
        }
        jcbLista.setEnabled(true);
        jcbLista.setModel(dcbm);
        jButton2.setEnabled(true);
    }*/

    private void cargarCanales() {
        try {
            URL url = new URL(Configs.mainUrl);
            URLConnection connection = url.openConnection();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("m3u")) {
                        //System.out.println("Patron reconocido en: " + line);
                        downloadM3U(line, listas);
                    }
                }
            }
            if (!listas.isEmpty()) {
                /*System.out.println("Resultados: \nElije la que deseas enviar.");
                int opc = 1;
                for (String lURL : listas) {
                    System.out.println(opc + " - " + lURL);
                    opc++;
                }*/
                // Carga listas en el ComboBox
                //cargarComboBox(listas);
                // Salva el listado en un fichero    
                saveList();
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(TecnoTVLF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TecnoTVLF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String doPOST(String url) {
        try {
            // Crear una conexión HTTP
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // Configurar la solicitud como POST
            con.setRequestMethod("POST");

            // Habilitar el envío de datos
            con.setDoOutput(true);

            // Escribir los parámetros en el cuerpo de la solicitud
            //try (OutputStream os = con.getOutputStream()) {
            //    byte[] input = parametros.getBytes("utf-8");
            //    os.write(input, 0, input.length);
            //}
            // Leer la respuesta del servidor
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                return response.toString();
            }
        } catch (IOException e) {
            System.out.println("IOE: " + e.getMessage());
            return null;
        }
    }

    private void downloadM3U(String url, List<String> result) {

        try {
            String extractedUrl = extractURL(url);
            URL m3uUrl = new URL(extractedUrl);
            URLConnection connection = m3uUrl.openConnection();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // jlbCinemax, jlbDiscovery, jlbEurofilms, jlbHist, jlbNatgeo, jlbParamount, jlbTnt, jlbUniversal
                    if (line.contains("History Channel") || line.contains("Discovery Channel") || line.contains("Film & Arts") || line.contains("National Geographic") || line.contains("Paramount HD") || line.contains("TNT HD") || line.contains("Studio Universal")) {
                        System.out.println(line);
                        line = br.readLine();
                        if (line.indexOf("zonafilm") == -1) {
                            result.add(line);
                            System.out.println(line);
                        }
                    }
                }
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(TecnoTVLF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TecnoTVLF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String extractURL(String line) {
        String extracted = "";
        Pattern pattern = Pattern.compile("value=\"(.*?)\"");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            extracted = matcher.group(1);
        }
        return extracted;
    }

    private boolean sonIguales(List<String> list) {
        return listas.equals(list);
    }

    private void saveList() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("lists.db");
            for (String value : listas) {
                fos.write(value.getBytes());
                fos.write("\n".getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(jRokuV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(jRokuV.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(jRokuV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private List loadList() {
        try {
            File file = new File("lists.db");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                List<String> list = new ArrayList<>();
                int val;
                String tmpVal = "";
                while ((val = fis.read()) != -1) {
                    if ((char) val != '\n') {
                        tmpVal += (char) val;
                    } else {
                        list.add(tmpVal);
                        tmpVal = "";
                    }
                }
                return list;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(jRokuV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(jRokuV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private String findChannel(String channel) {
        String result = "";
        for (String chan : listas) {
            if (channel.equalsIgnoreCase("History") && chan.indexOf("a056&") != -1) {
                result = chan;
                break;
            }else if (channel.equalsIgnoreCase("Cinemax") && chan.indexOf("a056&") != -1) {
                result = chan;
                break;
            }else if (channel.equalsIgnoreCase("Discovery") && chan.indexOf("a054&") != -1) {
                result = chan;
                break;
            }else if (channel.equalsIgnoreCase("NatGeo") && chan.indexOf("a02f&") != -1) {
                result = chan;
                break;
            }else if (channel.equalsIgnoreCase("Paramount") && chan.indexOf("a075&") != -1) {
                result = chan;
                break;
            }else if (channel.equalsIgnoreCase("Universal") && chan.indexOf("a06r&") != -1) {
                result = chan;
                break;
            }else if (channel.equalsIgnoreCase("Tnt") && chan.indexOf("a05l&") != -1) {
                result = chan;
                break;
            }else if (channel.equalsIgnoreCase("FilmArts") && chan.indexOf("a01f&") != -1) {
                result = chan;
                break;
            }
        }
        return result;
    }
    
    private void sendToRoku(String url){
        String param1 = url; //jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Configs.urlRoku).append(Configs.param).append(URLEncoder.encode(param1, "utf-8")).append(Configs.param2);
            doPOST(sb.toString());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException: " + ex.getMessage());
        }
    }

}