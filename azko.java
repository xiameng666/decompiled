import android.content.ContentValues;
import j..time.Instant;
import j..util.Optional;

public final class azko {
    public final azkp a;
    public final Optional b;
    public final Optional c;

    public azko() {
        throw null;
    }

    public azko(azkp azkp0, Optional optional0, Optional optional1) {
        this.a = azkp0;
        if(optional0 == null) {
            throw new NullPointerException("Null initialEnabledTime");
        }
        this.b = optional0;
        if(optional1 == null) {
            throw new NullPointerException("Null startDisabledTime");
        }
        this.c = optional1;
    }

    final ContentValues a() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("customer_id", Integer.valueOf(this.a.a));
        contentValues0.put("project_id", Integer.valueOf(this.a.b));
        Optional optional0 = this.b;
        if(optional0.isPresent()) {
            contentValues0.put("initial_enabled_time", Long.valueOf(((Instant)optional0.get()).toEpochMilli()));
        }
        else {
            contentValues0.putNull("initial_enabled_time");
        }
        Optional optional1 = this.c;
        if(optional1.isPresent()) {
            contentValues0.put("start_disabled_time", Long.valueOf(((Instant)optional1.get()).toEpochMilli()));
            return contentValues0;
        }
        contentValues0.putNull("start_disabled_time");
        return contentValues0;
    }

    public static azko b(azkp azkp0, Instant instant0) {
        return new azko(azkp0, Optional.of(instant0), Optional.empty());
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azko) && this.a.equals(((azko)object0).a) && this.b.equals(((azko)object0).b) && this.c.equals(((azko)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "ProjectEntity{projectKey=" + this.a.toString() + ", initialEnabledTime=" + this.b.toString() + ", startDisabledTime=" + this.c.toString() + "}";
    }
}

