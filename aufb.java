import android.content.Intent;
import com.google.android.gms.cast.devicesuggestions.service.SuggestionsInitIntentOperation;

public final class aufb implements ibth {
    public final SuggestionsInitIntentOperation a;
    public final Intent b;

    public aufb(SuggestionsInitIntentOperation suggestionsInitIntentOperation0, Intent intent0) {
        this.a = suggestionsInitIntentOperation0;
        this.b = intent0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.stopService(this.b);
        return ibom.a;
    }
}

