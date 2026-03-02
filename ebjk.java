import com.google.android.gms.common.api.Status;

public final class ebjk implements evqc {
    public final ebjl a;
    public final gtni b;

    public ebjk(ebjl ebjl0, gtni gtni0) {
        this.a = ebjl0;
        this.b = gtni0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebjl.a.i(), "Failed to confirm online balance.", exception0);
        this.a.b.x(Status.d);
        ebwl ebwl0 = this.a.a();
        gged_interceptors gged0 = gged_interceptors.l(hale.c);
        ebwl0.d(this.b, ebjl.f, gged0, Status.d);
    }
}

