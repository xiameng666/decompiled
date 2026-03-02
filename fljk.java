import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;

public final class fljk implements glzm {
    public final fljw a;
    public final ContactId b;

    public fljk(fljw fljw0, ContactId contactId0) {
        this.a = fljw0;
        this.b = contactId0;
    }

    @Override  // glzm
    public final gmcd a() {
        fljw fljw0 = this.a;
        ContactId contactId0 = this.b;
        gfsx gfsx0 = fljw0.k.e(contactId0);
        if(gfsx0.i() && ((AccountContext)gfsx0.d()).b() == fmav.a) {
            flca flca0 = flcb.a();
            flca0.a = 2;
            return gmbu.i(flca0.a());
        }
        fmai fmai0 = fmaj.a();
        fmai0.g(7);
        fmai0.n(contactId0);
        fmaj fmaj0 = fmai0.a();
        fljw0.a.b(fmaj0);
        flqv flqv0 = flqw.a();
        flqv0.a = "register";
        flqv0.b(flra.c);
        gmcd gmcd0 = gmbu.n(new fljm(fljw0, contactId0, flqv0.a()), fljw0.i);
        gmcd gmcd1 = glzd.f(gmcd0, new fljn(fljw0), gmap.a);
        return gmbu.b(new gmcd[]{gmcd1}).a(new fljo(fljw0, gmcd0, contactId0, gmcd1), gmap.a);
    }
}

