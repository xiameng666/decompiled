import android.accounts.Account;
import android.os.Parcel;

public abstract class aqgm extends wby implements aqgn {
    public aqgm() {
        super("com.google.android.gms.backup.IBackupAccountManagerService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Account account0 = this.a();
                parcel1.writeNoException();
                wbz.g(parcel1, account0);
                return true;
            }
            case 2: {
                Account account1 = (Account)wbz.a(parcel0, Account.CREATOR);
                aqgm.gr(parcel0);
                this.b(account1);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                boolean z = this.c();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

