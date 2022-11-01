package lionlike.java11m.week1.day1101.springpr;

public class PracticeDi {
    public static void main(String[] args) {
        Exam exam = new InlineExam(45,50,80,90);
        ExamPrint ep = new InlineExamPrint(exam);  // DI
        ep.print();
    }
}
