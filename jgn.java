import android.view.inputmethod.InputMethodManager;

final class jgn extends ibur implements ibth {
    final jgo a;

    public jgn(jgo jgo0) {
        this.a = jgo0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        Object object0 = this.a.a.getContext().getSystemService("input_method");
        ibuq.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager)object0;
    }
}

