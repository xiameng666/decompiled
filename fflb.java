import com.google.android.gms.wearable.internal.AcceptTermsRequest;
import j..util.Objects;

final class fflb extends ffee {
    final AcceptTermsRequest c;
    final fdiy d;
    final fflv e;

    public fflb(fflv fflv0, AcceptTermsRequest acceptTermsRequest0, fdiy fdiy0) {
        this.c = acceptTermsRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("acceptTerms");
    }

    @Override  // ffee
    public final void a() {
        evql evql0;
        if(fdci.a(ffgp.m())) {
            batl.s(this.e.C);
            boolean z = ffgp.k();
            evql0 = this.e.C.a(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, z, this.c.h);
        }
        else {
            batl.s(this.e.C);
            boolean z1 = ffgp.k();
            evql0 = this.e.C.a(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, z1, false);
        }
        evql0.z(new ffla(this.d));
    }
}

