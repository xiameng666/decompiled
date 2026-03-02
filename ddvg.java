import com.google.android.chimera.android.Activity;
import java.util.List;

public final class ddvg implements ibts {
    public final Activity a;
    public final nry b;

    public ddvg(nry nry0, Activity activity0) {
        this.b = nry0;
        this.a = activity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        nte nte0 = (nte)object0;
        ibuq.f(nte0, "$this$NavHost");
        ddvj ddvj0 = new ddvj();
        nri nri0 = new nri();
        ddvj0.a(nri0);
        List list0 = ibpo.b(new nre(nri0.a.a()));
        gze gze0 = new gze(0xE358D0D2, true, new ddvo(this.b, this.a));
        nvr.a(nte0, ddwi.a.b, list0, null, null, null, null, gze0, 0xFC);
        gze gze1 = new gze(0x67F5C489, true, new ddvx(this.b, this.a));
        nvr.a(nte0, ddwj.a.b, null, null, null, null, null, gze1, 0xFE);
        gze gze2 = new gze(0x76D1744A, true, new ddwa(this.b, this.a));
        nvr.a(nte0, ddwl.a.b, null, null, null, null, null, gze2, 0xFE);
        gze gze3 = new gze(-2052250613, true, new ddwc(this.b, this.a));
        nvr.a(nte0, ddwh.a.b, null, null, null, null, null, gze3, 0xFE);
        gze gze4 = new gze(-1802972212, true, new ddwf(this.b, this.a));
        nvr.a(nte0, ddwk.a.b, null, null, null, null, null, gze4, 0xFE);
        return ibom.a;
    }
}

