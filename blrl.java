import android.util.Pair;
import java.util.concurrent.ExecutionException;

public final class blrl implements Runnable {
    public final blrm a;
    public final blpi b;
    public final boolean c;
    public final byte[] d;
    public final jqt e;
    public final bmhg f;

    public blrl(blrm blrm0, blpi blpi0, boolean z, byte[] arr_b, jqt jqt0, bmhg bmhg0) {
        this.a = blrm0;
        this.b = blpi0;
        this.c = z;
        this.d = arr_b;
        this.e = jqt0;
        this.f = bmhg0;
    }

    @Override
    public final void run() {
        jqt jqt0;
        try {
            jqt0 = this.e;
            this.a.g.d(this.b);
            this.b.j();
            gmcd gmcd0 = !hsvd.g() || !(this.b instanceof blpq) || this.c ? this.b.g(this.d) : ((blpq)this.b).s(this.d, false);
            jqt0.b(new Pair(this.f, ((byte[])gmcd0.get())));
        }
        catch(bxma | ExecutionException | InterruptedException exception0) {
            jqt0.c(exception0);
        }
    }
}

