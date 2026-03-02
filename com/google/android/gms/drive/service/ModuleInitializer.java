package com.google.android.gms.drive.service;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import avzf;
import azpm;
import bart;
import bbmq;
import gged_interceptors;
import ggna;
import java.io.File;

public final class ModuleInitializer extends avzf {
    static final int a;
    private static final bart b;
    private static final gged_interceptors c;

    static {
        ModuleInitializer.b = new bart("ModuleInitializer");
        ModuleInitializer.a = 230200000;
        ModuleInitializer.c = gged_interceptors.l("com.google.android.gms.drive.deprecation.UpgradeDialogActivity");
    }

    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
        gged_interceptors gged0 = ModuleInitializer.c;
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            bbmq.G(this, ((String)gged0.get(v1)), true);
        }
    }

    @Override  // avzf
    public final void b(Intent intent0, int v) {
        if(azpm.b >= ModuleInitializer.a) {
            File file0 = this.getApplicationContext().getDatabasePath("DocList.db");
            if(file0.exists()) {
                bart bart0 = ModuleInitializer.b;
                if(bart0.e(4)) {
                    Log.i("ModuleInitializer", bart0.a("Deleting Drive module\'s database file."));
                }
                if(!SQLiteDatabase.deleteDatabase(file0)) {
                    bart0.b("ModuleInitializer", "Failed to delete Drive module\'s database file.");
                }
            }
        }
    }
}

