import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.BiometricPromptUiOptions;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialRequestOptions;

public final class ahln implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        kvt kvt0 = null;
        int v1 = 0;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = null;
        String s = null;
        String s1 = null;
        BrowserOptions browserOptions0 = null;
        ResultReceiver resultReceiver0 = null;
        BiometricPromptUiOptions biometricPromptUiOptions0 = null;
        long v2 = 0L;
        boolean z = false;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    publicKeyCredentialRequestOptions0 = (PublicKeyCredentialRequestOptions)baua.m(parcel0, v3, PublicKeyCredentialRequestOptions.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    browserOptions0 = (BrowserOptions)baua.m(parcel0, v3, BrowserOptions.CREATOR);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 7: {
                    bundle0 = baua.j(parcel0, v3);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 9: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 10: {
                    resultReceiver0 = (ResultReceiver)baua.m(parcel0, v3, ResultReceiver.CREATOR);
                    break;
                }
                case 11: {
                    biometricPromptUiOptions0 = (BiometricPromptUiOptions)baua.m(parcel0, v3, BiometricPromptUiOptions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        bxnm bxnm0 = bxnm.b(v1);
        if(bundle0 != null) {
            kvt0 = ahlp.a(bundle0);
        }
        return new AuthenticationOptions(publicKeyCredentialRequestOptions0, s, s1, browserOptions0, bxnm0, kvt0, z, v2, resultReceiver0, biometricPromptUiOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AuthenticationOptions[v];
    }
}

