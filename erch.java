import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.smartdevice.quickstart.ui.QuickStartHalfSheetChimeraActivity;

public final class erch implements View.OnClickListener {
    public final QuickStartHalfSheetChimeraActivity a;

    public erch(QuickStartHalfSheetChimeraActivity quickStartHalfSheetChimeraActivity0) {
        this.a = quickStartHalfSheetChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        QuickStartHalfSheetChimeraActivity quickStartHalfSheetChimeraActivity0 = this.a;
        fgss fgss0 = quickStartHalfSheetChimeraActivity0.h;
        if(fgss0 != null) {
            fgss0.a();
        }
        Intent intent0 = new Intent("com.google.android.gms.smartdevice.quickstart.SOURCE_DEVICE_SETUP");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtras(quickStartHalfSheetChimeraActivity0.getIntent());
        intent0.putExtra("trigger_flow_type", 1);
        quickStartHalfSheetChimeraActivity0.startActivity(intent0);
        quickStartHalfSheetChimeraActivity0.finish();
    }
}

