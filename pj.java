import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class pj {
    private final ImageView a;
    private int b;

    public pj(ImageView imageView0) {
        this.b = 0;
        this.a = imageView0;
    }

    public final void a() {
        ImageView imageView0 = this.a;
        if(imageView0.getDrawable() != null) {
            imageView0.getDrawable().setLevel(this.b);
        }
    }

    public final void b() {
        Drawable drawable0 = this.a.getDrawable();
        if(drawable0 != null) {
            rg.c(drawable0);
        }
    }

    public final void c(AttributeSet attributeSet0, int v) {
        ImageView imageView0 = this.a;
        wi wi0 = wi.l(imageView0.getContext(), attributeSet0, ku.f, v, 0);
        kfc.b(imageView0, imageView0.getContext(), ku.f, attributeSet0, wi0.b, v, 0);
        try {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 == null) {
                int v2 = wi0.f(1, -1);
                if(v2 != -1) {
                    drawable0 = kv.a(imageView0.getContext(), v2);
                    if(drawable0 != null) {
                        imageView0.setImageDrawable(drawable0);
                    }
                }
            }
            if(drawable0 != null) {
                rg.c(drawable0);
            }
            if(wi0.q(2)) {
                imageView0.setImageTintList(wi0.g(2));
            }
            if(wi0.q(3)) {
                imageView0.setImageTintMode(rg.a(wi0.c(3, -1), null));
            }
        }
        finally {
            wi0.o();
        }
    }

    public final void d(Drawable drawable0) {
        this.b = drawable0.getLevel();
    }

    public final void e(int v) {
        if(v == 0) {
            this.a.setImageDrawable(null);
        }
        else {
            ImageView imageView0 = this.a;
            Drawable drawable0 = kv.a(imageView0.getContext(), v);
            if(drawable0 != null) {
                rg.c(drawable0);
            }
            imageView0.setImageDrawable(drawable0);
        }
        this.b();
    }

    public final boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }
}

