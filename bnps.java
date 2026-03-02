public final class bnps implements gftc {
    public final gsyz a;

    public bnps(gsyz gsyz0) {
        this.a = gsyz0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        gsyz gsyz0 = ((fqxl)object0).c;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        return ((ProtoLiteMessage)this.a).equals(gsyz0);
    }
}

