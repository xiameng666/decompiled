import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;

public final class fxty implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        int v1 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int v2 = 0;
        boolean z6 = false;
        int v3 = 0;
        boolean z7 = false;
        boolean z8 = false;
        Account account0 = null;
        String s = null;
        String s1 = null;
        Conditions conditions0 = null;
        String s2 = null;
        Long long0 = null;
        Long long1 = null;
        long v4 = 0L;
        long v5 = 0L;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 2: {
                    account0 = (Account)baua.m(parcel0, v6, Account.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v6);
                    break;
                }
                case 4: {
                    v4 = baua.i(parcel0, v6);
                    break;
                }
                case 5: {
                    z1 = baua.D(parcel0, v6);
                    break;
                }
                case 6: {
                    z2 = baua.D(parcel0, v6);
                    break;
                }
                case 7: {
                    s = baua.s(parcel0, v6);
                    break;
                }
                case 8: {
                    z3 = baua.D(parcel0, v6);
                    break;
                }
                case 9: {
                    s1 = baua.s(parcel0, v6);
                    break;
                }
                case 10: {
                    v5 = baua.i(parcel0, v6);
                    break;
                }
                case 11: {
                    v1 = baua.f(parcel0, v6);
                    break;
                }
                case 12: {
                    z4 = baua.D(parcel0, v6);
                    break;
                }
                case 13: {
                    z5 = baua.D(parcel0, v6);
                    break;
                }
                case 14: {
                    conditions0 = (Conditions)baua.m(parcel0, v6, Conditions.CREATOR);
                    break;
                }
                case 15: {
                    v2 = baua.f(parcel0, v6);
                    break;
                }
                case 16: {
                    s2 = baua.s(parcel0, v6);
                    break;
                }
                case 17: {
                    long0 = baua.r(parcel0, v6);
                    break;
                }
                case 18: {
                    long1 = baua.r(parcel0, v6);
                    break;
                }
                case 19: {
                    z6 = baua.D(parcel0, v6);
                    break;
                }
                case 20: {
                    v3 = baua.f(parcel0, v6);
                    break;
                }
                case 22: {
                    z7 = baua.D(parcel0, v6);
                    break;
                }
                case 23: {
                    z8 = baua.D(parcel0, v6);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new AccountConfig(account0, z, v4, z1, z2, s, z3, s1, v5, v1, z4, z5, conditions0, v2, s2, long0, long1, z6, v3, z7, z8);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AccountConfig[v];
    }
}

