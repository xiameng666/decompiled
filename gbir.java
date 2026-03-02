import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import java.util.LinkedHashSet;

public final class gbir implements gbhm {
    private final Context a;
    private final boolean b;
    private final boolean c;
    private final long d;

    public gbir(Context context0, boolean z, boolean z1) {
        ibuq.f(context0, "appContext");
        super();
        this.a = context0;
        this.b = z;
        this.c = z1;
        gaxl.a();
        this.d = gaxm.t();
    }

    @Override  // gbhm
    public final int a() {
        return 2;
    }

    @Override  // gbhm
    public final long b() {
        return this.d;
    }

    @Override  // gbhm
    public final Object c() {
        hhdd hhdd5;
        Location location0;
        if(this.b) {
            Context context0 = this.a;
            if(gcvj.e(context0)) {
                try {
                    LocationManager locationManager0 = (LocationManager)context0.getSystemService(LocationManager.class);
                    ibvd ibvd0 = new ibvd();
                    if(locationManager0 == null) {
                        location0 = null;
                    }
                    else {
                        location0 = locationManager0.getLastKnownLocation("network");
                        Boolean.valueOf(((boolean)(this.c ^ 1))).getClass();
                        ibvd0.a = locationManager0.getLastKnownLocation("gps");
                    }
                    Location location1 = (Location)ibvd0.a;
                    boolean z = location1 == null ? false : location1.isMock();
                    if(location0 == null) {
                        hhdd5 = null;
                    }
                    else {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhdd.a).v_newBuilder();
                        double f = location0.getLatitude();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hhdd hhdd0 = (hhdd)hftp0.b_message;
                        hhdd0.b |= 2;
                        hhdd0.d = f;
                        double f1 = location0.getLongitude();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hhdd hhdd1 = (hhdd)hftp0.b_message;
                        hhdd1.b |= 4;
                        hhdd1.e = f1;
                        double f2 = (double)location0.getTime();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hhdd hhdd2 = (hhdd)hftp0.b_message;
                        hhdd2.b |= 16;
                        hhdd2.g = f2;
                        double f3 = location0.getAltitude();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hhdd hhdd3 = (hhdd)hftp0.b_message;
                        hhdd3.b |= 1;
                        hhdd3.c = f3;
                        float f4 = location0.getAccuracy();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((hhdd)hftv0).b |= 8;
                        ((hhdd)hftv0).f = f4;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hhdd hhdd4 = (hhdd)hftp0.b_message;
                        hhdd4.b |= 0x20;
                        hhdd4.h = z;
                        hhdd5 = (hhdd)hftp0.N_build();
                    }
                }
                catch(NullPointerException unused_ex) {
                    hhdd5 = null;
                }
            }
            else {
                hhdd5 = null;
            }
        }
        else {
            hhdd5 = null;
        }
        Context context1 = this.a;
        boolean z1 = Settings.Secure.getInt(context1.getContentResolver(), "install_non_market_apps", 0) == 1;
        Intent intent0 = jwe.b(context1, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 2);
        int v = -1;
        if(intent0 != null) {
            int v1 = intent0.getIntExtra("level", -1);
            int v2 = intent0.getIntExtra("scale", -1);
            if(v2 > 0) {
                v = v1 * 100 / v2;
            }
        }
        boolean z2 = Settings.Global.getInt(context1.getContentResolver(), "adb_enabled", 0) == 1;
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        gaxl.a();
        if(hziw.c()) {
            linkedHashSet0.add(hcin.b);
            linkedHashSet0.add(hcin.d);
        }
        return new gbiq(v, z2, z1, hhdd5, linkedHashSet0);
    }

    @Override  // gbhm
    public final void d(Object object0, Object object1) {
        gbiq gbiq0 = (gbiq)object1;
        ibuq.f(object0, "setter");
        ((gbis)object0).N(gbiq0.d);
        ((gbis)object0).F(gbiq0.c);
        ((gbis)object0).k(gbiq0.a);
        ((gbis)object0).v(gbiq0.b);
        ((gbis)object0).T(gbiq0.e);
    }
}

