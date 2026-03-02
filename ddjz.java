import android.content.Context;
import android.content.IntentFilter;

public final class ddjz {
    public final icig a;

    public ddjz(Context context0, dcmf dcmf0, ddki ddki0) {
        ibuq.f(dcmf0, "sharingClient");
        ibuq.f(ddki0, "deviceContactsConsent");
        super();
        icig[] arr_icig = {dcmt.c(dcmf0), null};
        ddjv ddjv0 = hvrc.E() ? new ddjv(dcvk.a(context0, "ContactsConsentReceiver", new IntentFilter("com.google.android.gms.nearby.sharing.DEVICE_CONTACTS_CONSENT_ENABLED"))) : new ichv(new ddjr(context0, null));
        arr_icig[1] = ddjv0;
        icig icig0 = icky.b(arr_icig);
        this.a = new ddjy(iciv.b(new icjo(new ddjs(null), icig0)), dcmf0, ddki0);
    }
}

