import com.google.android.gms.common.api.Status;

public final class ebtw implements evqc {
    public final ebtx a;
    public final ficj b;

    public ebtw(ebtx ebtx0, ficj ficj0) {
        this.a = ebtx0;
        this.b = ficj0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebtx.a.i(), "Failed to get MFI card list.", exception0);
        this.a.c.x(Status.d);
        this.b.c(2);
        this.b.close();
    }
}

