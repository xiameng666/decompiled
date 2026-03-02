import android.content.Context;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class ftro {
    public static final String a(Context context0, hfwn hfwn0) {
        ibuq.f(context0, "<this>");
        ibuq.f(hfwn0, "timestamp");
        String s = context0.getString(0x7F15227C, new Object[]{new SimpleDateFormat("MMM y", Locale.getDefault()).format(Long.valueOf(hfyn.b(hfwn0)))});  // string:pay_transactions_savings_earliest_transaction_date "Since %1$s"
        ibuq.e(s, "getString(...)");
        return s;
    }

    public static final String b(Context context0, hjin hjin0) {
        ibuq.f(context0, "<this>");
        ibuq.f(hjin0, "amount");
        String s = fscd.d(fscd.a(hjin0));
        ibuq.c(s);
        return ftro.e(context0, hjin0, s);
    }

    public static final String c(Context context0, hjin hjin0) {
        ibuq.f(context0, "<this>");
        ibuq.f(hjin0, "amount");
        String s = fscd.j(fscd.d(fscd.a(hjin0)));
        ibuq.c(s);
        return ftro.e(context0, hjin0, s);
    }

    public static final String d(Context context0, hfwn hfwn0) {
        ibuq.f(context0, "<this>");
        ibuq.f(hfwn0, "timestamp");
        String s = DateUtils.formatDateTime(context0, hfyn.b(hfwn0), 0x10010);
        ibuq.e(s, "formatDateTime(...)");
        return s;
    }

    private static final String e(Context context0, hjin hjin0, String s) {
        int v = Long.compare(hjin0.c, 0L);
        if(v <= 0 && (v != 0 || hjin0.d <= 0)) {
            if(fscd.k(hjin0)) {
                String s1 = context0.getString(0x7F152292, new Object[]{s});  // string:pay_transactions_unsigned_amount "%1$s"
                ibuq.e(s1, "getString(...)");
                return s1;
            }
            String s2 = context0.getString(0x7F15225D, new Object[]{s});  // string:pay_transactions_credit_amount "+%1$s"
            ibuq.e(s2, "getString(...)");
            return s2;
        }
        return s;
    }
}

