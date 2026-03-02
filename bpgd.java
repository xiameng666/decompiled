public final class bpgd implements gftc {
    public final gfsx a;

    public bpgd(gfsx gfsx0) {
        this.a = gfsx0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        gsyz gsyz0 = ((fqxm)object0).d;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        return ((ProtoLiteMessage)gsyz0).equals(this.a.d());
    }
}

