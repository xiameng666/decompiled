import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

public class aas extends Dialog implements abf, lps, nzd, orl {
    private lpw a;
    private final ork b;
    private final ibnn c;
    private final ibnn d;

    public aas(Context context0) {
        this(context0, 0);
    }

    public aas(Context context0, int v) {
        ibuq.f(context0, "context");
        super(context0, v);
        this.b = orj.a(this);
        this.c = new ibnz(new aaq(this));
        this.d = new ibnz(new aar(this));
    }

    private final lpw a() {
        lpw lpw0 = this.a;
        if(lpw0 == null) {
            lpw0 = new lpw(this);
            this.a = lpw0;
        }
        return lpw0;
    }

    @Override  // android.app.Dialog
    public void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        ibuq.f(view0, "view");
        this.k();
        super.addContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // lps
    public final lpg getLifecycle() {
        return this.a();
    }

    @Override  // abf
    public final abc getOnBackPressedDispatcher() {
        return (abc)this.d.a();
    }

    @Override  // orl
    public final orh getSavedStateRegistry() {
        return this.b.a;
    }

    public final void k() {
        Window window0 = this.getWindow();
        ibuq.c(window0);
        View view0 = window0.getDecorView();
        ibuq.e(view0, "getDecorView(...)");
        lsr.b(view0, this);
        Window window1 = this.getWindow();
        ibuq.c(window1);
        View view1 = window1.getDecorView();
        ibuq.e(view1, "getDecorView(...)");
        abh.a(view1, this);
        Window window2 = this.getWindow();
        ibuq.c(window2);
        View view2 = window2.getDecorView();
        ibuq.e(view2, "getDecorView(...)");
        oro.b(view2, this);
        Window window3 = this.getWindow();
        ibuq.c(window3);
        View view3 = window3.getDecorView();
        ibuq.e(view3, "getDecorView(...)");
        nzq.a(view3, this);
    }

    public static final void l(aas aas0) {
        aas0.super.onBackPressed();
    }

    @Override  // android.app.Dialog
    @ibni
    public final void onBackPressed() {
        ((nzg)this.c.a()).a();
    }

    @Override  // android.app.Dialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(Build.VERSION.SDK_INT >= 33) {
            abc abc0 = this.getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.getOnBackInvokedDispatcher();
            ibuq.e(onBackInvokedDispatcher0, "getOnBackInvokedDispatcher(...)");
            abc0.e(onBackInvokedDispatcher0);
        }
        this.b.b(bundle0);
        this.a().f(lpe.ON_CREATE);
    }

    @Override  // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundle0 = super.onSaveInstanceState();
        ibuq.e(bundle0, "onSaveInstanceState(...)");
        this.b.c(bundle0);
        return bundle0;
    }

    @Override  // android.app.Dialog
    protected void onStart() {
        super.onStart();
        this.a().f(lpe.ON_RESUME);
    }

    @Override  // android.app.Dialog
    protected void onStop() {
        this.a().f(lpe.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override  // android.app.Dialog
    public void setContentView(int v) {
        this.k();
        super.setContentView(v);
    }

    @Override  // android.app.Dialog
    public void setContentView(View view0) {
        ibuq.f(view0, "view");
        this.k();
        super.setContentView(view0);
    }

    @Override  // android.app.Dialog
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        ibuq.f(view0, "view");
        this.k();
        super.setContentView(view0, viewGroup$LayoutParams0);
    }
}

