import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public abstract class fbzh extends de implements gczu, gdan, gdbw {
    public boolean ag;
    public fbgo ah;
    protected final ArrayList ai;

    public fbzh() {
        this.ag = true;
        this.ai = new ArrayList();
    }

    protected final boolean C(List list0, boolean z) {
        return gczs.p(this.ai, list0, z);
    }

    @Override  // gdan
    public final boolean lb(List list0) {
        return this.C(list0, false);
    }

    @Override  // gdan
    public final boolean ld(List list0) {
        return this.C(list0, true);
    }

    @Override  // gdan
    public final boolean le() {
        return gczs.q(this.ai);
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.ai;
    }

    @Override  // gdbw
    public final void ll(boolean z) {
        if(this.ag != z) {
            this.ag = z;
            this.y();
        }
    }

    @Override  // de
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("uiEnabled", this.ag);
        fbgo fbgo0 = this.ah;
        if(fbgo0 != null) {
            fbgo0.H(bundle0);
        }
    }

    @Override  // de
    public void onViewStateRestored(Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        if(bundle0 != null) {
            this.ag = bundle0.getBoolean("uiEnabled", true);
            this.y();
            fbgo fbgo0 = this.ah;
            if(fbgo0 != null) {
                fbgo0.x(bundle0);
            }
        }
    }

    protected void y() {
        throw null;
    }
}

