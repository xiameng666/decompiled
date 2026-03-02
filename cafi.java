import android.accounts.Account;
import com.google.android.gms.intrusiondetection.storage.database.IntrusionDetectionEventDatabase;

final class cafi extends ibsl implements ibtw {
    int a;
    final cafj b;

    public cafi(cafj cafj0, ibrl ibrl0) {
        this.b = cafj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cafi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cafi(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            IntrusionDetectionEventDatabase intrusionDetectionEventDatabase0 = IntrusionDetectionEventDatabase.m.a(this.b.b);
            caed caed0 = new caed(this.b.b, intrusionDetectionEventDatabase0);
            Account account0 = (Account)this.b.i.b();
            if(account0 == null) {
                ((ggtj)cafj.a.j()).x("Account is null, cannot add to data repository.");
                object2 = ibom.a;
            }
            else {
                String s = account0.name;
                ibuq.e(s, "name");
                caec caec0 = new caec(caed0, s, null);
                object2 = icbd.a(cclw.d, caec0, this);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                if(object2 != object1) {
                    object2 = ibom.a;
                }
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

