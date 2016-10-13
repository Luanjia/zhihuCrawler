package cn.edu.njust.util;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by luanjia on 16-10-13.
 */
public class ZhihuUtil {
    /**
     * 得到网页中的所有链接
     *
     * @return
     */
    public static LinkedList<String> getAllLinks(String url) {
        LinkedList<String> linkedList = new LinkedList<String>();
        Document doc = new Clrawler().getHtml(url);

        Elements links = doc.select("a[href]");
//        System.out.println(links);

        for (Element link : links) {
            String realLink = link.attr("abs:href");
//            System.out.println(realLink);       //网页中所有的链接
            linkedList.add(realLink);
        }
        return linkedList;
    }

    /**
     * 得到知乎问题形式的链接
     * https://www.zhihu.com/question/12312312
     * https://www.zhihu.com/question/51469748#answer-45917822
     *
     * @param url
     * @return
     */
    public static String getQuestionUrl(String url) {
        String questionUrl = null;
//        Pattern pattern = Pattern.compile("https://www.zhihu.com/question/(.+?)#answer-(.+?)");
        Pattern pattern = Pattern.compile("https://www.zhihu.com/question/(.+?)#answer-(.+?)");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            questionUrl = "https://www.zhihu.com/question/" + matcher.group(1);
//            System.out.println(matcher.group(1));
        }

        return questionUrl;
    }

    public static boolean getRealUrl(String url, String zhihuUrl) {
        // 将http://www.zhihu.com/question/22355264/answer/21102139
        // 转化成http://www.zhihu.com/question/22355264
        // 否则不变
        Pattern pattern = Pattern.compile("question/(.*?)/");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            zhihuUrl = "http://www.zhihu.com/question/" + matcher.group(1);
        } else {
            return false;
        }
        return true;
    }

}
