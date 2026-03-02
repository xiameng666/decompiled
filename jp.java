import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

final class jp implements ly {
    final ka a;
    private final ly b;

    public jp(ka ka0, ly ly0) {
        this.a = ka0;
        super();
        this.b = ly0;
    }

    @Override  // ly
    public final void a(lz lz0) {
        ActionMode actionMode0 = ((mc)this.b).e(lz0);
        ((mc)this.b).a.onDestroyActionMode(actionMode0);
        ka ka0 = this.a;
        if(ka0.q != null) {
            ka0.k.getDecorView().removeCallbacks(ka0.r);
        }
        if(ka0.p != null) {
            ka0.O();
            kfs kfs0 = kfe.c(ka0.p);
            kfs0.c(0.0f);
            ka0.s = kfs0;
            ka0.s.h(new jo(this));
        }
        ka0.o = null;
        ka0.u.requestApplyInsets();
        ka0.R();
    }

    @Override  // ly
    public final boolean b(lz lz0, MenuItem menuItem0) {
        mc mc0 = (mc)this.b;
        ActionMode actionMode0 = mc0.e(lz0);
        ni ni0 = new ni(mc0.b, ((jyc)menuItem0));
        return mc0.a.onActionItemClicked(actionMode0, ni0);
    }

    @Override  // ly
    public final boolean c(lz lz0, Menu menu0) {
        mc mc0 = (mc)this.b;
        ActionMode actionMode0 = mc0.e(lz0);
        Menu menu1 = mc0.f(menu0);
        return mc0.a.onCreateActionMode(actionMode0, menu1);
    }

    @Override  // ly
    public final void d(lz lz0, Menu menu0) {
        this.a.u.requestApplyInsets();
        mc mc0 = (mc)this.b;
        ActionMode actionMode0 = mc0.e(lz0);
        Menu menu1 = mc0.f(menu0);
        mc0.a.onPrepareActionMode(actionMode0, menu1);
    }
}

