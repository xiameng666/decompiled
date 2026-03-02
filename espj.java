import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.service.quickaccesswallet.GetWalletCardsCallback;
import android.service.quickaccesswallet.GetWalletCardsError;
import android.service.quickaccesswallet.GetWalletCardsRequest;
import android.service.quickaccesswallet.QuickAccessWalletService;
import android.service.quickaccesswallet.SelectWalletCardRequest;
import android.service.quickaccesswallet.WalletServiceEvent;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import j..util.DesugarArrays;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public final class espj extends QuickAccessWalletService implements espl {
    public static final bboh a;
    static final int b;
    espb c;
    esgi d;
    ExecutorService e;
    dyct f;
    dmkl g;
    azts h;

    static {
        espj.a = bboh.b("QAWalletSvc", bbcu.aM);
        espj.b = (int)TimeUnit.MINUTES.toMillis(5L);
    }

    public final esgi a() {
        if(this.d == null) {
            try {
                this.d = esgj.g(this, null);
                return this.d;
            }
            catch(eshj | cjuh exception0) {
                a.ae(espj.a.j(), "Could not get RequestContext.", exception0);
            }
        }
        return this.d;
    }

    @Override  // espl
    public final void b() {
        this.sendWalletServiceEvent(new WalletServiceEvent(1));
    }

    public final void c(Context context0) {
        super.attachBaseContext(context0);
    }

    public final boolean d() {
        hyui hyui0 = hyui.a;
        if(hyui0.b().b() && bbqa.d()) {
            return true;
        }
        return !hyuw.a.b().b() || !bbqa.d() || !this.g.g() ? hyui0.b().a() && jys.d() : true;
    }

    private final Intent e(int v) {
        if(evjo.d(this.getApplicationContext())) {
            if(this.g.i()) {
                return fsbp.a(this.getApplicationContext(), v).setFlags(0x10008000);
            }
            Intent intent0 = this.getPackageManager().getLaunchIntentForPackage(evjo.b(this));
            if(intent0 != null) {
                intent0.setFlags(0x10008000);
                if(hyul.e()) {
                    intent0.putExtra("INTENT_EXTRA_SOURCE", v);
                }
                return intent0;
            }
            return null;
        }
        dmqm dmqm0 = new dmqm();
        dmqm0.h(v);
        return dmqm0.c().setFlags(0x10008000);
    }

    public final PendingIntent getGestureTargetActivityPendingIntent() {
        boolean z = evjo.d(this.getApplicationContext());
        List list0 = new ArrayList();
        try {
            esgi esgi0 = this.a();
            if(esgi0 != null) {
                CardInfo[] arr_cardInfo = new etrk(esgi0).d().a;
                if(arr_cardInfo != null && arr_cardInfo.length > 0) {
                    list0 = (List)DesugarArrays.stream(arr_cardInfo).filter(new espg()).collect(ggaf.a);
                }
            }
        }
        catch(eshj eshj0) {
            a.ae(espj.a.j(), "Can\'t get wallet cards from Global Actions.", eshj0);
        }
        if(!list0.isEmpty()) {
            ((ggtj)espj.a.h()).x("At least one tokenized card registered to account.");
        }
        if(z) {
            ((ggtj)espj.a.h()).x("Beachhead is installed");
        }
        if(!hyul.d()) {
            ((ggtj)espj.a.h()).x("Presentation Mode is not enabled.");
        }
        if(hyul.d() && z && !list0.isEmpty()) {
            Intent intent0 = new Intent("com.google.android.apps.wallet.main.QUICKDRAW").setPackage(evjo.b(this.getApplicationContext())).addFlags(0x20050000);
            intent0.putExtra("INTENT_EXTRA_SOURCE", 41);
            return fqaw.c(this, 0, intent0, 0x44000000);
        }
        if(z) {
            Intent intent1 = this.e(41);
            return intent1 == null ? null : fqaw.c(this, 0, intent1, 0x44000000);
        }
        return fqaw.c(this, 0, evjo.a(41), 0x44000000);
    }

    @Override  // android.service.quickaccesswallet.QuickAccessWalletService
    public final PendingIntent getTargetActivityPendingIntent() {
        etmv etmv0 = null;
        if(this.c.g()) {
            Intent intent0 = !hyul.e() || !bbqa.a() ? this.e(3) : this.e(42);
            if(intent0 != null) {
                try {
                    esgi esgi0 = esgj.g(this, null);
                    if(esgi0 != null) {
                        etmv0 = new etmv(esgi0);
                    }
                }
                catch(eshj | cjuh exception0) {
                    a.ae(espj.a.j(), "Could not get TapAndPayEventLogger.", exception0);
                }
                if(etmv0 != null) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjzl.a).v_newBuilder();
                    gjsj gjsj0 = gjsj.co;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjzl)hftp0.b_message).e = gjsj0.cW;
                    ((gjzl)hftp0.b_message).b |= 1;
                    etmv0.l(((gjzl)hftp0.N_build()));
                }
                return fqaw.c(this, 0, intent0, 0x44000000);
            }
        }
        return null;
    }

    @Override  // android.service.quickaccesswallet.QuickAccessWalletService
    public final IBinder onBind(Intent intent0) {
        hyuw.c();
        if(hyuw.a.b().d()) {
            this.f.a.b(new dycr(), gmap.a);
        }
        return super.onBind(intent0);
    }

    @Override  // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.e = new bblp(0x7FFFFFFF, 9);
        this.c = new espb(this);
        this.h = new azts(this, null);
        this.f = new dyct();
        this.g = new dmkl(this);
        espm.c(this);
    }

    @Override  // android.app.Service
    public final void onDestroy() {
        espm.c(null);
        super.onDestroy();
        this.e.shutdownNow();
    }

    @Override  // android.service.quickaccesswallet.QuickAccessWalletService
    public final void onWalletCardSelected(SelectWalletCardRequest selectWalletCardRequest0) {
        try {
            ((bblp)this.e).d(new esph(this, selectWalletCardRequest0));
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            a.ae(espj.a.i(), "Error selecting card", rejectedExecutionException0);
        }
    }

    @Override  // android.service.quickaccesswallet.QuickAccessWalletService
    public final void onWalletCardsRequested(GetWalletCardsRequest getWalletCardsRequest0, GetWalletCardsCallback getWalletCardsCallback0) {
        try {
            ((bblp)this.e).d(new espf(this, getWalletCardsRequest0, getWalletCardsCallback0));
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            a.ae(espj.a.i(), "Error requesting cards", rejectedExecutionException0);
            getWalletCardsCallback0.onFailure(new GetWalletCardsError(null, null));
        }
    }

    @Override  // android.service.quickaccesswallet.QuickAccessWalletService
    public final void onWalletDismissed() {
        try {
            ((bblp)this.e).d(new espc(this));
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            a.ae(espj.a.i(), "Error handling dismissWallet", rejectedExecutionException0);
        }
    }
}

