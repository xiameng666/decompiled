import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUserList;

public final class goyb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        GetAccountInfoUserList getAccountInfoUserList0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 2) {
                getAccountInfoUserList0 = (GetAccountInfoUserList)baua.m(parcel0, v1, GetAccountInfoUserList.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetAccountInfoResponse(getAccountInfoUserList0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetAccountInfoResponse[v];
    }
}

