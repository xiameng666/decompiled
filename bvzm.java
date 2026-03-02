import android.view.View;
import com.google.android.gms.growth.uiflow.ui.widget.FeatureCardScreenContentBC25;

public final class bvzm implements ibts {
    public final int a;
    public final FeatureCardScreenContentBC25 b;

    public bvzm(int v, FeatureCardScreenContentBC25 featureCardScreenContentBC250) {
        this.a = v;
        this.b = featureCardScreenContentBC250;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((View)object0), "$this$addOnGlobalLayoutListener");
        View view0 = ((View)object0).getRootView().findViewById(this.a);
        if(view0 != null) {
            int v = view0.getHeight();
            View view1 = this.b.findViewById(0x7F0B23AD);  // id:uiflow_header_media_container
            ibuq.e(view1, "findViewById(...)");
            bvzl bvzl0 = new bvzl(v - bweb.a(view1));
            bwea.d(this.b, bvzl0);
        }
        return ibom.a;
    }
}

