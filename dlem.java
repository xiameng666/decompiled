import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetPayGlobalActionCardsResponse;
import com.google.android.gms.pay.PayGlobalActionCard;

public final class dlem implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        PayGlobalActionCard[] arr_payGlobalActionCard = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    arr_payGlobalActionCard = (PayGlobalActionCard[])baua.J(parcel0, v2, PayGlobalActionCard.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetPayGlobalActionCardsResponse(arr_payGlobalActionCard, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetPayGlobalActionCardsResponse[v];
    }
}

