import com.google.android.gms.auth.api.phone.internal.RequestResult;
import java.util.HashMap;

public final class ahxv {
    public long a;
    public RequestResult b;
    public final gfza c;
    public final gfza d;
    public final HashMap e;

    public ahxv() {
        this.c = new gfza();
        this.d = new gfza();
        this.e = new HashMap();
    }

    public final gged_interceptors a(long v, gged_interceptors gged0) {
        gged_interceptors gged1;
        if(gged0.isEmpty()) {
            gged1 = gged_interceptors.i(this.c.z());
        }
        else {
            ggdy ggdy0 = new ggdy();
            for(Object object0: this.c.z()) {
                String s = (String)object0;
                if(!gged0.contains(s)) {
                    ggdy0.i(s);
                }
            }
            gged1 = ggdy0.h();
        }
        int v1 = gged1.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            String s1 = (String)gged1.get(v2);
            ahxt ahxt0 = new ahxt(s1, ((long)(((Long)this.c.g(s1).remove(0)))));
            this.d.v(Long.valueOf(v), ahxt0);
        }
        return gged1;
    }

    public final void b(long v, RequestResult requestResult0) {
        this.a = v;
        this.b = requestResult0;
    }

    public final boolean c() {
        return this.c.C() && this.d.C() && this.e.isEmpty();
    }
}

