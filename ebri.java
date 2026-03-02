import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ebri implements dpue {
    final dyna a;
    final String b;
    final ebrj c;

    public ebri(ebrj ebrj0, dyna dyna0, String s) {
        this.a = dyna0;
        this.b = s;
        Objects.requireNonNull(ebrj0);
        this.c = ebrj0;
        super();
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        if(dpui0 != null && (dpui0.getCause() instanceof dpuk)) {
            gtli gtli0 = ((dpuk)dpui0.getCause()).a;
            if(gtli0 != null && gtli0.f.equals("Secure element card was not found.")) {
                this.c.d.c(this.a, this.b);
                this.c.c(Status.b);
                this.c.g.g(this.c.b, ebrj.n);
                return;
            }
        }
        a.aq(ebrj.a.i(), "Unable to dissociate Se Prepaid Card on backend", '\u2FEB', dpui0);
        this.c.c(Status.d);
        this.c.g.c(this.c.b, ebrj.n, 23);
    }

    @Override  // dpug
    public final void b(Object object0) {
        gurk gurk0 = (gurk)object0;
        ebrj ebrj0 = this.c;
        dyna dyna0 = this.a;
        ebrj0.d.c(dyna0, this.b);
        if(ebrj0.f.d(dyna0, this.b)) {
            ebrj0.c(Status.b);
            ebrj0.g.g(ebrj0.b, ebrj.n);
            return;
        }
        a.ag(ebrj.a.i(), "Unable to upload tos revoke status. Service provider: %s", dyna0.name(), '\u2FEC');
        ebrj0.c(Status.d);
        ebrj0.g.c(ebrj0.b, ebrj.n, 27);
    }
}

