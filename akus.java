import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.ParcelUuid;
import com.google.android.gms.auth.proximity.BleBackgroundAdvertiser.WakeUpBroadcastReceiver;
import com.google.android.gms.auth.proximity.NearbyConnectionsIntentOperation;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubChimeraService;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class akus {
    public static final baun a;
    public static final long b;
    public static final ParcelUuid c;
    public final akwm d;
    public String e;
    public BluetoothLeAdvertiser f;
    public AdvertiseCallback g;
    public boolean h;
    public boolean i;
    public akuq j;
    public long k;
    public aliv l;
    private final Context m;
    private final BluetoothAdapter n;
    private final akxd o;
    private final bbib p;
    private BleBackgroundAdvertiser.WakeUpBroadcastReceiver q;

    static {
        akus.a = new baun("ProximityAuth", new String[]{"BleBackgroundAdvertiser"});
        akus.b = TimeUnit.SECONDS.toMillis(5L);
        akus.c = new ParcelUuid(UUID.fromString("0000fe50-0000-1000-8000-00805f9b34fb"));
    }

    public akus(Context context0) {
        Context context1 = context0.getApplicationContext();
        BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
        akwm akwm0 = new akwm();
        akwq akwq0 = new akwq();
        bbib bbib0 = new bbib(context0.getApplicationContext());
        super();
        this.f = null;
        this.k = 0L;
        this.m = context1;
        this.n = bluetoothAdapter0;
        this.d = akwm0;
        this.o = akwq0;
        this.p = bbib0;
        this.h = false;
        this.i = false;
        if(hpzm.B()) {
            this.l = aliv.a();
        }
    }

    public final BluetoothLeAdvertiser a() {
        BluetoothAdapter bluetoothAdapter0 = this.n;
        if(bluetoothAdapter0 != null && bluetoothAdapter0.getBluetoothLeAdvertiser() != null) {
            return bluetoothAdapter0.getBluetoothLeAdvertiser();
        }
        if(hpyn.e()) {
            return this.f == null ? null : this.f;
        }
        return null;
    }

    public final void b() {
        if(this.q == null) {
            BleBackgroundAdvertiser.WakeUpBroadcastReceiver bleBackgroundAdvertiser$WakeUpBroadcastReceiver0 = new BleBackgroundAdvertiser.WakeUpBroadcastReceiver(this);
            this.q = bleBackgroundAdvertiser$WakeUpBroadcastReceiver0;
            IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.auth.proximity.BleBackgroundAdvertiser.ALARM");
            jwe.b(this.m, bleBackgroundAdvertiser$WakeUpBroadcastReceiver0, intentFilter0, 4);
        }
        PendingIntent pendingIntent0 = this.g();
        this.p.g("BleBackgroundAdvertiser", 0, System.currentTimeMillis() + hpyn.b(), pendingIntent0);
    }

    public final void c(akup akup0) {
        if(this.h) {
            akup0.b();
            return;
        }
        this.h = true;
        this.i = NearbyConnectionsIntentOperation.b;
        akun akun0 = new akun(this, new aliu(), akup0);
        this.o.a(akun0);
        if(hpzm.K() && (PhoneHubChimeraService.d != null && PhoneHubChimeraService.d.i.d().isEmpty())) {
            Intent intent0 = NearbyConnectionsIntentOperation.a(this.m);
            this.m.startService(intent0);
        }
    }

    public final void d() {
        baun baun0 = akus.a;
        baun0.h("Stopping advertising.", new Object[0]);
        if(this.h) {
            BleBackgroundAdvertiser.WakeUpBroadcastReceiver bleBackgroundAdvertiser$WakeUpBroadcastReceiver0 = this.q;
            if(bleBackgroundAdvertiser$WakeUpBroadcastReceiver0 == null) {
                baun0.m("BroadcastReceiver not registered.", new Object[0]);
            }
            else {
                this.m.unregisterReceiver(bleBackgroundAdvertiser$WakeUpBroadcastReceiver0);
                this.q = null;
            }
            PendingIntent pendingIntent0 = this.g();
            this.p.a(pendingIntent0);
            BluetoothLeAdvertiser bluetoothLeAdvertiser0 = this.a();
            if(bluetoothLeAdvertiser0 != null) {
                AdvertiseCallback advertiseCallback0 = this.g;
                if(advertiseCallback0 != null) {
                    bluetoothLeAdvertiser0.stopAdvertising(advertiseCallback0);
                }
            }
            this.f(5, 2);
            this.h = false;
            this.e = null;
            this.g = null;
            this.f = null;
        }
    }

    static void e(akus akus0) {
        akus0.h = false;
    }

    public final void f(int v, int v1) {
        if(hpzm.B()) {
            aliv aliv0 = this.l;
            if(aliv0 != null && hpzm.B()) {
                aliv0.b();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzzp.a).v_newBuilder();
                aliv0.e(hftp0, "BleAdvertisementEvent");
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzzl.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gzzl)hftv0).c = v - 1;
                ((gzzl)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gzzl)hftp1.b_message).d = v1 - 1;
                ((gzzl)hftp1.b_message).b |= 2;
                gzzl gzzl0 = (gzzl)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzzp gzzp0 = (gzzp)hftp0.b_message;
                gzzl0.getClass();
                gzzp0.d = gzzl0;
                gzzp0.c = 2;
                cdzd.v().j(((ProtoLiteMessage)(((gzzp)hftp0.N_build()))));
            }
        }
    }

    private final PendingIntent g() {
        Intent intent0 = new Intent("com.google.android.gms.auth.proximity.BleBackgroundAdvertiser.ALARM").setPackage("com.google.android.gms");
        return PendingIntent.getBroadcast(this.m, 0, intent0, 0xA000000);
    }
}

