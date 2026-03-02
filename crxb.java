import android.os.Build.VERSION;
import android.telephony.SubscriptionManager.OnSubscriptionsChangedListener;
import android.telephony.SubscriptionManager;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;

public final class crxb extends SubscriptionManager.OnSubscriptionsChangedListener {
    private static final bboh a;

    static {
        crxb.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    @Override  // android.telephony.SubscriptionManager$OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        bboh bboh0 = crxb.a;
        bboh0.g(cslm.h()).X("Subscription state changed; listener enabled: %s, periodic service enabled: %s, SDK %d", Boolean.valueOf(hvko.I()), Boolean.valueOf(hvko.J()), Integer.valueOf(Build.VERSION.SDK_INT));
        if(hvko.I()) {
            SubscriptionManager subscriptionManager0 = (SubscriptionManager)AppContextProvider.a().getSystemService("telephony_subscription_service");
            if(subscriptionManager0 == null) {
                ((ggtj)bboh0.j()).x("Failed to get system subscription manager. Unable to respond to SIM change");
                return;
            }
            crxn.c().K(4, hhct.cf);
            try {
                if(subscriptionManager0.getActiveSubscriptionInfoCount() <= 0) {
                    ((ggtj)bboh0.j()).x("No active subscriptions found.");
                    return;
                }
            }
            catch(SecurityException securityException0) {
                a.ae(crxb.a.j(), "Security exception when counting active subscriptions", securityException0);
                return;
            }
            if(hvks.i() && hvks.g()) {
                ChimeraPeriodicUpdaterService.k(AppContextProvider.a(), 30, crxn.a());
            }
            if(!hvkx.i() || csli.B(AppContextProvider.a())) {
                ChimeraPeriodicUpdaterService.e(AppContextProvider.a(), hvko.o(), hvko.m(), giyy.g);
                if(hvje.l() && hvje.a.e().p()) {
                    cryq.a().b();
                }
                bboh0.g(cslm.h()).W("Subscription state changed. Periodic service enabled? %b Periodic fetch enabled? %b", hvko.J(), hvko.P());
            }
        }
    }
}

