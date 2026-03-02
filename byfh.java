import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;

public final class byfh implements gmbg {
    final byfi a;

    public byfh(byfi byfi0) {
        this.a = byfi0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        a.ae(this.a.c.j(), "Failed to propagate request to provider", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ibuq.f(((SignalCredentialStateResponse)object0), "result");
        ((ggtj)this.a.c.h()).x("Request successfully propagated to provider");
    }
}

