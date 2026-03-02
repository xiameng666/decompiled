import com.google.android.gms.tapandpay.firstparty.PassInfo;
import com.google.android.gms.tapandpay.firstparty.TransmissionEvent;

public final class dubk {
    public static PassInfo a(String s) {
        PassInfo passInfo0 = new PassInfo();
        passInfo0.b = s;
        passInfo0.a = 4;
        return passInfo0;
    }

    public static TransmissionEvent b(String s) {
        esnd esnd0 = new esnd();
        esnd0.a(10);
        esnd0.g(new PassInfo[]{dubk.a(s)});
        return esnd0.a;
    }
}

