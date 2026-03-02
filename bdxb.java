final class bdxb implements ibtw {
    final String a;
    final String b;

    public bdxb(String s, String s1) {
        this.a = s;
        this.b = s1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        hfc hfc0;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        String s = this.a;
        ((goz)object0).M(0xE16939E9);
        String s1 = this.b;
        if(s1 == null) {
            hfc0 = hfc.e;
        }
        else {
            hey hey0 = hfc.e;
            ((goz)object0).M(5004770);
            boolean z = ((goz)object0).X(s1);
            Object object2 = ((goz)object0).k();
            if(z || object2 == gop.a) {
                object2 = new bdxa(s1);
                ((goz)object0).R(object2);
            }
            ((goz)object0).A();
            hfc0 = iuc.d(hey0, ((ibts)object2));
        }
        ((goz)object0).A();
        gdh.b(s, hfc0, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((goz)object0), 0, 0, 0x3FFFC);
        return ibom.a;
    }
}

