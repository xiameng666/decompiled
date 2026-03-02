import android.view.View;
import java.util.Objects;

public final class ire {
    public static final gsu a(View view0) {
        grq grq1;
        ibrt ibrt0;
        ibru ibru0 = ibru.a;
        ibru0.get(ibrn.k);
        if(inj.a()) {
            ibrt0 = ing.a();
        }
        else {
            ibrt0 = (ibrt)ini.b.get();
            if(ibrt0 == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        ibrt ibrt1 = ibrt0.plus(ibru0);
        gqt gqt0 = (gqt)ibrt1.get(gqt.b);
        lpg lpg0 = null;
        if(gqt0 == null) {
            grq1 = null;
        }
        else {
            grq grq0 = new grq(gqt0);
            synchronized(grq0.a.a) {
                grq0.a.d = false;
            }
            grq1 = grq0;
        }
        ibvd ibvd0 = new ibvd();
        hff hff0 = (hff)ibrt1.get(hff.b);
        if(hff0 == null) {
            hff0 = new iqa();
            ibvd0.a = hff0;
        }
        grq grq2 = grq1 == null ? ibru.a : grq1;
        ibrt ibrt2 = ibrt1.plus(grq2).plus(hff0);
        gsu gsu0 = new gsu(ibrt2);
        gsu0.w();
        icck icck0 = iccl.b(ibrt2);
        lps lps0 = lsr.a(view0);
        if(lps0 != null) {
            lpg0 = lps0.getLifecycle();
        }
        if(lpg0 != null) {
            view0.addOnAttachStateChangeListener(new irj(view0, gsu0));
            lpg0.c(new irn(icck0, grq1, gsu0, ibvd0, view0));
            return gsu0;
        }
        Objects.toString(view0);
        hxt.b(("ViewTreeLifecycleOwner not found from " + view0));
        throw new ibnm();
    }
}

