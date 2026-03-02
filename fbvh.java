import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;
import java.io.IOException;

final class fbvh extends fbny {
    final hcib b;
    final fbvw c;

    public fbvh(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, hcib hcib0) {
        this.b = hcib0;
        Objects.requireNonNull(fbvw0);
        this.c = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s;
        ProtoLiteMessage hftv1;
        hfsl hfsl0;
        hftc hftc1;
        hcad hcad0;
        byte[] arr_b = this.b.d.toByteArray();
        if(arr_b != null && arr_b.length > 0) {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hcad.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hcad0 = null;
                hcad0 = (hcad)hftv0;
            }
            catch(hfur unused_ex) {
            }
            if(hcad0 == null) {
                goto label_48;
            }
            else if(hcad0.b == 28) {
                try {
                    ByteString hfsf0 = (ByteString)hcad0.c;
                    hftc1 = hftc.a();
                    hfsl0 = hfsf0.k();
                    hftv1 = ((ProtoLiteMessage)gers.b).x_newMutableInstance();
                }
                catch(hfur unused_ex) {
                    goto label_48;
                }
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv1);
                    hfwc0.l(hftv1, hfsm.p(hfsl0), hftc1);
                    hfwc0.g(hftv1);
                    goto label_36;
                }
                catch(hfur hfur0) {
                }
                catch(hfwr hfwr0) {
                    goto label_23;
                }
                catch(IOException iOException0) {
                    goto label_27;
                }
                catch(RuntimeException runtimeException0) {
                    goto label_33;
                }
                try {
                    if(hfur0.b) {
                        hfur0 = new hfur(hfur0);
                    }
                    hfur0.a = hftv1;
                    throw hfur0;
                label_23:
                    hfur hfur1 = hfwr0.a();
                    hfur1.a = hftv1;
                    throw hfur1;
                label_27:
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur2 = new hfur(iOException0);
                    hfur2.a = hftv1;
                    throw hfur2;
                label_33:
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                }
                catch(hfur unused_ex) {
                    goto label_48;
                }
                try {
                label_36:
                    hfsl0.z(0);
                    goto label_41;
                }
                catch(hfur hfur3) {
                    try {
                        hfur3.a = hftv1;
                        throw hfur3;
                    label_41:
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        if((((gers)hftv1).c & 0x800) == 0) {
                        label_48:
                            s = "";
                        }
                        else {
                            hcao hcao0 = ((gers)hftv1).p;
                            if(hcao0 == null) {
                                hcao0 = hcao.a;
                            }
                            s = hcao0.f;
                        }
                    }
                    catch(hfur unused_ex) {
                        goto label_48;
                    }
                }
            }
            else {
                goto label_48;
            }
        }
        else {
            goto label_48;
        }
        String s1 = fbvw.S(this.a, s) + "/payments/apis-secure/webviewservice/initialize";
        return this.c.V(s1, gamm0, this.b, 73);
    }
}

