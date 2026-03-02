import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.Map;

public final class flec implements gfsi {
    public final flen a;
    public final AccountContext b;
    public final ContactId c;
    public final gftc d;

    public flec(flen flen0, AccountContext accountContext0, ContactId contactId0, gftc gftc0) {
        this.a = flen0;
        this.b = accountContext0;
        this.c = contactId0;
        this.d = gftc0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx0 = (gfsx)object0;
        boolean z = gfsx0.i();
        ContactId contactId0 = this.c;
        if(!z) {
            fmen fmen0 = fmeo.a();
            fmen0.c(contactId0);
            fmen0.d(-1L);
            fmen0.i(ggna.a);
            fmen0.l(ggna.a);
            gfsx0 = gfsx.m(fmen0.a());
        }
        gmcd gmcd0 = null;
        AccountContext accountContext0 = this.b;
        flen flen0 = this.a;
        fmeo fmeo0 = (fmeo)gfsx0.d();
        boolean z1 = this.d.a(fmeo0);
        flbj.a("LitContactCtrlr", "shouldUpdateContact " + z1);
        Object object1 = (fmeo)gfsx0.d();
        if(z1) {
            synchronized(flen0.c) {
                Map map0 = flen0.f;
                gmcd0 = (gmcd)map0.get(Pair.create(accountContext0, contactId0));
                if(gmcd0 != null && !gmcd0.isDone()) {
                    flbj.a("LitContactCtrlr", "ContactSync already pending for contact");
                }
                else {
                    flbj.a("LitContactCtrlr", "sync contact profile");
                    flqv flqv0 = flqw.a();
                    flqv0.a = "sync contact profile";
                    flqv0.b(flra.c);
                    gmcd gmcd1 = gmbu.n(new flei(flen0, accountContext0, ((fmeo)object1), flqv0.a()), flen0.a);
                    gmcd0 = glzd.f(gmbu.b(new gmcd[]{gmcd1}).a(new flej(flen0, accountContext0, ((fmeo)object1), gmcd1), gmap.a), new flek(flen0, ((fmeo)object1), accountContext0), gmap.a);
                    map0.put(Pair.create(accountContext0, contactId0), gmcd0);
                }
            }
        }
        else if(object1.f && object1.d.i()) {
            flbj.a("LitContactCtrlr", "refetch profile image");
            synchronized(flen0.d) {
                Map map1 = flen0.g;
                ContactId contactId1 = object1.a;
                gmcd gmcd2 = (gmcd)map1.get(Pair.create(accountContext0, contactId1));
                if(gmcd2 != null && !gmcd2.isDone() && !gmcd2.isCancelled()) {
                    flbj.a("LitContactCtrlr", "contactSync or contactImageFetch already pending for contact");
                }
                else {
                    flee flee0 = new flee(flen0, accountContext0, ((fmeo)object1));
                    gmcd2 = flen0.a.e(flee0);
                    map1.put(Pair.create(accountContext0, contactId1), gmcd2);
                }
                gmcd0 = gmcd2;
            }
        }
        if(gmcd0 != null) {
            fled fled0 = new fled(flen0, gmcd0, accountContext0, contactId0);
            flen0.a.d(fled0);
        }
        return object1;
    }
}

