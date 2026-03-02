import android.app.Activity;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.lang.ref.WeakReference;

public final class aagv implements lqj {
    public final aahd a;

    public aagv(aahd aahd0) {
        this.a = aahd0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(hoju.p()) {
            aahd aahd0 = this.a;
            Activity activity0 = ((xob)aahd0.requireContext()).getContainerActivity();
            String s = ((aamj)object0).a;
            grwb grwb0 = ((aamj)object0).b;
            aauk aauk0 = aahd0.an;
            ibuq.f(activity0, "activity");
            if(!ibuq.m(aauk0.b, s)) {
                aauk0.d();
            }
            if(s != null) {
                aauk0.d = new WeakReference(activity0);
                aauk0.e.clear();
                aauk0.f.clear();
                View view0 = fhwh.a(activity0);
                fhvo fhvo0 = aauk0.a.a.a(grwb0.c);
                gqxw gqxw0 = grwb0.d == null ? gqxw.a : grwb0.d;
                ibuq.e(gqxw0, "getMetadata(...)");
                fhvo0.d(aauk.g(gqxw0));
                fhvo0.e(fhwp.b(s));
                fhvo0.f(fhvs.b);
                aauk0.a.h(view0, fhvo0);
                aauk0.b = s;
                aauk0.c = true;
            }
            aauk aauk1 = aahd0.an;
            SwipeRefreshLayout swipeRefreshLayout0 = aahd0.ai;
            grwb grwb1 = ((aamj)object0).c;
            ibuq.f(swipeRefreshLayout0, "view");
            if(aauk1.c) {
                fhvo fhvo1 = aauk1.a.a.a(grwb1.c);
                gqxw gqxw1 = grwb1.d == null ? gqxw.a : grwb1.d;
                ibuq.e(gqxw1, "getMetadata(...)");
                fhvo1.d(aauk.g(gqxw1));
                aauk1.a.h(swipeRefreshLayout0, fhvo1);
            }
        }
    }
}

