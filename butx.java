import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.net.Uri.Builder;
import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

final class butx extends ibsl implements ibtw {
    final buty a;
    final ghip b;
    final boolean c;

    public butx(buty buty0, ghip ghip0, boolean z, ibrl ibrl0) {
        this.a = buty0;
        this.b = ghip0;
        this.c = z;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((butx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new butx(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Boolean boolean0;
        icnl icnl0;
        ibnx.b(object0);
        try {
            try {
                Uri.Builder uri$Builder0 = Uri.parse(ghiq.a(this.b).b).buildUpon();
                uri$Builder0.appendQueryParameter("hide_ogb", "true");
                uri$Builder0.appendQueryParameter("utm_source", "google_one");
                uri$Builder0.appendQueryParameter("utm_medium", "android");
                uri$Builder0.appendQueryParameter("dm", String.valueOf(this.c));
                String s = uri$Builder0.build().toString();
                ibuq.e(s, "toString(...)");
                Account account0 = new Account(this.a.b.a, "com.google");
                String s1 = String.format(Locale.ROOT, "weblogin:continue=%s", Arrays.copyOf(new Object[]{Uri.encode(s)}, 1));
                ibuq.e(s1, "format(...)");
                String s2 = this.a.c.c(account0, s1, false);
                ibuq.c(s2);
                butv butv0 = new butv(s2);
                this.a.f.g(butv0);
                goto label_41;
            }
            catch(IOException iOException0) {
                ((ggtj)((ggtj)buty.a.j()).s(iOException0)).x("Token IO failure");
                butt butt0 = new butt(iOException0);
                this.a.f.g(butt0);
                goto label_41;
            }
            catch(OperationCanceledException operationCanceledException0) {
                ((ggtj)((ggtj)buty.a.j()).s(operationCanceledException0)).x("Token canceled");
                butt butt1 = new butt(operationCanceledException0);
                this.a.f.g(butt1);
            }
            catch(AuthenticatorException authenticatorException0) {
                ((ggtj)((ggtj)buty.a.j()).s(authenticatorException0)).x("Authenticator failure");
                butt butt2 = new butt(authenticatorException0);
                this.a.f.g(butt2);
            }
            catch(NullPointerException nullPointerException0) {
                ((ggtj)((ggtj)buty.a.j()).s(nullPointerException0)).x("Token failed to fetch");
                butt butt3 = new butt(nullPointerException0);
                this.a.f.g(butt3);
            }
            icnl0 = this.a.g;
            boolean0 = Boolean.valueOf(false);
            goto label_43;
        }
        catch(Throwable throwable0) {
            this.a.g.g(Boolean.valueOf(false));
            throw throwable0;
        }
    label_41:
        boolean0 = Boolean.valueOf(false);
        icnl0 = this.a.g;
    label_43:
        icnl0.g(boolean0);
        return ibom.a;
    }
}

