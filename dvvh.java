import com.google.android.gms.pay.pass.valuable.view.detail.ValuableDetailUnifiedFragment;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvvh implements evqc {
    public final Valuable a;

    public dvvh(Valuable valuable0) {
        this.a = valuable0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)ValuableDetailUnifiedFragment.a.i()).s(exception0)).B("Failed to update notifications settings for valuable ID: %s", this.a.b);
    }
}

