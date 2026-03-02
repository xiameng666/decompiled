import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;

public final class ibbw implements iavr, Closeable {
    public ibbt a;
    public int b;
    public ialt c;
    public iavl d;
    public long e;
    public boolean f;
    public volatile boolean g;
    private final ibfn h;
    private final ibfu i;
    private int j;
    private boolean k;
    private iavl l;
    private boolean m;
    private int n;
    private int o;
    private int p;

    public ibbw(ibbt ibbt0, ialt ialt0, int v, ibfn ibfn0, ibfu ibfu0) {
        this.p = 1;
        this.j = 5;
        this.d = new iavl();
        this.m = false;
        this.n = -1;
        this.f = false;
        this.g = false;
        this.a = ibbt0;
        this.c = ialt0;
        this.b = v;
        this.h = ibfn0;
        this.i = ibfu0;
    }

    public final void a() {
        ibdd ibdd0;
        int v;
        if(this.m) {
            return;
        }
        this.m = true;
        while(true) {
            if(this.e <= 0L) {
                goto label_79;
            }
            try {
                if(this.l == null) {
                    this.l = new iavl();
                }
                v = 0;
            }
            catch(Throwable throwable0) {
                try {
                    v = 0;
                    goto label_20;
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            try {
                while(true) {
                    int v1 = this.j - this.l.a;
                    if(v1 <= 0) {
                        goto label_32;
                    }
                    int v2 = this.d.a;
                    if(v2 == 0) {
                        goto label_26;
                    }
                    int v3 = Math.min(v1, v2);
                    v += v3;
                    this.l.h(this.d.g(v3));
                }
            }
            catch(Throwable throwable0) {
            }
            try {
            label_20:
                if(v > 0) {
                    this.a.a(v);
                    if(this.p == 2) {
                        this.h.b(((long)v));
                        this.o += v;
                    }
                }
                throw throwable0;
            label_26:
                if(v > 0) {
                    this.a.a(v);
                    if(this.p == 2) {
                        this.h.b(((long)v));
                        this.o += v;
                        goto label_79;
                    label_32:
                        if(v > 0) {
                            this.a.a(v);
                            if(this.p == 2) {
                                this.h.b(((long)v));
                                this.o += v;
                            }
                        }
                        int v4 = this.p;
                        if(v4 == 0) {
                            throw null;
                        }
                        switch(v4 - 1) {
                            case 0: {
                                int v5 = this.l.e();
                                if((v5 & 0xFE) != 0) {
                                    throw new iapn(iapk.p.f("gRPC frame header malformed: reserved bits not zero"));
                                }
                                this.k = 1 == (v5 & 1);
                                iavl iavl0 = this.l;
                                iavl0.a(4);
                                int v6 = iavl0.e();
                                int v7 = iavl0.e();
                                int v8 = iavl0.e();
                                int v9 = iavl0.e() | (v6 << 24 | v7 << 16 | v8 << 8);
                                this.j = v9;
                                if(v9 < 0 || v9 > this.b) {
                                    throw new iapn(iapk.k.f(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", ((int)this.b), ((int)this.j))));
                                }
                                ++this.n;
                                this.i.h.a();
                                this.i.i = this.i.b.a();
                                this.p = 2;
                                break;
                            }
                            case 1: {
                                ibfn ibfn0 = this.h;
                                this.o = 0;
                                if(this.k) {
                                    ialt ialt0 = this.c;
                                    if(ialt0 == ialf.a) {
                                        throw new iapn(iapk.p.f("Can\'t decode compressed gRPC message as compression not configured"));
                                    }
                                    try {
                                        ibdd0 = new ibbv(ialt0.a(new ibdd(this.l)), this.b, ibfn0);
                                    }
                                    catch(IOException iOException0) {
                                        throw new RuntimeException(iOException0);
                                    }
                                }
                                else {
                                    ibdd0 = new ibdd(this.l);
                                }
                                this.l = null;
                                this.a.g(new ibbu(ibdd0));
                                this.p = 1;
                                this.j = 5;
                                --this.e;
                                break;
                            }
                            default: {
                                throw new AssertionError("Invalid state: " + (v4 == 1 ? "HEADER" : "BODY"));
                            }
                        }
                        continue;
                    }
                }
            label_79:
                if(this.f && this.c()) {
                    this.close();
                }
                this.m = false;
                return;
            }
            catch(Throwable throwable1) {
                break;
            }
        }
        this.m = false;
        throw throwable1;
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    @Override  // iavr
    public final void close() {
        boolean z = false;
        if(this.b()) {
            return;
        }
        if(this.l != null && this.l.a > 0) {
            z = true;
        }
        try {
            iavl iavl0 = this.d;
            if(iavl0 != null) {
                iavl0.close();
            }
            iavl iavl1 = this.l;
            if(iavl1 != null) {
                iavl1.close();
            }
        }
        finally {
            this.d = null;
            this.l = null;
        }
        this.a.k(z);
    }
}

