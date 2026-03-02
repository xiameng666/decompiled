import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class alk {
    public final Signature a;
    public final Cipher b;
    public final Mac c;
    public final IdentityCredential d;
    public final PresentationSession e;
    public final long f;

    public alk(long v) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = v;
    }

    @Deprecated
    public alk(IdentityCredential identityCredential0) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = identityCredential0;
        this.e = null;
        this.f = 0L;
    }

    public alk(PresentationSession presentationSession0) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = presentationSession0;
        this.f = 0L;
    }

    public alk(Signature signature0) {
        this.a = signature0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0L;
    }

    public alk(Cipher cipher0) {
        this.a = null;
        this.b = cipher0;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0L;
    }

    public alk(Mac mac0) {
        this.a = null;
        this.b = null;
        this.c = mac0;
        this.d = null;
        this.e = null;
        this.f = 0L;
    }
}

