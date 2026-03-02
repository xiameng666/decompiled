import android.app.Dialog;
import j..util.Objects;

final class azvf extends azxo {
    final Dialog a;
    final azvg b;

    public azvf(azvg azvg0, Dialog dialog0) {
        this.a = dialog0;
        Objects.requireNonNull(azvg0);
        this.b = azvg0;
        super();
    }

    @Override  // azxo
    public final void a() {
        this.b.a.h();
        Dialog dialog0 = this.a;
        if(dialog0.isShowing()) {
            dialog0.dismiss();
        }
    }
}

