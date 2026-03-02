import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class kdw {
    public final Map a;
    private final Runnable b;
    private final CopyOnWriteArrayList c;

    public kdw(Runnable runnable0) {
        this.c = new CopyOnWriteArrayList();
        this.a = new HashMap();
        this.b = runnable0;
    }

    public final void a(kdz kdz0) {
        this.c.add(kdz0);
        this.b.run();
    }

    public final void b(Menu menu0, MenuInflater menuInflater0) {
        for(Object object0: this.c) {
            ((kdz)object0).a(menu0, menuInflater0);
        }
    }

    public final void c(Menu menu0) {
        for(Object object0: this.c) {
            ((kdz)object0).b(menu0);
        }
    }

    public final void d(Menu menu0) {
        for(Object object0: this.c) {
            ((kdz)object0).c(menu0);
        }
    }

    public final void e(kdz kdz0) {
        this.c.remove(kdz0);
        kdv kdv0 = (kdv)this.a.remove(kdz0);
        if(kdv0 != null) {
            kdv0.a();
        }
        this.b.run();
    }

    public final boolean f(MenuItem menuItem0) {
        for(Object object0: this.c) {
            if(((kdz)object0).d(menuItem0)) {
                return true;
            }
        }
        return false;
    }
}

