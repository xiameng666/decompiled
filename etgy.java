import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.TapAndPaySettings;
import com.google.android.gms.tapandpay.internal.firstparty.SetTapAndPaySettingsRequest;

public final class etgy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TapAndPaySettings tapAndPaySettings0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                tapAndPaySettings0 = (TapAndPaySettings)baua.m(parcel0, v1, TapAndPaySettings.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new SetTapAndPaySettingsRequest(tapAndPaySettings0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SetTapAndPaySettingsRequest[v];
    }
}

