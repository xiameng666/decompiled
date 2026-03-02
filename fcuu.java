import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;
import j..util.Objects;

final class fcuu implements gmbg {
    final WearBackupSettingsChimeraActivity a;

    public fcuu(WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0) {
        Objects.requireNonNull(wearBackupSettingsChimeraActivity0);
        this.a = wearBackupSettingsChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        WearBackupSettingsChimeraActivity.j.n("Failed to openOnPhone.", throwable0, new Object[0]);
        ComposeView composeView0 = (ComposeView)this.a.findViewById(0x7F0B0F7C);  // id:compose_view
        ibuq.f(composeView0, "composeView");
        ibuq.f("Please try again later", "title");
        composeView0.a(new gze(0xEF3E8FAB, true, new fcqa(new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a), "Please try again later")));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        WearBackupSettingsChimeraActivity.j.h("Finished openOnPhone.", new Object[0]);
        ComposeView composeView0 = (ComposeView)this.a.findViewById(0x7F0B0F7C);  // id:compose_view
        ibuq.f(composeView0, "composeView");
        ibuq.f("Open on phone", "title");
        composeView0.a(new gze(0x2033E871, true, new fcqd(new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a), "Open on phone")));
    }
}

