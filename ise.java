import android.os.Bundle;
import android.view.ViewStructure;

public final class ise {
    public final Object a;

    public ise(ViewStructure viewStructure0) {
        this.a = viewStructure0;
    }

    public final Bundle a() {
        return ((ViewStructure)this.a).getExtras();
    }

    public final void b(String s) {
        ((ViewStructure)this.a).setClassName(s);
    }

    public final void c(CharSequence charSequence0) {
        ((ViewStructure)this.a).setContentDescription(charSequence0);
    }

    public final void d(CharSequence charSequence0) {
        ((ViewStructure)this.a).setText(charSequence0);
    }

    public final void e(int v, int v1, int v2, int v3) {
        ((ViewStructure)this.a).setDimens(v, v1, 0, 0, v2, v3);
    }

    public final void f(int v, String s) {
        ((ViewStructure)this.a).setId(v, null, null, s);
    }

    public final void g(float f) {
        ((ViewStructure)this.a).setTextStyle(f, 0, 0, 0);
    }
}

