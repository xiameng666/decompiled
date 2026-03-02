public enum gqab {
    DOUBLE,
    LAZILY_PARSED_NUMBER,
    LONG_OR_DOUBLE,
    BIG_DECIMAL;

    private static final Number b(String s, gqff gqff0) {
        try {
            Number number0 = Double.valueOf(s);
            if(!((Double)number0).isInfinite() && !((Double)number0).isNaN() || gqff0.a == gqaa.a) {
                return number0;
            }
            throw new gqfi("JSON forbids NaN and infinities: " + number0 + "; at path " + gqff0.f());
        }
        catch(NumberFormatException numberFormatException0) {
            throw new gpzu(dlbc.g(s, gqff0, "Cannot parse ", "; at path "), numberFormatException0);
        }
    }
}

