import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.tapandpay.ui.passlistitem.PassListItem;

public final class dnoo extends xq {
    public dnoj b;
    private final Context c;

    public dnoo(Context context0) {
        super(3);
        this.c = context0;
    }

    @Override  // xm
    public final void e(RecyclerView recyclerView0, uq uq0) {
        super.e(recyclerView0, uq0);
        if((uq0 instanceof dnpo)) {
            ((dnpo)uq0).E(false);
        }
        else if((uq0 instanceof dnpk)) {
            ((PassListItem)((dnpk)uq0).a).E(false);
        }
        dnoj dnoj0 = this.b;
        if(dnoj0 != null) {
            dnoj0.G();
        }
    }

    @Override  // xm
    public final void l(uq uq0, float f, int v, boolean z) {
        if(v == 2 && z && f == 0.0f) {
            if((uq0 instanceof dnpo)) {
                ((dnpo)uq0).E(true);
                return;
            }
            if((uq0 instanceof dnpk)) {
                ((PassListItem)((dnpk)uq0).a).E(true);
            }
        }
    }

    @Override  // xm
    public final boolean m(uq uq0, uq uq1) {
        if(this.b != null) {
            int v = uq0.fq();
            if(v != -1) {
                int v1 = uq1.fq();
                if(v1 != -1 && this.b.H(v, v1)) {
                    this.b.t(v, v1);
                    uq0.a.announceForAccessibility(this.c.getString(0x7F151E1F, new Object[]{((int)(v1 + 1))}));  // string:pay_fops_move_card_to_position_announcement "Moved to Position %1$d"
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // xm
    public final void n() {
    }

    @Override  // xq
    public final int p(uq uq0) {
        return uq0.fq() == -1 || uq0.f != 2 ? 0 : this.a;
    }
}

