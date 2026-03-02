import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.growth.ui.widget.pageindicator.PageIndicator;
import com.google.android.gms.growth.uiflow.ui.widget.PagerControls;
import com.google.android.gms.growth.uiflow.ui.widget.ViewPagerExtended;
import java.util.List;

public final class bvyg implements Runnable {
    public final bvym a;
    public final List b;
    public final ViewPagerExtended c;
    public final PagerControls d;
    public final hgnk e;
    public final ViewGroup f;

    public bvyg(bvym bvym0, List list0, ViewPagerExtended viewPagerExtended0, PagerControls pagerControls0, hgnk hgnk0, ViewGroup viewGroup0) {
        this.a = bvym0;
        this.b = list0;
        this.c = viewPagerExtended0;
        this.d = pagerControls0;
        this.e = hgnk0;
        this.f = viewGroup0;
    }

    @Override
    public final void run() {
        ibuq.c(this.b);
        bvym bvym0 = this.a;
        du du0 = bvym0.h;
        bvyh bvyh0 = new bvyh(du0, this.b);
        ViewPagerExtended viewPagerExtended0 = this.c;
        bvzv bvzv0 = new bvzv(bvym0, viewPagerExtended0);
        PagerControls pagerControls0 = this.d;
        bvzv0.b = pagerControls0;
        PageIndicator pageIndicator0 = pagerControls0.a;
        View view0 = null;
        if(pageIndicator0 != null) {
            bvvj bvvj0 = bvzv0.a;
            bvvj bvvj1 = pageIndicator0.b;
            if(bvvj1 != null) {
                bvvj1.c = null;
            }
            pageIndicator0.b = bvvj0;
            bvvj bvvj2 = pageIndicator0.b;
            if(bvvj2 != null) {
                bvvj2.c = pageIndicator0;
                pageIndicator0.b(bvvj2.a);
                pageIndicator0.a(((float)pageIndicator0.b.b));
            }
        }
        View view1 = pagerControls0.c;
        if(view1 == null) {
            ibuq.j("prevButton");
            view1 = null;
        }
        view1.setOnClickListener(new bvzt(pagerControls0, bvzv0));
        View view2 = pagerControls0.b;
        if(view2 == null) {
            ibuq.j("nextButton");
        }
        else {
            view0 = view2;
        }
        hgnk hgnk0 = this.e;
        view0.setOnClickListener(new bvzu(pagerControls0, bvzv0));
        bvyi bvyi0 = new bvyi(bvzv0, bvyh0);
        ViewPager2 viewPager20 = viewPagerExtended0.a;
        viewPager20.e(bvyi0);
        String s = hgnk0.d;
        ibuq.e(s, "getNextButtonText(...)");
        if(s.length() <= 0) {
            String s1 = hgnk0.e;
            ibuq.e(s1, "getLastNextButtonText(...)");
            if(s1.length() > 0) {
                goto label_42;
            }
        }
        else {
        label_42:
            String s2 = hgnk0.d;
            String s3 = hgnk0.e;
            pagerControls0.g = s2;
            if(s3 != null && s3.length() != 0) {
                s2 = s3;
            }
            pagerControls0.h = s2;
        }
        viewPagerExtended0.b = new bvyj(bvym0, viewPagerExtended0);
        lps lps0 = du0.getViewLifecycleOwner();
        ibuq.e(lps0, "getViewLifecycleOwner(...)");
        bvyk bvyk0 = new bvyk(viewPagerExtended0, bvym0);
        bvym0.a.getOnBackPressedDispatcher().c(lps0, bvyk0);
        Object object0 = bvym0.a.getSystemService("accessibility");
        ibuq.d(object0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if(((AccessibilityManager)object0).isEnabled()) {
            List list0 = ((AccessibilityManager)object0).getEnabledAccessibilityServiceList(1);
            ibuq.e(list0, "getEnabledAccessibilityServiceList(...)");
            if(!list0.isEmpty()) {
                bvym0.b = false;
                viewPager20.o();
            }
        }
        viewPager20.f(bvyh0);
        if(bvym0.i.g()) {
            hneo hneo0 = (hneo)this.f.findViewById(0x7F0B1198);  // id:dots_indicator
            ibuq.f(viewPager20, "viewPager2");
            if(hneo0 == null) {
                ibuq.i("baseDotsIndicator");
            }
            ibuq.f(viewPager20, "attachable");
            tk tk0 = viewPager20.d();
            if(tk0 == null) {
                throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
            }
            hnev hnev0 = new hnev(hneo0);
            ibuq.f(viewPager20, "attachable");
            tk0.A(new hney(hnev0));
            ibuq.f(viewPager20, "attachable");
            hneo0.g = new hnex(viewPager20);
            hneo0.g();
            hneo0.setImportantForAccessibility(4);
        }
    }
}

