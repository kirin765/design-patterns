package hello.designpatterns.state.after;

public class Draft implements State{

    private OnlineCourse onlineCourse;

    public Draft(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        throw new UnsupportedOperationException("no review on draft");
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);
        if(this.onlineCourse.getStudents().size()> 1){
            this.onlineCourse.changeState(new Private(this.onlineCourse));
        }
    }
}
