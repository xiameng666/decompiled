import j..time.YearMonth;
import j..time.format.DateTimeFormatter;
import j..time.format.DateTimeParseException;

public final class rfy {
    public static final rfz a(String s) {
        Integer integer0;
        ibuq.f(s, "patchLevel");
        if(s.length() == 6 || s.length() == 8) {
            try {
                DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ofPattern("yyyyMM");
                String s1 = s.substring(0, 6);
                ibuq.e(s1, "substring(...)");
                YearMonth yearMonth0 = (YearMonth)dateTimeFormatter0.parse(s1, new rfx());
                if(s.length() == 8) {
                    String s2 = s.substring(6);
                    ibuq.e(s2, "substring(...)");
                    integer0 = Integer.parseInt(s2);
                }
                else {
                    integer0 = null;
                }
                ibuq.c(yearMonth0);
                return new rfz(yearMonth0, integer0);
            }
            catch(DateTimeParseException unused_ex) {
            }
        }
        return null;
    }
}

