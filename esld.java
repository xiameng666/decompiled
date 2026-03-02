import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem;
import com.google.android.gms.tapandpay.firstparty.GetContactlessSetupStatusResponse;

public final class esld implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ContactlessSetupItem[] arr_contactlessSetupItem = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                arr_contactlessSetupItem = (ContactlessSetupItem[])baua.J(parcel0, v1, ContactlessSetupItem.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetContactlessSetupStatusResponse(arr_contactlessSetupItem);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetContactlessSetupStatusResponse[v];
    }
}

