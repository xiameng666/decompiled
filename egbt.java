import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.GetImportSimContactsSuggestionsRequest;

public final class egbt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        AccountWithDataSet accountWithDataSet0 = null;
        int[] arr_v = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    accountWithDataSet0 = (AccountWithDataSet)baua.m(parcel0, v1, AccountWithDataSet.CREATOR);
                    break;
                }
                case 2: {
                    arr_v = baua.H(parcel0, v1);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetImportSimContactsSuggestionsRequest(accountWithDataSet0, ggfp.G(glwy.j(arr_v)), z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetImportSimContactsSuggestionsRequest[v];
    }
}

