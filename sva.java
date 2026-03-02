import java.io.IOException;

public final class sva extends svj {
    @Override  // svj
    public final svi a(svs svs0, byte[] arr_b) {
        int v = svs0.c;
        if(v == 6) {
            if(svs0.d == 0) {
                try(ssv ssv0 = new ssv(arr_b)) {
                    ssw ssw0 = ssv0.a();
                    if(!(ssw0 instanceof ssr)) {
                        throw sxf.h("Missing OID from data field");
                    }
                    if(((ssr)ssw0).e == ssq.a) {
                        return new svb(((ssr)ssw0));
                    }
                    throw sxf.h("OID must not be relative");
                }
                catch(IOException | IllegalStateException unused_ex) {
                    throw sxf.h("Incorrect data");
                }
            }
            v = 6;
        }
        throw sxf.i(Byte.valueOf(((byte)v)), Byte.valueOf(svs0.d));
    }

    @Override  // svj
    public final boolean c(svs svs0) {
        return svs0.f() && svs0.b == -19;
    }

    @Override  // svj
    public final boolean f() {
        return true;
    }
}

