import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Window;

public abstract class gbbt extends gbbz implements gasd {
    public gbbx ag;

    protected void A() {
    }

    public final void B() {
        if(this.ag != null) {
            this.E();
        }
    }

    public final void C(gbbx gbbx0) {
        if(this.ag == null && this.aj) {
            gbbx0.V();
        }
        this.ag = gbbx0;
        this.A();
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            this.H(dialog0);
        }
        if(this.D()) {
            gbbx0.n.a();
            this.B();
            gbbx0.n.b();
        }
    }

    protected final boolean D() {
        return this.ag != null;
    }

    protected void E() {
        throw null;
    }

    private final void H(Dialog dialog0) {
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            gbbx gbbx0 = this.ag;
            if(gbbx0 != null) {
                gbbx0.a.a.d().b(window0);
            }
        }
    }

    @Override  // de
    public void onDestroyView() {
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                gbbx gbbx0 = this.ag;
                if(gbbx0 != null) {
                    gbbx0.a.a.d().a(window0);
                }
            }
        }
        super.onDestroyView();
    }

    @Override  // de
    public final void onDismiss(DialogInterface dialogInterface0) {
        super.onDismiss(dialogInterface0);
        gbbx gbbx0 = this.ag;
        if(gbbx0 != null) {
            gbbx0.c();
        }
    }

    @Override  // gbbz
    protected final void y() {
        gbbx gbbx0 = this.ag;
        if(gbbx0 != null) {
            gbbx0.V();
        }
    }

    @Override  // gbbz
    protected final void z(Dialog dialog0) {
        gaxl.a();
        if(hzkm.c() && !bbnp.p()) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setFlags(0x2000, 0x2000);
            }
        }
        if(this.ah != 0) {
            dialog0.setOnShowListener(new fidi(this, new gbby(this)));
        }
        this.H(dialog0);
    }
}

