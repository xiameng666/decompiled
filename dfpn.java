final class dfpn implements ibtx {
    final boolean a;
    final ibth b;

    public dfpn(boolean z, ibth ibth0) {
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
        String s = isq.c(0x7F152DC0, goz0);  // string:sharing_visibility_option_everyone "@com.google.android.gms:string/common_everyone"
        String s1 = isq.c(0x7F152DBE, goz0);  // string:sharing_visibility_everyone_description "@com.google.android.gms:string/sharing_settings_everyone_visibility"
        ibth ibth0 = cmig.a(cmhw0, this.b);
        dfqn.k(s, s1, this.a, ibth0, goz0);
        return ibom.a;
    }
}

