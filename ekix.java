import android.util.Log;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.List;

public final class ekix implements evqf {
    public final ekiz a;
    public final aqfl b;
    public final ekif c;
    public final String d;
    public final int e;

    public ekix(ekiz ekiz0, aqfl aqfl0, ekif ekif0, String s, int v) {
        this.a = ekiz0;
        this.b = aqfl0;
        this.c = ekif0;
        this.d = s;
        this.e = v;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        ekiz ekiz0 = this.a;
        ejze ejze0 = ekiz0.c;
        ejze0.o(3);
        if(((List)object0) == null) {
            Log.w("ContactsGmsRestore", "No source stats entities found.");
            ekiz0.a.C(false);
            ekiz0.a.D();
            return;
        }
        ejyx ejyx0 = new ejyx("", this.b.e);
        ejyx0.b = (long)this.b.c;
        ejyx0.l = this.b;
        ejyx0.d = this.b.d;
        for(Object object1: ((List)object0)) {
            ejyx0.a(((SourceStatsEntity)object1));
        }
        ekif ekif0 = this.c;
        ejyy ejyy0 = new ejyy(ejyx0);
        ejze0.g(ejyy0.f, ejyy0.g, ejyy0.e);
        ekih ekih0 = ekiz0.b;
        if(ekih.J(ejyy0)) {
            ekih0.G(ejyy0, ekif0);
            return;
        }
        int v = this.e;
        ekih0.H(ejyy0, ekif0);
        if(v == 4) {
            ekih0.n(ejyy0, this.d);
            return;
        }
        if(v == 5) {
            ekiz0.a.B();
        }
    }
}

