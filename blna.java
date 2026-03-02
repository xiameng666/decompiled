import com.google.android.gms.common.api.Status;

public final class blna implements glzn {
    public final blnd a;

    public blna(blnd blnd0) {
        this.a = blnd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        blzx blzx0 = ((blzu)object0).a;
        if(blzx0.equals(blzx.A)) {
            return gmbu.i(Status.f);
        }
        if(blzx0.equals(blzx.i)) {
            return gmbu.i(Status.h);
        }
        if(blzx0.equals(blzx.f)) {
            return gmbu.i(Status.e);
        }
        if(!blzx0.equals(blzx.a) && !blzx0.equals(blzx.H) && !blzx0.equals(blzx.T)) {
            return gmbu.i(Status.d);
        }
        return this.a.g.o ? gmbu.i(Status.b) : this.a.b();
    }
}

