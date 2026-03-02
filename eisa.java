import android.content.Context;

public final class eisa implements eisd {
    private static final Object a;
    private static final Object b;
    private static volatile eisa c;
    private volatile int d;
    private long e;
    private long f;

    static {
        bboh.b("GmsOobeModeChecker", bbcu.al);
        eisa.a = new Object();
        eisa.b = new Object();
    }

    public eisa() {
        this.d = 0;
        this.e = 0L;
        this.f = 0L;
    }

    public static eisa a() {
        eisa eisa1;
        eisa eisa0 = eisa.c;
        if(eisa0 == null) {
            synchronized(eisa.a) {
                eisa1 = eisa.c;
                if(eisa1 == null) {
                    eisa1 = new eisa();
                    eisa.c = eisa1;
                }
            }
            return eisa1;
        }
        return eisa0;
    }

    @Override  // eisd
    public final boolean b(Context context0) {
        boolean z1;
        int v = 1;
        if(this.d == 1) {
            return false;
        }
        Object object0 = eisa.b;
        synchronized(object0) {
            __monitor_enter(object0);
        }
        try {
            boolean z = this.e == 0L || System.currentTimeMillis() - this.e >= hxkc.a.b().a();
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
        if(z) {
            try {
                z1 = bbqs.a(context0);
                if(z1) {
                    v = 2;
                }
                this.d = v;
                this.e = System.currentTimeMillis();
                ++this.f;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
            __monitor_exit(object0);
            return z1;
        }
        __monitor_exit(object0);
        return this.d == 2;
    }
}

