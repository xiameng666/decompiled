import android.text.TextUtils;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.MfaInfo;
import java.util.ArrayList;
import java.util.List;

public final class goyz implements goxb {
    public boolean a;
    public String b;
    public String c;
    public long d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public List k;
    public String l;
    private String m;
    private String n;
    private String o;
    private String p;

    @Override  // goxb
    public final Parser a() {
        return (Parser)((ProtoLiteMessage)gdii.a).jf(7, null);
    }

    @Override  // goxb
    public final void b(MessageLite hfvm0) {
        if(!(hfvm0 instanceof gdii)) {
            throw new IllegalArgumentException("The passed proto must be an instance of VerifyAssertionResponse.");
        }
        this.a = ((gdii)hfvm0).h;
        this.b = bbqr.b(((gdii)hfvm0).g);
        this.c = bbqr.b(((gdii)hfvm0).l);
        this.d = ((gdii)hfvm0).m;
        bbqr.b(((gdii)hfvm0).e);
        this.e = bbqr.b(((gdii)hfvm0).c);
        bbqr.b(((gdii)hfvm0).f);
        bbqr.b(((gdii)hfvm0).d);
        this.f = bbqr.b(((gdii)hfvm0).b);
        this.g = bbqr.b(((gdii)hfvm0).o);
        this.h = ((gdii)hfvm0).q;
        this.m = ((gdii)hfvm0).i;
        this.n = ((gdii)hfvm0).n;
        this.i = bbqr.b(((gdii)hfvm0).p);
        this.p = bbqr.b(((gdii)hfvm0).r);
        this.j = bbqr.b(((gdii)hfvm0).s);
        this.k = new ArrayList();
        for(Object object0: ((gdii)hfvm0).u) {
            this.k.add(MfaInfo.a(((gdir)object0)));
        }
        this.l = bbqr.b(((gdii)hfvm0).t);
        this.o = bbqr.b(((gdii)hfvm0).k);
    }

    public final DefaultOAuthCredential c() {
        if(TextUtils.isEmpty(this.m) && TextUtils.isEmpty(this.n)) {
            return null;
        }
        String s = this.f;
        String s1 = this.n;
        String s2 = this.m;
        String s3 = this.p;
        String s4 = this.o;
        batl.r(s, "Must specify a non-empty providerId");
        if(TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new DefaultOAuthCredential(s, s1, s2, null, s3, s4, null);
    }

    public final boolean d() {
        return !TextUtils.isEmpty(this.l);
    }
}

