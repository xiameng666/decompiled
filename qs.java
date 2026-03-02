import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

public final class qs {
    public final qq a;
    public final List b;
    public final IdentityHashMap c;
    public final List d;
    public final vs e;
    public final xd f;
    private qr g;
    private final int h;

    public qs(qq qq0, qp qp0) {
        this.b = new ArrayList();
        this.c = new IdentityHashMap();
        this.d = new ArrayList();
        this.g = new qr();
        this.a = qq0;
        this.f = new xd();
        this.h = qp0.c;
        vq vq0 = qp0.c == 1 ? new vq() : new vo();
        this.e = vq0;
    }

    public final int a(ss ss0) {
        int v = 0;
        for(Object object0: this.d) {
            if(((ss)object0) == ss0) {
                break;
            }
            v += ((ss)object0).c;
        }
        return v;
    }

    public final qr b(int v) {
        qr qr0 = this.g;
        if(qr0.c) {
            qr0 = new qr();
        }
        else {
            qr0.c = true;
        }
        int v1 = v;
        for(Object object0: this.d) {
            ss ss0 = (ss)object0;
            int v2 = ss0.c;
            if(v2 > v1) {
                qr0.a = ss0;
                qr0.b = v1;
                break;
            }
            v1 -= v2;
        }
        if(qr0.a != null) {
            return qr0;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + v);
    }

    public final ss c(uq uq0) {
        ss ss0 = (ss)this.c.get(uq0);
        if(ss0 != null) {
            return ss0;
        }
        throw new IllegalStateException(a.m(this, uq0, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
    }

    public final void d() {
        tj tj1;
        for(Object object0: this.d) {
            tj tj0 = ((ss)object0).b.d;
            tj1 = tj.c;
            if(tj0 != tj1 && (tj0 != tj.b || ((ss)object0).c != 0)) {
                continue;
            }
            goto label_8;
        }
        tj1 = tj.a;
    label_8:
        qq qq0 = this.a;
        if(tj1 != qq0.d) {
            qq0.f(tj1);
        }
    }

    public final void e(ss ss0, int v, int v1, Object object0) {
        int v2 = v + this.a(ss0);
        this.a.v(v2, v1, object0);
    }

    public final void f(qr qr0) {
        qr0.c = false;
        qr0.a = null;
        qr0.b = -1;
        this.g = qr0;
    }

    public final boolean g() {
        return this.h != 1;
    }
}

