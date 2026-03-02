import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public final class amf extends du {
    public amj a;

    public amf() {
        new Handler(Looper.getMainLooper());
    }

    public final void A(int v, CharSequence charSequence0) {
        amj amj0 = this.a;
        if(!amj0.k) {
            if(amj0.j) {
                amj0.j = false;
                amj0.h().execute(new alr(this, v, charSequence0));
            }
            else {
                Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            }
        }
        this.z();
    }

    public final void B(alj alj0) {
        amj amj0 = this.a;
        if(amj0.j) {
            amj0.j = false;
            amj0.h().execute(new alq(this, alj0));
        }
        else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        this.z();
    }

    public final void C() {
        boolean z = this.getContext() == null;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1) {
            this.a.k = false;
            if(v1 == -1) {
                this.B(new alj(null, 1));
                return;
            }
            this.A(10, this.getString(0x7F151334));  // string:generic_error_user_canceled "Authentication canceled by user."
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(this.a == null) {
            this.a = alo.b(this, this.getArguments().getBoolean("host_activity", true));
        }
        amj amj0 = this.a;
        if(amj0.q == null) {
            amj0.q = new lqi();
        }
        amj0.q.g(this, new als(this));
        amj amj1 = this.a;
        if(amj1.r == null) {
            amj1.r = new lqi();
        }
        amj1.r.g(this, new alt(this));
        amj amj2 = this.a;
        if(amj2.s == null) {
            amj2.s = new lqi();
        }
        amj2.s.g(this, new alu(this));
        amj amj3 = this.a;
        if(amj3.t == null) {
            amj3.t = new lqi();
        }
        amj3.t.g(this, new alv(this));
        amj amj4 = this.a;
        if(amj4.u == null) {
            amj4.u = new lqi();
        }
        amj4.u.g(this, new alw(this));
        amj amj5 = this.a;
        if(amj5.v == null) {
            amj5.v = new lqi();
        }
        amj5.v.g(this, new alx(this));
        amj amj6 = this.a;
        if(amj6.w == null) {
            amj6.w = new lqi();
        }
        amj6.w.g(this, new aly(this));
    }

    @Override  // du
    public final void onStop() {
        super.onStop();
        if(this.a.i && !this.a.k) {
            ea ea0 = this.getActivity();
            if(this.isRemoving() && (ea0 == null || !ea0.isChangingConfigurations())) {
                this.y(0);
            }
        }
    }

    public final void y(int v) {
        amv amv0 = this.a.b();
        CancellationSignal cancellationSignal0 = amv0.a;
        if(cancellationSignal0 != null) {
            try {
                cancellationSignal0.cancel();
            }
            catch(NullPointerException nullPointerException0) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", nullPointerException0);
            }
            amv0.a = null;
        }
    }

    final void z() {
        this.a.i = false;
        if(this.isAdded()) {
            fm fm0 = this.getParentFragmentManager();
            amo amo0 = (amo)fm0.h("androidx.biometric.internal.FingerprintDialogFragment");
            if(amo0 != null) {
                if(amo0.isAdded()) {
                    amo0.dismissAllowingStateLoss();
                }
                else {
                    ca ca0 = new ca(fm0);
                    ca0.o(amo0);
                    ca0.b();
                }
            }
        }
        this.a.i = false;
        if(!this.a.k && this.isAdded()) {
            ca ca1 = new ca(this.getParentFragmentManager());
            ca1.o(this);
            ca1.b();
        }
    }
}

