import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class bvdn implements ibtx {
    final bvgc a;

    public bvdn(bvgc bvgc0) {
        this.a = bvgc0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((clzq)object0), "$this$MoreOptionsAction");
        if((v & 6) == 0) {
            v |= (((v & 8) == 0 ? ((goz)object1).X(((clzq)object0)) : ((goz)object1).Z(((clzq)object0))) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        Context context0 = (Context)((goz)object1).h(AndroidCompositionLocals_androidKt.b);
        for(Object object3: this.a.b) {
            gze gze0 = gzf.e(0x2A83F81B, new bvdm(((bvfz)object3), ((clzq)object0), context0), ((goz)object1));
            cmig.g(((bvfz)object3).c, gze0, ((goz)object1), 0x30);
        }
        return ibom.a;
    }
}

