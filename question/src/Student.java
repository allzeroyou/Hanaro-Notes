public class Student {
    // 이름: 홍길동 국어: 70 영어: 80 수학: 90 총점: 240 평균: 80.0
    private String name;
    private int kScore;
    private int eScore;
    private int mScore;
    private int total;
    private double avg; // 소수점 첫째자리까지

    public Student(String name, int kScore, int eScore, int mScore, int total, double avg) {
        this.name = name;
        this.kScore = kScore;
        this.eScore = eScore;
        this.mScore = mScore;
        this.total = total;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getkScore() {
        return kScore;
    }

    public void setkScore(int kScore) {
        this.kScore = kScore;
    }

    public int geteScore() {
        return eScore;
    }

    public void seteScore(int eScore) {
        this.eScore = eScore;
    }

    public int getmScore() {
        return mScore;
    }

    public int getTotal() {
        return total;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    // 수정한 점수 반영해서 다시 총점, 평균 구하기
    public void setTotalAndAvg(int kScore, int eScore, int mScore) {
        this.total = kScore + eScore + mScore;
        this.avg = this.total / 3;
    }
}
