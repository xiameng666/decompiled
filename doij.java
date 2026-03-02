import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.gms.pay.homescreen.passlist.expiredpasses.ExpiredPassesFragment.enableExpiredPassListScroll.1;

public final class doij implements lqj {
    private final doik a;

    public doij(doik doik0) {
        this.a = doik0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        doik doik0 = this.a;
        View view0 = doik0.getView();
        if(((dofl)object0) != null && !((dofl)object0).e && view0 != null) {
            Context context0 = doik0.requireContext();
            View view1 = view0.findViewById(0x7F0B03CF);  // id:ExpiredPassesList
            ibuq.e(view1, "findViewById(...)");
            tx tx0 = ((RecyclerView)view1).h();
            if(tx0 != null && !tx0.ae()) {
                ((RecyclerView)view1).ap(new ExpiredPassesFragment.enableExpiredPassListScroll.1(context0));
            }
        }
    }
}

