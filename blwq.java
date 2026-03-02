import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;

public final class blwq {
    public static boolean a(RequestOptions requestOptions0, boolean z) {
        return blwq.b(blwt.d(requestOptions0), z);
    }

    public static boolean b(UserVerificationRequirement userVerificationRequirement0, boolean z) {
        if(userVerificationRequirement0 != null) {
            switch(userVerificationRequirement0.ordinal()) {
                case 0: {
                    if(z) {
                        return true;
                    }
                    throw bxma.f(34018, "Authenticator does not support user verification.");
                }
                case 1: {
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return z;
    }
}

