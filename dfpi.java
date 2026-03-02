final class dfpi implements ibtx {
    final ibth a;
    final boolean b;

    public dfpi(ibth ibth0, boolean z) {
        this.a = ibth0;
        this.b = z;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        cmhw cmhw0 = (cmhw)object0;
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(cmhw0, "$this$VisualElement");
        String s = isq.c(0x7F152DBF, goz0);  // string:sharing_visibility_option_contacts "@com.google.android.gms:string/common_people_settings_title"
        String s1 = isq.c(0x7F152D0C, goz0);  // string:sharing_settings_button_account_name_not_found_description "Tap to choose 
                                              // an account"
        ibth ibth0 = cmig.a(cmhw0, this.a);
        ddzz.b(s, cru.d(hfc.e, false, null, null, null, ibth0, 15), s1, gzf.e(0x64CCD9A3, new dfph(this.b), goz0), null, goz0, 0xC00, 16);
        return ibom.a;
    }
}

