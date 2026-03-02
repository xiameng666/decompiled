public final class stv extends svj {
    @Override  // svj
    public final svi a(svs svs0, byte[] arr_b) {
        int v = svs0.c;
        if(v == 12) {
            if(svs0.d == 3) {
                return new stw(arr_b);
            }
            v = 12;
        }
        throw sxf.i(Byte.valueOf(((byte)v)), Byte.valueOf(svs0.d));
    }

    @Override  // svj
    public final boolean b() {
        return true;
    }

    @Override  // svj
    public final boolean c(svs svs0) {
        return svs0.f() && svs0.b == 65;
    }
}

