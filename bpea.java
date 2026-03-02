public final class bpea implements gftc {
    public final gfsx a;

    public bpea(gfsx gfsx0) {
        this.a = gfsx0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        gsyz gsyz0 = ((gszo)object0).c;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        return ((ProtoLiteMessage)gsyz0).equals(this.a.d());
    }
}

