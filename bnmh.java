import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.findmydevice.spot.bleadvertising.EddystoneAdvertisingSchedulerImpl.AlarmBroadcastReceiver;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@ibnh
public final class bnmh implements bnmg {
    public static final bboh a;
    public final cljp b;
    private static final ByteString c;
    private final Object d;
    private boolean e;
    private PendingIntent f;
    private ByteString g;
    private final bnmc h;
    private final bbib i;
    private final EddystoneAdvertisingSchedulerImpl.AlarmBroadcastReceiver j;
    private final Random k;
    private final fgvt l;
    private final Context m;
    private int n;

    static {
        bnmh.a = bboh.b("AdvertisingScheduler", bbcu.eD);
        bnmh.c = ByteString.B("40");
    }

    public bnmh(bnmc bnmc0, Random random0, fgvt fgvt0, Context context0) {
        this.d = new Object();
        this.e = false;
        this.h = bnmc0;
        this.i = new bbib(context0);
        this.j = new EddystoneAdvertisingSchedulerImpl.AlarmBroadcastReceiver(this, context0);
        this.b = cljp.a(context0);
        this.k = random0;
        this.l = fgvt0;
        this.m = context0;
    }

    @Override  // bnmg
    public final void a() {
        synchronized(this.d) {
            if(!this.e) {
                return;
            }
            ByteString hfsf0 = fqvf.m(this.n, this.g, 10, ((int)TimeUnit.MILLISECONDS.toSeconds(this.l.d().toEpochMilli())));
            ByteString hfsf1 = bnmh.c.t(hfsf0);
            this.h.a(hfsf1);
            long v1 = (long)this.k.nextInt(60);
            long v2 = this.l.d().toEpochMilli() + TimeUnit.SECONDS.toMillis(0x478L + v1);
            clkn clkn0 = new clkn();
            clkn0.e(964L + v1, v1 + 1084L);
            clkn0.g(2);
            clkn0.r(false);
            clkn0.p = false;
            clkn0.v(1);
            clkn0.w("com.google.android.gms.findmydevice.spot.bleadvertising.EddystoneEidRotationService");
            clkn0.q("FMD_SPOT_EER");
            clko clko0 = clkn0.a();
            this.b.f(clko0);
            this.i.g("SpotEddystoneAdvertisement", 0, v2, this.f);
        }
    }

    @Override  // bnmg
    public final void b() {
        synchronized(this.d) {
            if(!this.e) {
                return;
            }
            ((ggtj)bnmh.a.h()).x("Stopping Eddystone BLE advertisement.");
            this.e = false;
            this.h.b();
            this.i.a(this.f);
            this.f.cancel();
            this.m.unregisterReceiver(this.j);
            this.b.d("FMD_SPOT_EER", "com.google.android.gms.findmydevice.spot.bleadvertising.EddystoneEidRotationService");
        }
    }

    @Override  // bnmg
    public final void c(ByteString hfsf0, int v) {
        synchronized(this.d) {
            if(this.e) {
                if(this.g.equals(hfsf0)) {
                    ((ggtj)bnmh.a.h()).x("start() called while already advertising.");
                    return;
                }
                ((ggtj)bnmh.a.h()).x("Changing eidKey while Eddystone BLE advertisement is active.");
            }
            else {
                ((ggtj)bnmh.a.h()).x("Starting Eddystone BLE advertisement.");
                this.e = true;
                IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.findmydevice.spot.bleadvertising.SCHEDULE_EDDYSTONE_ADVERTISEMENT");
                jwe.b(this.m, this.j, intentFilter0, 4);
                Intent intent0 = new Intent("com.google.android.gms.findmydevice.spot.bleadvertising.SCHEDULE_EDDYSTONE_ADVERTISEMENT").setPackage("com.google.android.gms");
                this.f = PendingIntent.getBroadcast(this.m, 0, intent0, 0xC000000);
            }
            this.g = hfsf0;
            this.n = v;
            this.a();
        }
    }
}

