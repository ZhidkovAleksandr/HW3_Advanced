package task3;

public class Main {
    public static void main(String[] args) {
        String citation = "L’homme est né libre,et partout il est dans les fers";
        String [] ar = citation.split(",");

        for (String e:ar) {
            System.out.println(e);
        }
    }
}
