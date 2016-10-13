package cn.edu.njust.util;

import cn.edu.njust.entity.ZhihuCookie;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by luanjia on 16-10-12.
 */
public  class Clrawler {
    public static Document getHtml(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url)
                    .timeout(3000)      //设置连接超时时间
                    .cookies(ZhihuCookie.getZhihuCookie())
//                    .post();  // 使用 POST 方法访问 URL
                    .get();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }


}
