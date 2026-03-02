import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class dvju {
    public final Context a;
    public final edln b;
    public final gmcg c;
    public final dyda d;
    public final SimpleDateFormat e;

    public dvju(Context context0, edln edln0, gmcg gmcg0, dyda dyda0) {
        this.e = new SimpleDateFormat("MMM dd, h:mm a", Locale.getDefault());
        this.a = context0;
        this.b = edln0;
        this.c = gmcg0;
        this.d = dyda0;
    }
}

