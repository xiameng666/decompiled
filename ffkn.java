import com.google.android.gms.wearable.internal.AddSupervisedAccountRequest;
import j..util.Objects;

final class ffkn extends ffee {
    final AddSupervisedAccountRequest c;
    final fdiy d;
    final fflv e;

    public ffkn(fflv fflv0, AddSupervisedAccountRequest addSupervisedAccountRequest0, fdiy fdiy0) {
        this.c = addSupervisedAccountRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("addSupervisedAccount");
    }

    @Override  // ffee
    public final void a() {
        batl.s(this.e.C);
        evql evql0 = this.e.C.b(this.c.a, this.c.b, this.c.c);
        evql0.z(new ffkl(this.d));
        evql0.A(new ffkm());
    }
}

