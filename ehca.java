import android.accounts.Account;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;

public final class ehca {
    private final bayo a;

    public ehca(Context context0) {
        this.a = bayo.a(context0);
    }

    public final void a(Account account0) {
        this.a.c("ContactsChangedNotifier" + account0.name, 1);
    }

    public final void b(Account account0, int v) {
        String s = String.valueOf(account0.name);
        String s1 = account0.name;
        Context context0 = AppContextProvider.a();
        juo juo0 = new juo(context0, ehdo.a());
        juo0.D("Google Contacts sync is turned off");
        juo0.k("Contacts on this device aren\'t being backed up to contacts.google.com");
        juk juk0 = new juk();
        juk0.e("Contacts on this device aren\'t being backed up to contacts.google.com");
        juo0.v(juk0);
        juo0.R(s1);
        juo0.s(0x7F080D3E);
        juo0.h(true);
        juo0.p(true);
        juo0.m = 0;
        juo0.V(System.currentTimeMillis());
        Intent intent0 = new Intent();
        intent0.setPackage("com.google.android.gms");
        intent0.setAction("com.google.android.gms.people.sync.CONTACTS_SYNC_SETTINGS");
        intent0.putExtra("unsync_notification", true);
        intent0.putExtra("num_unsync_notification_sent", v);
        if(s1 != null) {
            intent0.putExtra("authAccount", s1);
        }
        PendingIntent pendingIntent0 = cjok.a(context0, 0, intent0, 0xA000000);
        if(pendingIntent0 != null) {
            juo0.h = pendingIntent0;
        }
        juo0.J = ehdo.a();
        Notification notification0 = juo0.a();
        this.a.e("ContactsChangedNotifier" + s, 1, notification0);
    }
}

