import android.os.Bundle;
import java.util.Set;

public final class kvo extends kvg {
    public final Set d;

    public kvo(Set set0, Bundle bundle0, String s) {
        ibuq.f(set0, "allowedUserIds");
        ibuq.f(bundle0, "candidateQueryData");
        ibuq.f(s, "id");
        super(s, "android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle0);
        this.d = set0;
    }
}

