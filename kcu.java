import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.AttributionSource;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.util.Log;
import android.uwb.AngleMeasurement;
import android.uwb.AngleOfArrivalMeasurement;
import android.uwb.DistanceMeasurement;
import android.uwb.RangingMeasurement;
import android.uwb.RangingReport;
import android.uwb.RangingSession;
import android.uwb.UwbManager;
import j..util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

public abstract class kcu {
    protected final UwbManager a;
    public final kbu b;
    public kda c;
    public kdb d;
    protected kcw e;
    public Executor f;
    public RangingSession g;
    public AtomicBoolean h;
    public Boolean i;
    public boolean j;
    protected final kde k;
    public djgj l;
    private ExecutorService m;
    private final HashMap n;
    private final Context o;
    private final boolean p;

    public kcu(Context context0, Executor executor0, kbu kbu0, kde kde0, boolean z) {
        this.h = new AtomicBoolean(false);
        this.i = Boolean.valueOf(false);
        this.l = null;
        this.j = false;
        UwbManager uwbManager0 = (UwbManager)context0.getSystemService(UwbManager.class);
        this.a = uwbManager0;
        this.o = context0;
        this.f = executor0;
        this.b = kbu0;
        kbu0.a = 3100;
        this.k = kde0;
        this.p = z;
        HashMap hashMap0 = new HashMap();
        this.n = hashMap0;
        if(Build.VERSION.SDK_INT >= 33) {
            for(Object object0: uwbManager0.getChipInfos()) {
                String s = hjme.a(((PersistableBundle)object0)).a;
                kda kda0 = kda.b();
                this.n.put(s, kda0);
            }
            return;
        }
        hashMap0.put("NO_MULTICHIP_SUPPORT", kda.b());
    }

    protected abstract int a(kcw arg1);

    protected abstract hjlk b();

    public int g() {
        synchronized(this) {
            if(!this.t()) {
                Log.w("UwbBackend", "UWB stopRanging called without an active session.");
                return 2;
            }
            this.j = false;
            if(this.h.get()) {
                kcf kcf0 = new kcf(this);
                this.b.c(kcf0, "Stop Ranging");
            }
            else {
                Log.i("UwbBackend", "UWB stopRanging called but isRanging is false.");
            }
            kbu kbu0 = this.b;
            boolean z = kbu0.c(new kcg(this), "Close Session");
            ExecutorService executorService0 = this.m;
            if(executorService0 != null) {
                executorService0.shutdown();
                this.m = null;
            }
            this.c = null;
            this.d = null;
            Boolean boolean0 = (Boolean)kbu0.c;
            if(z && boolean0 != null && boolean0.booleanValue()) {
                return 0;
            }
        }
        return 5;
    }

    protected void i(kdd kdd0) {
        synchronized(this) {
        }
    }

    protected boolean j(kda kda0) {
        Objects.requireNonNull(this.e);
        return this.e.g.contains(kda0);
    }

