import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.card.MaterialCardView;

public final class dogh extends xq {
    public tk b;
    private BottomSheetBehavior c;

    public dogh() {
        super(51);
    }

    public dogh(BottomSheetBehavior bottomSheetBehavior0) {
        super(51);
        this.c = bottomSheetBehavior0;
    }

    @Override  // xm
    public final void e(RecyclerView recyclerView0, uq uq0) {
        int v = uq0.fp();
        if(v >= 0 && v < this.b.b()) {
            tk tk0 = uq0.r;
            if((tk0 instanceof dogj)) {
                ((dogj)tk0).n();
            }
        }
        if((uq0 instanceof doiy) && !hwgz.h()) {
            View view0 = ((doiy)uq0).D();
            ibuq.d(view0, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
            ((MaterialCardView)view0).E(false);
        }
    }

    @Override  // xm
    public final void f(uq uq0, int v) {
        if((uq0 instanceof doiy) && v == 2 && !hwgz.h()) {
            View view0 = ((doiy)uq0).D();
            ibuq.d(view0, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
            ((MaterialCardView)view0).E(true);
        }
    }

    @Override  // xm
    public final boolean m(uq uq0, uq uq1) {
        if(this.b != null && uq0.fp() != -1 && uq1.fp() != -1) {
            tk tk0 = uq0.r;
            if((tk0 instanceof dogj) && (uq1.r instanceof dogj)) {
                ((dogj)tk0).f(uq0.fq(), uq1.fq());
                return true;
            }
        }
        return false;
    }

    @Override  // xm
    public final void n() {
    }

    @Override  // xq
    public final int p(uq uq0) {
        if(uq0.fp() == -1) {
            return 0;
        }
        if(this.c != null && this.c.A != 3) {
            return 0;
        }
        tk tk0 = uq0.r;
        if((tk0 instanceof dogj)) {
            return tk0.b() <= 0 || tk0.dx(0) != 2 ? 51 : 0;
        }
        return 0;
    }
}

