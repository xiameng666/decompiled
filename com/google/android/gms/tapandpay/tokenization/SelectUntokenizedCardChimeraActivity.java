package com.google.android.gms.tapandpay.tokenization;

import ByteString;
import MessageLite;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import batl;
import bbcu;
import bboh;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.material.button.MaterialButton;
import dagger.internal.Preconditions;
import domu;
import domv;
import dydw;
import esge;
import esgi;
import etsq;
import etsy;
import ettb;
import etti;
import eukc;
import eulz;
import eume;
import eumf;
import eumg;
import eumj;
import eumk;
import euyd;
import euyg;
import eveh;
import evei;
import eveq;
import fbjg;
import fhvo;
import fhwk;
import fhwp;
import fipx;
import fshb;
import gtfj;
import gtfk;
import gtfq;
import gtfr;
import gtfs;
import gtfv;
import hftc;
import hfur;
import hypg;
import hypp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@GmsCoreVeId(0x3FE1B)
public class SelectUntokenizedCardChimeraActivity extends etsq implements fshb {
    public euyd A;
    eukc B;
    private static final bboh C;
    private AccountInfo D;
    private long E;
    private String F;
    public gtfv j;
    public boolean k;
    public View l;
    public TextView m;
    public View n;
    public esgi o;
    public eumj p;
    public byte[] q;
    public byte[] r;
    public List s;
    public boolean t;
    public byte[] u;
    public eumk v;
    public fhwk w;
    public euyg x;
    public boolean y;
    public ListView z;

    static {
        SelectUntokenizedCardChimeraActivity.C = bboh.b("TapAndPay", bbcu.aM);
    }

    public SelectUntokenizedCardChimeraActivity() {
        this.j = null;
        this.k = false;
    }

