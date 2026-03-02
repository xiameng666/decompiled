import android.content.Context;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import java.util.concurrent.Callable;

public final class crys implements Callable {
    private static final bboh a;
    private final Context b;
    private final Integer c;
    private final Long d;
    private final String e;

    static {
        crys.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crys(Context context0, String s, Integer integer0) {
        this.b = context0;
        this.e = s;
        this.c = (int)(integer0 == null ? crxn.a() : ((int)integer0));
        this.d = crxn.b();
    }

    @Override
    public final Object call() {
        int v2;
        Context context0 = this.b;
        crxn crxn0 = new crxn(context0);
        Integer integer0 = this.c;
        Long long0 = this.d;
        crxn0.L(11, hhct.bD, integer0, long0);
        try {
            if(hvjq.f()) {
                crvw crvw0 = crvw.c();
                Long long1 = crvw0.p(this.e);
                if(long1 != null && ((long)long1) >= 0L) {
                    cryd cryd0 = new cryd(context0, hvko.u(), "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", ((int)hvko.f()));
                    GetConsentInformationResponse getConsentInformationResponse0 = hvlb.f() ? cryd0.i(long1, 7, integer0, long0, ckji.b) : cryd0.h(long1, 7, integer0, long0);
                    ConsentAgreementText consentAgreementText0 = getConsentInformationResponse0.b;
                    ConsentStatus consentStatus0 = getConsentInformationResponse0.a;
                    if(consentAgreementText0 != null && consentStatus0 != null) {
                        boolean z = crvw0.x(long1, consentAgreementText0) && crvw0.z(long1, consentStatus0.a());
                        crxn crxn1 = new crxn(context0);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        boolean z1 = true;
                        ((giyo)hftv0).b = 9;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giyo)hftp0.b_message).c = z;
                        crxn1.j(((giyo)hftp0.N_build()), "MDP_PeriodicService", integer0);
                        int v = 0;
                        int v1 = 0;
                        for(Object object0: crvw0.t()) {
                            String s = (String)object0;
                            if(long1.equals(crvw0.p(s))) {
                                ++v1;
                                hfys hfys0 = crvw0.j(s);
                                if(hfys0 != null && hfys0.i < consentAgreementText0.g) {
                                    hhcr hhcr0 = hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g);
                                    if(ggog.h(new Integer[]{((int)1), ((int)3)}).contains(Integer.valueOf(hhcr0.a()))) {
                                        ++v;
                                    }
                                }
                            }
                        }
                        if(z) {
                            String s1 = consentAgreementText0.h;
                            crxn crxn2 = new crxn(context0);
                            if(consentStatus0.a == 3) {
                                z1 = false;
                            }
                            crxn2.k(z1, consentAgreementText0.g, gfta.b(s1), v, v1, integer0, long0);
                            v2 = 3;
                        }
                        else {
                            v2 = 8;
                        }
                    }
                    else {
                        v2 = 7;
                    }
                }
                else {
                    v2 = 4;
                }
            }
            else {
                v2 = 5;
            }
        }
        catch(acse | iapl exception0) {
            bcnm.i(cslm.h(), "RPC call failed when attempting to cache consent text", exception0, crys.a);
            v2 = 6;
        }
        if(v2 == 3) {
            return null;
        }
        crxn0.H(v2, this.c, this.d);
        throw new cryr(v2);
    }
}

