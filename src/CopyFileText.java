import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("F:/target.txt"));

            writer.write(copyFileText.readFileText("F:/resource.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";

            while ((line = br.readLine()) != null) {
                String string = line;
            }

            br.close();
            return line;
        } catch (IOException e) {
            System.err.println("Wtf");
        }
        return "";
    }

    public void writeFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String needWrite = "";

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(needWrite);
            writer.close();
        } catch (IOException e) {
            System.err.println("wtf");
        }
    }
}
