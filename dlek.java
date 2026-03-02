import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetPayCardArtResponse;
import com.google.android.gms.pay.PayCardArt;

public final class dlek implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PayCardArt[] arr_payCardArt = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 2) {
                arr_payCardArt = (PayCardArt[])baua.J(parcel0, v1, PayCardArt.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetPayCardArtResponse(arr_payCardArt);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetPayCardArtResponse[v];
    }
}

