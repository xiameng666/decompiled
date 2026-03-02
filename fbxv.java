import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.setupcompat.internal.TemplateLayout;

public final class fbxv extends gaff {
    public Button a;
    public Button b;
    public fbxm c;

    public fbxv(TemplateLayout templateLayout0, AttributeSet attributeSet0, int v) {
        super(templateLayout0, attributeSet0, v);
    }

    public final Button b(gafh gafh0) {
        int v = gafh0.a;
        if(v == 4) {
            return this.a;
        }
        if(v == 7) {
            return this.b;
        }
        throw new IllegalStateException("invalid FooterButton button type");
    }

    @Override  // gaff
    public final void c(gafh gafh0) {
        super.c(gafh0);
        this.a = this.h();
    }

    @Override  // gaff
    public final void d(gafh gafh0) {
        super.d(gafh0);
        this.b = this.i();
    }

    public final boolean e(gafh gafh0, Runnable runnable0) {
        return this.b(gafh0).removeCallbacks(runnable0);
    }
}

