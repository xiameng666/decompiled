import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.pay.TransactionListIntentArgs;

public final class dmre extends dmqc {
    private final dlkb b;

    public dmre() {
        super("com.google.android.gms.pay.transactions.VIEW_TRANSACTION_LIST");
        this.b = new dlkb();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        boolean z = true;
        batl.c(payIntentArgs0.a != null, "account required");
        TransactionListIntentArgs transactionListIntentArgs0 = payIntentArgs0.g;
        batl.s(transactionListIntentArgs0);
        if(transactionListIntentArgs0.b <= 0) {
            z = false;
        }
        batl.b(z);
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.g = this.b.a;
    }

    public final void h(int v) {
        this.b.a.b = v;
    }

    public final void i() {
        this.b.a.c = 1;
    }

    public final void j(GooglePaymentMethodId[] arr_googlePaymentMethodId) {
        this.b.a.a = arr_googlePaymentMethodId;
    }

    public final void k(long v) {
        this.b.a.e = v;
    }

    public final void l(Transaction transaction0) {
        this.b.a.d = transaction0;
    }
}

