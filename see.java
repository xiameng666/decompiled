import android.os.PersistableBundle;
import java.util.Map;

public final class see implements scz {
    private final String a;
    private final Map b;

    public see(String s, Map map0) {
        this.a = s;
        this.b = map0;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new sds(sdx.a, sdu.a).a(this.b);
        persistableBundle0.putString("QUALIFIED_NAME", this.a);
        return persistableBundle0;
    }
}

