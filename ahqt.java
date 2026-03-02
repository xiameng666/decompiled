import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

public final class ahqt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Uri uri0 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        PublicKeyCredential publicKeyCredential0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    uri0 = (Uri)baua.m(parcel0, v1, Uri.CREATOR);
                    break;
                }
                case 6: {
                    s4 = baua.s(parcel0, v1);
                    break;
                }
                case 7: {
                    s5 = baua.s(parcel0, v1);
                    break;
                }
                case 8: {
                    s6 = baua.s(parcel0, v1);
                    break;
                }
                case 9: {
                    publicKeyCredential0 = (PublicKeyCredential)baua.m(parcel0, v1, PublicKeyCredential.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SignInCredential(s, s1, s2, s3, uri0, s4, s5, s6, publicKeyCredential0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SignInCredential[v];
    }
}

