import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class gasj extends ibuo implements ibts {
    public static final gasj a;

    static {
        gasj.a = new gasj();
    }

    public gasj() {
        super(1, gask.class, "closeKeyboardImpl", "closeKeyboardImpl()V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gask)object0), "p0");
        View view0 = ((gask)object0).b.a();
        InputMethodManager inputMethodManager0 = null;
        IBinder iBinder0 = view0 == null ? null : view0.getWindowToken();
        if(iBinder0 != null) {
            Object object1 = ((gask)object0).a.getSystemService("input_method");
            if((object1 instanceof InputMethodManager)) {
                inputMethodManager0 = (InputMethodManager)object1;
            }
            if(inputMethodManager0 != null) {
                inputMethodManager0.hideSoftInputFromWindow(iBinder0, 0);
            }
        }
        return ibom.a;
    }
}

