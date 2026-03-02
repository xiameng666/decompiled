import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

final class khy extends View {
    final ViewGroup a;
    final kia b;

    public khy(kia kia0, Context context0, ViewGroup viewGroup0) {
        this.b = kia0;
        this.a = viewGroup0;
        super(context0);
    }

    @Override  // android.view.View
    protected final void onConfigurationChanged(Configuration configuration0) {
        Drawable drawable0 = this.a.getBackground();
        int v = (drawable0 instanceof ColorDrawable) ? ((ColorDrawable)drawable0).getColor() : 0;
        kia kia0 = this.b;
        if(kia0.e != v) {
            kia0.e = v;
            ArrayList arrayList0 = kia0.b;
            int v1 = arrayList0.size();
            while(true) {
                --v1;
                if(v1 < 0) {
                    break;
                }
                ((khu)arrayList0.get(v1)).c(v);
            }
        }
    }
}

