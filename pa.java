import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

public final class pa {
    public PorterDuff.Mode a;
    public boolean b;
    public boolean c;
    private final CompoundButton d;
    private boolean e;

    public pa(CompoundButton compoundButton0) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.d = compoundButton0;
    }

    public final void a() {
        CompoundButton compoundButton0 = this.d;
        Drawable drawable0 = compoundButton0.getButtonDrawable();
        if(drawable0 != null && (this.b || this.c)) {
            Drawable drawable1 = drawable0.mutate();
            if(this.b) {
                drawable1.setTintList(null);
            }
            if(this.c) {
                drawable1.setTintMode(this.a);
            }
            if(drawable1.isStateful()) {
                drawable1.setState(compoundButton0.getDrawableState());
            }
            compoundButton0.setButtonDrawable(drawable1);
        }
    }

    public final void b(AttributeSet attributeSet0, int v) {
        CompoundButton compoundButton0 = this.d;
        wi wi0 = wi.l(compoundButton0.getContext(), attributeSet0, ku.m, v, 0);
        kfc.b(compoundButton0, compoundButton0.getContext(), ku.m, attributeSet0, wi0.b, v, 0);
        try {
            if(wi0.q(1)) {
                int v2 = wi0.f(1, 0);
                if(v2 != 0) {
                    try {
                        compoundButton0.setButtonDrawable(kv.a(compoundButton0.getContext(), v2));
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
                        Drawable drawable0 = kv.a(this.d.getContext(), v3);
                        this.d.setButtonDrawable(drawable0);
                    }
                }
            }
        label_14:
            if(wi0.q(2)) {
                ColorStateList colorStateList0 = wi0.g(2);
                this.d.setButtonTintList(colorStateList0);
            }
            if(wi0.q(3)) {
                PorterDuff.Mode porterDuff$Mode0 = rg.a(wi0.c(3, -1), null);
                this.d.setButtonTintMode(porterDuff$Mode0);
            }
        }
        finally {
            wi0.o();
        }
    }

    public final void c() {
        if(this.e) {
            this.e = false;
            return;
        }
        this.e = true;
        this.a();
    }
}

