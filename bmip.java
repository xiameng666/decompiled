import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.List;

public final class bmip implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        Double double0 = null;
        String s = null;
        List list0 = null;
        Integer integer0 = null;
        TokenBinding tokenBinding0 = null;
        String s1 = null;
        AuthenticationExtensions authenticationExtensions0 = null;
        Long long0 = null;
        String s2 = null;
        ResultReceiver resultReceiver0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 3: {
                    double0 = baua.o(parcel0, v1);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    list0 = baua.y(parcel0, v1, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                }
                case 6: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 7: {
                    tokenBinding0 = (TokenBinding)baua.m(parcel0, v1, TokenBinding.CREATOR);
                    break;
                }
                case 8: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 9: {
                    authenticationExtensions0 = (AuthenticationExtensions)baua.m(parcel0, v1, AuthenticationExtensions.CREATOR);
                    break;
                }
                case 10: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 11: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 12: {
                    resultReceiver0 = (ResultReceiver)baua.m(parcel0, v1, ResultReceiver.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PublicKeyCredentialRequestOptions(arr_b, double0, s, list0, integer0, tokenBinding0, s1, authenticationExtensions0, long0, s2, resultReceiver0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PublicKeyCredentialRequestOptions[v];
    }
}

