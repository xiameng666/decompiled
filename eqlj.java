import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

public final class eqlj implements evpo {
    public final evql a;
    public final evql b;
    public final long c;
    public final int d;

    public eqlj(evql evql0, evql evql1, long v, int v1) {
        this.a = evql0;
        this.b = evql1;
        this.c = v;
        this.d = v1;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        evql evql1 = this.a;
        Exception exception0 = evql1.i();
        if((exception0 instanceof aztb) && ((aztb)exception0).b() == 10501) {
            throw exception0;
        }
        String s = evql1.n() ? ((String)evql1.j()) : "";
        long v = this.c;
        evql evql2 = this.b;
        if(evql2.n() && evql2.j() != null) {
            v = (long)(((Long)evql2.j()));
        }
        String s1 = eqln.d(v);
        return WorkProfilePayload.p(s, this.d, s1);
    }
}

