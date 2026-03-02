public final class aqbu {
    public static boolean a(amno amno0) {
        return aqbu.c(amno0, hqcx.a.b().a());
    }

    public static boolean b(amno amno0) {
        return aqbu.c(amno0, hqcx.a.b().b());
    }

    private static boolean c(amno amno0, String s) {
        if(!(amno0 instanceof amou)) {
            return false;
        }
        String s1 = ((amou)amno0).b;
        for(Object object0: gfud.e('|').l(s)) {
            if(((String)object0).equals(s1)) {
                return true;
            }
        }
        return false;
    }
}

