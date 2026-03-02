import java.text.SimpleDateFormat;
import java.util.Locale;

public final class bahc implements ibth {
    @Override  // ibth
    public final Object a() {
        return new SimpleDateFormat("MM-dd HH:mm:ss", Locale.getDefault());
    }
}

