import android.os.PowerManager;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public final class fnas implements fnau {
    private final fmzy a;
    private final cbyw b;
    private final cbzh c;
    private final ccdk d;
    private final fnac e;
    private final long f;
    private final AtomicLong g;
    private final fmzt h;

    public fnas(fmzy fmzy0, fnaa fnaa0, cbyw cbyw0, cbzh cbzh0, ccdk ccdk0, fnac fnac0, fmzt fmzt0) {
        this.a = fmzy0;
        fnaa0.d();
        this.b = cbyw0;
        this.c = cbzh0;
        this.d = ccdk0;
        this.e = fnac0;
        this.h = fmzt0;
        this.f = cbyw0.i();
        this.g = new AtomicLong(0L);
    }

    @Override  // fnau
    public final Set a(fnaj fnaj0, String s) {
        return this.c(fnaj0, true, s);
    }

    @Override  // fnau
    public final Set b(fnaj fnaj0, String s) {
        return this.c(fnaj0, false, s);
    }

    private final Set c(fnaj fnaj0, boolean z, String s) {
        long v = this.f;
        long v1 = this.a.a();
        if(Long.compare(v, 0L) > 0) {
            AtomicLong atomicLong0 = this.g;
            if(v1 - atomicLong0.get() < v) {
                this.c.b(0x44F);
                return EnumSet.noneOf(fnat.class);
            }
            atomicLong0.set(v1);
        }
        int v2 = 0;
        cbyw cbyw0 = this.b;
        Set set0 = EnumSet.noneOf(fnat.class);
        if(!cbyw0.H()) {
            boolean z1 = (fnaj0.b & 2) == 0 || (fnaj0.g == null ? hfrr.a : fnaj0.g).b;
            boolean z2 = fnaj0.e;
            boolean z3 = cbyw0.G(s);
            boolean z4 = fnaj0.f;
            if(z1) {
                cbyw0.ad();
                fmzt fmzt0 = this.h;
                PowerManager powerManager0 = fmzt0.a;
                if(powerManager0 == null) {
                    fmzt0.b.c(55);
                    ((EnumSet)set0).add(fnat.c);
                }
                else if(powerManager0.isInteractive()) {
                    ((EnumSet)set0).add(fnat.c);
                }
            }
            ccdl ccdl0 = this.d.a();
            float f = (float)cbyw0.j();
            if(!z3 && f / 100.0f > 0.0f && ccdl0.b < f / 100.0f) {
                ((EnumSet)set0).add(fnat.a);
            }
            else if(z2) {
                switch(ccdl0.a) {
                    case 0: {
                        v2 = 1;
                        break;
                    }
                    case 1: {
                        v2 = 2;
                        break;
                    }
                    case 2: {
                        v2 = 3;
                        break;
                    }
                    case 3: {
                        v2 = 4;
                        break;
                    }
                    case 4: {
                        v2 = 5;
                        break;
                    }
                    case 5: {
                        v2 = 6;
                    }
                }
                if(v2 == 4) {
                    ((EnumSet)set0).add(fnat.a);
                }
            }
            if(z) {
                int v3 = this.e.a();
                if(v3 == 1 || v3 == 2 || z4 && v3 == 3) {
                    ((EnumSet)set0).add(fnat.b);
                }
            }
            fmzt fmzt1 = this.h;
            PowerManager powerManager1 = fmzt1.a;
            if(powerManager1 == null) {
                fmzt1.b.c(55);
                ((EnumSet)set0).add(fnat.d);
                return set0;
            }
            if(powerManager1.getCurrentThermalStatus() >= fmzt1.c) {
                ((EnumSet)set0).add(fnat.d);
            }
        }
        return set0;
    }
}

