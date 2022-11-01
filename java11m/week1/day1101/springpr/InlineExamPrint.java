package lionlike.java11m.week1.day1101.springpr;

public class InlineExamPrint implements ExamPrint {

    private Exam exam;
    public InlineExamPrint(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("total : %d , average : %.2f ",exam.total(),exam.average());
    }
}
