import java.util.List;

final class dwjq extends ibuo implements ibth {
    public dwjq(Object object0) {
        super(0, object0, dwjx.class, "onSaveUcpV2PassSpecific", "onSaveUcpV2PassSpecific()V", 0);
    }

    @Override  // ibth
    public final Object a() {
        dwjx dwjx0 = (dwjx)this.e;
        gvcd gvcd0 = dwjx0.Z();
        gvcd gvcd1 = dwjx0.T().c();
        if(gvcd1 == null) {
            ((ggtj)dwjx.an.j()).x("Empty input form for UCPv2");
            dwjx0.ar();
            return ibom.a;
        }
        ibuq.f(gvcd0, "updatedInputForm");
        if(gvcd1.h.size() == gvcd0.h.size()) {
            hfuo hfuo0 = gvcd1.h;
            ibuq.e(hfuo0, "getInputFieldList(...)");
            hfuo hfuo1 = gvcd0.h;
            ibuq.e(hfuo1, "getInputFieldList(...)");
            List list0 = ibpo.au(hfuo0, hfuo1);
            if(!list0.isEmpty()) {
                for(Object object0: list0) {
                    gvcc gvcc0 = (gvcc)((ibns)object0).a;
                    gvcc gvcc1 = (gvcc)((ibns)object0).b;
                    if(ibuq.m(gvcc0.f, gvcc1.f) && ibuq.m(gvcc0.g, gvcc1.g)) {
                        continue;
                    }
                    goto label_25;
                }
            }
            ((ggtj)dwjx.an.h()).x("No changes to save, back to valuable detail screen");
            dwjx0.af(dwjx0.T().g());
            return ibom.a;
        }
    label_25:
        dwkl dwkl0 = dwjx0.T();
        if(dwkl0.l() && (dwkl0.e.i().i() && ((gvcd)dwkl0.e.i().d()).g)) {
            dwjx0.N();
            return ibom.a;
        }
        dwjx0.T().k(gvcd0);
        return ibom.a;
    }
}

