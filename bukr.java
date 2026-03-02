import android.os.Looper;
import android.view.LayoutInflater;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.gms.googleone.smui.selection.ItemCell;
import com.google.android.material.chip.Chip;

public final class bukr implements lqj {
    public final bukv a;

    public bukr(bukv bukv0) {
        this.a = bukv0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        hiwq hiwq0;
        bukv bukv0 = this.a;
        int v = 2;
        if((((bulf)object0) instanceof buld)) {
            hivl hivl0 = ((buld)(((bulf)object0))).a;
            gftb.check(hivl0);
            hivk hivk0 = hivl0.b == null ? hivk.a : hivl0.b;
            String s = ghin.b((hivk0.c == null ? ghim.a : hivk0.c)).b;
            if(!gfta.c(s)) {
                bukv0.ah = s;
            }
            bukv0.ak = hivl0.h == null ? hivg.a : hivl0.h;
            hivk hivk1 = hivl0.b;
            bukv0.al = (hivk1 == null ? hivk.a : hivk1).l;
            bukv0.am = (hivk1 == null ? hivk.a : hivk1).m;
            bukv0.an = (hivk1 == null ? hivk.a : hivk1).n;
            bukv0.ao = (hivk1 == null ? hivk.a : hivk1).o;
            bukv0.ap = (hivk1 == null ? hivk.a : hivk1).p;
            if(hivk1 == null) {
                hivk1 = hivk.a;
            }
            bukv0.aq = hivk1.q;
            bukv0.ar = hivl0.j;
            if(!(hivl0.i == null ? hivf.a : hivl0.i).b.isEmpty()) {
                bukv0.d.h = (hivl0.i == null ? hivf.a : hivl0.i).b;
            }
            if(bukv0.ak != null && !bukv0.ak.l.isEmpty()) {
                bukv0.ax.setText(bukv0.ak.l);
            }
            if(hivl0.c.isEmpty()) {
                hive hive0 = hivl0.g == null ? hive.a : hivl0.g;
                TextView textView0 = (TextView)kfb.b(bukv0.as, 0x7F0B120D);  // id:empty_state_title
                TextView textView1 = (TextView)kfb.b(bukv0.as, 0x7F0B120C);  // id:empty_state_description
                textView0.setText(hive0.b);
                textView1.setText(hive0.c);
                bukv0.au.setVisibility(0);
                bukv0.av.setVisibility(0);
                bukv0.J(false);
            }
            else {
                bukv0.au.setVisibility(8);
                switch(bukv0.d.i) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        bukv0.av.setVisibility(0);
                        bukv0.J(true);
                        break;
                    }
                    default: {
                        bukv0.av.setVisibility(8);
                        bukv0.J(true);
                    }
                }
            }
            if(gfta.c(bukv0.aF.d)) {
                if(!(hivl0.b == null ? hivk.a : hivl0.b).d.isEmpty()) {
                    Chip chip0 = new Chip(bukv0.requireContext());
                    bukv0.at.removeAllViews();
                    for(Object object1: (hivl0.b == null ? hivk.a : hivl0.b).d) {
                        hivh hivh0 = (hivh)object1;
                        if(!hivh0.d) {
                            continue;
                        }
                        hiwq0 = hivh0.b;
                        if(hiwq0 == null) {
                            hiwq0 = hiwq.a;
                        }
                        goto label_55;
                    }
                    hiwq0 = hiwq.a;
                label_55:
                    for(Object object2: (hivl0.b == null ? hivk.a : hivl0.b).d) {
                        Chip chip1 = (Chip)LayoutInflater.from(bukv0.at.getContext()).inflate(0x7F0E01DF, bukv0.at, false);  // layout:category_chips_item
                        chip1.setText(((hivh)object2).c);
                        chip1.setOnClickListener(new bukf(bukv0, chip1, ((hivh)object2)));
                        bukv0.at.addView(chip1);
                        hiwq hiwq1 = ((hivh)object2).b;
                        if(hiwq1 == null) {
                            hiwq1 = hiwq.a;
                        }
                        if(((ProtoLiteMessage)hiwq0).equals(hiwq1)) {
                            bukv0.at.a(chip1.getId());
                            bukv0.ai = chip1.getId();
                            chip1.setClickable(false);
                            chip0 = chip1;
                        }
                    }
                    HorizontalScrollView horizontalScrollView0 = (HorizontalScrollView)kfb.b(bukv0.as, 0x7F0B0E7A);  // id:category_chips_scroll_view
                    bukv0.at.post(new bukm(horizontalScrollView0, chip0));
                    bukv0.at.setVisibility(0);
                }
                hivk hivk2 = hivl0.b == null ? hivk.a : hivl0.b;
                hiwx hiwx0 = hivk2.f == null ? hiwx.a : hivk2.f;
                if(bukv0.d.i == 0) {
                    int v1 = hiwx0.c;
                    if(hiww.a(v1) == 3) {
                        bukv0.G();
                    }
                    else if(hiww.a(v1) == 4) {
                        bukv0.F();
                    }
                }
                bukv0.aB.setOnClickListener(new bukq(bukv0));
                if(!hivl0.c.isEmpty() && hiwx0.b.size() >= 2) {
                    bukv0.aB.setVisibility(0);
                }
                else {
                    bukv0.aB.setVisibility(8);
                }
                hfuo hfuo0 = (hivl0.b == null ? hivk.a : hivl0.b).e;
                if(!hfuo0.isEmpty() && !hivl0.c.isEmpty()) {
                    if(!gfta.c(bukv0.ao)) {
                        bukv0.aC.setContentDescription(bukv0.ao);
                    }
                    bukv0.aC.setCompoundDrawablesWithIntrinsicBounds(0x7F080C2F, 0, 0, 0);  // drawable:quantum_gm_ic_sort_vd_theme_24
                    cmeb cmeb0 = bukv0.aM.b(bukv0.aC, 180582);
                    cmeb0.c(buqr.a(bukv0.aF.a));
                    cmeb0.f();
                    bukv0.aC.setOnClickListener(new bukd(bukv0, cmeb0, hfuo0, hivl0));
                    bukv0.aC.setVisibility(0);
                }
                else {
                    bukv0.aC.setVisibility(8);
                }
                hfuo hfuo1 = (hivl0.b == null ? hivk.a : hivl0.b).g;
                if(hfuo1.isEmpty()) {
                    bukv0.aD.setVisibility(8);
                }
                else {
                    if(!gfta.c(bukv0.an)) {
                        bukv0.aD.setContentDescription(bukv0.an);
                    }
                    bukv0.aD.setCompoundDrawablesWithIntrinsicBounds(0x7F080B7A, 0, 0, 0);  // drawable:quantum_gm_ic_filter_list_vd_theme_24
                    cmeb cmeb1 = bukv0.aM.b(bukv0.aD, 180579);
                    cmeb1.c(buqr.a(bukv0.aF.a));
                    cmeb1.f();
                    bukv0.aD.setOnClickListener(new bukh(bukv0, cmeb1, hfuo1, hivl0));
                    bukv0.aD.setVisibility(0);
                }
                bukv0.aj = ((hivl0.b == null ? hivk.a : hivl0.b).b & 8) != 0;
                new clht(Looper.getMainLooper()).postDelayed(new buks(bukv0), 50L);
                bukv0.ag = hivl0.e == null ? hivd.a : hivl0.e;
                bukv0.I(hgeg.i, hjaw.b);
            }
            else {
                bukv0.I(hgeg.l, hjaw.b);
            }
            ggdy ggdy0 = new ggdy();
            for(Object object3: hivl0.c) {
                ggdy0.i(new ItemCell(bukv0.aF.a, ((hiwu)object3)));
            }
            if(gfta.c(bukv0.aF.d)) {
                bukv0.d.n(ggdy0.h());
            }
            else {
                bumw bumw0 = bukv0.d;
                gged_interceptors gged0 = ggdy0.h();
                bumw0.f.addAll(gged0);
                bumw0.w(bumw0.f.size(), ((ggna)gged0).c);
            }
            bukv0.az.setVisibility(8);
            bukv0.aw.setVisibility(0);
            bukv0.ay.setVisibility(8);
            int v2 = bukv0.d.b();
            bukv0.aA.setText(bukv0.as.getContext().getString(0x7F150D30, new Object[]{v2}));  // string:details_items_count "Showing (%1$d)"
            if(!bukv0.aE.hasOnClickListeners()) {
                bukv0.aE.setOnClickListener(new buke(bukv0));
            }
            if(!bukv0.b.c()) {
                v = 1;
            }
            bukv0.N(v);
            buli buli0 = bukv0.aF;
            String s1 = hivl0.d;
            ibuq.f(s1, "<set-?>");
            buli0.d = s1;
            if(!gfta.c(bukv0.aF.d)) {
                cmeb cmeb2 = bukv0.aM.b(bukv0.ax, 180580);
                cmeb2.c(buqr.a(bukv0.aF.a));
                cmeb2.f();
                bukv0.ax.setOnClickListener(new bukt(bukv0, cmeb2));
                bukv0.ax.setVisibility(0);
            }
            bukv0.M(3);
            return;
        }
        if((((bulf)object0) instanceof bulb)) {
            ((ggtj)((ggtj)((ggtj)bukv.a.j()).s(((bulb)(((bulf)object0))).a)).ar(5686)).x("Failed to details page rpc");
            bukv0.M(2);
            bukv0.I((gfta.c(bukv0.aF.d) ? hgeg.i : hgeg.l), hjaw.f);
        }
    }
}

