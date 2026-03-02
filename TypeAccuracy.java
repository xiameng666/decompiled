public enum TypeAccuracy {
    HIGH_ACCURACY(100),
    BALANCED_POWER_ACCURACY(102),
    LOW_POWER(104),
    PASSIVE(105);

    public final int e;

    static {
        TypeAccuracy.f = arr_cjhr;
        ibsn.a(arr_cjhr);
    }

    private TypeAccuracy(int v1) {
        this.e = v1;
    }

    public static final TypeAccuracy a(int v) {
        switch(v) {
            case 100: {
                return TypeAccuracy.HIGH_ACCURACY;
            }
            case 102: {
                return TypeAccuracy.BALANCED_POWER_ACCURACY;
            }
            case 104: {
                return TypeAccuracy.LOW_POWER;
            }
            case 105: {
                return TypeAccuracy.PASSIVE;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 0: {
                return "HIGH_ACCURACY";
            }
            case 1: {
                return "BALANCED_POWER_ACCURACY";
            }
            case 2: {
                return "LOW_POWER";
            }
            case 3: {
                return "PASSIVE";
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

