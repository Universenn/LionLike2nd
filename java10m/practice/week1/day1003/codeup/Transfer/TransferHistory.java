package lionlike.java10m.practice.week1.day1003.codeup.Transfer;


public class TransferHistory {
    private int toCity;
    private int toSigungu;
    private int toDong;
    private int year;
    private int month;
    private int day;
    private int fromCity;
    private int fromSido;
    private int fromDong;

    private TransferHistory(int toCity, int toSigungu, int toDong, int year, int month, int day, int fromCity, int fromSido, int fromDong) {
        this.toCity = toCity;
        this.toSigungu = toSigungu;
        this.toDong = toDong;
        this.year = year;
        this.month = month;
        this.day = day;
        this.fromCity = fromCity;
        this.fromSido = fromSido;
        this.fromDong = fromDong;
    }

    private TransferHistory(String toCity, String toSigungu, String toDong, String year, String month, String day, String fromCity, String fromSido, String fromDong) {
        this.toCity = Integer.parseInt(toCity);
        this.toSigungu = Integer.parseInt(toSigungu);
        this.toDong = Integer.parseInt(toDong);
        this.year = Integer.parseInt(year);
        this.month = Integer.parseInt(month);
        this.day = Integer.parseInt(day);
        this.fromCity = Integer.parseInt(fromCity);
        this.fromSido = Integer.parseInt(fromSido);
        this.fromDong = Integer.parseInt(fromDong);
    }

    public static TransferHistory parse(String data) {
        String[] dataArr = data.split(",");
        return new TransferHistory(dataArr[0],
                dataArr[1],
                dataArr[2],
                dataArr[3],
                dataArr[4],
                dataArr[5],
                dataArr[6],
                dataArr[7],
                dataArr[8]);
    }

    public int getToCity() {
        return toCity;
    }

    public int getToSigungu() {
        return toSigungu;
    }

    public int getToDong() {
        return toDong;
    }

    public int getFromCity() {
        return fromCity;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getFromDong() {
        return fromDong;
    }

    @Override
    public String toString() {
        return "TransferHistory{" +
                "moveInCity=" + toCity +
                ", moveInState=" + toSigungu +
                ", moveInAddress=" + toDong +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", moveOutCity=" + fromCity +
                ", moveOutState=" + fromSido +
                ", moveOutAddress=" + fromDong +
                '}';
    }
}