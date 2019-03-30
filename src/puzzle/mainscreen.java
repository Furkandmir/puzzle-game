/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author furkn
 */
public class mainscreen extends javax.swing.JFrame implements ActionListener{
    
    JButton[][] buton = new JButton[4][4];
    BufferedImage img = null;
    BufferedImage bimage = null;
    boolean firstclick = true;
    int previ,prevj,puan=106,oncekidogru=0;
    
    public mainscreen() throws IOException {
        initComponents();
        initialize();
        DosyaOku();
    }
    
    private void initialize(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buton[i][j] = new JButton(""+i+j);
                buton[i][j].setFont(new Font("Arial", Font.PLAIN, 0));
                buton[i][j].addActionListener(this);
                buton[i][j].setSize(215,150);
                buton[i][j].setLocation(i*215,j*150);
                puzzlelabel.add(buton[i][j]);
            }            
            validate();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        int dogrufoto=0;
        String tmp = ae.getActionCommand();
        if(control()!=0 || puan != 100){
        if(firstclick){
             previ = Character.getNumericValue(tmp.charAt(0));
             prevj = Character.getNumericValue(tmp.charAt(1));
             firstclick =  false;
        }else{
         if(!(previ == Character.getNumericValue(tmp.charAt(0)) && prevj == Character.getNumericValue(tmp.charAt(1)))){
             changeicon(previ,prevj,Character.getNumericValue(tmp.charAt(0)),Character.getNumericValue(tmp.charAt(1)));
             dogrufoto = control();
             jLabel1.setText(dogrufoto + " adet dogrunuz var.");
         }
         
         if(dogrufoto<16){
         if(oncekidogru<control()){
             puan=puan+2;
             oncekidogru=control();
         }
         }

        Point.setText("Puan: " + puan);
        firstclick = true; 
        }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        loginscreen = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        maxpuan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gamescreen = new javax.swing.JPanel();
        puzzlelabel = new javax.swing.JLabel();
        Point = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        karistir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 780));
        getContentPane().setLayout(null);

        loginscreen.setMinimumSize(new java.awt.Dimension(960, 780));
        loginscreen.setPreferredSize(new java.awt.Dimension(960, 780));
        loginscreen.setLayout(null);

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 255, 255));
        jButton3.setText("DOSYAYI SECIN");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        loginscreen.add(jButton3);
        jButton3.setBounds(340, 650, 250, 70);

        jLabel4.setBackground(new java.awt.Color(204, 102, 0));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("Kullanici adi");
        loginscreen.add(jLabel4);
        jLabel4.setBounds(350, 420, 140, 20);

        username.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(153, 0, 255));
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loginscreen.add(username);
        username.setBounds(350, 440, 200, 40);

        maxpuan.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        maxpuan.setForeground(new java.awt.Color(51, 255, 0));
        loginscreen.add(maxpuan);
        maxpuan.setBounds(210, 100, 580, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masa.jpg"))); // NOI18N
        jLabel2.setMinimumSize(new java.awt.Dimension(1054, 648));
        jLabel2.setPreferredSize(new java.awt.Dimension(1054, 648));
        loginscreen.add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 780);

        getContentPane().add(loginscreen);
        loginscreen.setBounds(0, 0, 960, 780);

        gamescreen.setMinimumSize(new java.awt.Dimension(960, 780));
        gamescreen.setName(""); // NOI18N
        gamescreen.setPreferredSize(new java.awt.Dimension(960, 780));
        gamescreen.setLayout(null);

        puzzlelabel.setMaximumSize(new java.awt.Dimension(860, 600));
        puzzlelabel.setMinimumSize(new java.awt.Dimension(860, 600));
        gamescreen.add(puzzlelabel);
        puzzlelabel.setBounds(30, 20, 860, 600);

        Point.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Point.setForeground(new java.awt.Color(153, 255, 0));
        gamescreen.add(Point);
        Point.setBounds(70, 670, 200, 30);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 0));
        gamescreen.add(jLabel1);
        jLabel1.setBounds(610, 670, 320, 30);

        karistir.setBackground(new java.awt.Color(51, 51, 255));
        karistir.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        karistir.setForeground(new java.awt.Color(153, 255, 255));
        karistir.setText("KARISTIR");
        karistir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        karistir.setBorderPainted(false);
        karistir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        karistir.setFocusPainted(false);
        karistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karistirActionPerformed(evt);
            }
        });
        gamescreen.add(karistir);
        karistir.setBounds(340, 650, 250, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masa.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        gamescreen.add(jLabel3);
        jLabel3.setBounds(0, 0, 960, 780);

        getContentPane().add(gamescreen);
        gamescreen.setBounds(0, 0, 960, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if(username.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lutfen kullanici adinizi giriniz", "Dikkat", -1);
             
        }else{
        
        JFileChooser chooser = new JFileChooser("C:\\Users\\furkn\\Desktop\\yazlab 2.donem\\yazlab1\\puzzle\\src");
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("dosyayi secin..", "jpg", "png","bmp");
        chooser.setFileFilter(filter);
 
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            try {
                img = ImageIO.read(selectedFile);
                System.out.println("goruntu okundu.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }     
        loadImage(img);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void karistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karistirActionPerformed
        int[][] tmp = new int[4][4];
        puan = puan - 6;
        int dogrufoto = 0;
        System.out.println("karistirildi.");
        puzzlelabel.setVisible(true);
        
        Image dimg = img.getScaledInstance(puzzlelabel.getWidth(), puzzlelabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);   
             
        BufferedImage bi = imageicontobuffered(imageIcon);
        Rectangle rectangle = new Rectangle(215,150);
        BufferedImage buffered2;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buffered2 = cropImage(bi,rectangle,i*215,j*150);
                ImageIcon image = new ImageIcon(buffered2);
                
                while(true){
                    int a = random(),b = random();
                    if(tmp[a][b]==0){
                        buton[a][b].setIcon(image);
                        tmp[a][b]=1;
                        break;
                    } 
                }
               
            }
        }

        
        dogrufoto = control();
        if(dogrufoto > 0){
            jLabel1.setText(dogrufoto + " adet dogrunuz var baslayabilirsiniz.");
            karistir.setVisible(false);
        }else if(dogrufoto==0){
            jLabel1.setText("Lutfen karistirmaya devam edin.");
        }else if(dogrufoto==16){
            jLabel1.setText("Tebrikler 100 puan alarak kazandiniz.");
            JOptionPane.showMessageDialog(null, "Kazandiniz 100 puanla. ", "Tebrikler", -1);
                      setVisible(false); 
                      dispose();
        }
        
    }//GEN-LAST:event_karistirActionPerformed
  
    
    
    int random(){       
        Random rnd = new Random();
        int x = rnd.nextInt(4);
        return x;
    }
    
    
    void changeicon(int x1,int y1, int x2,int y2){
        Icon a = buton[x1][y1].getIcon();
        Icon b = buton[x2][y2].getIcon();
        
        BufferedImage af = icontobuffered(a);
        BufferedImage bf  = icontobuffered(b);
        BufferedImage tmp = icontobuffered(b);
        
        for (int i = 0; i < 215; i++) {
            for (int j = 0; j < 150; j++) {
                tmp.setRGB(i,j,bf.getRGB(i, j));
                bf.setRGB(i, j,af.getRGB(i, j));
                af.setRGB(i, j, tmp.getRGB(i, j));
            }
        }
        
        buton[x1][y1].setIcon(new ImageIcon (af));
        buton[x2][y2].setIcon(new ImageIcon (bf));
        
        puan = puan - 3;
        if(puan<0){
            puan=0;
        }
    }
    
    
    int control(){
        int dogrufoto=0;
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                int flag=1;
                Icon tmp = buton[a][b].getIcon();
                BufferedImage bi = icontobuffered(tmp) ;
                for (int i = 0; i < 215; i++) {
                    for (int j = 0; j < 150; j++) {
                        if(bi.getRGB(i, j)!=bimage.getRGB(i+(a*215), j+(b*150))){
                        flag=0;
                        break;
                        }
                    }
                }
                dogrufoto = dogrufoto + flag;
            }
        }

      
        if(dogrufoto == 16){
            System.out.println("Tebrikler kazandiniz. puaniniz " + puan);
            jLabel1.setText("Tebrikler Kazandiniz.");
            puan = puan + 3;
            DosyayaEkle(Integer.toString(puan));
            JOptionPane.showMessageDialog(null, "Kazandiniz  ", "Tebrikler", -1);
                      setVisible(false); 
                      dispose();
        }
       
        return dogrufoto;
    }
    
    private BufferedImage imageicontobuffered(ImageIcon tmp) {
      
        Image dimg = img.getScaledInstance(puzzlelabel.getWidth(), puzzlelabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);   
        
            BufferedImage bi = new BufferedImage(
            imageIcon.getIconWidth(),
            imageIcon.getIconHeight(),
            BufferedImage.TYPE_INT_RGB);
            Graphics g = bi.createGraphics();    // paint the Icon to the BufferedImage.
            imageIcon.paintIcon(null, g, 0,0);
            g.dispose();
        
        return bi;
   }
    
    private BufferedImage icontobuffered(Icon tmp) {
      
        BufferedImage bi = new BufferedImage(
                    tmp.getIconWidth(),
                    tmp.getIconHeight(),
                    BufferedImage.TYPE_INT_RGB);
                    Graphics g = bi.createGraphics();     // paint the Icon to the BufferedImage.
                    tmp.paintIcon(null, g, 0,0);
                    g.setColor(Color.WHITE);
                    g.dispose();
      
      return bi; 
   }
    
    private void DosyayaEkle(String metin){
            try{
                  String yol="C:\\Users\\furkn\\Desktop\\yazlab 2.donem\\yazlab1\\puzzle\\enyuksekpuan.txt";
                  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(yol, true)));
                 
                  pw.print("\n"+ username.getText()+ "   " + puan);
                  pw.close();
                  
            }
            catch (Exception hata){
                  hata.printStackTrace();
            }
      }
    
    
    private void DosyaOku() throws IOException{
            {
                File file = new File("C:\\Users\\furkn\\Desktop\\yazlab 2.donem\\yazlab1\\puzzle\\enyuksekpuan.txt");
                Scanner input = new Scanner(file); 
                String[][] satir = new String[100][2];
                int i=0,j=0;
                
                int count = 0;
                while (input.hasNext()) {
                  String word  = input.next();
                  if(j==2){
                      j=0;
                      i++;
                  }
                  satir[i][j] = "" + word ;
                  j++;
                  count = count + 1;
                  
                }

                int[] puanlar = new int[count/2];
                
                for (int k = 0; k < count/2; k++) {
                   puanlar[k]=Integer.parseInt(satir[k][1]);
                }
                
                int enbuyuk = puanlar[0];
                int maxindex = 0;
                for(i=1;i<count/2;i++)
                {
                    if(puanlar[i]>enbuyuk)
                    {
                    enbuyuk=puanlar[i];
                    maxindex=i;
                    }
                }
                maxpuan.setText("En yuksek skor " + satir[maxindex][0] + "'in " + satir[maxindex][1] + " skorudur.");
            }
      }
    
    
    
    void loadImage(BufferedImage img){
        Image dimg = img.getScaledInstance(puzzlelabel.getWidth(), puzzlelabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);    
        
        bimage = new BufferedImage(dimg.getWidth(null), dimg.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(dimg, 0, 0, null);
        bGr.dispose();
        
        puzzlelabel.setIcon(imageIcon);
        
        loginscreen.setVisible(false);
        gamescreen.setVisible(true);
        puzzlelabel.setVisible(false);

    }

    private BufferedImage cropImage(BufferedImage src, Rectangle rect,int a,int b) {
      
      BufferedImage dest = src.getSubimage(a,b , rect.width, rect.height);
      return dest; 
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
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new mainscreen().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(mainscreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Point;
    public javax.swing.JPanel gamescreen;
    public static javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JButton karistir;
    private javax.swing.JPanel loginscreen;
    private javax.swing.JLabel maxpuan;
    public javax.swing.JLabel puzzlelabel;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    /*@Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
