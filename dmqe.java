import android.text.TextUtils;
import com.google.android.gms.pay.ClosedLoopCardIntentArgs;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dmqe extends dmqc {
    public final dlcg b;

    public dmqe() {
        super("com.google.android.gms.pay.pass.closedloop.view.detail.VIEW_CLOSED_LOOP_CARD");
        this.b = new dlcg();
    }

    public dmqe(byte[] arr_b) {
        super("com.google.android.gms.pay.pass.closedloop.view.detail.VIEW_ACCESS_CARD");
        this.b = new dlcg();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        ClosedLoopCardIntentArgs closedLoopCardIntentArgs0 = payIntentArgs0.h;
        batl.s(closedLoopCardIntentArgs0);
        batl.c(!TextUtils.isEmpty(closedLoopCardIntentArgs0.a) || closedLoopCardIntentArgs0.b != null || closedLoopCardIntentArgs0.c != null, "must have a way to display a closed loop card");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.h = this.b.a;
    }

    public final void h(ProtoSafeParcelable protoSafeParcelable0) {
        this.b.a.b = protoSafeParcelable0;
    }

    public final void i(String s) {
        this.b.a.a = s;
    }

    public final void j(GooglePaymentMethodId googlePaymentMethodId0) {
        this.b.a.c = googlePaymentMethodId0;
    }

    public final void k(String s) {
        this.b.a.d = s;
    }

    public final void l() {
        this.b.a.e = false;
    }
}

