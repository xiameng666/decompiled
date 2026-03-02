import android.content.ContentValues;
import j..time.Duration;
import j..time.Instant;
import j..util.Optional;
import java.security.SecureRandom;

public final class azke {
    public final azju a;

    public azke(azju azju0) {
        this.a = azju0;
    }

    public final long a(SecureRandom secureRandom0, Instant instant0) {
        azju azju0 = this.a;
        Optional optional0 = azju0.d().a();
        if(optional0.isPresent() && !instant0.isAfter(((azjy)optional0.get()).b.plus(Duration.ofDays(hrcf.a.b().a())))) {
            return ((azjy)optional0.get()).a;
        }
        this.d(secureRandom0, instant0);
        return ((azjy)azju0.d().a().orElseThrow(new azjz())).a;
    }

    public final Instant b(azkp azkp0, Instant instant0) {
        azkc azkc0 = new azkc(this, azkp0, instant0);
        return (Instant)this.a.i(azkc0);
    }

    public final Instant c(azkp azkp0, Instant instant0) {
        azkd azkd0 = new azkd(this, azkp0, instant0);
        return (Instant)this.a.i(azkd0);
    }

    public final void d(SecureRandom secureRandom0, Instant instant0) {
        long v = secureRandom0.nextLong();
        azjx azjx0 = this.a.d();
        azjy azjy0 = new azjy(v, instant0);
        azjx0.a.delete("CookieBucketSeed", null, null);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("seed", Long.valueOf(azjy0.a));
        contentValues0.put("last_updated_time", Long.valueOf(azjy0.b.toEpochMilli()));
        azjx0.a.insertOrThrow("CookieBucketSeed", null, contentValues0);
    }
}

