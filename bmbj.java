import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class bmbj implements blzd {
    public static final bboh a;
    public final bmch b;
    public final AtomicInteger c;
    public final AtomicBoolean d;
    private final gmcg e;

    static {
        bmbj.a = bnaa.e("UsbChannel");
    }

    public bmbj(gmcg gmcg0, bmch bmch0) {
        this.c = new AtomicInteger(-1);
        this.d = new AtomicBoolean(false);
        batl.s(gmcg0);
        this.e = gmcg0;
        this.b = bmch0;
    }

    @Override  // blzd
    public final gmcd a() {
        bmbh bmbh0 = new bmbh(this);
        return this.e.f(bmbh0, null);
    }

    @Override  // blzd
    public final gmcd b() {
        if(this.e()) {
            return gmbx.a;
        }
        bmbi bmbi0 = new bmbi(this);
        return this.e.f(bmbi0, null);
    }

    @Override  // blzd
    public final gmcd c(blzt blzt0) {
        try {
            ((ggtj)((ggtj)bmbj.a.h()).ar(0xE73)).B("Sending CTAP2 command over USB channel: %s", blzt0);
            byte[] arr_b = blzt0.e();
            return glzd.f(this.f(bmcf.e, arr_b, false), new bmaq(blzt0), this.e);
        }
        catch(hhrm hhrm0) {
            bxly bxly0 = new bxly();
            bxly0.c = hhrm0;
            bxly0.a = 8;
            return gmbu.h(bxly0.a());
        }
    }

    @Override  // blzd
    public final gmcd d(bmbb bmbb0) {
        byte[] arr_b = bmbb0.a();
        return glzd.f(this.f(bmcf.b, arr_b, true), new bmbe(), this.e);
    }

    @Override  // blzd
    public final boolean e() {
        return this.d.get();
    }

    private final gmcd f(bmcf bmcf0, byte[] arr_b, boolean z) {
        bmbg bmbg0 = new bmbg(this, z, bmcf0, arr_b);
        return this.e.e(bmbg0);
    }
}

