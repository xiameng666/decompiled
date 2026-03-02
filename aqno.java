import j..util.Objects;
import java.io.File;

final class aqno extends clbm {
    public aqno(aqnp aqnp0, File file0) {
        Objects.requireNonNull(aqnp0);
        super(file0);
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        aqnp.a.j("GMS request redirected to: %s", new Object[]{s});
        clcn0.c();
    }
}

