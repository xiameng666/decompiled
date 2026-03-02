import android.os.Looper;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

public final class armp extends arlg implements armi {
    public static final aqql d;
    private final armj e;
    private final armf f;
    private final arlx g;
    private final arls h;
    private final int i;
    private bbln j;
    private bbln k;

    static {
        armp.d = new aqql(new String[]{"UsbTransport"});
    }

    public armp(arlj arlj0, armj armj0, gmcg gmcg0, arls arls0, arem arem0) {
        super(arlj0, gmcg0, arem0);
        this.e = armj0;
        gftb.check(arls0);
        this.h = arls0;
        armj0.f(this);
        armf armf0 = new armf(armj0, gmcg0);
        this.f = armf0;
        arlx arlx0 = new arlx(this, armj0, gmcg0, arem0);
        this.g = arlx0;
        this.i = 500;
        armg armg0 = new armg(this, armf0);
        this.j = armg0;
        armg0.start();
        arly arly0 = new arly(this, arlx0);
        this.k = arly0;
        arly0.start();
    }

    @Override  // arlg
    protected final hkyj a() {
        return hkyj.b;
    }

    @Override  // arlg
    protected final void b() {
        armp.d.h("doShutdown", new Object[0]);
        bbln bbln0 = this.j;
        if(bbln0 != null) {
            bbln0.interrupt();
            try {
                this.j.join();
                this.j = null;
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Interrupted while waiting for UsbSenderThread to complete", interruptedException0);
            }
        }
        bbln bbln1 = this.k;
        if(bbln1 != null) {
            try {
                bbln1.join();
                this.k = null;
            }
            catch(InterruptedException interruptedException1) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Interrupted while waiting for UsbReceiverThread to complete", interruptedException1);
            }
        }
        this.f.f();
        this.g.a();
        this.e.g();
        this.h.b();
        this.e();
    }

    @Override  // arlg
    protected final void c(byte[] arr_b) {
        armp.d.h("doShutdownWithLastPacket", new Object[0]);
        armo armo0 = new armo(this);
        armk armk0 = new armk(this, armo0);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        this.g.a();
        armf.a.d("The send thread run loop will terminate after sending last packet.", new Object[0]);
        armd armd0 = new armd(1, byteArrayInputStream0, armk0);
        this.f.d.set(armd0);
        this.f.f();
        new clht(Looper.getMainLooper()).postDelayed(new arml(this, armo0), ((long)this.i));
    }

    @Override  // arlk
    public final void j() {
        this.h.a();
        this.d(0);
    }

    @Override  // arlk
    public final void k(InputStream inputStream0, long v, arli arli0, hkyj hkyj0) {
        throw new IllegalStateException("sendBatchPayloadStream must not be called for usb transport!");
    }

    @Override  // arlk
    public final void l(File file0, arli arli0) {
        throw new IllegalStateException("sendFile must not be called for usb transport!");
    }

    @Override  // arlk
    public final void m(File file0, long v, arli arli0) {
        throw new IllegalStateException("sendFileWithPayloadId must not be called for usb transport!");
    }

    @Override  // arlk
    public final void n(byte[] arr_b) {
        this.o(arr_b, 0L);
    }

    @Override  // arlk
    public final void o(byte[] arr_b, long v) {
        armm armm0 = new armm(this);
        armd armd0 = new armd(1, new ByteArrayInputStream(arr_b), armm0);
        this.f.b(armd0, v);
    }

    @Override  // arlk
    public final void p(InputStream inputStream0, arli arli0) {
        armd armd0 = new armd(2, inputStream0, arli0);
        this.f.b(armd0, 0L);
    }

    @Override  // arlk
    public final void q(InputStream inputStream0, arli arli0, hkyj hkyj0) {
        gftb.checkTrue(hkyj0.equals(hkyj.b));
        this.p(inputStream0, arli0);
    }

    @Override  // arlk
    public final void r(long v, arli arli0, hkyj hkyj0) {
        throw new IllegalStateException("sendStreamErrorPacket must not be called for usb transport!");
    }

    @Override  // arlk
    public final void s(InputStream inputStream0, long v, arli arli0, hkyj hkyj0) {
        gftb.b(hkyj0.equals(hkyj.b), "Connection type must be USB.");
        armp.d.h("sendStreamWithPayloadId, payloadId=%d", new Object[]{v});
        armd armd0 = new armd(v, inputStream0, arli0);
        this.f.b(armd0, 0L);
    }

    @Override  // arlk
    public final boolean t(hkyj hkyj0) {
        return hkyj0.equals(hkyj.b) && this.i();
    }

    final void u() {
        armn armn0 = new armn(this);
        this.b.execute(armn0);
    }
}

