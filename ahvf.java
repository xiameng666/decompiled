import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.List;

public final class ahvf implements azys {
    public final ahwl a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final InternalSignInCredentialWrapper f;
    public final String g;
    public final String h;
    public final int i;
    public final String j;
    public final List k;

    public ahvf(ahwl ahwl0, String s, String s1, String s2, String s3, InternalSignInCredentialWrapper internalSignInCredentialWrapper0, String s4, String s5, int v, String s6, List list0) {
        this.a = ahwl0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = internalSignInCredentialWrapper0;
        this.g = s4;
        this.h = s5;
        this.i = v;
        this.j = s6;
        this.k = list0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahrn ahrn0 = new ahrn(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.c(ahrn0, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, apiMetadata0, this.j, this.k);
    }
}

