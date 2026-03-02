import androidx.activity.result.ActivityResult;
import com.google.android.gms.significantplaces.settings.SuggestionListToolbarChimeraActivity;

public final class epll implements acn {
    public final SuggestionListToolbarChimeraActivity a;

    public epll(SuggestionListToolbarChimeraActivity suggestionListToolbarChimeraActivity0) {
        this.a = suggestionListToolbarChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "result");
        if(((ActivityResult)object0).a == -1) {
            epil.b(this.a);
        }
    }
}

