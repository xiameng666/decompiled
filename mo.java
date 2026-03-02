import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

class mo {
    final Context a;
    public bzs b;
    public bzs c;

    public mo(Context context0) {
        this.a = context0;
    }

    final MenuItem a(MenuItem menuItem0) {
        if((menuItem0 instanceof jyc)) {
            if(this.b == null) {
                this.b = new bzs();
            }
            MenuItem menuItem1 = (MenuItem)this.b.get(((jyc)menuItem0));
            if(menuItem1 == null) {
                MenuItem menuItem2 = new ni(this.a, ((jyc)menuItem0));
                this.b.put(((jyc)menuItem0), menuItem2);
                return menuItem2;
            }
            return menuItem1;
        }
        return menuItem0;
    }

    final SubMenu b(SubMenu subMenu0) {
        if((subMenu0 instanceof jyd)) {
            if(this.c == null) {
                this.c = new bzs();
            }
            SubMenu subMenu1 = (SubMenu)this.c.get(((jyd)subMenu0));
            if(subMenu1 == null) {
                SubMenu subMenu2 = new nw(this.a, ((jyd)subMenu0));
                this.c.put(((jyd)subMenu0), subMenu2);
                return subMenu2;
            }
            return subMenu1;
        }
        return subMenu0;
    }
}

