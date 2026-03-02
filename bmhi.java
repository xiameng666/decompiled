import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

public final class bmhi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = null;
        Uri uri0 = null;
        byte[] arr_b = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    publicKeyCredentialCreationOptions0 = (PublicKeyCredentialCreationOptions)baua.m(parcel0, v1, PublicKeyCredentialCreationOptions.CREATOR);
                    break;
                }
                case 3: {
                    uri0 = (Uri)baua.m(parcel0, v1, Uri.CREATOR);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 5: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions0, uri0, arr_b, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BrowserPublicKeyCredentialCreationOptions[v];
    }
}

