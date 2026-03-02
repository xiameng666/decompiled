import com.google.android.gms.significantplaces.api.SignificantPlacesApiService;
import java.io.PrintWriter;

public final class epgc extends ibsl implements ibtw {
    int a;
    final SignificantPlacesApiService b;
    final PrintWriter c;

    public epgc(SignificantPlacesApiService significantPlacesApiService0, PrintWriter printWriter0, ibrl ibrl0) {
        this.b = significantPlacesApiService0;
        this.c = printWriter0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epgc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epgc(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            epgj epgj0 = this.b.a;
            if(epgj0 == null) {
                ibuq.j("significantPlacesImpl");
                epgj0 = null;
            }
            bbpd bbpd0 = new bbpd(this.c, "  ");
            this.a = 1;
            if(epgj0.b(bbpd0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

