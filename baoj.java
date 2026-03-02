import com.google.android.gms.common.devicedoctor.watchcat.MemoryUsageChecker.MemoryUsageWatchcatException;

public final class baoj implements baol {
    @Override  // baol
    public final long a() {
        return baok.b();
    }

    @Override  // baol
    public final long b() {
        return baok.c();
    }

    @Override  // baol
    public final baou c() {
        return new MemoryUsageChecker.MemoryUsageWatchcatException();
    }

    @Override  // baol
    public final String d() {
        return "MemoryUsage";
    }

    @Override  // baol
    public final boolean e() {
        long v1;
        if(hrzd.e()) {
            long v = hrzd.a.b().g();
            if(hrzd.f()) {
                v1 = bauo.e();
            }
            else {
                v1 = hrzd.g() ? ((baup)bave.a.b()).a() : bauo.f();
            }
            if(v1 <= v) {
                return false;
            }
            Runtime.getRuntime().gc();
            if(hrzd.f()) {
                return bauo.e() >= v;
            }
            return hrzd.g() ? ((baup)bave.a.b()).a() >= v : bauo.f() >= v;
        }
        return false;
    }

    @Override  // baol
    public final boolean f() {
        return false;
    }
}

