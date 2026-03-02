import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class nv extends na implements SubMenu {
    public final na l;
    public final nd m;

    public nv(Context context0, na na0, nd nd0) {
        super(context0);
        this.l = na0;
        this.m = nd0;
    }

    @Override  // na
    public final boolean A() {
        return this.l.A();
    }

    @Override  // na
    public final na a() {
        return this.l.a();
    }

    @Override  // na
    public final String d() {
        int v = this.m.a;
        return v == 0 ? null : "android:menu:actionviewstates:" + v;
    }

    @Override  // android.view.SubMenu
    public final MenuItem getItem() {
        return this.m;
    }

    @Override  // na
    public final void r(my my0) {
        this.l.r(my0);
    }

    @Override  // na, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.l.setGroupDividerEnabled(z);
    }

    @Override  // android.view.SubMenu
    public final SubMenu setHeaderIcon(int v) {
        super.s(0, null, v, null, null);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable0) {
        super.s(0, null, 0, drawable0, null);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setHeaderTitle(int v) {
        super.s(v, null, 0, null, null);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence0) {
        super.s(0, charSequence0, 0, null, null);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setHeaderView(View view0) {
        super.s(0, null, 0, null, view0);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setIcon(int v) {
        this.m.setIcon(v);
        return this;
    }

    @Override  // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable0) {
        this.m.setIcon(drawable0);
        return this;
    }

    @Override  // na, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.l.setQwertyMode(z);
    }

    @Override  // na
    public final boolean v(nd nd0) {
        return this.l.v(nd0);
    }

    @Override  // na
    public final boolean w(na na0, MenuItem menuItem0) {
        return super.w(na0, menuItem0) || this.l.w(na0, menuItem0);
    }

    @Override  // na
    public final boolean x(nd nd0) {
        return this.l.x(nd0);
    }

    @Override  // na
    public final boolean y() {
        return this.l.y();
    }

    @Override  // na
    public final boolean z() {
        return this.l.z();
    }
}

