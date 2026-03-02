import com.google.android.gms.accountsettings.mg.poc.ui.search.SearchItemsListView;
import j..util.Objects;
import java.util.List;

public final class aajc implements lqj {
    public final aajp a;

    public aajc(aajp aajp0) {
        this.a = aajp0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        SearchItemsListView searchItemsListView0 = (SearchItemsListView)this.a.aq;
        List list0 = (List)Objects.requireNonNull(((List)object0));
        aaff aaff0 = searchItemsListView0.ad;
        if(aaff0 == null) {
            searchItemsListView0.aK(list0);
            return;
        }
        aaff0.g = aaff.G(list0);
        aaff0.n();
        aaff0.q();
    }
}

