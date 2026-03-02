import android.app.Dialog;
import android.view.View.OnClickListener;
import android.view.View;

public final class bulv implements View.OnClickListener {
    public final buma a;

    public bulv(buma buma0) {
        this.a = buma0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        buma buma0 = this.a;
        buma0.aD.e(gltz.e, view0, buqr.b((buma0.aj.d == null ? hiwq.a : buma0.aj.d)));
        buma0.an = buma0.ak.getWidth();
        buma0.ao = buma0.ak.getHeight();
        Dialog dialog0 = buma0.getDialog();
        if(dialog0 != null) {
            dialog0.setCanceledOnTouchOutside(false);
        }
        buma0.aA.a(bbdg.xz);
        hiwq hiwq0 = buma0.aj.d == null ? hiwq.a : buma0.aj.d;
        buca buca0 = buma0.aE.a(hjbx.f, hgeg.j, (hiwo.b(hiwq0.c) == null ? hiwo.l : hiwo.b(hiwq0.c)).name());
        buca0.b(buma0.ay.a());
        hiwq hiwq1 = buma0.aj.d == null ? hiwq.a : buma0.aj.d;
        buca0.a(buqr.c((hiwo.b(hiwq1.c) == null ? hiwo.l : hiwo.b(hiwq1.c))));
        buma0.aF = 2;
        buhm buhm0 = buma0.aj;
        if(buhm0.f) {
            bumo bumo0 = buma0.ai;
            hiwq hiwq2 = buhm0.d == null ? hiwq.a : buhm0.d;
            ibuq.f(hiwq2, "category");
            bumo0.d.ii(bumc.a);
            icck icck0 = lsc.a(bumo0);
            buml buml0 = new buml(bumo0, hiwq2, null);
            icbb.b(icck0, bumo0.b, null, buml0, 2);
        }
        else {
            bumo bumo1 = buma0.ai;
            hiwq hiwq3 = buhm0.d == null ? hiwq.a : buhm0.d;
            hfuo hfuo0 = buhm0.c;
            ibuq.f(hiwq3, "category");
            ibuq.f(hfuo0, "itemsToDelete");
            lqi lqi0 = bumo1.d;
            lqi0.ii(bumc.a);
            if(htuh.a.d().k()) {
                lqi0.ii(bume.a);
            }
            else {
                ggdy ggdy0 = new ggdy();
                for(Object object0: hfuo0) {
                    hiwu hiwu0 = (hiwu)object0;
                    if(hiwu0.e == 11) {
                        ggdy0.k(((hiwd)hiwu0.f).d);
                    }
                    else {
                        ggdy0.i(hiwu0.g);
                    }
                }
                icck icck1 = lsc.a(bumo1);
                bumk bumk0 = new bumk(bumo1, hiwq3, ggdy0, null);
                icbb.b(icck1, bumo1.b, null, bumk0, 2);
            }
        }
        buma0.al.d(buma0.an);
        buma0.al.c(buma0.ao);
        buma0.A(2);
    }
}

