import j..util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

final class fxfr extends fxpd {
    public static final int a;
    private final long b;
    private final long c;
    private final long d;
    private final long i;
    private final Supplier j;
    private final fxdn k;
    private final fxfp l;
    private final Supplier m;
    private final Supplier n;
    private final Supplier o;
    private fxeq p;
    private fxgu q;
    private long r;
    private long s;
    private int t;
    private int u;
    private boolean v;
    private long w;
    private Optional x;

    static {
        bboh.c("EQMon", bbcu.g, "RtRep");
    }

    public fxfr(Supplier supplier0, fxdn fxdn0, fxfp fxfp0, Supplier supplier1, Supplier supplier2, Supplier supplier3) {
        super("RtRep");
        this.b = TimeUnit.SECONDS.toNanos(huwe.a.e().j());
        this.c = TimeUnit.MILLISECONDS.toNanos(huwe.a.e().b());
        this.d = TimeUnit.MILLISECONDS.toNanos(huwe.a.e().d());
        this.i = TimeUnit.MILLISECONDS.toNanos(huwe.a.e().c());
        this.x = Optional.empty();
        this.j = supplier0;
        this.k = fxdn0;
        this.l = fxfp0;
        this.m = supplier1;
        this.n = supplier2;
        this.o = supplier3;
    }

