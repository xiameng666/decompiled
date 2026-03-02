final class devc implements ibtx {
    final deco a;
    final ibts b;
    final hpw c;
    final hpw d;

    public devc(deco deco0, ibts ibts0, hpw hpw0, hpw hpw1) {
        this.a = deco0;
        this.b = ibts0;
        this.c = hpw0;
        this.d = hpw1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$NavigationBar");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dlp)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        cmig.f(0x403A5, gzf.e(-159603481, new deuy(this.a, this.b, ((dlp)object0), this.c), ((goz)object1)), ((goz)object1), 54);
        cmig.f(0x403A6, gzf.e(0xEB8A7A50, new devb(this.a, this.b, ((dlp)object0), this.d), ((goz)object1)), ((goz)object1), 54);
        return ibom.a;
    }
}

