/*
 * @Author: your name
 * @Date: 2021-03-28 17:41:14
 * @LastEditTime: 2021-03-28 17:47:04
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\course.java
 */
public class course {
    private String courseName;
    private int courseTime;

    public course(String courseName, int courseTime){
        setCourseName(courseName);
        setCourseTime(courseTime);
    }

    public course(int courseTime, String courseName){
        setCourseName(courseName);
        setCourseTime(courseTime);
    }

    public String getCourseName(){
        return courseName;
    }
    public int getCourseTime(){
        return courseTime;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setCourseTime(int courseTime){
        this.courseTime = courseTime;
    }
}
