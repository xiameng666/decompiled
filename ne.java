import android.view.ActionProvider.VisibilityListener;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class ne extends kdm implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    final ni b;
    public static final int c;
    private nc d;

    public ne(ni ni0, ActionProvider actionProvider0) {
        this.b = ni0;
        super();
        this.a = actionProvider0;
    }

    @Override  // kdm
    public final View a(MenuItem menuItem0) {
        return this.a.onCreateActionView(menuItem0);
    }

    @Override  // kdm
    public final void b(SubMenu subMenu0) {
        SubMenu subMenu1 = this.b.b(subMenu0);
        this.a.onPrepareSubMenu(subMenu1);
    }

    @Override  // kdm
    public final boolean c() {
        return this.a.hasSubMenu();
    }

    @Override  // kdm
    public final boolean d() {
        return this.a.isVisible();
    }

    @Override  // kdm
    public final boolean e() {
        return this.a.onPerformDefaultAction();
    }

    @Override  // kdm
    public final boolean f() {
        return this.a.overridesItemVisibility();
    }

    @Override  // kdm
    public final void g(nc nc0) {
        this.d = nc0;
        this.a.setVisibilityListener(this);
    }

    @Override  // android.view.ActionProvider$VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        nc nc0 = this.d;
        if(nc0 != null) {
            nc0.a.j.E();
        }
    }
}

