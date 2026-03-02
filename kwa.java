import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import j..time.Instant;
import java.util.Map;

public final class kwa {
    public final CharSequence a;
    public final PendingIntent b;
    public final Icon c;
    public final CharSequence d;
    public final Instant e;
    public final Map f;
    public final boolean g;
    public final kvs h;

    public kwa(CharSequence charSequence0, PendingIntent pendingIntent0, Icon icon0, CharSequence charSequence1, Instant instant0, Map map0, boolean z) {
        this(charSequence0, pendingIntent0, icon0, charSequence1, instant0, map0, z, null);
    }

    public kwa(CharSequence charSequence0, PendingIntent pendingIntent0, Icon icon0, CharSequence charSequence1, Instant instant0, Map map0, boolean z, kvs kvs0) {
        ibuq.f(charSequence0, "accountName");
        ibuq.f(pendingIntent0, "pendingIntent");
        ibuq.f(map0, "credentialCountInformationMap");
        super();
        this.a = charSequence0;
        this.b = pendingIntent0;
        this.c = icon0;
        this.d = charSequence1;
        this.e = instant0;
        this.f = map0;
        this.g = z;
        this.h = kvs0;
        if(charSequence0.length() <= 0) {
            throw new IllegalArgumentException("accountName must not be empty");
        }
        if(charSequence1 != null && charSequence1.length() > 300) {
            throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
        }
    }
}

