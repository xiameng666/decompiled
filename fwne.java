import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.ext.SdkExtensions;
import com.google.android.gms.location.fused.manager.FusedLocationManager.1;
import j..util.Objects;

public final class fwne implements kar {
    @Override  // kar
    public final void accept(Object object0) {
        cmzz cmzz0 = (cmzz)object0;
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/location/fused/manager/FusedLocationManager", "enable", 0x160, "location-FusedLocationManager_enable")) {
            synchronized(cmzz0.a) {
                if(cmzz0.y) {
                    return;
                }
                cmzz0.y = true;
                cjer_LocationSettings cjer0 = cmzz0.n;
                gmcg gmcg0 = cmzz0.e;
                cjer0.h(cmzz0, gmcg0);
                cmzz0.s.d(cmzz0);
                if(cmzz0.h != null) {
                    cmzz0.A = new cnyl(cmzz0.d);
                    cmzz0.A.d(cmzz0);
                    cjer0.f(cmzz0, gmcg0);
                }
                if(huqy_phenotype.q() || huqy_phenotype.B()) {
                    cmzz0.x.c = new fvxt(cmzz0.x);
                    long v1 = huqy_phenotype.j();
                    cnxt.h(cmzz0.x.a, "LocationJumpBugreportGenerator", v1, cmzz0.x.c);
                }
                cmzz0.z.ip(cmzz0);
                cmzz0.f.h(cmzz0);
                try {
                    Location location0 = ((LocationManager)Objects.requireNonNull(((LocationManager)cmzz0.d.getSystemService("location")))).getLastKnownLocation("fused");
                    if(location0 != null) {
                        cmtm.f(location0).h();
                        cmzz0.K(location0);
                    }
                }
                catch(cmtl cmtl0) {
                    ((ggtj)((ggtj)((ggtj)cmth_FusedLocation.a.j()).s(cmtl0)).ar(6274)).x("dropping invalid initial location");
                }
                catch(SecurityException | NullPointerException unused_ex) {
                }
                if(huly.c()) {
                    if(SdkExtensions.getExtensionVersion(30) > 0) {
                        cmzz0.B = new FusedLocationManager.1(cmzz0, cmzz0.d);
                        cmzz0.w.registerDefaultNetworkCallback(cmzz0.B);
                    }
                    cmzz0.v.a(cmzz0);
                }
            }
            cnam cnam0 = cmzz0.h;
            if(cnam0 != null) {
                long v2 = huly.a.b().b();
                cnxt.h(cnam0.b, "StaleLocationDetector", v2, cnam0);
                IntentFilter intentFilter0 = new IntentFilter("android.net.wifi.STATE_CHANGE");
                jwe.b(cnam0.b, cnam0.c, intentFilter0, 2);
                IntentFilter intentFilter1 = new IntentFilter("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
                intentFilter1.addAction("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
                jwe.b(cnam0.b, cnam0.c, intentFilter1, 2);
                IntentFilter intentFilter2 = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter2.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                jwe.b(cnam0.b, cnam0.c, intentFilter2, 2);
            }
        }
    }
}

