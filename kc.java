import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class kc extends aas {
    private jg a;
    private final kdr b;

    public kc(Context context0, int v) {
        super(context0, kc.a(context0, v));
        this.b = (KeyEvent keyEvent0) -> super.dispatchKeyEvent(keyEvent0);
        jg jg0 = this.h();
        ((ka)jg0).D = kc.a(context0, v);
        jg0.z();
    }

    private static int a(Context context0, int v) {
        if(v == 0) {
            TypedValue typedValue0 = new TypedValue();
            context0.getTheme().resolveAttribute(0x7F04043F, typedValue0, true);  // attr:dialogTheme
            return typedValue0.resourceId;
        }
        return v;
    }

    @Override  // aas
    public final void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.k();
        this.h().f(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Dialog
    public final void dismiss() {
        super.dismiss();
        this.h().i();
    }

    @Override  // android.app.Dialog
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        this.getWindow().getDecorView();
        return kds.a(this.b, keyEvent0);
    }

    @Override  // android.app.Dialog
    public final View findViewById(int v) {
        return this.h().d(v);
    }

    public final jg h() {
        if(this.a == null) {
            this.a = new ka(this.getContext(), this.getWindow(), this);
        }
        return this.a;
    }

    // Detected as a lambda impl.
    final boolean i(KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.app.Dialog
    public final void invalidateOptionsMenu() {
        this.h().h();
    }

    public final void j() {
        this.h().B(1);
    }

    @Override  // aas
    protected void onCreate(Bundle bundle0) {
        this.h().g();
        super.onCreate(bundle0);
        this.h().z();
    }

    @Override  // aas
    protected final void onStop() {
        super.onStop();
        this.h().l();
    }

    @Override  // aas
    public void setContentView(int v) {
        this.k();
        this.h().o(v);
    }

    @Override  // aas
    public void setContentView(View view0) {
        this.k();
        this.h().p(view0);
    }

    @Override  // aas
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.k();
        this.h().q(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Dialog
    public final void setTitle(int v) {
        super.setTitle(v);
        this.h().u(this.getContext().getString(v));
    }

    @Override  // android.app.Dialog
    public void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.h().u(charSequence0);
    }
}

