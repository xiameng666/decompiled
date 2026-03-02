import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cast.activity.CastPopupChimeraActivity;

public final class atul extends attp {
    public final gful_cronetEngineProvider e;
    atus f;
    public Boolean g;
    public boolean h;
    public final atuk i;
    private final avjh k;

    public atul(CastPopupChimeraActivity castPopupChimeraActivity0) {
        super(castPopupChimeraActivity0);
        this.k = new avjh("CastTermsOfServiceActivity");
        this.e = gfus.a(((gful_cronetEngineProvider)new atuj()));
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = new atuk(this);
        this.d = "your Google Cast device";
    }

    @Override  // attp
    public final void d() {
        atus atus0 = this.f;
        if(atus0 != null) {
            if(!avij.e().E()) {
                atus0.dismiss();
                this.k.m("Dismissed ToS dialog");
            }
            else if(atus0.getDialog() != null) {
                Dialog dialog0 = atus0.getDialog();
                batl.s(dialog0);
                if(dialog0.isShowing()) {
                    if(!((Boolean)this.e.mr()).booleanValue()) {
                        atus0.dismissAllowingStateLoss();
                    }
                    else if(!this.o().au()) {
                        atus0.dismissNow();
                    }
                    this.k.m("Dismissed ToS dialog");
                }
            }
            this.f = null;
        }
    }

    @Override  // attp
    public final void e(Intent intent0) {
        if(!avij.e().w()) {
            this.d();
        }
        int v = this.b;
        this.b = intent0.getIntExtra("com.google.android.gms.cast.activity.DIALOG_KEY_OPERATION", (avij.e().w() ? this.b : 6));
        this.d = gfta.b(intent0.getStringExtra("com.google.android.gms.cast.session.DIALOG_KEY_REMOTE_DEVICE_NAME"));
        this.k.q("handleIntent: currentDialogOperation=%d -> %d, remoteDeviceName=%s", Integer.valueOf(v), Integer.valueOf(this.b), this.d);
    }

    @Override  // attp
    public final void f(int v) {
        this.c = v;
        Intent intent0 = new Intent("com.google.android.gms.cast.activity.TOS_DIALOG_ACTION_STATE_CHANGE");
        intent0.putExtra("com.google.android.gms.cast.activity.DIALOG_KEY_ACTION_RESULT", v);
        intent0.setPackage("com.google.android.gms");
        if(v == 5) {
            Boolean boolean0 = this.g;
            if(boolean0 != null) {
                intent0.putExtra("com.google.android.gms.cast.activity.DIALOG_KEY_DEVICE_USAGE_REPORTING", boolean0);
            }
        }
        this.j.sendBroadcast(intent0);
    }

    @Override  // attp
    public final void g(Bundle bundle0) {
        super.g(bundle0);
        if(avij.e().D()) {
            this.b();
        }
    }

    @Override  // attp
    public final void h() {
        this.f = null;
        if(avij.e().D()) {
            super.h();
            this.c();
            return;
        }
        this.c();
        super.h();
    }

    @Override  // attp
    public final void k() {
        if(!this.h) {
            this.f(7);
        }
        super.k();
    }

    @Override  // attp
    protected final void l(int v) {
        this.k.n("Cast terms of service dialog dismissed with action result %d", Integer.valueOf(v));
        super.l(v);
    }

    @Override  // attp
    public final void m() {
        int v = this.b;
        if(v == 6) {
            this.k.m("Closing the terms of service dialog and exiting the activity.");
            this.f(1);
            this.j.finish();
            return;
        }
        avjh avjh0 = this.k;
        avjh0.p("Show Cast terms of service dialog (operation=%d) for device \'%s\'", Integer.valueOf(v), this.a());
        this.a = this.j.getRequestedOrientation();
        this.j.setRequestedOrientation(14);
        atus atus0 = (atus)this.o().h("CastTermsOfServiceDialogFragment");
        if(atus0 != null) {
            avjh0.m("Re-using existing ToS dialog attached to the fragment manager.");
            this.f = atus0;
        }
        else if(this.f == null) {
            avjh0.m("Creating initial ToS dialog instance.");
            this.f = new atus();
        }
        atus atus1 = this.f;
        atus1.an = this.i;
        atus1.ai = this.d;
        if(!atus1.isAdded()) {
            if(avij.e().y()) {
                atus1.showNow(this.o(), "CastTermsOfServiceDialogFragment");
            }
            else {
                atus1.show(this.o(), "CastTermsOfServiceDialogFragment");
            }
        }
        this.f(0);
    }
}

