package cn.edu.njust.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by luanjia on 16-10-12.
 */
public class GetRegex {
    public static String getString(String regexStr, String contentStr) {
        Pattern pattern = Pattern.compile(regexStr);
        Matcher matcher = pattern.matcher(contentStr);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static boolean isMatched(String regexStr, String contentStr) {
        Pattern pattern = Pattern.compile(regexStr);
        Matcher matcher = pattern.matcher(contentStr);
        if (matcher.find()) {
            return true;
        }
        return false;
    }
}
