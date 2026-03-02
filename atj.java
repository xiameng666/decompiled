import java.util.Objects;
import jeb.synthetic.FIN;

final class atj extends avh {
    final atk a;

    public atj(atk atk0) {
        this.a = atk0;
        super();
    }

    @Override  // avh
    public final void a(avp avp0) {
        atk atk0 = this.a;
        Object object0 = atk0.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = atk0.h - 1;
        if(atk0.h != 0) {
            switch(v1) {
                case 1: {
                    bcs.h("CaptureSession");
                    break;
                }
                case 4: 
                case 5: 
                case 6: {
                    atk0.f();
                    break;
                }
                case 0: 
                case 2: 
                case 3: 
                case 7: {
                    throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + ati.a(atk0.h));
                }
            }
            bcs.a("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + ati.a(atk0.h));
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw null;
    }

    @Override  // avh
    public final void b(avp avp0) {
        atk atk0 = this.a;
        Object object0 = atk0.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = atk0.h - 1;
        if(atk0.h != 0) {
            switch(v1) {
                case 4: {
                    avp0.m();
                    break;
                }
                case 5: {
                    atk0.j = avp0;
                    break;
                }
                case 6: {
                    atk0.l(8);
                    atk0.j = avp0;
                    bcs.h("CaptureSession");
                    atk0.o(atk0.c);
                    atk0.h();
                    break;
                }
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 7: {
                    throw new IllegalStateException("onConfigured() should not be possible in state: " + ati.a(atk0.h));
                }
            }
            Objects.toString(ati.a(atk0.h));
            bcs.h("CaptureSession");
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw null;
    }

    @Override  // avh
    public final void c(avp avp0) {
        atk atk0 = this.a;
        Object object0 = atk0.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        int v1 = atk0.h - 1;
        if(atk0.h != 0) {
            if(v1 != 0) {
                Objects.toString(ati.a(atk0.h));
                bcs.h("CaptureSession");
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            throw new IllegalStateException("onReady() should not be possible in state: " + ati.a(atk0.h));
        }
        throw null;
    }

    @Override  // avh
    public final void d(avp avp0) {
        atk atk0 = this.a;
        Object object0 = atk0.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(atk0.h != 1) {
            bcs.h("CaptureSession");
            atk0.f();
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + ati.a(atk0.h));
    }
}

