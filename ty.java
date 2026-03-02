import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class ty extends ViewGroup.MarginLayoutParams {
    public uq c;
    public final Rect d;
    public boolean e;
    boolean f;

    public ty(int v, int v1) {
        super(v, v1);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public ty(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public ty(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super(viewGroup$LayoutParams0);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public ty(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        super(viewGroup$MarginLayoutParams0);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public ty(ty ty0) {
        super(ty0);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int fE() {
        return this.c.c();
    }

    public final boolean fF() {
        return this.c.y();
    }

    public final boolean fG() {
        return this.c.v();
    }
}

