import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

public enum gv {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    static {
        gv.e = arr_gv;
        ibsn.a(arr_gv);
    }

    public final void a(View view0, ViewGroup viewGroup0) {
        ibuq.f(view0, "view");
        ibuq.f(viewGroup0, "container");
        fm.ar(2);
        int v = this.ordinal();
        ViewGroup viewGroup1 = null;
        if(v != 0) {
            switch(v) {
                case 1: {
                    if(fm.ar(2)) {
                        Objects.toString(view0);
                    }
                    ViewParent viewParent0 = view0.getParent();
                    if((viewParent0 instanceof ViewGroup)) {
                        viewGroup1 = (ViewGroup)viewParent0;
                    }
                    if(viewGroup1 == null) {
                        if(fm.ar(2)) {
                            Objects.toString(view0);
                            Objects.toString(viewGroup0);
                        }
                        viewGroup0.addView(view0);
                    }
                    view0.setVisibility(0);
                    return;
                }
                case 2: {
                    if(fm.ar(2)) {
                        Objects.toString(view0);
                    }
                    view0.setVisibility(8);
                    return;
                }
                default: {
                    if(v != 3) {
                        throw new ibnq();
                    }
                    if(fm.ar(2)) {
                        Objects.toString(view0);
                    }
                    view0.setVisibility(4);
                    return;
                }
            }
        }
        ViewParent viewParent1 = view0.getParent();
        if((viewParent1 instanceof ViewGroup)) {
            viewGroup1 = (ViewGroup)viewParent1;
        }
        if(viewGroup1 != null) {
            if(fm.ar(2)) {
                Objects.toString(view0);
                Objects.toString(viewGroup1);
            }
            viewGroup1.removeView(view0);
        }
    }
}

