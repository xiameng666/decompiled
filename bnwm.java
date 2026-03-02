import com.google.android.gms.auth.folsom.SharedKey;
import java.util.List;

public final class bnwm implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        List list0 = (List)object0;
        bnwo.a(list0);
        ((ggtj)bnwo.a.h()).F("Got %d domain keys starting from #%d", list0.size(), ((SharedKey)list0.get(0)).a);
        bnwd bnwd0 = new bnwd(null);
        bnwd0.b(list0);
        return bnwd0.a();
    }
}

