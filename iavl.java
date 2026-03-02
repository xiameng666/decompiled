import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;

public final class iavl extends iatt {
    public int a;
    private static final iavj b;
    private static final iavj c;
    private static final iavj d;
    private static final iavj e;
    private static final iavk f;
    private final Deque g;
    private Deque h;
    private boolean i;

    static {
        iavl.b = new iave();
        iavl.c = new iavf();
        iavl.d = new iavg();
        iavl.e = new iavh();
        iavl.f = new iavi();
    }

    public iavl() {
        new ArrayDeque(2);
        this.g = new ArrayDeque();
    }

    public iavl(int v) {
        new ArrayDeque(2);
        this.g = new ArrayDeque(v);
    }

    @Override  // iatt
    public final void b() {
        if(this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while(!this.h.isEmpty()) {
            ((ibdc)this.h.remove()).close();
        }
        this.i = true;
        ibdc ibdc0 = (ibdc)this.g.peek();
        if(ibdc0 != null) {
            ibdc0.b();
        }
    }

    @Override  // iatt
    public final void c() {
        if(!this.i) {
            throw new InvalidMarkException();
        }
        Deque deque0 = this.g;
        ibdc ibdc0 = (ibdc)deque0.peek();
        if(ibdc0 != null) {
            int v = ibdc0.f();
            ibdc0.c();
            this.a += ibdc0.f() - v;
        }
        ibdc ibdc1;
        while((ibdc1 = (ibdc)this.h.pollLast()) != null) {
            ibdc1.c();
            deque0.addFirst(ibdc1);
            this.a += ibdc1.f();
        }
    }

    @Override  // iatt
    public final void close() {
        while(true) {
            Deque deque0 = this.g;
            if(deque0.isEmpty()) {
                break;
            }
            ((ibdc)deque0.remove()).close();
        }
        if(this.h != null) {
            while(!this.h.isEmpty()) {
                ((ibdc)this.h.remove()).close();
            }
        }
    }

    @Override  // iatt
    public final boolean d() {
        for(Object object0: this.g) {
            if(!((ibdc)object0).d()) {
                return false;
            }
        }
        return true;
    }

    @Override  // ibdc
    public final int e() {
        return this.n(iavl.b, 1, null, 0);
    }

    @Override  // ibdc
    public final int f() {
        return this.a;
    }

    @Override  // ibdc
    public final ibdc g(int v) {
        ibdc ibdc3;
        int v2;
        ibdc ibdc2;
        if(v <= 0) {
            return ibdg.a;
        }
        this.a(v);
        this.a -= v;
        ibdc ibdc0 = null;
        iavl iavl0 = null;
        while(true) {
            Deque deque0 = this.g;
            ibdc ibdc1 = (ibdc)deque0.peek();
            int v1 = ibdc1.f();
            if(v1 > v) {
                ibdc2 = ibdc1.g(v);
                v2 = 0;
            }
            else {
                if(this.i) {
                    ibdc3 = ibdc1.g(v1);
                    this.o();
                }
                else {
                    ibdc3 = (ibdc)deque0.poll();
                }
                v2 = v - v1;
                ibdc2 = ibdc3;
            }
            int v3 = 2;
            if(ibdc0 == null) {
                ibdc0 = ibdc2;
            }
            else {
                if(iavl0 == null) {
                    if(v2 != 0) {
                        v3 = Math.min(deque0.size() + 2, 16);
                    }
                    iavl0 = new iavl(v3);
                    iavl0.h(ibdc0);
                    ibdc0 = iavl0;
                }
                iavl0.h(ibdc2);
            }
            if(v2 <= 0) {
                break;
            }
            v = v2;
        }
        return ibdc0;
    }

    public final void h(ibdc ibdc0) {
        boolean z = this.i && this.g.isEmpty();
        if((ibdc0 instanceof iavl)) {
            while(true) {
                Deque deque0 = ((iavl)ibdc0).g;
                if(deque0.isEmpty()) {
                    break;
                }
                ibdc ibdc1 = (ibdc)deque0.remove();
                this.g.add(ibdc1);
            }
            this.a += ((iavl)ibdc0).a;
            ((iavl)ibdc0).a = 0;
            ((iavl)ibdc0).close();
        }
        else {
            this.g.add(ibdc0);
            this.a += ibdc0.f();
        }
        if(z) {
            ((ibdc)this.g.peek()).b();
        }
    }

    @Override  // ibdc
    public final void i(ByteBuffer byteBuffer0) {
        this.n(iavl.e, byteBuffer0.remaining(), byteBuffer0, 0);
    }

    @Override  // ibdc
    public final void j(OutputStream outputStream0, int v) {
        this.m(iavl.f, v, outputStream0, 0);
    }

    @Override  // ibdc
    public final void k(byte[] arr_b, int v, int v1) {
        this.n(iavl.d, v1, arr_b, v);
    }

    @Override  // ibdc
    public final void l(int v) {
        this.n(iavl.c, v, null, 0);
    }

    private final int m(iavk iavk0, int v, Object object0, int v1) {
        this.a(v);
        Deque deque0 = this.g;
        if(!deque0.isEmpty()) {
            this.p();
        }
        while(v > 0 && !deque0.isEmpty()) {
            ibdc ibdc0 = (ibdc)deque0.peek();
            int v2 = Math.min(v, ibdc0.f());
            v1 = iavk0.a(ibdc0, v2, object0, v1);
            v -= v2;
            this.a -= v2;
            this.p();
        }
        if(v <= 0) {
            return v1;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int n(iavj iavj0, int v, Object object0, int v1) {
        try {
            return this.m(iavj0, v, object0, v1);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    private final void o() {
        if(this.i) {
            this.h.add(((ibdc)this.g.remove()));
            ibdc ibdc0 = (ibdc)this.g.peek();
            if(ibdc0 != null) {
                ibdc0.b();
            }
            return;
        }
        ((ibdc)this.g.remove()).close();
    }

    private final void p() {
        if(((ibdc)this.g.peek()).f() == 0) {
            this.o();
        }
    }
}

