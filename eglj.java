public final class eglj {
    public static boolean a(String s) {
        if(hxba.j()) {
            hfuo hfuo0 = hxba.a.e().m().b;
            return hfuo0.contains(s) ? true : hfuo0.contains("com.google.android.gms") && bbmq.X(s);
        }
        return true;
    }

    public static boolean b(String s) {
        if(hxba.k()) {
            return hxba.a.e().ai() ? hxba.a.e().p().b.contains(s) : hxba.a.e().n().b.contains(s);
        }
        return true;
    }

    public static int c(String s) {
        return ehji.c(s, null, 2);
    }
}

