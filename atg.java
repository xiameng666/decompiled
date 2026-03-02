import java.util.concurrent.CancellationException;
import jeb.synthetic.FIN;

final class atg implements bpd {
    final atk a;

    public atg(atk atk0) {
        this.a = atk0;
        super();
    }

    @Override  // bpd
    public final void a(Throwable throwable0) {
        atk atk0 = this.a;
        Object object0 = atk0.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        atk0.i.t();
        int v1 = atk0.h - 1;
        if(atk0.h != 0) {
            if((v1 == 4 || v1 == 5 || v1 == 6) && !(throwable0 instanceof CancellationException)) {
                bcs.e("CaptureSession", "Opening session with fail " + ati.a(atk0.h), throwable0);
                atk0.f();
            }
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw null;
    }

    @Override  // bpd
    public final void b(Object object0) {
        Void void0 = (Void)object0;
    }
}

