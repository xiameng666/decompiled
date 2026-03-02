import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import com.google.android.wallet.ui.common.MaterialButtonComponent;
import java.util.List;

public final class fbxm extends MaterialButtonComponent implements View.OnAttachStateChangeListener {
    private final Context D;
    private final fbxv E;
    public final gafh b;

    public fbxm(View.OnClickListener view$OnClickListener0, Context context0, gafh gafh0, fbxv fbxv0) {
        super(context0);
        this.f = view$OnClickListener0;
        this.D = context0;
        this.b = gafh0;
        this.E = fbxv0;
        this.e = new gcgb(fbxv0.b(gafh0));
        fbxv0.b(gafh0).addOnAttachStateChangeListener(this);
        if(fbxv0.b(gafh0).isAttachedToWindow()) {
            this.onViewAttachedToWindow(null);
        }
        this.B = gafh0.d;
    }

    @Override  // com.google.android.wallet.ui.common.MaterialButtonComponent
    public final void K(gffq gffq0, List list0) {
        super.K(gffq0, list0);
        if(gfev.a(gffq0.e) == 2) {
            fbxv fbxv0 = this.E;
            gafh gafh0 = this.b;
            if(fbxv0.k != gafh0) {
                fbxv0.c(gafh0);
            }
        }
    }

    @Override  // com.google.android.wallet.ui.common.MaterialButtonComponent
    public final View c() {
        throw new UnsupportedOperationException("getView is not supported");
    }

    @Override  // com.google.android.wallet.ui.common.MaterialButtonComponent
    public final Button d() {
        throw new UnsupportedOperationException("getButton is not supported");
    }

    @Override  // com.google.android.wallet.ui.common.MaterialButtonComponent
    protected final void e(boolean z) {
        super.e(z);
        this.b.c(z);
    }

    @Override  // com.google.android.wallet.ui.common.MaterialButtonComponent
    protected final void f(CharSequence charSequence0) {
        if(this.h && !TextUtils.isEmpty(charSequence0)) {
            charSequence0 = charSequence0.toString().toUpperCase(this.D.getResources().getConfiguration().locale);
        }
        this.b.d(charSequence0);
    }

    @Override  // com.google.android.wallet.ui.common.MaterialButtonComponent
    protected final void g(int v) {
        this.b.f(v);
    }

    @Override  // gcyd, android.widget.TextView
    public final CharSequence getText() {
        return this.b.b;
    }

    @Override  // android.view.View
    public final int getVisibility() {
        return this.b == null ? 8 : this.b.d;
    }

    @Override  // com.google.android.wallet.ui.common.MaterialButtonComponent
    protected final void h(Drawable drawable0) {
        Button button0 = this.E.b(this.b);
        Drawable[] arr_drawable = button0.getCompoundDrawablesRelative();
        button0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, arr_drawable[1], arr_drawable[2], arr_drawable[3]);
    }

    @Override  // com.google.android.wallet.ui.common.MaterialButtonComponent
    public final void i(gevs gevs0) {
        super.i(gevs0);
        this.e.b();
    }

    @Override  // android.view.View
    public final boolean isEnabled() {
        return this.b.c;
    }

    @Override  // com.google.android.wallet.ui.common.MaterialButtonComponent
    protected final void j(boolean z) {
        if(this.c != null && (this.c.b & 4) != 0) {
            Button button0 = this.E.b(this.b);
            Drawable[] arr_drawable = button0.getCompoundDrawablesRelative();
            Drawable drawable0 = arr_drawable[0];
            if(drawable0 != null) {
                drawable0.setAlpha((z ? 0xFF : 77));
            }
            button0.setCompoundDrawablesRelativeWithIntrinsicBounds(arr_drawable[0], arr_drawable[1], arr_drawable[2], arr_drawable[3]);
        }
    }

    @Override  // com.google.android.wallet.ui.common.MaterialButtonComponent
    public final void k(fayg fayg0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.i = true;
        this.e.b();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        this.i = false;
        this.E.e(this.b, this);
    }

    @Override  // android.view.View
    public final boolean postDelayed(Runnable runnable0, long v) {
        return this.E.b(this.b).postDelayed(runnable0, v);
    }

    @Override  // android.view.View
    public final boolean removeCallbacks(Runnable runnable0) {
        return this.E.e(this.b, this);
    }

    @Override  // gcyd, android.view.View
    public final void setId(int v) {
    }
}

