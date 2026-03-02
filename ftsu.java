import com.google.android.libraries.tapandpay.ui.bulletin.Bulletin;

final class ftsu implements ibtw {
    final Bulletin a;

    public ftsu(Bulletin bulletin0) {
        this.a = bulletin0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        Bulletin bulletin0 = this.a;
        Object object2 = ((goz)object0).k();
        if(object2 == gop.a) {
            object2 = gqe.a(ibru.a, ((goz)object0));
            ((goz)object0).R(object2);
        }
        bulletin0.c = (icck)object2;
        bulletin0.b = fsr.e(true, ((goz)object0), 6, 2);
        if(bulletin0.c()) {
            ftvr ftvr0 = (ftvr)bulletin0.a.a();
            fyx fyx0 = bulletin0.b;
            if(fyx0 == null) {
                ibuq.j("sheetState");
                fyx0 = null;
            }
            ftsz.a(ftvr0, fyx0, ((goz)object0), 8);
        }
        return ibom.a;
    }
}

