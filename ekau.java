import android.os.Bundle;
import java.security.SecureRandom;

public final class ekau {
    public final int a;
    public final long b;
    private static final SecureRandom c;

    static {
        ekau.c = new SecureRandom();
    }

    public ekau() {
        throw null;
    }

    public ekau(int v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public static ekau a() {
        return new ekau(ekau.c.nextInt(), System.currentTimeMillis());
    }

    public static gfsx b(Bundle bundle0) {
        return bundle0 != null && bundle0.containsKey("trigger_id") ? gfsx.m(new ekau(bundle0.getInt("trigger_id", 0), bundle0.getLong("trigger_timestamp", 0L))) : gfqx.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ekau) && this.a == ((ekau)object0).a && this.b == ((ekau)object0).b;
    }

    @Override
    public final int hashCode() {
        return (this.a ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20));
    }

    @Override
    public final String toString() {
        return "TriggerContext{triggerId=" + this.a + ", triggerTimestampMillis=" + this.b + "}";
    }
}

