import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.TapEvent;
import com.google.android.gms.tapandpay.firstparty.TapFailureUiInfo;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;

public final class esmx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = parcel0.readInt();
        boolean z = true;
        switch(v) {
            case 2: {
                return new TapEvent(2, -1);
            }
            case 3: {
                return new TapEvent(3, -1, ((ValuableInfo[])parcel0.createTypedArray(ValuableInfo.CREATOR)), null);
            }
            case 4: {
                return new TapEvent(4, -1);
            }
            case 5: {
                int v1 = parcel0.readInt();
                byte[] arr_b = parcel0.createByteArray();
                TapFailureUiInfo tapFailureUiInfo0 = arr_b == null || arr_b.length <= 0 ? null : ((TapFailureUiInfo)bauc.a(arr_b, TapFailureUiInfo.CREATOR));
                if(v1 == -1) {
                    z = false;
                }
                batl.b(z);
                return new TapEvent(5, v1, null, tapFailureUiInfo0);
            }
            case 6: {
                return new TapEvent(6, -1);
            }
            case 7: {
                int v2 = parcel0.readInt();
                if(v2 == -1) {
                    z = false;
                }
                batl.b(z);
                return new TapEvent(7, v2);
            }
            case 8: {
                return new TapEvent(8, -1, ((ValuableInfo[])parcel0.createTypedArray(ValuableInfo.CREATOR)), null);
            }
            default: {
                throw new IllegalStateException("Unknown eventType: " + v);
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TapEvent[v];
    }
}

