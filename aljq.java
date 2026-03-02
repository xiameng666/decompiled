import android.accounts.Account;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;
import j..util.Objects;

public final class aljq implements AdapterView.OnItemSelectedListener {
    final SettingsChimeraActivity a;

    public aljq(SettingsChimeraActivity settingsChimeraActivity0) {
        Objects.requireNonNull(settingsChimeraActivity0);
        this.a = settingsChimeraActivity0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        Account account0 = new Account(this.a.n.d(), "com.google");
        this.a.a(account0);
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

