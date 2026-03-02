import android.content.Intent;
import java.util.Objects;

final class dnqg extends ibsl implements ibtw {
    int a;
    final dnqi b;

    public dnqg(dnqi dnqi0, ibrl ibrl0) {
        this.b = dnqi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dnqg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dnqg(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dnqi dnqi0 = this.b;
            edse edse0 = dnqi0.b;
            edsd edsd0 = edse0.c();
            if(edsd0 == null) {
                Objects.toString(edsd0);
                throw new IllegalStateException("Unexpected InstallState: " + edsd0);
            }
            switch(edsd0.ordinal()) {
                case 0: {
                    return null;
                }
                case 1: {
                    goto label_11;
                }
                case 2: {
                    goto label_17;
                }
                case 3: {
                    goto label_21;
                }
            }
            Objects.toString(edsd0);
            throw new IllegalStateException("Unexpected InstallState: " + edsd0);
        label_11:
            if(hwjs.c()) {
                this.a = 1;
                dnqh dnqh0 = new dnqh(dnqi0, null);
                object0 = icbd.a(dnqi0.d, dnqh0, this);
                if(object0 == object1) {
                    return object1;
                label_17:
                    int v1 = hwjs.c() ? 0x7F151CB1 : 0x7F151CB2;  // string:pay_contextual_card_body_pay_with_wallet "Tap to pay in stores, board a flight, 
                                                                  // and more, all with just your phone"
                    Intent intent0 = edse0.a("RECOMMENDATION_TAB");
                    ibuq.e(intent0, "getInstallWalletIntent(...)");
                    return dnqi0.b(v1, 0x7F151CB6, intent0, cmeu.n, ccow.q);  // string:pay_contextual_card_cta_install_wallet "@com.google.android.gms:string/pay_wallet_install_wallet"
                label_21:
                    Intent intent1 = edse0.a("RECOMMENDATION_TAB");
                    ibuq.e(intent1, "getInstallWalletIntent(...)");
                    return dnqi0.b(0x7F151CB1, 0x7F151CB8, intent1, cmeu.n, ccow.r);  // string:pay_contextual_card_body_pay_with_wallet "Tap to pay in stores, board a flight, 
                                                                                      // and more, all with just your phone"
                }
                goto label_26;
            }
        }
        else {
        label_26:
            if(((Boolean)object0).booleanValue()) {
                dmqm dmqm0 = new dmqm();
                dmqm0.h(2);
                dmqm0.i(true);
                Intent intent2 = dmqm0.c();
                ibuq.e(intent2, "build(...)");
                return this.b.b(0x7F151CB1, 0x7F151CB7, intent2, cmeu.p, ccow.t);  // string:pay_contextual_card_body_pay_with_wallet "Tap to pay in stores, board a flight, 
                                                                                   // and more, all with just your phone"
            }
        }
        Intent intent3 = dlnf.j(this.b.a, this.b.c);
        ibuq.e(intent3, "newAddItemIntent(...)");
        return this.b.b(0x7F151CAF, 0x7F151CB4, intent3, cmeu.o, ccow.s);  // string:pay_contextual_card_body_add "Add a card to tap to pay in stores"
    }
}

