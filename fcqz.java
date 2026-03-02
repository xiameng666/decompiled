import android.accounts.Account;
import j..util.Objects;
import j..util.Optional;

final class fcqz implements gmbg {
    final String a;
    final long b;
    final Optional c;
    final fcrb d;
    final int e;

    public fcqz(fcrb fcrb0, String s, long v, Optional optional0, int v1) {
        this.a = s;
        this.b = v;
        this.c = optional0;
        this.e = v1;
        Objects.requireNonNull(fcrb0);
        this.d = fcrb0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fcrb.a.g("Failed to notify phone that it\'s ready to restore", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        fcrb.a.j("Received phone\'s response. Should start restore: " + ((ffbm)object0).c, new Object[0]);
        if(((ffbm)object0).c) {
            Account account0 = (Account)this.c.get();
            this.d.b(this.a, this.b, account0, this.e);
        }
    }
}

