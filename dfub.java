import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.nearby.sharing.provider.connections.ContactBookUpdater.DeviceContactsEnabledReceiver;

public final class dfub implements Runnable {
    public final ContactBookUpdater.DeviceContactsEnabledReceiver a;
    public final Context b;

    public dfub(ContactBookUpdater.DeviceContactsEnabledReceiver contactBookUpdater$DeviceContactsEnabledReceiver0, Context context0) {
        this.a = contactBookUpdater$DeviceContactsEnabledReceiver0;
        this.b = context0;
    }

    @Override
    public final void run() {
        ContactBookUpdater.DeviceContactsEnabledReceiver contactBookUpdater$DeviceContactsEnabledReceiver0 = this.a;
        dfud dfud0 = contactBookUpdater$DeviceContactsEnabledReceiver0.a;
        Account account0 = dfud0.b.c();
        if(account0 == null) {
            return;
        }
        dcpu dcpu0 = new dcpu();
        dcpu0.b = 1;
        dcpu0.a = 18;
        gmbu.t(dfud0.b(account0, true, new dcpv(dcpu0)), new dfuc(contactBookUpdater$DeviceContactsEnabledReceiver0, this.b), dfud0.f);
    }
}

