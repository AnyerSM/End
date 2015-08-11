/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endproyect;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Anyer
 */
public class Interfaz extends javax.swing.JFrame {
    
    ArrayList<JLabel> etiquetas;
    int piezas[]=new int[12];
    int valor=0;
    JLabel imagenes[]=new JLabel[12];
    int pieza[]=new int[12];
    Random r=new Random();
    int k=0;
    int l[]=new int[4];
    

    public Interfaz () {
        
    etiquetas=new ArrayList<JLabel>();
    initComponents();
       
    jPanel1.setSize(384, 384);
        for(int x=0; x<12; x++){
        int arreglo=(int)(r.nextDouble()*6+1);
        if(x==0){
        pieza[x]=arreglo;
        }
        if(x!=0){
        int a=0;
        for(;a!=1;){
        int variable=0;
        for(int j=0; j<pieza.length; j++){
        if(arreglo==pieza[j]){
        variable++;
        }
       }
        if((variable==0)||(variable==1)){
        pieza[x]=arreglo;
        a=1;
        }else{
        arreglo=(int)(r.nextDouble()*6+1);
        }}}}
        for(int i:piezas){
        imagenes[valor]=new JLabel();
        ImageIcon iconx=new ImageIcon("src/Proyecto/water.png");
            
        imagenes[valor].setIcon(iconx);
        imagenes[valor].setName(""+valor);
        imagenes[valor].setSize(500, 500);
        final Integer inte=new Integer(imagenes[valor].getName());
        jPanel1.add(imagenes[valor]);
        imagenes[valor].addMouseListener(new MouseListener() {

        public void mouseClicked(MouseEvent e) {
     ImageIcon icon0=new ImageIcon("src/endproyect/water.png");
     ImageIcon icon1=new ImageIcon("src/endproyect/flower1.png");
     ImageIcon icon2=new ImageIcon("src/endproyect/flowerblue1.png");
     ImageIcon icon3=new ImageIcon("src/endproyect/flowerpollen1.png");
     ImageIcon icon4=new ImageIcon("src/endproyect/flowerred1.png");
     ImageIcon icon5=new ImageIcon("src/endproyect/flowers1.png");
     ImageIcon icon6=new ImageIcon("src/endproyect/tree1.png");
         if(pieza[inte]==1){
       imagenes[inte].setIcon(icon1);
       imagenes[inte].setText(null);
       k++;
       if(k==1){
       l[0]=pieza[inte];
       Integer ls=new Integer(imagenes[inte].getName());
       l[1]=ls;
       }
       if(k==2){
       l[2]=pieza[inte];
       Integer lt=new Integer(imagenes[inte].getName());
       l[3]=lt;
       }
       if(k==3){
       if(l[0]!=l[2]){
       imagenes[l[1]].setIcon(icon0);
       imagenes[l[3]].setIcon(icon0);
       }
       k=1;
       l[0]=pieza[inte];
       Integer lu=new Integer(imagenes[inte].getName());
       l[1]=lu;
       }}
       if(pieza[inte]==2){
       imagenes[inte].setIcon(icon2);
       imagenes[inte].setText(null);
       k++;
       if(k==1){
       l[0]=pieza[inte];
       Integer ls=new Integer(imagenes[inte].getName());
       l[1]=ls;
       }
       if(k==2){
       l[2]=pieza[inte];
       Integer lt=new Integer(imagenes[inte].getName());
       l[3]=lt;
       }
       if(k==3){
       if(l[0]!=l[2]){
       imagenes[l[1]].setIcon(icon0);
       imagenes[l[3]].setIcon(icon0);
       }
       k=1;
       l[0]=pieza[inte];
       Integer paresz=new Integer(imagenes[inte].getName());
       l[1]=paresz;
       }
       }
       if(pieza[inte]==3){
       imagenes[inte].setIcon(icon3);
       imagenes[inte].setText(null);
       k++;
       if(k==1){
       l[0]=pieza[inte];
       Integer ls=new Integer(imagenes[inte].getName());
       l[1]=ls;
       }
       if(k==2){
       l[2]=pieza[inte];
       Integer lt=new Integer(imagenes[inte].getName());
       l[3]=lt;
       }
       if(k==3){
       if(l[0]!=l[2]){
       imagenes[l[1]].setIcon(icon0);
       imagenes[l[3]].setIcon(icon0);
       }
       k=1;
       l[0]=pieza[inte];
       Integer lu=new Integer(imagenes[inte].getName());
       l[1]=lu;
       }}
       if(pieza[inte]==4){
       imagenes[inte].setIcon(icon4);
       imagenes[inte].setText(null);
       k++;
       if(k==1){
       l[0]=pieza[inte];
       Integer ls=new Integer(imagenes[inte].getName());
       l[1]=ls;
       }
       if(k==2){
       l[2]=pieza[inte];
       Integer lt=new Integer(imagenes[inte].getName());
       l[3]=lt;
       }
       if(k==3){
       if(l[0]!=l[2]){
       imagenes[l[1]].setIcon(icon0);
       imagenes[l[3]].setIcon(icon0);
       }
       k=1;
       l[0]=pieza[inte];
       Integer lu=new Integer(imagenes[inte].getName());
       l[1]=lu;
       }}
       if(pieza[inte]==5){
       imagenes[inte].setIcon(icon5);
       imagenes[inte].setText(null);
       k++;
       if(k==1){
     l[0]=pieza[inte];
     Integer ls=new Integer(imagenes[inte].getName());
     l[1]=ls;
     }
     if(k==2){
     l[2]=pieza[inte];
     Integer paresy=new Integer(imagenes[inte].getName());
     l[3]=paresy;
     }
     if(k==3){
     if(l[0]!=l[2]){
     imagenes[l[1]].setIcon(icon0);
     imagenes[l[3]].setIcon(icon0);
     }
     k=1;
     l[0]=pieza[inte];
     Integer lu=new Integer(imagenes[inte].getName());
     l[1]=lu;
     } }
     if(pieza[inte]==6){
     imagenes[inte].setIcon(icon6);
     imagenes[inte].setText(null);
     k++;
     if(k==1){
     l[0]=pieza[inte];
     Integer ls=new Integer(imagenes[inte].getName());
     l[1]=ls;
     }
     if(k==2){
     l[2]=pieza[inte];
     Integer lt=new Integer(imagenes[inte].getName());
     l[3]=lt;
     }
     if(k==3){
     if(l[0]!=l[2]){
     imagenes[l[1]].setIcon(icon0);
     imagenes[l[3]].setIcon(icon0);
     }
     k=1;
     l[0]=pieza[inte];
     Integer lu=new Integer(imagenes[inte].getName());
     l[1]=lu;
     }}
     jLabel1.setText(""+inte);
     }
     public void mousePressed(MouseEvent e) {              
     }
     public void mouseReleased(MouseEvent e) {
     }
     public void mouseEntered(MouseEvent e) {
     }
     public void mouseExited(MouseEvent e) {              
     }});
     valor++;
     } }
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1540));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new java.awt.GridLayout(3, 4));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("MEMORAMA DE LA NATURALEZA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
