import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.Feature;
import com.google.android.gms.pay.DataChangeListenerResponse;
import com.google.android.gms.pay.GetBulletinsRequest;
import com.google.android.gms.pay.bulletin.callout.CalloutManager.nfcStateChangedReceiver.1;

public final class dlvo implements dmqb, esel, lom {
    public static final bboh a;
    public final lqi b;
    private static final byte[] c;
    private final lps d;
    private final Context e;
    private final Account f;
    private final dmdi g;
    private final edlu h;
    private final edlv i;
    private final BroadcastReceiver j;
    private final etgl k;
    private final azts l;

    static {
        dlvo.a = bboh.b("Pay", bbcu.cZ);
        ftfx ftfx0 = ftfw.a(((ProtoLiteMessage)ftfv.a).v_newBuilder());
        ftfx0.b(ftfz.b);
        dlvo.c = ftfx0.a().toBytesArray();
    }

    public dlvo(lps lps0, Context context0, Account account0, azts azts0, dmdi dmdi0, etgl etgl0) {
        this.d = lps0;
        this.e = context0;
        this.f = account0;
        this.l = azts0;
        this.g = dmdi0;
        this.k = etgl0;
        this.h = new edlu(this);
        this.i = new edlv(this);
        this.j = new CalloutManager.nfcStateChangedReceiver.1(this);
        this.b = new lqi();
        lps0.getLifecycle().c(this);
        this.c(true);
    }

    @Override  // esel
    public final void b(byte[] arr_b) {
        ibuq.f(arr_b, "serviceListenerResponse");
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftfy.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((ftfy)hftv0), "parseFrom(...)");
        ftfz ftfz0 = ftfz.b(((ftfy)hftv0).b);
        if(ftfz0 == null) {
            ftfz0 = ftfz.c;
        }
        if(ftfz0 == ftfz.b) {
            dlvo.d(this);
        }
    }

    public final void c(boolean z) {
        GetBulletinsRequest getBulletinsRequest0 = new GetBulletinsRequest();
        getBulletinsRequest0.a = this.f;
        getBulletinsRequest0.c = this.g.e();
        getBulletinsRequest0.g = this.g.f();
        getBulletinsRequest0.b = z;
        azzc azzc0 = new azzc();
        azzc0.a = new dopn(getBulletinsRequest0);
        azzc0.c = new Feature[]{dlde.aq};
        azzc0.b = false;
        azzc0.d = 0x1CA0;
        azzd azzd0 = azzc0.a();
        evql evql0 = this.l.iG(azzd0);
        evql0.b(new dlvl(new dlvn(this)));
        evql0.A(new dlvm());
    }

    public static void d(dlvo dlvo0) {
        dlvo0.c(false);
    }

    @Override  // dmqb
    public final void jP(DataChangeListenerResponse dataChangeListenerResponse0) {
        ibuq.f(dataChangeListenerResponse0, "response");
        if(dataChangeListenerResponse0.a.a != 1 && dataChangeListenerResponse0.a.a != 3 && dataChangeListenerResponse0.a.a != 5 && dataChangeListenerResponse0.a.a != 12) {
            return;
        }
        dlvo.d(this);
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        lol.b(lps0);
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        lol.d(lps0);
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        this.l.bC(this.f, 3, this.h);
        this.l.bC(this.f, 1, this.h);
        this.l.bC(this.f, 5, this.h);
        if(hwft.c()) {
            this.k.cZ(dlvo.c, this.i);
        }
        IntentFilter intentFilter0 = new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED");
        this.e.registerReceiver(this.j, intentFilter0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        this.l.bE(3, this.h);
        this.l.bE(1, this.h);
        this.l.bE(5, this.h);
        if(hwft.c()) {
            this.k.de(this.i);
        }
        try {
            this.e.unregisterReceiver(this.j);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(dlvo.a.i(), "Failed to unregister nfcStateChangedReceiver.", illegalArgumentException0);
        }
    }
}

