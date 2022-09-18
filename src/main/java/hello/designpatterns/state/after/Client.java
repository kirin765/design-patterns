package hello.designpatterns.state.after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("ss");
        Student student2 = new Student("dkdkdk");
        student2.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello", student);

        onlineCourse.addStudent(student2);

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());

    }
}
