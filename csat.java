import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity;

public final class csat extends du {
    public gsnm a;
    public float b;
    private csee c;

    static {
        bboh.b("MobileDataPlan", bbcu.ck);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        if(this.a == null) {
            try {
                byte[] arr_b = bundle0.getByteArray("support_info_obj");
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gsnm.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                this.a = (gsnm)hftv0;
                return layoutInflater0.inflate(0x7F0E01D1, viewGroup0, false);  // layout:carrier_support_fragment
            }
            catch(hfur unused_ex) {
                this.a = MobileDataPlanSettingsChimeraActivity.a(this.getContext());
                return layoutInflater0.inflate(0x7F0E01D1, viewGroup0, false);  // layout:carrier_support_fragment
            }
        }
        return layoutInflater0.inflate(0x7F0E01D1, viewGroup0, false);  // layout:carrier_support_fragment
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        if(!hvly.g() || !csfi.a().equals(csfi.b)) {
            crxn.c().Q(36, null, null, hhct.bk, System.currentTimeMillis(), csfi.a());
        }
        xob xob0 = (xob)this.getContext();
        if(xob0 != null) {
            xob0.setTitle(0x7F1518A4);  // string:mobile_data_plan "Device Plans"
            xob0.findViewById(0x7F0B0FE5).setVisibility(0);  // id:content_layout
            xob0.invalidateOptionsMenu();
        }
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putByteArray("support_info_obj", this.a.toBytesArray());
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        crxn.c().Q(34, null, null, hhct.bi, System.currentTimeMillis(), csfi.a());
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        im im0 = ((xni)this.getContext()).hL();
        im0.q(4, 4);
        im0.o(true);
        if(hvly.j()) {
            im0.j(new ColorDrawable(this.getResources().getColor(0x7F06001F)));  // color:action_bar_background
        }
        else {
            im0.j(new ColorDrawable(this.getResources().getColor(0x7F06129C)));  // color:top_entry_grey
        }
        this.b = im0.a();
        im0.t(0.0f);
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B219E);  // id:support_page_recyclerview
        recyclerView0.ap(new LinearLayoutManager());
        recyclerView0.D(new csas(this, im0));
        csee csee0 = new csee();
        this.c = csee0;
        csee0.H(new cskt(this.a.b));
        for(int v = 0; v < this.a.d.size(); ++v) {
            this.c.H(new cskv(((gsnl)this.a.d.get(v))));
        }
        View view1 = this.getContext() == null ? null : ((xob)this.getContext()).findViewById(0x7F0B0FE5);  // id:content_layout
        if(view1 != null) {
            view1.setVisibility(8);
        }
        recyclerView0.an(this.c);
    }
}

