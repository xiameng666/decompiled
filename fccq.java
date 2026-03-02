import com.google.android.gms.wallet.service.orchestration.GcoreTapAndPayConsumerVerificationServerResponse;
import j..util.Objects;
import java.util.List;

final class fccq extends fbnw {
    final fccr a;

    public fccq(fccr fccr0) {
        Objects.requireNonNull(fccr0);
        this.a = fccr0;
        super();
    }

    @Override  // fbnw
    public final void P(GcoreTapAndPayConsumerVerificationServerResponse gcoreTapAndPayConsumerVerificationServerResponse0) {
        fccr fccr0 = this.a;
        switch(gcoreTapAndPayConsumerVerificationServerResponse0.b) {
            case 0: {
                fccr0.aj = 5;
                fccr0.ah = gcoreTapAndPayConsumerVerificationServerResponse0.a;
                fccr0.ad();
                return;
            }
            case 1: {
                fccr0.aj = 3;
                fccr0.ad();
                return;
            }
            case 2: {
                List list1 = fccr0.al;
                if(list1.isEmpty()) {
                    fccr0.ae(2, fccr0.getString(0x7F1535C9), fccr0.getString(0x7F1535AB));  // string:wallet_uic_title_possibly_recoverable_error_dialog "Request Failed"
                    return;
                }
                fccr0.aj = 0;
                for(Object object1: list1) {
                    fccr0.cb.c(((gcjm)object1));
                }
                return;
            }
            default: {
                List list0 = fccr0.am;
                if(list0.isEmpty()) {
                    fccr0.am(2);
                    return;
                }
                fccr0.aj = 0;
                for(Object object0: list0) {
                    fccr0.cb.c(((gcjm)object0));
                }
            }
        }
    }

    @Override  // fbnw
    public final void c() {
        this.a.am(2);
    }

    @Override  // fbnw
    public final void f() {
        String s = this.a.getString(0x7F1535AF);  // string:wallet_uic_network_error_title "No Internet Connection"
        String s1 = this.a.getString(0x7F1535AE);  // string:wallet_uic_network_error_message "A network connection is required to complete 
                                                   // this task. Please connect to a Wi-Fi or data network."
        this.a.ae(1, s, s1);
    }
}

