import j..util.Objects;

final class abvd extends bwzp {
    final String[] a;
    final abve b;

    public abvd(abve abve0, gltq gltq0, String s, String[] arr_s) {
        this.a = arr_s;
        Objects.requireNonNull(abve0);
        this.b = abve0;
        super(gltq0, 2, s);
    }

    @Override  // bwzp
    public final Object a() {
        bwuc bwuc0 = this.b.a.l;
        if(bwuc0 != null) {
            String[] arr_s = this.a;
            for(int v = 0; v < arr_s.length; ++v) {
                bwua bwua0 = bwuc0.f(arr_s[v]);
                if(bwua0 != null) {
                    String s = bwua0.b;
                    bxax bxax0 = bwua0.d;
                    synchronized(bxax0.h) {
                        bwpo bwpo0 = bxax0.l(s);
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)bwpo0));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        bwpo bwpo1 = (bwpo)hftp0.b_message;
                        bwpo1.b &= -3;
                        bwpo1.d = false;
                        bxax0.A(s, ((bwpo)hftp0.N_build()));
                    }
                }
            }
        }
        return null;
    }
}

