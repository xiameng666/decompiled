final class buti implements ibtx {
    final butr a;

    public buti(butr butr0) {
        this.a = butr0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        butr butr0 = this.a;
        buht buht0 = butr0.b;
        if(buht0 == null) {
            ibuq.j("fragmentArgs");
            buht0 = null;
        }
        String s = buht0.c;
        ibuq.e(s, "getToolbarTitle(...)");
        ((goz)object1).M(5004770);
        boolean z = ((goz)object1).Z(butr0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new buth(butr0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        butr0.B(s, ((ibth)object3), null, ((goz)object1), 0);
        return ibom.a;
    }
}

