import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class nq extends mo implements Menu {
    private final jyb d;

    public nq(Context context0, jyb jyb0) {
        super(context0);
        if(jyb0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.d = jyb0;
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v) {
        return this.a(this.d.add(v));
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v, int v1, int v2, int v3) {
        return this.a(this.d.add(v, v1, v2, v3));
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v, int v1, int v2, CharSequence charSequence0) {
        return this.a(this.d.add(v, v1, v2, charSequence0));
    }

    @Override  // android.view.Menu
    public final MenuItem add(CharSequence charSequence0) {
        return this.a(this.d.add(charSequence0));
    }

    @Override  // android.view.Menu
    public final int addIntentOptions(int v, int v1, int v2, ComponentName componentName0, Intent[] arr_intent, Intent intent0, int v3, MenuItem[] arr_menuItem) {
        MenuItem[] arr_menuItem1 = arr_menuItem == null ? null : new MenuItem[arr_menuItem.length];
        int v4 = this.d.addIntentOptions(v, v1, v2, componentName0, arr_intent, intent0, v3, arr_menuItem1);
        if(arr_menuItem1 != null) {
            for(int v5 = 0; v5 < arr_menuItem1.length; ++v5) {
                arr_menuItem[v5] = this.a(arr_menuItem1[v5]);
            }
        }
        return v4;
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v) {
        return this.b(this.d.addSubMenu(v));
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v, int v1, int v2, int v3) {
        return this.b(this.d.addSubMenu(v, v1, v2, v3));
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        return this.b(this.d.addSubMenu(v, v1, v2, charSequence0));
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence0) {
        return this.b(this.d.addSubMenu(charSequence0));
    }

    @Override  // android.view.Menu
    public final void clear() {
        bzs bzs0 = this.b;
        if(bzs0 != null) {
            bzs0.clear();
        }
        bzs bzs1 = this.c;
        if(bzs1 != null) {
            bzs1.clear();
        }
        this.d.clear();
    }

    @Override  // android.view.Menu
    public final void close() {
        this.d.close();
    }

    @Override  // android.view.Menu
    public final MenuItem findItem(int v) {
        return this.a(this.d.findItem(v));
    }

    @Override  // android.view.Menu
    public final MenuItem getItem(int v) {
        return this.a(this.d.getItem(v));
    }

    @Override  // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    @Override  // android.view.Menu
    public final boolean isShortcutKey(int v, KeyEvent keyEvent0) {
        return this.d.isShortcutKey(v, keyEvent0);
    }

    @Override  // android.view.Menu
    public final boolean performIdentifierAction(int v, int v1) {
        return this.d.performIdentifierAction(v, v1);
    }

    @Override  // android.view.Menu
    public final boolean performShortcut(int v, KeyEvent keyEvent0, int v1) {
        return this.d.performShortcut(v, keyEvent0, v1);
    }

    @Override  // android.view.Menu
    public final void removeGroup(int v) {
        if(this.b != null) {
            for(int v1 = 0; true; ++v1) {
                bzs bzs0 = this.b;
                if(v1 >= bzs0.d_num) {
                    break;
                }
                if(((jyc)bzs0.f(v1)).getGroupId() == v) {
                    this.b.g(v1);
                    --v1;
                }
            }
        }
        this.d.removeGroup(v);
    }

    @Override  // android.view.Menu
    public final void removeItem(int v) {
        if(this.b != null) {
            for(int v1 = 0; true; ++v1) {
                bzs bzs0 = this.b;
                if(v1 >= bzs0.d_num) {
                    break;
                }
                if(((jyc)bzs0.f(v1)).getItemId() == v) {
                    this.b.g(v1);
                    break;
                }
            }
        }
        this.d.removeItem(v);
    }

    @Override  // android.view.Menu
    public final void setGroupCheckable(int v, boolean z, boolean z1) {
        this.d.setGroupCheckable(v, z, z1);
    }

    @Override  // android.view.Menu
    public final void setGroupEnabled(int v, boolean z) {
        this.d.setGroupEnabled(v, z);
    }

    @Override  // android.view.Menu
    public final void setGroupVisible(int v, boolean z) {
        this.d.setGroupVisible(v, z);
    }

    @Override  // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    @Override  // android.view.Menu
    public final int size() {
        return this.d.size();
    }
}

