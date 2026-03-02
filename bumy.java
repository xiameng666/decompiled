import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

class bumy extends de implements ejbp {
    private ContextWrapper ag;
    private volatile eizo ah;
    private final Object ai;
    private boolean aj;

    public bumy() {
        this.ai = new Object();
        this.aj = false;
    }

    public final eizo C() {
        if(this.ah == null) {
            Object object0 = this.ai;
            synchronized(object0) {
                if(this.ah == null) {
                    this.ah = new eizo(this);
                }
            }
            return this.ah;
        }
        return this.ah;
    }

    protected final void D() {
        if(!this.aj) {
            this.aj = true;
            ((bumb)this.h()).d(((buma)this));
        }
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.C();
    }

    @Override  // du
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.C().h();
    }

    @Override  // du
    public final void onAttach(Activity activity0) {
        super.onAttach(activity0);
        ejbq.a(this.ag == null || eizo.a(this.ag) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        this.y();
        this.D();
    }

    @Override  // de
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.y();
        this.D();
    }

    @Override  // de
    public final LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(new ejao(layoutInflater0, this));
    }

    private final void y() {
        if(this.ag == null) {
            this.ag = new ejao(super.getContext(), this);
            eixv.a(super.getContext());
        }
    }
}

