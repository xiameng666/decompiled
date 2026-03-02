import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.growth.ui.widget.pageindicator.PageIndicator;
import com.google.android.gms.growth.uiflow.ui.widget.PagerControls;

public final class bvyi extends pdy {
    final bvyh a;
    final bvzv b;

    public bvyi(bvzv bvzv0, bvyh bvyh0) {
        this.b = bvzv0;
        this.a = bvyh0;
        super();
    }

    @Override  // pdy
    public final void b(int v) {
        bvzv bvzv0 = this.b;
        bvvj bvvj0 = bvzv0.a;
        int v1 = this.a.b();
        if(bvvj0.b != v || bvvj0.a != v1) {
            bvvj0.b = v;
            bvvj0.a = v1;
            PageIndicator pageIndicator0 = bvvj0.c;
            if(pageIndicator0 != null) {
                pageIndicator0.b(v1);
                pageIndicator0.a(((float)v));
            }
        }
        PagerControls pagerControls0 = bvzv0.b;
        if(pagerControls0 != null) {
            View view0 = pagerControls0.c;
            Button button0 = null;
            if(view0 == null) {
                ibuq.j("prevButton");
                view0 = null;
            }
            String s = "";
            view0.setVisibility((v > 0 || pagerControls0.d ? 0 : 8));
            if(pagerControls0.g != null && pagerControls0.g.length() != 0 || pagerControls0.h != null && pagerControls0.h.length() != 0) {
                if(pagerControls0.d) {
                    View view1 = pagerControls0.b;
                    if(view1 == null) {
                        ibuq.j("nextButton");
                        view1 = null;
                    }
                    if((view1 instanceof Button)) {
                        button0 = (Button)view1;
                    }
                    if(button0 != null) {
                        String s2 = v >= v1 - 1 ? pagerControls0.h : pagerControls0.g;
                        if(s2 != null) {
                            s = s2;
                        }
                        button0.setText(s);
                    }
                }
                else {
                    TextView textView0 = pagerControls0.f;
                    if(textView0 != null) {
                        String s1 = v >= v1 - 1 ? pagerControls0.h : pagerControls0.g;
                        if(s1 != null) {
                            s = s1;
                        }
                        textView0.setText(s);
                    }
                }
            }
        }
    }
}

