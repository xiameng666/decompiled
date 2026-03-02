import java.io.FileInputStream;
import java.io.InputStream;

public final class arpw implements arrf {
    public final arpz a;
    public final arkm b;

    public arpw(arpz arpz0, arkm arkm0) {
        this.a = arpz0;
        this.b = arkm0;
    }

    @Override  // arrf
    public final InputStream a() {
        return hrnt.i() ? new FileInputStream(ccsb.a.a(((String)this.a.a.get(this.b)))) : new FileInputStream(((String)this.a.a.get(this.b)));
    }
}

