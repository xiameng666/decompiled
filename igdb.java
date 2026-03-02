public final class igdb extends IllegalArgumentException {
    public String a;
    private static final long serialVersionUID = 0x578263712B904F39L;

    public igdb(igcr igcr0, Number number0, Number number1, Number number2) {
        super(igdb.a(igcr0.y, number0, number1, number2, null));
        this.a = super.getMessage();
    }

    public igdb(igcr igcr0, Number number0, Number number1, Number number2, String s) {
        super(igdb.a(igcr0.y, number0, number1, number2, s));
        this.a = super.getMessage();
    }

    public igdb(igcr igcr0, Number number0, String s) {
        super(igdb.a(igcr0.y, number0, null, null, s));
        this.a = super.getMessage();
    }

    public igdb(igcr igcr0, String s) {
        super("Value \"" + s + "\" for " + igcr0.y + " is not supported");
        this.a = super.getMessage();
    }

    private static String a(String s, Number number0, Number number1, Number number2, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder("Value ");
        stringBuilder0.append(number0);
        stringBuilder0.append(" for ");
        stringBuilder0.append(s);
        stringBuilder0.append(' ');
        if(number1 != null) {
            if(number2 == null) {
                stringBuilder0.append("must not be smaller than ");
                stringBuilder0.append(number1);
            }
            else {
                stringBuilder0.append("must be in the range [");
                stringBuilder0.append(number1);
                stringBuilder0.append(',');
                stringBuilder0.append(number2);
                stringBuilder0.append(']');
            }
        }
        else if(number2 == null) {
            stringBuilder0.append("is not supported");
        }
        else {
            stringBuilder0.append("must not be larger than ");
            stringBuilder0.append(number2);
        }
        if(s1 != null) {
            stringBuilder0.append(": ");
            stringBuilder0.append(s1);
        }
        return stringBuilder0.toString();
    }

    @Override
    public final String getMessage() {
        return this.a;
    }
}

