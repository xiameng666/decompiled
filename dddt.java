final class dddt implements ibtx {
    final ibth a;
    final hfc b;

    public dddt(ibth ibth0, hfc hfc0) {
        this.a = ibth0;
        this.b = hfc0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        cmhw cmhw0 = (cmhw)object0;
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(cmhw0, "$this$VisualElement");
        String s = isq.c(0x7F152BCC, goz0);  // string:sharing_consent_banner_title "Sharing with contacts is changing"
        String s1 = isq.c(0x7F152BCB, goz0);  // string:sharing_consent_banner_subtitle "Review the changes to help contacts find 
                                              // you"
        ibth ibth0 = cmig.a(cmhw0, this.a);
        ddbu.c(this.b, s, s1, ibth0, ddcl.e, goz0, 0x6000);
        return ibom.a;
    }
}

