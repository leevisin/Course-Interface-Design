/*
 * @Author: your name
 * @Date: 2021-03-28 20:02:49
 * @LastEditTime: 2021-03-28 20:18:17
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\AllCourse.java
 */
public class AllCourse {

    public AllCourse(){
         Course HIIT = new Course("HIIT", 30);
         Course Yoga = new Course("Yoga", 30);
         Course Strength = new Course("Strength", 30);
         Course Speed = new Course("Speed", 60);
        System.out.println(HIIT.getCourseName());
    }

    public Course getCourse(String courseName){
        if(courseName==Course.getCourseName())
        return null;
    }

    
}
