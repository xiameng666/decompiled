import android.content.res.TypedArray;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.gms.growth.uiflow.ui.widget.FeatureCardScreenContentBC25;

public final class bvzn implements ibts {
    public final TypedArray a;
    public final FeatureCardScreenContentBC25 b;

    public bvzn(TypedArray typedArray0, FeatureCardScreenContentBC25 featureCardScreenContentBC250) {
        this.a = typedArray0;
        this.b = featureCardScreenContentBC250;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((jtc)object0), "$this$modifyConstraints");
        TypedArray typedArray0 = this.a;
        String s = typedArray0.getString(2);
        if(s != null) {
            ((jtc)object0).o(0x7F0B23AD, s);  // id:uiflow_header_media_container
        }
        if(typedArray0.getBoolean(0, false)) {
            View view0 = ((ScrollView)this.b.findViewById(0x7F0B138A)).getChildAt(0);  // id:feature_card_content_scroll_view
            bwea.b(((jtc)object0), 0x7F0B138A, -2);  // id:feature_card_content_scroll_view
            ibuq.c(view0);
            bwdz.i(view0, 0);
        }
        return ibom.a;
    }
}

