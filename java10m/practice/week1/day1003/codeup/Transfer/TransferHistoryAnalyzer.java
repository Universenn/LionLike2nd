package lionlike.java10m.practice.week1.day1003.codeup.Transfer;


import java.util.ArrayList;
import java.util.List;

public class TransferHistoryAnalyzer {
    private List<TransferHistory> transferHistories;

    public TransferHistoryAnalyzer(List<TransferHistory> transferHistories) {
        this.transferHistories = transferHistories;
    }

    public List<TransferHistory> getTransferHistoriesByCity(int fromCity, int toCity) {
        List<TransferHistory> result = new ArrayList<>();
        for (TransferHistory transferHistory : this.transferHistories) {
            if (transferHistory.getFromCity() == fromCity && transferHistory.getToCity() == toCity) {
                result.add(transferHistory);
            }
        }
        return result;
    }

    public int getTransferHistoriesCountByCity(int fromCity, int toCity) {
        return TransferCounter.getCounter()[fromCity][toCity];
    }


    public void populationTransferCity() {
        int fromCity = 0;
        int toCity = 0;
        int maxCount = -1;
        for (int i = 0; i < TransferCounter.getCounter().length; i++) {
            for (int j = 0; j < TransferCounter.getCounter()[i].length; j++) {
                if (maxCount < TransferCounter.getCounter()[i][j]) {
                    maxCount = TransferCounter.getCounter()[i][j];
                    fromCity = i;
                    toCity = j;
                }
            }
        }
        System.out.printf("가장 많은 전입전출\n전출 도시 : %d\n전입 도시 : %d\n", fromCity, toCity);
    }
}