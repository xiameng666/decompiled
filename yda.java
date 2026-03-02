import com.google.android.gms.contextmanager.ContextData;
import java.util.Comparator;

public final class yda implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        long v = ((ycz)object0).a.f().c();
        ContextData contextData0 = ((ycz)object1).a;
        return v == contextData0.f().c() ? ((ycz)object0).c - ((ycz)object1).c : ydg.a(((ycz)object0).a.f().c(), contextData0.f().c());
    }
}

