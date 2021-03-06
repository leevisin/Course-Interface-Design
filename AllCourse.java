/*
 * @Author: your name
 * @Date: 2021-03-28 20:02:49
 * @LastEditTime: 2021-04-15 18:41:38
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\AllCourse.java
 */
import java.io.*;
import java.nio.file.*;


//this is a comment
//another line of comment

public class AllCourse{

    public static void main(String[] args) throws IOException{

        AllCourse allCourse = new AllCourse();

    }

    public AllCourse(){
      // Generate base enviroment
      addVideo("HIIT", 30, "Test1.mp4");
      addVideo("Yoga", 35, "Test2.mp4");
      addVideo("Strength", 45, "Test3.mp4");
      addVideo("Speed", 60, "Test4.mp4");
      
      addTrainer("Tom", "Strength");
      addTrainer("Jack", "Explosive Power");
      addTrainer("Ann", "Slim");

      
      // Need Panel to add video/trainer
    }
   
    public void addVideo(String videoName, int videoTime, String filePath){
      Video video = new Video(videoName, videoTime, filePath);
      writeVideoToFile(video);
    }

    public void addTrainer(String trainerName, String trainerType){
      Trainer trainer = new Trainer(trainerName, trainerType);
      writeTrainerToFile(trainer);
    }

    public void writeVideoToFile(Video video){
      String fileDirectory = "Video";
      fileExist(fileDirectory);

      String filename = "Video/AllVideo.txt";
      try {
        FileWriter fileWriter = new FileWriter(filename, true); // It can write at the end of file.
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(video.getVideoName() + "," + video.getVideoTime() + "," + video.getVideoPath() + "\n");
        writer.close();
        fileWriter.close();
      } catch (Exception e) {
        System.out.println("File Writer error!");
      }
    }
    
    public void writeTrainerToFile(Trainer trainer){
      String fileDirectory = "Trainer";
      fileExist(fileDirectory);

      String filename = "Trainer/AllTrainer.txt";
      try {
        FileWriter fileWriter = new FileWriter(filename, true); // It can write at the end of file.
        BufferedWriter writer = new BufferedWriter(fileWriter);  
        writer.write(trainer.getTrainerName() + "," + trainer.getTrainerType() + "\n");
        writer.close();
        fileWriter.close();
      } catch (Exception e) {
        System.out.println("File Writer error!");
      }
    }

    public void fileExist(String pathName){
      File file = new File(pathName);
      if(!file.exists()){
        Path path = Paths.get(pathName);
        try {
          Files.createDirectory(path);
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
          System.out.println(pathName + "is not exist.");
        }
      }
    }
}
