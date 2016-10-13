package cn.edu.njust.test;

import cn.edu.njust.util.Clrawler;
import cn.edu.njust.util.ZhihuUtil;
import org.jsoup.nodes.Document;
import org.junit.Test;

/**
 * Created by luanjia on 16-10-12.
 */
public class TestGetHtml {
    @Test
    public void getZhihuHtml() {
        Clrawler clrawler = new Clrawler();

        String url = "https://www.zhihu.com";
        Document document = clrawler.getHtml(url);
        String title = document.title();
        System.out.println(title);
    }

    @Test
    public  void  testQuestion(){
        String url = "https://www.zhihu.com/question/51542217#answer-46040677";
        String zhihuurl = ZhihuUtil.getQuestionUrl(url);
        System.out.println(zhihuurl);

    }
}
