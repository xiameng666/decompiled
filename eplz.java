import android.content.Context;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class eplz implements View.OnClickListener {
    public final epmi a;
    public final Context b;

    public eplz(epmi epmi0, Context context0) {
        this.a = epmi0;
        this.b = context0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        epil.a();
        Intent intent0 = new Intent().setClassName(this.b, "com.google.android.gms.significantplaces.settings.SuggestionListToolbarActivity");
        this.a.startActivity(intent0);
    }
}

