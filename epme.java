import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class epme implements View.OnClickListener {
    public final epmi a;

    public epme(epmi epmi0) {
        this.a = epmi0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        epil.a();
        String s = this.a.getString(0x7F15343A);  // string:trusted_places_learn_more_url "https://support.google.com/android?p=trusted_places"
        ibuq.e(s, "getString(...)");
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
        this.a.startActivity(intent0);
    }
}

