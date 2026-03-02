import java.util.Iterator;

final class duxy extends ibsl implements ibtw {
    final duyb a;
    final String b;

    public duxy(duyb duyb0, String s, ibrl ibrl0) {
        this.a = duyb0;
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((duxy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new duxy(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        hkas hkas0;
        String s;
        ibnx.b(object0);
        duyb duyb0 = this.a;
        hkam hkam0 = duyb0.b.c();
        bboh bboh0 = duyb.a;
        ((ggtj)bboh0.h()).z("Got %d supported issuers when starting push provisioning", hkam0.b.size());
        Iterator iterator0 = hkam0.b.iterator();
        do {
            s = this.b;
            if(!iterator0.hasNext()) {
                goto label_14;
            }
            Object object1 = iterator0.next();
            hkas0 = (hkas)object1;
            ((ggtj)bboh0.h()).R("Got %s issuer. Checking for match with %s issuer id", hkas0.e, s);
        }
        while(!ibuq.m(hkas0.e, s));
        ((ggtj)bboh0.h()).x("Got a matching issuer. Returning");
        goto label_16;
    label_14:
        ((ggtj)bboh0.j()).B("Could not find matching issuer for issuer id: %s", s);
        hkas0 = null;
    label_16:
        if(hkas0 == null) {
            duxk duxk0 = duxk.a(((duxk)duyb0.h.b()), null, null, false, new IllegalStateException("No supported issuers found."), null, false, 51);
            duyb0.h.g(duxk0);
            return ibom.a;
        }
        duxk duxk1 = duxk.a(((duxk)duyb0.h.b()), hkas0, null, false, null, null, false, 58);
        duyb0.h.g(duxk1);
        return ibom.a;
    }
}

