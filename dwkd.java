import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SaveLocalValuablesRequest;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dwkd implements dpug {
    public final dwkl a;

    public dwkd(dwkl dwkl0) {
        this.a = dwkl0;
    }

    @Override  // dpug
    public final void b(Object object0) {
        ibuq.c(((gvcm)object0));
        dwkl dwkl0 = this.a;
        if((((gvcm)object0).b & 1) != 0) {
            gves gves0 = gver.a(((ProtoLiteMessage)gveu.a).v_newBuilder());
            gvci gvci0 = ((gvcm)object0).c;
            if(gvci0 == null) {
                gvci0 = gvci.a;
            }
            ibuq.e(gvci0, "getUserGenericSensitivePass(...)");
            gves0.i(gvci0);
            gged_interceptors gged0 = gged_interceptors.l(dvoo.a(gves0.e(), true));
            ibuq.e(gged0, "of(...)");
            ProtoSafeParcelable protoSafeParcelable0 = fsia.a(ValuableGroup.g(gged0));
            SaveLocalValuablesRequest saveLocalValuablesRequest0 = new SaveLocalValuablesRequest();
            saveLocalValuablesRequest0.a = dwkl0.b;
            saveLocalValuablesRequest0.b = protoSafeParcelable0;
            evql evql0 = dwkl0.i.bo(saveLocalValuablesRequest0);
            evql0.b(new dwjz(new dwkj(dwkl0)));
            evql0.A(new dwka(dwkl0));
            return;
        }
        ((ggtj)dwkl.a.i()).x("No valuable found in the response");
        dwkl0.g.l(gkaf.c);
    }
}

