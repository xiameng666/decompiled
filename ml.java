import android.support.v7.view.menu.ActionMenuItemView;

public final class ml extends rt {
    final ActionMenuItemView a;

    public ml(ActionMenuItemView actionMenuItemView0) {
        this.a = actionMenuItemView0;
        super(actionMenuItemView0);
    }

    @Override  // rt
    public final nr a() {
        mm mm0 = this.a.c;
        if(mm0 != null) {
            oh oh0 = mm0.a.m;
            if(oh0 != null) {
                return oh0.a();
            }
        }
        return null;
    }

    @Override  // rt
    protected final boolean b() {
        mz mz0 = this.a.b;
        if(mz0 != null && mz0.b(this.a.a)) {
            nr nr0 = this.a();
            return nr0 != null && nr0.x();
        }
        return false;
    }
}

