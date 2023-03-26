import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CSVFileConverter {

    public static void main(String[] args) {
        String filePath = "/Users/kera/Desktop/Test.csv"; // 替換為實際的檔案路徑
        String outputPath = "/Users/kera/Desktop/TestOK.csv"; // 替換為實際的輸出檔案路徑
        String dateColumnName = "上課日期"; // 替換為實際的日期欄位名稱

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

            // 讀取CSV檔案的欄位名稱
            String[] headers = reader.readLine().split(",");
            int dateColumnIndex = -1;

            // 找到日期欄位的索引位置
            for (int i = 0; i < headers.length; i++) {
                if (headers[i].equals(dateColumnName)) {
                    dateColumnIndex = i;
                    break;
                }
            }

            // 如果找不到日期欄位，則拋出錯誤
            if (dateColumnIndex == -1) {
                throw new RuntimeException("找不到欄位：" + dateColumnName);
            }

            // 寫入修改後的欄位名稱到輸出檔案中
            writer.write(String.join(",", headers));
            writer.newLine();

            // 讀取CSV檔案中的每一行，進行日期格式轉換並寫入輸出檔案
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                // 解析日期並轉換格式
                Date date = new SimpleDateFormat("MM/dd").parse(values[dateColumnIndex]);
                String formattedDate = new SimpleDateFormat("MM/dd EEEE").format(date);

                // 將轉換後的日期值寫入輸出檔案
                values[dateColumnIndex] = formattedDate;
                writer.write(String.join(",", values));
                writer.newLine();
            }

            // 關閉檔案串流
            reader.close();
            writer.close();

            System.out.println("CSV檔案轉換完成！");

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

}
