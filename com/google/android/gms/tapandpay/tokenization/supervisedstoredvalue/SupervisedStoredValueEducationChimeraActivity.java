package com.google.android.gms.tapandpay.tokenization.supervisedstoredvalue;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import batl;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import dagger.internal.Preconditions;
import domu;
import domv;
import dydw;
import etsq;
import evcv;
import evde;
import evdj;
import evdk;
import evdl;
import evdn;
import fipw;
import fryr;
import fshb;
import fuhm;
import fuho;
import ggdy;
import gged_interceptors;
import hypg;
import hyrm;
import lt;

@GmsCoreVeId(0x3FE16)
public class SupervisedStoredValueEducationChimeraActivity extends etsq implements fshb {
    public fuho j;
    public ComposeViewHeader k;
    public NestedScrollView l;
    public AccountInfo m;
    public String n;
    public String o;
    evcv p;
    private evdn q;
    private ImageView r;
    private Button s;
    private LinearLayout t;
    private int u;

    public final void a(int v) {
        this.setResult(v);
        this.finish();
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    // Detected as a lambda impl.
    public final void m() {
        this.l.y(this.l.getHeight());
    }

    // Detected as a lambda impl.
    public final void n(int v) {
        if(this.l.getChildAt(0).getBottom() <= this.l.getHeight() + v) {
            LinearLayout linearLayout0 = this.t;
            batl.s(linearLayout0);
            linearLayout0.setBackgroundColor(0);
            this.s.setText("Next");
            this.s.setOnClickListener(new evde(this));
            return;
        }
        LinearLayout linearLayout1 = this.t;
        batl.s(linearLayout1);
        linearLayout1.setBackgroundColor(this.u);
        this.s.setText("More");
        this.s.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> this.l.y(this.l.getHeight()));
    }

    @Override  // etsq
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        hyrm.c();
        if(!hyrm.a.b().e()) {
            this.finish();
            return;
        }
        AccountInfo accountInfo0 = (AccountInfo)dydw.b(this.getIntent(), "extra_account_info", AccountInfo.CREATOR);
        this.m = accountInfo0;
        if(accountInfo0 == null) {
            this.finish();
            return;
        }
        if(this.p == null) {
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            AccountInfo accountInfo1 = this.m;
            batl.s(accountInfo1);
            Boolean boolean0 = (Boolean)accountInfo1.b().f(Boolean.valueOf(true));
            this.p = new evcv(domv0);
        }
        this.p.inject(this);
        if(!hypg.c()) {
            this.setTheme(0x7F16106D);  // style:WalletTheme.NoActionBar
        }
        this.setContentView(0x7F0E0A07);  // layout:ssv_education_fragment
        this.k = (ComposeViewHeader)this.findViewById(0x7F0B20AD);  // id:ssv_education_title
        this.r = (ImageView)this.findViewById(0x7F0B20AA);  // id:ssv_education_illustration
        this.s = (Button)this.findViewById(0x7F0B0FF2);  // id:continue_button
        this.t = (LinearLayout)this.findViewById(0x7F0B0DA3);  // id:button_bar
        NestedScrollView nestedScrollView0 = (NestedScrollView)this.findViewById(0x7F0B20AC);  // id:ssv_education_scroll_view
        this.l = nestedScrollView0;
        nestedScrollView0.getViewTreeObserver().addOnGlobalLayoutListener(new evdj(this));
        NestedScrollView nestedScrollView1 = this.l;
        nestedScrollView1.e = (/* MISSING LAMBDA PARAMETER */, int v, /* MISSING LAMBDA PARAMETER */) -> {
            if(this.l.getChildAt(0).getBottom() <= this.l.getHeight() + v) {
                LinearLayout linearLayout0 = this.t;
                batl.s(linearLayout0);
                linearLayout0.setBackgroundColor(0);
                this.s.setText("Next");
                this.s.setOnClickListener(new evde(this));
                return;
            }
            LinearLayout linearLayout1 = this.t;
            batl.s(linearLayout1);
            linearLayout1.setBackgroundColor(this.u);
            this.s.setText("More");
            this.s.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> this.l.y(this.l.getHeight()));
        };
        RecyclerView recyclerView0 = (RecyclerView)(((ViewGroup)this.findViewById(0x7F0B20AB)));  // id:ssv_education_items_list_view
        this.getApplicationContext();
        recyclerView0.ap(new LinearLayoutManager());
        evdn evdn0 = new evdn();
        this.q = evdn0;
        recyclerView0.an(evdn0);
        LinearLayout linearLayout0 = this.t;
        batl.s(linearLayout0);
        Context context0 = linearLayout0.getContext();
        this.u = fipw.c.a(context0);
        fuhm fuhm0 = new fuhm(null, new fryr(0x7F153249), null);  // string:tp_parental_consent_list_item_title "What parents can do"
        this.j = fuhm0;
        this.k.b(fuhm0);
        LinearLayout linearLayout1 = this.t;
        batl.s(linearLayout1);
        linearLayout1.setBackgroundColor(this.u);
        this.s.setText("More");
        this.s.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> this.l.y(this.l.getHeight()));
        ggdy ggdy0 = new ggdy();
        ggdy0.j(new evdk[]{new evdk(0x7F153320, 0x7F0805F0), new evdk(0x7F153321, 0x7F080615), new evdk(0x7F153322, 0x7F0805CB), new evdk(0x7F153323, 0x7F080534)});  // string:tp_supervised_stored_value_education_item_add_money "Add money to your balance"
        evdn evdn1 = this.q;
        gged_interceptors gged0 = ggdy0.h();
        gged_interceptors gged1 = evdn1.a;
        evdn1.a = gged_interceptors.h(gged0);
        lt.a(new evdl(evdn1, gged1)).c(evdn1);
        this.r.setImageResource(0x7F0809AE);  // drawable:parents_hero
    }
}

