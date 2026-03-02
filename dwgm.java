import android.content.Intent;
import android.graphics.Bitmap;
import java.io.IOException;

final class dwgm extends ibsl implements ibtw {
    int a;
    final dwgo b;
    final dvkz c;

    public dwgm(dwgo dwgo0, dvkz dvkz0, ibrl ibrl0) {
        this.b = dwgo0;
        this.c = dvkz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwgm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwgm(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Bitmap bitmap0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            try {
                bitmap0 = this.c.a(this.b.d);
            }
            catch(IOException iOException0) {
                a.ae(dwgo.a.j(), "Could not open input stream for cached image", iOException0);
                bitmap0 = null;
            }
            if(bitmap0 == null) {
                ((ggtj)dwgo.a.j()).x("Could not get bitmap from cached image for client detection");
                this.b.n();
                return ibom.a;
            }
            this.b.a();
            evql evql0 = dxdy.a(bitmap0);
            this.a = 1;
            object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        if(ibnw.b(object2)) {
            dwgo dwgo0 = this.b;
            gged_interceptors gged0 = ggna.a;
            if((object2 instanceof ibnv)) {
                object2 = gged0;
            }
            gged_interceptors gged1 = gged_interceptors.l(this.c.c);
            ibuq.e(gged1, "of(...)");
            dwgo0.v.b();
            Intent intent0 = dlnf.h(gged1, ((gged_interceptors)object2), dwgo0.u, dwgo0.r, dwgo0.q);
            icck icck0 = lsc.a(dwgo0);
            frxf[] arr_frxf = new frxf[1];
            Intent intent1 = intent0.setFlags(0x6000000);
            ibuq.e(intent1, "setFlags(...)");
            arr_frxf[0] = new frxg(intent1);
            dwgo0.l(icck0, arr_frxf);
            return ibom.a;
        }
        a.ae(dwgo.a.j(), "Detecting passes failed on client", ibnw.a(object2));
        this.b.n();
        return ibom.a;
    }
}

