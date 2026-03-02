import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.proximity.BlePeripheralChimeraService;
import com.google.android.gms.auth.proximity.NearbyConnectionsIntentOperation;
import com.google.android.gms.auth.proximity.Role;

public final class akvq {
    public static final baun a;
    private static final String[] b;

    static {
        akvq.a = new baun("ProximityAuth", new String[]{"ChannelServices"});
        akvq.b = new String[]{"com.google.android.gms.auth.proximity.BlePeripheralService"};
    }

    public static void a(Context context0) {
        if(hpzq.d()) {
            context0.startService(BlePeripheralChimeraService.d(context0));
        }
    }

    public static void b(Context context0, akzn akzn0) {
        bbmq.G(context0, akvq.b[0], true);
        int v = akzn0.a();
        Intent intent0 = BlePeripheralChimeraService.d(context0);
        if(Role.b(v)) {
            akvq.a.h("Starting BlePeripheralService...", new Object[0]);
            context0.startService(intent0);
        }
        else {
            context0.stopService(intent0);
        }
        if(hpzm.T()) {
            akyf akyf0 = akyf.c(context0);
            if(Role.e(v)) {
                synchronized(akyf.class) {
                    if(!akyf0.d) {
                        try {
                            akyf0.e();
                            akyf0.g.a().h();
                            akyf0.d = true;
                        }
                        catch(ywm ywm0) {
                            a.ae(akyf.a.j(), "startAdvertising error", ywm0);
                        }
                    }
                }
            }
            else {
                synchronized(akyf.class) {
                    if(akyf0.d) {
                        try {
                            akyf0.e();
                            akyf0.g.a().i();
                            akyf0.d = false;
                        }
                        catch(ywm ywm1) {
                            a.ae(akyf.a.j(), "stopAdvertising error", ywm1);
                        }
                    }
                }
            }
            if(bbpj.a(context0).h()) {
                context0.startService(NearbyConnectionsIntentOperation.b(context0));
            }
            return;
        }
        if(Role.e(v)) {
            context0.startService(NearbyConnectionsIntentOperation.a(context0));
            return;
        }
        context0.startService(NearbyConnectionsIntentOperation.b(context0));
    }
}

