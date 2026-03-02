import android.os.Trace;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;

public final class bje {
    public final Object a;
    public int b;
    public final Map c;
    public int d;
    public final ayv e;
    private final StringBuilder f;

    public bje(ayv ayv0) {
        this.f = new StringBuilder();
        Object object0 = new Object();
        this.a = object0;
        this.c = new HashMap();
        this.b = 1;
        synchronized(object0) {
            this.e = ayv0;
            this.d = this.b;
        }
    }

    public final void a() {
        if(bcs.f("CameraStateRegistry")) {
            this.f.setLength(0);
            this.f.append("Recalculating open cameras:\n");
            this.f.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f.append("-------------------------------------------------------------------\n");
        }
        int v = 0;
        for(Object object0: this.c.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(bcs.f("CameraStateRegistry")) {
                String s = ((bjd)map$Entry0.getValue()).a == null ? "UNKNOWN" : ((bjd)map$Entry0.getValue()).a.toString();
                String s1 = String.format(Locale.US, "%-45s%-22s\n", ((azp)map$Entry0.getKey()).toString(), s);
                this.f.append(s1);
            }
            if(bje.c(((bjd)map$Entry0.getValue()).a)) {
                ++v;
            }
        }
        if(bcs.f("CameraStateRegistry")) {
            this.f.append("-------------------------------------------------------------------\n");
            this.f.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", v, ((int)this.b)));
            bcs.h("CameraStateRegistry");
        }
        this.d = Math.max(this.b - v, 0);
    }

    public static void b(azp azp0, bim bim0) {
        if(Trace.isEnabled()) {
            oyn.c(a.i(azp0, "CX:State[", "]"), bim0.ordinal());
        }
    }

    public static boolean c(bim bim0) {
        return bim0 != null && bim0.i;
    }

    public final boolean d(azp azp0) {
        boolean z;
        synchronized(this.a) {
            bjd bjd0 = (bjd)this.c.get(azp0);
            kay.j(bjd0, "Camera must first be registered with registerCamera()");
            z = false;
            if(bcs.f("CameraStateRegistry")) {
                this.f.setLength(0);
                this.f.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", azp0, ((int)this.d), Boolean.valueOf(bje.c(bjd0.a)), bjd0.a));
            }
            if(this.d > 0 || bje.c(bjd0.a)) {
                bjd0.a(bim.f);
                bje.b(azp0, bim.f);
                z = true;
            }
            if(bcs.f("CameraStateRegistry")) {
                this.f.append(String.format(Locale.US, " --> %s", (z ? "SUCCESS" : "FAIL")));
                bcs.h("CameraStateRegistry");
            }
            if(z) {
                this.a();
            }
        }
        return z;
    }

    public final void e() {
        synchronized(this.a) {
        }
    }
}

