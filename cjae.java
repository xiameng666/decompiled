import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.core.settings.GoogleSettingsBoundService;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class cjae extends wby implements cjaf {
    final GoogleSettingsBoundService a;

    public cjae() {
        super("com.google.android.gms.libs.googlesettings.request.IGoogleSettingsService");
    }

    public cjae(GoogleSettingsBoundService googleSettingsBoundService0) {
        Objects.requireNonNull(googleSettingsBoundService0);
        this.a = googleSettingsBoundService0;
        super("com.google.android.gms.libs.googlesettings.request.IGoogleSettingsService");
    }

    @Override  // cjaf
    public final void a(cjac cjac0, Account account0) {
        if(!bbmq.Y(this.a)) {
            throw new SecurityException("Caller is not zero party.");
        }
        List list0 = GoogleSettingsBoundService.b;
        synchronized(list0) {
            int v1 = list0.size();
            if(v1 >= 5) {
                ((ggtj)GoogleSettingsBoundService.a.i()).z("Reached capacity for GoogleSettings requests: %s concurrent callers.", v1);
                try {
                    cjac0.a(new ArrayList());
                }
                catch(RemoteException remoteException0) {
                    a.ae(GoogleSettingsBoundService.a.j(), "RemoteException when attempting to return GoogleSettings items.", remoteException0);
                }
                return;
            }
            GoogleSettingsBoundService.b.add(cjac0);
            if(v1 == 0) {
                GoogleSettingsBoundService googleSettingsBoundService0 = this.a;
                List list1 = DesugarCollections.synchronizedList(new ArrayList());
                Bundle bundle0 = new Bundle();
                cjah.b(bundle0, list1);
                bundle0.putString("className", "GoogleSettingsBoundService");
                if(account0 != null) {
                    bundle0.putParcelable("account", account0);
                }
                Intent intent0 = new Intent("com.google.android.gms.GOOGLE_SETTINGS_OPERATION");
                intent0.setPackage("com.google.android.gms");
                intent0.putExtras(bundle0);
                googleSettingsBoundService0.startService(intent0);
            }
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        cjac cjac0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                cjac0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.libs.googlesettings.request.IGoogleSettingsCallback");
                cjac0 = (iInterface0 instanceof cjac) ? ((cjac)iInterface0) : new cjaa(iBinder0);
            }
            Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
            cjae.gr(parcel0);
            this.a(cjac0, account0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

