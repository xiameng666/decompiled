import android.accounts.Account;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

public final class cbre implements AdapterView.OnItemClickListener {
    public final cbrh a;
    public final zdr b;

    public cbre(cbrh cbrh0, zdr zdr0) {
        this.a = cbrh0;
        this.b = zdr0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        cbqh cbqh0 = this.a.y();
        Object object0 = this.b.getItem(v);
        ibuq.c(object0);
        Account account0 = (Account)object0;
        ibuq.f(account0, "account");
        cbqh0.b.l(cbqb.e);
        cbqh0.d.l(account0);
        this.a.z();
    }
}

