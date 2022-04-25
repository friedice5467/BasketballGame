import org.apache.commons.lang3.ArrayUtils;

public class Sandbox {
    private static String[] strArr = new String[]{"one", "two", "three"};

    public static void main(String[] args) {
        int addPoints = 2;
        int currentPoints = 0;
        int i = 0;

        while(i < 5){
            currentPoints += addPoints;
            i++;
        }
        System.out.println(currentPoints);
    }

    private static String getString() {

        String randomStuff = strArr[(int) (Math.random() * strArr.length)];

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(randomStuff)) strArr = ArrayUtils.remove(strArr, i);
        }
        return randomStuff;
    }

}

