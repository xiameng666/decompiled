import com.google.android.gms.common.api.Status;

public final class ebxt implements evqc {
    public final ebxx a;
    public final String b;

    public ebxt(ebxx ebxx0, String s) {
        this.a = ebxx0;
        this.b = s;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebxx.a.i(), "Failed to notify Octopus for card association", exception0);
        this.a.a().l(this.b);
        Status status0 = new Status(8, "OCTOPUS_ACCOUNT_LINKAGE_ERROR");
        this.a.c.x(status0);
    }
}

