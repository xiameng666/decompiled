import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

final class dell implements ibtw {
    final List a;

    public dell(List list0) {
        this.a = list0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ((goz)object0).M(0x87ADBD0);
        Context context0 = (Context)((goz)object0).h(AndroidCompositionLocals_androidKt.b);
        ((goz)object0).A();
        fiuk.b(djbr.r(context0, this.a.size(), this.a), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((goz)object0), 0, 0, 0x3FFFE);
        return ibom.a;
    }
}

