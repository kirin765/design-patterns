package hello.designpatterns.state.after;

public class Private implements State{

    private OnlineCourse onlineCourse;

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        if(this.onlineCourse.getStudents().contains(student)){
            this.onlineCourse.getReviews().add(review);
        }else{
            throw new UnsupportedOperationException("private only student review");
        }
    }

    @Override
    public void addStudent(Student student) {
        if(student.isAvailable(this.onlineCourse)){
            this.onlineCourse.getStudents().add(student);
        }else{
            throw new UnsupportedOperationException("can't get private course");
        }
    }
}
