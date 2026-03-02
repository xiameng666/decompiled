import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import java.util.Locale;

public final class crwp {
    public static final void a(int v, ConsentStatus consentStatus0) {
        if(!ConsentStatus.b(v)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Illegal EnumVal value %d", v));
        }
        consentStatus0.a = v;
    }
}

