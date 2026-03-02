import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class cyom {
    public final ArrayList a;
    public final bbng b;
    public final cxzo c;
    public cynb d;
    public ScheduledExecutorService e;
    public kar f;
    public cust g;

    public cyom(bbng bbng0, cxzo cxzo0) {
        this.a = new ArrayList();
        this.g = cyjh.a;
        this.b = bbng0;
        this.c = cxzo0;
    }

    public final cync a() {
        ArrayList arrayList0 = this.a;
        if(arrayList0.isEmpty()) {
            return null;
        }
        cync cync0 = (cync)gggq.p(arrayList0);
        return this.b.a() - (cync0.e > 0L ? cync0.e : cync0.a) <= hvpg.ar() ? cync0 : null;
    }

    protected final void b(gmcd gmcd0, int v, int v1) {
        this.d(gmcd0, v, true, v1);
    }

    protected final void c(gmcd gmcd0, int v, int v1) {
        this.d(gmcd0, v, false, v1);
    }

    protected final void d(gmcd gmcd0, int v, boolean z, int v1) {
        this.e(gmcd0, v, z, v1, this.b.a(), new AtomicInteger(0));
    }

    protected final void e(gmcd gmcd0, int v, boolean z, int v1, long v2, AtomicInteger atomicInteger0) {
        ((ggtj)this.g.d().ar(0x1F27)).X("SwitchHistory: logSwitching with switchType=%s, isRevert=%s, profile=%s", cynd.a(v), Boolean.valueOf(z), Integer.valueOf(v1));
        cync cync0 = new cync(v, z, v1 == 2, v2, atomicInteger0);
        cync0.k = this.g;
        cyqk.a(gmcd0, new cyok(this, cync0), gmap.a);
        ArrayList arrayList0 = this.a;
        arrayList0.add(cync0);
        int v3 = cync0.l;
        String s = this.d.e;
        boolean z1 = this.d.f();
        boolean z2 = cync0.c;
        cxzo cxzo0 = this.c;
        if(hvpp.ak()) {
            cyjt cyjt0 = v3 - 1 == 1 || v3 - 1 == 3 ? cyjt.e : cyjt.f;
            if(cyjt0 != cyjt.a) {
                cxza cxza0 = new cxza(cxzo0, z1, v3, (z2 ? 2 : 3), s, cyjt0);
                cxzo0.e.post(cxza0);
            }
        }
        else {
            cxzo0.j.f().x("logNotificationShown: disable logging");
        }
        if(((long)arrayList0.size()) > hvpg.an()) {
            arrayList0.remove(0);
        }
    }

    final int f(int v) {
        ArrayList arrayList0 = this.a;
        if(!arrayList0.isEmpty() && v != 23) {
            cync cync0 = (cync)gggq.p(arrayList0);
            if(cync0.g <= 0L) {
                switch(v) {
                    case 4: {
                        return 35;
                    }
                    case 20: {
                        return 18;
                    }
                    default: {
                        return v;
                    }
                }
            }
            switch(cync0.h) {
                case 1100: {
                    return 26;
                }
                case 1101: {
                    return 27;
                }
                case 1102: {
                    return 28;
                }
                case 0x44F: {
                    return 29;
                }
                case 0x450: {
                    return 30;
                }
                case 1105: {
                    return 0x1F;
                }
                case 1106: {
                    return 0x20;
                }
                case 1107: {
                    return 33;
                }
                case 1108: {
                    return 34;
                }
                case 1109: {
                    return 25;
                }
                default: {
                    return v;
                }
            }
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SwitchHistory\n  ");
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(((cync)arrayList0.get(v1)));
            stringBuilder0.append("\n  ");
        }
        return stringBuilder0.toString();
    }
}

