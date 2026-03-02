import android.util.Log;
import java.lang.ref.WeakReference;

final class fnzt implements gmbg {
    final WeakReference a;

    public fnzt(fnzu fnzu0) {
        this.a = new WeakReference(fnzu0);
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        Log.e(fnzu.a, "ContinueWithAccountListener execution threw an exception", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        fnzu fnzu0 = (fnzu)this.a.get();
        if(fnzu0 != null) {
            if(((Boolean)object0).booleanValue()) {
                fnzu0.c();
                return;
            }
            fnxn.a(new fnyy(fnzu0));
        }
    }
}

