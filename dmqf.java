import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SaveTicketCentricIntentArgs;

public final class dmqf extends dmqc {
    public final dlid b;

    public dmqf() {
        super("com.google.android.gms.pay.pass.closedloop.view.save.SAVE_CLOSED_LOOP_TICKET");
        this.b = new dlid();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        SaveTicketCentricIntentArgs saveTicketCentricIntentArgs0 = payIntentArgs0.j;
        batl.s(saveTicketCentricIntentArgs0);
        batl.c(saveTicketCentricIntentArgs0.f != null || saveTicketCentricIntentArgs0.a != null && (saveTicketCentricIntentArgs0.d != 0 && saveTicketCentricIntentArgs0.b != 0L || saveTicketCentricIntentArgs0.e != null), "Validation or digitization intent arguments are not present.");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.j = this.b.a;
    }

    public final void h(byte[] arr_b) {
        ProtoSafeParcelable protoSafeParcelable0 = new ProtoSafeParcelable();
        protoSafeParcelable0.a = arr_b;
        this.b.a.e = protoSafeParcelable0;
    }

    public final void i(byte[] arr_b) {
        ProtoSafeParcelable protoSafeParcelable0 = new ProtoSafeParcelable();
        protoSafeParcelable0.a = arr_b;
        this.b.a.a = protoSafeParcelable0;
    }
}

