import com.google.android.location.reporting.server.RemoteDevice;
import java.text.Collator;
import java.util.Comparator;

public final class fxuz implements Comparator {
    final Collator a;

    public fxuz(Collator collator0) {
        this.a = collator0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        boolean z = ((RemoteDevice)object0).c;
        if(z != ((RemoteDevice)object1).c) {
            return z ? 1 : -1;
        }
        Long long0 = ((RemoteDevice)object0).e;
        int v = 0;
        Long long1 = ((RemoteDevice)object1).e;
        if(long1 == null) {
            v = 1;
        }
        if((long0 == null ? 1 : 0) != v) {
            return long0 == null ? 1 : -1;
        }
        int v1 = this.a.compare(((RemoteDevice)object0).b, ((RemoteDevice)object1).b);
        if(v1 == 0) {
            return long0 == null || long0.equals(long1) ? fxva.a(((RemoteDevice)object0).a, ((RemoteDevice)object1).a) : fxva.a(long0.longValue(), long1.longValue());
        }
        return v1;
    }
}

