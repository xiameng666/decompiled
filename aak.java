import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver.OnDrawListener;
import java.util.concurrent.Executor;

final class aak implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable a;
    final aao b;
    private final long c;
    private boolean d;

    public aak(aao aao0) {
        this.b = aao0;
        super();
        this.c = SystemClock.uptimeMillis() + 10000L;
    }

    public final void a(View view0) {
        ibuq.f(view0, "view");
        if(!this.d) {
            this.d = true;
            view0.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override
    public final void execute(Runnable runnable0) {
        ibuq.f(runnable0, "runnable");
        this.a = runnable0;
        View view0 = this.b.getWindow().getDecorView();
        ibuq.e(view0, "getDecorView(...)");
        if(this.d) {
            if(ibuq.m(Looper.myLooper(), Looper.getMainLooper())) {
                view0.invalidate();
                return;
            }
            view0.postInvalidate();
            return;
        }
        view0.postOnAnimation(new aaj(this));
    }

    @Override  // android.view.ViewTreeObserver$OnDrawListener
    public final void onDraw() {
        Runnable runnable0 = this.a;
        if(runnable0 != null) {
            runnable0.run();
            this.a = null;
            aao aao0 = this.b;
            if(aao0.g().b()) {
                this.d = false;
                aao0.getWindow().getDecorView().post(this);
            }
        }
        else if(SystemClock.uptimeMillis() > this.c) {
            this.d = false;
            this.b.getWindow().getDecorView().post(this);
        }
    }

    @Override
    public final void run() {
        this.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