    // Detected as a lambda impl.
    public final void a(int v, gtfv gtfv0) {
        Intent intent0 = new Intent();
        if(gtfv0 != null) {
            intent0.putExtra("output_untokenized_card", gtfv0.toBytesArray());
        }
        byte[] arr_b = this.r;
        if(arr_b != null) {
            intent0.putExtra("output_add_token", arr_b);
        }
        this.setResult(v, intent0);
        this.finish();
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    // Detected as a lambda impl.
    public final void m() {
        Toast.makeText(this.getBaseContext(), 0x7F153152, 0).show();  // string:tp_activate_unable_to_load_customer "Couldn\'t load cards. Choose another 
                                                                      // profile or try again."
        this.s.clear();
        this.o();
    }

    public final void n(ByteString hfsf0) {
        if(this.k) {
            this.r = hfsf0.toByteArray();
            this.a(-1, this.j);
            return;
        }
        gtfv gtfv0 = this.j;
        batl.s(gtfv0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gtfv0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gtfv0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtfv gtfv1 = (gtfv)hftp0.b_message;
        hfsf0.getClass();
        gtfv1.e = hfsf0;
        gtfv gtfv2 = (gtfv)hftp0.N_build();
        this.j = gtfv2;
        this.a(-1, gtfv2);
    }

    public final void o() {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: this.s) {
            gtfv gtfv0 = (gtfv)object0;
            if((1 & gtfv0.b) != 0 && gtfr.a((gtfv0.f == null ? gtfs.a : gtfv0.f).b) == 3) {
                arrayList0.add(gtfv0);
            }
            else {
                arrayList1.add(gtfv0);
            }
        }
        this.s = arrayList1;
        arrayList1.addAll(arrayList0);
        this.v.clear();
        this.v.addAll(this.s);
        this.l.setVisibility(0);
        this.n.setVisibility(8);
        TextView textView0 = (TextView)this.findViewById(0x7F0B01CE);  // id:ChooseCardPrompt
        if(this.y) {
            if(this.s.isEmpty()) {
                ((TextView)this.findViewById(0x7F0B1663)).setText(0x7F15314D);  // id:heading
                textView0.setText("You can add one to this payments profile or choose another profile under the menu");
                this.m.setText(0x7F15314C);  // string:tp_activate_add_card "Add card"
            }
            else {
                textView0.setText("You can choose one that\'s already saved to your Google Account or add a new one");
                this.m.setText(0x7F15314B);  // string:tp_activate_add_another_card "Add a new card"
            }
        }
        if(this.j == null && !this.k) {
            if(this.s.isEmpty()) {
                this.k = true;
            }
            else {
                this.j = (gtfv)this.s.get(0);
            }
        }
        if(this.j == null && !this.k) {
            this.findViewById(0x7F0B020E).setEnabled(false);  // id:ConfirmButton
        }
        if(this.k) {
            ((RadioButton)this.l.findViewById(0x7F0B17D6)).setChecked(true);  // id:left_icon_radio
        }
        this.v.notifyDataSetChanged();
    }

    @Override  // xoi
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1) {
            switch(v1) {
                case -1: {
                    long v2 = this.E;
                    this.E = intent0 == null ? 0L : intent0.getLongExtra("com.google.android.gms.wallet.firstparty.EXTRA_CUSTOMER_ID", 0L);
                    boolean z = intent0 != null && intent0.getBooleanExtra("com.google.android.gms.wallet.firstparty.EXTRA_NEW_CUSTOMER", false);
                    if(v2 != this.E) {
                        goto label_11;
                    }
                    if(z) {
                        z = true;
                    label_11:
                        this.n.setVisibility(0);
                        this.l.setVisibility(8);
                        this.v.clear();
                        this.v.notifyDataSetChanged();
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtfj.a).v_newBuilder();
                        ByteString hfsf0 = ByteString.copyFrom(this.q);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gtfj)hftp0.b_message).c = hfsf0;
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtfq.a).v_newBuilder();
                        long v3 = this.E;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        ((gtfq)hftv0).c = v3;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gtfq)hftp1.b_message).b = (z ? 3 : 4) - 2;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gtfj gtfj0 = (gtfj)hftp0.b_message;
                        gtfq gtfq0 = (gtfq)hftp1.N_build();
                        gtfq0.getClass();
                        gtfj0.d = gtfq0;
                        gtfj0.b |= 1;
                        boolean z1 = hypg.c();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gtfj)hftp0.b_message).e = z1;
                        gtfj gtfj1 = (gtfj)hftp0.N_build();
                        eume eume0 = new eume(this, z);
                        etsy.g(this.o, etti.I, ((MessageLite)gtfj1), ((MessageLite)gtfk.a), eume0, null);
                        return;
                    }
                    return;
                }
                case 0: {
                    break;
                }
                default: {
                    this.m();
                    return;
                }
            }
            this.o();
        }
    }

    @Override  // etsq
    protected final void onCreate(Bundle bundle0) {
        boolean z = this.getIntent().getBooleanExtra("isSetupFlow", false);
        this.y = z;
        if(z) {
            evei.d(this, 0x7F160F62);  // style:TpOobeActivityTheme
        }
        else if(!hypg.c()) {
            this.setTheme(0x7F16106C);  // style:WalletTheme
        }
        if(!hypg.c() || !hypp.f()) {
            eveh.a(this);
        }
        super.onCreate(bundle0);
        if(this.B == null) {
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.B = new eukc(domv0);
        }
        this.B.inject(this);
        this.setContentView(0x7F0E0BAF);  // layout:tp_select_untokenized_card_activity
        this.setTitle("");
        View view0 = this.findViewById(0x1020002);
        view0.setVisibility(4);
        LinearLayout linearLayout0 = (LinearLayout)this.findViewById(0x7F0B0121);  // id:ButtonBar
        if(!this.y) {
            linearLayout0.setGravity(0x800005);
            linearLayout0.setPadding(linearLayout0.getPaddingStart(), linearLayout0.getPaddingTop(), linearLayout0.getPaddingEnd(), 0);
        }
        if(bundle0 != null) {
            byte[] arr_b = bundle0.getByteArray("selected_card");
            if(arr_b != null) {
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtfv.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    this.j = (gtfv)hftv0;
                }
                catch(hfur hfur0) {
                    a.ae(SelectUntokenizedCardChimeraActivity.C.j(), "Failed to parse untokenized card", hfur0);
                }
            }
            this.k = bundle0.getBoolean("selected_add");
        }
        AccountInfo accountInfo0 = (AccountInfo)dydw.b(this.getIntent(), "extra_account_info", AccountInfo.CREATOR);
        batl.s(accountInfo0);
        this.D = accountInfo0;
        byte[] arr_b1 = this.getIntent().getByteArrayExtra("extra_client_token");
        batl.s(arr_b1);
        this.q = arr_b1;
        this.F = this.getIntent().getStringExtra("session_id");
        this.t = this.getIntent().getBooleanExtra("extra_should_show_customer_selector", false);
        this.u = this.getIntent().getByteArrayExtra("extra_customer_selector_params");
        this.s = new ArrayList();
        Serializable serializable0 = this.getIntent().getSerializableExtra("extra_card_list");
        if(serializable0 != null) {
            try {
                ArrayList arrayList0 = new ArrayList();
                int v = ((ArrayList)serializable0).size();
                for(int v1 = 0; v1 < v; ++v1) {
                    byte[] arr_b2 = (byte[])((ArrayList)serializable0).get(v1);
                    hftc hftc1 = hftc.a();
                    ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtfv.a), arr_b2, 0, arr_b2.length, hftc1);
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    arrayList0.add(((gtfv)hftv1));
                }
                this.s = arrayList0;
            }
            catch(hfur hfur1) {
                a.ae(SelectUntokenizedCardChimeraActivity.C.j(), "Failed to parse untokenized card", hfur1);
            }
        }
        this.p = new eumj(this);
        LayoutInflater layoutInflater0 = LayoutInflater.from(this);
        ListView listView0 = (ListView)this.findViewById(0x7F0B0664);  // id:PaymentCardList
        this.z = listView0;
        View view1 = layoutInflater0.inflate((this.y ? 0x7F0E0BB1 : 0x7F0E0BB0), listView0, false);  // layout:tp_select_untokenized_card_activity_header_suw
        this.z.addHeaderView(view1);
        View view2 = layoutInflater0.inflate((this.y ? 0x7F0E0BB4 : 0x7F0E0BB3), this.z, false);  // layout:tp_select_untokenized_card_item_suw
        this.l = view2;
        if(this.y) {
            this.z.addFooterView(view2, null, true);
        }
        else {
            view2.findViewById(0x7F0B0368).setVisibility(0);  // id:Divider
            this.z.addHeaderView(this.l, null, true);
        }
        this.o = new esgi(this.D, esge.d(), this);
        this.n = this.findViewById(0x7F0B081B);  // id:Spinner
        this.l.setOnClickListener(this.p);
        this.l.setTag("AddCardRow");
        this.m = (TextView)this.l.findViewById(0x7F0B17A6);  // id:label
        this.l.findViewById(0x7F0B17D6).setVisibility(8);  // id:left_icon_radio
        this.l.findViewById(0x7F0B17D5).setVisibility(0);  // id:left_icon_plus
        MaterialButton materialButton0 = (MaterialButton)this.findViewById(0x7F0B020E);  // id:ConfirmButton
        materialButton0.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            Intent intent0 = new Intent();
            if(this.a.j != null) {
                intent0.putExtra("output_untokenized_card", this.a.j.toBytesArray());
            }
            byte[] arr_b = this.r;
            if(arr_b != null) {
                intent0.putExtra("output_add_token", arr_b);
            }
            this.setResult(-1, intent0);
            this.finish();
        });
        view0.setVisibility(0);
        eumk eumk0 = new eumk(this, this, new ArrayList());
        this.v = eumk0;
        if(this.y) {
            this.z.removeFooterView(this.l);
            view1.findViewById(0x7F0B1663).setVisibility(8);  // id:heading
            view1.findViewById(0x7F0B01CE).setVisibility(8);  // id:ChooseCardPrompt
            this.l.findViewById(0x7F0B17D5).setVisibility(8);  // id:left_icon_plus
            this.l.findViewById(0x7F0B1B40).setVisibility(0);  // id:oobe_left_icon_plus_background
            this.l.findViewById(0x7F0B1B3F).setVisibility(0);  // id:oobe_left_icon_plus
            this.m.setTextColor(fipx.a(this, 0x7F040312));  // attr:colorPrimaryGoogle
            materialButton0.setVisibility(8);
            view1.findViewById(0x7F0B0549).setVisibility(0);  // id:Logo
            this.z.setAdapter(new eumg(this));
            view1.setEnabled(false);
            TextView textView0 = (TextView)view1.findViewById(0x7F0B1663);  // id:heading
            textView0.setText(0x7F15323A);  // string:tp_oobe_select_card_on_file "Choose a card to set up"
            textView0.setTextAlignment(4);
            textView0.setTextAppearance(0x7F160F78);  // style:Tp_Text_Headline.Suw
            ((TextView)view1.findViewById(0x7F0B01CE)).setTextAppearance(0x7F160F7D);  // id:ChooseCardPrompt
            esgi esgi0 = this.o;
            byte[] arr_b3 = this.q;
            String s = this.F;
            eulz eulz0 = new eulz(this);
            euyg.b(esgi0, arr_b3, s, new ettb((/* MISSING LAMBDA PARAMETER */) -> {
                Toast.makeText(this.getBaseContext(), 0x7F153152, 0).show();  // string:tp_activate_unable_to_load_customer "Couldn\'t load cards. Choose another 
                                                                              // profile or try again."
                this.s.clear();
                this.o();
            }, eulz0));
            this.findViewById(0x7F0B0102).setVisibility(4);  // id:BottomShadow
            this.findViewById(0x7F0B08E7).setVisibility(4);  // id:TopShadow
        }
        else {
            this.z.setAdapter(eumk0);
            this.o();
            ListView listView1 = this.z;
            View view3 = this.findViewById(0x7F0B08E7);  // id:TopShadow
            View view4 = this.findViewById(0x7F0B0102);  // id:BottomShadow
            this.p(listView1, view3, view4);
            listView1.setOnScrollListener(new eumf(this, listView1, view3, view4));
        }
        fhwk fhwk0 = this.w;
        Activity activity0 = this.getContainerActivity();
        fhvo fhvo0 = this.w.a.a(88994);
        fhvo0.e(fhwp.b(this.D.b));
        fhwk0.i(activity0, fhvo0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        this.getMenuInflater().inflate(0x7F100040, menu0);  // menu:tp_menu_account_selector
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.a(0, null);
                return true;
            }
            case 0x7F0B0620: {  // id:OpenAccountSelector
                fbjg fbjg0 = new fbjg(this);
                fbjg0.e(esge.a());
                fbjg0.c(new Account(this.D.b, "com.google"));
                fbjg0.d(eveq.a());
                fbjg0.g((this.y ? 1 : 3));
                fbjg0.h(this.u);
                this.startActivityForResult(fbjg0.a(), 1);
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onPrepareOptionsMenu(Menu menu0) {
        if(this.t) {
            menu0.findItem(0x7F0B0620).setVisible(true);  // id:OpenAccountSelector
        }
        return super.onPrepareOptionsMenu(menu0);
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        gtfv gtfv0 = this.j;
        if(gtfv0 != null) {
            bundle0.putByteArray("selected_card", gtfv0.toBytesArray());
        }
        bundle0.putBoolean("selected_add", this.k);
    }

    public final void p(ListView listView0, View view0, View view1) {
        if(listView0.getChildCount() == 0 || listView0.getFirstVisiblePosition() == 0 && listView0.getChildAt(0).getTop() == listView0.getPaddingTop()) {
            view0.setVisibility(4);
        }
        else {
            view0.setVisibility(0);
        }
        if(listView0.getChildCount() == 0 || listView0.getLastVisiblePosition() == this.s.size() - 1 + listView0.getHeaderViewsCount() + listView0.getFooterViewsCount() && listView0.getChildAt(listView0.getChildCount() - 1).getBottom() <= listView0.getHeight() - listView0.getPaddingBottom() - listView0.getPaddingTop()) {
            view1.setVisibility(4);
            return;
        }
        view1.setVisibility(0);
    }

    public static void q(SelectUntokenizedCardChimeraActivity selectUntokenizedCardChimeraActivity0, gtfv gtfv0) {
        selectUntokenizedCardChimeraActivity0.a(-1, gtfv0);
    }
}

