public class CountCharInString {
    String str;

    public CountCharInString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public char find() {
        int[] frequentChar = new int[255];
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);
            frequentChar[ascii] ++;
         }

        int max = 0;
        char charactor = (char) 255;
        for (int j = 1; j < 255; j++) {
                if (max < frequentChar[j]) {
                    max = frequentChar[j];
                    charactor = (char) j;
                }
        }
        return charactor;
    }


}
