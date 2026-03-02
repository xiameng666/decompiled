import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.identitycredentials.Credential;
import com.google.android.gms.identitycredentials.GetCredentialResponse;

public final class bygn {
    public static final Bundle a(String s, String s1) {
        Bundle bundle0 = new Bundle();
        bundle0.putCharSequence("androidx.identitycredentials.BUNDLE_KEY_EXCEPTION_TYPE", s);
        if(s1 != null) {
            bundle0.putCharSequence("androidx.identitycredentials.BUNDLE_KEY_EXCEPTION_MESSAGE", s1);
        }
        return bundle0;
    }

    public static final Bundle b(Intent intent0) {
        Credential credential0;
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = intent0.getExtras();
        if(bundle1 != null) {
            if(bygn.f(intent0) && bygn.e(intent0)) {
                bundle0.putParcelable("androidx.identitycredentials.BUNDLE_KEY_PROVIDER_DATA", intent0);
                return bundle0;
            }
            if(bundle1.containsKey("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE")) {
                kkb kkb0 = kwr.d(intent0);
                if(kkb0 != null) {
                    Intent intent1 = new Intent(intent0);
                    kjf kjf0 = kkb0.a;
                    if((kjf0 instanceof kjx)) {
                        Bundle bundle2 = new Bundle();
                        byte[] arr_b = ((kjx)kjf0).c.getBytes(ibyo.a);
                        ibuq.e(arr_b, "getBytes(...)");
                        bundle2.putByteArray("identityToken", arr_b);
                        credential0 = new Credential("com.credman.IdentityCredential", bundle2);
                    }
                    else {
                        credential0 = new Credential(kjf0.a, kjf0.b);
                    }
                    bxva.b(intent1, new GetCredentialResponse(credential0));
                    bundle0.putParcelable("androidx.identitycredentials.BUNDLE_KEY_PROVIDER_DATA", intent1);
                    return bundle0;
                }
            }
            else if(bundle1.containsKey("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION")) {
                kln kln0 = kwr.c(intent0);
                if(kln0 != null) {
                    Intent intent2 = new Intent(intent0);
                    bxva.a(intent2, kln0.a(), (kln0.a == null ? null : kln0.a.toString()));
                    bundle0.putParcelable("androidx.identitycredentials.BUNDLE_KEY_PROVIDER_DATA", intent2);
                    return bundle0;
                }
            }
            else {
                bundle0.putParcelable("androidx.identitycredentials.BUNDLE_KEY_PROVIDER_DATA", intent0);
            }
        }
        return bundle0;
    }

    public static final ResultReceiver c(Intent intent0) {
        ibuq.f(intent0, "<this>");
        Bundle bundle0 = intent0.getExtras();
        return bundle0 == null ? null : ((ResultReceiver)bundle0.getParcelable("com.google.android.gms.identitycredentials.extra.RESULT_RECEIVER"));
    }

    public static final bxvv d(Intent intent0) {
        ibuq.f(intent0, "<this>");
        return bxvu.b(intent0);
    }

    public static final boolean e(Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        return bundle0 == null ? false : bundle0.containsKey("androidx.identitycredentials.EXTRA_CREDENTIAL_TYPE") || bundle0.containsKey("androidx.identitycredentials.EXTRA_EXCEPTION_TYPE");
    }

    public static final boolean f(Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        return bundle0 == null ? false : bundle0.containsKey("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE") || bundle0.containsKey("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
    }

    public static final Intent g(int v, String s, String s1) {
        Intent intent0 = new Intent();
        if(v == 0) {
            return intent0;
        }
        if(v - 1 != 0) {
            kwr.e(intent0, new klc(s, s1));
            return intent0;
        }
        intent0.putExtras(bygn.a(s, s1));
        kwr.g(intent0, new kll(s, s1));
        return intent0;
    }
}

