import com.google.android.gms.appset.AppSetInfoParcel;
import java.util.concurrent.atomic.AtomicReference;

public final class aclj implements gfsi {
    public final String a;
    public final AtomicReference b;

    public aclj(String s, AtomicReference atomicReference0) {
        this.a = s;
        this.b = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        this.a.getClass();
        acmm acmm0 = (acmm)((acmr)object0).c.get(this.a);
        if(acmm0 == null) {
            throw new IllegalArgumentException();
        }
        String s = acmm0.c;
        s.getClass();
        acmn acmn0 = (acmn)((acmr)object0).b.get(s);
        if(acmn0 == null) {
            throw new IllegalArgumentException();
        }
        AppSetInfoParcel appSetInfoParcel0 = acln.a(acmn0);
        this.b.set(appSetInfoParcel0);
        return (acmr)object0;
    }
}

