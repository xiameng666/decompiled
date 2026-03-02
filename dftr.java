import android.content.IntentFilter;
import android.provider.ContactsContract.Contacts;

public final class dftr implements Runnable {
    public final dfud a;

    public dftr(dfud dfud0) {
        this.a = dfud0;
    }

    @Override
    public final void run() {
        IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.nearby.sharing.DEVICE_CONTACTS_CONSENT_ENABLED");
        cutr.b(this.a.a, this.a.j, intentFilter0);
        dcvz.a.b().p("ContactBookUpdater has started listening for device contacts consent.", new Object[0]);
        try {
            this.a.a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, this.a.k);
            dcvz.a.b().p("ContactBookUpdater has started listening for contact book changed events.", new Object[0]);
        }
        catch(SecurityException securityException0) {
            dcvz.a.e().f(securityException0).p("ContactBookUpdater failed to listen to contact book changes.", new Object[0]);
        }
    }
}

