import android.widget.TextView;

public final class gajb {
    public static void a(TextView textView0) {
        int v = gajm.a(textView0.getContext());
        gajo.a(textView0, new gajn(gaea.am, gaea.an, gaea.al, gaea.ao, gaea.ap, gaea.aq, null, null, v));
    }

    public static void b(TextView textView0) {
        gajn gajn0 = new gajn(null, null, null, null, null, null, null, null, gajm.a(textView0.getContext()));
        gajo.b(textView0, gajn0);
        textView0.setGravity(gajn0.j);
    }
}

