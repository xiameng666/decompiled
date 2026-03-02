import com.google.android.gms.icing.nativeindex.NativeIndex;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public final class bwma extends bwzp {
    final bxak a;
    final bwmx b;

    public bwma(bwmx bwmx0, gltq gltq0, bxak bxak0) {
        this.a = bxak0;
        Objects.requireNonNull(bwmx0);
        this.b = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final void w() {
        bxak bxak0 = this.a;
        if((bxak0.b & 1) != 0) {
            bwmx bwmx0 = this.b;
            bxaj bxaj0 = bxak0.c == null ? bxaj.a : bxak0.c;
            bwuc bwuc0 = bwmx0.l;
            if(bwuc0 == null) {
                bwne.s("Null \'clients\', unable to handle GCM delete app history");
                return;
            }
            NativeIndex nativeIndex0 = bwmx0.m;
            if(nativeIndex0 == null) {
                bwne.s("Null \'index\', unable to handle GCM delete app history");
                return;
            }
            bwut bwut0 = bwmx0.f();
            bwne.a("handleGcmDeleteAppHistory.");
            synchronized(bwut0.p()) {
                int v1 = (int)TimeUnit.MILLISECONDS.toSeconds(bxaj0.d);
                int v2 = (int)TimeUnit.MILLISECONDS.toSeconds(bxaj0.e);
                if(bxaj0.b.isEmpty()) {
                    ggqj ggqj0 = bwut0.o().om();
                    while(ggqj0.hasNext()) {
                        Object object1 = ggqj0.next();
                        bwvl bwvl0 = (bwvl)object1;
                        bwnq bwnq0 = bwut0.c(bwvl0);
                        if(bwnq0 != null) {
                            bwua bwua0 = bwuc0.f(bwnq0.f);
                            if(bwua0 != null) {
                                nativeIndex0.u(bwnq0.j, v1, v2);
                                bwmx0.L(bwvl0, bwua0);
                            }
                        }
                    }
                }
                else {
                    bwua bwua1 = bwuc0.f(bxaj0.b);
                    if(bwua1 != null) {
                        for(Object object2: bwua1.i()) {
                            bwvl bwvl1 = (bwvl)object2;
                            bwnr bwnr0 = bwut0.e(bwvl1);
                            if(bwnr0 != null) {
                                bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                                if(bwnx.a(bwny0.d) != 0 && bwnx.a(bwny0.d) != 1 || !bwur.D((bwnr0.c == null ? bwnq.a : bwnr0.c))) {
                                }
                                else if(bxaj0.c.isEmpty()) {
                                    nativeIndex0.u((bwnr0.c == null ? bwnq.a : bwnr0.c).j, v1, v2);
                                    bwmx0.L(bwvl1, bwua1);
                                }
                                else {
                                    if(bwmx0.G((bwnr0.c == null ? bwnq.a : bwnr0.c), bxaj0.c)) {
                                        continue;
                                    }
                                    bwne.s("Failed to delete usage report and implicit document");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

