public class MyString implements IString{

    @Override
    public int f1(String string) {
        int sum = 0;
        String[] arr = string.split("[^0-9]");
        for (String s : arr) {
            if (s.length() > 0) {
                int num = Integer.parseInt(s);
                if (num % 2 != 0) {
                    sum += num;
                }
            }
        }
        return sum;
    }

    @Override
    public String f2(String string) {
        String[] arr = string.split("[^a-zA-Z]");
        String max = "";
        for (String s : arr) {
            if (s.length() > max.length()) {
                max = s;
            }
        }
        if (max.length() == 0) {
            return string;
        }
        return string.replace(max, new StringBuilder(max).reverse().toString());
    }
}
