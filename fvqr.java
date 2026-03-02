import java.util.Calendar;
import java.util.Date;
import java.util.EnumMap;

public final class fvqr extends fvqd {
    final fvlt k;
    fvnb l;
    long m;
    public final fvqt n;
    long o;
    private final fvqn p;
    private final fvrf q;
    private final fvqp r;

    public fvqr(fwze fwze0, fwyd fwyd0, fwzp fwzp0, fvrj fvrj0, fxzs fxzs0, fvqa fvqa0, fvqn fvqn0, fvrf fvrf0) {
        fvqp fvqp0 = new fvqp(fwyd0, fwzp0, ((fvsl)fvrf.a.get(0)), fvqn0, fvrf0);
        fvqt fvqt0 = new fvqt(fvqn0, fwyd0, fwze0.h(), fwze0.mK());
        super("IOCollector", fwze0, fwyd0, fwzp0, fvrj0, fxzs0, fvqa0, 2);
        this.k = new fvqq(this);
        this.m = -1L;
        this.o = 0x7FFFFFFFFFFFFFFFL;
        this.p = fvqn0;
        this.q = fvrf0;
        this.r = fvqp0;
        this.n = fvqt0;
    }

    static void E(fvqr fvqr0) {
        fvqr0.F(true);
    }

    private final void F(boolean z) {
        this.l = null;
        this.m = -1L;
        if(z) {
            this.i.a();
        }
    }

    @Override  // fvqd
    public final int a() {
        return 3;
    }

    @Override  // fvqd
    public final boolean s(long v) {
        fvuf fvuf0;
        int v5;
        long v1 = this.o;
        Long long0 = (long)0x7FFFFFFFFFFFFFFFL;
        int v2 = Long.compare(v1, 0x7FFFFFFFFFFFFFFFL);
        if(v2 != 0 && v1 - 10000L <= v && v <= v1 + 180000L) {
            fwze fwze0 = this.b;
            if(this.q.i == 1 && fwze0.k().mU() && fvqi.a(16)) {
                this.o = 0x7FFFFFFFFFFFFFFFL;
                this.p.m();
                EnumMap enumMap0 = new EnumMap(fvns.class);
                enumMap0.put(fvns.e, Integer.valueOf(1));
                fvnb fvnb0 = fwze0.mI().c(false, fvns.a(new fvns[]{fvns.h, fvns.g, fvns.e}), enumMap0, 10000L, null, this.k, this.a, null, "network_location_calibration", "InOutdoorCollector");
                this.l = fvnb0;
                if(fvnb0 != null) {
                    fvnb0.b();
                    this.m = v;
                }
                if(this.l != null) {
                    this.j = 9;
                }
            }
        }
        else if(v2 != 0 && v > v1 + 180000L) {
            this.o = 0x7FFFFFFFFFFFFFFFL;
            this.p.m();
        }
        if(this.j != 9 && this.o == 0x7FFFFFFFFFFFFFFFL && this.q.h && fvqi.a(16)) {
            fvqp fvqp0 = this.r;
            if(fvqp0.c.h) {
                Calendar calendar0 = Calendar.getInstance();
                calendar0.setTimeInMillis(fvqp0.b.c());
                fvqn fvqn0 = fvqp0.d;
                Long long1 = fvqn0.g();
                fvrb fvrb0 = fvrb.a;
                fvuf fvuf1 = new fvuf(long1, fvrb0);
                long v3 = (long)(((Long)fvuf1.a));
                long v4 = calendar0.getTimeInMillis() - 300000L;
                fvuf fvuf2 = v3 == 0L || v3 - 86400000L >= calendar0.getTimeInMillis() || v4 >= v3 ? new fvuf(((long)0L), fvrb0) : fvqp0.a(v3, (fvuf1.b == null ? fvrb0 : ((fvrb)fvuf1.b)));
                if(((long)(((Long)fvuf2.a))) == 0L) {
                    fvsl fvsl0 = fvqp0.a;
                    if(fvsl0 == null) {
                        fvuf0 = new fvuf(long0, fvrb0);
                    }
                    else {
                        Date date0 = fvqn0.k();
                        if(date0 == null) {
                            fvqn0.o(calendar0);
                            v5 = 6;
                        }
                        else {
                            Calendar calendar1 = Calendar.getInstance();
                            calendar1.setTime(date0);
                            if(fvsl.j(calendar1, calendar0)) {
                                v5 = Math.max(0, 6 - fvqn0.c());
                            }
                            else {
                                fvqn0.o(calendar0);
                                v5 = 6;
                            }
                        }
                        if(v5 > 0 && !fvsl0.g(calendar0)) {
                            fvuf0 = fvqp0.b(calendar0, v5);
                        }
                        else {
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTime(calendar0.getTime());
                            calendar2.add(5, 1);
                            fvsl.f(calendar2, fvsl0.b);
                            fvqn0.o(calendar2);
                            fvuf0 = fvqp0.b(calendar2, 6);
                        }
                    }
                }
                else {
                    fvuf0 = fvuf2;
                }
            }
            else {
                fvuf0 = new fvuf(long0, fvrb.a);
            }
            this.o = (long)(((Long)fvuf0.a));
        }
        return this.j != 2;
    }

    @Override  // fvqd
    public final boolean z() {
        fvnb fvnb0 = this.l;
        if(fvnb0 == null) {
            this.j = 2;
            return true;
        }
        fvrf fvrf0 = this.q;
        if(fvrf0.i != 1) {
            fvnb0.c();
            if(!fvrf0.f() || !this.u()) {
                this.F(false);
                this.j = 2;
                return true;
            }
        }
        return false;
    }
}

