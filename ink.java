import android.view.Choreographer.FrameCallback;

final class ink extends ibur implements ibts {
    final ini a;
    final Choreographer.FrameCallback b;

    public ink(ini ini0, Choreographer.FrameCallback choreographer$FrameCallback0) {
        this.a = ini0;
        this.b = choreographer$FrameCallback0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        synchronized(this.a.e) {
            this.a.f.remove(this.b);
        }
        return ibom.a;
    }
}

