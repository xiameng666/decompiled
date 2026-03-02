import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.List;

public final class fmqd implements fmwu, fmww {
    private static final gged_interceptors a;

    static {
        fmqd.a = gged_interceptors.l(fmxd.d);
    }

    @Override  // fmwu
    public final uq a(ViewGroup viewGroup0, fmxd fmxd0) {
        fmqb fmqb0 = new fmqb(viewGroup0.getContext());
        int v = fmqb0.getResources().getDimensionPixelSize(0x7F0713A4);  // dimen:tombstone_padding_top_bottom
        int v1 = fmqb0.getResources().getDimensionPixelSize(0x7F0713A3);  // dimen:tombstone_padding_start_end
        int v2 = fmqb0.getResources().getDimensionPixelSize(0x7F0713A2);  // dimen:tombstone_margin
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = new ViewGroup.MarginLayoutParams(-1, -2);
        viewGroup$MarginLayoutParams0.topMargin = v2;
        viewGroup$MarginLayoutParams0.bottomMargin = v2;
        fmqb0.setLayoutParams(viewGroup$MarginLayoutParams0);
        fmqb0.setPadding(v1, v, v1, v);
        fmqb0.setBackgroundColor(fyho.b(fmqb0, 0x7F0402F9));  // attr:colorOnSurfaceInverse
        return new fmqc(fmqb0, new fmpz(fmqb0));
    }

    @Override  // fmww
    public final fmwu b() {
        return this;
    }

    @Override  // fmww
    public final gfsx c() {
        return gfqx.a;
    }

    @Override  // fmwu
    public final List d() {
        return fmqd.a;
    }

    @Override  // fmwu
    public final void e(uq uq0, fmxe fmxe0, AccountContext accountContext0) {
        if((uq0 instanceof fmqc)) {
            fmpz fmpz0 = ((fmqc)uq0).t;
            fmpz0.a = fmxe0.e();
            fmwd fmwd0 = fmpz0.a;
            if(fmwd0 != null) {
                fmpz0.b.removeAllViews();
                fmpz0.b.setVisibility(0);
                fmqa fmqa0 = new fmqa(fmpz0.b);
                flbl.b(fmwd0.a, fmqa0);
                return;
            }
            flbj.c("TombstoneCellPresenter", "Call presenter.setMessage(message) before calling start()");
        }
    }

    @Override  // fmwu
    public final boolean f(fmga fmga0) {
        return true;
    }

    @Override  // fmww
    public final void g(fmga fmga0) {
    }
}

