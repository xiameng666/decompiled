import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

final class dxbm extends ibuo implements ibts {
    public dxbm(Object object0) {
        super(1, object0, dxbp.class, "deleteCustomField", "deleteCustomField(Lcom/google/android/gms/pay/pass/valuable/view/ucp/UcpInputItem;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dxcw)object0), "p0");
        dxbp dxbp0 = (dxbp)this.e;
        List list0 = dxbp0.f;
        int v = list0.indexOf(((dxcw)object0));
        if(v >= 0) {
            list0.remove(v);
            if(dxbp0.K()) {
                dxbp0.y(dxbp0.n() + v);
            }
            else {
                dxbp0.x(dxbp0.n(), 2);
            }
            if(list0.size() == dvkx.a() - 1) {
                dxbp0.r(dxbp0.f());
            }
            AccessibilityManager accessibilityManager0 = dxbp0.e;
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

