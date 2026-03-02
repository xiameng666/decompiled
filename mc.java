import android.content.Context;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class mc implements ly {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c;
    final bzs d;

    public mc(Context context0, ActionMode.Callback actionMode$Callback0) {
        this.b = context0;
        this.a = actionMode$Callback0;
        this.c = new ArrayList();
        this.d = new bzs();
    }

    @Override  // ly
    public final void a(lz lz0) {
        throw null;
    }

    @Override  // ly
    public final boolean b(lz lz0, MenuItem menuItem0) {
        throw null;
    }

    @Override  // ly
    public final boolean c(lz lz0, Menu menu0) {
        throw null;
    }

    @Override  // ly
    public final void d(lz lz0, Menu menu0) {
        throw null;
    }

    public final ActionMode e(lz lz0) {
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ActionMode actionMode0 = (md)arrayList0.get(v1);
            if(actionMode0 != null && actionMode0.b == lz0) {
                return actionMode0;
            }
        }
        ActionMode actionMode1 = new md(this.b, lz0);
        arrayList0.add(actionMode1);
        return actionMode1;
    }

    public final Menu f(Menu menu0) {
        bzs bzs0 = this.d;
        Menu menu1 = (Menu)bzs0.get(menu0);
        if(menu1 == null) {
            menu1 = new nq(this.b, ((jyb)menu0));
            bzs0.put(menu0, menu1);
        }
        return menu1;
    }
}

