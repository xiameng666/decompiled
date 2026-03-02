import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.wallet.bender3.framework.client.ParcelableKeyValue;
import com.google.android.wallet.bender3.framework.client.SuccessWidgetResult;

public final class gaur implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        byte[] arr_b1 = null;
        byte[] arr_b2 = null;
        byte[] arr_b3 = null;
        ParcelableKeyValue[] arr_parcelableKeyValue = null;
        byte[] arr_b4 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_b1 = baua.E(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_b2 = baua.E(parcel0, v1);
                    break;
                }
                case 4: {
                    arr_b3 = baua.E(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_parcelableKeyValue = (ParcelableKeyValue[])baua.J(parcel0, v1, ParcelableKeyValue.CREATOR);
                    break;
                }
                case 6: {
                    arr_b4 = baua.E(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SuccessWidgetResult(arr_b, arr_b1, arr_b2, arr_b3, arr_parcelableKeyValue, arr_b4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SuccessWidgetResult[v];
    }
}

