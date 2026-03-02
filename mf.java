import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

final class mf {
    kdm A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    final mg F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public mf(mg mg0, Menu menu0) {
        this.F = mg0;
        super();
        this.D = null;
        this.E = null;
        this.a = menu0;
        this.c();
    }

    public final SubMenu a() {
        this.h = true;
        SubMenu subMenu0 = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        this.d(subMenu0.getItem());
        return subMenu0;
    }

    public final Object b(String s, Class[] arr_class, Object[] arr_object) {
        try {
            Constructor constructor0 = Class.forName(s, false, this.F.e.getClassLoader()).getConstructor(arr_class);
            constructor0.setAccessible(true);
            return constructor0.newInstance(arr_object);
        }
        catch(Exception exception0) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + s, exception0);
            return null;
        }
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final void d(MenuItem menuItem0) {
        boolean z = false;
        menuItem0.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        int v = this.v;
        if(v >= 0) {
            menuItem0.setShowAsAction(v);
        }
        if(this.z != null) {
            mg mg0 = this.F;
            Context context0 = mg0.e;
            if(context0.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if(mg0.f == null) {
                mg0.f = mg0.a(context0);
            }
            menuItem0.setOnMenuItemClickListener(new me(mg0.f, this.z));
        }
        if(this.r >= 2) {
            if((menuItem0 instanceof nd)) {
                ((nd)menuItem0).j(true);
            }
            else if((menuItem0 instanceof ni)) {
                ni ni0 = (ni)menuItem0;
                try {
                    if(ni0.e == null) {
                        ni0.e = ni0.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    ni0.e.invoke(ni0.d, Boolean.valueOf(true));
                }
                catch(Exception exception0) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception0);
                }
            }
        }
        String s = this.x;
        if(s != null) {
            menuItem0.setActionView(((View)this.b(s, mg.a, this.F.c)));
            z = true;
        }
        int v1 = this.w;
        if(v1 > 0) {
            if(z) {
                Log.w("SupportMenuInflater", "Ignoring attribute \'itemActionViewLayout\'. Action view already specified.");
            }
            else {
                menuItem0.setActionView(v1);
            }
        }
        kdm kdm0 = this.A;
        if(kdm0 != null) {
            if((menuItem0 instanceof jyc)) {
                ((jyc)menuItem0).c(kdm0);
            }
            else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        kdy.a(menuItem0, this.B);
        CharSequence charSequence0 = this.C;
        if((menuItem0 instanceof jyc)) {
            ((jyc)menuItem0).d(charSequence0);
        }
        else {
            menuItem0.setTooltipText(charSequence0);
        }
        int v2 = this.n;
        int v3 = this.o;
        if((menuItem0 instanceof jyc)) {
            ((jyc)menuItem0).setAlphabeticShortcut(((char)v2), v3);
        }
        else {
            menuItem0.setAlphabeticShortcut(((char)v2), v3);
        }
        int v4 = this.p;
        int v5 = this.q;
        if((menuItem0 instanceof jyc)) {
            ((jyc)menuItem0).setNumericShortcut(((char)v4), v5);
        }
        else {
            menuItem0.setNumericShortcut(((char)v4), v5);
        }
        PorterDuff.Mode porterDuff$Mode0 = this.E;
        if(porterDuff$Mode0 != null) {
            if((menuItem0 instanceof jyc)) {
                ((jyc)menuItem0).setIconTintMode(porterDuff$Mode0);
            }
            else {
                menuItem0.setIconTintMode(porterDuff$Mode0);
            }
        }
        ColorStateList colorStateList0 = this.D;
        if(colorStateList0 != null) {
            if((menuItem0 instanceof jyc)) {
                ((jyc)menuItem0).setIconTintList(colorStateList0);
                return;
            }
            menuItem0.setIconTintList(colorStateList0);
        }
    }

    public static final char e(String s) {
        return s == null ? '\u0000' : s.charAt(0);
    }
}

