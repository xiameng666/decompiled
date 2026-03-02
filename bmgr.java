import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsDevicePublicKeyOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;

public final class bmgr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        UvmEntries uvmEntries0 = null;
        AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs0 = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs0 = null;
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    uvmEntries0 = (UvmEntries)baua.m(parcel0, v1, UvmEntries.CREATOR);
                    break;
                }
                case 2: {
                    authenticationExtensionsDevicePublicKeyOutputs0 = (AuthenticationExtensionsDevicePublicKeyOutputs)baua.m(parcel0, v1, AuthenticationExtensionsDevicePublicKeyOutputs.CREATOR);
                    break;
                }
                case 3: {
                    authenticationExtensionsCredPropsOutputs0 = (AuthenticationExtensionsCredPropsOutputs)baua.m(parcel0, v1, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                    break;
                }
                case 4: {
                    authenticationExtensionsPrfOutputs0 = (AuthenticationExtensionsPrfOutputs)baua.m(parcel0, v1, AuthenticationExtensionsPrfOutputs.CREATOR);
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AuthenticationExtensionsClientOutputs(uvmEntries0, authenticationExtensionsDevicePublicKeyOutputs0, authenticationExtensionsCredPropsOutputs0, authenticationExtensionsPrfOutputs0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AuthenticationExtensionsClientOutputs[v];
    }
}

