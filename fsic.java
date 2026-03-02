import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import java.util.Comparator;

public final class fsic implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((Valuable)object0).p.i;
        int v1 = ((Valuable)object1).p.i;
        return v == v1 ? ((Valuable)object0).b.compareTo(((Valuable)object1).b) : Integer.compare(v, v1);
    }
}

