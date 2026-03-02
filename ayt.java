import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;

public final class ayt {
    private final TorchFlashRequiredFor3aUpdateQuirk a;

    public ayt(blp blp0) {
        this.a = (TorchFlashRequiredFor3aUpdateQuirk)blp0.a(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public final boolean a() {
        boolean z = this.a != null && aow.b(this.a.b, 5) != 5;
        bcs.h("UseFlashModeTorchFor3aUpdate");
        return z;
    }
}

