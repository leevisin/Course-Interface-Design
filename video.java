/*
 * @Author: your name
 * @Date: 2021-03-28 17:41:14
 * @LastEditTime: 2021-03-31 21:01:01
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\course.java
 */
public class Video {
    private String videoName;
    private int videoTime;

    public Video(String videoName, int videoTime){
        setVideoName(videoName);
        setVideoTime(videoTime);
    }

    public Video(int videoTime, String videoName){
        setVideoName(videoName);
        setVideoTime(videoTime);
    }

    public String getVideoName(){
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
}
