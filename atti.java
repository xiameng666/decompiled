import java.util.Arrays;
import org.json.JSONObject;

public final class atti {
    public final long a;
    public final JSONObject b;
    private final int c;
    private final boolean d;

    public atti(long v, JSONObject jSONObject0) {
        this.a = v;
        this.c = 0;
        this.d = false;
        this.b = jSONObject0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof atti) ? this.a == ((atti)object0).a && bata.b(this.b, ((atti)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((int)0), Boolean.valueOf(false), this.b});
    }
}

