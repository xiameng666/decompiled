import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

final class fdjh extends fdlv {
    private final WeakReference a;
    private final WeakReference b;

    public fdjh(Map map0, Object object0, azvd azvd0) {
        super(azvd0);
        this.a = new WeakReference(map0);
        this.b = new WeakReference(object0);
    }

    @Override  // fdix
    public final void a(Status status0) {
        Map map0 = (Map)this.a.get();
        Object object0 = this.b.get();
        if(status0.i == 4002 && map0 != null && object0 != null) {
            synchronized(map0) {
                fdmt fdmt0 = (fdmt)map0.remove(object0);
                if(fdmt0 != null) {
                    fdmt0.p();
                }
            }
        }
        this.r(status0);
    }
}

