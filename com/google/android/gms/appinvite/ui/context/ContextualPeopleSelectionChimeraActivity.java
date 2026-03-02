package com.google.android.gms.appinvite.ui.context;

import accl;
import accn;
import acct;
import accv;
import accz;
import acdc;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import azql;
import bauc;
import bbcu;
import bboh;
import bbqa;
import ca;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.CustomSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.GridSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.ListSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fm;
import ggtj;
import hour;
import java.util.ArrayList;
import java.util.Arrays;
import uq;
import xni;

@GmsCoreVeId(257009)
@Deprecated
public final class ContextualPeopleSelectionChimeraActivity extends xni implements accl, acct, accv, View.OnClickListener {
    private static final bboh j;
    private View k;
    private View l;
    private accn m;
    private uq n;
    private View o;
    private CharSequence p;
    private CharSequence q;
    private CharSequence r;

    static {
        ContextualPeopleSelectionChimeraActivity.j = bboh.b("AppInvite", bbcu.aK);
    }

    private final void a(boolean z) {
        this.p = null;
        this.q = null;
        this.r = null;
        Intent intent0 = this.getIntent();
        if(!z) {
            this.p = intent0.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_HINT_TEXT");
            this.q = intent0.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_MODE_HINT_TEXT");
            CharSequence charSequence0 = intent0.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_MODE_WITH_SELECTIONS_HINT_TEXT");
            this.r = charSequence0;
            if(TextUtils.isEmpty(charSequence0)) {
                this.r = this.q;
            }
        }
        if(TextUtils.isEmpty(this.p)) {
            this.p = intent0.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_HINT_TEXT");
        }
        if(TextUtils.isEmpty(this.q)) {
            CharSequence charSequence1 = intent0.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_MODE_HINT_TEXT");
            this.q = charSequence1;
            if(TextUtils.isEmpty(charSequence1)) {
                this.q = this.p;
            }
        }
        if(TextUtils.isEmpty(this.r)) {
            CharSequence charSequence2 = intent0.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_MODE_WITH_SELECTIONS_HINT_TEXT");
            this.r = charSequence2;
            if(TextUtils.isEmpty(charSequence2)) {
                this.r = this.q;
            }
        }
    }

    private final void g() {
        accn accn0 = this.m;
        CharSequence charSequence0 = this.p;
        acdc acdc0 = accn0.au;
        if(acdc0 != null) {
            acdc0.R(charSequence0);
        }
        accz accz0 = accn0.av;
        if(accz0 != null) {
            accz0.R(charSequence0);
        }
        accn accn1 = this.m;
        CharSequence charSequence1 = accn1.y() <= 0 ? this.q : this.r;
        acdc acdc1 = accn1.au;
        if(acdc1 != null) {
            acdc1.U(charSequence1);
        }
        accz accz1 = accn1.av;
        if(accz1 != null) {
            accz1.U(charSequence1);
        }
    }

    @Override  // acct
    public final void l() {
        this.p();
    }

    @Override  // acct
    public final void m(int v, int v1) {
        this.a(v + v1 > 0);
        this.p();
        this.o();
    }

    @Override  // acct
    public final void n(int v, int v1) {
        this.a(v + v1 > 0);
        this.p();
        this.o();
    }

