import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.wifi.rtt.WifiRttManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class fvlv extends fvnr {
    final List a;
    private final boolean b;
    private final fvok c;
    private final Context d;
    private final int e;
    private final int f;
    private boolean g;

    public fvlv(Context context0, Set set0, boolean z, Map map0, fvok fvok0, fvnx fvnx0, fvsd fvsd0, fwzx fwzx0, long v, long v1, long v2, long v3, fvls fvls0, boolean z1, fvlt fvlt0, fybc fybc0, fwyc fwyc0, int v4, int v5, boolean z2) {
        fvlv fvlv0;
        ArrayList arrayList2;
        boolean z7;
        int v8;
        fvls fvls1;
        fvpt fvpt0;
        ArrayList arrayList1;
        Context context1 = context0;
        super(fvls0, fvlt0, fybc0);
        this.g = false;
        this.d = context1;
        this.c = fvok0;
        this.f = v4;
        this.e = v5;
        fvns fvns0 = fvns.m;
        if(set0.contains(fvns0) && set0.contains(fvns.w)) {
            throw new IllegalArgumentException("Can\'t collect both sound features and raw audio.");
        }
        ArrayList arrayList0 = new ArrayList();
        int v6 = fvok0 == null ? 0 : 1;
        if(set0.contains(fvns.b)) {
            TelephonyManager telephonyManager0 = (TelephonyManager)context1.getSystemService(TelephonyManager.class);
            int v7 = telephonyManager0 == null || !context1.getPackageManager().hasSystemFeature("android.hardware.telephony") ? 0 : 1;
            if(Build.VERSION.SDK_INT >= 33) {
                v7 &= context1.getPackageManager().hasSystemFeature("android.hardware.telephony.radio.access");
            }
            if(v6 == 0 && v7 != 0) {
                arrayList0.add(new fvld(telephonyManager0, v3, fvls0, this.k, this.j));
            }
        }
        if(set0.contains(fvns.a)) {
            gftb.r(fwzx0 != null, "wifiService can\'t be null when WiFi scan is requested.");
            if(v6 == 0 && fwzx0.a()) {
                WifiRttManager wifiRttManager0 = set0.contains(fvns.t) ? ((WifiRttManager)context1.getSystemService("wifirtt")) : null;
                if(fvlv.a(context1)) {
                    arrayList1 = arrayList0;
                    fvpt0 = new fvpt(context1, fvls0, this.k, this.j, fwyc0, v, wifiRttManager0);
                    context1 = context0;
                }
                else {
                    arrayList1 = arrayList0;
                    context1 = context0;
                    fvpt0 = new fvpr(context1, fvls0, this.k, this.j, v);
                }
                arrayList1.add(fvpt0);
            }
            else {
                arrayList1 = arrayList0;
            }
        }
        else {
            arrayList1 = arrayList0;
        }
        if(set0.contains(fvns0)) {
            fvls1 = fvls0;
            arrayList1.add(new fvon(context1, fvls1, this.k, this.j, new fxbi(context1)));
        }
        else if(set0.contains(fvns.w)) {
            fvls1 = fvls0;
            arrayList1.add(new fvnj(context1, fvls1, this.k, this.j, new fxbi(context1), v4, v5));
        }
        else {
            fvls1 = fvls0;
        }
        if(set0.contains(fvns.p)) {
            arrayList1.add(new fvly(context1, fvls1, this.k, this.j));
        }
        if(set0.contains(fvns.s)) {
            BluetoothAdapter bluetoothAdapter0 = bahu.a(context1);
            if(bluetoothAdapter0 != null && bluetoothAdapter0.isEnabled()) {
                arrayList1.add(new fvky(context1, fvls1, this.k, this.j));
            }
        }
        boolean z3 = set0.contains(fvns.g);
        boolean z4 = set0.contains(fvns.h);
        boolean z5 = set0.contains(fvns.q);
        boolean z6 = set0.contains(fvns.r);
        if(z3) {
            if(v6 == 0) {
                z7 = z6;
                v8 = 0;
            }
            else {
                z7 = z6;
                v8 = 1;
            }
        label_84:
            LocationManager locationManager0 = (LocationManager)context1.getSystemService("location");
            if(1 == v8) {
                arrayList2 = arrayList1;
                goto label_96;
            label_95:
                arrayList2 = arrayList1;
            }
            else {
                try {
                    if(locationManager0.isProviderEnabled("gps")) {
                        arrayList2 = arrayList1;
                        goto label_88;
                    }
                    else {
                        arrayList2 = arrayList1;
                    }
                    goto label_96;
                }
                catch(SecurityException unused_ex) {
                    goto label_95;
                }
                try {
                label_88:
                    arrayList2.add(new fvmy(context1, z3, z4, z5, z, z7, fvsd0, fvls1, this.k, this.j, v1));
                }
                catch(SecurityException unused_ex) {
                }
            }
        }
        else if(z4) {
            if(v6 == 0) {
                z7 = z6;
                v8 = 0;
            }
            else {
                z7 = z6;
                v8 = 1;
            }
            goto label_84;
        }
        else if(z5) {
            if(v6 == 0) {
                z7 = z6;
                v8 = 0;
            }
            else {
                z7 = z6;
                v8 = 1;
            }
            goto label_84;
        }
        else if(z6) {
            v8 = v6;
            z7 = true;
            goto label_84;
        }
        else {
            try {
                arrayList2 = arrayList1;
            }
            catch(SecurityException unused_ex) {
                goto label_95;
            }
        }
    label_96:
        fvns fvns1 = fvns.v;
        if(set0.contains(fvns1)) {
            LocationManager locationManager1 = (LocationManager)context1.getSystemService("location");
            try {
                if(locationManager1.isProviderEnabled("fused") && set0.contains(fvns1)) {
                    goto label_103;
                }
                else {
                    goto label_107;
                }
            }
            catch(SecurityException unused_ex) {
                fvlv0 = this;
            }
            goto label_110;
            try {
            label_103:
                fvlv0 = this;
                arrayList2.add(new fvme(context1, fvls0, fvlv0.k, fvlv0.j, v2, z2));
            }
            catch(SecurityException unused_ex) {
            }
        }
        else {
        label_107:
            fvlv0 = this;
        }
    label_110:
        ArrayList arrayList3 = new ArrayList();
        SensorManager sensorManager0 = (SensorManager)context1.getSystemService("sensor");
        for(Object object0: map0.keySet()) {
            Integer integer0 = (Integer)object0;
            List list0 = sensorManager0.getSensorList(integer0.intValue());
            if(list0 == null || list0.isEmpty()) {
                arrayList3.add(integer0);
            }
        }
        int v9 = arrayList3.size();
        for(int v10 = 0; v10 < v9; ++v10) {
            map0.remove(((Integer)arrayList3.get(v10)));
        }
        if(!map0.isEmpty()) {
            arrayList2.add(new fvnw(context1, fvok0, map0, fvnx0, fvls0, fvlv0.k, fvlv0.j));
        }
        fvlv0.a = arrayList2;
        fvlv0.b = z1;
    }

    static final boolean a(Context context0) {
        try {
            return context0.checkSelfPermission("android.permission.LOCATION_HARDWARE") == 0 && context0.getSystemService("wifiscanner") != null;
        }
        catch(NoSuchMethodError unused_ex) {
            return false;
        }
    }

    @Override  // fvnr
    protected final void b() {
        synchronized(this) {
            for(Object object0: this.a) {
                ((fvnr)object0).l(this);
            }
            fvok fvok0 = this.c;
            if(fvok0 != null) {
                if(fvok0.g) {
                    if(!this.g) {
                        fvok0.c(this.n, this.d);
                        AlarmManager alarmManager0 = (AlarmManager)this.d.getSystemService("alarm");
                        fvok0.l = "com.google.location.lbs.collectionlib.BATCHING_ALARM." + fvok.a.incrementAndGet();
                        Intent intent0 = new Intent(fvok0.l);
                        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(this.d, 0, intent0, 0x2000000);
                        gfuy.e(pendingIntent0);
                        fvok0.k = pendingIntent0;
                        IntentFilter intentFilter0 = new IntentFilter(fvok0.l);
                        jwe.b(this.d, fvok0.m, intentFilter0, 2);
                        alarmManager0.setAndAllowWhileIdle(2, 30000L, fvok0.k);
                        fvok0.j = alarmManager0;
                        this.g = true;
                        return;
                    }
                    fvok0.d();
                    return;
                }
                fvok0.c(this.n, this.d);
            }
        }
    }

    @Override  // fvnr
    protected final void c() {
        for(Object object0: this.a) {
            ((fvnr)object0).j();
        }
        fvlt fvlt0 = this.k;
        if(fvlt0 != null) {
            fvlt0.b();
        }
        if(this.b) {
            this.m.b();
        }
    }
}

