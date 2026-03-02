import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class dpfy {
    final Provider a;
    final Provider b;
    private final domv c;
    private final dola d;
    private final dpja e;

    public dpfy(dola dola0, dpja dpja0, domv domv0) {
        this.c = domv0;
        this.d = dola0;
        this.e = dpja0;
        dpfx dpfx0 = new dpfx(domv0);
        this.a = dpfx0;
        this.b = new dpjb(dpfx0);
    }

    public final dpgo a() {
        Context context0 = this.c.a();
        Account account0 = dolc.b(this.d);
        String s = dmgy.a();
        Preconditions.f(this.e.b);
        frii frii0 = this.c.n();
        Preconditions.e(frii0);
        frce frce0 = new frce(context0);
        frce0.d("pay");
        frce0.c(account0);
        this.e.b.equals(dpgp.a);
        frce0.e("mse/" + s + "/" + this.e.a + ".pb");
        this.e.b.equals(dpgp.a);
        frie frie0 = frif.a();
        frie0.f(frce0.a());
        frie0.e(((MessageLite)dpeb.b));
        return new dpgo(frii0.a(frie0.a()));
    }

    public final dpiz b() {
        Context context0 = this.c.a();
        String s = dolf.b(this.d);
        String s1 = dole.b(this.d);
        dpgo dpgo0 = this.a();
        dpga dpga0 = dpga.j(this.c.a());
        Preconditions.f(dpga0);
        dpgj dpgj0 = new dpgj(this.c.a(), dolf.b(this.d), dole.b(this.d), dmgy.a(), this.e.a);
        fbio fbio0 = new fbio(this.c.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), dolc.b(this.d)));
        WalletCustomTheme walletCustomTheme0 = edtn.a();
        etgl etgl0 = new etgl(this.c.a());
        Context context1 = this.c.a();
        String s2 = dmgy.a();
        frii frii0 = this.c.n();
        Preconditions.e(frii0);
        dpha dpha0 = new dpha(context1, s2, frii0);
        this.c.a();
        dmgi dmgi0 = new dmgi(dolf.b(this.d), dmgy.a());
        Context context2 = this.c.a();
        Context context3 = this.c.a();
        String s3 = dmgy.a();
        frii frii1 = this.c.n();
        Preconditions.e(frii1);
        dpjn dpjn0 = new dpjn(context2, new dpjm(context3, s3, frii1));
        return new dpiz(context0, s, s1, this.e.a, dpgo0, dpga0, dpgj0, fbio0, this.b, walletCustomTheme0, etgl0, dpha0, dmgi0, dpjn0);
    }
}

