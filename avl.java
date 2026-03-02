import java.util.List;

public final class avl implements jqv {
    public final avp a;
    public final List b;
    public final awq c;
    public final axr d;

    public avl(avp avp0, List list0, awq awq0, axr axr0) {
        this.a = avp0;
        this.b = list0;
        this.c = awq0;
        this.d = axr0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        avp avp0 = this.a;
        Object object0 = avp0.a;
        List list0 = this.b;
        awq awq0 = this.c;
        axr axr0 = this.d;
        synchronized(object0) {
            __monitor_enter(object0);
        }
        try {
            avp0.q();
            bke.b(list0);
            avp0.j = list0;
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
        try {
            kay.d(avp0.h == null, "The openCaptureSessionCompleter can only set once!");
            avp0.h = jqt0;
            awq0.a.a(axr0);
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
        return a.i(avp0, "openCaptureSession[session=", "]");
    }
}

