import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.credential.manager.database.PwmDatabase;

public final class bgid {
    public static final bghe a(Account account0, Context context0) {
        azts azts1;
        bdcd bdcd0;
        azts azts0;
        if(hsaj.a.b().b()) {
            aysz aysz0 = new aysz(context0);
            azts0 = new aysy(context0);
            bdcd0 = new bdcd(aysz0, "com.google.android.gms");
            azts1 = ayss.i(context0, account0);
            new bdcd(ayss.e(context0, account0), "com.google.android.gms");
            return new bghe(bdcd0, new bdbk(azts0), azts1);
        }
        if(bdim.a(account0.name)) {
            aysr aysr0 = new aysr(context0, axzj.b(), null);
            azts0 = new azts(context0, axzj.b());
            bdcd0 = new bdbo(aysr0);
            azts1 = new bdbn(context0);
            new aysr(context0, axzj.b());
            return new bghe(bdcd0, new bdbk(azts0), azts1);
        }
        aysr aysr1 = (aysr)axzg.e().a(account0);
        azts0 = axzg.a().a(account0);
        bdcd0 = new bdcd(aysr1, "com.google.android.gms");
        azts1 = ayss.i(context0, account0);
        new bdcd(ayss.e(context0, account0), "com.google.android.gms");
        return new bghe(bdcd0, new bdbk(azts0), azts1);
    }

    public static final bgjk b(Account account0, Context context0) {
        bglw bglw0 = new bglw(new bgjl(context0), new beum(context0));
        bdva bdva0 = PwmDatabase.w(context0).x();
        String s = account0.name;
        bbll bbll0 = new bbll(1, 9);
        return new bgjk(s, bglw0, new bgjd(), bbll0, bdva0);
    }

    public static final bggq c(Account account0, Account account1, Context context0, grck grck0) {
        bghe bghe0 = bgid.a(account0, context0);
        bblp bblp0 = new bblp(((int)hsap.a.b().a()), 9);
        fhad fhad0 = fhae.a();
        fhad0.b(context0);
        iakr iakr0 = iala.b(cmma.g(0x5A00, -1, fhad0.a(), new fhbw()).a(grde.e), new iakw[]{gpmu.d()});
        hebp hebp0 = !hsas.a.b().h() || !grck0.equals(grck.c) ? hebp.c : hebp.b;
        gpig gpig0 = gpig.b();
        iakq iakq0 = iakq.a.h(gpji.g, gpig0);
        gphs gphs0 = new gphs(account1.name, "google");
        return new bggq(new bghr(context0, bblp0, new grcu(iakr0, iakq0.h(gphs.a, gphs0).h(gpmu.a, hebp0)), account0.name, new grbx(new bggs()), grck0), bgid.b(account0, context0), new bgiy(), bghe0, new bgiv(bghe0));
    }
}

