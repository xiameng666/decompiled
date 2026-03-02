import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class cymb implements bbqb {
    public final cyna a;

    public cymb(cyna cyna0) {
        this.a = cyna0;
    }

    @Override  // bbqb
    public final boolean a(Object object0) {
        ArrayList arrayList1;
        ArrayList arrayList0;
        boolean z = ((fgtg)object0).equals(fgtg.a);
        cyna cyna0 = this.a;
        if(z) {
            long v = cyna0.c().a();
            synchronized(cyna0.c) {
                arrayList0 = new ArrayList(cyna0.c.a);
            }
            if(arrayList0.isEmpty()) {
                return false;
            }
            int v2 = arrayList0.size();
            while(true) {
                --v2;
                if(v2 < 0) {
                    break;
                }
                cymy cymy0 = (cymy)arrayList0.get(v2);
                if(v - cymy0.d >= hvpg.al()) {
                    break;
                }
                if(cymy0.b.a() == 1 && cymy0.b.f().a()) {
                    return true;
                }
            }
            int v3 = arrayList0.size() - 1;
            cymy cymy1 = null;
            while(v3 >= 0) {
                cymy cymy2 = (cymy)arrayList0.get(v3);
                fgta fgta0 = cymy2.b;
                if(fgta0.a() != 1) {
                    long v4 = TimeUnit.SECONDS.toMillis(hvpg.ao());
                    if(v - cymy2.c > v4) {
                        return false;
                    }
                    --v3;
                    cymy1 = cymy2;
                    continue;
                }
                if(fgta0.f().b() && cymy1 != null && cymy1.b.f() == fgtk.a) {
                    long v5 = hvpg.a.aY().cY();
                    if(cymy1.c - cymy2.c < v5 && v3 > 0) {
                        fgta fgta1 = ((cymy)arrayList0.get(v3 - 1)).b;
                        return fgta1.f().a() ? fgta1.a() == 1 : false;
                    }
                }
                return fgta0.f().a();
            }
            return false;
        }
        long v6 = cyna0.c().a();
        synchronized(cyna0.c) {
            arrayList1 = new ArrayList(cyna0.c.a);
        }
        if(arrayList1.isEmpty()) {
            return false;
        }
        int v8 = arrayList1.size();
        while(true) {
            --v8;
            if(v8 < 0) {
                break;
            }
            cymy cymy3 = (cymy)arrayList1.get(v8);
            if(v6 - cymy3.d >= hvpg.al()) {
                fgta fgta2 = cymy3.b;
                if(!fgta2.f().equals(fgtk.a)) {
                    if(fgta2.f().a()) {
                        return cymy3.e || v6 - cymy3.d <= hvpg.q() ? fgta2.a() != 1 : false;
                    }
                    return false;
                }
            }
            if(cymy3.b.a() != 1 && cymy3.b.f().a()) {
                return true;
            }
        }
        return false;
    }
}

