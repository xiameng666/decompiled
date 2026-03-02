import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.sharing.consents.ConsentRepository.isUserConsentedToDeviceContactsFlow.2.stateChangeReceiver.1;

final class ddjr extends ibsl implements ibtw {
    int a;
    final Context b;
    private Object c;

    public ddjr(Context context0, ibrl ibrl0) {
        this.b = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ddjr)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ddjr(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            ConsentRepository.isUserConsentedToDeviceContactsFlow.2.stateChangeReceiver.1 consentRepository$isUserConsentedToDeviceContactsFlow$2$stateChangeReceiver$10 = new ConsentRepository.isUserConsentedToDeviceContactsFlow.2.stateChangeReceiver.1(ichm0);
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("com.google.android.gms.nearby.sharing.DEVICE_CONTACTS_CONSENT_ENABLED");
            cutr.b(this.b, consentRepository$isUserConsentedToDeviceContactsFlow$2$stateChangeReceiver$10, intentFilter0);
            ddjq ddjq0 = new ddjq(this.b, consentRepository$isUserConsentedToDeviceContactsFlow$2$stateChangeReceiver$10);
            this.a = 1;
            if(ichl.b(ichm0, ddjq0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

