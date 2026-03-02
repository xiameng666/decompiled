import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetSortOrderResponse;
import com.google.android.gms.pay.SortOrderInfo;

public final class dley implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SortOrderInfo sortOrderInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                sortOrderInfo0 = (SortOrderInfo)baua.m(parcel0, v1, SortOrderInfo.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetSortOrderResponse(sortOrderInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetSortOrderResponse[v];
    }
}

