import j..util.DesugarCollections;
import java.security.SecureRandom;
import java.util.Set;

public class aznj implements azmf {
    public final SecureRandom a;
    protected final genm b;
    private final gena c;

    public aznj(SecureRandom secureRandom0, gena gena0, genm genm0) {
        this.a = secureRandom0;
        this.c = gena0;
        this.b = genm0;
    }

    @Override  // azmf
    public int a() {
        return this.d() * this.b.g - 1;
    }

    @Override  // azmf
    public gged_interceptors b(azki azki0, azii azii0) {
        int v = this.c(azki0);
        int v1 = 1;
        double f = (((double)glxd.b((azii0.b == 1 ? ((long)(((Long)azii0.c))) : 0L), this.b.h, this.b.i)) - ((double)this.b.h)) / ((((double)this.b.i) - ((double)this.b.h)) / ((double)(this.b.g - 1)));
        double f1 = Math.floor(f);
        double f2 = f - f1;
        if(Double.compare(f2, 0.0) == 0 || (this.a.nextDouble() > f2)) {
            v1 = 0;
        }
        return gged_interceptors.l(Integer.valueOf((((int)f1) + v1) * this.d() + v));
    }

    protected final int c(azki azki0) {
        int v = 1;
        int v1 = 0;
        int v2 = 0;
        while(true) {
            glww glww0 = azki0.a;
            if(v1 >= glww0.c()) {
                break;
            }
            int v3 = glww0.a(v1);
            gemy gemy0 = (gemy)this.c.d.get(v1);
            int v4 = gemy0.c;
            if(v4 == 0) {
                ggdy ggdy0 = new ggdy();
                Set set0 = DesugarCollections.unmodifiableMap(gemy0.b).keySet();
                for(Object object0: ggmi.a.c(set0)) {
                    ggdy0.i(((Integer)object0));
                }
                gged_interceptors gged0 = ggdy0.h();
                for(int v5 = 0; true; ++v5) {
                    if(v5 >= ((ggna)gged0).c) {
                        throw new azni(String.format("event_code %s was not found in the dimension\'s event codes", v3));
                    }
                    if(v3 == ((int)(((Integer)gged0.get(v5))))) {
                        v3 = v5;
                        break;
                    }
                }
            }
            else if(v3 > v4) {
                throw new azni(String.format("event_code %s is larger than max_event_code %s", v3, ((int)gemy0.c)));
            }
            v2 += v3 * v;
            v *= aznj.e(gemy0);
            ++v1;
            continue;
        }
        return v2;
    }

    protected final int d() {
        int v = 1;
        for(Object object0: this.c.d) {
            v *= aznj.e(((gemy)object0));
        }
        return v;
    }

    private static final int e(gemy gemy0) {
        return gemy0.c == 0 ? gemy0.b.size() : gemy0.c + 1;
    }
}

