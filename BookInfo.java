/*
 * @Author: your name
 * @Date: 2021-03-31 21:40:58
 * @LastEditTime: 2021-03-31 21:49:16
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\BookInfo.java
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;

public class BookInfo extends JFrame implements ActionListener{
    public BookInfo(String trainerName, String trainerType){
        JLabel info = new JLabel("You have booked " + trainerName + "'s " + trainerType + " course successfully!");
        JPanel panel = new JPanel();
        panel.add(info);
        getContentPane().add(panel);
    }
}
