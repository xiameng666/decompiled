import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public class buii extends du implements ejbp {
    private ContextWrapper a;
    private volatile eizo b;
    private final Object c;
    private boolean d;

    public buii() {
        this.c = new Object();
        this.d = false;
    }

    private final void A() {
        if(this.a == null) {
            this.a = new ejao(super.getContext(), this);
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
        ejbq.a(this.a == null || eizo.a(this.a) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        this.A();
        this.z();
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.A();
        this.z();
    }

    @Override  // du
    public final LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(new ejao(layoutInflater0, this));
    }

    public final eizo y() {
        if(this.b == null) {
            Object object0 = this.c;
            synchronized(object0) {
                if(this.b == null) {
                    this.b = new eizo(this);
                }
            }
            return this.b;
        }
        return this.b;
    }

    protected final void z() {
        if(!this.d) {
            this.d = true;
            ((buji)this.h()).g(((bujh)this));
        }
    }
}

