import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import j..util.Objects;

public final class buog implements ibts {
    public final hivx a;
    public final bupl b;

    public buog(hivx hivx0, bupl bupl0) {
        this.a = hivx0;
        this.b = bupl0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((busn)object0), "it");
        bunz bunz0 = new bunz(this.b);
        hivx hivx0 = this.a;
        if((hivx0.b & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).f.isEmpty()) {
            ((busn)object0).k.setText((hivx0.f == null ? hivw.a : hivx0.f).f);
        }
        if((hivx0.b & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).e.isEmpty()) {
            ((busn)object0).j.setText((hivx0.f == null ? hivw.a : hivx0.f).e);
        }
        int v = hivx0.b;
        if((v & 1) == 0) {
            if((v & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).d.isEmpty()) {
                ((busn)object0).l.setText((hivx0.f == null ? hivw.a : hivx0.f).d);
            }
            if((hivx0.b & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).b.isEmpty()) {
                ((busn)object0).i.setText((hivx0.f == null ? hivw.a : hivx0.f).b);
            }
        }
        else {
            View view0 = LayoutInflater.from(((busn)object0).getContext()).inflate(0x7F0E0621, ((busn)object0).m, false);  // layout:offer_tag_view
            TextView textView0 = (TextView)kfb.b(view0, 0x7F0B1A75);  // id:offer_tag
            hivv hivv0 = hivx0.e == null ? hivv.a : hivx0.e;
            ghim ghim0 = hivv0.b == null ? ghim.a : hivv0.b;
            String s = (hivx0.f == null ? hivw.a : hivx0.f).c;
            textView0.setText((hivx0.e == null ? hivv.a : hivx0.e).c);
            ((busn)object0).m.removeAllViews();
            ((busn)object0).m.addView(view0);
            ((busn)object0).m.setVisibility(0);
            ghik ghik0 = ghin.b(ghim0);
            if(!Objects.equals(ghik0, ghik.a)) {
                Spannable spannable0 = busk.a(ghik0.b);
                ((busn)object0).l.setText(spannable0);
            }
            if(!s.isEmpty()) {
                ((busn)object0).i.setText(s);
            }
        }
        ((busn)object0).n.b(((busn)object0).h, 0x1CE4B).f();
        cmeb cmeb0 = ((busn)object0).n.b(((busn)object0).i, 0x1CE4C);
        cmeb0.f();
        buso buso0 = new buso(cmeb0, bunz0);
        ((busn)object0).i.setOnClickListener(buso0);
        ((busn)object0).j.setVisibility(8);
        return ibom.a;
    }
}

