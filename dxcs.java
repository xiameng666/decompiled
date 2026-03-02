import java.util.List;
import java.util.UUID;

final class dxcs extends ibuo implements ibth {
    public dxcs(Object object0) {
        super(0, object0, dxct.class, "addCustomField", "addCustomField()V", 0);
    }

    @Override  // ibth
    public final Object a() {
        dxct dxct0 = (dxct)this.e;
        boolean z = dxct0.L();
        List list0 = dxct0.f;
        List list1 = null;
        if(list0 == null) {
            ibuq.j("customFieldList");
            list0 = null;
        }
        String s = UUID.randomUUID().toString();
        ibuq.e(s, "toString(...)");
        list0.add(new dxcw(s, 0x20, "", "", "", null, false, true, null, null, null, 0x1F60));
        if(z) {
            if(hwfk.av()) {
                dxct0.u(dxct0.n(), dxct0.G() - 1);
            }
            dxct0.s(dxct0.G());
        }
        else {
            dxct0.w(dxct0.n() - 1, 2);
            if(hwfk.av()) {
                dxct0.r(dxct0.H());
            }
        }
        List list2 = dxct0.f;
        if(list2 == null) {
            ibuq.j("customFieldList");
        }
        else {
            list1 = list2;
        }
        if(list1.size() == dvkx.a()) {
            dxct0.r(dxct0.f());
        }
        return ibom.a;
    }
}

