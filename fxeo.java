import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.location.quake.QuakeAlarmManagerStage.1;

public final class fxeo extends fxpd {
    final PendingIntent a;
    long b;
    public boolean c;
    private final TracingBroadcastReceiver d;
    private final kba i;
    private final Context j;
    private final bbib k;
    private bblg l;

    static {
        bboh.c("EQMon", bbcu.g, "RtAlrm");
    }

    public fxeo(Context context0, kba kba0, bbib bbib0) {
        super("RtAlrm");
        this.d = new QuakeAlarmManagerStage.1(this);
        this.j = context0;
        this.k = bbib0;
        this.i = kba0;
        Intent intent0 = new Intent("com.google.android.location.intent.action.ONLINE_CHECKIN_ALARM");
        intent0.setPackage("com.google.android.gms");
        this.a = PendingIntent.getBroadcast(context0, 0, intent0, 0xA000000);
    }

    @Override  // fxpd
    public final void a() {
        this.k.a(this.a);
        this.l = new bblg("qalarm", 9);
        bblf bblf0 = new bblf(this.l);
        IntentFilter intentFilter0 = new IntentFilter("com.google.android.location.intent.action.ONLINE_CHECKIN_ALARM");
        jwe.c(this.j, this.d, intentFilter0, null, bblf0, 4);
        this.b = 0L;
        this.c = true;
        this.e();
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        this.c = false;
        this.k.a(this.a);
        this.j.unregisterReceiver(this.d);
        bblg bblg0 = this.l;
        if(bblg0 != null) {
            bblg0.quit();
            this.l = null;
        }
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        if(!this.c) {
            return false;
        }
        switch(fxpj0.a) {
            case 17: {
                this.b = (long)(((Long)this.i.a()));
                this.e();
                return false;
            }
            case 22: {
                if(this.k()) {
                    this.j();
                }
                return true;
            }
            case 23: {
                this.g(new fxph(33));
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private final void e() {
        long v = this.b;
        this.i.a();
        this.k.j("EQMon", 2, (Long.compare(v, 0L) == 0 ? 1L : v + huwe.b()), this.a);
    }
}

