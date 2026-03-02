import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlesettings.SelectedAccountResult;

final class buvj extends ibsl implements ibtw {
    int a;
    final buvk b;

    public buvj(buvk buvk0, ibrl ibrl0) {
        this.b = buvk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buvj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buvj(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.b.a(this);
            if(object0 == object1) {
                return object1;
            }
        }
        SelectedAccountResult selectedAccountResult0 = new SelectedAccountResult((((Account)object0) == null ? null : ((Account)object0).name));
        ApiMetadata apiMetadata0 = cckf.a(((gful_cronetEngineProvider)new cckb()));
        this.b.a.a(Status.b, selectedAccountResult0, apiMetadata0);
        return ibom.a;
    }
}

