import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.ImportSimContactsSuggestion;
import java.util.BitSet;

public final class egbv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        BitSet bitSet0 = null;
        AccountWithDataSet accountWithDataSet0 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        boolean z = false;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 1: {
                    accountWithDataSet0 = (AccountWithDataSet)baua.m(parcel0, v6, AccountWithDataSet.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v6);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v6);
                    break;
                }
                case 4: {
                    v3 = baua.f(parcel0, v6);
                    break;
                }
                case 5: {
                    v4 = baua.f(parcel0, v6);
                    break;
                }
                case 6: {
                    v5 = baua.f(parcel0, v6);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v6);
                    break;
                }
                case 8: {
                    arr_b = baua.E(parcel0, v6);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        if(arr_b != null) {
            bitSet0 = BitSet.valueOf(arr_b);
        }
        return new ImportSimContactsSuggestion(accountWithDataSet0, v1, v2, v3, v4, v5, z, bitSet0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ImportSimContactsSuggestion[v];
    }
}

