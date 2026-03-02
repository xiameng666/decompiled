import android.content.ComponentName;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class eply implements View.OnClickListener {
    public final epmi a;

    public eply(epmi epmi0) {
        this.a = epmi0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.location.settings.LOCATION_ACCURACY");
        intent0.setComponent(new ComponentName(this.a.requireContext(), "com.google.android.gms.location.settings.LocationAccuracyV31Activity"));
        intent0.setFlags(0x10000000);
        epil.a();
        this.a.startActivity(intent0);
    }
}

