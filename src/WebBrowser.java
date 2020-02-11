import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by BALLEXBALLAMANDER on 2020-02-11.
 */
public class WebBrowser {
    public static void main(String[] args) {
        String url = JOptionPane.showInputDialog(null, "where?","The Ultimate Textbrowser",JOptionPane.QUESTION_MESSAGE);
        int index;
        try {
            URL resource = new URL(url);
            Scanner urlScanner = new Scanner(resource.openStream());
            while (urlScanner.hasNext()) {
                if (urlScanner.nextLine().contains("href")) {
                    index = urlScanner.nextLine().indexOf("\"");

                }
                System.out.println(urlScanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}