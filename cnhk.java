import android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder;
import j..util.Optional;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class cnhk implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gxqn gxqn0 = (gxqn)object0;
        try {
            if(gxqn0.b > 0 && gxqn0.d >= 0.0 && (gxqn0.e >= -1.0 && gxqn0.e <= 1.0) && (gxqn0.f >= -1.0 && gxqn0.f <= 1.0) && (gxqn0.g >= -1.0 && gxqn0.g <= 1.0) && (gxqn0.h >= -1.0 && gxqn0.h <= 1.0) && (gxqn0.i >= 0.0 && gxqn0.i <= 8192.0) && (gxqn0.j >= -1.0 && gxqn0.j <= 1.0) && (gxqn0.k >= -0.0625 && gxqn0.k <= 0.0625)) {
                goto label_2;
            }
            throw new cnho("Invalid GalileoSatelliteAlmanacProto");
        }
        catch(cnho unused_ex) {
            return Optional.ofNullable(null);
        }
    label_2:
        if(gxqn0.l >= -0.0 && gxqn0.l <= 1.500000E-08) {
            return Optional.ofNullable(new GnssAlmanac.GnssSatelliteAlmanac.Builder().setSvid(gxqn0.b).setSvHealth(cnhp.d((gxqn0.c == null ? gxql.a : gxqn0.c))).setEccentricity(gxqn0.d).setInclination(gxqn0.e).setOmega(gxqn0.f).setOmega0(gxqn0.g).setOmegaDot(gxqn0.h).setRootA(gxqn0.i).setM0(gxqn0.j).setAf0(gxqn0.k).setAf1(gxqn0.l).build());
        }
        try {
            throw new cnho("Invalid GalileoSatelliteAlmanacProto");
        }
        catch(cnho unused_ex) {
            return Optional.ofNullable(null);
        }
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

