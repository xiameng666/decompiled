import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j..util.Objects;

public final class buly implements Runnable {
    public final buma a;

    public buly(buma buma0) {
        this.a = buma0;
    }

    @Override
    public final void run() {
        String s;
        buma buma0 = this.a;
        if(buma0.getContext() == null) {
            return;
        }
        if(buma0.ak != null) {
            bumj bumj0 = (bumj)buma0.ai.e.ij();
            if((bumj0 instanceof bumi)) {
                hivx hivx0 = ((bumi)bumj0).a;
                if(hivx0.d) {
                    buma0.at = (TextView)kfb.b(buma0.ak, 0x7F0B2403);  // id:upsell_title
                    buma0.as = (TextView)kfb.b(buma0.ak, 0x7F0B23F6);  // id:upsell_description
                    buma0.ar = (ImageView)kfb.b(buma0.ak, 0x7F0B23F8);  // id:upsell_image
                    if((hivx0.b & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).g.isEmpty()) {
                        buma0.at.setText((hivx0.f == null ? hivw.a : hivx0.f).g);
                    }
                    if((hivx0.b & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).e.isEmpty()) {
                        buma0.aq.setText((hivx0.f == null ? hivw.a : hivx0.f).e);
                    }
                    if((hivx0.b & 4) != 0 && !buma0.z()) {
                        s = ghiq.a((hivx0.g == null ? ghip.a : hivx0.g)).b;
                    }
                    else {
                        s = (hivx0.b & 8) == 0 || !buma0.z() ? "" : ghiq.a((hivx0.h == null ? ghip.a : hivx0.h)).b;
                    }
                    if(!gfta.c(s)) {
                        buma0.aB.h(s).k(buma0.ar);
                    }
                    if((hivx0.b & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).h.isEmpty()) {
                        buma0.ar.setContentDescription((hivx0.f == null ? hivw.a : hivx0.f).h);
                    }
                    if((hivx0.b & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).i.isEmpty()) {
                        buma0.as.setText((hivx0.f == null ? hivw.a : hivx0.f).i);
                    }
                    int v = hivx0.b;
                    if((v & 1) == 0) {
                        if((v & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).b.isEmpty()) {
                            buma0.au.setText((hivx0.f == null ? hivw.a : hivx0.f).b);
                        }
                        if((hivx0.b & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).d.isEmpty()) {
                            buma0.as.setText((hivx0.f == null ? hivw.a : hivx0.f).d);
                        }
                    }
                    else {
                        LinearLayout linearLayout0 = (LinearLayout)kfb.b(buma0.ak, 0x7F0B1A76);  // id:offer_tag_container
                        Context context0 = buma0.ak.getContext();
                        gftb.check(context0);
                        View view0 = LayoutInflater.from(context0).inflate(0x7F0E0621, linearLayout0, false);  // layout:offer_tag_view
                        ((TextView)kfb.b(view0, 0x7F0B1A75)).setText((hivx0.e == null ? hivv.a : hivx0.e).c);  // id:offer_tag
                        linearLayout0.removeAllViews();
                        linearLayout0.addView(view0);
                        linearLayout0.setVisibility(0);
                        hivv hivv0 = hivx0.e == null ? hivv.a : hivx0.e;
                        ghik ghik0 = ghin.b((hivv0.b == null ? ghim.a : hivv0.b));
                        if(!Objects.equals(ghik0, ghik.a)) {
                            buma0.as.setText(busk.a(ghik0.b));
                        }
                        if((hivx0.b & 2) != 0 && !(hivx0.f == null ? hivw.a : hivx0.f).c.isEmpty()) {
                            buma0.au.setText((hivx0.f == null ? hivw.a : hivx0.f).c);
                        }
                    }
                    buma0.au.setVisibility(0);
                    buma0.aq.setVisibility(0);
                    buma0.au.setOnClickListener(new bulr(buma0));
                    buma0.aq.setOnClickListener(new buls(buma0));
                    buma0.aF = 4;
                    buma0.A(4);
                    return;
                }
            }
        }
        buma0.dismissAllowingStateLoss();
    }
}

