import j..util.Objects;
import java.util.Collections;
import java.util.Set;

final class bwuh implements bwul {
    final Set a;
    final String b;
    final Set c;
    final bwud d;
    final boolean e;
    final bwur f;

    public bwuh(bwur bwur0, Set set0, String s, Set set1, bwud bwud0, boolean z) {
        this.a = set0;
        this.b = s;
        this.c = set1;
        this.d = bwud0;
        this.e = z;
        Objects.requireNonNull(bwur0);
        this.f = bwur0;
        super();
    }

    @Override  // bwul
    public final int a(bwnr bwnr0) {
        bwnq bwnq0 = bwnr0.c == null ? bwnq.a : bwnr0.c;
        if(this.a != null && !this.a.contains(bwnq0.d) || this.b != null && !this.b.equals(bwnq0.f)) {
            return 2;
        }
        if(this.c != null && !this.c.contains(bwnr0)) {
            bwud bwud0 = this.d;
            if(bwud0.b() && this.e) {
                bwur bwur0 = this.f;
                if(!bwur0.B(bwud0, bwnq0)) {
                    return 3;
                }
                bwua bwua0 = bwur0.c.f(bwnq0.f);
                if(bwua0 != null && bwur0.c.q(bwnq0.f) && bwua0.u(bwnq0.d, true) && !bwnq0.l.isEmpty()) {
                    return 1;
                }
            }
            if(huar.a.d().R()) {
                bwur bwur1 = this.f;
                if(!bwur1.B(bwud0, bwnq0)) {
                    return 3;
                }
                if(bwur1.c.f(bwnq0.f) != null) {
                    bxgi bxgi0 = bwur1.d;
                    String s = bwud0.e;
                    if(bwud0.d) {
                        Set set0 = (Set)bxgi.a().get(s);
                        if(set0 == null) {
                            set0 = Collections.EMPTY_SET;
                        }
                        if(!set0.isEmpty()) {
                            bwsa bwsa0 = bwsa.a(bwnq0.d, bwnq0.f, bwtc.d(bxgi0.d));
                            return bwsa0 == null || bwsa0.c == 1 || !set0.contains(bwsa0.a.b) ? 3 : 1;
                        }
                    }
                }
            }
            return 3;
        }
        return 1;
    }
}

