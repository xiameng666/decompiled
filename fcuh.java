import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class fcuh implements glzn {
    public final WearBackupSettingsChimeraActivity a;

    public fcuh(WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0) {
        this.a = wearBackupSettingsChimeraActivity0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        WearBackupSettingsChimeraActivity.j.h("localNodeId= " + ((NodeParcelable)object0), new Object[0]);
        Intent intent0 = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE");
        intent0.setData(Uri.parse(("https://one.google.com/watch_backup_settings/" + ((NodeParcelable)object0).a)));
        pxf pxf0 = this.a.z.a;
        ibuq.f(intent0, "targetIntent");
        ibuq.f(intent0, "targetIntent");
        pxg pxg0 = pxf0.d;
        if(pxg0.b) {
            return jqy.a(new pwv(intent0, pxg0, pxf0.b));
        }
        ibuq.f(intent0, "targetIntent");
        return jqy.a(new pwu(pxf0, intent0));
    }
}

