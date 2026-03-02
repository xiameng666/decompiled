import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.significantplaces.settings.SuggestionListChimeraActivity;

public final class epku implements View.OnClickListener {
    public final SuggestionListChimeraActivity a;
    public final EditText b;

    public epku(SuggestionListChimeraActivity suggestionListChimeraActivity0, EditText editText0) {
        this.a = suggestionListChimeraActivity0;
        this.b = editText0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SuggestionListChimeraActivity suggestionListChimeraActivity0 = this.a;
        du du0 = suggestionListChimeraActivity0.getSupportFragmentManager().g(0x7F0B2186);  // id:suggestions
        if(du0 != null && (du0 instanceof epjk)) {
            ca ca0 = new ca(suggestionListChimeraActivity0.getSupportFragmentManager());
            ca0.G(0x7F0B2186, new eplj());  // id:suggestions
            ca0.a();
            this.b.setText("");
            this.b.clearFocus();
            return;
        }
        epil.b(suggestionListChimeraActivity0);
    }
}

