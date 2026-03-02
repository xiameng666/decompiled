import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.setupdesign.GlifLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class ermn extends du implements erlx {
    public static final baun a;
    public Set ag;
    public Set ah;
    public boolean ai;
    public epyh aj;
    public boolean ak;
    public boolean al;
    private boolean am;
    private String an;
    private erly ao;
    private erhh ap;
    private ermj aq;
    private GlifLayout ar;
    public erml b;
    public List c;
    public Set d;

    static {
        ermn.a = new erqc(new String[]{"Setup", "UI", "SelectAccountFragment"});
    }

    public ermn() {
        this.d = new HashSet();
        this.ag = new HashSet();
        this.ah = new HashSet();
        this.ai = false;
        this.aj = epyh.a;
        this.ak = false;
        this.al = false;
    }

    private final gmcd A(String s) {
        erhh erhh0 = this.ap;
        List list0 = this.c;
        HashMap hashMap0 = ggkm.k(list0.size());
        for(Object object0: list0) {
            hashMap0.put(((Account)object0), erhh0.a(((Account)object0), s));
        }
        return gmbu.a(hashMap0.values()).a(new ermh(hashMap0, s), gmap.a);
    }

    @Override  // erlx
    public final void a() {
        if(this.ai) {
            ermn.a.d("Waiting on unsupported accounts to be populated", new Object[0]);
            return;
        }
        this.z();
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        try {
            this.b = (erml)context0;
        }
        catch(ClassCastException classCastException0) {
            throw new RuntimeException("Containing activity must implement SelectAccountFragment.Listener", classCastException0);
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            this.ak = bundle0.getBoolean("smartdevice.selectAccountFragment.accountSelected", false);
            this.al = bundle0.getBoolean("smartdevice.selectAccountFragment.triedToSelectUnsupported", false);
        }
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            this.am = bundle1.getBoolean("smartdevice.accountRequired", false);
            this.aj = epyh.a(bundle1.getString("device_type"));
            this.an = bundle1.getString("smartdevice.title", this.getString(0x7F150809));  // string:common_choose_account_label "Choose an account"
        }
        Context context0 = this.requireContext();
        this.ao = new erly();
        this.ap = new erhh(context0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        GlifLayout glifLayout0 = (GlifLayout)layoutInflater0.inflate((this.aj == epyh.g ? 0x7F0E09D7 : 0x7F0E09D2), viewGroup0, false);  // layout:smartdevice_account_list_v2
        this.ar = glifLayout0;
        return glifLayout0;
    }

    @Override  // du
    public final void onPause() {
        erly erly0 = this.ao;
        erqg.a();
        erly0.c.remove(this);
        super.onPause();
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        erly erly0 = this.ao;
        Context context0 = this.getContext();
        batl.s(context0);
        efol efol0 = new efol();
        efol0.a = 80;
        efom efom0 = efol0.a();
        azts azts0 = new azts(context0, efom0, null);
        azts azts1 = new azts(context0, efom0);
        efnv efnv0 = new efnv();
        efnv0.a();
        azts1.bG(efnv0).e(new erlu(erly0, azts0));
        erly erly1 = this.ao;
        erqg.a();
        erly1.c.add(this);
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putBoolean("smartdevice.selectAccountFragment.accountSelected", this.ak);
        bundle0.putBoolean("smartdevice.selectAccountFragment.triedToSelectUnsupported", this.al);
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        this.ar.b(this.an);
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 == null) {
            return;
        }
        this.c = new ArrayList(Arrays.asList(erpb.a(xnz0).p("com.google")));
        epyh epyh0 = epyh.g;
        this.aq = new ermj(xnz0, (this.aj == epyh0 ? 0x7F0E09D6 : 0x7F0E09D5));  // layout:smartdevice_account_list_item_v2
        ListView listView0 = (ListView)view0.findViewById(0x7F0B0A77);  // id:account_list
        listView0.setAdapter(this.aq);
        if(this.aj == epyh0) {
            TextView textView0 = (TextView)view0.findViewById(0x7F0B18F0);  // id:message
            if(textView0 != null) {
                if(hoxb.d()) {
                    this.ar.J(0x7F152E45);  // string:smartdevice_auto_selectaccount_description "to use in your car"
                    textView0.setVisibility(8);
                }
                else {
                    textView0.setText("to use in your car");
                    textView0.setVisibility(0);
                }
            }
        }
        else {
            listView0.setDivider(null);
        }
        listView0.setOnItemClickListener(new ermc(this));
        if(this.aj == epyh0) {
            View view1 = xnz0.getLayoutInflater().inflate(0x7F0E09D3, listView0, false);  // layout:smartdevice_account_list_add_account_footer
            ((TextView)view1.findViewById(0x7F0B22B8)).setText(this.getString(0x7F152ED6));  // id:title
            view1.setOnClickListener(new ermd(this));
            listView0.addFooterView(view1);
        }
        if(!this.am) {
            View view2 = xnz0.getLayoutInflater().inflate(0x7F0E09D4, listView0, false);  // layout:smartdevice_account_list_footer
            view2.setOnClickListener(new ermi(this));
            listView0.addFooterView(view2);
        }
        if(this.aj == epyh0) {
            this.ai = true;
            gmcd gmcd0 = gmbu.q(this.A("service_HOSTED"), hygb.b(), TimeUnit.MILLISECONDS, new bbll(1, 9));
            gmcd gmcd1 = gmbu.q(this.A("service_usm"), hygb.b(), TimeUnit.MILLISECONDS, new bbll(1, 9));
            gmbu.b(new gmcd[]{gmcd0, gmcd1}).c(new erme(this, gmcd0, gmcd1), gmap.a).hB(new ermf(this), gmap.a);
            return;
        }
        this.z();
    }

    public final ermm y(Account account0) {
        return new ermm(account0, this.c.size(), this.ag.size(), this.ah.size(), this.al, false);
    }

    public final void z() {
        int v = this.aq.getCount();
        for(int v1 = 0; true; ++v1) {
            boolean z = true;
            if(v1 >= this.c.size()) {
                break;
            }
            Account account0 = (Account)this.c.get(v1);
            ermn.a.d("Display account " + account0.name, new Object[0]);
            ermk ermk0 = v > 0 ? ((ermk)this.aq.getItem(v1)) : new ermk();
            ermk0.a = account0.name;
            erly erly0 = this.ao;
            String s = account0.name;
            erqg.a();
            ermk0.b = (String)erly0.a.get(s);
            erly erly1 = this.ao;
            String s1 = account0.name;
            erqg.a();
            ermk0.c = (Bitmap)erly1.b.get(s1);
            if(this.aj != epyh.g || !this.d.contains(account0)) {
                z = false;
            }
            ermk0.d = z;
            if(v <= 0) {
                this.aq.add(ermk0);
            }
        }
        this.aq.notifyDataSetChanged();
    }
}

