import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;

public final class bmvy {
    public final Status a;
    public final String b;
    public final gfsx c;
    public final gfsx d;

    public bmvy(Status status0, String s, gfsx gfsx0, gfsx gfsx1) {
        this.a = status0;
        this.b = s;
        this.c = gfsx0;
        this.d = gfsx1;
    }

    public static bmvy a(PublicKeyCredential publicKeyCredential0) {
        gfsx gfsx0 = gfsx.m(publicKeyCredential0);
        return new bmvy(Status.b, "CTAP_SUCCESS", gfsx0, gfqx.a);
    }

    public static bmvy b(String s) {
        gfsx gfsx0 = gfsx.m(s);
        return new bmvy(Status.b, "JSON_SUCCESS", gfqx.a, gfsx0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmvy) ? bata.b(this.a, ((bmvy)object0).a) && bata.b(this.b, ((bmvy)object0).b) && bata.b(this.c, ((bmvy)object0).c) && bata.b(this.d, ((bmvy)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override
    public final String toString() {
        return "HybridUiResult{status=" + this.a.toString() + ", statusDetails=" + this.b + ", publicKeyCredentialOptional=" + this.c.toString() + ", jsonResponseOptional=" + this.d.toString() + "}";
    }
}

