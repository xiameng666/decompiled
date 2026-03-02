import java.util.Set;

public final class bpka implements glzm {
    public final bpkl a;
    public final gmcd b;
    public final gmcd c;

    public bpka(bpkl bpkl0, gmcd gmcd0, gmcd gmcd1) {
        this.a = bpkl0;
        this.b = gmcd0;
        this.c = gmcd1;
    }

    @Override  // glzm
    public final gmcd a() {
        Set set0;
        fqzf fqzf0 = (fqzf)gmbu.r(this.b);
        fqzl fqzl0 = (fqzl)gmbu.r(this.c);
        bpkl bpkl0 = this.a;
        synchronized(bpkl0.k) {
            if(hsxl.i() && !bpkl0.e.isEmpty()) {
                ((ggtj)bpkl.a.j()).x("The last sightings batch upload didn\'t complete gracefully. Recycling its sightings.");
                boolean z = bouv.e(fqzl0);
                for(Object object1: bpkl0.b.values()) {
                    hadw hadw0 = bpkq.b(((bpkj)object1).f, z);
                    bpkl0.g.c(hadx.s, ((bpkj)object1).d, hadw0);
                }
                bpkl0.d = gfqx.a;
                bpkl0.e(fqzl0);
            }
            set0 = bpkl0.c.keySet();
        }
        return gdtf.j(gmbu.o(bpkl0.c.values()), new bpjq(bpkl0, fqzf0, set0), bpkl0.i);
    }
}

