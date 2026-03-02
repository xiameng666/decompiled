import androidx.compose.ui.input.pointer.PointerInputEventHandler;

final class csb implements PointerInputEventHandler {
    final csc a;

    public csb(csc csc0) {
        this.a = csc0;
        super();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwo hwo0, ibrl ibrl0) {
        Object object0 = den.g(hwo0, new csa(this.a, null), new crz(this.a), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

