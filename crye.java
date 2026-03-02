import android.telephony.SubscriptionManager;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.service.MobileDataPlanModuleInitIntentOperation;
import java.util.logging.Level;

public final class crye implements Runnable {
    @Override
    public final void run() {
        SubscriptionManager subscriptionManager0 = (SubscriptionManager)AppContextProvider.a().getSystemService("telephony_subscription_service");
        if(subscriptionManager0 != null) {
            try {
                subscriptionManager0.addOnSubscriptionsChangedListener(new crxb());
                Level level0 = cslm.h();
                MobileDataPlanModuleInitIntentOperation.a.g(level0).B("%s: registered subscription change listener", "ModuleInit");
            }
            catch(SecurityException | IllegalStateException exception0) {
                a.ae(MobileDataPlanModuleInitIntentOperation.a.j(), "Exception thrown when registering subscription change listener", exception0);
            }
            return;
        }
        ((ggtj)MobileDataPlanModuleInitIntentOperation.a.j()).x("Couldn\'t register subscription change listener because SubscriptionManager is null");
    }
}

