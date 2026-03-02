import android.view.View;
import android.view.ViewParent;

public final class jnq {
    public static final View a(hfb hfb0) {
        View view0 = ien.d(hfb0.r).i();
        if(view0 != null) {
            return view0;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final boolean b(View view0, View view1) {
        for(ViewParent viewParent0 = view1.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 == view0.getParent()) {
                return true;
            }
        }
        return false;
    }
}

