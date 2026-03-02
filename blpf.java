import android.accounts.Account;
import android.content.Context;
import android.security.keystore.KeyInfo;

public final class blpf extends blpj {
    private final ajes a;
    private final byte[] b;
    private final Account c;

    public blpf(Context context0, byte[] arr_b, Account account0) {
        bmdz bmdz0 = new bmdz(context0);
        ajes ajes0 = new ajes(context0);
        KeyInfo keyInfo0 = blpt.c(bbmu.c(arr_b));
        super(bmdz0, arr_b, ghjc.d.o(arr_b), keyInfo0);
        this.a = ajes0;
        this.b = arr_b;
        this.c = account0;
    }

    @Override  // blpj
    public final gfsx e() {
        return gfsx.m(this.c);
    }

    @Override  // blpj
    public final gmcd f() {
        return fhra.b(this.a.f(this.b));
    }

    @Override  // blpj
    public final boolean l() {
        return true;
    }

    @Override  // blpj
    public final boolean n() {
        return false;
    }

    @Override  // blpj
    public final boolean p() {
        return false;
    }
}

