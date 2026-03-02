import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public final class ni extends mo implements MenuItem {
    public final jyc d;
    public Method e;

    public ni(Context context0, jyc jyc0) {
        super(context0);
        if(jyc0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.d = jyc0;
    }

    @Override  // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    @Override  // android.view.MenuItem
    public final boolean expandActionView() {
        return this.d.expandActionView();
    }

    @Override  // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        kdm kdm0 = this.d.a();
        return (kdm0 instanceof ne) ? ((ne)kdm0).a : null;
    }

    @Override  // android.view.MenuItem
    public final View getActionView() {
        View view0 = this.d.getActionView();
        return (view0 instanceof nf) ? ((View)((nf)view0).a) : view0;
    }

    @Override  // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    @Override  // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    @Override  // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    @Override  // android.view.MenuItem
    public final int getGroupId() {
        return this.d.getGroupId();
    }

    @Override  // android.view.MenuItem
    public final Drawable getIcon() {
        return this.d.getIcon();
    }

    @Override  // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    @Override  // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    @Override  // android.view.MenuItem
    public final Intent getIntent() {
        return this.d.getIntent();
    }

    @Override  // android.view.MenuItem
    public final int getItemId() {
        return this.d.getItemId();
    }

    @Override  // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override  // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    @Override  // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    @Override  // android.view.MenuItem
    public final int getOrder() {
        return this.d.getOrder();
    }

    @Override  // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.b(this.d.getSubMenu());
    }

    @Override  // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.d.getTitle();
    }

    @Override  // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    @Override  // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    @Override  // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    @Override  // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    @Override  // android.view.MenuItem
    public final boolean isCheckable() {
        return this.d.isCheckable();
    }

    @Override  // android.view.MenuItem
    public final boolean isChecked() {
        return this.d.isChecked();
    }

    @Override  // android.view.MenuItem
    public final boolean isEnabled() {
        return this.d.isEnabled();
    }

    @Override  // android.view.MenuItem
    public final boolean isVisible() {
        return this.d.isVisible();
    }

    @Override  // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider0) {
        ne ne0 = new ne(this, actionProvider0);
        if(actionProvider0 == null) {
            ne0 = null;
        }
        this.d.c(ne0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setActionView(int v) {
        jyc jyc0 = this.d;
        jyc0.setActionView(v);
        View view0 = jyc0.getActionView();
        if((view0 instanceof CollapsibleActionView)) {
            jyc0.setActionView(new nf(view0));
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setActionView(View view0) {
        if((view0 instanceof CollapsibleActionView)) {
            view0 = new nf(view0);
        }
        this.d.setActionView(view0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.d.setAlphabeticShortcut(c);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int v) {
        this.d.setAlphabeticShortcut(c, v);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.d.setCheckable(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.d.setChecked(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence0) {
        this.d.b(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.d.setEnabled(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIcon(int v) {
        this.d.setIcon(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable0) {
        this.d.setIcon(drawable0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList0) {
        this.d.setIconTintList(colorStateList0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.d.setIconTintMode(porterDuff$Mode0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setIntent(Intent intent0) {
        this.d.setIntent(intent0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.d.setNumericShortcut(c);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int v) {
        this.d.setNumericShortcut(c, v);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        ng ng0 = menuItem$OnActionExpandListener0 == null ? null : new ng(this, menuItem$OnActionExpandListener0);
        this.d.setOnActionExpandListener(ng0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        nh nh0 = menuItem$OnMenuItemClickListener0 == null ? null : new nh(this, menuItem$OnMenuItemClickListener0);
        this.d.setOnMenuItemClickListener(nh0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c1) {
        this.d.setShortcut(c, c1);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.d.setShortcut(c, c1, v, v1);
        return this;
    }

    @Override  // android.view.MenuItem
    public final void setShowAsAction(int v) {
        this.d.setShowAsAction(v);
    }

    @Override  // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int v) {
        this.d.setShowAsActionFlags(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTitle(int v) {
        this.d.setTitle(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence0) {
        this.d.setTitle(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.d.setTitleCondensed(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence0) {
        this.d.d(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.d.setVisible(z);
        return this.d;
    }
}

