import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;

public final class epma implements ohj {
    public final epmi a;
    public final Context b;

    public epma(epmi epmi0, Context context0) {
        this.a = epmi0;
        this.b = context0;
    }

    @Override  // ohj
    public final boolean c(Preference preference0) {
        epil.a();
        Intent intent0 = new Intent().setClassName(this.b, "com.google.android.gms.significantplaces.settings.SuggestionListActivity");
        this.a.startActivity(intent0);
        return true;
    }
}

