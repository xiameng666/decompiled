import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout.LayoutParams;
import com.google.android.flexbox.FlexboxLayout;

public final class bunp implements ibts {
    public final hivr a;
    public final tyb b;
    public final ibts c;

    public bunp(hivr hivr0, tyb tyb0, ibts ibts0) {
        this.a = hivr0;
        this.b = tyb0;
        this.c = ibts0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hiwq hiwq1;
        float f;
        ibuq.f(((buqd)object0), "it");
        hixj hixj0 = this.a.c == null ? hixj.a : this.a.c;
        ((buqd)object0).m = new buoa(this.c);
        Spannable spannable0 = busk.a(hixj0.d);
        ((buqd)object0).h.setText(spannable0);
        ((buqd)object0).h.setVisibility(0);
        View view0 = ((buqd)object0).j;
        TextView textView0 = (TextView)kfb.b(view0, 0x7F0B120D);  // id:empty_state_title
        if((hixj0.b & 1) != 0 && !(hixj0.e == null ? hixh.a : hixj0.e).b.isEmpty()) {
            textView0.setText(busk.a((hixj0.e == null ? hixh.a : hixj0.e).b));
        }
        TextView textView1 = (TextView)kfb.b(view0, 0x7F0B120C);  // id:empty_state_description
        if((hixj0.b & 1) != 0 && !(hixj0.e == null ? hixh.a : hixj0.e).c.isEmpty()) {
            textView1.setText(busk.a((hixj0.e == null ? hixh.a : hixj0.e).c));
        }
        if(hixj0.c.isEmpty()) {
            view0.setVisibility(0);
            ((buqd)object0).i.setVisibility(8);
            return ibom.a;
        }
        FlexboxLayout flexboxLayout0 = ((buqd)object0).i;
        flexboxLayout0.removeAllViews();
        ((buqd)object0).k = hixj0.c.size();
        for(Object object1: hixj0.c) {
            hixi hixi0 = (hixi)object1;
            FrameLayout frameLayout0 = (FrameLayout)LayoutInflater.from(flexboxLayout0.getContext()).inflate(0x7F0E0AD3, flexboxLayout0, false);  // layout:suggested_item_widget
            ImageView imageView0 = (ImageView)kfb.b(frameLayout0, 0x7F0B16B9);  // id:icon
            TextView textView2 = (TextView)kfb.b(frameLayout0, 0x7F0B22B8);  // id:title
            TextView textView3 = (TextView)kfb.b(frameLayout0, 0x7F0B20FA);  // id:storage_used
            TextView textView4 = (TextView)kfb.b(frameLayout0, 0x7F0B106B);  // id:cta
            textView2.setText(busk.a(hixi0.c));
            textView3.setText(busk.a(hixi0.d));
            textView4.setText(busk.a(hixi0.e));
            String s = ghiq.a((hixi0.b == null ? ghip.a : hixi0.b)).b;
            if(!s.isEmpty()) {
                this.b.h(s).k(imageView0);
            }
            FlexboxLayout.LayoutParams flexboxLayout$LayoutParams0 = (FlexboxLayout.LayoutParams)frameLayout0.getLayoutParams();
            if(flexboxLayout$LayoutParams0 != null) {
                if(((buqd)object0).getResources().getConfiguration().orientation != 2) {
                    f = 0.499f;
                }
                else if(((buqd)object0).k <= 3) {
                    f = 0.333f;
                }
                else {
                    f = 0.249f;
                }
                flexboxLayout$LayoutParams0.e = f;
                frameLayout0.setLayoutParams(flexboxLayout$LayoutParams0);
            }
            if((hixi0.f == null ? hiwr.a : hixi0.f).b == 1) {
                hiwr hiwr0 = hixi0.f == null ? hiwr.a : hixi0.f;
                hiwq hiwq0 = (hiwr0.b == 1 ? ((hiwh)hiwr0.c) : hiwh.a).b;
                hiwq1 = hiwq0 == null ? hiwq.a : hiwq0;
            }
            else {
                hiwq1 = hiwq.a;
            }
            cmeb cmeb0 = ((buqd)object0).l.b(frameLayout0, 180502);
            cmeb0.c(buqr.a(hiwq1));
            cmeb0.f();
            frameLayout0.setOnClickListener(new buqj(((buqd)object0), cmeb0, hiwq1, hixi0));
            flexboxLayout0.addView(frameLayout0);
        }
        flexboxLayout0.getViewTreeObserver().addOnGlobalLayoutListener(new buqk(((buqd)object0)));
        for(int v = 0; v < flexboxLayout0.getChildCount(); ++v) {
            View view1 = flexboxLayout0.getChildAt(v);
            FlexboxLayout.LayoutParams flexboxLayout$LayoutParams1 = (FlexboxLayout.LayoutParams)view1.getLayoutParams();
            flexboxLayout$LayoutParams1.height = -2;
            view1.setLayoutParams(flexboxLayout$LayoutParams1);
        }
        flexboxLayout0.setVisibility(0);
        return ibom.a;
    }
}

