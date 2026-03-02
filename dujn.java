import com.google.android.gms.pay.pass.idcard.view.components.MsoDropDown;

final class dujn implements ibtw {
    final MsoDropDown a;

    public dujn(MsoDropDown msoDropDown0) {
        this.a = msoDropDown0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        MsoDropDown msoDropDown0 = this.a;
        dujy dujy0 = msoDropDown0.a();
        ((goz)object0).M(5004770);
        boolean z = ((goz)object0).Z(msoDropDown0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new dujm(msoDropDown0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        dujx.c(dujy0, ((ibts)(((ibwx)object2))), ((goz)object0), 0);
        return ibom.a;
    }
}

