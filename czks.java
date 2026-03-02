import android.net.nsd.NsdServiceInfo;

public final class czks implements Runnable {
    public final cuqs a;
    public final String b;
    public final NsdServiceInfo c;
    public final czkv d;
    public final czkz e;

    public czks(cuqs cuqs0, String s, NsdServiceInfo nsdServiceInfo0, czkv czkv0, czkz czkz0) {
        this.a = cuqs0;
        this.b = s;
        this.c = nsdServiceInfo0;
        this.d = czkv0;
        this.e = czkz0;
    }

    @Override
    public final void run() {
        czlc.e(this.a, this.b, this.c, this.d, this.e);
    }
}

