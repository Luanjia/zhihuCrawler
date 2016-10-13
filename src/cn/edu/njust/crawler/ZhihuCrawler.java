package cn.edu.njust.crawler;

import cn.edu.njust.entity.Zhihu_body;
import cn.edu.njust.util.Clrawler;
import cn.edu.njust.util.ZhihuUtil;
import org.jsoup.nodes.Document;
import java.util.LinkedList;

/**
 * Created by luanjia on 16-10-12.
 */
public class ZhihuCrawler {
    public void spdier() {
//        String url = "https://www.zhihu.com/question/48291673/answer/125842890";
        String url = "https://www.zhihu.com/";
        LinkedList<String> links = ZhihuUtil.getAllLinks(url);    //得到网页中的所有链接

        for (String link : links) {
            String questionUrl = null;      //知乎问题形式的链接
            if ((questionUrl = ZhihuUtil.getQuestionUrl(link)) != null) {
                this.getDetails(questionUrl);
            }
        }
    }

    public void getDetails(String url) {
        Document doc = Clrawler.getHtml(url);
        Zhihu_body zhihu = new Zhihu_body();

        zhihu.setQuestionTtitle(doc.select("h2.zm-item-title").first().text());
        zhihu.setQuestionDetail(doc.select("div.zm-editable-content").text());
        zhihu.setAnswer(doc.select("div.zm-editable-content.clearfix").text());
        System.out.println("问题:" + zhihu.getQuestionTtitle());
        System.out.println("问题描述:" + zhihu.getQuestionDetail());
    }

    public static void main(String[] args) {
        ZhihuCrawler zhihuCrawler = new ZhihuCrawler();
        zhihuCrawler.spdier();
    }
}
