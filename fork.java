import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.Set;

@ibnh
public final class fork {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public Handler e;
    public final Runnable f;
    public final Set g;
    public fokg h;

    public fork(Context context0) {
        this.a = 0;
        this.b = 0;
        this.c = true;
        this.d = true;
        this.e = null;
        this.g = new HashSet();
        this.e = new Handler(context0.getMainLooper());
        this.f = new forh(this);
        ((Application)context0.getApplicationContext()).registerActivityLifecycleCallbacks(new fori(this));
    }

    public final void a() {
        if(this.a == 0 && this.c) {
            for(Object object0: this.g) {
                foql foql0 = (foql)object0;
            }
            this.d = true;
        }
    }
}

