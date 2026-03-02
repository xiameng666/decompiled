import android.os.Handler;
import android.os.Looper;

final class ile extends ibur implements ibts {
    final ili a;

    public ile(ili ili0) {
        this.a = ili0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ili ili0 = this.a;
        Handler handler0 = ili0.getHandler();
        if((handler0 == null ? null : handler0.getLooper()) == Looper.myLooper()) {
            ((ibth)object0).a();
            return ibom.a;
        }
        Handler handler1 = ili0.getHandler();
        if(handler1 != null) {
            handler1.post(new ild(((ibth)object0)));
        }
        return ibom.a;
    }
}

