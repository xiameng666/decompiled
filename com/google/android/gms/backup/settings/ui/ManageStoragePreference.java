package com.google.android.gms.backup.settings.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.preference.Preference;
import aqql;
import atae;
import baun;
import hqil;
import oij;

public class ManageStoragePreference extends Preference {
    public final double a;
    public Button b;
    public Button c;
    private static final baun d;
    private final View.OnClickListener e;

    static {
        ManageStoragePreference.d = aqql.a("ManageStoragePreference");
    }

    public ManageStoragePreference(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = hqil.b();
        this.e = new atae(this);
        this.C = 0x7F0E055A;  // layout:manage_storage_button
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        ManageStoragePreference.d.j("onBindViewHolder", new Object[0]);
        super.a(oij0);
        Button button0 = (Button)oij0.D(0x7F0B189B);  // id:manage_storage_button
        this.b = button0;
        button0.setOnClickListener(this.e);
        Button button1 = (Button)oij0.D(0x7F0B189C);  // id:manage_storage_button_filled
        this.c = button1;
        button1.setOnClickListener(this.e);
    }
}

