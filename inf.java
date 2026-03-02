import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

public final class inf extends ThreadLocal {
    @Override
    public final Object initialValue() {
        Choreographer choreographer0 = Choreographer.getInstance();
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            throw new IllegalStateException("no Looper on this thread");
        }
        ini ini0 = new ini(choreographer0, Handler.createAsync(looper0));
        return ini0.plus(ini0.j);
    }
}

