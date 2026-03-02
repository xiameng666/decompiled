import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class mk implements jyc {
    private CharSequence a;
    private CharSequence b;
    private Intent c;
    private char d;
    private int e;
    private char f;
    private int g;
    private Drawable h;
    private final Context i;
    private CharSequence j;
    private CharSequence k;
    private ColorStateList l;
    private PorterDuff.Mode m;
    private boolean n;
    private boolean o;
    private int p;

    public mk(Context context0, CharSequence charSequence0) {
        this.e = 0x1000;
        this.g = 0x1000;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.p = 16;
        this.i = context0;
        this.a = charSequence0;
    }

    @Override  // jyc
    public final kdm a() {
        return null;
    }

    @Override  // jyc
    public final void b(CharSequence charSequence0) {
        this.j = charSequence0;
    }

    @Override  // jyc
    public final void c(kdm kdm0) {
        throw new UnsupportedOperationException();
    }

    @Override  // jyc
    public final boolean collapseActionView() {
        return false;
    }

    @Override  // jyc
    public final void d(CharSequence charSequence0) {
        this.k = charSequence0;
    }

    private final void e() {
        Drawable drawable0 = this.h;
        if(drawable0 != null && (this.n || this.o)) {
            Drawable drawable1 = drawable0.mutate();
            this.h = drawable1;
            if(this.n) {
                drawable1.setTintList(this.l);
            }
            if(this.o) {
                this.h.setTintMode(this.m);
            }
        }
    }

    @Override  // jyc
    public final boolean expandActionView() {
        return false;
    }

    @Override  // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override  // jyc
    public final View getActionView() {
        return null;
    }

    @Override  // jyc
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override  // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override  // jyc
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override  // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override  // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override  // jyc
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override  // jyc
    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override  // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override  // android.view.MenuItem
    public final int getItemId() {
        return 0x102002C;
    }

    @Override  // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override  // jyc
    public final int getNumericModifiers() {
        return this.e;
    }

    @Override  // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override  // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override  // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override  // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.a;
    }

    @Override  // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.b == null ? this.a : this.b;
    }

    @Override  // jyc
    public final CharSequence getTooltipText() {
        return this.k;
    }

    @Override  // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override  // jyc
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override  // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    @Override  // android.view.MenuItem
    public final boolean isChecked() {
        return (this.p & 2) != 0;
    }

    @Override  // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    @Override  // android.view.MenuItem
    public final boolean isVisible() {
        return (this.p & 8) == 0;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider0) {
        throw new UnsupportedOperationException();
    }

    @Override  // jyc
    public final MenuItem setActionView(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // jyc
    public final MenuItem setActionView(View view0) {
        throw new UnsupportedOperationException();
    }

    @Override  // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f = Character.toLowerCase(c);
        return this;
    }

    @Override  // jyc
    public final MenuItem setAlphabeticShortcut(char c, int v) {
        this.f = Character.toLowerCase(c);
        this.g = KeyEvent.normalizeMetaState(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.p = ((int)z) | this.p & -2;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.p = (z ? 2 : 0) | this.p & -3;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence0) {
        this.j = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.p = (z ? 16 : 0) | this.p & -17;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIcon(int v) {
        this.h = this.i.getDrawable(v);
        this.e();
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable0) {
        this.h = drawable0;
        this.e();
        return this;
    }

    @Override  // jyc
    public final MenuItem setIconTintList(ColorStateList colorStateList0) {
        this.l = colorStateList0;
        this.n = true;
        this.e();
        return this;
    }

    @Override  // jyc
    public final MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.m = porterDuff$Mode0;
        this.o = true;
        this.e();
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIntent(Intent intent0) {
        this.c = intent0;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.d = c;
        return this;
    }

    @Override  // jyc
    public final MenuItem setNumericShortcut(char c, int v) {
        this.d = c;
        this.e = KeyEvent.normalizeMetaState(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        throw new UnsupportedOperationException();
    }

    @Override  // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c1) {
        this.d = c;
        this.f = Character.toLowerCase(c1);
        return this;
    }

    @Override  // jyc
    public final MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.d = c;
        this.e = KeyEvent.normalizeMetaState(v);
        this.f = Character.toLowerCase(c1);
        this.g = KeyEvent.normalizeMetaState(v1);
        return this;
    }

    @Override  // jyc
    public final void setShowAsAction(int v) {
    }

    @Override  // jyc
    public final MenuItem setShowAsActionFlags(int v) {
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTitle(int v) {
        this.a = this.i.getResources().getString(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence0) {
        this.a = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.b = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence0) {
        this.k = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int v = 8;
        int v1 = this.p & 8;
        if(z) {
            v = 0;
        }
        this.p = v1 | v;
        return this;
    }
}

