package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.Bundle;

public final class j implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final m a;
    public final Context b;
    public final String c;

    public j(m m0, Context context0, String s) {
        this.a = m0;
        this.b = context0;
        this.c = s;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        Bundle bundle0 = r.b(this.b, this.c);
        this.a.b.set(bundle0);
    }
}

