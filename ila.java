import android.os.SystemClock;
import android.view.MotionEvent;

final class ila extends ibur implements ibth {
    final ili a;

    public ila(ili ili0) {
        this.a = ili0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        ili ili0 = this.a;
        MotionEvent motionEvent0 = ili0.K;
        if(motionEvent0 != null) {
            switch(motionEvent0.getActionMasked()) {
                case 7: 
                case 9: {
                    ili0.L = SystemClock.uptimeMillis();
                    ili0.post(ili0.N);
                    break;
                }
                default: {
                    return ibom.a;
                }
            }
        }
        return ibom.a;
    }
}

