import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

public abstract class aala extends aalb {
    public aabx aq;

    protected final void F(Bundle bundle0) {
        int v2;
        int v = 0;
        if(bundle0 == null) {
            v2 = 0;
        }
        else {
            int v1 = bundle0.getInt("visible_item", 0);
            v2 = bundle0.getInt("visible_item_offset", 0);
            v = v1;
        }
        this.aq.aM().aa(v, v2);
    }

    public final boolean H() {
        LinearLayoutManager linearLayoutManager0 = this.aq.aM();
        int v = linearLayoutManager0.L();
        View view0 = linearLayoutManager0.S(v);
        return v == 0 && view0 != null && view0.getTop() <= this.y();
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        int v = this.aq.aM().L();
        View view0 = this.aq.aM().S(v);
        if(view0 == null) {
            return;
        }
        int v1 = view0.getTop();
        bundle0.putInt("visible_item", v);
        bundle0.putInt("visible_item_offset", v1);
    }

    protected abstract int y();
}

