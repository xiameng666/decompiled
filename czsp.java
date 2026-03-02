import android.net.Network;
import java.io.InputStream;
import java.io.OutputStream;

public final class czsp extends czth {
    public final Network h;
    private String i;
    private byte[] j;
    private final czuo k;

    public czsp(String s, byte[] arr_b, czuo czuo0, Network network0) {
        super(s, true);
        this.i = s;
        this.j = arr_b;
        this.k = czuo0;
        this.h = network0;
    }

    @Override  // czlg
    public final InputStream e() {
        throw new UnsupportedOperationException();
    }

    @Override  // czlg
    public final OutputStream f() {
        throw new UnsupportedOperationException();
    }

    @Override  // czlg
    public final void h() {
        this.k.a();
    }

    @Override  // czth
    public final String k() {
        return this.i;
    }

    @Override  // czth
    public final String l() {
        return "";
    }

    @Override  // czth
    public final void m(String s) {
        this.i = s;
    }

    @Override  // czth
    public final void n(byte[] arr_b) {
        this.j = arr_b;
    }

    @Override  // czth
    public final byte[] o() {
        return this.j;
    }
}

