import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;

public final class ctpz implements ibth {
    public final ibvd a;
    public final gra b;
    public final gra c;

    public ctpz(ibvd ibvd0, gra gra0, gra gra1) {
        this.a = ibvd0;
        this.b = gra0;
        this.c = gra1;
    }

    @Override  // ibth
    public final Object a() {
        DeviceLinkDebugChimeraActivity.i(this.b, false);
        ((SnapshotStateList)this.a.a).clear();
        gra gra0 = this.c;
        iced iced0 = (iced)gra0.a();
        if(iced0 != null) {
            iceb.a(iced0);
        }
        DeviceLinkDebugChimeraActivity.j(gra0, null);
        return ibom.a;
    }
}

