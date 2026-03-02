import java.util.ArrayList;

final class cymx {
    public final ArrayList a;

    public cymx() {
        this.a = new ArrayList();
    }

    public final cymy a() {
        cymy cymy0;
        synchronized(this) {
            cymy0 = (cymy)gggq.p(this.a);
        }
        return cymy0;
    }

    public final void b(fgta fgta0, long v, float f, boolean z, boolean z1) {
        synchronized(this) {
            cymw cymw0 = z1 ? cymw.a : cymw.b;
            ArrayList arrayList0 = this.a;
            if(arrayList0.isEmpty()) {
                arrayList0.add(new cymy(fgta0, v, f, z, cymw0));
            }
            else if(!((cymy)gggq.p(arrayList0)).a(fgta0, cymw0, v, f, z)) {
                arrayList0.add(new cymy(fgta0, v, f, z, cymw0));
            }
            if(((long)arrayList0.size()) > hvpg.an()) {
                arrayList0.remove(0);
            }
        }
    }

    public final boolean c(long v) {
        long v2;
        synchronized(this) {
            fgta fgta0 = new fgta();
            fgsx.a(fgtk.a, fgta0);
            ArrayList arrayList0 = this.a;
            if(arrayList0.isEmpty()) {
                v2 = v;
            }
            else {
                cymy cymy0 = (cymy)gggq.p(arrayList0);
                if(cymy0.e) {
                    return false;
                }
                v2 = v;
                if(cymy0.a(fgta0, cymw.c, v, 0.0f, false)) {
                    return true;
                }
                long v3 = v2 - cymy0.d;
                if(v3 < hvpg.a.aY().cE()) {
                    ((ggtj)cyjh.a.d().ar(0x1EBF)).A("SassDevice: onStateUpdateForDefaultKey ignore because timeGap=%d", v3);
                    return false;
                }
            }
            arrayList0.add(new cymy(fgta0, v2, 0.0f, false, cymw.c));
            if(((long)arrayList0.size()) > hvpg.an()) {
                arrayList0.remove(0);
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0;
        synchronized(this) {
            stringBuilder0 = new StringBuilder("StateHistory");
            stringBuilder0.append("\n  ");
            ArrayList arrayList0 = this.a;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                stringBuilder0.append(((cymy)arrayList0.get(v2)));
                stringBuilder0.append("\n  ");
            }
        }
        return stringBuilder0.toString();
    }
}

