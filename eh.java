import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

public abstract class eh extends ee {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final fm e;

    public eh(Activity activity0, Context context0, Handler handler0) {
        this.b = activity0;
        this.c = context0;
        this.d = handler0;
        this.e = new fm();
    }

    public eh(Context context0, Handler handler0) {
        this(null, context0, handler0);
    }

    @Override  // ee
    public View a(int v) {
        throw null;
    }

    @Override  // ee
    public boolean b() {
        throw null;
    }

    public LayoutInflater c() {
        throw null;
    }

    public abstract Object d();

    public void e() {
    }

    public boolean f(String s) {
        throw null;
    }

    public void h(PrintWriter printWriter0, String[] arr_s) {
        throw null;
    }

    public final void i(Intent intent0, int v, Bundle bundle0) {
        ibuq.f(intent0, "intent");
        if(v != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.c.startActivity(intent0, bundle0);
    }
}

