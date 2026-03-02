import android.location.Location;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bgrb implements Predicate {
    public final Location a;

    public bgrb(Location location0) {
        this.a = location0;
    }

    @Override
    public final Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public final Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public final Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    @Override
    public final boolean test(Object object0) {
        hjij hjij0 = ((hgua)object0).b;
        if(hjij0 == null) {
            hjij0 = hjij.a;
        }
        Location location0 = new Location("ext");
        location0.setLatitude(hjij0.b);
        location0.setLongitude(hjij0.c);
        return this.a.distanceTo(location0) < ((float)((hgua)object0).c);
    }
}

