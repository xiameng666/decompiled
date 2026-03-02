import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;

public final class bmhd {
    public static final AuthenticatorSelectionCriteria a(Attachment attachment0, Boolean boolean0, UserVerificationRequirement userVerificationRequirement0, ResidentKeyRequirement residentKeyRequirement0) {
        String s = null;
        String s1 = attachment0 == null ? null : attachment0.c;
        String s2 = userVerificationRequirement0 == null ? null : userVerificationRequirement0.d;
        if(residentKeyRequirement0 != null) {
            s = residentKeyRequirement0.d;
        }
        return new AuthenticatorSelectionCriteria(s1, boolean0, s2, s);
    }
}

