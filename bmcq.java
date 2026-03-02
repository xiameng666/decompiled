import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.credentialstore.KeyData;
import com.google.android.gms.fido.credentialstore.KeyMetadata;

public final class bmcq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        long v2 = 0L;
        byte[] arr_b = null;
        byte[] arr_b1 = null;
        byte[] arr_b2 = null;
        String s = null;
        byte[] arr_b3 = null;
        byte[] arr_b4 = null;
        Account account0 = null;
        KeyMetadata keyMetadata0 = null;
        byte[] arr_b5 = null;
        byte[] arr_b6 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_b1 = baua.E(parcel0, v3);
                    break;
                }
                case 5: {
                    arr_b2 = baua.E(parcel0, v3);
                    break;
                }
                case 6: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 7: {
                    arr_b3 = baua.E(parcel0, v3);
                    break;
                }
                case 8: {
                    arr_b4 = baua.E(parcel0, v3);
                    break;
                }
                case 9: {
                    account0 = (Account)baua.m(parcel0, v3, Account.CREATOR);
                    break;
                }
                case 10: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 11: {
                    keyMetadata0 = (KeyMetadata)baua.m(parcel0, v3, KeyMetadata.CREATOR);
                    break;
                }
                case 12: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                case 13: {
                    arr_b5 = baua.E(parcel0, v3);
                    break;
                }
                case 14: {
                    arr_b6 = baua.E(parcel0, v3);
                    break;
                }
                case 15: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 16: {
                    z3 = baua.D(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new KeyData(v1, z, arr_b, arr_b1, arr_b2, s, arr_b3, arr_b4, account0, z1, keyMetadata0, z2, arr_b5, arr_b6, v2, z3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new KeyData[v];
    }
}

