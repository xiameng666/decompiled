import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

final class fndg extends ibsl implements ibtw {
    int a;
    final fndh b;
    final bhbp c;

    public fndg(fndh fndh0, bhbp bhbp0, ibrl ibrl0) {
        this.b = fndh0;
        this.c = bhbp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((fndg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new fndg(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ibuq.f(this.c, "cui");
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{bhbq.a};
            azzc0.d = 36503;
            azzc0.a = new bhbz(this.c);
            azzd azzd0 = azzc0.a();
            evql evql0 = this.b.a.iG(azzd0);
            this.a = 1;
            object0 = ictn.b(evql0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(!ibuq.m(((Status)object0), Status.b) && !ibuq.m(((Status)object0), Status.a)) {
            if(ibuq.m(((Status)object0), Status.e)) {
                sct.e("GmsCuiAdvise", "Failed to advise end of CUI " + this.c + " due to a timeout");
                return fndi.c;
            }
            sct.e("GmsCuiAdvise", "Failed to advise end of CUI " + this.c + " with result code " + ((Status)object0));
            return fndi.d;
        }
        Objects.toString(this.c);
        sct.d("GmsCuiAdvise", "Successfully advised end of CUI " + this.c);
        return fndi.a;
    }
}

