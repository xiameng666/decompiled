import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

public final class lji implements keg {
    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        int v = kgq0.j().c;
        ((DrawerLayout)view0).c = kgq0;
        boolean z = true;
        ((DrawerLayout)view0).d = v > 0;
        if(v > 0 || ((DrawerLayout)view0).getBackground() != null) {
            z = false;
        }
        ((DrawerLayout)view0).setWillNotDraw(z);
        ((DrawerLayout)view0).requestLayout();
        return kgq0.o();
    }
}

