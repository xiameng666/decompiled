public final class sue extends svj {
    @Override  // svj
    public final svi a(svs svs0, byte[] arr_b) {
        return sue.d(svs0, arr_b);
    }

    @Override  // svj
    public final boolean b() {
        return true;
    }

    @Override  // svj
    public final boolean c(svs svs0) {
        return svs0.f() && svs0.b == 0xFFFFFF87 && svs0.c == 0;
    }

    public static final suf d(svs svs0, byte[] arr_b) {
        sxd sxd0;
        boolean z;
        try {
            z = ssg.c(svs0.d);
            sxd0 = new sxd(ssg.a(svs0.d));
        }
        catch(EnumConstantNotPresentException | IllegalArgumentException unused_ex) {
            sxd0 = sxd.a;
            z = false;
        }
        if(svs0.g()) {
            sxd0 = sxd.a;
        }
        return new suf(sxd0, z, arr_b);
    }
}

