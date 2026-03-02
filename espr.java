import android.content.Context;
import android.content.ContextWrapper;

public final class espr extends ContextWrapper {
    public espr(Context context0) {
        super(context0.createConfigurationContext(context0.getResources().getConfiguration()));
    }

    @Override  // android.content.ContextWrapper
    public final Context getApplicationContext() {
        return this;
    }
}

