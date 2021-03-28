/*
 * @Author: your name
 * @Date: 2021-03-28 17:26:56
 * @LastEditTime: 2021-03-28 20:12:23
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\video.java
 */

import javax.swing.*;
import java.awt.event.*;

 public class Video extends JFrame implements ActionListener{

     public Video(){
         JPanel mainPanel = new JPanel();
         AllCourse ac = new AllCourse();
         System.out.println(ac);
        //  mainPanel.add(HIIT_jl);
        //  getContentPane().add(mainPanel);
     }

     public void actionPerformed(ActionEvent e){}
     
     public void searchVideo(){}

     public void addVideo(){}

     public void removeVideo(){}
     
     public void clickVideo(){}


     public static void main(String[] args) {
        Video frame = new Video();
        frame.setTitle("Videos V1.0");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        frame.setVisible(true);
     }
 }
