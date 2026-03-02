import j..util.function.Function.-CC;
import java.util.function.Function;

public final class bqfz implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hlds hlds0 = ((hldp)object0).g;
        if(hlds0 == null) {
            hlds0 = hlds.a;
        }
        String s = hlds0.c;
        switch(s.hashCode()) {
            case 0x88CC153E: {
                return s.equals("com.google.heart_minutes") ? hlko.i : hlko.a;
            }
            case -1757812901: {
                return s.equals("com.google.location.sample") ? hlko.h : hlko.a;
            }
            case 0xB5908C27: {
                return s.equals("com.google.distance.delta") ? hlko.e : hlko.a;
            }
            case -1102520626: {
                return s.equals("com.google.step_count.delta") ? hlko.b : hlko.a;
            }
            case -98150574: {
                if(s.equals("com.google.heart_rate.bpm")) {
                    return ((hldp)object0).e.equals("top_level") ? hlko.c : hlko.d;
                }
                return hlko.a;
            }
            case 378060028: {
                return s.equals("com.google.activity.segment") ? hlko.k : hlko.a;
            }
            case 0x359FD3FD: {
                return s.equals("com.google.calories.expended") ? hlko.g : hlko.a;
            }
            case 0x5B50C04E: {
                return s.equals("com.google.active_minutes") ? hlko.f : hlko.a;
            }
            case 0x7A65DF9F: {
                return s.equals("com.google.speed") ? hlko.j : hlko.a;
            }
            default: {
                return hlko.a;
            }
        }
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

