/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management;

/**
 *
 * @author Zeeshan
 */
public class LoadingClass {
    public static void main(String[] args) {
        Loading ld =new Loading();
        Login lg =new Login();
        ld.setVisible(true);
        try{
        for(int i=0;i<=100; i++){
            Thread.sleep(20);
            ld.jLabel2.setText(Integer.toString(i));
            ld.jProgressBar1.setValue(i);
            if(i==100){
                ld.setVisible(false);
                lg.setVisible(true);
            }
            }
        }catch(Exception e){
        
            }
    }
}
