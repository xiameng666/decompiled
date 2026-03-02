import j..util.Objects;
import java.util.concurrent.TimeoutException;

final class gyji extends gxum {
    final gyjj a;
    private int b;

    public gyji(gyjj gyjj0) {
        Objects.requireNonNull(gyjj0);
        this.a = gyjj0;
        super("AsynchronousOperation_checkStatusAndStop");
        this.b = 0;
    }

    @Override
    public final void run() {
        gyjj gyjj0 = this.a;
        gxuf gxuf0 = gyjj0.e;
        batl.s(gxuf0);
        gxuf0.b();
        if(gyjj0.d.get() == 2) {
            gyjj0.d();
            return;
        }
        int v = this.b;
        if(v > 30) {
            ((ggtj)((ggtj)((ggtj)gyke.a.i()).s(new TimeoutException())).ar(0x4F44)).B("%s timeout when starting", this.m);
            gyjj0.d();
            return;
        }
        this.b = v + 1;
        gxum gxum0 = gyjj0.h;
        if(gxum0 != null) {
            gxuf0.g(gxum0, 200L);
        }
    }
}

