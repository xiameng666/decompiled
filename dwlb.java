import android.accounts.Account;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SaveLocalValuablesRequest;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dwlb implements dpug {
    public final dwlt a;
    public final Account b;

    public dwlb(dwlt dwlt0, Account account0) {
        this.a = dwlt0;
        this.b = account0;
    }

    @Override  // dpug
    public final void b(Object object0) {
        ibuq.c(((gvck)object0));
        dwlt dwlt0 = this.a;
        if((((gvck)object0).b & 1) != 0) {
            gvci gvci0 = ((gvck)object0).c;
            if(gvci0 == null) {
                gvci0 = gvci.a;
            }
            ibuq.e(gvci0, "getUserGenericSensitivePass(...)");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gveu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gveu gveu0 = (gveu)hftp0.b_message;
            gvci0.getClass();
            gveu0.c = gvci0;
            gveu0.b = 11;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            gged_interceptors gged0 = gged_interceptors.l(dvoo.a(((gveu)hftv0), true));
            ibuq.e(gged0, "of(...)");
            ProtoSafeParcelable protoSafeParcelable0 = fsia.a(ValuableGroup.g(gged0));
            SaveLocalValuablesRequest saveLocalValuablesRequest0 = new SaveLocalValuablesRequest();
            saveLocalValuablesRequest0.a = this.b;
            saveLocalValuablesRequest0.b = protoSafeParcelable0;
            evql evql0 = dwlt0.o.bo(saveLocalValuablesRequest0);
            evql0.b(new dwld(new dwlc(dwlt0)));
            evql0.A(new dwle(dwlt0));
            return;
        }
        dpui dpui0 = new dpui();
        dwlt0.h.l(dpui0);
    }
}

