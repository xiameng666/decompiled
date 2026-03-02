import com.google.android.gms.pay.GetTransactionsResponse;
import com.google.android.gms.pay.Transaction;
import java.util.ArrayList;
import java.util.List;

final class dmza extends ibsl implements ibtw {
    final dmzb a;
    final dxev b;
    final GetTransactionsResponse c;

    public dmza(dmzb dmzb0, dxev dxev0, GetTransactionsResponse getTransactionsResponse0, ibrl ibrl0) {
        this.a = dmzb0;
        this.b = dxev0;
        this.c = getTransactionsResponse0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmza)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmza(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dmzb dmzb0 = this.a;
        hkhr hkhr0 = this.b.c == null ? hkhr.b : this.b.c;
        Transaction[] arr_transaction = this.c.a;
        ibuq.e(arr_transaction, "getTransactions(...)");
        List list0 = ibpg.e(arr_transaction);
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object1: list0) {
            byte[] arr_b = ((Transaction)object1).a;
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hknp.b), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((hknp)hftv0), "parseFrom(...)");
            arrayList0.add(((hknp)hftv0));
        }
        dmyy dmyy0 = new dmyy(hkhr0, arrayList0);
        dmzb0.a.b(dmyy0);
        return ibom.a;
    }
}

