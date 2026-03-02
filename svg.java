public final class svg extends svj {
    @Override  // svj
    public final svi a(svs svs0, byte[] arr_b) {
        return svg.e(svs0);
    }

    @Override  // svj
    public final boolean b() {
        return true;
    }

    @Override  // svj
    public final boolean c(svs svs0) {
        if(svs0.c()) {
            int v = svs0.b;
            if(v == -91) {
                switch(svs0.c) {
                    case 0: {
                        return true;
                    }
                    case 7: {
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }
            return v == 21 ? svs0.c == 0 : false;
        }
        return false;
    }

    public static final svh e(svs svs0) {
        boolean z = svs0.c == 7;
        int v = svs0.d;
        if(!z && v != 0) {
            throw sxf.i(null, Byte.valueOf(((byte)v)));
        }
        if(svs0.i().length == 0) {
            try {
                return new svh(ssg.a(((byte)v)), z);
            }
            catch(EnumConstantNotPresentException unused_ex) {
                throw sxf.i(null, Byte.valueOf(((byte)v)));
            }
        }
        throw sxf.h("Select GDF must have an empty data field");
    }
}

