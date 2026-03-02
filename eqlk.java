import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

public final class eqlk implements evpo {
    public final long a;
    public final int b;

    public eqlk(long v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        Exception exception0 = evql0.i();
        if((exception0 instanceof aztb) && ((aztb)exception0).b() == 10501) {
            throw exception0;
        }
        String s = evql0.n() ? ((String)evql0.j()) : "";
        String s1 = eqln.d(this.a);
        return WorkProfilePayload.p(s, this.b, s1);
    }
}

