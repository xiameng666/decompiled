final class ftui implements ibtw {
    final CharSequence a;

    public ftui(CharSequence charSequence0) {
        this.a = charSequence0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hfc hfc0 = dls.k(hfc.e, fbz.f);
        ((goz)object0).M(5004770);
        CharSequence charSequence0 = this.a;
        boolean z = ((goz)object0).Z(charSequence0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new ftuh(charSequence0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        fwy.g(iuc.d(hfc0, ((ibts)object2)), fpu.a(((goz)object0)).f, 2.0f, fpu.a(((goz)object0)).r, 0, 0.0f, ((goz)object0), 0x180, 0x30);
        return ibom.a;
    }
}