    public int k(djgk djgk0, ExecutorService executorService0) {
        String s;
        synchronized(this) {
            if(this.t()) {
                return 3;
            }
            if(this.n() == null) {
                return 2;
            }
            hjlk hjlk0 = this.b();
            PersistableBundle persistableBundle0 = hjlk0.b();
            Log.i("UwbBackend", "Opens UWB session with bundle parameters:");
            for(Object object0: persistableBundle0.keySet()) {
                Object object1 = persistableBundle0.get(((String)object0));
                if(object1 == null) {
                    s = "null";
                }
                else if((object1 instanceof int[])) {
                    s = Arrays.toString(((int[])object1));
                }
                else if((object1 instanceof byte[])) {
                    s = Arrays.toString(((byte[])object1));
                }
                else {
                    s = (object1 instanceof long[]) ? Arrays.toString(((long[])object1)) : object1.toString();
                }
                Log.i("UwbBackend", String.format("UWB parameter: %s, value: %s", ((String)object0), s));
            }
            this.m = executorService0;
            kbu kbu0 = this.b;
            boolean z = kbu0.c(new kck(this, hjlk0, djgk0), "Open session");
            Boolean boolean0 = (Boolean)kbu0.c;
            if(z && boolean0 != null && boolean0.booleanValue()) {
                if(hjlk0.b == 8) {
                    ggeo ggeo0 = kcz.h;
                    Integer integer0 = (int)this.k.e;
                    if(!ggeo0.containsKey(integer0)) {
                        Log.e("UwbBackend", String.format("DlTdoaRangingRounds config %d is not supported.", integer0));
                        return 1;
                    }
                    byte[] arr_b = (byte[])ggeo0.get(integer0);
                    kbu0.c(new kcl(this, new hjlg(((long)hjlk0.a), arr_b.length, arr_b)), "Update ranging rounds for Dt Tag");
                }
                boolean z1 = kbu0.c(new kcm(this), "Start ranging");
                Boolean boolean1 = (Boolean)kbu0.c;
                Objects.requireNonNull(this.m);
                if(z1 && boolean1 != null && boolean1.booleanValue()) {
                    this.j = true;
                }
                else {
                    this.m.shutdown();
                    this.m = null;
                }
                return 0;
            }
            Objects.requireNonNull(this.m);
            this.m.shutdown();
            this.m = null;
        }
        return 0;
    }

    static int l(kda kda0, kdb kdb0) {
        int v2;
        int v1;
        ghga ghga0 = ghgc.a.h();
        ghga0.l(kda0.d());
        int v = kdb0.b;
        if(v <= 12) {
            v1 = Arrays.binarySearch(glwy.n(kcz.f), v);
            v2 = 0;
        }
        else {
            v1 = Arrays.binarySearch(glwy.n(kcz.g), v);
            v2 = 1;
        }
        ghga0.j(v1 + v1 | Arrays.binarySearch(glwy.n(kcz.e), kdb0.a << 4) | v2);
        return ghga0.s().a();
    }

    public final int m(kdf kdf0) {
        Integer integer2;
        Integer integer1;
        synchronized(this) {
            if(!this.t()) {
                Log.w("UwbBackend", "Attempt to set range data notification while session is not active.");
                return 2;
            }
            int v1 = kcz.a(kdf0.a);
            Integer integer0 = v1;
            if(v1 != 2 && v1 != 5) {
                integer1 = null;
                integer2 = null;
            }
            else {
                integer2 = (int)kdf0.c;
                integer1 = (int)kdf0.b;
            }
            if(!this.v(hjma.a(null, null, null, null, null, integer0, integer1, integer2).b())) {
                Log.w("UwbBackend", "Reconfiguring range data notification config failed.");
                return 6;
            }
        }
        return 0;
    }

    public final kda n() {
        if(this.u()) {
            return this.c;
        }
        return Build.VERSION.SDK_INT >= 33 ? this.o(this.a.getDefaultChipId()) : this.o("NO_MULTICHIP_SUPPORT");
    }

    public final kda o(String s) {
        HashMap hashMap0 = this.n;
        if(hashMap0.get(s) == null) {
            hashMap0.put(s, kda.b());
        }
        kda kda0 = (kda)hashMap0.get(s);
        this.c = kda0;
        return kda0;
    }

    public final kdd p() {
        return kdd.a(this.n().d());
    }

    protected final void q(Runnable runnable0) {
        ExecutorService executorService0 = this.m;
        if(executorService0 != null) {
            executorService0.execute(runnable0);
        }
    }

