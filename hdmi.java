public enum hdmi implements hfub {
    DATE_COMPONENT_UNKNOWN(0),
    DATE_COMPONENT_MONTH(1),
    DATE_COMPONENT_YEAR_TWO_DIGITS(2),
    DATE_COMPONENT_YEAR_FOUR_DIGITS(3),
    DATE_COMPONENT_DAY(4);

    private final int g;

    private hdmi(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static hdmi b(int v) {
        switch(v) {
            case 0: {
                return hdmi.a;
            }
            case 1: {
                return hdmi.b;
            }
            case 2: {
                return hdmi.c;
            }
            case 3: {
                return hdmi.d;
            }
            case 4: {
                return hdmi.e;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

