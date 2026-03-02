import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class ekjb extends du {
    ekjq a;
    public ejyv b;
    private bxox c;

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        ekjq ekjq0 = (ekjq)new lso(((xob)this.requireContext()), ekjr.d(this.requireContext())).a(ekjq.class);
        this.a = ekjq0;
        this.requireContext();
        this.c = ekjq0.k(this.a.j());
        List list0 = (List)this.a.e.ij();
        if(list0 == null || list0.isEmpty()) {
            ejze.a().r(4, this.b.g(), this.b.c, this.a.j());
            ((xob)this.requireContext()).finish();
        }
        ((ekms)this.c).b(list0);
        this.c.g(this, new ekja(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E08C5, viewGroup0, false);  // layout:romanesco_contacts_restore_progress_fragment
        Context context0 = this.requireContext().getApplicationContext();
        if(this.b == null) {
            this.b = ejyv.d(context0);
        }
        return view0;
    }
}

