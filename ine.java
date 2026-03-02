import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

final class ine extends ibur implements ibth {
    public static final ine a;

    static {
        ine.a = new ine();
    }

    public ine() {
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        Choreographer choreographer0;
        if(inj.a()) {
            choreographer0 = Choreographer.getInstance();
        }
        else {
            ind ind0 = new ind(null);
            choreographer0 = (Choreographer)icbc.a(icrd.a, ind0);
        }
        ini ini0 = new ini(choreographer0, Handler.createAsync(Looper.getMainLooper()));
        return ini0.plus(ini0.j);
    }
}

