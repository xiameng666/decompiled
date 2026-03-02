import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.AdviceOverflowCardView;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class zry extends aaep {
    public final aace t;

    @AssistedInject
    public zry(@Assisted View view0, aace aace0) {
        ibuq.f(view0, "view");
        ibuq.f(aace0, "adviceOverflowClickListener");
        super(view0);
        this.t = aace0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        boolean z1;
        int v3;
        ibuq.f(aaem0, "overflowItem");
        if((aaem0 instanceof zno)) {
            View view0 = this.a;
            if((view0 instanceof AdviceOverflowCardView)) {
                String s = ((zno)aaem0).d;
                ibuq.f(((zno)aaem0).b, "expandTitle");
                ibuq.f(s, "collapseTitle");
                ((AdviceOverflowCardView)view0).m().setText(((zno)aaem0).b);
                if(hoju.j()) {
                    TextView textView0 = ((AdviceOverflowCardView)view0).l();
                    if(textView0 != null) {
                        textView0.setText(s);
                    }
                }
                String s1 = String.valueOf(((zno)aaem0).f);
                ibuq.f(s1, "count");
                ((AdviceOverflowCardView)view0).n().setText(s1);
                ((AdviceOverflowCardView)view0).setOnClickListener(new zrw(this, aaem0));
                if(hoju.j()) {
                    boolean z = ((zno)aaem0).e;
                    if(hoju.j()) {
                        ViewParent viewParent0 = ((AdviceOverflowCardView)view0).o().getParent();
                        ibuq.d(viewParent0, "null cannot be cast to non-null type android.view.ViewGroup");
                        int v = ((ViewGroup)viewParent0).getPaddingStart();
                        int v1 = ((ViewGroup)viewParent0).getPaddingTop();
                        int v2 = ((ViewGroup)viewParent0).getPaddingEnd();
                        if(z) {
                            v3 = ((AdviceOverflowCardView)view0).j();
                            z1 = true;
                        }
                        else {
                            v3 = ((AdviceOverflowCardView)view0).i();
                            z1 = false;
                        }
                        ((ViewGroup)viewParent0).setPadding(v, v1, v2, v3);
                        Object object0 = ((AdviceOverflowCardView)view0).h.a();
                        ibuq.e(object0, "getValue(...)");
                        ViewGroup.LayoutParams viewGroup$LayoutParams0 = ((Space)object0).getLayoutParams();
                        viewGroup$LayoutParams0.height = z1 ? ((AdviceOverflowCardView)view0).i() : ((AdviceOverflowCardView)view0).j();
                        fyus fyus0 = new fyus(((AdviceOverflowCardView)view0).o().C());
                        if(z) {
                            fyus0.h(((AdviceOverflowCardView)view0).g());
                            fyus0.f(((AdviceOverflowCardView)view0).g());
                            fyus0.b(((AdviceOverflowCardView)view0).h());
                            fyus0.d(((AdviceOverflowCardView)view0).h());
                        }
                        else {
                            fyus0.h(((AdviceOverflowCardView)view0).h());
                            fyus0.f(((AdviceOverflowCardView)view0).h());
                            fyus0.b(((AdviceOverflowCardView)view0).g());
                            fyus0.d(((AdviceOverflowCardView)view0).g());
                        }
                        ((AdviceOverflowCardView)view0).o().mu(new fyut(fyus0));
                        if(z) {
                            ((AdviceOverflowCardView)view0).m().setVisibility(8);
                            TextView textView1 = ((AdviceOverflowCardView)view0).l();
                            if(textView1 != null) {
                                textView1.setVisibility(0);
                            }
                            ((AdviceOverflowCardView)view0).n().setVisibility(8);
                        }
                        else {
                            ((AdviceOverflowCardView)view0).m().setVisibility(0);
                            TextView textView2 = ((AdviceOverflowCardView)view0).l();
                            if(textView2 != null) {
                                textView2.setVisibility(8);
                            }
                            ((AdviceOverflowCardView)view0).n().setVisibility(0);
                        }
                        if(z) {
                            ((AdviceOverflowCardView)view0).k().setRotation(-180.0f);
                        }
                        else {
                            ((AdviceOverflowCardView)view0).k().setRotation(0.0f);
                        }
                    }
                    if(hoju.j()) {
                        pao.b(((AdviceOverflowCardView)view0), new pat(null));
                    }
                }
                kfe.j(((AdviceOverflowCardView)view0), new zrx(aaem0));
            }
        }
    }
}

