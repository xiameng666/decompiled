import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import j..util.Objects;

public final class aahl extends aalb {
    public aanu a;
    public SwipeRefreshLayout ag;
    public ViewGroup ah;
    public View ai;
    public zem b;
    acp c;
    final acn d;

    public aahl() {
        this.d = new aahj(this);
    }

    @Override  // aalb
    protected final boolean E(grul grul0) {
        return (grul0.b & 0x800) != 0;
    }

    @Override  // aakz
    public final grxw fT() {
        return this.a.a.a;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 9) {
            this.a.a();
            return;
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        ((aahk)zgm.a(aahk.class, this)).c(this);
        this.a.c.g(this, new aahh(this));
        this.a.d.g(this, new aahi(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate((hoju.j() ? 0x7F0E00D7 : 0x7F0E00D8), viewGroup0, false);  // layout:as_message_screen_fragment
        SwipeRefreshLayout swipeRefreshLayout0 = (SwipeRefreshLayout)view0.findViewById(0x7F0B21F4);  // id:swipe_refresh_layout
        this.ag = swipeRefreshLayout0;
        cchs.g(swipeRefreshLayout0, 0x1010031);
        SwipeRefreshLayout swipeRefreshLayout1 = this.ag;
        aanu aanu0 = this.a;
        Objects.requireNonNull(aanu0);
        swipeRefreshLayout1.a = new aahg(aanu0);
        this.ag.o(this.ag.i);
        this.ai = view0.findViewById(0x7F0B1D4E);  // id:progress_view
        this.ah = (ViewGroup)view0.findViewById(0x7F0B0FD4);  // id:content
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        if(hoju.o()) {
            acn acn0 = this.d;
            if(acn0 != null) {
                this.c = this.registerForActivityResult(new aacj(), ((acn)Objects.requireNonNull(acn0)));
            }
        }
    }
}

