import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public abstract class aakz extends du {
    public boolean ao;
    public long ap;

    public abstract void B(aanx arg1);

    public abstract boolean D(zho arg1);

    public final void G(long v) {
        this.ao = true;
        this.ap = v;
    }

    public abstract grxw fT();

    protected void fU(long v) {
    }

    @Override  // du
    public final Animation onCreateAnimation(int v, boolean z, int v1) {
        return z || this.getContext() == null || this.getParentFragment() == null || !aakz.z(this.requireParentFragment()) ? null : AnimationUtils.loadAnimation(this.requireContext(), 0x7F010013);  // anim:as_stay_put
    }

    @Override  // du
    public void onResume() {
        super.onResume();
        if(this.ao) {
            this.ao = false;
            View view0 = this.getView();
            if(view0 != null) {
                view0.addOnLayoutChangeListener(new aaky(this, view0));
                view0.requestLayout();
            }
        }
    }

    private static boolean z(du du0) {
        if(du0.isRemoving()) {
            return true;
        }
        return du0.getParentFragment() == null ? false : aakz.z(du0.requireParentFragment());
    }
}

