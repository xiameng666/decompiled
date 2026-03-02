import android.content.Context;
import android.util.Log;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.List;

public final class eklq implements evqf {
    public final eklt a;
    public final Context b;
    public final aqfl c;
    public final ekkr d;
    public final int e;

    public eklq(eklt eklt0, Context context0, aqfl aqfl0, ekkr ekkr0, int v) {
        this.a = eklt0;
        this.b = context0;
        this.c = aqfl0;
        this.d = ekkr0;
        this.e = v;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        eklt eklt0 = this.a;
        ejze ejze0 = eklt0.c;
        ejze0.o(3);
        if(((List)object0) == null) {
            Log.w("ContactsGmsRestore", "No source stats entities found.");
            eklt0.a.y();
            return;
        }
        ejyx ejyx0 = new ejyx("", this.c.e);
        ejyx0.b = (long)this.c.c;
        ejyx0.l = this.c;
        ejyx0.d = this.c.d;
        for(Object object1: ((List)object0)) {
            ejyx0.a(((SourceStatsEntity)object1));
        }
        ejyy ejyy0 = new ejyy(ejyx0);
        ejze0.g(ejyy0.f, ejyy0.g, ejyy0.e);
        eklt0.e.put(Long.toString(ejyy0.b.longValue()), ejyy0);
        ekku ekku0 = eklt0.b;
        String s = Long.toString(ejyy0.b.longValue());
        ejyy ejyy1 = ekku0.n().a(s);
        if(ejyy1 == null) {
            Log.e("CBR_CRSAdapter", "Cannot find unlocked restore source.");
        }
        else {
            ekku0.a.o(s, ejyy1);
        }
        ekkr ekkr0 = this.d;
        ejyv.d(this.b).e = false;
        if(this.e == 3) {
            ekku0.I(ekkr0, true);
            return;
        }
        ekku0.H(ekkr0, true);
    }
}

