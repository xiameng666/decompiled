import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.pay.pass.common.template.api.LinkedPassFromServerResponse;
import com.google.android.libraries.tapandpay.pay.pass.common.template.api.PassDetailCallback;

public final class dskg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ggdy ggdy0 = new ggdy();
        Parcelable[] arr_parcelable = parcel0.readParcelableArray(PassDetailCallback.class.getClassLoader());
        if(arr_parcelable != null) {
            for(int v = 0; v < arr_parcelable.length; ++v) {
                ggdy0.i(((PassDetailCallback)arr_parcelable[v]));
            }
        }
        return new LinkedPassFromServerResponse(ggdy0.h(), parcel0.readString());
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LinkedPassFromServerResponse[v];
    }
}

