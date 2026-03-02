public final class fxgg implements fxfh {
    public final fxdq a;

    public fxgg(fxdq fxdq0) {
        this.a = fxdq0;
    }

    @Override  // fxfh
    public final String a(String s, ByteString hfsf0) {
        ggeo ggeo0 = ggeo.l(s, bbmu.a(hfsf0.toByteArray()));
        fxdq fxdq0 = this.a;
        if(fxdq0.c == null) {
            fxdq0.c = (bhnd)fxdq0.a.get();
        }
        if(fxdq0.c != null && fxdq0.c.b()) {
            String s1 = fxdq0.c.a(ggeo0);
            fxdq0.d = (long)(((Long)fxdq0.b.get()));
            fxdq0.e();
            return s1;
        }
        return "";
    }
}

