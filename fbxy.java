import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import j..util.Objects;

public final class fbxy {
    public final BuyFlowConfig a;

    public fbxy(BuyFlowConfig buyFlowConfig0) {
        Objects.requireNonNull(buyFlowConfig0);
        this.a = buyFlowConfig0;
        super();
    }

    public final BuyFlowConfig a() {
        BuyFlowConfig buyFlowConfig0 = this.a;
        if(buyFlowConfig0.a == null) {
            buyFlowConfig0.a = fbly.a();
        }
        return buyFlowConfig0;
    }

    public final void b(ApplicationParameters applicationParameters0) {
        this.a.b = applicationParameters0;
    }

    public final void c(String s) {
        this.a.e = s;
    }

    public final void d(String s) {
        this.a.c = s;
    }

    public final void e(String s) {
        this.a.d = s;
    }

    public final void f(String s) {
        this.a.a = s;
    }
}

