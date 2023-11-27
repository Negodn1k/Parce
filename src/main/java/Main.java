import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println();
        Document doc = Jsoup.connect("https://161.ru/text/criminal/2023/11/23/72945065/").userAgent("Mozilla/5.0").referrer("http://www.google.com").get();
        Elements list = doc.select(".central-column-container");
        list = list.select(".qQq9J");
        for (Element element : list.select("p")) {
            System.out.println(element.text());
        }
    }
}
