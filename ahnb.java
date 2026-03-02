import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.fido.BiometricPromptUiOptions;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialCreationOptions;
import com.google.android.gms.auth.api.fido.RegistrationOptions;

public final class ahnb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        kvt kvt0 = null;
        boolean z = false;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = null;
        String s = null;
        String s1 = null;
        BrowserOptions browserOptions0 = null;
        Account account0 = null;
        ResultReceiver resultReceiver0 = null;
        BiometricPromptUiOptions biometricPromptUiOptions0 = null;
        long v1 = 0L;
        int v2 = 0;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    publicKeyCredentialCreationOptions0 = (PublicKeyCredentialCreationOptions)baua.m(parcel0, v3, PublicKeyCredentialCreationOptions.CREATOR);
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
                    account0 = (Account)baua.m(parcel0, v3, Account.CREATOR);
                    break;
                }
                case 7: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 8: {
                    bundle0 = baua.j(parcel0, v3);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 10: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 11: {
                    resultReceiver0 = (ResultReceiver)baua.m(parcel0, v3, ResultReceiver.CREATOR);
                    break;
                }
                case 12: {
                    biometricPromptUiOptions0 = (BiometricPromptUiOptions)baua.m(parcel0, v3, BiometricPromptUiOptions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        Boolean boolean0 = Boolean.valueOf(z);
        bxnm bxnm0 = bxnm.b(v2);
        if(bundle0 != null) {
            kvt0 = ahlp.a(bundle0);
        }
        return new RegistrationOptions(publicKeyCredentialCreationOptions0, s, s1, browserOptions0, account0, bxnm0, kvt0, boolean0, v1, resultReceiver0, biometricPromptUiOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RegistrationOptions[v];
    }
}

