import android.view.MotionEvent;

final class hwp extends ibur implements ibts {
    final hws a;
    final hwm b;

    public hwp(hwm hwm0, hws hws0) {
        this.b = hwm0;
        this.a = hws0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((MotionEvent)object0).getActionMasked() == 0) {
            this.b.d = ((Boolean)this.a.d().a(((MotionEvent)object0))).booleanValue() ? 2 : 3;
            return ibom.a;
        }
        this.a.d().a(((MotionEvent)object0));
        return ibom.a;
    }
}

