import java.nio.charset.StandardCharsets;

public final class ckdg {
    public static long a(String s) {
        ghfz ghfz0 = ghft.a;
        if(s.startsWith("http://")) {
            return ghfz0.c(ckdg.c(s.substring(7)), StandardCharsets.UTF_8).c();
        }
        if(s.startsWith("https://")) {
            s = s.substring(8);
        }
        return ghfz0.c(ckdg.c(s), StandardCharsets.UTF_8).c();
    }

    public static String b(String s) {
        String s1 = ckdg.c(s);
        int v = s1.indexOf("|");
        if(v > 0) {
            s1 = s1.substring(0, v);
        }
        int v1 = s1.indexOf("://");
        if(v1 > 0) {
            s1 = s1.substring(v1 + 3);
        }
        int v2 = s1.indexOf("/");
        if(v2 > 0) {
            s1 = s1.substring(0, v2);
        }
        int v3 = s1.indexOf(":");
        if(v3 > 0) {
            s1 = s1.substring(0, v3);
        }
        return s1.substring(s1.lastIndexOf(".", s1.lastIndexOf(".") - 1) + 1);
    }

    private static String c(String s) {
        return s.contains("?") ? s.substring(0, s.indexOf("?")) : s;
    }
}

