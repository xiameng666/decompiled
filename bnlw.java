import java.util.concurrent.TimeUnit;

public final class bnlw {
    public static boolean a(fqun fqun0, int v, long v1) {
        hsxv hsxv0 = hsxv.a;
        if(!hsxv0.y().aL()) {
            return false;
        }
        if(v != 0) {
            switch(v - 1) {
                case 0: 
                case 1: {
                    return false;
                }
                case 2: {
                    return v1 > fqun0.d + TimeUnit.HOURS.toMillis(hsxv0.y().j());
                }
                case 3: {
                    return v1 > fqun0.e + TimeUnit.HOURS.toMillis(hsxv0.y().j());
                }
                default: {
                    return v1 > TimeUnit.HOURS.toMillis(hsxv0.y().j());
                }
            }
        }
        throw null;
    }
}

