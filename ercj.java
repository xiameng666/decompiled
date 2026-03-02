import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.smartdevice.quickstart.ui.RestoreAnytimeHalfSheetChimeraActivity;

public final class ercj implements View.OnClickListener {
    public final RestoreAnytimeHalfSheetChimeraActivity a;

    public ercj(RestoreAnytimeHalfSheetChimeraActivity restoreAnytimeHalfSheetChimeraActivity0) {
        this.a = restoreAnytimeHalfSheetChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        RestoreAnytimeHalfSheetChimeraActivity restoreAnytimeHalfSheetChimeraActivity0 = this.a;
        fgss fgss0 = restoreAnytimeHalfSheetChimeraActivity0.h;
        if(fgss0 != null) {
            fgss0.a();
        }
        Intent intent0 = new Intent("com.google.android.gms.smartdevice.quickstart.SOURCE_DEVICE_SETUP");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtras(restoreAnytimeHalfSheetChimeraActivity0.getIntent());
        intent0.putExtra("trigger_flow_type", 2);
        restoreAnytimeHalfSheetChimeraActivity0.startActivity(intent0);
        restoreAnytimeHalfSheetChimeraActivity0.finish();
    }
}