    @Override  // fxpd
    public final void a() {
        this.v = false;
        this.p = (fxeq)this.o.get();
        this.h.i();
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        if(!this.k.a()) {
            fxeq fxeq0 = this.p;
            if(fxeq0 != null) {
                fxeq0.a(((Optional)this.n.get()), fxpi0);
                this.w = this.l.b();
                this.x = Optional.of(fxpi0);
            }
        }
        fxeq fxeq1 = this.p;
        if(fxeq1 != null) {
            fxeq1.d();
            this.p = null;
        }
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        if(this.p != null && !this.v) {
            switch(fxpj0.a) {
                case 7: {
                    this.q = (fxgu)fxpj0.b;
                    return false;
                }
                case 8: {
                    fxgu fxgu0 = (fxgu)fxpj0.b;
                    this.q = fxgu0;
                    if(this.u == 0) {
                        long v = fxgu0.a - this.c;
                        this.s = v;
                        ++this.t;
                        this.e(v);
                        return false;
                    }
                    break;
                }
                case 12: {
                    this.e(this.r);
                    return true;
                }
                case 17: {
                    long v1 = 0L;
                    Optional optional0 = Optional.of(new fxfq(this));
                    if(this.p != null) {
                        if(this.w != 0L) {
                            v1 = this.l.b() - this.w;
                        }
                        this.p.b(((fxob)this.j.get()).b.b, ((Optional)this.n.get()), optional0, v1, this.x);
                        return false;
                    }
                    break;
                }
                case 24: {
                    this.v = true;
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    private final void e(long v) {
        gxny gxny0;
        double f1;
        Object object1;
        long v11;
        long v10;
        int v9;
        long v8;
        long v7;
        ProtoLiteBuilder hftp0;
        int v5;
        int v4;
        long v3;
        long v2;
        ++this.u;
        long v1 = this.l.a(this.q.a);
        fxfo fxfo0 = this.l.c(v1);
        gxnz gxnz0 = (gxnz)this.m.get();
        if(gxnz0 == null) {
            v2 = 0x7FFFFFFFFFFFFFFFL;
        }
        else {
            Object object0 = gxnz0.g;
            __monitor_enter(object0);
            try {
                fvrw fvrw0 = gxnz0.a;
                if(fvrw0.e()) {
                    goto label_78;
                }
                else {
                    v3 = v - gxnz0.j;
                    v4 = fvrw0.c(v3);
                    v5 = fvrw0.c - 1;
                    if(v4 == -1) {
                        v3 = fvrw0.d(0);
                        v4 = 0;
                    }
                    hftp0 = ((ProtoLiteMessage)gxoj.a).v_newBuilder();
                    int v6 = gxnz0.e;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gxoj)hftv0).b = v6;
                    double f = gxnz0.f;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gxoj)hftp0.b_message).c = f;
                    v7 = 1000000000L / ((long)v6);
                    v8 = v3;
                    while(true) {
                    label_29:
                        if(v4 > v5) {
                            object1 = object0;
                            gxny0 = new gxny(((gxoj)hftp0.N_build()), v3 + gxnz0.j, v8 + gxnz0.j);
                            break;
                        }
                        v9 = v4 == v5 ? v4 : v4 + 1;
                        v10 = fvrw0.d(v4);
                        v11 = fvrw0.d(v9);
                        goto label_33;
                    }
                }
                goto label_84;
            }
            catch(Throwable throwable0) {
                object1 = object0;
                goto label_87;
            }
            while(true) {
            label_33:
                if(v8 < v10 || v8 > v11) {
                    goto label_70;
                }
                if(v11 == v10) {
                    object1 = object0;
                    f1 = 0.0;
                }
                else {
                    object1 = object0;
                    f1 = ((double)(v8 - v10)) / ((double)(v11 - v10));
                }
                try {
                    int v12 = gxnz0.a(v4, v9, 0, f1);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gxoj gxoj0 = (gxoj)hftp0.b_message;
                    hfuf hfuf0 = gxoj0.d;
                    if(!hfuf0.c()) {
                        gxoj0.d = ProtoLiteMessage.C(hfuf0);
                    }
                    gxoj0.d.i(v12);
                    int v13 = gxnz0.a(v4, v9, 1, f1);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gxoj gxoj1 = (gxoj)hftp0.b_message;
                    hfuf hfuf1 = gxoj1.e;
                    if(!hfuf1.c()) {
                        gxoj1.e = ProtoLiteMessage.C(hfuf1);
                    }
                    gxoj1.e.i(v13);
                    int v14 = gxnz0.a(v4, v9, 2, f1);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gxoj gxoj2 = (gxoj)hftp0.b_message;
                    hfuf hfuf2 = gxoj2.f;
                    if(!hfuf2.c()) {
                        gxoj2.f = ProtoLiteMessage.C(hfuf2);
                    }
                    gxoj2.f.i(v14);
                    v8 += v7;
                    v5 = v5;
                    v4 = v4;
                    hftp0 = hftp0;
                    object0 = object1;
                    continue;
                label_70:
                    ++v4;
                    v5 = v5;
                    hftp0 = hftp0;
                    object0 = object0;
                    goto label_29;
                }
                catch(Throwable throwable0) {
                    goto label_87;
                }
            }
            try {
            label_78:
                gxny0 = null;
                object1 = object0;
            }
            catch(Throwable throwable0) {
                object1 = object0;
                goto label_87;
            }
            try {
            label_84:
                __monitor_exit(object1);
                goto label_89;
            label_87:
                __monitor_exit(object1);
            }
            catch(Throwable throwable0) {
                goto label_87;
            }
            throw throwable0;
        label_89:
            if(gxny0 == null) {
                v2 = 0x7FFFFFFFFFFFFFFFL;
            }
            else {
                cnwf.d(this.q.a / 1000000L);
                v2 = gxny0.c;
                gxoj gxoj3 = gxny0.a;
                long v15 = this.l.a(gxny0.b);
                fxfo fxfo1 = this.l.c(v15);
                fxeq fxeq0 = this.p;
                if(fxeq0 != null) {
                    fxeq0.c(fxfo1, gxoj3, fxfo0, ((Optional)this.n.get()), this.t, this.u);
                }
            }
        }
        this.r = v2;
        long v16 = v2 - this.s;
        long v17 = v2 - this.q.a;
        long v18 = this.i;
        if(Long.compare(v17, v18) >= 0) {
            this.u = 0;
            this.h.d(18);
            return;
        }
        long v19 = this.d;
        if(Long.compare(v17, v19) >= 0) {
            long v20 = v18 - v17;
            if(v16 + v20 > this.b) {
                this.u = 0;
                this.h.d(18);
                return;
            }
            this.h.f(12, null, v20 / 1000000L);
            return;
        }
        if(v16 + v19 > this.b) {
            this.u = 0;
            this.h.d(18);
            return;
        }
        this.h.f(12, null, v19 / 1000000L);
    }

    private final void f(long v) {
    }
}

