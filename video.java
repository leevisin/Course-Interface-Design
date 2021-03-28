/*
 * @Author: your name
 * @Date: 2021-03-28 17:26:56
 * @LastEditTime: 2021-03-28 19:43:37
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\video.java
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

 public class Video extends JFrame implements ActionListener{

     public Video(){
         JPanel Jp1 = new JPanel();
         JLabel Jl = new JLabel("Test");
         Jp1.add(Jl);
         getContentPane().add(Jp1);
     }

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
