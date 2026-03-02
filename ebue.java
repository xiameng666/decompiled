import com.google.android.gms.common.api.Status;

public final class ebue implements evqc {
    public final ebuf a;
    public final ficj b;

    public ebue(ebuf ebuf0, ficj ficj0) {
        this.a = ebuf0;
        this.b = ficj0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebuf.a.i(), "Failed to get SE chip issuer.", exception0);
        this.a.c.x(Status.d);
        this.b.c(2);
        this.b.close();
    }
}

