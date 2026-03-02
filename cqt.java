import androidx.compose.ui.input.pointer.PointerInputEventHandler;

final class cqt implements PointerInputEventHandler {
    final cqu a;

    public cqt(cqu cqu0) {
        this.a = cqu0;
        super();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwo hwo0, ibrl ibrl0) {
        Object object0 = day.a(hwo0, new cqs(this.a, null), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

