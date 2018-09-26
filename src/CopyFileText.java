import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        try {
            CopyFileText resource = new CopyFileText();
            System.out.println("Chau no truoc khi copy a.");
            String line = resource.readFileText("F:/resource.txt");
            File target = new File("F:/target.txt");
            FileWriter fw = new FileWriter(target);
            fw.write(line);
            fw.close();
            System.out.println("Sau day la file text da duoc copy: ");
            String readTarget = resource.readFileText("F:/target.txt");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public String readFileText(String filePath) throws Exception {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        String s = "";

        while ((line = br.readLine()) != null) {
            s += (line + " ");
        }
        System.out.println(s);
        br.close();
        return s;
    }
}