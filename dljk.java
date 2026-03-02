import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.SeTosMigrationOptions;
import com.google.android.gms.pay.StartClosedLoopHceMigrationRequest;

public final class dljk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        int v1 = 0;
        SeTosMigrationOptions seTosMigrationOptions0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 3: {
                    seTosMigrationOptions0 = (SeTosMigrationOptions)baua.m(parcel0, v2, SeTosMigrationOptions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartClosedLoopHceMigrationRequest(v1, account0, seTosMigrationOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartClosedLoopHceMigrationRequest[v];
    }
}

