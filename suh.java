public final class suh extends svj {
    @Override  // svj
    public final svi a(svs svs0, byte[] arr_b) {
        ste ste0;
        ssg ssg0;
        int v;
        try {
            v = svs0.d;
            ssg0 = ssg.a(((byte)v));
        }
        catch(EnumConstantNotPresentException unused_ex) {
            throw sxf.h(("Invalid key reference: " + str.a(((byte)v))));
        }
        try {
            ste0 = ste.a(arr_b);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw sxf.h(("Authentication template malformed: " + illegalArgumentException0.getMessage()));
        }
        boolean z = ssg0 == ssg.G || ssg.c(svs0.d);
        int v1 = svs0.c;
        switch(v1) {
            case 0xFFFFFF82: {
                return new sum(ssg0, z, ste0);
            }
            case 1: {
                return new sui(ssg0, z, ste0);
            }
            default: {
                if(v1 == 2) {
                    return new suk(ssg0, z, ste0);
                }
                throw sxf.g("BUG: Disagreement between AKE types");
            }
        }
    }

    @Override  // svj
    public final boolean b() {
        return true;
    }

    @Override  // svj
    public final boolean c(svs svs0) {
        return !svs0.d() || svs0.b != 0xFFFFFF87 ? false : svs0.c == 0xFFFFFF82 || svs0.c == 1 || svs0.c == 2;
    }
}

