import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

final class dxcq extends ibuo implements ibts {
    public dxcq(Object object0) {
        super(1, object0, dxct.class, "deleteCustomField", "deleteCustomField(Lcom/google/android/gms/pay/pass/valuable/view/ucp/UcpInputItem;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dxcw)object0), "p0");
        dxct dxct0 = (dxct)this.e;
        List list0 = dxct0.f;
        List list1 = null;
        if(list0 == null) {
            ibuq.j("customFieldList");
            list0 = null;
        }
        int v = list0.indexOf(((dxcw)object0));
        if(v >= 0) {
            List list2 = dxct0.f;
            if(list2 == null) {
                ibuq.j("customFieldList");
                list2 = null;
            }
            list2.remove(v);
            if(dxct0.L()) {
                dxct0.y(dxct0.n() + v);
            }
            else {
                dxct0.x(dxct0.n(), 2);
            }
            List list3 = dxct0.f;
            if(list3 == null) {
                ibuq.j("customFieldList");
            }
            else {
                list1 = list3;
            }
            if(list1.size() == dvkx.a() - 1) {
                dxct0.r(dxct0.f());
            }
            AccessibilityManager accessibilityManager0 = dxct0.e;
            if(accessibilityManager0 != null && accessibilityManager0.isEnabled()) {
                AccessibilityEvent accessibilityEvent0 = new AccessibilityEvent();
                accessibilityEvent0.setEventType(0x4000);
                accessibilityEvent0.getText().add("Field removed");
                accessibilityManager0.sendAccessibilityEvent(accessibilityEvent0);
            }
        }
        return ibom.a;
    }
}

