import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class etip extends du {
    public View a;
    public etlf ag;
    private TextView ah;
    private RecyclerView ai;
    private RecyclerView aj;
    public ethl b;
    public ethl c;
    public TextView d;

    public etip() {
        bboh.b("TapAndPay", bbcu.aM);
    }

    @Override  // du
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.ag == null) {
            etlf etlf0 = (etlf)new lso(((lsq)context0)).a(etlf.class);
            ibuq.f(etlf0, "<set-?>");
            this.ag = etlf0;
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E0835, viewGroup0, false);  // layout:push_tokenize_device_selection_fragment
        ibuq.e(view0, "inflate(...)");
        this.ai = (RecyclerView)view0.findViewById(0x7F0B0335);  // id:DeviceListView
        this.a = view0.findViewById(0x7F0B2093);  // id:spinner
        this.aj = (RecyclerView)view0.findViewById(0x7F0B0071);  // id:AlreadyAddedDeviceListView
        this.ah = (TextView)view0.findViewById(0x7F0B112F);  // id:device_selection_display_name
        this.d = (TextView)view0.findViewById(0x7F0B0070);  // id:AlreadyAddedDeviceListTitle
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        icmq icmq0 = this.y().a.a;
        lps lps0 = this.getViewLifecycleOwner();
        RecyclerView recyclerView0 = null;
        icbb.b(lpt.a(lps0), null, null, new etik(lps0, icmq0, null, this), 3);
        icmq icmq1 = this.y().b.c;
        lps lps1 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps1), null, null, new etin(lps1, icmq1, null, this), 3);
        TextView textView0 = this.ah;
        if(textView0 == null) {
            ibuq.j("displayName");
            textView0 = null;
        }
        textView0.setText(this.requireArguments().getString("extra_display_name"));
        ethl ethl0 = new ethl(this.y(), false);
        this.b = ethl0;
        ethl0.C(tj.a);
        ethl ethl1 = this.b;
        if(ethl1 == null) {
            ibuq.j("deviceListViewAdapter");
            ethl1 = null;
        }
        ethl1.a = new etio(this);
        RecyclerView recyclerView1 = this.ai;
        if(recyclerView1 == null) {
            ibuq.j("deviceListView");
            recyclerView1 = null;
        }
        ethl ethl2 = this.b;
        if(ethl2 == null) {
            ibuq.j("deviceListViewAdapter");
            ethl2 = null;
        }
        recyclerView1.an(ethl2);
        RecyclerView recyclerView2 = this.ai;
        if(recyclerView2 == null) {
            ibuq.j("deviceListView");
            recyclerView2 = null;
        }
        recyclerView2.ap(new LinearLayoutManager());
        this.c = new ethl(this.y(), true);
        RecyclerView recyclerView3 = this.aj;
        if(recyclerView3 == null) {
            ibuq.j("alreadyAddedDeviceListView");
            recyclerView3 = null;
        }
        ethl ethl3 = this.c;
        if(ethl3 == null) {
            ibuq.j("alreadyAddedDeviceListAdapter");
            ethl3 = null;
        }
        recyclerView3.an(ethl3);
        RecyclerView recyclerView4 = this.aj;
        if(recyclerView4 == null) {
            ibuq.j("alreadyAddedDeviceListView");
        }
        else {
            recyclerView0 = recyclerView4;
        }
        recyclerView0.ap(new LinearLayoutManager());
    }

    public final etlf y() {
        etlf etlf0 = this.ag;
        if(etlf0 != null) {
            return etlf0;
        }
        ibuq.j("viewModel");
        return null;
    }
}

