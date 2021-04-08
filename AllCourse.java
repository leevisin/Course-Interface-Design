/*
 * @Author: your name
 * @Date: 2021-03-28 20:02:49
 * @LastEditTime: 2021-04-08 20:41:19
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\AllCourse.java
 */
import java.io.*;

public class AllCourse{

    public static void main(String[] args) throws IOException{

        AllCourse allVideo = new AllCourse();
        allVideo.addVideo("HIIT", 30, "Test1");
        allVideo.addVideo("Yoga", 35, "Test2");
        allVideo.addVideo("Strength", 45, "Test3");
        allVideo.addVideo("Speed", 60, "Test4");

        AllCourse allTrainer = new AllCourse();
        allTrainer.addTrainer("Tom", "Strength");
        allTrainer.addTrainer("Jack", "Explosive Power");
        allTrainer.addTrainer("Ann", "Slim");

    }
   
    public void writeToFile(boolean isVideo, Video video, Trainer trainer, String filename){
        try{
            FileWriter fileWriter = new FileWriter(filename, true); // It can write at the end of file.
            BufferedWriter writer = new BufferedWriter(fileWriter);
            if(isVideo==true){
              writer.write(video.getVideoName() + "," + video.getVideoTime() + "," + video.getVideoPath() + "\n");
            }
            else{
              writer.write(trainer.getTrainerName() + "," + trainer.getTrainerType() + "\n");
            }
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
    
    public void addVideo(String videoName, int videoTime, String filePath){
      String fileName = "AllVideo.txt";
      Video video = new Video(videoName, videoTime, filePath);
      writeToFile(true, video, null, fileName);
    }

    public void addTrainer(String trainerName, String trainerType){
      String fileName = "AllTrainer.txt";
      Trainer trainer = new Trainer(trainerName, trainerType);
      writeToFile(false, null, trainer, fileName);
    }
}
