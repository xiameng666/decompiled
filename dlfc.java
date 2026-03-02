import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetTransitCardsResponse;
import com.google.android.gms.pay.GetTransitPassResponse;
import com.google.android.gms.pay.TransitCard;
import com.google.android.gms.pay.TransitPaymentOption;

public final class dlfc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TransitCard[] arr_transitCard = null;
        Bitmap bitmap0 = null;
        Bitmap bitmap1 = null;
        TransitPaymentOption[] arr_transitPaymentOption = null;
        GetTransitPassResponse getTransitPassResponse0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_transitCard = (TransitCard[])baua.J(parcel0, v1, TransitCard.CREATOR);
                    break;
                }
                case 2: {
                    bitmap0 = (Bitmap)baua.m(parcel0, v1, Bitmap.CREATOR);
                    break;
                }
                case 3: {
                    bitmap1 = (Bitmap)baua.m(parcel0, v1, Bitmap.CREATOR);
                    break;
                }
                case 4: {
                    arr_transitPaymentOption = (TransitPaymentOption[])baua.J(parcel0, v1, TransitPaymentOption.CREATOR);
                    break;
                }
                case 5: {
                    getTransitPassResponse0 = (GetTransitPassResponse)baua.m(parcel0, v1, GetTransitPassResponse.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetTransitCardsResponse(arr_transitCard, bitmap0, bitmap1, arr_transitPaymentOption, getTransitPassResponse0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetTransitCardsResponse[v];
    }
}

