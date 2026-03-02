import android.content.Intent;
import java.util.List;

final class bdkx extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final bdla f;

    public bdkx(bdla bdla0, ibrl ibrl0) {
        this.f = bdla0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdkx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bdkx(this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object7;
        Object object6;
        Object object5;
        Object object4;
        Object object3;
        icnl icnl0;
        Object object1 = ibrx.a;
        if(this.e == 0) {
            ibnx.b(object0);
            bdla bdla0 = this.f;
            do {
                icnl0 = bdla0.h;
                Object object8 = icnl0.b();
                bdsg bdsg0 = (bdsg)object8;
                bdsg bdsg1 = (bdsg0 instanceof bdsf) ? bdsg0 : null;
                if(((bdsf)bdsg1) == null) {
                    ((ggtj)bdla.a.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdsg0.getClass()).c(), new ibuk(bdsf.class).c());
                }
                else {
                    ibuq.f(((bdsf)bdsg1).g, "passwords");
                    ibuq.f(((bdsf)bdsg1).h, "passkeys");
                    bdsg0 = new bdsf(((bdsf)bdsg1).a, ((bdsf)bdsg1).b, ((bdsf)bdsg1).c, ((bdsf)bdsg1).d, ((bdsf)bdsg1).e, ((bdsf)bdsg1).f, ((bdsf)bdsg1).g, ((bdsf)bdsg1).h, true);
                }
            }
            while(!icnl0.h(object8, bdsg0));
            object5 = bdla0;
            object4 = icnl0;
        }
        else {
            Object object2 = this.d;
            object3 = this.c;
            object4 = this.b;
            object5 = this.a;
            ibnx.b(object0);
            object6 = object2;
            object7 = object0;
            goto label_41;
        }
        do {
            object3 = ((icnl)object4).b();
            Object object9 = (bdsg)object3;
            object6 = (bdsf)((object9 instanceof bdsf) ? object9 : null);
            if(object6 == null) {
                ((ggtj)bdla.a.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(object9.getClass()).c(), new ibuk(bdsf.class).c());
            }
            else {
                ((bdla)object5).a();
                this.a = object5;
                this.b = object4;
                this.c = object3;
                this.d = object6;
                this.e = 1;
                List list0 = ibpo.b(new bxwh(object6.d, object6.g, object6.h));
                object7 = ((bdla)object5).b.c.a(list0) == null ? null : new Intent();
                if(object7 != object1) {
                label_41:
                    if(((Intent)object7) == null) {
                        object9 = bdsb.a;
                    }
                    else {
                        ((bdla)object5).d.l(((Intent)object7));
                        object9 = object6;
                    }
                    continue;
                }
                return object1;
            }
        }
        while(!((icnl)object4).h(object3, object9));
        return ibom.a;
    }
}

