package suyp.demo.utils;

import com.alibaba.fastjson.JSONArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

    /*auther:suyp
    *正则表达式封装
    * @param text  被正则的文本
    * @param regEx 正则参数
    * @return 正则获取的参数列
    * */
    public static JSONArray getRegexList(String text, String regEx) {
        JSONArray ja = new JSONArray();
        Pattern pat = Pattern.compile(regEx);
        Matcher mat = pat.matcher(text);
        boolean rs = mat.find();
        for (int i = 1; i <= mat.groupCount(); i++) {
            ja.add(mat.group(i));
            //System.out.println(mat.group(i));
        }
        return ja;
    }
}
