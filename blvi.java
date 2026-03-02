import com.google.android.gms.common.api.Status;

public final class blvi implements glzn {
    public final blvl a;

    public blvi(blvl blvl0) {
        this.a = blvl0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        blzx blzx0 = ((blzu)object0).a;
        if(blzx0.equals(blzx.A)) {
            return gmbu.i(Status.f);
        }
        if(!blzx0.equals(blzx.a)) {
            return gmbu.i(Status.d);
        }
        return this.a.aj == null || !this.a.aj.n ? this.a.y() : gmbu.i(Status.b);
    }
}

