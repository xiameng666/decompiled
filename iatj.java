import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

public final class iatj extends iats {
    public static final ByteBuffer a;
    @Deprecated
    static final iakp b;
    public static final iakp c;
    public final String d;
    public final String e;
    public final ibfn f;
    public final Executor g;
    public final iaof_metadata h;
    public final iatm i;
    public final Runnable j;
    public BidirectionalStream k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public final iati o;
    public iatd p;
    private final iath u;

    static {
        iatj.a = ByteBuffer.allocateDirect(0);
        iatj.b = new iakp("cronet-annotation", null);
        iatj.c = new iakp("cronet-annotations", null);
    }

    public iatj(String s, String s1, Executor executor0, iaof_metadata iaof0, iatm iatm0, Runnable runnable0, Object object0, gRPCMethodDescriptor iaoj0, ibfn ibfn0, iakq iakq0, ibfu ibfu0) {
        super(new iato(), ibfn0, ibfu0, iaof0, iakq0);
        this.u = new iath(this);
        this.d = s;
        this.e = s1;
        this.f = ibfn0;
        this.g = executor0;
        gftb.z(iaof0, "headers");
        this.h = iaof0;
        this.i = iatm0;
        this.j = runnable0;
        this.l = iaoj0.type_ == gRPCMethodType.a;
        this.m = iakq0.j(iatj.b);
        this.n = (Collection)iakq0.j(iatj.c);
        this.o = new iati(this, ibfn0, object0, ibfu0);
        this.f();
    }

    @Override  // iauy
    public final iakk a() {
        return iakk.a;
    }

    @Override  // iats
    protected final iatq p() {
        return this.u;
    }

    @Override  // iats
    protected final iatv q() {
        return this.o;
    }

    public final void r(iapk iapk0) {
        this.i.a(this, iapk0);
    }

    public final void s(ByteBuffer byteBuffer0, boolean z, boolean z1) {
        BidirectionalStream bidirectionalStream0 = this.k;
        if(bidirectionalStream0 != null) {
            bidirectionalStream0.write(byteBuffer0, z);
            if(z1) {
                this.k.flush();
            }
        }
    }

    @Override  // iats
    protected final iatv t() {
        return this.o;
    }
}

