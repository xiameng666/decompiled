import com.google.android.gms.actionlearner.ActionRequest;
import com.google.android.gms.common.Feature;

public final class auey extends ibsl implements ibtw {
    int a;
    final auez b;
    final String c;
    final String d;

    public auey(auez auez0, String s, String s1, ibrl ibrl0) {
        this.b = auez0;
        this.c = s;
        this.d = s1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((auey)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new auey(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            auew auew0 = new auew(this.c, this.d);
            this.a = 1;
            aaxb aaxb0 = new aaxb();
            auew0.a(aaxb0);
            ActionRequest actionRequest0 = new ActionRequest(aaxb0.a);
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{aaxe.a};
            azzc0.d = 0x9025;
            azzc0.a = new aaxu(actionRequest0);
            azzd azzd0 = azzc0.a();
            Object object2 = ictn.b(this.b.e.a.jn(azzd0), this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

