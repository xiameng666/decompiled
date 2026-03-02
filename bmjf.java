import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;
import com.google.android.gms.fido.fido2.api.common.UnsignedExtensionOutputs;

public final class bmjf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                authenticationExtensionsPrfOutputs0 = (AuthenticationExtensionsPrfOutputs)baua.m(parcel0, v1, AuthenticationExtensionsPrfOutputs.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new UnsignedExtensionOutputs(authenticationExtensionsPrfOutputs0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UnsignedExtensionOutputs[v];
    }
}

