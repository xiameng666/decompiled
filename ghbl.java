import j..util.Objects;
import java.util.ArrayList;
import java.util.PriorityQueue;

public final class ghbl {
    public final ghbk a;
    int b;
    public final ArrayList c;
    public final PriorityQueue d;
    public final ghbq e;

    public ghbl(ghbq ghbq0, ghbk ghbk0) {
        Objects.requireNonNull(ghbq0);
        this.e = ghbq0;
        super();
        this.b = 0;
        this.c = new ArrayList();
        this.d = new PriorityQueue(10, new ghbo());
        this.a = ghbk0;
    }

    public final ghbn a(ggyi ggyi0) {
        boolean z = false;
        ghbk ghbk0 = this.a;
        if(ghbk0.m(ggyi0)) {
            if(ggyi0.b >= this.e.b && (ggyi0.b + 1 > this.e.c || ghbk0.h(ggyi0))) {
                z = true;
            }
            ghbn ghbn0 = new ghbn();
            ghbn0.a = ggyi0;
            ghbn0.b = z;
            if(!z) {
                ghbn0.d = new ghbn[4];
            }
            ++this.b;
            return ghbn0;
        }
        return null;
    }

    public final void b(ghbn ghbn0) {
        ggym ggym1;
        if(ghbn0 != null) {
            if(ghbn0.b) {
                goto label_61;
            }
            ggyi ggyi0 = ghbn0.a;
            ggyi[] arr_ggyi = new ggyi[4];
            for(int v = 0; v < 4; ++v) {
                arr_ggyi[v] = new ggyi();
            }
            if(!ggyi0.d.T()) {
                long v1 = Long.lowestOneBit(ggyi0.d.c);
                ggym ggym0 = new ggym(ggyi0.d.c - v1 + (v1 >>> 2));
                ggxn ggxn0 = ggyi0.b();
                double f = ggxn0.a;
                double f1 = ggxn0.b;
                for(int v2 = 0; v2 < 4; ++v2) {
                    ggyi ggyi1 = arr_ggyi[v2];
                    ggyi1.a = ggyi0.a;
                    ggyi1.b = (byte)(ggyi0.b + 1);
                    ggyi1.c = (byte)(ggyi0.c ^ ggxv.e(v2));
                    ggyi1.d = ggym0;
                    int v3 = ggxv.d(ggyi0.c, v2);
                    if((v3 & 2) == 0) {
                        ggym1 = ggym0;
                        ggyi1.e = ggyi0.e;
                        ggyi1.f = f;
                    }
                    else {
                        ggyi1.e = f;
                        ggym1 = ggym0;
                        ggyi1.f = ggyi0.f;
                    }
                    if((v3 & 1) == 0) {
                        ggyi1.g = ggyi0.g;
                        ggyi1.h = f1;
                    }
                    else {
                        ggyi1.g = f1;
                        ggyi1.h = ggyi0.h;
                    }
                    ggym0 = ggym1.C();
                }
            }
            int v4 = 0;
            for(int v5 = 0; v5 < 4; ++v5) {
                ghbn ghbn1 = this.a(arr_ggyi[v5]);
                if(ghbn1 != null) {
                    int v6 = ghbn0.c;
                    ghbn0.c = v6 + 1;
                    ghbn0.d[v6] = ghbn1;
                    if(ghbn1.b) {
                        ++v4;
                    }
                }
            }
            int v7 = ghbn0.c;
            if(v7 != 0) {
                if(v4 == 4 && ghbn0.a.b >= this.e.b) {
                    ghbn0.b = true;
                    this.b(ghbn0);
                    return;
                }
                ghbp ghbp0 = new ghbp(-(((ghbn0.a.b << 2) + v7 << 2) + v4), ghbn0);
                this.d.add(ghbp0);
                return;
            label_61:
                this.c.add(ghbn0.a.d);
            }
        }
    }
}

