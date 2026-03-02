import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

public final class ahpl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        int v1 = 0;
        boolean z1 = false;
        BeginSignInRequest.PasswordRequestOptions beginSignInRequest$PasswordRequestOptions0 = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions0 = null;
        String s = null;
        BeginSignInRequest.PasskeysRequestOptions beginSignInRequest$PasskeysRequestOptions0 = null;
        BeginSignInRequest.PasskeyJsonRequestOptions beginSignInRequest$PasskeyJsonRequestOptions0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    beginSignInRequest$PasswordRequestOptions0 = (BeginSignInRequest.PasswordRequestOptions)baua.m(parcel0, v2, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                }
                case 2: {
                    beginSignInRequest$GoogleIdTokenRequestOptions0 = (BeginSignInRequest.GoogleIdTokenRequestOptions)baua.m(parcel0, v2, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 6: {
                    beginSignInRequest$PasskeysRequestOptions0 = (BeginSignInRequest.PasskeysRequestOptions)baua.m(parcel0, v2, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                }
                case 7: {
                    beginSignInRequest$PasskeyJsonRequestOptions0 = (BeginSignInRequest.PasskeyJsonRequestOptions)baua.m(parcel0, v2, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new BeginSignInRequest(beginSignInRequest$PasswordRequestOptions0, beginSignInRequest$GoogleIdTokenRequestOptions0, s, z, v1, beginSignInRequest$PasskeysRequestOptions0, beginSignInRequest$PasskeyJsonRequestOptions0, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BeginSignInRequest[v];
    }
}

