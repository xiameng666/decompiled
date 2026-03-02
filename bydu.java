import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class bydu extends ibsl implements ibtw {
    int a;
    final List b;
    final byea c;
    final String d;
    final String e;
    final String f;
    final Context g;
    final String h;
    private Object i;

    public bydu(List list0, byea byea0, String s, String s1, String s2, Context context0, String s3, ibrl ibrl0) {
        this.b = list0;
        this.c = byea0;
        this.d = s;
        this.e = s1;
        this.f = s2;
        this.g = context0;
        this.h = s3;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bydu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bydu(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ibrl0);
        ibrl1.i = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.i;
            byea byea0 = this.c;
            String s = this.d;
            String s1 = this.e;
            String s2 = this.f;
            Context context0 = this.g;
            String s3 = this.h;
            ArrayList arrayList0 = new ArrayList(ibpo.q(this.b, 10));
            for(Object object2: this.b) {
                arrayList0.add(icbb.a(icck0, null, null, new bydt(byea0, ((bxxd)object2), s, s1, s2, context0, s3, null), 3));
            }
            this.a = 1;
            object0 = icay.a(arrayList0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return ibpo.ag(((Iterable)object0));
    }
}

