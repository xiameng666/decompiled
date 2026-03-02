import com.google.android.gms.common.api.Status;

public final class ebvg implements evqc {
    public final ebvh a;

    public ebvg(ebvh ebvh0) {
        this.a = ebvh0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebvh.a.j(), "Failed to list octopus cards", exception0);
        this.a.c.x(Status.d);
    }
}

