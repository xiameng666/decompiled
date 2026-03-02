import j..time.Instant;
import j..time.ZoneId;
import j..time.ZoneOffset;

public final class azlf {
    public static final int a(gena gena0, Instant instant0) {
        int v;
        switch(gena0.e) {
            case 0: {
                v = 2;
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v == 0) {
            v = 1;
        }
        switch(v - 2) {
            case 0: {
                return (int)instant0.atZone(ZoneOffset.UTC).toLocalDate().toEpochDay();
            }
            case 1: {
                return (int)instant0.atZone(ZoneId.systemDefault()).toLocalDate().toEpochDay();
            }
            case 2: {
                return (int)instant0.atZone(ZoneId.of(gena0.f)).toLocalDate().toEpochDay();
            }
            default: {
                throw new AssertionError("Invalid TimeZonePolicy");
            }
        }
    }
}

