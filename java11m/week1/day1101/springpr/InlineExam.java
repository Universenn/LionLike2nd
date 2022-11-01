package lionlike.java11m.week1.day1101.springpr;

public class InlineExam implements Exam {

    private int mat;
    private int eng;
    private int kor;
    private int com;

    public InlineExam(int mat, int eng, int kor, int com) {
        this.mat = mat;
        this.eng = eng;
        this.kor = kor;
        this.com = com;
    }

    @Override
    public int total() {
        return mat+eng+kor+com;
    }

    @Override
    public float average() {
        return (float) (total() / 4.0);
    }
}
