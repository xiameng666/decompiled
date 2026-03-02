import android.accounts.Account;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import com.android.settingslib.widget.FooterPreference;
import com.google.android.gms.significantplaces.settings.SuggestionPreference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class eplj extends skp {
    public acp ag;
    private acp ah;
    private FooterPreference ai;
    public Context d;

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.d = this.requireContext();
        this.H(0x7F190103, s);  // xml:significant_places_suggestion_list_preferences
        Preference preference0 = this.iO("choose_on_map");
        ibuq.c(preference0);
        preference0.o = new epld(this);
        Context context0 = this.d;
        if(context0 == null) {
            ibuq.j("context");
            context0 = null;
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(new int[]{0x1010435});
        ibuq.e(typedArray0, "obtainStyledAttributes(...)");
        Drawable drawable0 = preference0.q();
        if(drawable0 != null) {
            drawable0.setTintList(typedArray0.getColorStateList(0));
        }
        typedArray0.recycle();
        Preference preference1 = this.iO("suggestion_list_footer");
        ibuq.c(preference1);
        FooterPreference footerPreference0 = (FooterPreference)preference1;
        this.ai = footerPreference0;
        if(footerPreference0 == null) {
            ibuq.j("footerPreference");
            footerPreference0 = null;
        }
        footerPreference0.k(4);
        icbb.b(lpt.a(this), null, null, new epli(this, null), 3);
    }

    public final Object K(PreferenceCategory preferenceCategory0, ibrl ibrl0) {
        FooterPreference footerPreference5;
        acp acp3;
        acp acp1;
        Object object8;
        Object object7;
        Object object6;
        Object object5;
        Object object4;
        ezmb ezmb1;
        Iterator iterator0;
        ArrayList arrayList0;
        Object object2;
        eple eple0;
        if((ibrl0 instanceof eple)) {
            eple0 = (eple)ibrl0;
            int v = eple0.h;
            if((v & 0x80000000) == 0) {
                eple0 = new eple(this, ibrl0);
            }
            else {
                eple0.h = v - 0x80000000;
            }
        }
        else {
            eple0 = new eple(this, ibrl0);
        }
        Object object0 = eple0.f;
        Object object1 = ibrx.a;
        switch(eple0.h) {
            case 0: {
                ibnx.b(object0);
                object2 = preferenceCategory0;
                eple0.a = object2;
                eple0.h = 1;
                object0 = epom.a.c(eple0);
                if(object0 == object1) {
                    return object1;
                }
                arrayList0 = new ArrayList(ibpo.q(((Iterable)object0), 10));
                iterator0 = ((Iterable)object0).iterator();
                goto label_26;
            }
            case 1: {
                object2 = eple0.a;
                ibnx.b(object0);
                arrayList0 = new ArrayList(ibpo.q(((Iterable)object0), 10));
                iterator0 = ((Iterable)object0).iterator();
            label_26:
                while(iterator0.hasNext()) {
                    Object object3 = iterator0.next();
                    arrayList0.add(((epng)object3).c);
                }
                Set set0 = ibpo.ay(arrayList0);
                Context context0 = this.d;
                if(context0 == null) {
                    ibuq.j("context");
                    context0 = null;
                }
                ezmb ezmb0 = new ezmb(context0);
                Context context1 = this.d;
                if(context1 == null) {
                    ibuq.j("context");
                    context1 = null;
                }
                if(this.d == null) {
                    ibuq.j("context");
                }
                List list0 = bbmn.h(context1, "com.google.android.gms");
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                ezmb1 = ezmb0;
                object4 = list0.iterator();
                object5 = linkedHashMap0;
                object6 = set0;
                object7 = object2;
                goto label_86;
            }
            case 2: {
                object8 = eple0.e;
                object4 = eple0.d;
                object5 = eple0.c;
                ezmb1 = eple0.i;
                object6 = eple0.b;
                object7 = eple0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            for(Object object9: ((List)object0)) {
                epng epng0 = (epng)object9;
                boolean z = ((Set)object6).contains(epng0.c);
                List list1 = (List)((Map)object5).get(((Account)object8).name);
                if(list1 == null) {
                    String s = ((Account)object8).name;
                    Preference[] arr_preference = new Preference[1];
                    xob xob0 = xoc.b(this);
                    acp acp0 = this.ah;
                    if(acp0 == null) {
                        ibuq.j("confirmPlaceLauncher");
                        acp1 = null;
                    }
                    else {
                        acp1 = acp0;
                    }
                    arr_preference[0] = new SuggestionPreference(xob0, acp1, epng0, z, ((Account)object8).name, epng0.i);
                    ((Map)object5).put(s, ibpo.i(arr_preference));
                }
                else {
                    xob xob1 = xoc.b(this);
                    acp acp2 = this.ah;
                    if(acp2 == null) {
                        ibuq.j("confirmPlaceLauncher");
                        acp3 = null;
                    }
                    else {
                        acp3 = acp2;
                    }
                    list1.add(new SuggestionPreference(xob1, acp3, epng0, z, ((Account)object8).name, epng0.i));
                    ((Map)object5).put(((Account)object8).name, list1);
                }
            }
        label_86:
            if(((Iterator)object4).hasNext()) {
                Object object10 = ((Iterator)object4).next();
                object8 = (Account)object10;
                String s1 = object8.name;
                ibuq.e(s1, "name");
                eple0.a = object7;
                eple0.b = object6;
                eple0.i = ezmb1;
                eple0.c = object5;
                eple0.d = object4;
                eple0.e = object8;
                eple0.h = 2;
                object0 = this.L(ezmb1, s1, eple0);
                if(object0 != object1) {
                    continue;
                }
                break;
            }
            goto label_101;
        }
        return object1;
    label_101:
        ArrayList arrayList1 = new ArrayList();
        for(Object object11: ((Map)object5).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object11;
            Context context2 = this.d;
            if(context2 == null) {
                ibuq.j("context");
                context2 = null;
            }
            PreferenceCategory preferenceCategory1 = new PreferenceCategory(context2);
            preferenceCategory1.T(false);
            if(((Map)object5).size() > 1) {
                preferenceCategory1.S(this.getString(0x7F152E01, new Object[]{map$Entry0.getKey()}));  // string:significant_places_suggestion_list_from_account "From %s"
            }
            else {
                preferenceCategory1.C = 0x7F0E05FC;  // layout:no_margin_preference_category_layout
            }
            ((PreferenceGroup)object7).am(preferenceCategory1);
            for(Object object12: ((List)map$Entry0.getValue())) {
                preferenceCategory1.am(((Preference)object12));
            }
            arrayList1.add(preferenceCategory1);
        }
        if(!arrayList1.isEmpty()) {
            for(Object object13: arrayList1) {
                ((PreferenceCategory)object13).T(true);
            }
            Spanned spanned0 = Html.fromHtml(this.getString(0x7F152E00), 0x3F);  // string:significant_places_suggestion_list_footer "Suggestions for trusted places 
                                                                                 // are based on saved addresses in your Google Account.<br /><br /> Tapping on a suggested 
                                                                                 // address will add it to your trusted places. For your security, if an address is 
                                                                                 // changed in your Google Account, it will be removed from your trusted places."
            ibuq.e(spanned0, "fromHtml(...)");
            FooterPreference footerPreference0 = this.ai;
            if(footerPreference0 == null) {
                ibuq.j("footerPreference");
                footerPreference0 = null;
            }
            footerPreference0.S(spanned0);
            FooterPreference footerPreference1 = this.ai;
            if(footerPreference1 == null) {
                ibuq.j("footerPreference");
                footerPreference1 = null;
            }
            footerPreference1.ah(this.getString(0x7F152E09));  // string:significant_places_trusted_places_learn_more "Learn more about trusted places"
            FooterPreference footerPreference2 = this.ai;
            if(footerPreference2 == null) {
                ibuq.j("footerPreference");
                footerPreference2 = null;
            }
            footerPreference2.l(new eplc(this));
            FooterPreference footerPreference3 = this.ai;
            if(footerPreference3 == null) {
                ibuq.j("footerPreference");
                footerPreference3 = null;
            }
            footerPreference3.T(true);
            FooterPreference footerPreference4 = this.ai;
            if(footerPreference4 == null) {
                ibuq.j("footerPreference");
                footerPreference5 = null;
            }
            else {
                footerPreference5 = footerPreference4;
            }
            footerPreference5.k(0);
        }
        return ibom.a;
    }

    public final Object L(ezmb ezmb0, String s, ibrl ibrl0) {
        Object object3;
        eplf eplf0;
        if((ibrl0 instanceof eplf)) {
            eplf0 = (eplf)ibrl0;
            int v = eplf0.d;
            if((v & 0x80000000) == 0) {
                eplf0 = new eplf(this, ibrl0);
            }
            else {
                eplf0.d = v - 0x80000000;
            }
        }
        else {
            eplf0 = new eplf(this, ibrl0);
        }
        Object object0 = eplf0.b;
        Object object1 = ibrx.a;
        switch(eplf0.d) {
            case 0: {
                ibnx.b(object0);
                bblp bblp0 = new bblp(1, 9);
                cnoc cnoc0 = new cnoc();
                cnoc0.b = "significant_places";
                cnoc0.d = s;
                cnod cnod0 = new cnod(cnoc0);
                evql evql0 = new cnmr(xoc.b(this).getContainerActivity(), cnod0).f();
                eplf0.e = ezmb0;
                eplf0.f = s;
                eplf0.a = bblp0;
                eplf0.d = 1;
                Object object2 = ictn.b(evql0, eplf0);
                if(object2 != object1) {
                    object3 = bblp0;
                    object0 = object2;
                    goto label_35;
                }
                return object1;
            }
            case 1: {
                Object object4 = eplf0.a;
                s = eplf0.f;
                ezmb0 = eplf0.e;
                ibnx.b(object0);
                object3 = object4;
            label_35:
                eplh eplh0 = new eplh(((azui)object0), ezmb0, ((gmcg)object3), s, null);
                eplf0.e = null;
                eplf0.f = null;
                eplf0.a = null;
                eplf0.d = 2;
                Object object5 = iccl.a(eplh0, eplf0);
                return object5 == object1 ? object1 : object5;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // ohv
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.ag = this.registerForActivityResult(new adt(), new epla(this));
        this.ah = this.registerForActivityResult(new adt(), new eplb(this));
    }
}

