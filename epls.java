import android.content.Intent;
import androidx.preference.Preference;
import com.google.android.gms.significantplaces.settings.SuggestionPreference;

public final class epls implements ohj {
    public final SuggestionPreference a;
    public final String b;

    public epls(SuggestionPreference suggestionPreference0, String s) {
        this.a = suggestionPreference0;
        this.b = s;
    }

    @Override  // ohj
    public final boolean c(Preference preference0) {
        epil.a();
        epng epng0 = this.a.c;
        double f = (epng0.d == null ? hjij.a : epng0.d).b;
        double f1 = (epng0.d == null ? hjij.a : epng0.d).c;
        String s = epng0.g;
        ibuq.e(s, "getDisplayAddress(...)");
        String s1 = epng0.c;
        ibuq.e(s1, "getPlaceId(...)");
        Intent intent0 = epir.a(this.a.a, f, f1, s, s1, this.b, 3, this.a.d, this.a.e);
        this.a.b.b(intent0);
        return true;
    }
}

