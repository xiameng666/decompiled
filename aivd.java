import java.util.concurrent.atomic.AtomicReference;

public final class aivd implements glzn {
    public final aivp a;
    public final AtomicReference b;
    public final gfsx c;
    public final int d;

    public aivd(aivp aivp0, int v, AtomicReference atomicReference0, gfsx gfsx0) {
        this.a = aivp0;
        this.d = v;
        this.b = atomicReference0;
        this.c = gfsx0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v1;
        int v = ((ajam)object0).b - 1;
        if(((ajam)object0).b == 0) {
            throw null;
        }
        switch(v) {
            case 1: {
                v1 = 2;
                break;
            }
            case 2: {
                v1 = 9;
                break;
            }
            default: {
                v1 = 1;
            }
        }
        aivp aivp0 = this.a;
        ProtoLiteBuilder hftp0 = aivp0.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((wum)hftp0.b_message).c = v1 - 1;
        ((wum)hftp0.b_message).b |= 1;
        this.b.set(((ajam)object0));
        return glzd.f(gmbt.h(gmbx.a), new aivk(this.c), aivp0.f);
    }
}

