import android.os.SystemClock;

public final class epil {
    public static final int a;
    private static final Object b;
    private static final ibpf c;
    private static long d;

    static {
        epil.b = new Object();
        epil.c = new ibpf();
        epil.d = -1L;
    }

    public static final void a() {
        epil.d = SystemClock.elapsedRealtime();
    }

    public static final void b(xob xob0) {
        xob0.getClass();
        synchronized(epil.b) {
            ibpf ibpf0 = epil.c;
            if(!ibpf0.isEmpty()) {
                ibpf0.remove(xob0);
                xob0.finish();
            }
        }
    }

    public static final void c(xob xob0) {
        synchronized(epil.b) {
            xob0.getClass();
            epil.c.add(xob0);
            epil.d = -1L;
            abc abc0 = xob0.getOnBackPressedDispatcher();
            ibuq.e(abc0, "<get-onBackPressedDispatcher>(...)");
            abe.a(abc0, xob0, new epik(xob0));
        }
    }

    public static final void d(xob xob0) {
        xob0.getClass();
        if(epil.d == -1L) {
            return;
        }
        synchronized(epil.b) {
            if(!epil.c.isEmpty() && ibuq.m(epil.c.e(), xob0) && SystemClock.elapsedRealtime() - epil.d > hydt.a.c().a()) {
                epil.f();
            }
        }
    }

    public static final void e(xob xob0) {
        xob0.getClass();
        if(epil.d != -1L || hydt.a.c().e() && xob0.isChangingConfigurations()) {
            return;
        }
        synchronized(epil.b) {
            if(!epil.c.isEmpty() && ibuq.m(epil.c.e(), xob0)) {
                epil.f();
            }
        }
    }

    private static final void f() {
        synchronized(epil.b) {
            ibpf ibpf0 = epil.c;
            for(Object object1: ibpf0) {
                ((xob)object1).finish();
            }
            ibpf0.clear();
            epil.d = -1L;
        }
    }
}

