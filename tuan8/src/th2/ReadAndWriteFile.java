package th2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("file không tồn tại or nội dung co lỗi");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) throws IOException {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
//        readAndWriteFile.readFile("/Volumes/WorkSpace/Codegym/tuan8/src/th2/ReadAndWriteFile.java");

        List<Integer> numbers = readAndWriteFile.readFile("src/th2/number.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/th2/result.txt", maxValue);
    }
}
