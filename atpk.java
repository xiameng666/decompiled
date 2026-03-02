import android.telecom.Call.Callback;
import android.telecom.Call.Details;
import android.telecom.Call;
import android.telecom.DisconnectCause;
import com.google.android.gms.bankscamwarning.services.BankScamCallDetectionChimeraService;
import java.util.Collection;
import java.util.Set;

public final class atpk extends Call.Callback {
    final BankScamCallDetectionChimeraService a;

    public atpk(BankScamCallDetectionChimeraService bankScamCallDetectionChimeraService0) {
        this.a = bankScamCallDetectionChimeraService0;
        super();
    }

    @Override  // android.telecom.Call$Callback
    public final void onStateChanged(Call call0, int v) {
        hhbc hhbc0;
        ibuq.f(call0, "call");
        DisconnectCause disconnectCause0 = null;
        switch(v) {
            case 4: {
                bboh bboh0 = BankScamCallDetectionChimeraService.a;
                ((ggtj)bboh0.h()).x("Call state changed to active");
                BankScamCallDetectionChimeraService bankScamCallDetectionChimeraService0 = this.a;
                boolean z = BankScamCallDetectionChimeraService.b(call0);
                switch(call0.getDetails().getCallDirection()) {
                    case 0: {
                        hhbc0 = hhbc.b;
                        break;
                    }
                    case 1: {
                        hhbc0 = hhbc.c;
                        break;
                    }
                    default: {
                        hhbc0 = hhbc.a;
                    }
                }
                ibuq.f(hhbc0, "callDirection");
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhbi.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhbd.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((hhbd)hftv0).b |= 1;
                ((hhbd)hftv0).c = z;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hhbd)hftp1.b_message).d = hhbc0.d;
                ((hhbd)hftp1.b_message).b |= 2;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhbi hhbi0 = (hhbi)hftp0.b_message;
                hhbd hhbd0 = (hhbd)hftp1.N_build();
                hhbd0.getClass();
                hhbi0.d = hhbd0;
                hhbi0.c = 1;
                ProtoLiteMessage hftv1 = hftp0.N_build();
                ibuq.e(hftv1, "build(...)");
                bankScamCallDetectionChimeraService0.b.b(((hhbi)hftv1));
                if(!BankScamCallDetectionChimeraService.b(call0)) {
                    ((ggtj)bboh0.h()).x("Call is not in contacts");
                    Set set0 = bankScamCallDetectionChimeraService0.c;
                    if(!(set0 instanceof Collection) || !set0.isEmpty()) {
                        for(Object object0: set0) {
                            if(BankScamCallDetectionChimeraService.b(((Call)object0))) {
                                return;
                            }
                        }
                    }
                    ((ggtj)bboh0.h()).x("No active call in contacts hence starting detection");
                    ator ator0 = bankScamCallDetectionChimeraService0.a();
                    if(!hxvd.d()) {
                        ((ggtj)ator.a.h()).x("BankScamWarningFeature is disabled, not starting detection.");
                        return;
                    }
                    ator0.g();
                    if(ator0.g != null && ator0.g.y()) {
                        ((ggtj)ator.a.h()).x("Detection already started.");
                        return;
                    }
                    ((ggtj)ator.a.h()).x("Starting banking app foreground detection.");
                    ator0.g = icir.d(new icjr(new iclv(new ichv(new atom(ator0, null)), new atop(ator0, null)), new atoq(ator0, null)), ator0.f);
                    return;
                }
                ((ggtj)bboh0.h()).x("Call is in contacts, hence not starting detection");
                bankScamCallDetectionChimeraService0.a().h();
                return;
            }
            case 7: {
                bboh bboh1 = BankScamCallDetectionChimeraService.a;
                ((ggtj)bboh1.h()).x("Call state changed to disconnected");
                Call.Details call$Details0 = call0.getDetails();
                if(call$Details0 != null) {
                    disconnectCause0 = call$Details0.getDisconnectCause();
                }
                if(disconnectCause0 != null) {
                    ((ggtj)bboh1.h()).z("Call disconnected with code: %d", disconnectCause0.getCode());
                    int v1 = disconnectCause0.getCode();
                    this.a.b.a(v1);
                    return;
                }
                ((ggtj)bboh1.h()).x("Call disconnected with null DisconnectCause");
                this.a.b.a(0);
            }
        }
    }
}

