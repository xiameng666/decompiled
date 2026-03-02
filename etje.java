import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etje implements lqj {
    public final RequestTokenizeChimeraActivity a;

    public etje(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        int v3;
        int v2;
        int v1;
        String s2;
        if(((etli)object0) == null) {
            return;
        }
        RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0 = this.a;
        boolean z = false;
        if(((etli)object0).d) {
            requestTokenizeChimeraActivity0.v = 0;
            hjxg hjxg0 = ((etli)object0).a;
            String s = hjxg0.d;
            PushTokenizeRequest pushTokenizeRequest0 = requestTokenizeChimeraActivity0.y;
            batl.s(pushTokenizeRequest0);
            requestTokenizeChimeraActivity0.q(s, pushTokenizeRequest0, ((etli)object0).c, (((etli)object0).g ? hjxg0.c : 0L), ((etli)object0).b, (hjxg0.k == null ? hjxf.a : hjxg0.k), ((gtmu.b(hjxg0.h) == null ? gtmu.e : gtmu.b(hjxg0.h)) == gtmu.c || ((etli)object0).f ? "fitbit" : "androidpay"), hjxg0.e);
            return;
        }
        int v = requestTokenizeChimeraActivity0.v + 1;
        requestTokenizeChimeraActivity0.v = v;
        String s1 = null;
        if(v > 3) {
            s2 = hyus.a.c().f();
            v1 = 0x7F150870;  // string:common_got_it "Got it"
            v2 = 0x7F1531AA;  // string:tp_device_not_connecting_message "We\'re having trouble connecting your device 
                              // to your phone. For help, read our <a href=#>troubleshooting tips</a>"
            v3 = 0x7F1531AB;  // string:tp_device_not_connecting_title "Device isn\'t connecting"
        }
        else {
            v2 = 0x7F1531AC;  // string:tp_device_unreachable_message "Make sure your device is connected to your 
                              // phone and bluetooth is on"
            v3 = 0x7F1531AD;  // string:tp_device_unreachable_title "Device not connected"
            z = true;
            v1 = 0x7F1508F2;  // string:common_try_again "Try again"
            s2 = null;
        }
        evph evph0 = new evph();
        evph0.a = 1003;
        evph0.b = requestTokenizeChimeraActivity0.getString(v3);
        evph0.f = 0x7F080CE0;  // drawable:quantum_ic_cloud_off_vd_theme_24
        evph0.c = requestTokenizeChimeraActivity0.getString(v2);
        evph0.b();
        evph0.d = requestTokenizeChimeraActivity0.getString(v1);
        if(z) {
            s1 = "Cancel";
        }
        evph0.e = s1;
        evph0.k = s2;
        evph0.a().show(requestTokenizeChimeraActivity0.getSupportFragmentManager(), "RequestTokenizeAct");
    }
}

