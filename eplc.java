import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class eplc implements View.OnClickListener {
    public final eplj a;

    public eplc(eplj eplj0) {
        this.a = eplj0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        epil.a();
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(this.a.getString(0x7F15343A)));  // string:trusted_places_learn_more_url "https://support.google.com/android?p=trusted_places"
        this.a.startActivity(intent0);
    }
}

