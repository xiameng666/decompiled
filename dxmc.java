import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;

public final class dxmc implements ibts {
    public final dxme a;

    public dxmc(dxme dxme0) {
        this.a = dxme0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        dxme dxme0 = this.a;
        if(dxme0.an != null && hwfk.aj()) {
            fuat fuat0 = dxme0.an.g();
            if(!(fuat0.d instanceof fubx)) {
                return ibom.a;
            }
            RowSecondary rowSecondary0 = dxme0.an;
            gftb.check(rowSecondary0);
            rowSecondary0.h(fuat0.c(z));
            return ibom.a;
        }
        return ibom.a;
    }
}

