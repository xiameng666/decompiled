import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class dokz extends du implements doli {
    private dolg VD;

    public final Bundle am() {
        Bundle bundle0 = this.getArguments();
        return bundle0 == null ? new Bundle() : bundle0;
    }

    public final xob an() {
        return (xob)this.getContext();
    }

    public final xob ao() {
        return (xob)this.requireContext();
    }

    @Override  // doli
    public final dolg ap() {
        gftb.check(this.VD);
        return this.VD;
    }

    public String aq() {
        return this.getClass().getSimpleName();
    }

    public void ar() {
        xob xob0 = this.an();
        if(xob0 != null && !xob0.isFinishing()) {
            xob0.finish();
        }
    }

    public final void as(Intent intent0) {
        xob xob0 = this.an();
        if((xob0 instanceof domn)) {
            ((domn)xob0).a(intent0);
            return;
        }
        if(xob0 != null) {
            xob0.startActivity(intent0);
            this.ar();
        }
    }

    public final void at(int v, Intent intent0) {
        xob xob0 = this.an();
        if(xob0 != null) {
            if(intent0 == null) {
                xob0.setResult(v);
                return;
            }
            xob0.setResult(v, intent0);
        }
    }

    public void au(du du0) {
        ca ca0 = new ca(this.getParentFragmentManager());
        ca0.t(this.getId(), du0);
        ca0.n(this);
        ca0.C();
        ca0.w(this.aq());
        ca0.b();
    }

    public final boolean av() {
        fm fm0;
        try {
            fm0 = this.getParentFragmentManager();
            if(fm0.b() > 0) {
                goto label_2;
            }
        }
        catch(IllegalStateException unused_ex) {
        }
        return false;
    label_2:
        fm0.av();
        return true;
    }

    public final boolean aw() {
        xob xob0 = this.an();
        return xob0 == null || xob0.isFinishing();
    }

    public void jO() {
    }

    @Override  // du
    public void onAttach(Context context0) {
        gftb.b(context0 instanceof doli, "Cannot use an AccountAwareFragment without a FragmentActivity that implements AccountScopedComponentProvider. If you\'re not using this with PayChimeraActivity... why not?");
        gftb.b(context0 instanceof doml, "Cannot use an AccountAwareFragment without a FragmentActivity that implements OnAccountSelectedListener. If you\'re not using this with PayChimeraActivity... why not?");
        this.VD = dolh.a(context0);
        super.onAttach(context0);
    }
}

