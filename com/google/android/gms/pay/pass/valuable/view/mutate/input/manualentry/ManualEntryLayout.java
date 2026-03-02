package com.google.android.gms.pay.pass.valuable.view.mutate.input.manualentry;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.pass.common.barcode.BarcodeView;
import com.google.android.gms.pay.pass.valuable.model.prompt.UserDataPrompt;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.rowprimary.RowPrimary;
import dagger.internal.Preconditions;
import dokz;
import domu;
import domv;
import dvnd;
import dwqz;
import dwra;
import dwrb;
import dwrc;
import dwrd;
import efmu;
import fhvo;
import fhvw;
import fhwk;
import fhxi;
import fryh;
import fryr;
import fryu;
import ftrz;
import ftts;
import ftux;
import ftuy;
import ftzm;
import ftzv;
import fuba;
import fufz;
import fule;
import gfta;
import gged_interceptors;
import guut;
import guuv;
import guvv;
import hwev;
import java.util.ArrayList;
import java.util.List;

public class ManualEntryLayout extends LinearLayout {
    public final efmu a;
    public fhwk b;
    public fhxi c;
    public fhvw d;
    private final BarcodeView e;
    private final ComposeActionBar f;
    private final ActionBar g;
    private final Button h;
    private final View i;
    private final ViewGroup j;

    public ManualEntryLayout(Context context0) {
        this(context0, null);
    }

    public ManualEntryLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ManualEntryLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new efmu();
        ManualEntryLayout.inflate(context0, (hwev.c() ? 0x7F0E0D83 : 0x7F0E0D84), this);  // layout:wallet_pay_valuable_manual_entry
        this.e = (BarcodeView)this.findViewById(0x7F0B00BB);  // id:Barcode
        this.f = (ComposeActionBar)this.findViewById(0x7F0B074A);  // id:SaveActionBar
        this.g = (ActionBar)this.findViewById(0x7F0B0012);  // id:ActionBar
        this.h = (Button)this.findViewById(0x7F0B06B2);  // id:PrimaryActionButton
        this.i = this.findViewById(0x7F0B07A2);  // id:ScanButton
        this.j = (ViewGroup)this.findViewById(0x7F0B0971);  // id:UserDataPrompts
    }

    public final void a(dvnd dvnd0, gged_interceptors gged0, guvv guvv0, boolean z, String s) {
        this.a.a.clear();
        this.j.removeAllViews();
        dvnd0.a(this.a, z, this.j, s, gged0);
        if(guvv0 != null && (guvv0.b & 1) != 0) {
            guut guut0 = guvv0.d == null ? guut.a : guvv0.d;
            if((guuv.b(guut0.b) == null ? guuv.p : guuv.b(guut0.b)) != guuv.a) {
                guut guut1 = guvv0.d;
                guut guut2 = guut1 == null ? guut.a : guut1;
                if((guuv.b(guut2.b) == null ? guuv.p : guuv.b(guut2.b)) != guuv.o && !guvv0.g) {
                    if(guut1 == null) {
                        guut1 = guut.a;
                    }
                    this.e.h(guut1, false);
                    this.e.i(false);
                    this.e.setVisibility(0);
                    return;
                }
            }
        }
        this.e.setVisibility(8);
    }

    public final void b(boolean z) {
        this.i.setEnabled(z);
    }

    public final void c(dokz dokz0) {
        synchronized(this) {
            this.e.d(dokz0);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            new dwqz(domv0).inject(this);
            if(!hwev.c()) {
                Button button0 = this.h;
                if(button0 != null) {
                    this.b.f(button0, this.b.a.a(228305));
                }
            }
            fhwk fhwk0 = this.b;
            fhvo fhvo0 = fhwk0.a.a(230084);
            fhwk0.f(this.i, fhvo0);
        }
    }

    public final void d(String s, View view0, gged_interceptors gged0, String s1, dwrd dwrd0) {
        if(hwev.c()) {
            ComposeActionBar composeActionBar0 = this.f;
            if(composeActionBar0 != null) {
                dwrc dwrc0 = new dwrc(this, view0, gged0, s1, dwrd0);
                ftux ftux0 = ftts.a(new fryu(s), dwrc0);
                ftux0.f(228305);
                ftts ftts0 = ftux0.a();
                ftuy ftuy0 = new ftuy();
                ftuy0.h(ftts0);
                composeActionBar0.d(ftuy0.a());
                composeActionBar0.e(new fufz(this.c, this.d));
            }
        }
        else {
            ActionBar actionBar0 = this.g;
            if(actionBar0 != null) {
                actionBar0.l(new ftrz(s, new dwrb(this, view0, gged0, s1, dwrd0)), null);
            }
        }
    }

    public static final List e(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            UserDataPrompt userDataPrompt0 = (UserDataPrompt)object0;
            if(!gfta.b(userDataPrompt0.d).equals(userDataPrompt0.h)) {
                list1.add(userDataPrompt0);
            }
        }
        return list1;
    }

    public final void f(int v, View.OnClickListener view$OnClickListener0) {
        if(v != 3 && v != 4 && v != 5) {
            this.i.setVisibility(8);
            return;
        }
        ftzv ftzv0 = new ftzv(new fryr(0x7F152346), null, new fuba(new fryh(0x7F080C9E), null, new fryr(0x7F151C10), false, 16), ftzm.a, fule.a);  // string:pay_valuable_scan_barcode_button "Scan your card"
        ((RowPrimary)this.i).g(ftzv0);
        this.i.setVisibility(0);
        dwra dwra0 = new dwra(this, view$OnClickListener0);
        this.i.setOnClickListener(dwra0);
    }
}

