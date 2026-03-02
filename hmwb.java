import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class hmwb {
    public static boolean a(hmst hmst0) {
        return hmst0.b(hmty.a) && hmst0.b(hmty.b);
    }

    public static void b(essg essg0) {
        if(!hmvq.a.keySet().contains(Integer.valueOf(essg0.b))) {
            throw new essd(1, "unknown currencyCode");
        }
        String s = essg0.d;
        if(s == null || s.length() > 6) {
            throw new essd(1, "invalid transactionDate length");
        }
        try {
            Integer.parseInt(s);
            new SimpleDateFormat("ddMMyy", Locale.US).parse(s);
        }
        catch(ParseException | NumberFormatException unused_ex) {
            throw new essd(1, "invalid transactionDate format (ddMMyy expected)");
        }
        if(essg0.e >= 0 && essg0.e <= 999) {
            return;
        }
        throw new essd(1, "terminalCountryCode out of range");
    }
}

