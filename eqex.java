import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class eqex implements Runnable {
    final eqey a;

    public eqex(eqey eqey0) {
        Objects.requireNonNull(eqey0);
        this.a = eqey0;
        super();
    }

    @Override
    public final void run() {
        String s;
        this.a.a.a.E(2);
        eqmb.a(this.a.a.a, 14);
        eqeh eqeh0 = this.a.a.b;
        eqiw eqiw0 = this.a.b;
        if(eqeh0.i) {
            eqea eqea0 = eqeh0.g;
            if(eqea0 != null) {
                Status status0 = new Status(8);
                try {
                    s = ((eqed)eqea0).i;
                    if(s == null) {
                        s = "12345";
                        eqed.a.j("Token is null. Returning dummy token: 12345", new Object[0]);
                    }
                }
                catch(Throwable throwable0) {
                    eqeh.h(eqiw0, status0, null);
                    throw throwable0;
                }
                eqeh.h(eqiw0, Status.b, s);
                return;
            }
        }
        eqeh.h(eqiw0, new Status(10552), null);
    }
}

