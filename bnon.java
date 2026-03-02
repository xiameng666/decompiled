public final class bnon implements gfsi {
    public final gszb a;

    public bnon(gszb gszb0) {
        this.a = gszb0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gtdm gtdm0 = this.a.b == 8 ? ((gtdm)this.a.c) : gtdm.a;
        gsyz gsyz0 = gtdm0.b == 2 ? ((gsyz)gtdm0.c) : gsyz.a;
        fqxm fqxm0 = ((fqzl)object0).j;
        if(fqxm0 == null) {
            fqxm0 = fqxm.a;
        }
        return Boolean.valueOf(((ProtoLiteMessage)gsyz0).equals((fqxm0.d == null ? gsyz.a : fqxm0.d)));
    }
}

