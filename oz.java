import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

final class oz {
    public boolean a;
    private final CheckedTextView b;

    public oz(CheckedTextView checkedTextView0) {
        this.b = checkedTextView0;
    }

    final void a() {
        this.b.getCheckMarkDrawable();
    }

    final void b(AttributeSet attributeSet0, int v) {
        CheckedTextView checkedTextView0 = this.b;
        wi wi0 = wi.l(checkedTextView0.getContext(), attributeSet0, ku.l, v, 0);
        kfc.b(checkedTextView0, checkedTextView0.getContext(), ku.l, attributeSet0, wi0.b, v, 0);
        try {
            if(wi0.q(1)) {
                int v2 = wi0.f(1, 0);
                if(v2 != 0) {
                    try {
                        checkedTextView0.setCheckMarkDrawable(kv.a(checkedTextView0.getContext(), v2));
                        goto label_14;
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                }
                goto label_9;
            }
            else {
            label_9:
                if(wi0.q(0)) {
                    int v3 = wi0.f(0, 0);
                    if(v3 != 0) {
                        Drawable drawable0 = kv.a(this.b.getContext(), v3);
                        this.b.setCheckMarkDrawable(drawable0);
                    }
                }
            }
        label_14:
            if(wi0.q(2)) {
                ColorStateList colorStateList0 = wi0.g(2);
                this.b.setCheckMarkTintList(colorStateList0);
            }
            if(wi0.q(3)) {
                PorterDuff.Mode porterDuff$Mode0 = rg.a(wi0.c(3, -1), null);
                this.b.setCheckMarkTintMode(porterDuff$Mode0);
            }
        }
        finally {
            wi0.o();
        }
    }
}

