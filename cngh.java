import java.util.EnumSet;

public final class cngh {
    public static final EnumSet a(int v) {
        cned cned0;
        Integer[] arr_integer = {((int)1), ((int)2), ((int)4)};
        EnumSet enumSet0 = EnumSet.noneOf(cned.class);
        for(int v1 = 0; v1 < 3; ++v1) {
            int v2 = arr_integer[v1].intValue();
            if((v & v2) != 0) {
                switch(v2) {
                    case 1: {
                        cned0 = cned.b;
                        break;
                    }
                    case 2: {
                        cned0 = cned.c;
                        break;
                    }
                    case 4: {
                        cned0 = cned.d;
                        break;
                    }
                    default: {
                        throw new AssertionError();
                    }
                }
                enumSet0.add(cned0);
            }
        }
        return enumSet0;
    }

    public static final EnumSet b(int v) {
        cned cned0;
        Integer[] arr_integer = {((int)1), ((int)2), ((int)4), ((int)8)};
        EnumSet enumSet0 = EnumSet.noneOf(cned.class);
        for(int v1 = 0; v1 < 4; ++v1) {
            int v2 = arr_integer[v1].intValue();
            if((v & v2) != 0) {
                switch(v2) {
                    case 1: {
                        cned0 = cned.b;
                        break;
                    }
                    case 2: {
                        cned0 = cned.c;
                        break;
                    }
                    case 4: {
                        cned0 = cned.d;
                        break;
                    }
                    case 8: {
                        cned0 = cned.a;
                        break;
                    }
                    default: {
                        throw new AssertionError();
                    }
                }
                enumSet0.add(cned0);
            }
        }
        return enumSet0;
    }
}

