package com.google.android.gms.threadnetwork.settings;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import ewhs;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oij;

public final class NetworkItemListPreference extends Preference {
    public ewhs a;

    public NetworkItemListPreference(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
        this.C = 0x7F0E07FB;  // layout:preference_network_item_list
    }

    public NetworkItemListPreference(Context context0, AttributeSet attributeSet0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        ibuq.f(oij0, "holder");
        super.a(oij0);
        View view0 = oij0.D(0x7F0B19D7);  // id:network_item_list
        ibuq.d(view0, "null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
        RecyclerView recyclerView0 = (RecyclerView)view0;
        recyclerView0.getContext();
        recyclerView0.ap(new LinearLayoutManager(1, false));
        recyclerView0.an(this.a);
    }

    public final void k(ewhs ewhs0) {
        ibuq.f(ewhs0, "networkItemListAdapter");
        this.a = ewhs0;
    }
}

