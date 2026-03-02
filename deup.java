final class deup implements ibtx {
    final cusz a;
    final ibts b;
    final boolean c;

    public deup(cusz cusz0, ibts ibts0, boolean z) {
        this.a = cusz0;
        this.b = ibts0;
        this.c = z;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        ddzu.a(isq.c(0x7F152CF7, goz0), goz0, 0);  // string:sharing_send_other_device_label "Send to nearby devices"
        cutk.a(this.a, this.b, this.c, null, goz0, 0);
        return ibom.a;
    }
}

