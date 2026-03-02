import androidx.compose.ui.input.pointer.PointerInputEventHandler;

final class bylq implements PointerInputEventHandler {
    final ibth a;

    public bylq(ibth ibth0) {
        this.a = ibth0;
        super();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwo hwo0, ibrl ibrl0) {
        Object object0 = den.d(hwo0, new bylp(this.a), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

