import android.content.Intent;
import com.google.android.gms.significantplaces.settings.SuggestionListToolbarChimeraActivity;

public final class epln implements ibts {
    public final acp a;
    public final SuggestionListToolbarChimeraActivity b;

    public epln(acp acp0, SuggestionListToolbarChimeraActivity suggestionListToolbarChimeraActivity0) {
        this.a = acp0;
        this.b = suggestionListToolbarChimeraActivity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((epng)object0), "item");
        epil.a();
        hjij hjij0 = ((epng)object0).d;
        if(hjij0 == null) {
            hjij0 = hjij.a;
        }
        double f = hjij0.b;
        hjij hjij1 = ((epng)object0).d;
        if(hjij1 == null) {
            hjij1 = hjij.a;
        }
        double f1 = hjij1.c;
        String s = ((epng)object0).g;
        ibuq.e(s, "getDisplayAddress(...)");
        String s1 = ((epng)object0).c;
        ibuq.e(s1, "getPlaceId(...)");
        String s2 = ((epng)object0).f;
        ibuq.e(s2, "getDisplayName(...)");
        Intent intent0 = epir.b(this.b, f, f1, s, s1, s2, 2);
        this.a.b(intent0);
        return ibom.a;
    }
}

