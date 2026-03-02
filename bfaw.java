import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.gms.credential.manager.passwordimport.ImportProgressFragment;

public class bfaw extends du implements ejbp {
    private ContextWrapper a;
    private volatile eizo b;
    private final Object c;
    private boolean d;

    public bfaw() {
        this.c = new Object();
        this.d = false;
    }

    bfaw(int v) {
        super(v);
        this.c = new Object();
        this.d = false;
    }

    protected final void A() {
        if(!this.d) {
            this.d = true;
            bexz bexz0 = (bexz)this.h();
            ImportProgressFragment importProgressFragment0 = (ImportProgressFragment)this;
            bexz0.H();
        }
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.z();
    }

    @Override  // du
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.z().h();
    }

    @Override  // du
    public final void onAttach(Activity activity0) {
        super.onAttach(activity0);
        ejbq.a(this.a == null || eizo.a(this.a) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        this.y();
        this.A();
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.y();
        this.A();
    }

    @Override  // du
    public final LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(new ejao(layoutInflater0, this));
    }

    private final void y() {
        if(this.a == null) {
            this.a = new ejao(super.getContext(), this);
            eixv.a(super.getContext());
        }
    }

    public final eizo z() {
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
}

