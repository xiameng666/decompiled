import com.google.android.gms.common.api.Status;

public final class ajjp {
    public static Status a(ygl ygl0) {
        switch(ygl0.ordinal()) {
            case 0: {
                return new Status(-25501);
            }
            case 1: {
                return new Status(-25502);
            }
            case 2: {
                return new Status(0xFFFF9C61);
            }
            case 4: {
                return new Status(25501);
            }
            case 6: {
                return new Status(25502);
            }
            case 7: {
                return new Status(0x63A0);
            }
            case 9: {
                return new Status(0x639F);
            }
            case 3: 
            case 5: 
            case 8: 
            case 10: 
            case 11: 
            case 13: {
                return new Status(0xFFFF9C60);
            }
            case 14: {
                return new Status(-25505);
            }
            default: {
                throw new IllegalArgumentException("Unexpected status " + ygl0.toString());
            }
        }
    }
}

