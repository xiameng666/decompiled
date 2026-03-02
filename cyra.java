import j..util.Objects;
import java.util.concurrent.CountDownLatch;

final class cyra implements gmbg {
    final boolean a;
    final cyrc b;

    public cyra(cyrc cyrc0, boolean z) {
        this.a = z;
        Objects.requireNonNull(cyrc0);
        this.b = cyrc0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        cyrc cyrc0 = this.b;
        CountDownLatch countDownLatch0 = cyrc0.f;
        if(countDownLatch0 != null) {
            countDownLatch0.countDown();
            cyrc.e(cyrc0);
        }
        ((ggtj)cyjh.a.g().s(throwable0)).B("LiveSassDeviceSetting:updateSassDeviceSetting failed for %s", fgjo.c(cyrc0.c));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        cyrc cyrc0 = this.b;
        synchronized(cyrc0) {
            boolean z = cyrc0.g;
            if(!z) {
                cyrc0.e = (cyjq)((gfsx)object0).g();
            }
        }
        cyrc cyrc1 = this.b;
        CountDownLatch countDownLatch0 = cyrc1.f;
        if(countDownLatch0 != null) {
            countDownLatch0.countDown();
            cyrc.e(cyrc1);
        }
        cyjh.a.d().B("LiveSassDeviceSetting: finish updateSassDeviceSetting called for %s", fgjo.c(cyrc1.c));
        if(this.a && !z) {
            cyrc1.d.run();
        }
    }
}

