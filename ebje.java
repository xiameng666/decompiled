import com.google.android.gms.common.api.Status;

public final class ebje implements evqc {
    public final ebjf a;

    public ebje(ebjf ebjf0) {
        this.a = ebjf0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebjf.a.j(), "Failed to check octopus app readiness status", exception0);
        this.a.b.x(Status.d);
    }
}

