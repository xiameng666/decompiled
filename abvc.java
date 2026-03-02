import com.google.android.gms.icing.nativeindex.NativeIndex;
import j..util.Objects;

final class abvc extends bwzp {
    final String[] a;
    final abve b;

    public abvc(abve abve0, gltq gltq0, String s, String[] arr_s) {
        this.a = arr_s;
        Objects.requireNonNull(abve0);
        this.b = abve0;
        super(gltq0, 2, s);
    }

    @Override  // bwzp
    public final Object a() {
        bwmx bwmx0 = this.b.a;
        bwuc bwuc0 = bwmx0.l;
        if(bwuc0 != null) {
            NativeIndex nativeIndex0 = bwmx0.m;
            if(nativeIndex0 != null) {
                String[] arr_s = this.a;
                for(int v = 0; v < arr_s.length; ++v) {
                    bwua bwua0 = bwuc0.e(arr_s[v]);
                    bxax bxax0 = bwua0.d;
                    String s = bwua0.b;
                    synchronized(bxax0.h) {
                        bwpo bwpo0 = bxax0.l(s);
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)bwpo0));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        bwpo.b(((bwpo)hftp0.b_message));
                        bxax0.A(s, ((bwpo)hftp0.N_build()));
                    }
                    bwmx0.K(bwua0);
                }
                bwpz bwpz0 = nativeIndex0.j();
                if(bwmx0.h != null && bwpz0 != null && bwqf.g(bwpz0)) {
                    bwmx0.g();
                }
            }
        }
        return null;
    }
}

