import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemProperties;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.d2d.data.PinFallbackPayload;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class eqza {
    public static final baun a;
    public eqzj b;
    public eqnf c;
    public final eqtn d;
    public eqhi e;
    public epwf f;
    public final cuvm g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public eqmz n;
    public String o;
    public AdvertisingInfo p;
    public int q;
    public final Context r;
    public final Handler s;
    public final eray t;
    public final cuwv u;
    private String v;
    private final ScheduledExecutorService w;
    private final cuvg x;

    static {
        eqza.a = new erqc(new String[]{"QuickStart", "TargetDeviceConnectorNearbyConnections"});
    }

    public eqza(Handler handler0, Context context0, cuvm cuvm0, eray eray0) {
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.x = new eqyy(this);
        this.u = new eqyz(this);
        this.r = context0;
        this.g = cuvm0;
        this.s = handler0;
        this.d = new eqtn(context0);
        this.t = eray0;
        this.w = Executors.newSingleThreadScheduledExecutor();
    }

    public final void a(String s) {
        long v = hyis.b();
        if(v == 0L) {
            this.g.r(s);
            return;
        }
        eqza.a.h("Delay %d milliseconds before disconnecting from endpoint %s", new Object[]{v, s});
        eqyx eqyx0 = new eqyx(this, s);
        this.w.schedule(eqyx0, v, TimeUnit.MILLISECONDS);
    }

    public final void b(byte[] arr_b, String s) {
        baun baun0 = eqza.a;
        baun0.d("validateAuthTokenAndParsePinFallbackPayload()", new Object[0]);
        eqhi eqhi0 = this.e;
        if(eqhi0 != null) {
            try {
                eqhi0.c(arr_b);
            }
            catch(GeneralSecurityException generalSecurityException0) {
                eqza.a.i("Failed to validate authentication token. Trying to parse pin fallback payload instead.", generalSecurityException0, new Object[0]);
                PinFallbackPayload pinFallbackPayload0 = new PinFallbackPayload();
                try {
                    pinFallbackPayload0.aw(arr_b);
                }
                catch(erpd erpd0) {
                    eqza.a.g("Failed to parse pin fallback payload", erpd0, new Object[0]);
                    this.a(s);
                    return;
                }
                if(!pinFallbackPayload0.b) {
                    eqza.a.d("Unexpected pin fallback payload: %s", new Object[]{pinFallbackPayload0});
                    this.a(s);
                    return;
                }
                eqmz eqmz0 = this.n;
                if(eqmz0 != null) {
                    String s1 = this.l;
                    if(s1 != null) {
                        VerificationInfo verificationInfo0 = new VerificationInfo(s1, eqmz0.a().d().h);
                        verificationInfo0.c = true;
                        eqzj eqzj0 = this.b;
                        if(eqzj0 != null) {
                            eqzj0.e(verificationInfo0);
                            this.k = true;
                            return;
                        }
                    }
                }
                return;
            }
            if(this.b != null) {
                if(hyis.v()) {
                    this.i = true;
                }
                this.b.a(new eqgo(this.g, s), new TargetConnectionArgs());
                return;
            }
            return;
        }
        baun0.m("Do not have the authenticator to validate the token", new Object[0]);
    }

    static void c(eqza eqza0) {
        eqza0.k = false;
    }

    public final void d(int v, AdvertisingInfo advertisingInfo0) {
        eqmz eqmz0;
        gjpi gjpi0;
        String s2;
        byte[] arr_b1;
        this.q = v;
        this.p = advertisingInfo0;
        this.v = advertisingInfo0.d;
        this.o = advertisingInfo0.c;
        eqtn eqtn0 = this.d;
        if(eqtn0 != null && advertisingInfo0.e) {
            byte[] arr_b = bbmu.f(this.v);
            String s = SystemProperties.get("ro.quick_start.device_id", "");
            String s1 = SystemProperties.get("ro.quick_start.oem_id", "");
            gync gync0 = v == 2 ? gync.c : gync.a;
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                try {
                    eqtn.e.d(a.l(s1, s, "Creating model ID based on deviceId = ", ", oemId = "), new Object[0]);
                    arr_b1 = gynd.b(gync0, s1, s).c();
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    eqtn.e.m("Failed to create extended model ID: %s", new Object[]{illegalArgumentException0.getMessage()});
                    arr_b1 = null;
                }
            }
            else {
                arr_b1 = null;
            }
            if(arr_b1 == null) {
                switch(v) {
                    case 1: {
                        s2 = null;
                        break;
                    }
                    case 2: {
                        s2 = "0300e089dbf71048";
                        break;
                    }
                    default: {
                        if(!gfqz.e(Build.MANUFACTURER, "google")) {
                            if(Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                                String s3 = SystemProperties.get("ril.product_code").length() < 7 ? SystemProperties.get("ril.product_code") : SystemProperties.get("ril.product_code").substring(0, 7);
                                s2 = (String)eqtn.f.getOrDefault(s3, null);
                            }
                            else {
                                s2 = null;
                            }
                        }
                        else if(gfqz.e(Build.DEVICE, "husky")) {
                            s2 = "181AB1";
                        }
                        else if(gfqz.e(Build.DEVICE, "shiba")) {
                            s2 = "D362FE";
                        }
                        else {
                            s2 = null;
                        }
                    }
                }
                if(s2 == null) {
                    s2 = "41C0D9";
                }
                byte[] arr_b2 = eqtn.c(s2);
                if(arr_b2.length != 3 && arr_b2.length != 8) {
                    eqtn.e.m("Model ID %s is not valid", new Object[]{s2});
                    arr_b1 = null;
                }
                else {
                    arr_b1 = arr_b2;
                }
            }
            eqtn0.b(arr_b, arr_b1);
        }
        boolean z = advertisingInfo0.e || hyis.a.k().D();
        AdvertisingOptions advertisingOptions0 = new AdvertisingOptions();
        advertisingOptions0.a = Strategy.c;
        cuut.a(advertisingOptions0);
        advertisingOptions0.C = z;
        AdvertisingOptions.a(advertisingOptions0);
        advertisingOptions0.y = new int[]{2, 4};
        advertisingOptions0.x = new int[]{2, 4};
        advertisingOptions0.A = 3;
        cuut.d(advertisingOptions0);
        Context context0 = this.r;
        int v1 = (int)hyim.b();
        String s4 = advertisingInfo0.b;
        String s5 = advertisingInfo0.d;
        if(v1 == 1) {
            if(erpa.b(context0)) {
            label_73:
                gjpi0 = gjpi.g;
            }
            else {
                AccessibilityManager accessibilityManager0 = (AccessibilityManager)context0.getApplicationContext().getSystemService("accessibility");
                if(accessibilityManager0 != null && accessibilityManager0.isEnabled()) {
                    for(Object object0: accessibilityManager0.getEnabledAccessibilityServiceList(-1)) {
                        if(!((AccessibilityServiceInfo)object0).getId().equals("com.google.android.apps.accessibility.voiceaccess/.JustSpeakService")) {
                            continue;
                        }
                        goto label_73;
                    }
                }
                gjpi0 = gjpi.f;
            }
            byte b = (byte)erei.b(context0, v);
            eqmx eqmx0 = new eqmx();
            eqnc.c(eqsh.h(context0), eqmx0);
            eqnc.d(gjpi0, eqmx0);
            byte[] arr_b3 = eqmx0.b;
            arr_b3[13] = b;
            if(advertisingInfo0.e) {
                arr_b3[15] = 1;
                eqza.a.d("Pin fallback support enabled", new Object[0]);
            }
            arr_b3[14] = eqxk.a(context0);
            if(s5 != null) {
                eqnc.b(s5, eqmx0);
            }
            try {
                eqmz0 = eqnc.a(s4, eqmx0);
            }
            catch(eqne eqne0) {
                eqza.a.n("Failed building advertisement-v1, reverting to v0", eqne0, new Object[0]);
                eqmz0 = new eqnb(s4);
            }
        }
        else {
            eqmz0 = new eqnb(s4);
        }
        String s6 = eqmz0.b();
        String s7 = hyim.f();
        eqmo eqmo0 = new eqmo(this.s, this.x);
        evql evql0 = this.g.m(s6, s7, eqmo0, advertisingOptions0);
        try {
            evrg.n(evql0);
            this.n = eqmz0;
        }
        catch(ExecutionException | InterruptedException exception0) {
            Exception exception1 = evql0.i();
            if((exception1 instanceof aztb)) {
                int v2 = ((aztb)exception1).b();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((eqoc)hftv0).c = 1;
                ((eqoc)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eqoc eqoc0 = (eqoc)hftp0.b_message;
                eqoc0.b |= 2;
                eqoc0.d = v2;
                eqoc eqoc1 = (eqoc)hftp0.N_build();
                eqzj eqzj0 = this.b;
                if(eqzj0 != null) {
                    eqzj0.d(10804, eqoc1);
                }
            }
            eqza.a.n("Failed to advertise", exception0, new Object[0]);
            if(exception1 != null) {
                evrg.c(exception1);
                return;
            }
        }
        evrg.d(null);
    }

    public final void e() {
        if(this.b != null) {
            eqza.a.h("Stopping advertising.", new Object[0]);
            this.g.s();
        }
        eqtn eqtn0 = this.d;
        if(eqtn0 != null) {
            eqtn0.a();
        }
        this.b = null;
        String s = this.m;
        if(s == null) {
            evrg.d(null);
            return;
        }
        eqza.a.h("Disconnecting from %s", new Object[]{s});
        this.a(s);
        this.i = false;
        this.m = null;
        evrg.d(null);
    }
}