    public final void r(kcw kcw0) {
        kcw kcw1 = kcw0;
        synchronized(this) {
            if(!this.p && Build.VERSION.SDK_INT <= 35 && kcw1.i.a == 0) {
                AttributionSource attributionSource0 = this.o.getAttributionSource();
                PackageManager packageManager0 = this.o.getPackageManager();
                HashSet hashSet0 = new HashSet();
                while(attributionSource0 != null) {
                    try {
                        if((packageManager0.getApplicationInfo(attributionSource0.getPackageName(), 0).flags & 0x81) == 0) {
                            hashSet0.add(attributionSource0.getPackageName());
                        }
                    }
                    catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                        Log.e("UwbBackend", "Failed to get application info for package: " + attributionSource0.getPackageName(), packageManager$NameNotFoundException0);
                    }
                    attributionSource0 = attributionSource0.getNext();
                }
                List list0 = ((ActivityManager)this.o.getSystemService("activity")).getRunningAppProcesses();
                if(list0 != null) {
                    for(Object object0: list0) {
                        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                        if(hashSet0.contains(activityManager$RunningAppProcessInfo0.processName)) {
                            String s = activityManager$RunningAppProcessInfo0.processName;
                            if(activityManager$RunningAppProcessInfo0.importance > 0x7D) {
                                Log.i("UwbBackend", "App starting ranging in background: " + s);
                                kdf kdf0 = new kdf(1, 0, 20000);
                                kcw1 = new kcw(kcw1.a, kcw1.b, kcw1.c, kcw1.d, kcw1.e, kcw1.f, kcw1.g, kcw1.h, kdf0, kcw1.j, kcw1.k, kcw1.l);
                            }
                            else {
                                continue;
                            }
                            break;
                        }
                    }
                }
            }
            if(kcw1.b == 0) {
                int v1 = this.a(kcw1);
                this.e = new kcw(kcw1.a, v1, kcw1.c, kcw1.d, kcw1.e, kcw1.f, kcw1.g, kcw1.h, kcw1.i, kcw1.j, kcw1.k, kcw1.l);
                return;
            }
            this.e = kcw1;
        }
    }

    protected final boolean s(PersistableBundle persistableBundle0) {
        synchronized(this) {
            kcj kcj0 = new kcj(this, persistableBundle0);
            boolean z = this.b.c(kcj0, "Add controlee");
            Boolean boolean0 = (Boolean)this.b.c;
            if(z && boolean0 != null && boolean0.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        return this.g != null;
    }

    public final boolean u() {
        return this.c != null;
    }

    protected final boolean v(PersistableBundle persistableBundle0) {
        synchronized(this) {
            kch kch0 = new kch(this, persistableBundle0);
            boolean z = this.b.c(kch0, "Reconfigure Ranging");
            Boolean boolean0 = (Boolean)this.b.c;
            if(z && boolean0 != null && boolean0.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    protected final boolean w(PersistableBundle persistableBundle0) {
        synchronized(this) {
            kci kci0 = new kci(this, persistableBundle0);
            boolean z = this.b.c(kci0, "Remove controlee");
            Boolean boolean0 = (Boolean)this.b.c;
            if(z && boolean0 != null && boolean0.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void x(RangingReport rangingReport0, djgk djgk0) {
        kcv kcv3;
        kcv kcv2;
        kbs kbs1;
        kcv kcv0;
        Object object1;
        synchronized(this) {
            for(Object object0: rangingReport0.getMeasurements()) {
                RangingMeasurement rangingMeasurement0 = (RangingMeasurement)object0;
                byte[] arr_b = rangingMeasurement0.getRemoteDeviceAddress().toBytes();
                if(this.k.d) {
                    arr_b = kbr.f(arr_b);
                }
                kda kda0 = kda.a(arr_b);
                if(!this.j(kda0) && !kbr.d(rangingMeasurement0)) {
                    Log.w("UwbBackend", String.format("Received ranging data from unknown peer %s.", kda0));
                }
                else {
                    if(rangingMeasurement0.getStatus() != 0) {
                        djgj djgj0 = this.l;
                        if(djgj0 != null) {
                            byte[] arr_b1 = kda0.d();
                            djgj0.a.h(arr_b1);
                        }
                    }
                    if(kbr.d(rangingMeasurement0)) {
                        PersistableBundle persistableBundle0 = rangingMeasurement0.getRangingMeasurementMetadata();
                        if(persistableBundle0.getInt("bundle_version") == 1) {
                            int v1 = persistableBundle0.getInt("message_type");
                            int v2 = persistableBundle0.getInt("message_control");
                            int v3 = persistableBundle0.getInt("block_index");
                            int v4 = persistableBundle0.getInt("round_index");
                            int v5 = persistableBundle0.getInt("nlos");
                            long v6 = persistableBundle0.getLong("tx_timestamp");
                            long v7 = persistableBundle0.getLong("rx_timestamp");
                            float f = (float)persistableBundle0.getDouble("anchor_cfo");
                            float f1 = (float)persistableBundle0.getDouble("cfo");
                            long v8 = persistableBundle0.getLong("initiator_reply_time");
                            long v9 = persistableBundle0.getLong("responder_reply_time");
                            int v10 = persistableBundle0.getInt("initiator_responder_time");
                            byte[] arr_b2 = hjlf.a(persistableBundle0.getIntArray("anchor_location"));
                            byte[] arr_b3 = hjlf.a(persistableBundle0.getIntArray("active_ranging_rounds"));
                            if(v2 == 0) {
                                object1 = null;
                                goto label_63;
                            }
                            else {
                                kbs kbs0 = new kbs(v1, v2, v3, v4, v5, v6, v7, f, f1, v8, v9, v10, arr_b2, arr_b3);
                                kcv0 = kbr.g(0.0, 0.0);
                                kbs1 = kbs0;
                                goto label_49;
                            }
                        }
                        throw new IllegalArgumentException("Invalid bundle version");
                    }
                    else {
                        DistanceMeasurement distanceMeasurement0 = rangingMeasurement0.getDistanceMeasurement();
                        if(distanceMeasurement0 == null) {
                            object1 = null;
                            goto label_63;
                        }
                        else {
                            kcv0 = kbr.g(distanceMeasurement0.getMeters(), distanceMeasurement0.getConfidenceLevel());
                            kbs1 = null;
                        }
                    }
                label_49:
                    AngleOfArrivalMeasurement angleOfArrivalMeasurement0 = rangingMeasurement0.getAngleOfArrivalMeasurement();
                    if(angleOfArrivalMeasurement0 == null) {
                    label_60:
                        kcv3 = null;
                    }
                    else {
                        AngleMeasurement angleMeasurement0 = angleOfArrivalMeasurement0.getAzimuth();
                        kcv kcv1 = angleMeasurement0 == null || kbr.e(angleMeasurement0) ? null : kbr.g(Math.toDegrees(angleMeasurement0.getRadians()), angleMeasurement0.getConfidenceLevel());
                        AngleMeasurement angleMeasurement1 = angleOfArrivalMeasurement0.getAltitude();
                        if(angleMeasurement1 != null && !kbr.e(angleMeasurement1)) {
                            kcv2 = kbr.g(Math.toDegrees(angleMeasurement1.getRadians()), angleMeasurement1.getConfidenceLevel());
                            kcv3 = kcv1;
                            goto label_62;
                        }
                        else {
                            kcv3 = kcv1;
                            goto label_61;
                        }
                        goto label_60;
                    }
                label_61:
                    kcv2 = null;
                label_62:
                    object1 = Build.VERSION.SDK_INT < 33 ? new kcx(kcv0, kcv3, kcv2, null, rangingMeasurement0.getElapsedRealtimeNanos(), 0xFFFFFF80) : new kcx(kcv0, kcv3, kcv2, kbs1, rangingMeasurement0.getElapsedRealtimeNanos(), rangingMeasurement0.getRssiDbm());
                label_63:
                    if(object1 == null) {
                        continue;
                    }
                    kdd kdd0 = kdd.a(kda0.d());
                    ((ggtj)djir.a.g(Level.INFO).ar(9033)).R("Ranging Result: %s %s", kdd0, object1);
                    byte[] arr_b4 = kdd0.a.d();
                    djgk0.a.g(arr_b4, ((kcx)object1));
                }
            }
        }
    }
}

