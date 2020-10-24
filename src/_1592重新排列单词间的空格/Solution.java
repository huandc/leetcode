package _1592重新排列单词间的空格;

import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个字符串 text ，该字符串由若干被空格包围的单词组成。每个单词由一个或者多个小写英文字母组成，
 * 并且两个单词之间至少存在一个空格。题目测试用例保证 text 至少包含一个单词 。
 *
 * 请你重新排列空格，使每对相邻单词之间的空格数目都 相等 ，并尽可能 最大化 该数目。
 * 如果不能重新平均分配所有空格，请 将多余的空格放置在字符串末尾 ，
 * 这也意味着返回的字符串应当与原 text 字符串的长度相等。
 *
 * 返回 重新排列空格后的字符串 。
 *

 * 输入：text = "  this   is  a sentence "
 * 输出："this   is   a   sentence"
 * 解释：总共有 9 个空格和 4 个单词。可以将 9 个空格平均分配到相邻单词之间，相邻单词间空格数为：9 / (4-1) = 3 个。
 */
public class Solution {
    public static void main(String[] args) {
        reorderSpaces(" hello");
//        reorderSpaces("  this   is  a sentence ");
//        reorderSpaces(" practice   makes   perfect");
//        reorderSpaces("hello   world");
//        reorderSpaces("a");
    }
    public static String reorderSpaces(String text) {








        List<String> ls =new LinkedList<>();
        StringBuilder temp = new StringBuilder();
        int blank_count = 0; //空格的数量
        int word_count = 0; //单词数量
        boolean flag = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' '){
                blank_count++;
                if (temp.length()>0)
                {
                    word_count++;
                    ls.add(temp.toString());
                    temp.delete(0,temp.length());
                }
                flag=true;
            }else {
                if (flag){
                    temp.append(text.charAt(i));
                }
            }

        }
        System.out.println("ls.size"+ls.size());
        System.out.println("balnk_cont"+blank_count);
        System.out.println("word_cont"+word_count);



        text="";
        int pre =  0;
        int retain = 0;
        if((word_count-1)!=0) pre=blank_count/(word_count-1);
        if((word_count-1)!=0) retain = blank_count-pre*(word_count-1);
        else retain = blank_count;

//        System.out.println(blank_count+" "+word_count+" "+pre+"  "+retain);
        int i;
        for (i = 0; i < ls.size()-1; i++) {
            text += ls.get(i);
            for (int i1 = 0; i1 < pre; i1++) {
                text +=" ";
            }
        }
        text += ls.get(i);
        for (int i1 = 0; i1 < retain; i1++) {
            text +=" ";
        }


        System.out.println(text);



        return text;

    }
}

