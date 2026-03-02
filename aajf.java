import com.google.android.gms.accountsettings.mg.poc.ui.search.SearchItemsListView;
import java.util.ArrayList;

public final class aajf implements lqj {
    public final aajp a;

    public aajf(aajp aajp0) {
        this.a = aajp0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        aajp aajp0 = this.a;
        boolean z = aajp0.H();
        SearchItemsListView searchItemsListView0 = (SearchItemsListView)aajp0.aq;
        aaby aaby0 = (aaby)((gfsx)object0).g();
        aajo aajo0 = new aajo(aajp0);
        searchItemsListView0.ae = aaby0;
        searchItemsListView0.af = aajo0;
        if(searchItemsListView0.ad == null) {
            searchItemsListView0.aK(new ArrayList());
        }
        searchItemsListView0.ad.f(aaby0, aajo0);
        if(z) {
            ((SearchItemsListView)aajp0.aq).aM().aa(0, 0);
        }
    }
}

