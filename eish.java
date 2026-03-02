final class eish {
    public static final boolean a(String s, gnzv gnzv0) {
        if(s.startsWith("__internal.")) {
            return false;
        }
        if(gnzv0 == gnzv.a) {
            return false;
        }
        String s1 = eipn.d(s);
        hxmk hxmk0 = hxmk.a;
        if(hxmk0.c().n().b.contains(s1)) {
            return false;
        }
        return (gnzv0 == gnzv.j || gnzv0 == gnzv.p || gnzv0 == gnzv.q) && eipv.a(hxmk0.c().p(), s1) ? false : gnzv0 != gnzv.j && gnzv0 != gnzv.q || !hxmk0.c().o().b.contains(s1);
    }
}

