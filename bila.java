public final class bila implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        int v = (int)(((Integer)object0));
        switch(v) {
            case 0: {
                return "UNKNOWN";
            }
            case 1: {
                return "NEARBY_SHARE";
            }
            case 2: {
                return "NEARBY_PRESENCE";
            }
            case 3: {
                return "USONIA";
            }
            default: {
                return "UNKNOWN FEATURE " + v;
            }
        }
    }
}

