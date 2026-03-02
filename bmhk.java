import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class bmhk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = null;
        Uri uri0 = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    publicKeyCredentialRequestOptions0 = (PublicKeyCredentialRequestOptions)baua.m(parcel0, v1, PublicKeyCredentialRequestOptions.CREATOR);
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
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions0, uri0, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BrowserPublicKeyCredentialRequestOptions[v];
    }
}

