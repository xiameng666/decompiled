import java.util.Set;

public final class hflm implements glzm {
    public final hflo a;
    public final gmcd b;
    public final gmcd c;
    public final hfnp d;

    public hflm(hflo hflo0, gmcd gmcd0, gmcd gmcd1, hfnp hfnp0) {
        this.a = hflo0;
        this.b = gmcd0;
        this.c = gmcd1;
        this.d = hfnp0;
    }

    @Override  // glzm
    public final gmcd a() {
        Set set0 = (Set)gmbu.r(this.b);
        Set set1 = (Set)gmbu.r(this.c);
        if(!set0.isEmpty() && !set1.isEmpty()) {
            hfng hfng0 = this.d.c == null ? hfng.a : this.d.c;
            int v = hfng0.b;
            if((v & 2) == 0 && (v & 4) == 0) {
                return glzd.f(gmbu.h(new gfuz("Missing explicit principal gaia user email and explicit principal zwieback token")), new hfll(set1, set0), gmap.a);
            }
            String s = (v & 2) == 0 ? hfng0.d : hfng0.c;
            return (v & 2) == 0 ? glzd.f(glzd.f(this.a.b.a(), new hfli(s), gmap.a), new hfll(set1, set0), gmap.a) : glzd.f(glzd.f(this.a.a.a(s), new hfli(s), gmap.a), new hfll(set1, set0), gmap.a);
        }
        return gmbu.i(Boolean.valueOf(false));
    }
}

