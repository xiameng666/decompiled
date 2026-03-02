import android.app.Application;
import com.google.android.chimera.android.Activity;

public final class eizj implements eiyw, ejbo {
    protected final Activity a;
    private volatile Object b;
    private final Object c;
    private final ejbo d;

    public eizj(Activity activity0) {
        this.c = new Object();
        this.a = activity0;
        this.d = new eizd(activity0);
    }

    @Override  // eiyw
    public final eixn a() {
        return ((eizd)this.d).a();
    }

    public final ejaj b() {
        return ((eizd)this.d).b();
    }

    @Override  // ejbo
    public final Object h() {
        if(this.b == null) {
            Object object0 = this.c;
            synchronized(object0) {
                if(this.b == null) {
                    Activity activity0 = this.a;
                    if(!(eixx.a(activity0) instanceof ejbo)) {
                        Class class0 = eixx.a(activity0).getClass();
                        throw new IllegalStateException("Chimera ComponentActivity must be attached to a ModuleApplication. " + (Application.class.equals(class0) ? "Did you forget to specify your Application\'s class name in your manifest\'s <application />\'s android:name attribute?" : "Found: " + eixx.a(activity0).getClass()));
                    }
                    eixz eixz0 = (eixz)((eiyu)eixh.a(this.d, eiyu.class)).a().d();
                    eixz0.b(activity0);
                    this.b = eixz0.a();
                }
            }
            return this.b;
        }
        return this.b;
    }
}

