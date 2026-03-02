import com.google.android.gms.common.api.Status;

public final class ebuv implements evqc {
    public final ebuw a;

    public ebuv(ebuw ebuw0) {
        this.a = ebuw0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebuw.a.j(), "Failed to check if user is logged in MFI account.", exception0);
        this.a.c.x(Status.d);
    }
}

