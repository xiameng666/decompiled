import android.content.ComponentName;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.significantplaces.settings.DeletablePlacePreference;

public final class epiu implements View.OnClickListener {
    public final DeletablePlacePreference a;

    public epiu(DeletablePlacePreference deletablePlacePreference0) {
        this.a = deletablePlacePreference0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent().setComponent(new ComponentName(this.a.j, "com.google.android.gms.significantplaces.settings.DeletePlaceActivity")).addFlags(0x40000000).addFlags(0x800000).putExtra("place", this.a.a.c).putExtra("name", this.a.a.f);
        ibuq.e(intent0, "putExtra(...)");
        epil.a();
        this.a.j.startActivity(intent0);
    }
}

