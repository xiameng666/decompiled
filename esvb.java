import java.util.List;

public final class esvb {
    public static int a(esga esga0) {
        switch(esga0.ordinal()) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            case 5: {
                return 6;
            }
            case 6: {
                return 3;
            }
            case 7: {
                return 7;
            }
            case 8: {
                return 8;
            }
            case 9: {
                return 9;
            }
            case 0: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 0;
            }
            default: {
                throw new RuntimeException(null, null);
            }
        }
    }

    public static List b(byte[] arr_b) {
        try {
            esvj esvj0 = esvj.m(arr_b);
            gftb.checkTrue(esvj0.b == 0x6F);
            return esvj0.l().d(new int[]{0xA5, 0xBF0C}).l().f();
        }
        catch(esvk esvk0) {
            throw new IllegalArgumentException("Not valid FCI template", esvk0);
        }
    }
}

