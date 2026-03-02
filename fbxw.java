import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import j..util.Objects;

public final class fbxw {
    public final ApplicationParameters a;

    public fbxw(ApplicationParameters applicationParameters0) {
        Objects.requireNonNull(applicationParameters0);
        this.a = applicationParameters0;
        super();
    }

    public final void a(boolean z) {
        this.a.d = z;
    }

    public final void b(Bundle bundle0) {
        this.a.c = bundle0;
    }

    public final void c(int v) {
        this.a.g = v;
    }

    public final void d(Account account0) {
        this.a.b = account0;
    }

    public final void e(WalletCustomTheme walletCustomTheme0) {
        this.a.f = walletCustomTheme0;
    }

    public final void f(int v) {
        this.a.a = v;
    }

    public final void g(int v) {
        this.a.k = v;
    }

    public final void h(double f) {
        this.a.i = f;
    }

    public final void i(double f) {
        this.a.h = f;
    }

    public final void j(int v) {
        this.a.e = v;
    }
}

