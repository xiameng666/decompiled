import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest.Builder;
import com.google.android.location.geofencer.service.GeofencerStateMachine.1;
import java.util.HashMap;

public final class fwnh implements kar {
    @Override  // kar
    public final void accept(Object object0) {
        husx.a.b().a();
        Context context0 = ((fwjq)object0).a;
        fwjt fwjt0 = ((fwjq)object0).b;
        fgvy fgvy0 = new fgvy();
        fyas fyas0 = new fyas(context0);
        bblp bblp0 = new bblp(1, 9);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gktf.a).v_newBuilder();
        boolean z = bbmn.u(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gktf gktf0 = (gktf)hftp0.b_message;
        gktf0.b |= 1;
        gktf0.c = z;
        boolean z1 = bbmq.T();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gktf gktf1 = (gktf)hftp0.b_message;
        gktf1.b |= 2;
        gktf1.d = z1;
        ((fwjq)object0).d = new fwjp(context0, fgvy0, fwjt0, fyas0, bblp0, hftp0);
        fwjp fwjp0 = ((fwjq)object0).d;
        fwkt fwkt0 = fwjp0.S;
        if(fwkt0 != null) {
            HashMap hashMap0 = fwkt0.l;
            int v = 0;
            for(Object object1: hashMap0.values()) {
                fwks fwks0 = (fwks)object1;
                int v1 = 0;
                while(fwks0 != null) {
                    ++v1;
                    fwks0 = null;
                }
                if(v < v1) {
                    v = v1;
                }
            }
            fwkt0.c = new fwks[v];
            fwkt0.e = new fwks[v];
            fwks fwks1 = (fwks)hashMap0.get(fwkt0.m);
            fwkt0.f = 0;
            while(fwks1 != null) {
                int v2 = fwkt0.f;
                fwkt0.e[v2] = fwks1;
                fwkt0.f = v2 + 1;
                fwks1 = null;
            }
            fwkt0.d = -1;
            fwkt0.a();
            fwkt0.g.t(new fwka(-2, 0, fwkt.a));
            fwkt fwkt1 = fwjp0.S;
            if(fwkt1 != null) {
                fwkt1.c();
            }
        }
        bait bait0 = new bait();
        fwjp0.m.g.b = new baiw(fwjp0.m.g.d, fwjp0.m.g.a, bait0, 2);
        jwe.b(fwjp0.l, fwjp0.x, fwjp0.w, 2);
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.USER_FOREGROUND");
        intentFilter0.addAction("android.intent.action.USER_BACKGROUND");
        jwe.b(fwjp0.l, fwjp0.x, intentFilter0, 2);
        IntentFilter intentFilter1 = new IntentFilter("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
        intentFilter1.addAction("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
        jwe.b(fwjp0.l, fwjp0.x, intentFilter1, 2);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter2.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
        intentFilter2.addDataScheme("package");
        jwe.b(fwjp0.l, fwjp0.x, intentFilter2, 2);
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("com.google.android.gms.INSTANT_APP_STOPPED");
        jwe.c(fwjp0.l, fwjp0.x, intentFilter3, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
        fyap fyap0 = fwjp0.H;
        if(fyap0 != null) {
            fwiv fwiv0 = new fwiv(fwjp0);
            synchronized(fyap0.d) {
                if(fyap0.g == null) {
                    IntentFilter intentFilter4 = new IntentFilter("android.net.wifi.STATE_CHANGE");
                    jwe.b(fyap0.a, fyap0.b, intentFilter4, 2);
                }
                fyap0.g = fwiv0;
            }
        }
        Context context1 = fwjp0.l;
        if(fwjp.j(context1) && bbqa.d()) {
            if(fwjp0.I == null) {
                fwjp0.I = (ConnectivityManager)context1.getSystemService("connectivity");
            }
            fwjp0.J = new GeofencerStateMachine.1(fwjp0, context1);
            fwjp0.I.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), fwjp0.J);
        }
        bblp bblp1 = new bblp(1, 9);
        fwjp0.B.a.h(fwjp0.B.b, bblp1);
        fwjp0.m.e.g();
        fwjt0.b(((fwjq)object0).d);
    }
}

