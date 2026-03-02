import com.google.android.gms.pay.Transaction;
import java.util.Arrays;

public final class edis extends lp {
    @Override  // lp
    public final boolean b(Object object0, Object object1) {
        Transaction transaction0 = (Transaction)object0;
        Transaction transaction1 = (Transaction)object1;
        ibuq.f(transaction0, "oldItem");
        ibuq.f(transaction1, "newItem");
        return Arrays.equals(transaction0.a, transaction1.a);
    }

    @Override  // lp
    public final boolean c(Object object0, Object object1) {
        ibuq.f(((Transaction)object0), "oldItem");
        ibuq.f(((Transaction)object1), "newItem");
        return ((Transaction)object0).b == ((Transaction)object1).b;
    }
}

