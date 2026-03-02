import android.os.Build.VERSION;

final class ddxu implements ibtw {
    final ibtw a;

    public ddxu(ibtw ibtw0) {
        this.a = ibtw0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ddxw ddxw0;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gry[] arr_gry = new gry[2];
        deaa deaa0 = ddxv.b(((goz)object0));
        arr_gry[0] = deac.a.c(deaa0);
        grx grx0 = ddxy.a;
        ((goz)object0).M(0x2DBFD5B3);
        if(Build.VERSION.SDK_INT >= 34) {
            ((goz)object0).M(0xE7076DC7);
            ddxw0 = new ddxw(isi.a(0x10600B4, ((goz)object0)), isi.a(0x10600BE, ((goz)object0)), isi.a(0x10600BF, ((goz)object0)), isi.a(0x10600BD, ((goz)object0)), isi.a(0x10600BC, ((goz)object0)));
        }
        else {
            ((goz)object0).M(0xE70EE427);
            ddxw0 = new ddxw(isi.a(0x106003A, ((goz)object0)), isi.a(0x106005C, ((goz)object0)), isi.a(0x106005A, ((goz)object0)), isi.a(0x1060055, ((goz)object0)), isi.a(0x1060054, ((goz)object0)));
        }
        ((goz)object0).A();
        ((goz)object0).A();
        arr_gry[1] = grx0.c(ddxw0);
        gpo.b(arr_gry, gzf.e(-1630054369, new ddxt(this.a), ((goz)object0)), ((goz)object0), 56);
        return ibom.a;
    }
}

