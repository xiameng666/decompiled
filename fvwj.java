import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import java.util.ArrayList;
import java.util.List;

public final class fvwj extends du implements fvvz {
    public static final bboh a;
    private RecyclerView ag;
    private fvvv ah;
    List b;
    public xni c;
    public Context d;

    static {
        fvwj.a = bboh.a("EAlertTAFragSvy");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.d = this.getContext();
        this.c = (xni)this.getContext();
        this.d.getTheme().applyStyle(0x7F1603A8, true);  // style:EewAppThemeDayNightActionBar
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        arrayList0.add(fxmo.a);
        this.b.add(fxmo.b);
        this.b.add(fxmo.c);
        this.b.add(fxmo.e);
        View view0 = layoutInflater0.inflate(0x7F0E0313, viewGroup0, false);  // layout:ealert_take_action_safety_info
        if(view0 == null) {
            return null;
        }
        if(huqb.I()) {
            this.b.add(fxmo.g);
            this.b.add(fxmo.f);
            frqm.c(this.c, new fvwg());
        }
        else {
            this.b.add(fxmo.f);
        }
        Intent intent0 = this.c.getIntent();
        if(intent0 != null) {
            EAlertUxArgs eAlertUxArgs0 = fxmp.b(intent0.getExtras());
            int v = eAlertUxArgs0.k;
            if(v != 5) {
                fxmt.b().a(eAlertUxArgs0.h, eAlertUxArgs0.i, v, 7);
            }
        }
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B11D2);  // id:ealert_safety_info_recycler_view
        this.ag = recyclerView0;
        recyclerView0.r = true;
        recyclerView0.ap(new LinearLayoutManager());
        fvvv fvvv0 = new fvvv(fxmp.b(this.getArguments()), this.b, this);
        this.ah = fvvv0;
        this.ag.an(fvvv0);
        fxmp.e(this.c);
        this.c.getWindow().addFlags(fxmp.a);
        im im0 = this.c.hL();
        if(im0 != null) {
            im0.o(true);
            im0.r(true);
            im0.w(((this.getContext().getResources().getConfiguration().uiMode & 0x30) == 0x20 ? 0x7F080CDA : 0x7F080CD5));
        }
        return view0;
    }
}

