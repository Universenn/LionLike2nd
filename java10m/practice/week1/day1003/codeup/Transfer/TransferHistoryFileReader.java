package lionlike.java10m.practice.week1.day1003.codeup.Transfer;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransferHistoryFileReader {
    private String filename;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    private List<TransferHistory> transferHistoryList;

    public TransferHistoryFileReader(String filename) { // filename 을 받아와 TransferHistoryFileReader 초기화
        this.filename = filename;
        transferHistoryList = new ArrayList<>();
        readFile();
    }

    private TransferHistory nextTransferHistory() throws IOException { // bufferedReader 에서 한 줄을 읽어와 TransferHistory 파싱.
        String line = bufferedReader.readLine();
        return (line != null) ? TransferHistory.parse(line) : null;
    }

    public List<TransferHistory> toList() { // 읽어온 파일을 List<TransferHistory> 로 가져오기.

        if (!isTransferHistoryListEmpty()) return transferHistoryList; // 이미 transferHistoryList 가 존재하면 바로 반환.

        try { // transferHistoryList 가 없으면 진행.
            TransferHistory data;
            while ((data = nextTransferHistory()) != null) { // this.nextTransferHistory 반복
                this.transferHistoryList.add(data);
                TransferCounter.increaseCnt(data.getFromCity(), data.getToCity()); // 인구 이동 회수 증가.
            }
            bufferedReader.close(); // 버퍼리더 종료.
            fileReader.close(); // 파일리더 종료.
        } catch (IOException e) {
            System.out.println("파일 읽기 에러");
        }

        return transferHistoryList;
    }

    private void readFile() {
        try {
            fileReader = new FileReader(filename); // fileReader 초기화
            bufferedReader = new BufferedReader(fileReader); // bufferedReader 초기화.
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }

    private boolean isTransferHistoryListEmpty() {
        return transferHistoryList.size() == 0;
    }

}