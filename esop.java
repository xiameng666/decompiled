import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.util.Comparator;
import java.util.Map;

public final class esop implements Comparator {
    public final Map a;

    public esop(Map map0) {
        this.a = map0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        Long long0 = (Long)this.a.get(((CardInfo)object0).F);
        batl.s(long0);
        Long long1 = (Long)this.a.get(((CardInfo)object1).F);
        batl.s(long1);
        return Long.compare(long0.longValue(), long1.longValue());
    }
}

