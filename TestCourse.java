/*
 * @Author: your name
 * @Date: 2021-03-28 17:46:12
 * @LastEditTime: 2021-03-28 17:47:40
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\TestCourse.java
 */
public class TestCourse {
    public static void main(String[] args) {
        course c = new course("HIIT",20);
        System.out.println(c.getCourseName());
        System.out.println(c.getCourseTime());
    }
}
