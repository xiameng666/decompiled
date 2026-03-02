import android.os.Trace;

final class ivu extends ibur implements ibth {
    final ivv a;

    public ivu(ivv ivv0) {
        this.a = ivv0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        this.a.d = null;
        Trace.beginSection("OnPositionedDispatch");
        try {
            this.a.a();
        }
        finally {
            Trace.endSection();
        }
        return ibom.a;
    }
}

