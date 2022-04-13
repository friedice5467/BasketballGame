import org.apache.commons.lang3.ArrayUtils;

public class Sandbox {
    private static String[] strArr = new String[]{"one", "two", "three"};

    public static void main(String[] args) {
        System.out.println("hello world");
    }

    private static String getString() {

        String randomStuff = strArr[(int) (Math.random() * strArr.length)];

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(randomStuff)) strArr = ArrayUtils.remove(strArr, i);
        }
        return randomStuff;
    }

}

