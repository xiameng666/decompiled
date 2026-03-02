final class dfpr implements ibtx {
    final String a;
    final boolean b;
    final ibth c;

    public dfpr(String s, boolean z, ibth ibth0) {
        this.a = s;
        this.b = z;
        this.c = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        cmhw cmhw0 = (cmhw)object0;
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(cmhw0, "$this$VisualElement");
        String s = isq.c(0x7F152DC3, goz0);  // string:sharing_visibility_option_self "Your devices"
        String s1 = isq.d(0x7F152DC4, new Object[]{this.a}, goz0);  // string:sharing_visibility_self_description "Only devices signed in to %1$s"
        ibth ibth0 = cmig.a(cmhw0, this.c);
        dfqn.k(s, s1, this.b, ibth0, goz0);
        return ibom.a;
    }
}

