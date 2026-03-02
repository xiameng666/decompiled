final class dfps implements ibtx {
    final boolean a;
    final ibth b;

    public dfps(boolean z, ibth ibth0) {
        this.a = z;
        this.b = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        cmhw cmhw0 = (cmhw)object0;
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(cmhw0, "$this$VisualElement");
        Integer integer0 = (int)10;
        String s = isq.b(0x7F13008B, 10, new Object[]{integer0}, goz0);  // plurals:sharing_visibility_option_temporary_everyone
        String s1 = isq.b(0x7F130085, 10, new Object[]{integer0}, goz0);  // plurals:sharing_setting_everyone_temporary_description
        ibth ibth0 = cmig.a(cmhw0, this.b);
        dfqn.k(s, s1, this.a, ibth0, goz0);
        return ibom.a;
    }
}

