import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;

public final class egbu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int[] arr_v = null;
        AccountWithDataSet accountWithDataSet0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_v = baua.H(parcel0, v1);
                    break;
                }
                case 2: {
                    accountWithDataSet0 = (AccountWithDataSet)baua.m(parcel0, v1, AccountWithDataSet.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ImportSimContactsRequest(ggfp.G(glwy.j(arr_v)), accountWithDataSet0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ImportSimContactsRequest[v];
    }
}

