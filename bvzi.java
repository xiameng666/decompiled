import android.view.View;
import com.google.android.gms.growth.uiflow.ui.widget.FeatureCardScreenContent;

public final class bvzi implements ibts {
    public final int a;
    public final FeatureCardScreenContent b;

    public bvzi(int v, FeatureCardScreenContent featureCardScreenContent0) {
        this.a = v;
        this.b = featureCardScreenContent0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((View)object0), "$this$addOnGlobalLayoutListener");
        View view0 = ((View)object0).getRootView().findViewById(this.a);
        if(view0 != null) {
            int v = view0.getHeight();
            View view1 = this.b.findViewById(0x7F0B23AD);  // id:uiflow_header_media_container
            ibuq.e(view1, "findViewById(...)");
            bvzk bvzk0 = new bvzk(v - bweb.a(view1));
            bwea.d(this.b, bvzk0);
        }
        return ibom.a;
    }
}

