public final class brbk implements bqss {
    @Override  // bqss
    public final Object a(Object object0, Object object1) {
        String s = (String)object0;
        ggeo ggeo0 = (ggeo)object1;
        try {
            return ggeo.k(ggkm.n(brbm.b.a(s), new brbl()));
        }
        catch(IllegalArgumentException unused_ex) {
            ((ggtj)brbm.a.j()).B("Malformed flag value (continuing with default): %s", s);
            return ggnf.a;
        }
    }
}

