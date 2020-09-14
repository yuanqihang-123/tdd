import jdk.nashorn.internal.ir.ReturnNode;

public class Mommy {

    public String insertMommy(String str) throws Exception {
        if (str == null) throw new Exception();
        if (str.equals("")) return "";
        if (Mommy.percentageCount(str) <= 0.3) {
            return str;
        } else if (getFirstDoubleVowelIndex(str) == -1) {
            //说明不连续
            return str;
        }else {
            int index = getFirstDoubleVowelIndex(str);
            StringBuffer stringBuffer = new StringBuffer(str);
            stringBuffer.insert(index+1,"mommy");
            return insertMommy(stringBuffer.toString());
        }


    }


    public static float percentageCount(String str) {
//        String str = "BeginnersBook";
        int vcount = 0;

        //converting all the chars to lowercase
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            }
        }
        return  (float)vcount / (float) str.length();
    }

    public static int getFirstDoubleVowelIndex(String str) {
        char[] chars = str.toCharArray();
//        双元音的起始index
        char temp = ' ';
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                //看当前字符是否和上一个相等
                if (chars[i] == temp) {
                    return i - 1;
                }
                //记录下当前的字符
                temp = chars[i];
            }
        }
        return -1;
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }
}
