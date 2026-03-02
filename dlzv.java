import com.google.android.gms.pay.Transaction;
import j..time.Duration;
import java.util.List;

public final class dlzv implements dmba {
    private static final bboh a;
    private final edfx b;

    static {
        dlzv.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlzv(edfx edfx0) {
        this.b = edfx0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 69, "cannot evaluate: does not have recent transit tap filter");
        gftb.b((hjwe0.b == 69 ? ((hjva)hjwe0.c) : hjva.a).b > 0, "cannot evaluate: recent transit tap filter days is not a positive value");
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis() - Duration.ofDays((hjwe0.b == 69 ? ((hjva)hjwe0.c) : hjva.a).b).toMillis());
        try {
            List list0 = this.b.b();
        }
        catch(dmhl dmhl0) {
            a.ae(dlzv.a.i(), "Failed to get transactions", dmhl0);
            return false;
        }
        for(Object object0: list0) {
            Transaction transaction0 = (Transaction)object0;
            try {
                byte[] arr_b = transaction0.a;
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hknp.b), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hknp hknp0 = (hknp)hftv0;
                if((hknp0.c & 0x40) == 0 || !hfyg.d((hknp0.h == null ? hfwn.a : hknp0.h)).isAfter(hfyg.d(hfwn0))) {
                    continue;
                }
            }
            catch(hfur hfur0) {
                a.ae(dlzv.a.i(), "Failed to parse core transaction", hfur0);
                continue;
            }
            return true;
        }
        return false;
    }
}

