import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;
import j..util.Objects;

public final class azrn implements AdapterView.OnItemClickListener {
    final AccountTypePickerChimeraActivity a;

    public azrn(AccountTypePickerChimeraActivity accountTypePickerChimeraActivity0) {
        Objects.requireNonNull(accountTypePickerChimeraActivity0);
        this.a = accountTypePickerChimeraActivity0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        String s = ((azrp)this.a.j.get(v)).a.type;
        this.a.b(s);
    }
}

