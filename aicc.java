import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;
import com.google.android.gms.auth.api.phone.ui.PhoneNumberVerificationUserConsentPromptChimeraActivity;
import com.google.android.gms.common.api.Status;

public final class aicc extends ibsl implements ibtw {
    int a;
    final PhoneNumberVerificationUserConsentPromptChimeraActivity b;
    final String c;
    final IncomingCallRetrieverRequest d;

    public aicc(PhoneNumberVerificationUserConsentPromptChimeraActivity phoneNumberVerificationUserConsentPromptChimeraActivity0, String s, IncomingCallRetrieverRequest incomingCallRetrieverRequest0, ibrl ibrl0) {
        this.b = phoneNumberVerificationUserConsentPromptChimeraActivity0;
        this.c = s;
        this.d = incomingCallRetrieverRequest0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aicc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aicc(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ahze ahze0 = null;
        switch(v) {
            case 0: {
                ibnx.b(object0);
                ahze ahze1 = this.b.k;
                if(ahze1 == null) {
                    ibuq.j("missedCallApiCallHistoryManager");
                    ahze1 = null;
                }
                this.a = 1;
                object0 = ahze1.e(this.c, this);
                if(object0 != object1) {
                    goto label_17;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_17:
                if(((Boolean)object0).booleanValue()) {
                    ggtj ggtj0 = (ggtj)PhoneNumberVerificationUserConsentPromptChimeraActivity.j.h();
                    String s = this.c;
                    ggtj0.B("User consent dialog not shown for package: %s", s);
                    ahze ahze2 = this.b.k;
                    if(ahze2 == null) {
                        ibuq.j("missedCallApiCallHistoryManager");
                    }
                    else {
                        ahze0 = ahze2;
                    }
                    this.a = 2;
                    ahzm ahzm0 = new ahzm(new ahzl(s));
                    Object object2 = icpu.c(ahze0.a.d.b(ahzm0, gmap.a), this);
                    if(object2 != object1) {
                        object2 = ibom.a;
                    }
                    if(object2 != object1) {
                        break;
                    }
                }
                else {
                    ahze ahze3 = this.b.k;
                    if(ahze3 == null) {
                        ibuq.j("missedCallApiCallHistoryManager");
                        ahze3 = null;
                    }
                    this.a = 3;
                    object0 = ahze3.a(this.c, this);
                    if(object0 != object1) {
                    label_40:
                        if(!((Boolean)object0).booleanValue()) {
                            ((ggtj)PhoneNumberVerificationUserConsentPromptChimeraActivity.j.j()).B("Rate limit exceeded for package: %s", this.c);
                            ghwp ghwp0 = aicv.d(this.c, ghwo.c, ghwm.f);
                            this.b.l.a(ghwp0);
                            this.b.a(false, 0xCF0C, "Rate limit exceeded for package: " + this.c);
                            return ibom.a;
                        }
                        ahze ahze4 = this.b.k;
                        if(ahze4 == null) {
                            ibuq.j("missedCallApiCallHistoryManager");
                            ahze4 = null;
                        }
                        this.a = 4;
                        if(ahze4.c(this.c, this) != object1) {
                        label_52:
                            aicb aicb0 = new aicb(this.b, this.c, this.d, null);
                            this.a = 5;
                            if(icbd.a(cclw.e, aicb0, this) != object1) {
                                return ibom.a;
                            }
                        }
                    }
                }
                return object1;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                ibnx.b(object0);
                switch(v) {
                    case 3: {
                        goto label_40;
                    }
                    case 4: {
                        goto label_52;
                    }
                    default: {
                        return ibom.a;
                    }
                }
            }
        }
        ghwp ghwp1 = aicv.c(this.c, ghwo.m);
        this.b.l.a(ghwp1);
        this.b.g(this.c, this.d);
        this.b.a(true, Status.a.i, "Verification started successfully without user consent.");
        return ibom.a;
    }
}

