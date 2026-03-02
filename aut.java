import java.util.ArrayList;
import java.util.List;

public final class aut implements akp {
    public final auy a;

    public aut(auy auy0) {
        this.a = auy0;
    }

    @Override  // akp
    public final Object a(Object object0) {
        Void void0 = (Void)object0;
        auy auy0 = this.a;
        if(auy0.k == 2) {
            List list0 = auy0.h.g();
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: list0) {
                kay.b(((bka)object1) instanceof bmd, "Surface must be SessionProcessorSurface");
                arrayList0.add(((bmd)(((bka)object1))));
            }
            auy0.g = new aso(auy0.d, arrayList0);
            bcs.h("ProcessingCaptureSession");
            auy0.b.f();
            auy0.k = 3;
            bmb bmb0 = auy0.f;
            if(bmb0 != null) {
                auy0.i(bmb0);
            }
            if(auy0.i != null) {
                auy0.g(auy0.i);
                auy0.i = null;
            }
        }
        return null;
    }
}

