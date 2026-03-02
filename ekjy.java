import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class ekjy extends du {
    eklz a;
    public ejyv b;
    public List c;
    private bxox d;

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        eklz eklz0 = (eklz)new lso(((xob)this.requireContext()), ekma.d(this.requireContext())).a(eklz.class);
        this.a = eklz0;
        this.requireContext();
        this.d = eklz0.h(this.a.g());
        List list0 = (List)this.a.e.ij();
        this.c = list0;
        if(list0 == null || list0.isEmpty()) {
            ejze.a().r(4, this.b.g(), this.b.c, this.b.b);
            ((xob)this.requireContext()).finish();
        }
        ((ekms)this.d).b(this.c);
        this.d.g(this, new ekjx(this));
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

