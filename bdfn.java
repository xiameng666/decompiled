import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

class bdfn extends fyfx implements ejbp {
    private ContextWrapper ag;
    private volatile eizo ah;
    private final Object ai;
    private boolean aj;

    public bdfn() {
        this.ai = new Object();
        this.aj = false;
    }

    private final void A() {
        if(this.ag == null) {
            this.ag = new ejao(super.getContext(), this);
            eixv.a(super.getContext());
        }
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.y();
    }

    @Override  // du
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.y().h();
    }

    @Override  // du
    public final void onAttach(Activity activity0) {
        super.onAttach(activity0);
        ejbq.a(this.ag == null || eizo.a(this.ag) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        this.A();
        this.z();
    }

    @Override  // de
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.A();
        this.z();
    }

    @Override  // de
    public final LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(new ejao(layoutInflater0, this));
    }

    public final eizo y() {
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

    protected final void z() {
        if(!this.aj) {
            this.aj = true;
            ((bdfe)this.h()).i(((bdfd)this));
        }
    }
}

