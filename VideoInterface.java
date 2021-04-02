/*
 * @Author: your name
 * @Date: 2021-03-28 17:26:56
 * @LastEditTime: 2021-04-02 22:20:27
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\video.java
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;

 public class VideoInterface extends JFrame implements ActionListener{

     String fileName = "AllVideo.txt";

     public VideoInterface(){
        JPanel coursePanel = new JPanel();
        JPanel searchPanel = new JPanel();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Search Area
        JTextField textField = new JTextField(20);
        JButton searchBtn = new JButton("Search Course");
        searchPanel.add(textField);
        searchPanel.add(searchBtn);

        // Get course information from file
        String fileContents = readFromFile(fileName);
        String[] splitFileContents = fileContents.split(",");
        int courseNum = splitFileContents.length/2;
        coursePanel.setLayout(new GridLayout(courseNum,1)); // Set Layout type
        
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
            btn.setSize(300,400);
            String name = courseName[i];
            btn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // System.out.println("This button is clicked.");
                    System.out.println("This course name is " + name ); // return is still error.
                }
            });
            coursePanel.add(btn);
        }
            
        getContentPane().add("North",searchPanel);
        getContentPane().add("Center",coursePanel);
     }

     public void actionPerformed(ActionEvent e){
        //  System.out.println("This button is clicked.");
     }

     public String readFromFile(String filename){
        // Read AllCourse.txt file
        try{
            String contents = "";
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String oneLine = bufferedReader.readLine();
            while(oneLine != null){
                contents += oneLine + ",";
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
        VideoInterface frame = new VideoInterface();
        frame.setTitle("VideoInterface V1.2");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        frame.setVisible(true);
     }
     
 }
