import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyPair;
import java.security.PublicKey;
import java.util.concurrent.Callable;

public final class flvn implements Callable {
    public final flvq a;
    public final hnxl b;
    public final ContactId c;
    public final gmcd d;
    public final String e;
    public final gmcd f;
    public final gmcd g;

    public flvn(flvq flvq0, hnxl hnxl0, ContactId contactId0, gmcd gmcd0, String s, gmcd gmcd1, gmcd gmcd2) {
        this.a = flvq0;
        this.b = hnxl0;
        this.c = contactId0;
        this.d = gmcd0;
        this.e = s;
        this.f = gmcd1;
        this.g = gmcd2;
    }

    @Override
    public final Object call() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnwt.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ContactId contactId0 = this.c;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.b.getClass();
        ((hnwt)hftv0).c = this.b;
        ((hnwt)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hnwt)hftv1).f = ((.AutoValue_ContactId)contactId0).b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnwt)hftp0.b_message).e = 0;
        String s = (String)gmbu.r(this.d);
        String s1 = (String)gmbu.r(this.f);
        PublicKey publicKey0 = ((KeyPair)gmbu.r(this.g)).getPublic();
        hnwm hnwm0 = this.a.a(s, this.e, s1, publicKey0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnwt hnwt0 = (hnwt)hftp0.b_message;
        hnwm0.getClass();
        hnwt0.d = hnwm0;
        hnwt0.b |= 2;
        return (hnwt)hftp0.N_build();
    }
}

