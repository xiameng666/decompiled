import android.content.Context;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class buqa extends ConstraintLayout implements ejbp {
    public bung h;
    public cmec i;
    private ejas j;
    private boolean k;
    private final Context l;
    private final TextView m;
    private final LinearLayout n;

    public buqa(Context context0) {
        super(context0, null);
        if(!this.isInEditMode() && !this.k) {
            this.k = true;
            ((bunh)this.h()).a(this);
        }
        this.l = context0;
        LayoutInflater.from(context0).inflate(0x7F0E01E5, this, true);  // layout:cleanup_by_service_view
        this.m = (TextView)kfb.b(this, 0x7F0B22B8);  // id:title
        this.n = (LinearLayout)kfb.b(this, 0x7F0B1FBB);  // id:service_items_container
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.i();
    }

    @Override  // ejbo
    public final Object h() {
        return this.i().h();
    }

    public final ejas i() {
        if(this.j == null) {
            this.j = new ejas(this);
        }
        return this.j;
    }

    public final void j(hiup hiup0, tyb tyb0, bung bung0) {
        hiwq hiwq1;
        this.h = bung0;
        Spannable spannable0 = busk.a(hiup0.c);
        this.m.setText(spannable0);
        LinearLayout linearLayout0 = this.n;
        linearLayout0.removeAllViews();
        for(Object object0: hiup0.b) {
            hiuo hiuo0 = (hiuo)object0;
            ConstraintLayout constraintLayout0 = (ConstraintLayout)LayoutInflater.from(linearLayout0.getContext()).inflate(0x7F0E01E4, linearLayout0, false);  // layout:cleanup_by_service_item
            ImageView imageView0 = (ImageView)kfb.b(constraintLayout0, 0x7F0B1FBC);  // id:service_logo
            TextView textView0 = (TextView)kfb.b(constraintLayout0, 0x7F0B1FBD);  // id:service_name
            ((ImageView)kfb.b(constraintLayout0, 0x7F0B1FBA)).setImageDrawable(this.l.getDrawable(0x7F080AF9));  // id:service_action_icon
            textView0.setText(busk.a(hiuo0.c));
            String s = ghiq.a((hiuo0.b == null ? ghip.a : hiuo0.b)).b;
            if(!s.isEmpty()) {
                tyb0.h(s).k(imageView0);
            }
            if((hiuo0.d == null ? hiwr.a : hiuo0.d).b == 1) {
                hiwr hiwr0 = hiuo0.d == null ? hiwr.a : hiuo0.d;
                hiwq hiwq0 = (hiwr0.b == 1 ? ((hiwh)hiwr0.c) : hiwh.a).b;
                hiwq1 = hiwq0 == null ? hiwq.a : hiwq0;
            }
            else {
                hiwr hiwr1 = hiuo0.d;
                if((hiwr1 == null ? hiwr.a : hiwr1).b == 2) {
                    if(hiwr1 == null) {
                        hiwr1 = hiwr.a;
                    }
                    hiwq hiwq2 = (hiwr1.b == 2 ? ((hiwk)hiwr1.c) : hiwk.a).d;
                    hiwq1 = hiwq2 == null ? hiwq.a : hiwq2;
                }
                else {
                    hiwq1 = hiwq.a;
                }
            }
            cmeb cmeb0 = this.i.b(constraintLayout0, 180501);
            cmeb0.c(buqr.a(hiwq1));
            cmeb0.f();
            constraintLayout0.setOnClickListener(new bunf(this, cmeb0, hiwq1, hiuo0));
            linearLayout0.addView(constraintLayout0);
        }
    }
}

