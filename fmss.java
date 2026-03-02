import android.util.SparseArray;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;

public final class fmss implements MenuItem.OnMenuItemClickListener {
    public final fmus a;

    public fmss(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        if(menuItem0 != null) {
            fmus fmus0 = this.a;
            int v = menuItem0.getItemId();
            SparseArray sparseArray0 = fmus0.r;
            if(sparseArray0.get(v) != null) {
                fmus0.a(((fmbi)sparseArray0.get(menuItem0.getItemId())));
                return true;
            }
        }
        return false;
    }
}

