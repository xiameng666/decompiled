import android.view.Choreographer.FrameCallback;

final class inl extends ibur implements ibts {
    final inn a;
    final Choreographer.FrameCallback b;

    public inl(inn inn0, Choreographer.FrameCallback choreographer$FrameCallback0) {
        this.a = inn0;
        this.b = choreographer$FrameCallback0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        this.a.a.removeFrameCallback(this.b);
        return ibom.a;
    }
}

