public final class bnpq implements gftc {
    public final gsyz a;

    public bnpq(gsyz gsyz0) {
        this.a = gsyz0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        gsyz gsyz0 = ((fqxl)object0).c;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        return !((ProtoLiteMessage)gsyz0).equals(this.a);
    }
}

