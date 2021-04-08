/*
 * @Author: your name
 * @Date: 2021-03-28 17:41:14
 * @LastEditTime: 2021-04-08 20:44:49
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\course.java
 */
public class Video {
    private String videoName;
    private int videoTime;
    private String filePath;

    public Video(String videoName, int videoTime, String filePath){
        setVideoName(videoName);
        setVideoTime(videoTime);
        setVideoPath(filePath);
    }

    public Video getVideoName(){
        return videoName;
    }
    public int getVideoTime(){
        return videoTime;
    }
    public void setVideoName(String videoName){
        this.videoName = videoName;
    }
    public void setVideoTime(int videoTime){
        this.videoTime = videoTime;
    }
    public void setVideoPath(String filePath){
        this.filePath = filePath;
    }
    public String getVideoPath(){
        return filePath;
    }
}
