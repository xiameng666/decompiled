import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class apc implements Runnable {
    public final aqi a;
    public final List b;

    public apc(aqi aqi0, List list0) {
        this.a = aqi0;
        this.b = list0;
    }

    @Override
    public final void run() {
        aqi aqi0;
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = this.b.iterator();
        boolean z = false;
        boolean z1 = false;
        while(true) {
            aqi0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            aqh aqh0 = (aqh)object0;
            bmy bmy0 = aqi0.a;
            String s = aqh0.a;
            if(bmy0.j(s)) {
                bmy0.a.remove(s);
                arrayList0.add(s);
                if(aqh0.b == bdf.class) {
                    z1 = true;
                }
            }
        }
        if(!arrayList0.isEmpty()) {
            TextUtils.join(", ", arrayList0);
            aqi0.O();
            if(z1) {
                aqi0.f.t(null);
            }
            aqi0.m();
            bmy bmy1 = aqi0.a;
            if(bmy1.d().isEmpty()) {
                aqi0.f.w(false);
                aqi0.f.s(false);
            }
            else {
                aqi0.E();
                aqi0.D();
            }
            if(bmy1.c().isEmpty()) {
                aqi0.f.m();
                aqi0.N();
                aqi0.f.q(false);
                aqi0.k = aqi0.a();
                aqi0.O();
                int v = aqi0.A - 1;
                if(aqi0.A == 0) {
                    throw null;
                }
                switch(v) {
                    case 3: 
                    case 4: {
                        if(aqi0.i == null) {
                            z = true;
                        }
                        kay.c(z);
                        aqi0.J(3);
                        return;
                    }
                    case 6: 
                    case 7: 
                    case 8: {
                        if(aqi0.g.c() || aqi0.z.b()) {
                            z = true;
                        }
                        aqi0.z.a();
                        aqi0.J(6);
                        if(z) {
                            kay.c(aqi0.I());
                            aqi0.o();
                            return;
                        }
                        return;
                    }
                    case 9: {
                        break;
                    }
                    default: {
                        Objects.toString(aqc.a(aqi0.A));
                        aqi0.O();
                        return;
                    }
                }
                aqi0.J(6);
                aqi0.M();
            }
            else {
                aqi0.C();
                aqi0.N();
                if(aqi0.A == 10) {
                    aqi0.w();
                }
            }
        }
    }
}

