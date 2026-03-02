import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;

public final class furz implements fura {
    private static final SparseArray a;

    static {
        SparseArray sparseArray0 = new SparseArray();
        sparseArray0.put(4, "SYSTEM_UI_FLAG_FULLSCREEN");
        sparseArray0.put(2, "SYSTEM_UI_FLAG_HIDE_NAVIGATION");
        sparseArray0.put(0x800, "SYSTEM_UI_FLAG_IMMERSIVE");
        sparseArray0.put(0x1000, "SYSTEM_UI_FLAG_IMMERSIVE_STICKY");
        sparseArray0.put(0x400, "SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN");
        sparseArray0.put(0x200, "SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION");
        sparseArray0.put(0x100, "SYSTEM_UI_FLAG_LAYOUT_STABLE");
        sparseArray0.put(16, "SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR");
        sparseArray0.put(0x2000, "SYSTEM_UI_FLAG_LIGHT_STATUS_BAR");
        sparseArray0.put(1, "SYSTEM_UI_FLAG_LOW_PROFILE");
        furz.a = sparseArray0;
    }

    @Override  // fura
    public final void a(fusj fusj0, View view0) {
        if(view0.getSystemUiVisibility() != 0) {
            int v = view0.getSystemUiVisibility();
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; true; ++v1) {
                SparseArray sparseArray0 = furz.a;
                if(v1 >= sparseArray0.size()) {
                    break;
                }
                int v2 = sparseArray0.keyAt(v1);
                if((v & v2) == v2) {
                    arrayList0.add(((String)sparseArray0.valueAt(v1)));
                }
            }
            fusj0.b("systemUiVisibility", TextUtils.join(" | ", arrayList0));
        }
        fusj0.b("isLaidOut", String.valueOf(view0.isLaidOut()));
        fusj0.b("isLayoutRequested", String.valueOf(view0.isLayoutRequested()));
        if((view0.getParent() instanceof CoordinatorLayout)) {
            fusj0.b("coordinatorLayout_behavior", String.valueOf(((jto)view0.getLayoutParams()).a));
        }
        if((view0.getBackground() instanceof ColorDrawable)) {
            fusj0.b("backgroundColor", String.format("#%08X", ((ColorDrawable)view0.getBackground()).getColor()));
        }
        else if(view0.getBackground() != null) {
            fusj0.b("background", view0.getBackground().toString());
        }
        fusj0.b("layerType", String.valueOf(view0.getLayerType()));
    }
}

