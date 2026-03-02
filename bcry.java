import android.telephony.SmsMessage;
import j..util.Objects;

final class bcry {
    final bcsa a;

    public bcry(bcsa bcsa0) {
        Objects.requireNonNull(bcsa0);
        this.a = bcsa0;
        super();
    }

    public final String a() {
        hofs hofs0 = this.a.c;
        hoer hoer0 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
        hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
        return hobj0.c == 6 ? ((hobw)hobj0.d).b : hobw.a.b;
    }

    public final void b(SmsMessage smsMessage0) {
        this.a.f.a(this.a.e, this.a.c, gmfz.k);
        String s = smsMessage0.getOriginatingAddress();
        String s1 = smsMessage0.getMessageBody();
        new bbln(9, new bcrz(this.a, s, s1)).start();
    }
}

