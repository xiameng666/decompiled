import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.pay.init.PayInitIntentOperation;
import j..util.Optional;

public final class doku implements dokx {
    private final dola a;
    private final dmgr b;

    public doku(dola dola0, dmgr dmgr0) {
        this.a = dola0;
        this.b = dmgr0;
    }

    static final bxuv a() {
        return bxuw.a(dlnj.a());
    }

    static final azts b() {
        return dxei.b(dlnj.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        PayInitIntentOperation payInitIntentOperation0 = (PayInitIntentOperation)object0;
        payInitIntentOperation0.h = doku.b();
        payInitIntentOperation0.e = gfsx.m(Boolean.valueOf(this.a.c));
        bxuv bxuv0 = doku.a();
        cqxc cqxc0 = dpsv.a(dlnj.a(), dolc.b(this.a));
        Context context0 = dlnj.a();
        bblp bblp0 = new bblp(0x7FFFFFFF, 10);
        dtze dtze0 = new dtze(dlnj.a(), doku.b());
        String s = dolf.b(this.a);
        dtrw dtrw0 = new dtrw(dlnj.a(), dole.b(this.a), dmgy.a());
        Account account0 = dolc.b(this.a);
        Context context1 = dlnj.a();
        String s1 = dolf.b(this.a);
        String s2 = dole.b(this.a);
        String s3 = dmgy.a();
        azts azts0 = doku.b();
        dmkl dmkl0 = new dmkl(dlnj.a());
        payInitIntentOperation0.f = gfsx.m(new dtrf(bxuv0, cqxc0, context0, bblp0, dtze0, s, dtrw0, new dtpl(account0, dmhh.b(context1, s1, s2, s3, this.b.a, Optional.empty()), azts0, dmkl0)));
        payInitIntentOperation0.g = new dtqw(doku.a(), new bblp(0x7FFFFFFF, 10), dlnj.a());
    }
}

