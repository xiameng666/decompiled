import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;

public abstract class fnxp {
    protected abstract int a();

    protected abstract int b();

    protected abstract int c();

    public abstract boolean d();

    public final Context f(Context context0) {
        Context context1;
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(new int[]{this.a()});
        try {
            context1 = new ContextThemeWrapper(new ContextThemeWrapper(context0, typedArray0.getResourceId(0, this.b())), this.c());
            if(this.d()) {
                context1 = fyhn.a(context1);
            }
        }
        finally {
            typedArray0.recycle();
        }
        return context1;
    }
}

