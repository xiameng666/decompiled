public final class bpie implements gftc {
    public final fqxm a;

    public bpie(fqxm fqxm0) {
        this.a = fqxm0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        gsyz gsyz0 = ((gszo)object0).c;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        return ((ProtoLiteMessage)gsyz0).equals((this.a.d == null ? gsyz.a : this.a.d));
    }
}

