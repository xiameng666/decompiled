import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public final class flvq {
    private final flce a;

    public flvq(flce flce0) {
        this.a = flce0;
    }

    public final hnwm a(String s, String s1, String s2, PublicKey publicKey0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnwm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((hnwm)hftv0).f = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnwm hnwm0 = (hnwm)hftp0.b_message;
        s1.getClass();
        hnwm0.j = s1;
        String s3 = Locale.getDefault().toLanguageTag();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnwm hnwm1 = (hnwm)hftp0.b_message;
        s3.getClass();
        hnwm1.h = s3;
        List list0 = this.a.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnwm hnwm2 = (hnwm)hftp0.b_message;
        hfuf hfuf0 = hnwm2.i;
        if(!hfuf0.c()) {
            hnwm2.i = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(list0, hnwm2.i);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnxa.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        s.getClass();
        ((hnxa)hftv1).c = s;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hnxa)hftp1.b_message).b = 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnwm hnwm3 = (hnwm)hftp0.b_message;
        hnxa hnxa0 = (hnxa)hftp1.N_build();
        hnxa0.getClass();
        hnwm3.e = hnxa0;
        hnwm3.b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnxj.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(publicKey0.getEncoded());
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((hnxj)hftv2).c = hfsf0;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hnxj)hftp2.b_message).b = 2;
        hnxj hnxj0 = (hnxj)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        hnxj0.getClass();
        ((hnwm)hftv3).g = hnxj0;
        ((hnwm)hftv3).b |= 4;
        if(s2 != null) {
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hnwm)hftp0.b_message).c = 7;
            ((hnwm)hftp0.b_message).d = s2;
        }
        return (hnwm)hftp0.N_build();
    }

    public static hnxb b(ContactId contactId0) {
        int v = ((.AutoValue_ContactId)contactId0).c.ordinal() == 1 ? 3 : 18;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnxb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hnxb)hftv0).c = v - 2;
        String s = ((.AutoValue_ContactId)contactId0).a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hnxb)hftv1).d = s;
        String s1 = ((.AutoValue_ContactId)contactId0).b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnxb)hftp0.b_message).e = s1;
        return (hnxb)hftp0.N_build();
    }

    public static final gmcd c(fiej fiej0, String s, String s1, UUID uUID0) {
        HashMap hashMap0 = new HashMap();
        if(s != null) {
            hashMap0.put("ID", s);
        }
        if(s1 != null) {
            hashMap0.put("APP_NAME", s1);
        }
        if(uUID0 != null) {
            hashMap0.put("REQUEST_ID", uUID0.toString());
        }
        flbj.a("RegReqBuilder", "DroidGuard Args: " + hashMap0.toString());
        return flcq.b(new flvo(fiej0, hashMap0));
    }

    public static final gmcd d(fiei fiei0) {
        flbo.b();
        return gmbu.n(new flvl(fiei0), flbs.b().a);
    }
}

