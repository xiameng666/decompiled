final class dece implements ibtx {
    final ibth a;
    final decl b;
    final ibts c;

    public dece(ibth ibth0, decl decl0, ibts ibts0) {
        this.a = ibth0;
        this.b = decl0;
        this.c = ibts0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        String s = isq.c(0x7F152D12, ((goz)object1));  // string:sharing_settings_contacts_title "Contacts"
        ((goz)object1).M(-1633490746);
        decl decl0 = this.b;
        int v = ((goz)object1).Z(decl0);
        ibts ibts0 = this.c;
        int v1 = v | ((goz)object1).X(ibts0);
        Object object3 = ((goz)object1).k();
        if(v1 != 0 || object3 == gop.a) {
            object3 = new deca(decl0, ibts0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        ddzs.c(s, this.a, null, null, null, ((ibts)object3), ((goz)object1), 0);
        return ibom.a;
    }
}

