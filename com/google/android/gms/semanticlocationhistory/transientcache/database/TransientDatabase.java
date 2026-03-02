package com.google.android.gms.semanticlocationhistory.transientcache.database;

import android.content.Context;
import cctd;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import eoix;
import omd;
import omn;

public abstract class TransientDatabase extends omn {
    private static volatile TransientDatabase m;

    public abstract eoix u();

    public static TransientDatabase v() {
        synchronized(TransientDatabase.class) {
            if(TransientDatabase.m == null) {
                TransientDatabase.m = TransientDatabase.w(AppContextProvider.a());
            }
        }
        return TransientDatabase.m;
    }

    public static TransientDatabase w(Context context0) {
        TransientDatabase transientDatabase0;
        synchronized(TransientDatabase.class) {
            omd omd0 = cctd.a(context0, TransientDatabase.class, "semloc_transient_database");
            omd0.d();
            transientDatabase0 = (TransientDatabase)omd0.a();
        }
        return transientDatabase0;
    }
}

