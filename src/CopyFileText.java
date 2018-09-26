import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        try {
            CopyFileText resource = new CopyFileText();
            String line = resource.readFileText("F:/resource.txt");
            File target = new File("F:/target.txt");
            FileWriter fw = new FileWriter(target);
            fw.write(line);
            fw.close();
            System.out.println(fw);
        } catch (Exception e) {
            System.err.println("WTF");
        }


    }

    public String readFileText(String filePath) throws Exception {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";

        while ((line = br.readLine()) != null) {
            System.out.print(line + " ");
        }
        br.close();
        return line;
    }
}