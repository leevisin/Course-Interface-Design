/*
 * @Author: your name
 * @Date: 2021-03-28 17:26:56
 * @LastEditTime: 2021-03-28 21:18:11
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\video.java
 */

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

 public class Video extends JFrame implements ActionListener{

     String fileName = "AllCourse.txt";

     public Video(){
         JPanel mainPanel = new JPanel();
         mainPanel.add(new JLabel("This is a Test for GUI"));
         getContentPane().add(mainPanel);

        System.out.println("We are in Constructor.");
        String fileContents = readFromFile(fileName);
        System.out.println(fileContents);
       

     }

     public void actionPerformed(ActionEvent e){}

     public String readFromFile(String filename){
          // Read AllCourse.txt file
        
        try{
            String contents = "";
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String oneLine = bufferedReader.readLine();
            while(oneLine != null){
                contents += oneLine;
                oneLine = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
            return contents;
        }
        catch (IOException e) {
            System.out.println("Errors occured: IOException");
            System.exit(1);
          }
        return null; // When error occur.
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
