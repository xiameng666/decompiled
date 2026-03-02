import android.text.TextUtils;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.pay.TransactionDetailIntentArgs;

public final class dmrd extends dmqc {
    public final dljz b;

    public dmrd() {
        super("com.google.android.gms.pay.transactions.VIEW_TRANSACTION");
        this.b = new dljz();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        boolean z = false;
        batl.c(payIntentArgs0.a != null, "account required");
        TransactionDetailIntentArgs transactionDetailIntentArgs0 = payIntentArgs0.f;
        batl.s(transactionDetailIntentArgs0);
        if(transactionDetailIntentArgs0.c != null || !TextUtils.isEmpty(transactionDetailIntentArgs0.a) || !TextUtils.isEmpty(transactionDetailIntentArgs0.b)) {
            z = true;
        }
        batl.c(z, "at least one of deviceTransactionId, cloudTransactionId, Transaction is required");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.f = this.b.a;
    }

    public final void h(Transaction transaction0) {
        this.b.a.c = transaction0;
    }
}

