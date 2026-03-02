import j..util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;

final class iati extends iayk {
    public final Object a;
    public final Collection b;
    public boolean c;
    public boolean d;
    public iapk e;
    public boolean f;
    public boolean g;
    final iatj h;
    public static final int i;
    private int u;

    public iati(iatj iatj0, ibfn ibfn0, Object object0, ibfu ibfu0) {
        Objects.requireNonNull(iatj0);
        this.h = iatj0;
        super(0x400000, ibfn0, ibfu0);
        this.b = new ArrayList();
        this.d = false;
        this.a = object0;
    }

    @Override  // ibbt
    public final void a(int v) {
        iatj iatj0 = this.h;
        gftb.z(iatj0.k, "stream must not be null");
        int v1 = this.u - v;
        this.u = v1;
        if(v1 == 0 && !this.f) {
            iatj0.k.read(ByteBuffer.allocateDirect(0x1000));
        }
    }

    @Override  // ibbt
    public final void b(Throwable throwable0) {
        this.c(iapk.d(throwable0), true, new iaof_metadata());
    }

    @Override  // iayk
    protected final void c(iapk iapk0, boolean z, iaof_metadata iaof0) {
        gftb.z(this.h.k, "stream must not be null");
        this.h.k.cancel();
        this.l(iapk0, z, iaof0);
    }

    @Override  // iatv
    protected final void d() {
        super.d();
    }

    @Override  // iaty
    public final void e(Runnable runnable0) {
        synchronized(this.a) {
            runnable0.run();
        }
    }

    static void f(iati iati0, ByteBuffer byteBuffer0) {
        iati0.u += byteBuffer0.remaining();
        iati0.super.n(new ibdf(byteBuffer0), false);
    }
}

