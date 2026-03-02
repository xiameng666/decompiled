import com.google.android.gms.auth.authzen.PermitAccess;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class aihn {
    public String a;
    public String b;
    public String c;
    public PermitAccess d;
    public final Map e;
    public final Set f;

    public aihn() {
        this.e = new LinkedHashMap();
        this.f = new HashSet();
    }

    public final void a(String s) {
        this.f.add(s);
    }

    public final void b(PermitAccess permitAccess0) {
        this.e.put(permitAccess0.b, permitAccess0);
    }
}