    private final void o() {
        boolean z = this.m.y() > 0;
        this.o.setEnabled(z);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Intent intent0 = new Intent();
        intent0.putParcelableArrayListExtra("com.google.android.gms.appinvite.CONTEXT_RESULT_SELECTED_PEOPLE", new ArrayList(this.m.B()));
        this.setResult(-1, intent0);
        this.finish();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ContextualPeopleSelectionChimeraActivity contextualPeopleSelectionChimeraActivity0;
        ca ca1;
        boolean z6;
        Context context0;
        super.onCreate(bundle0);
        if(hour.f()) {
            ((ggtj)ContextualPeopleSelectionChimeraActivity.j.i()).x("ContextualPeopleSelectionChimeraActivityDisabled");
            this.finish();
            return;
        }
        String s = bbqa.d() ? this.getLaunchedFromPackage() : null;
        if(s == null) {
            s = this.getCallingPackage();
        }
        if(s != null && azql.c(this).g(s)) {
            this.setContentView(0x7F0E0098);  // layout:appinvite_contextual_selection_activity
            this.k = this.findViewById(0x7F0B1FAB);  // id:selection_content
            this.l = this.findViewById(0x7F0B1D35);  // id:progress_bar
            try {
                context0 = this.createPackageContext(s, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                context0 = this.getContainerActivity();
            }
            Intent intent0 = this.getIntent();
            String s1 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_TITLE");
            if(intent0.hasExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_COLOR")) {
                int v = intent0.getIntExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_COLOR", 0xFF000000);
                SpannableString spannableString0 = new SpannableString(s1);
                spannableString0.setSpan(new ForegroundColorSpan(v), 0, spannableString0.length(), 18);
                s1 = spannableString0;
            }
            Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B22D9);  // id:toolbar
            toolbar0.D(s1);
            if(intent0.hasExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_APPEARANCE")) {
                toolbar0.E(context0, intent0.getIntExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_APPEARANCE", 0));
            }
            if(intent0.hasExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_BACKGROUND_COLOR")) {
                toolbar0.setBackgroundColor(intent0.getIntExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_BACKGROUND_COLOR", 0));
            }
            this.hG(toolbar0);
            String s2 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_ACCOUNT_NAME");
            if(TextUtils.isEmpty(s2)) {
                this.finish();
                return;
            }
            int v1 = intent0.getIntExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON", 0);
            TextView textView0 = (TextView)this.findViewById(0x7F0B1F8A);  // id:select
            if(v1 == 0) {
                this.o = textView0;
                String s3 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT");
                if(!TextUtils.isEmpty(s3)) {
                    textView0.setText(s3);
                }
                if(intent0.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR_STATES")) {
                    Bundle bundle1 = intent0.getBundleExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR_STATES");
                    int v2 = bundle1.size();
                    int[][] arr2_v = new int[v2][];
                    int[] arr_v = new int[v2];
                    for(int v3 = 0; v3 < v2; ++v3) {
                        int[] arr_v1 = bundle1.getIntArray(Integer.toString(v3));
                        if(arr_v1 != null && arr_v1.length > 0) {
                            arr_v[v3] = arr_v1[0];
                            arr2_v[v3] = Arrays.copyOfRange(arr_v1, 1, arr_v1.length);
                        }
                    }
                    textView0.setTextColor(new ColorStateList(arr2_v, arr_v));
                }
                else if(intent0.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR")) {
                    textView0.setTextColor(context0.getResources().getColorStateList(intent0.getIntExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR", 0)));
                }
                if(intent0.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR_STATES")) {
                    Bundle bundle2 = intent0.getBundleExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR_STATES");
                    int v4 = bundle2.size();
                    StateListDrawable stateListDrawable0 = new StateListDrawable();
                    for(int v5 = 0; v5 < v4; ++v5) {
                        int[] arr_v2 = bundle2.getIntArray(Integer.toString(v5));
                        if(arr_v2 != null && arr_v2.length > 0) {
                            stateListDrawable0.addState(Arrays.copyOfRange(arr_v2, 1, arr_v2.length), new ColorDrawable(arr_v2[0]));
                        }
                    }
                    textView0.setBackgroundDrawable(stateListDrawable0);
                }
                else if(intent0.hasExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR")) {
                    textView0.setBackgroundDrawable(context0.getResources().getDrawable(intent0.getIntExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR", 0)));
                }
            }
            else {
                ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x7F0B1F93);  // id:select_frame
                View view0 = LayoutInflater.from(context0).inflate(v1, viewGroup0);
                this.o = view0;
                view0.setOnClickListener(this);
                textView0.setVisibility(8);
            }
            CharSequence charSequence0 = intent0.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_MESSAGE");
            if(!TextUtils.isEmpty(charSequence0)) {
                View view1 = this.getLayoutInflater().inflate(0x7F0E009E, ((ViewGroup)this.k), false);  // layout:appinvite_contextual_selection_message
                this.n = new uq(view1);
                ((TextView)view1.findViewById(0x7F0B18F0)).setText(charSequence0);  // id:message
            }
            fm fm0 = this.getSupportFragmentManager();
            ca ca0 = new ca(fm0);
            accn accn0 = (accn)fm0.h("selectionFragment");
            this.m = accn0;
            if(accn0 == null) {
                ArrayList arrayList0 = bauc.g(intent0, "com.google.android.gms.appinvite.CONTEXT_INITIAL_SELECTION", ContactPerson.CREATOR);
                int v6 = intent0.getIntExtra("com.google.android.gms.appinvite.CONTEXT_MAX_SELECTED", 0x7FFFFFFF);
                boolean z = intent0.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_ICON", false);
                boolean z1 = intent0.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_SELECTION", false);
                boolean z2 = intent0.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_OVERRIDE_CONTACT_METHOD_ORDER", false);
                String[] arr_s = intent0.getStringArrayExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_TYPES");
                boolean z3 = intent0.getBooleanExtra("com.google.android.gms.appinvite.EXTRA_EXCLUDE_NON_GAIA_CONTACTS", false);
                boolean z4 = intent0.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_DOCK_RECIPIENTS", false);
                ArrayList arrayList1 = bauc.g(intent0, "com.google.android.gms.appinvite.CONTEXT_ADDITIONAL_GRID_PEOPLE", ContactPerson.CREATOR);
                ArrayList arrayList2 = intent0.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_GAIA_IDS");
                ArrayList arrayList3 = intent0.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_EMAIL_ADDRESSES");
                ArrayList arrayList4 = intent0.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_PHONE_NUMBERS");
                ArrayList arrayList5 = bauc.g(intent0, "com.google.android.gms.appinvite.CONTEXT_ADDITIONAL_LIST_PEOPLE", ContactPerson.CREATOR);
                String s4 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SOURCE");
                String s5 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SOURCE_OPTIONS");
                int v7 = intent0.getIntExtra("com.google.android.gms.appinvite.CONTEXT_MAX_PORTRAIT_GRID_ITEMS", 0x7FFFFFFF);
                int v8 = intent0.getIntExtra("com.google.android.gms.appinvite.CONTEXT_MAX_LANDSCAPE_GRID_ITEMS", 0x7FFFFFFF);
                String s6 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SOURCE");
                String s7 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SOURCE_OPTIONS");
                String s8 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_HEADER_TEXT");
                String s9 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SUB_HEADER_TEXT");
                String s10 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_HEADER_TEXT");
                String s11 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SUB_HEADER_TEXT");
                boolean z5 = intent0.getBooleanExtra("com.google.android.gms.appinvite.INCLUDE_PUBLIC_PROFILE_SEARCH", false);
                ArrayList arrayList6 = intent0.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_GAIA_IDS");
                ArrayList arrayList7 = intent0.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_EMAIL_ADDRESSES");
                ArrayList arrayList8 = intent0.getStringArrayListExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_PHONE_NUMBERS");
                String s12 = intent0.getStringExtra("com.google.android.gms.appinvite.CONTEXT_DISABLED_MESSAGE");
                ArrayList arrayList9 = new ArrayList();
                if(this.n != null) {
                    arrayList9.add(new CustomSectionInfo(new int[]{0x7F0E009E}));  // layout:appinvite_contextual_selection_message
                }
                SelectionSectionInfo selectionSectionInfo0 = new SelectionSectionInfo();
                selectionSectionInfo0.p = z4;
                selectionSectionInfo0.b = true;
                arrayList9.add(selectionSectionInfo0);
                if(!TextUtils.isEmpty(s4)) {
                    ListSectionInfo listSectionInfo0 = intent0.getBooleanExtra("com.google.android.gms.appinvite.CONTEXT_DISPLAY_GRID_AS_A_LIST", false) ? new ListSectionInfo(s4) : new GridSectionInfo(s4);
                    listSectionInfo0.d = s5;
                    listSectionInfo0.b = arr_s;
                    listSectionInfo0.c = z2;
                    listSectionInfo0.j = v7;
                    listSectionInfo0.k = v8;
                    listSectionInfo0.l = arrayList1;
                    listSectionInfo0.m = arrayList2;
                    listSectionInfo0.b(arrayList3);
                    listSectionInfo0.c(arrayList4);
                    listSectionInfo0.g = s8;
                    listSectionInfo0.h = s9;
                    arrayList9.add(listSectionInfo0);
                }
                if(TextUtils.isEmpty(s6)) {
                    z6 = true;
                }
                else {
                    ListSectionInfo listSectionInfo1 = new ListSectionInfo(s6);
                    listSectionInfo1.d = s7;
                    listSectionInfo1.b = arr_s;
                    listSectionInfo1.c = z2;
                    z6 = true;
                    listSectionInfo1.e = true;
                    listSectionInfo1.l = arrayList5;
                    listSectionInfo1.g = s10;
                    listSectionInfo1.h = s11;
                    arrayList9.add(listSectionInfo1);
                }
                Resources resources0 = this.getResources();
                if(!hour.a.c().f() || !z) {
                    z6 = false;
                }
                ca1 = ca0;
                accn accn1 = accn.A(s2, v6, arrayList0, z1, null, z6, arr_s, z3, resources0.getInteger(0x7F0C0009), resources0.getInteger(0x7F0C0008), arrayList9, s, z5, arrayList6, arrayList7, arrayList8, s12, true);  // integer:appinivte_num_portrait_grid_columns
                contextualPeopleSelectionChimeraActivity0 = this;
                contextualPeopleSelectionChimeraActivity0.m = accn1;
                ca1.u(0x7F0B14C5, accn1, "selectionFragment");  // id:fragment_container
            }
            else {
                contextualPeopleSelectionChimeraActivity0 = this;
                ca1 = ca0;
            }
            contextualPeopleSelectionChimeraActivity0.m.d = contextualPeopleSelectionChimeraActivity0;
            contextualPeopleSelectionChimeraActivity0.m.ag = contextualPeopleSelectionChimeraActivity0;
            contextualPeopleSelectionChimeraActivity0.m.ay = contextualPeopleSelectionChimeraActivity0;
            contextualPeopleSelectionChimeraActivity0.a(false);
            if(!ca1.l()) {
                ca1.a();
            }
            return;
        }
        this.finish();
    }

    @Override  // xoi
    protected final void onResumeFragments() {
        super.onResumeFragments();
        this.p();
    }

    private final void p() {
        int v = 0;
        int v1 = this.m == null || !this.m.M() ? 0 : 1;
        this.k.setVisibility((1 == v1 ? 0 : 8));
        View view0 = this.l;
        if(1 == v1) {
            v = 8;
        }
        view0.setVisibility(v);
    }

    @Override  // accv
    public final void q(ContactPerson contactPerson0, boolean z) {
        this.o();
    }

    @Override  // accl
    public final uq u() {
        return this.n;
    }
}

