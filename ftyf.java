import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class ftyf implements ibtx {
    final gui a;

    public ftyf(gui gui0) {
        this.a = gui0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$PassListItemCard");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = hlv.c(dls.v(hfc.e), 0.0f, 0.0f, ((Number)this.a.a()).floatValue(), 0.0f, null, false, 0x7FFFB);
        fen fen0 = fpu.a(((goz)object1));
        Context context0 = (Context)((goz)object1).h(AndroidCompositionLocals_androidKt.b);
        ibuq.f(fen0, "<this>");
        ibuq.f(context0, "context");
        ((goz)object1).M(0x2F9CECD4);
        long v1 = hln.c(fipw.d.a(context0));
        ((goz)object1).A();
        dhw.d(cqx.c(hfc0, v1), ((goz)object1), 0);
        return ibom.a;
    }
}

