import android.net.nsd.NsdServiceInfo;

public final class czkt implements Runnable {
    public final String a;
    public final NsdServiceInfo b;
    public final czkv c;
    public final czkz d;

    public czkt(String s, NsdServiceInfo nsdServiceInfo0, czkv czkv0, czkz czkz0) {
        this.a = s;
        this.b = nsdServiceInfo0;
        this.c = czkv0;
        this.d = czkz0;
    }

    @Override
    public final void run() {
        czlc.f(this.a, this.b, this.c, this.d);
    }
}

