import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.SortItem;
import com.google.android.gms.pay.SortOrderInfo;

public final class dljj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SortItem[] arr_sortItem = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_sortItem = (SortItem[])baua.J(parcel0, v2, SortItem.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SortOrderInfo(v1, arr_sortItem);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SortOrderInfo[v];
    }
}

