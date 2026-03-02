import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class nd implements jyc {
    private int A;
    private View B;
    private MenuItem.OnActionExpandListener C;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public Intent e;
    public char f;
    public int g;
    public char h;
    public int i;
    public final na j;
    public nv k;
    public CharSequence l;
    public CharSequence m;
    public int n;
    public kdm o;
    public boolean p;
    private final int q;
    private CharSequence r;
    private Drawable s;
    private int t;
    private MenuItem.OnMenuItemClickListener u;
    private ColorStateList v;
    private PorterDuff.Mode w;
    private boolean x;
    private boolean y;
    private boolean z;

    public nd(na na0, int v, int v1, int v2, int v3, CharSequence charSequence0, int v4) {
        this.g = 0x1000;
        this.i = 0x1000;
        this.t = 0;
        this.v = null;
        this.w = null;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = 16;
        this.p = false;
        this.j = na0;
        this.a = v1;
        this.b = v;
        this.q = v2;
        this.c = v3;
        this.d = charSequence0;
        this.n = v4;
    }

    @Override  // jyc
    public final kdm a() {
        return this.o;
    }

    @Override  // jyc
    public final void b(CharSequence charSequence0) {
        this.l = charSequence0;
        this.j.n(false);
    }

    @Override  // jyc
    public final void c(kdm kdm0) {
        this.B = null;
        this.o = kdm0;
        this.j.n(true);
        kdm kdm1 = this.o;
        if(kdm1 != null) {
            kdm1.g(new nc(this));
        }
    }

    @Override  // jyc
    public final boolean collapseActionView() {
        if((this.n & 8) == 0) {
            return false;
        }
        if(this.B == null) {
            return true;
        }
        return this.C == null || this.C.onMenuItemActionCollapse(this) ? this.j.v(this) : false;
    }

    @Override  // jyc
    public final void d(CharSequence charSequence0) {
        this.m = charSequence0;
        this.j.n(false);
    }

    public final char e() {
        return this.j.z() ? this.h : this.f;
    }

    @Override  // jyc
    public final boolean expandActionView() {
        return this.m() && (this.C == null || this.C.onMenuItemActionExpand(this)) ? this.j.x(this) : false;
    }

    public final CharSequence f(no no0) {
        return no0.e() ? this.getTitleCondensed() : this.d;
    }

    public static void g(StringBuilder stringBuilder0, int v, int v1, String s) {
        if((v & v1) == v1) {
            stringBuilder0.append(s);
        }
    }

    @Override  // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override  // jyc
    public final View getActionView() {
        View view0 = this.B;
        if(view0 != null) {
            return view0;
        }
        kdm kdm0 = this.o;
        if(kdm0 != null) {
            View view1 = kdm0.a(this);
            this.B = view1;
            return view1;
        }
        return null;
    }

    @Override  // jyc
    public final int getAlphabeticModifiers() {
        return this.i;
    }

    @Override  // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.h;
    }

    @Override  // jyc
    public final CharSequence getContentDescription() {
        return this.l;
    }

    @Override  // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override  // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable0 = this.s;
        if(drawable0 != null) {
            return this.v(drawable0);
        }
        int v = this.t;
        if(v != 0) {
            Drawable drawable1 = kv.a(this.j.a, v);
            this.t = 0;
            this.s = drawable1;
            return this.v(drawable1);
        }
        return null;
    }

    @Override  // jyc
    public final ColorStateList getIconTintList() {
        return this.v;
    }

    @Override  // jyc
    public final PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    @Override  // android.view.MenuItem
    public final Intent getIntent() {
        return this.e;
    }

    @Override  // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }

    @Override  // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override  // jyc
    public final int getNumericModifiers() {
        return this.g;
    }

    @Override  // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f;
    }

    @Override  // android.view.MenuItem
    public final int getOrder() {
        return this.q;
    }

    @Override  // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.k;
    }

    @Override  // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.d;
    }

    @Override  // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.r == null ? this.d : this.r;
    }

    @Override  // jyc
    public final CharSequence getTooltipText() {
        return this.m;
    }

    public final void h(boolean z) {
        this.p = z;
        this.j.n(false);
    }

    @Override  // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.k != null;
    }

    final void i(boolean z) {
        int v = this.A;
        int v1 = (z ? 2 : 0) | v & -3;
        this.A = v1;
        if(v != v1) {
            this.j.n(false);
        }
    }

    @Override  // jyc
    public final boolean isActionViewExpanded() {
        return this.p;
    }

    @Override  // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.A & 1) == 1;
    }

    @Override  // android.view.MenuItem
    public final boolean isChecked() {
        return (this.A & 2) == 2;
    }

    @Override  // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.A & 16) != 0;
    }

    @Override  // android.view.MenuItem
    public final boolean isVisible() {
        return this.o == null || !this.o.f() ? (this.A & 8) == 0 : (this.A & 8) == 0 && this.o.d();
    }

    public final void j(boolean z) {
        this.A = (z ? 4 : 0) | this.A & -5;
    }

    public final void k(boolean z) {
        this.A = z ? this.A | 0x20 : this.A & -33;
    }

    public final void l(nv nv0) {
        this.k = nv0;
        nv0.setHeaderTitle(this.d);
    }

    public final boolean m() {
        if((this.n & 8) != 0) {
            if(this.B == null) {
                kdm kdm0 = this.o;
                if(kdm0 != null) {
                    this.B = kdm0.a(this);
                }
            }
            return this.B != null;
        }
        return false;
    }

    public final boolean n() {
        if(this.u != null && this.u.onMenuItemClick(this)) {
            return true;
        }
        na na0 = this.j;
        if(na0.w(na0, this)) {
            return true;
        }
        Intent intent0 = this.e;
        if(intent0 != null) {
            try {
                na0.a.startActivity(intent0);
                return true;
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                Log.e("MenuItemImpl", "Can\'t find activity to handle intent; ignoring", activityNotFoundException0);
            }
        }
        return this.o != null && this.o.e();
    }

    public final boolean o() {
        return (this.A & 0x20) == 0x20;
    }

    public final boolean p() {
        return (this.A & 4) != 0;
    }

    public final boolean q() {
        return (this.n & 1) == 1;
    }

    public final boolean r() {
        return (this.n & 2) == 2;
    }

    final boolean s(boolean z) {
        int v = this.A;
        int v1 = (z ? 0 : 8) | v & -9;
        this.A = v1;
        return v != v1;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider0) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override  // jyc
    public final MenuItem setActionView(int v) {
        this.u(LayoutInflater.from(this.j.a).inflate(v, new LinearLayout(this.j.a), false));
        return this;
    }

    @Override  // jyc
    public final MenuItem setActionView(View view0) {
        this.u(view0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if(this.h == c) {
            return this;
        }
        this.h = Character.toLowerCase(c);
        this.j.n(false);
        return this;
    }

    @Override  // jyc
    public final MenuItem setAlphabeticShortcut(char c, int v) {
        if(this.h == c && this.i == v) {
            return this;
        }
        this.h = Character.toLowerCase(c);
        this.i = KeyEvent.normalizeMetaState(v);
        this.j.n(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int v = this.A;
        int v1 = ((int)z) | v & -2;
        this.A = v1;
        if(v != v1) {
            this.j.n(false);
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if((this.A & 4) != 0) {
            na na0 = this.j;
            int v = this.b;
            ArrayList arrayList0 = na0.c;
            int v1 = arrayList0.size();
            na0.u();
            for(int v2 = 0; v2 < v1; ++v2) {
                nd nd0 = (nd)arrayList0.get(v2);
                if(nd0.b == v && nd0.p() && nd0.isCheckable()) {
                    nd0.i(nd0 == this);
                }
            }
            na0.t();
            return this;
        }
        this.i(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence0) {
        this.b(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.A = z ? this.A | 16 : this.A & -17;
        this.j.n(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIcon(int v) {
        this.s = null;
        this.t = v;
        this.z = true;
        this.j.n(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable0) {
        this.t = 0;
        this.s = drawable0;
        this.z = true;
        this.j.n(false);
        return this;
    }

    @Override  // jyc
    public final MenuItem setIconTintList(ColorStateList colorStateList0) {
        this.v = colorStateList0;
        this.x = true;
        this.z = true;
        this.j.n(false);
        return this;
    }

    @Override  // jyc
    public final MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.w = porterDuff$Mode0;
        this.y = true;
        this.z = true;
        this.j.n(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIntent(Intent intent0) {
        this.e = intent0;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if(this.f == c) {
            return this;
        }
        this.f = c;
        this.j.n(false);
        return this;
    }

    @Override  // jyc
    public final MenuItem setNumericShortcut(char c, int v) {
        if(this.f == c && this.g == v) {
            return this;
        }
        this.f = c;
        this.g = KeyEvent.normalizeMetaState(v);
        this.j.n(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        this.C = menuItem$OnActionExpandListener0;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        this.u = menuItem$OnMenuItemClickListener0;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c1) {
        this.f = c;
        this.h = Character.toLowerCase(c1);
        this.j.n(false);
        return this;
    }

    @Override  // jyc
    public final MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.f = c;
        this.g = KeyEvent.normalizeMetaState(v);
        this.h = Character.toLowerCase(c1);
        this.i = KeyEvent.normalizeMetaState(v1);
        this.j.n(false);
        return this;
    }

    @Override  // jyc
    public final void setShowAsAction(int v) {
        if((v & 3) != 0 && (v & 3) != 1 && (v & 3) != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.n = v;
        this.j.D();
    }

    @Override  // jyc
    public final MenuItem setShowAsActionFlags(int v) {
        this.setShowAsAction(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTitle(int v) {
        this.setTitle(this.j.a.getString(v));
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence0) {
        this.d = charSequence0;
        this.j.n(false);
        nv nv0 = this.k;
        if(nv0 != null) {
            nv0.setHeaderTitle(charSequence0);
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.r = charSequence0;
        this.j.n(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence0) {
        this.d(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if(this.s(z)) {
            this.j.E();
        }
        return this;
    }

    public final boolean t() {
        return this.j.A() && this.e() != 0;
    }

    @Override
    public final String toString() {
        return this.d == null ? null : this.d.toString();
    }

    public final void u(View view0) {
        this.B = view0;
        this.o = null;
        if(view0 != null && view0.getId() == -1) {
            int v = this.a;
            if(v > 0) {
                view0.setId(v);
            }
        }
        this.j.D();
    }

    private final Drawable v(Drawable drawable0) {
        if(drawable0 != null && this.z && (this.x || this.y)) {
            drawable0 = drawable0.mutate();
            if(this.x) {
                drawable0.setTintList(this.v);
            }
            if(this.y) {
                drawable0.setTintMode(this.w);
            }
            this.z = false;
        }
        return drawable0;
    }
}

