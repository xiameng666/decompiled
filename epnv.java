import android.content.IntentFilter;
import com.google.android.gms.significantplaces.storage.SignificantPlacesStateFlow;

public final class epnv extends ibsl implements ibtw {
    int a;
    final ibuz b;
    final SignificantPlacesStateFlow c;
    final icck d;

    public epnv(ibuz ibuz0, SignificantPlacesStateFlow significantPlacesStateFlow0, icck icck0, ibrl ibrl0) {
        this.b = ibuz0;
        this.c = significantPlacesStateFlow0;
        this.d = icck0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epnv)this.c(Integer.valueOf(((Number)object0).intValue()), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epnv(this.b, this.c, this.d, ibrl0);
        ibrl1.a = ((Number)object0).intValue();
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        int v = this.a;
        if(v > 0) {
            ibuz ibuz0 = this.b;
            if(!ibuz0.a) {
                synchronized(this.c) {
                    IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.significantplaces.storage.SIGNIFICANT_PLACES_UPDATE");
                    jwe.b(this.c.a, this.c, intentFilter0, 4);
                    ibuz0.a = true;
                    this.c.d();
                }
                return ibom.a;
            }
        }
        if(v == 0) {
            ibuz ibuz1 = this.b;
            if(ibuz1.a) {
                ibuz1.a = false;
                this.c.a.unregisterReceiver(this.c);
                epnu epnu0 = new epnu(this.c, null);
                icbb.b(this.d, null, null, epnu0, 3);
            }
        }
        return ibom.a;
    }
}

