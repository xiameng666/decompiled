import android.view.View;
import android.view.inputmethod.InputMethodManager;

@ibni
public final class jgo {
    public final View a;
    public final ker b;
    private final ibnn c;

    public jgo(View view0) {
        this.a = view0;
        jgn jgn0 = new jgn(this);
        this.c = ibno.a(ibnp.c, jgn0);
        this.b = new ker(view0);
    }

    public final InputMethodManager a() {
        return (InputMethodManager)this.c.a();
    }

    public final void b(int v, int v1, int v2, int v3) {
        this.a().updateSelection(this.a, v, v1, v2, v3);
    }
}

