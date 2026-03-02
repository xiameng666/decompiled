import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.logging.Level;

public final class cryu implements Callable {
    public static final bboh a;
    private final Context b;
    private final Integer c;
    private final Long d;

    static {
        cryu.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public cryu(Context context0, Integer integer0) {
        this.b = context0;
        this.c = integer0;
        this.d = crxn.b();
    }

    // This method was un-flattened
    @Override
    public final Object call() {
        Iterator iterator3;
        ProtoLiteMessage hftv0;
        ProtoLiteBuilder hftp0;
        crxn crxn1;
        boolean z2;
        ConsentAgreementText consentAgreementText0;
        GetConsentInformationResponse getConsentInformationResponse0;
        Integer integer1;
        crvw crvw2;
        Iterator iterator1;
        int v;
        boolean z1;
        String s1;
        Long long2;
        crvw crvw1;
        Context context0 = this.b;
        boolean z = true;
        Iterator iterator0 = csli.A(context0, 2).iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = ((cslv)object0).a;
            crvw crvw0 = crvw.c();
            if(TextUtils.isEmpty(s)) {
                ((ggtj)cryu.a.j()).B("%s: Device lists SIM card without ICCID, cannot execute GetConsent gRPC on it.", "BgTaskGetConsent");
            }
            else {
                Long long0 = crvw0.p(s);
                if(long0 == null) {
                    Level level0 = cslm.h();
                    cryu.a.g(level0).B("%s: Device lists SIM card without carrierId, cannot execute GetConsent gRPC on it.", "BgTaskGetConsent");
                }
                else {
                    hfwn hfwn0 = crvw0.i(long0);
                    if(hfwn0 == null || System.currentTimeMillis() / 1000L - hfwn0.b >= hvje.a.e().d()) {
                        crxn crxn0 = new crxn(context0);
                        Integer integer0 = this.c;
                        Long long1 = this.d;
                        crxn0.L(11, hhct.bD, integer0, long1);
                        try {
                            if(hvje.i()) {
                                crvw1 = crvw.c();
                                long2 = crvw1.p(s);
                                if(long2 == null) {
                                }
                                else if(((long)long2) < 0L) {
                                    iterator1 = iterator0;
                                    v = 4;
                                    goto label_97;
                                }
                                else {
                                    s1 = hvko.u();
                                    z1 = z;
                                    goto label_37;
                                }
                                goto label_95;
                            }
                            else {
                                v = 5;
                                iterator1 = iterator0;
                            }
                        }
                        catch(acse | iapl unused_ex) {
                            iterator1 = iterator0;
                        }
                        goto label_97;
                        try {
                        label_37:
                            cryd cryd0 = new cryd(context0, s1, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", ((int)hvko.f()));
                            if(hvlb.f()) {
                                crvw2 = crvw1;
                                integer1 = integer0;
                                getConsentInformationResponse0 = cryd0.i(long2, 7, integer1, long1, ckji.b);
                            }
                            else {
                                integer1 = integer0;
                                crvw2 = crvw1;
                                getConsentInformationResponse0 = cryd0.h(long2, 7, integer1, long1);
                            }
                            consentAgreementText0 = getConsentInformationResponse0.b;
                            if(consentAgreementText0 != null && getConsentInformationResponse0.a != null) {
                                z2 = crvw2.x(long2, consentAgreementText0) && crvw2.z(long2, getConsentInformationResponse0.a.a());
                                crxn1 = new crxn(context0);
                                hftp0 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                hftv0 = hftp0.b_message;
                                iterator1 = iterator0;
                                goto label_58;
                            }
                            else {
                                iterator1 = iterator0;
                                v = 7;
                                goto label_97;
                            }
                            goto label_95;
                        }
                        catch(acse | iapl unused_ex) {
                            iterator1 = iterator0;
                            goto label_97;
                        }
                        try {
                        label_58:
                            ((giyo)hftv0).b = 9;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((giyo)hftp0.b_message).c = z2;
                            crxn1.j(((giyo)hftp0.N_build()), "MDP_PeriodicService", integer1);
                            int v1 = 0;
                            int v2 = 0;
                            for(Iterator iterator2 = crvw2.t().iterator(); iterator2.hasNext(); iterator2 = iterator3) {
                                Object object1 = iterator2.next();
                                String s2 = (String)object1;
                                if(crvw2.p(s2) != null && long2.equals(crvw2.p(s2))) {
                                    ++v2;
                                    hfys hfys0 = crvw2.j(s2);
                                    if(hfys0 == null) {
                                        iterator3 = iterator2;
                                    }
                                    else {
                                        iterator3 = iterator2;
                                        if(hfys0.i < consentAgreementText0.g) {
                                            hhcr hhcr0 = hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g);
                                            if(ggog.h(new Integer[]{((int)1), ((int)3)}).contains(Integer.valueOf(hhcr0.a()))) {
                                                ++v1;
                                            }
                                        }
                                    }
                                }
                                else {
                                    iterator3 = iterator2;
                                }
                            }
                            if(z2) {
                                Level level1 = cslm.h();
                                cryu.a.g(level1).X("%s: Fetched consent with ICCID %s for carrier ID %d", "BgTaskGetConsent", s, long2);
                                new crxn(context0).k(getConsentInformationResponse0.a.a != 3, consentAgreementText0.g, consentAgreementText0.h, v1, v2, integer1, long1);
                                v = 3;
                                goto label_103;
                            }
                            else {
                                v = 8;
                                goto label_97;
                            }
                            iterator1 = iterator0;
                            v = 7;
                            goto label_97;
                        label_95:
                            iterator1 = iterator0;
                            v = 4;
                        }
                        catch(acse | iapl unused_ex) {
                        }
                    label_97:
                        ((ggtj)cryu.a.j()).X("%s: Consent fetch failed for SIM card with ICCID: %s\nResult: %s", "BgTaskGetConsent", s, Integer.valueOf(v - 2));
                        crxn0.H(v, this.c, this.d);
                        z = false;
                        goto label_104;
                    }
                }
            }
            iterator1 = iterator0;
            z1 = z;
        label_103:
            z = z1;
        label_104:
            iterator0 = iterator1;
        }
        return Boolean.valueOf(z);
    }
}

