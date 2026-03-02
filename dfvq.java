import java.util.concurrent.CountDownLatch;

public final class dfvq implements Runnable {
    public final dfzz a;
    public final CountDownLatch b;

    public dfvq(dfzz dfzz0, CountDownLatch countDownLatch0) {
        this.a = dfzz0;
        this.b = countDownLatch0;
    }

    @Override
    public final void run() {
        this.a.v.N(this.a.l);
        this.a.bl();
        cutr.f(this.a.i, this.a.H);
        this.a.H = null;
        cutr.f(this.a.i, this.a.I);
        this.a.I = null;
        this.a.l.B();
        this.a.ae.e();
        this.a.t.i();
        cuui.h(this.a.u.c, "SenderCertificateManagerExecutor");
        this.a.y.i();
        cuui.h(this.a.y.a, "alarmExecutor");
        this.a.T.clear();
        this.a.U.g();
        this.a.V.clear();
        this.a.k.c();
        cuui.h(this.a.g, "alarmExecutor");
        cuui.h(this.a.m, "connectionExecutor");
        this.b.countDown();
    }
}

