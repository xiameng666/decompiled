import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class fvrp {
    final long a;
    final fvro b;
    long c;
    long d;
    private final fvrn e;
    private final String f;
    private final long g;

    public fvrp(String s, long v, fvro fvro0, long v1, long v2) {
        this.f = s;
        this.g = v;
        this.b = fvro0;
        this.a = v1;
        this.e = new fvrn();
        this.f(v2);
    }

    public final long a(long v) {
        synchronized(this) {
            this.n(v);
        }
        return this.c;
    }

    public final long b(long v) {
        long v1;
        synchronized(this) {
            if(v < 0L) {
                return 0L;
            }
            v1 = Math.min(v, this.b.c - this.c);
            this.c = Math.min(this.c + v1, this.b.c);
        }
        return v1;
    }

    final gwwd c() {
        ProtoLiteBuilder hftp0;
        synchronized(this) {
            hftp0 = ((ProtoLiteMessage)gwwd.a).v_newBuilder();
            long v1 = this.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gwwd)hftv0).b |= 1;
            ((gwwd)hftv0).c = v1;
            long v2 = this.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwwd gwwd0 = (gwwd)hftp0.b_message;
            gwwd0.b |= 2;
            gwwd0.d = v2;
        }
        return (gwwd)hftp0.N_build();
    }

    final gxnh d() {
        gxnh gxnh0;
        synchronized(this) {
            gxnh0 = this.e.a();
        }
        return gxnh0;
    }

    public final void e(long v, long v1, long v2, gwwd gwwd0) {
        if(gwwd0 == null) {
            this.f(v);
            return;
        }
        long v3 = gwwd0.d;
        long v4 = gwwd0.c;
        synchronized(this) {
            long v6 = this.a;
            if(fvrp.k(v1, v2, v6, v) + 86400000L >= v && v3 != -1L) {
                long v7 = fvrp.k(v1, v3, v6, v);
                this.d = v7;
                if(this.m()) {
                    Calendar calendar0 = Calendar.getInstance();
                    calendar0.setTimeInMillis(v6 + v7);
                    long v8 = fvsl.c(calendar0);
                    long v9 = this.g;
                    if(v8 != v9) {
                        fvsl.f(calendar0, v9);
                        if(calendar0.getTimeInMillis() > v6 + v) {
                            calendar0.add(6, -1);
                        }
                        v7 = calendar0.getTimeInMillis() - v6;
                    }
                    this.d = v7;
                }
                this.c = Math.min(this.b.c, v4);
            }
            else {
                this.l(v);
            }
            this.n(v);
        }
    }

    public final void f(long v) {
        synchronized(this) {
            this.l(v);
            this.n(v);
        }
    }

    final void g() {
        synchronized(this) {
            this.e.c();
        }
    }

    public final boolean h(long v, long v1, boolean z) {
        int v3;
        synchronized(this) {
            this.n(v1);
            v3 = Long.compare(v, this.c);
            if(z) {
                this.e.b(v3 > 0);
            }
        }
        return v3 <= 0;
    }

    public final fvrm i(long v, long v1) {
        synchronized(this) {
            this.n(v1);
            if(this.h(v, v1, false)) {
                this.c = Math.max(0L, this.c - v);
                return new fvrm(this, v);
            }
        }
        return null;
    }

    public final void j(long v, long v1) {
        synchronized(this) {
            this.n(v1);
            this.c = Math.max(0L, this.c - v);
        }
    }

    private static long k(long v, long v1, long v2, long v3) {
        return Math.min(v3, v + v1 - v2);
    }

    private final void l(long v) {
        long v1;
        this.c = 0L;
        if(this.m()) {
            Calendar calendar0 = Calendar.getInstance();
            calendar0.setTimeInMillis(v + this.a);
            fvsl.f(calendar0, this.g);
            calendar0.add(6, -1);
            v1 = calendar0.getTimeInMillis() - this.a;
        }
        else {
            v1 = -1L;
        }
        this.d = v1;
    }

    private final boolean m() {
        return this.b.b == 86400000L && this.g >= 0L;
    }

    private final void n(long v) {
        long v2;
        long v1 = this.d;
        if(v1 == -1L) {
            this.d = v;
            v2 = this.b.a;
        }
        else {
            fvro fvro0 = this.b;
            long v3 = fvro0.b;
            long v4 = (v - v1) / v3;
            if(v4 < 0L) {
                v2 = 0L;
            }
            else {
                this.d = v3 * v4 + v1;
                v2 = v4 * fvro0.a;
            }
        }
        long v5 = this.c;
        long v6 = Math.min(v2 + v5, this.b.c);
        this.c = v6;
        if(v6 == v5 && v1 == this.d) {
        }
    }

    @Override
    public final String toString() {
        String s;
        Long long0;
        Locale locale0;
        synchronized(this) {
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
            locale0 = Locale.US;
            long0 = (long)this.c;
            s = simpleDateFormat0.format(new Date(this.a + this.d));
        }
        return String.format(locale0, "%s - current tokens: %d, last refill: %s, params: %s", this.f, long0, s, this.b);
    }
}

