import android.os.Handler;
import android.os.Looper;

final class jqa extends ibur implements ibts {
    final jqc a;

    public jqa(jqc jqc0) {
        this.a = jqc0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        jqc jqc0 = this.a;
        Handler handler0 = jqc0.getHandler();
        if((handler0 == null ? null : handler0.getLooper()) == Looper.myLooper()) {
            ((ibth)object0).a();
            return ibom.a;
        }
        Handler handler1 = jqc0.getHandler();
        if(handler1 != null) {
            handler1.post(new jpz(((ibth)object0)));
        }
        return ibom.a;
    }
}

