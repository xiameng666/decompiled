import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

final class pq extends pm {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public pq(SeekBar seekBar0) {
        super(seekBar0);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar0;
    }

    @Override  // pm
    public final void b(AttributeSet attributeSet0, int v) {
        super.b(attributeSet0, v);
        SeekBar seekBar0 = this.b;
        wi wi0 = wi.l(seekBar0.getContext(), attributeSet0, ku.g, v, 0);
        kfc.b(seekBar0, seekBar0.getContext(), ku.g, attributeSet0, wi0.b, v, 0);
        Drawable drawable0 = wi0.i(0);
        if(drawable0 != null) {
            seekBar0.setThumb(drawable0);
        }
        Drawable drawable1 = wi0.h(1);
        Drawable drawable2 = this.c;
        if(drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.c = drawable1;
        if(drawable1 != null) {
            drawable1.setCallback(seekBar0);
            drawable1.setLayoutDirection(seekBar0.getLayoutDirection());
            if(drawable1.isStateful()) {
                drawable1.setState(seekBar0.getDrawableState());
            }
            this.c();
        }
        seekBar0.invalidate();
        if(wi0.q(3)) {
            this.e = rg.a(wi0.c(3, -1), this.e);
            this.g = true;
        }
        if(wi0.q(2)) {
            this.d = wi0.g(2);
            this.f = true;
        }
        wi0.o();
        this.c();
    }

    private final void c() {
        Drawable drawable0 = this.c;
        if(drawable0 != null && (this.f || this.g)) {
            Drawable drawable1 = drawable0.mutate();
            this.c = drawable1;
            if(this.f) {
                drawable1.setTintList(this.d);
            }
            if(this.g) {
                this.c.setTintMode(this.e);
            }
            if(this.c.isStateful()) {
                this.c.setState(this.b.getDrawableState());
            }
        }
    }
}

