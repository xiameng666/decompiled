import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.pay.pass.idcard.view.MdocPresentationChimeraActivity;
import j..util.Objects;

public final class duia implements View.OnClickListener {
    public final MdocPresentationChimeraActivity a;

    public duia(MdocPresentationChimeraActivity mdocPresentationChimeraActivity0) {
        this.a = mdocPresentationChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        view0.setEnabled(false);
        this.a.r = true;
        ((fyfv)Objects.requireNonNull(this.a.l)).dismiss();
        this.a.g();
    }
}

