import android.content.Context;
import android.content.Intent;

public final class crkc {
    private final crkb a;

    public crkc(crkb crkb0) {
        this.a = crkb0;
    }

    public final void a(Context context0, Intent intent0) {
        crkt crkt0 = crkt.i(context0);
        crji crji0 = crkt0.aJ();
        if(intent0 == null) {
            crji0.f.a("Receiver called with null intent");
            return;
        }
        boolean z = crkt0.c.a;
        String s = intent0.getAction();
        if(z) {
            crji0.k.b("Device receiver got", s);
        }
        else {
            crji0.k.b("Local receiver got", s);
        }
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            Intent intent1 = new Intent().setClassName(context0, (z ? "com.google.android.gms.measurement.PackageMeasurementService" : "com.google.android.gms.measurement.AppMeasurementService"));
            intent1.setAction("com.google.android.gms.measurement.UPLOAD");
            crji0.k.a("Starting wakeful intent.");
            this.a.c(context0, intent1);
            return;
        }
        if("com.android.vending.INSTALL_REFERRER".equals(s)) {
            crji0.f.a("Install Referrer Broadcasts are deprecated");
        }
    }
}

