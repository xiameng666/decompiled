public final class bcpw {
    public static final ckcq a(int v) {
        switch(v) {
            case 0: {
                throw new IllegalArgumentException("Invalid request trigger type: " + 0);
            }
            case 5: 
            case 6: {
                ibuq.e(ckcs.d, "CD_INITIATOR_CATEGORY_2");
                return ckcs.d;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 8: 
            case 9: 
            case 10: {
                ibuq.e(ckcs.c, "CD_INITIATOR_CATEGORY_1");
                return ckcs.c;
            }
            case 7: 
            case 11: {
                ibuq.e(ckcs.b, "CD_INITIATOR_CATEGORY_0");
                return ckcs.b;
            }
            default: {
                throw new IllegalArgumentException("Unknown request trigger type: " + v);
            }
        }
    }

    public static final ckcq b(int v) {
        switch(v) {
            case 0: {
                throw new IllegalArgumentException("Invalid request trigger type: " + 0);
            }
            case 5: 
            case 6: {
                ibuq.e(ckcz.d, "CD_INITIATOR_CATEGORY_2");
                return ckcz.d;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 8: 
            case 9: 
            case 10: {
                ibuq.e(ckcz.c, "CD_INITIATOR_CATEGORY_1");
                return ckcz.c;
            }
            case 7: 
            case 11: {
                ibuq.e(ckcz.b, "CD_INITIATOR_CATEGORY_0");
                return ckcz.b;
            }
            default: {
                throw new IllegalArgumentException("Unknown request trigger type: " + v);
            }
        }
    }
}

