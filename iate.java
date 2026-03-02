import android.net.Network;
import java.net.InetSocketAddress;
import org.chromium.net.CronetEngine;

public final class iate extends ialx {
    public final CronetEngine a;
    public final ibft b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public Network g;
    private final ibbl h;

    private iate(String s, int v, CronetEngine cronetEngine0) {
        this.b = ibfu.a;
        this.h = new ibbl(InetSocketAddress.createUnresolved(s, v), iayh.d(s, v), new iatb(this));
        gftb.z(cronetEngine0, "cronetEngine");
        this.a = cronetEngine0;
    }

    @Override  // ialx
    protected final ianl b() {
        return this.h;
    }

    public static iate j(String s, int v, CronetEngine cronetEngine0) {
        gftb.z(cronetEngine0, "cronetEngine");
        return new iate(s, v, cronetEngine0);
    }

    public final void k(int v) {
        this.c = true;
        this.d = v;
    }

    public final void m(int v) {
        this.e = true;
        this.f = v;
    }
}

