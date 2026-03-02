import java.util.List;
import java.util.UUID;

final class dxbo extends ibuo implements ibth {
    public dxbo(Object object0) {
        super(0, object0, dxbp.class, "addCustomField", "addCustomField()V", 0);
    }

    @Override  // ibth
    public final Object a() {
        dxbp dxbp0 = (dxbp)this.e;
        List list0 = dxbp0.f;
        String s = UUID.randomUUID().toString();
        ibuq.e(s, "toString(...)");
        list0.add(new dxcw(s, 0x20, "", "", "", null, false, true, null, null, null, 0x1F60));
        if(dxbp0.K()) {
            if(hwfk.av()) {
                dxbp0.u(dxbp0.n(), dxbp0.G() - 1);
            }
            dxbp0.s(dxbp0.G());
        }
        else {
            dxbp0.w(dxbp0.n() - 1, 2);
            if(hwfk.av()) {
                dxbp0.r(dxbp0.H());
            }
        }
        if(list0.size() == dvkx.a()) {
            dxbp0.r(dxbp0.f());
        }
        return ibom.a;
    }
}

