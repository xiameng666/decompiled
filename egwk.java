import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import j..util.Objects;

public final class egwk extends du {
    public egwp a;
    private egvc b;

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.b = new egvc();
        this.a = (egwp)new lso(this, egxn.d(this.requireContext())).a(egwp.class);
        Bundle bundle1 = this.getArguments();
        Account account0 = bundle1 == null ? null : ((Account)bundle1.getParcelable("account"));
        if(account0 == null) {
            throw new IllegalStateException("Account is required.");
        }
        egwp egwp0 = this.a;
        egwp0.g = account0;
        egwp0.d = egwp0.i.b(account0);
        egwp0.e = lsa.c(egwp0.i.c(account0), new egwl(egwp0));
        AccountWithDataSet accountWithDataSet0 = new AccountWithDataSet(account0, null, false);
        egwp0.f = egwp0.c.a(accountWithDataSet0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        egwp egwp0 = this.a;
        boolean z = hwym.c();
        egid egid0 = new egid(layoutInflater0.inflate(0x7F0E07B9, viewGroup0, false), egwp0, this, z);  // layout:people_contacts_import_screen
        egid0.b(false);
        this.a.f.g(this.getViewLifecycleOwner(), new egwh(egid0));
        lqd lqd0 = lsa.b(((lqd)Objects.requireNonNull(this.a.d)), new egwn());
        lps lps0 = this.getViewLifecycleOwner();
        Objects.requireNonNull(egid0);
        lqd0.g(lps0, new egwi(egid0));
        lqd lqd1 = this.a.e;
        lps lps1 = this.getViewLifecycleOwner();
        Objects.requireNonNull(egid0);
        lqd1.g(lps1, new egwj(egid0));
        egid0.b.setEnabled(false);
        egid0.e.h = this;
        egid0.e.u(1, egid0.e.b());
        if(this.getContext() != null) {
            egwp egwp1 = this.a;
            egvc egvc0 = this.y();
            int v = egxj.r(egxj.b(this));
            gfsx gfsx0 = egik.f();
            if(bundle0 == null && !egwp1.h) {
                ((egik)((gftm)gfsx0).a).a.a(bbdg.fh);
                egvc0.g(8, v);
                egwp1.h = true;
            }
        }
        return egid0.a;
    }

    public final egvc y() {
        egvc egvc0 = this.b;
        gftb.check(egvc0);
        return egvc0;
    }
}

