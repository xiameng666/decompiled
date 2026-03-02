import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

public final class fnye extends kd implements fnwq {
    public final fnwr ag;
    public final aaw ah;
    public fnzx ai;
    public foaf aj;
    public fnja ak;
    public ExpressSignInLayout al;
    public boolean am;
    public Runnable an;

    public fnye() {
        this.ag = new fnwr(this);
        this.ah = new fnyc(this);
        this.am = true;
    }

    @Override  // de
    public final void dismiss() {
        if(!this.isAdded()) {
            return;
        }
        if(this.isStateSaved()) {
            super.dismissAllowingStateLoss();
            return;
        }
        super.dismiss();
    }

    @Override  // de
    public final void onCancel(DialogInterface dialogInterface0) {
    }

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setStyle(2, 0x7F160581);  // style:OneGoogle.ExpressSignInDialog
    }

    @Override  // kd
    public final Dialog onCreateDialog(Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        ((aas)dialog0).getOnBackPressedDispatcher().c(this, this.ah);
        return dialog0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0358, viewGroup0);  // layout:express_sign_in_dialog
        ExpressSignInLayout expressSignInLayout0 = (ExpressSignInLayout)view0.findViewById(0x7F0B1375);  // id:express_sign_in_modal
        this.al = expressSignInLayout0;
        expressSignInLayout0.a(new fnyn(new fnya(this)));
        if(this.am) {
            view0.findViewById(0x7F0B2306).setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                ExpressSignInLayout expressSignInLayout0 = this.al;
                if(expressSignInLayout0 != null) {
                    expressSignInLayout0.a(new fnyg());
                }
                this.dismiss();
            });
        }
        kfe.j(this.al, new fnyd(this));
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        fnxy fnxy0 = new fnxy(this, view0);
        this.ag.c(fnxy0);
    }

    @Override  // fnwq
    public final boolean y() {
        return this.ai != null && this.aj != null;
    }

    // Detected as a lambda impl.
    public final void z() {
        ExpressSignInLayout expressSignInLayout0 = this.al;
        if(expressSignInLayout0 != null) {
            expressSignInLayout0.a(new fnyg());
        }
        this.dismiss();
    }
}

