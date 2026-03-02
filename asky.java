import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

public abstract class asky extends skp implements ejbp {
    private volatile eizo ag;
    private final Object ah;
    private boolean ai;
    private ContextWrapper d;

    public asky() {
        this.ah = new Object();
        this.ai = false;
    }

    private final void K() {
        if(this.d == null) {
            this.d = new ejao(super.getContext(), this);
            eixv.a(super.getContext());
        }
    }

    public final eizo Y() {
        if(this.ag == null) {
            Object object0 = this.ah;
            synchronized(object0) {
                if(this.ag == null) {
                    this.ag = new eizo(this);
                }
            }
            return this.ag;
        }
        return this.ag;
    }

    protected final void Z() {
        if(!this.ai) {
            this.ai = true;
            ((askj)this.h()).M(((BackupSettingsDeviceDataFragment)this));
        }
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.Y();
    }

    @Override  // du
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.Y().h();
    }

    @Override  // du
    public final void onAttach(Activity activity0) {
        super.onAttach(activity0);
        ejbq.a(this.d == null || eizo.a(this.d) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        this.K();
        this.Z();
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.K();
        this.Z();
    }

    @Override  // du
    public final LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(new ejao(layoutInflater0, this));
    }
}

