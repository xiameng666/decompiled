import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;

public final class fccd extends gdga {
    SummaryExpanderWrapper a;
    private final ArrayList ar;
    public final gdew b;

    public fccd() {
        this.ar = new ArrayList(2);
        this.b = new gdew();
    }

    @Override  // gdga
    public final void M() {
        if(this.a == null) {
            return;
        }
        super.M();
        this.a.setEnabled(this.ca);
    }

    public static fccd Q(gfbn gfbn0, int v, LogContext logContext0) {
        fccd fccd0 = new fccd();
        fccd0.setArguments(fccd.al(v, ((MessageLite)gfbn0), logContext0));
        return fccd0;
    }

    @Override  // gdga
    protected final void R(LayoutInflater layoutInflater0, gfjj[] arr_gfjj) {
        super.R(layoutInflater0, arr_gfjj);
        int v = this.ai.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = gdcd.b(this.ai.getChildAt(v1));
            this.ar.add(view0);
        }
    }

    @Override  // gdak
    public final ArrayList aY() {
        return this.ar;
    }

    @Override  // gdak
    public final void lW(int v) {
        ArrayList arrayList0 = this.ar;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((View)arrayList0.get(v2)).setVisibility(v);
        }
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.b;
    }

    @Override  // gdga
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        gfep gfep0;
        View view0 = super.y(layoutInflater0, viewGroup0, bundle0);
        if(this.al.getVisibility() != 8) {
            this.ar.add(this.al);
        }
        if((((gfbn)this.aA).b & 16) != 0) {
            this.ar.add(this.ag);
        }
        ArrayList arrayList0 = this.ar;
        arrayList0.add(this.ah);
        if(!((gfbn)this.aA).i.isEmpty()) {
            arrayList0.add(this.ak);
        }
        if((((gfbn)this.aA).b & 0x80) != 0) {
            arrayList0.add(this.am);
        }
        this.a = (SummaryExpanderWrapper)view0.findViewById(0x7F0B2433);  // id:username_password_wrapper
        gewg gewg0 = ((gfbn)this.aA).c;
        if(gewg0 == null) {
            gewg0 = gewg.a;
        }
        if(gewg0.i.size() > 1) {
            throw new IllegalStateException("At most one component group supported.");
        }
        gewg gewg1 = ((gfbn)this.aA).c;
        if(gewg1 == null) {
            gewg1 = gewg.a;
        }
        if(gewg1.i.size() == 1) {
            gewg gewg2 = ((gfbn)this.aA).c;
            if(gewg2 == null) {
                gewg2 = gewg.a;
            }
            if(gfeo.a(((gfep)gewg2.i.get(0)).e) != 4) {
                throw new IllegalStateException("Only field group component group is supported");
            }
            gewg gewg3 = ((gfbn)this.aA).c;
            if(gewg3 == null) {
                gewg3 = gewg.a;
            }
            gfep0 = (gfep)gewg3.i.get(0);
        }
        else {
            gfep0 = null;
        }
        if(gfep0 != null) {
            fbey.c(this.a, gfep0, this, 0x7F0B2431, 0x7F0B2432, -1, -1, this);  // id:username_password_icon
            this.a.a.k();
            this.a.d(new gczs(this));
            this.a.h();
            this.b.d(this.a);
            return view0;
        }
        this.a.f(this, 0x7F0B2431, 0x7F0B2432);  // id:username_password_icon
        return view0;
    }
}

