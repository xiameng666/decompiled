import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ffql {
    public static final bboh a;

    static {
        ffql.a = bboh.b("SafetyUtils", bbcu.ea);
    }

    public static int a(faik faik0) {
        evql evql0 = faik0.co();
        try {
            evrg.o(evql0, 10000L, TimeUnit.MILLISECONDS);
            return !evql0.n() || evql0.j() == null ? -1 : ((azui)evql0.j()).n();
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return -1;
    }

    public static int b(faik faik0) {
        evql evql0 = faik0.cq();
        try {
            evrg.o(evql0, 10000L, TimeUnit.MILLISECONDS);
            return !evql0.n() || evql0.j() == null ? -1 : ((azui)evql0.j()).r();
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return -1;
    }

    public static boolean c(faik faik0) {
        evql evql0 = faik0.co();
        try {
            evrg.o(evql0, 10000L, TimeUnit.MILLISECONDS);
            return !evql0.n() || evql0.j() == null ? false : ((azui)evql0.j()).o();
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }

    public static boolean d(faik faik0) {
        evql evql0 = faik0.cq();
        try {
            evrg.o(evql0, 10000L, TimeUnit.MILLISECONDS);
            return !evql0.n() || evql0.j() == null ? false : ((fajg)((azui)evql0.j()).a).c();
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }

    public static boolean e(faik faik0) {
        evql evql0 = faik0.cp();
        try {
            evrg.o(evql0, 10000L, TimeUnit.MILLISECONDS);
            return !evql0.n() || evql0.j() == null ? false : ((azui)evql0.j()).q();
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }
}

