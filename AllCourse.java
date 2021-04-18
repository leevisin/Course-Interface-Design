/*
 * @Author: your name
 * @Date: 2021-03-28 20:02:49
 * @LastEditTime: 2021-03-29 20:35:26
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\AllCourse.java
 */
import java.io.*;

//this is a comment

public class AllCourse{

    public static void main(String[] args) throws IOException{
        String fileName = "AllCourse.txt";
        Course HIIT = new Course("HIIT", 30);
        Course Yoga = new Course("Yoga", 30);
        Course Strength = new Course("Strength", 45);
        Course Speed = new Course("Speed", 60);
        writeToFile(HIIT, fileName);
        writeToFile(Yoga, fileName);
        writeToFile(Strength, fileName);
        writeToFile(Speed, fileName);
    }
   
    public static void writeToFile(Course course, String filename){
        try{
            FileWriter fileWriter = new FileWriter(filename, true); // It can write at the end of file.
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(course.getCourseName() + " " + course.getCourseTime() + "\n");
            writer.close();
            fileWriter.close();
          }
          catch (FileNotFoundException e) {
            e.printStackTrace();
          }
          catch (IOException e) {
            e.printStackTrace();
          }
    }
}
