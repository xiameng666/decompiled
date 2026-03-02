import com.google.android.gms.pay.pass.idcard.view.MdocPresentationChimeraActivity;

public final class duid implements evqf {
    public final duie a;

    public duid(duie duie0) {
        this.a = duie0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        duie duie0 = this.a;
        if(!((gtxe)object0).b.isEmpty()) {
            for(Object object1: ((gtxe)object0).b) {
                gtxg gtxg0 = (gtxg)object1;
                gtxd gtxd0 = dual.b(gtxg0);
                boolean z = (gtxb.b(gtxd0.c) == null ? gtxb.n : gtxb.b(gtxd0.c)).equals(gtxb.f);
                MdocPresentationChimeraActivity mdocPresentationChimeraActivity0 = duie0.d;
                boolean z1 = false;
                boolean z2 = Long.compare(gtxg0.c, mdocPresentationChimeraActivity0.u) == 0 && z;
                if(((gtxf.b(gtxg0.h) == null ? gtxf.f : gtxf.b(gtxg0.h)).equals(gtxf.b) || (gtxf.b(gtxg0.h) == null ? gtxf.f : gtxf.b(gtxg0.h)).equals(gtxf.a)) && z) {
                    z1 = true;
                }
                if(!hwmp.y()) {
                    z1 = z;
                }
                if(hwfk.au()) {
                    z = z2;
                }
                if(mdocPresentationChimeraActivity0.n == null) {
                    if(z1) {
                        mdocPresentationChimeraActivity0.o = gtxg0;
                        mdocPresentationChimeraActivity0.m = gtxd0;
                        mdocPresentationChimeraActivity0.g();
                        return;
                    }
                    continue;
                }
                else {
                    if(!z) {
                        continue;
                    }
                    mdocPresentationChimeraActivity0.o = gtxg0;
                    mdocPresentationChimeraActivity0.m = gtxd0;
                    mdocPresentationChimeraActivity0.g();
                    return;
                }
                break;
            }
            new Exception("No FETCHED mDoc available to present.");
            duie0.d.m();
            return;
        }
        new Exception("No available mDocs found for user");
        duie0.d.m();
    }
}

