import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class irt extends ibur implements ibtw {
    final irw a;
    final ibtw b;

    public irt(irw irw0, ibtw ibtw0) {
        this.a = irw0;
        this.b = ibtw0;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if(((goz)object0).ad((v & 3) != 2, v & 1)) {
            AndroidCompositionLocals_androidKt.c(this.a.a, this.b, ((goz)object0), 0);
            return ibom.a;
        }
        ((goz)object0).G();
        return ibom.a;
    }
}

