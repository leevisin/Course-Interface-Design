/*
 * @Author: your name
 * @Date: 2021-03-28 17:26:56
 * @LastEditTime: 2021-03-29 20:33:23
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
        mainPanel.add(new JLabel("This is will be input search bar"));
        // Get course information from file
        String fileContents = readFromFile(fileName);
        String[] splitFileContents = fileContents.split(" ");
        int courseNum = splitFileContents.length/2;
        
        
        // Temp store coure information indepently
        String[] courseName = new String[courseNum];
        int[] courseTime = new int[courseNum];

        for(int i=0,j=0,k=0; i<splitFileContents.length; i++){
            if(i%2==0){ courseName[j] = splitFileContents[i]; j++; }
            else {courseTime[k] = Integer.parseInt(splitFileContents[i]); k++; }
        }

        // Generate JButton for each course
        for(int i=0; i<courseNum; i++){
            JButton btn = new JButton(courseName[i] + "  "+ courseTime[i] + "mins");
            String name = courseName[i];
            btn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // System.out.println("This button is clicked.");
                    System.out.println("This course name is " + name ); // return is still error.
                }
            });
            mainPanel.add(btn);
        }
            
        
            
       
        getContentPane().add(mainPanel);
     }

    //  public void actionPerformed(ActionEvent e){
    //      System.out.println("This button is clicked.");
    //  }

     public String readFromFile(String filename){
        // Read AllCourse.txt file
        try{
            String contents = "";
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String oneLine = bufferedReader.readLine();
            while(oneLine != null){
                contents += oneLine + " ";
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
        return null; // When error occurs.
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
