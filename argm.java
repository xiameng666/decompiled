import android.os.Handler;
import android.os.Looper;
import com.google.android.chimera.Service;

public final class argm {
    public final Handler a;
    public final argl b;
    public final argk c;
    public int d;

    public argm(Service service0) {
        argk argk0 = new argk(service0);
        argl argl0 = new argl(service0);
        super();
        this.a = new clht(Looper.getMainLooper());
        this.c = argk0;
        this.b = argl0;
        this.d = 1;
    }

    public final void a() {
        argi argi0 = new argi(this);
        this.a.post(argi0);
    }
}

