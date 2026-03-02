package com.google.android.gms.ads.internal.js.function;

import aas..ExternalSyntheticApiModelOutline0;
import android.app.LocaleManager;
import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.flag.t;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.logging.cui.o;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class b {
    public final Object a;
    public k b;
    private final Object c;
    private k d;

    public b() {
        this.a = new Object();
        this.c = new Object();
    }

    public final k a(Context context0, VersionInfoParcel versionInfoParcel0, o o0) {
        synchronized(this.c) {
            if(this.d == null) {
                this.d = new k(b.b(context0), versionInfoParcel0, (b.c(context0) ? ((String)t.b.d()) : ((String)t.f.d())), o0);
            }
        }
        return this.d;
    }

    public static final Context b(Context context0) {
        Context context1 = context0.getApplicationContext();
        return context1 == null ? context0 : context1;
    }

    public static final boolean c(Context context0) {
        if(!((Boolean)t.c.d()).booleanValue()) {
            return false;
        }
        List list0 = Arrays.asList(((String)t.d.d()).split(","));
        Context context1 = b.b(context0);
        Locale.getDefault().getLanguage();
        String s = Locale.getDefault().getCountry();
        if(Build.VERSION.SDK_INT >= 33) {
            LocaleManager localeManager0 = aas..ExternalSyntheticApiModelOutline0.m(context1.getSystemService(LocaleManager.class));
            if(localeManager0 != null && !localeManager0.getSystemLocales().isEmpty()) {
                Locale locale0 = localeManager0.getSystemLocales().get(0);
                locale0.getLanguage();
                return list0.contains(locale0.getCountry().toLowerCase(Locale.ROOT));
            }
        }
        else {
            Locale locale1 = context1.getResources().getConfiguration().getLocales().get(0);
            locale1.getLanguage();
            s = locale1.getCountry();
        }
        return list0.contains(s.toLowerCase(Locale.ROOT));
    }
}

