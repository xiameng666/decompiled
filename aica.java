import com.google.android.gms.auth.api.phone.ui.PhoneNumberVerificationUserConsentPromptChimeraActivity;

final class aica extends ibsl implements ibtw {
    int a;
    final PhoneNumberVerificationUserConsentPromptChimeraActivity b;
    final String c;

    public aica(PhoneNumberVerificationUserConsentPromptChimeraActivity phoneNumberVerificationUserConsentPromptChimeraActivity0, String s, ibrl ibrl0) {
        this.b = phoneNumberVerificationUserConsentPromptChimeraActivity0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aica)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aica(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ahze ahze0 = this.b.k;
            if(ahze0 == null) {
                ibuq.j("missedCallApiCallHistoryManager");
                ahze0 = null;
            }
            this.a = 1;
            if(ahze0.d(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

