import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class eplx implements View.OnClickListener {
    public final epmi a;

    public eplx(epmi epmi0) {
        this.a = epmi0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        epil.a();
        Intent intent0 = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        this.a.startActivity(intent0);
    }
}

