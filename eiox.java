import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase.OpenParams.Builder;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import j..util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.TWR;

public final class eiox implements Closeable {
    static final bboh a;
    static final Object b;
    static volatile eiox c;
    static volatile eiox d;
    public final int e;
    public final Context f;
    public final String g;
    public final SQLiteDatabase.OpenParams.Builder h;
    public final AtomicInteger i;
    public SQLiteDatabase j;
    int k;
    public static final int l;
    private final eipl m;
    private boolean n;
    private final eipm o;

    static {
        eiox.a = bboh.b("PhenotypeDbHelper", bbcu.al);
        eiox.b = new Object();
    }

    public eiox(Context context0, int v, eipl eipl0, eipm eipm0) {
        this.i = new AtomicInteger(0);
        this.k = 0;
        this.f = context0;
        this.g = "phenotype.db";
        SQLiteDatabase.OpenParams.Builder sQLiteDatabase$OpenParams$Builder0 = new SQLiteDatabase.OpenParams.Builder();
        this.h = sQLiteDatabase$OpenParams$Builder0;
        sQLiteDatabase$OpenParams$Builder0.addOpenFlags(0x30000000);
        this.e = v;
        this.m = eipl0;
        this.o = eipm0;
    }

    public final eior a() {
        return new eior(this.k(), this.m, this.o);
    }

    static String b(String s, String s1, String[] arr_s) {
        StringBuilder stringBuilder0 = new StringBuilder("CREATE INDEX IF NOT EXISTS ");
        stringBuilder0.append(s1);
        stringBuilder0.append(" ON ");
        stringBuilder0.append(s);
        stringBuilder0.append(" (");
        eiox.f(stringBuilder0, arr_s);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    static String c(String s, String[] arr_s) {
        StringBuilder stringBuilder0 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        stringBuilder0.append(s);
        stringBuilder0.append(" (");
        eiox.f(stringBuilder0, arr_s);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override
    public final void close() {
    }

    public final String d() {
        try(SQLiteStatement sQLiteStatement0 = this.k().compileStatement("PRAGMA integrity_check;")) {
            return sQLiteStatement0.simpleQueryForString();
        }
    }

    static String e(String[] arr_s) {
        StringBuilder stringBuilder0 = new StringBuilder(", PRIMARY KEY(");
        eiox.f(stringBuilder0, arr_s);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    static void f(StringBuilder stringBuilder0, String[] arr_s) {
        int v = 0;
        for(boolean z = true; v < arr_s.length; z = false) {
            String s = arr_s[v];
            if(!z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(s);
            ++v;
        }
    }

    public final void g() {
        SQLiteDatabase sQLiteDatabase0 = this.k();
        if(sQLiteDatabase0 != null) {
            int v = sQLiteDatabase0.getVersion();
            if(sQLiteDatabase0.isReadOnly()) {
                ((ggtj)eiox.a.j()).F("Can\'t downgrade read-only database from version %d to %d.", v, this.e);
                return;
            }
            int v1 = this.e;
            if(v > v1 && v >= 1001) {
                this.m(sQLiteDatabase0, v, v1);
            }
        }
    }

    public final void h() {
        Cursor cursor0;
        long v1;
        boolean z;
        SQLiteDatabase sQLiteDatabase0 = this.k();
        try {
            if(sQLiteDatabase0.isReadOnly()) {
                ((ggtj)eiox.a.j()).F("Can\'t upgrade read-only database from version %d to %d.", sQLiteDatabase0.getVersion(), this.e);
                goto label_3;
            }
            goto label_5;
        }
        catch(Throwable throwable0) {
            goto label_69;
        }
    label_3:
        this.p(sQLiteDatabase0, this.e);
        return;
        try {
        label_5:
            sQLiteDatabase0.beginTransaction();
        }
        catch(Throwable throwable0) {
            goto label_69;
        }
        try {
            int v = this.e;
            z = false;
            if(v > sQLiteDatabase0.getVersion()) {
                if(sQLiteDatabase0.getVersion() < 1001 && v >= 1001) {
                    v1 = 0L;
                    sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS schema_upgrade_attempts (\n    target_schema_version INTEGER PRIMARY KEY,\n    attempts INTEGER NOT NULL\n);\n");
                    cursor0 = sQLiteDatabase0.rawQuery("SELECT attempts FROM schema_upgrade_attempts WHERE target_schema_version = ?;", new String[]{String.valueOf(v)});
                    goto label_13;
                }
                else {
                    goto label_50;
                }
                goto label_51;
            }
            goto label_56;
        }
        catch(Throwable throwable1) {
            goto label_54;
        }
        try {
        label_13:
            if(cursor0.moveToFirst() && !cursor0.isNull(0)) {
                v1 = cursor0.getLong(0);
            }
            goto label_19;
        }
        catch(Throwable throwable2) {
            try {
                TWR.safeClose$NT(cursor0, throwable2);
                throw throwable2;
            label_19:
                cursor0.close();
                if(v1 >= hxki.b()) {
                    ((ggtj)eiox.a.i()).J("Phixit migration attempt limit (%d) has been reached error. EventCode: %s", hxki.b(), 0x30);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
                    bbed bbed0 = bbed.jw;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    bbdv bbdv0 = (bbdv)hftp0.b_message;
                    bbdv0.b = bbed0.a();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((bbdv)hftv0).c = 1;
                    bbdz bbdz0 = bbdz.c;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    bbdv bbdv1 = (bbdv)hftp0.b_message;
                    bbdv1.d = bbdz0.a();
                    bbdv bbdv2 = (bbdv)hftp0.N_build();
                    ayud ayud0 = new aytt(this.f, "PHENOTYPE").a();
                    icyo icyo0 = new icyo();
                    ayvm ayvm0 = fhbe.b(this.f, icyo0);
                    ayuc ayuc0 = ayud0.j(((MessageLite)hlsf.a), ayvm0);
                    ayuc0.k(0x30);
                    ayuc0.l = bbdv2;
                    ayuc0.d();
                }
                else {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("target_schema_version", Integer.valueOf(this.e));
                    contentValues0.put("attempts", Long.valueOf(v1 + 1L));
                    sQLiteDatabase0.insertWithOnConflict("schema_upgrade_attempts", null, contentValues0, 5);
                label_50:
                    z = true;
                }
            label_51:
                sQLiteDatabase0.setTransactionSuccessful();
                goto label_56;
            }
            catch(Throwable throwable1) {
            }
        }
        try {
        label_54:
            sQLiteDatabase0.endTransaction();
            throw throwable1;
        label_56:
            sQLiteDatabase0.endTransaction();
            if(z) {
                sQLiteDatabase0.beginTransaction();
                goto label_59;
            }
            goto label_71;
        }
        catch(Throwable throwable0) {
            goto label_69;
        }
        try {
        label_59:
            this.n(sQLiteDatabase0, sQLiteDatabase0.getVersion(), this.e);
            sQLiteDatabase0.setVersion(this.e);
            sQLiteDatabase0.setTransactionSuccessful();
            goto label_66;
        }
        catch(Throwable throwable3) {
            try {
                sQLiteDatabase0.endTransaction();
                throw throwable3;
            label_66:
                sQLiteDatabase0.endTransaction();
                goto label_71;
            }
            catch(Throwable throwable0) {
            }
        }
    label_69:
        this.p(sQLiteDatabase0, this.e);
        throw throwable0;
    label_71:
        this.p(sQLiteDatabase0, this.e);
    }

    public static boolean i() {
        return hxki.a.c().e();
    }

    /*
    String Decryptor: 4 succeeded, 3 failed
    - Failure: j(v7<eiox>)<boolean> @ Leiox;->m(Landroid/database/sqlite/SQLiteDatabase;II)V+42h
    - Failure: j(v6<eiox>)<boolean> @ Leiow;->a(Leiox;)J+2Eh
    - Failure: j(v4<eiox>)<boolean> @ Leiox;->l(Landroid/database/sqlite/SQLiteDatabase;)V+104h
    */
    public final boolean j() {
        return this == eiox.c;
    }

    private final SQLiteDatabase k() {
        SQLiteDatabase sQLiteDatabase2;
        int v4;
        SQLiteDatabase sQLiteDatabase3;
        synchronized(this) {
            int v = Process.getThreadPriority(Process.myTid());
            if(v > 0) {
                try {
                    Process.setThreadPriority(0);
                label_4:
                    SQLiteDatabase sQLiteDatabase0 = this.j;
                    SQLiteDatabase sQLiteDatabase1 = null;
                    if(sQLiteDatabase0 == null) {
                    label_12:
                        if(this.n) {
                            throw new IllegalStateException("getDatabase called recursively");
                        }
                        int v1 = this.e;
                        boolean z = true;
                        try {
                            this.n = true;
                            File file0 = this.f.getDatabasePath(this.g);
                            sQLiteDatabase3 = SQLiteDatabase.openDatabase(file0, this.h.build());
                            eiox.o(file0.getPath());
                        }
                        catch(Throwable throwable2) {
                            goto label_81;
                        }
                        try {
                            int v2 = sQLiteDatabase3.getVersion();
                            boolean z1 = v2 > v1 && (v2 < 1001 || hxki.a.c().b());
                            if(z1) {
                                this.m(sQLiteDatabase3, v2, v1);
                            }
                            int v3 = 0x409;
                            if(v2 == 0x408 && v1 == 0x409) {
                                sQLiteDatabase3.beginTransaction();
                                try {
                                    if(this == eiox.c) {
                                        eiox.r(sQLiteDatabase3);
                                    }
                                    else {
                                        eiox.q(sQLiteDatabase3);
                                    }
                                    sQLiteDatabase3.setTransactionSuccessful();
                                }
                                catch(Throwable throwable3) {
                                    sQLiteDatabase3.endTransaction();
                                    throw throwable3;
                                }
                                sQLiteDatabase3.endTransaction();
                            }
                            else {
                                v3 = v1;
                            }
                            try {
                                sQLiteDatabase3.setForeignKeyConstraintsEnabled(true);
                                if(z1 || v2 != 0) {
                                    z = false;
                                }
                                if(z) {
                                    if(sQLiteDatabase3.isReadOnly()) {
                                        throw new SQLiteException("Can\'t create database because the database is read-only. Target schema version " + this.e + ": " + this.g);
                                    }
                                    sQLiteDatabase3.beginTransaction();
                                    try {
                                        this.l(sQLiteDatabase3);
                                        sQLiteDatabase3.setVersion(this.e);
                                        sQLiteDatabase3.setTransactionSuccessful();
                                    }
                                    catch(Throwable throwable4) {
                                        sQLiteDatabase3.endTransaction();
                                        throw throwable4;
                                    }
                                    sQLiteDatabase3.endTransaction();
                                }
                                v4 = this.e;
                                if(v4 > 0x20 && !hxki.a.c().c()) {
                                    goto label_64;
                                }
                                goto label_65;
                            }
                            catch(Throwable throwable2) {
                                sQLiteDatabase1 = sQLiteDatabase3;
                                v1 = v3;
                                goto label_81;
                            }
                        label_64:
                            v1 = 0x20;
                        label_65:
                            if(!z1 && !z && v1 > v2) {
                                if(sQLiteDatabase3.isReadOnly()) {
                                    throw new SQLiteException("Can\'t upgrade read-only database from version " + sQLiteDatabase3.getVersion() + " to " + v4 + ": " + this.g);
                                }
                                sQLiteDatabase3.beginTransaction();
                                try {
                                    this.n(sQLiteDatabase3, v2, v1);
                                    sQLiteDatabase3.setVersion(v1);
                                    sQLiteDatabase3.setTransactionSuccessful();
                                }
                                catch(Throwable throwable5) {
                                    sQLiteDatabase3.endTransaction();
                                    throw throwable5;
                                }
                                sQLiteDatabase3.endTransaction();
                            }
                            this.j = sQLiteDatabase3;
                            goto label_87;
                        }
                        catch(Throwable throwable2) {
                            sQLiteDatabase1 = sQLiteDatabase3;
                        }
                    label_81:
                        this.n = false;
                        if(sQLiteDatabase1 != null && sQLiteDatabase1 != this.j) {
                            sQLiteDatabase1.close();
                        }
                        if(sQLiteDatabase1 != null && sQLiteDatabase1.isOpen()) {
                            this.p(sQLiteDatabase1, v1);
                        }
                        throw throwable2;
                    label_87:
                        this.n = false;
                        if(sQLiteDatabase3.isOpen()) {
                            this.p(sQLiteDatabase3, v1);
                        }
                        sQLiteDatabase2 = sQLiteDatabase3;
                    }
                    else if(!sQLiteDatabase0.isOpen()) {
                        this.j = null;
                        goto label_12;
                    }
                    else {
                        sQLiteDatabase2 = this.j;
                    }
                    goto label_96;
                }
                catch(Throwable throwable1) {
                    goto label_93;
                }
            }
            goto label_4;
        label_93:
            if(v != 0) {
                Process.setThreadPriority(v);
            }
            throw throwable1;
        label_96:
            if(v != 0) {
                Process.setThreadPriority(v);
            }
        }
        return sQLiteDatabase2;
    }

    private final void l(SQLiteDatabase sQLiteDatabase0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/common/PhenotypeDbHelper", "onCreate", 571, "PhenotypeDbHelper.onCreate()")) {
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS Packages(\n    packageName TEXT NOT NULL PRIMARY KEY,\n    version INTEGER NOT NULL,\n    params BLOB,\n    dynamicParams BLOB,\n    weak INTEGER NOT NULL,\n    androidPackageName TEXT NOT NULL,\n    isSynced INTEGER,\n    serializedDeclarativeRegInfo BLOB DEFAULT NULL,\n    configTier INTEGER DEFAULT NULL,\n    baselineCl INTEGER DEFAULT NULL,\n    heterodyneInfo BLOB DEFAULT NULL,\n    runtimeProperties BLOB DEFAULT NULL,\n    declarativeRegistrationInfo BLOB DEFAULT NULL\n  )\n");
            sQLiteDatabase0.execSQL("CREATE INDEX IF NOT EXISTS androidPackageName ON Packages (androidPackageName)");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS ApplicationStates(\n    packageName TEXT NOT NULL PRIMARY KEY,\n    user TEXT NOT NULL,\n    version INTEGER NOT NULL,\n    patchable INTEGER\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS MultiCommitApplicationStates(\n    packageName TEXT NOT NULL,\n    user TEXT NOT NULL,\n    version INTEGER NOT NULL,\n    PRIMARY KEY(packageName, user)\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS LogSources(\n    logSourceName TEXT NOT NULL,\n    packageName TEXT NOT NULL,\n    PRIMARY KEY(logSourceName, packageName)\n    )\n");
            sQLiteDatabase0.execSQL("CREATE INDEX IF NOT EXISTS packageName ON LogSources(packageName)");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS WeakExperimentIds(\n    packageName TEXT NOT NULL,\n    experimentId INTEGER NOT NULL\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS ExperimentTokens(\n    packageName TEXT NOT NULL,\n    version INTEGER NOT NULL,\n    user TEXT NOT NULL,\n    isCommitted INTEGER NOT NULL,\n    experimentToken BLOB NOT NULL,\n    serverToken TEXT NOT NULL,\n    configHash TEXT NOT NULL DEFAULT \'\',\n    servingVersion INTEGER NOT NULL DEFAULT 0,\n    tokensTag BLOB DEFAULT NULL,\n    flagsHash INTEGER DEFAULT NULL,\n    PRIMARY KEY(packageName, version, user, isCommitted)\n  )\n");
            sQLiteDatabase0.execSQL("CREATE INDEX IF NOT EXISTS committed ON ExperimentTokens(packageName, version, user, isCommitted)");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS ExternalExperimentTokens(\n    packageName TEXT NOT NULL PRIMARY KEY,\n    experimentToken BLOB NOT NULL\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS Flags(\n    packageName TEXT NOT NULL,\n    version INTEGER NOT NULL,\n    flagType INTEGER NOT NULL,\n    partitionId INTEGER NOT NULL,\n    user TEXT NOT NULL,\n    name TEXT NOT NULL,\n    intVal INTEGER,\n    boolVal INTEGER,\n    floatVal REAL,\n    stringVal TEXT,\n    extensionVal BLOB,\n    committed INTEGER NOT NULL,\n    PRIMARY KEY(packageName, version, flagType, partitionId, user, name, committed)\n  );\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS RequestTags(\n    user TEXT NOT NULL PRIMARY KEY,\n    bytesTag BLOB NOT NULL\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS ApplicationTags(\n    packageName TEXT NOT NULL,\n    version INTEGER NOT NULL,\n    partitionId INTEGER NOT NULL,\n    user TEXT NOT NULL,\n    tag BLOB NOT NULL,\n    PRIMARY KEY(packageName, version, partitionId, user)\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS CrossLoggedExperimentTokens(\n    fromPackageName TEXT NOT NULL,\n    fromVersion INTEGER NOT NULL,\n    fromUser TEXT NOT NULL,\n    toPackageName TEXT NOT NULL,\n    toVersion INTEGER NOT NULL,\n    isCommitted INTEGER NOT NULL,\n    token BLOB NOT NULL,\n    provenance INTEGER NOT NULL\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE INDEX IF NOT EXISTS apply ON CrossLoggedExperimentTokens(\n    fromPackageName,\n    fromVersion,\n    fromUser,\n    toPackageName,\n    toVersion,\n    isCommitted\n  )\n");
            sQLiteDatabase0.execSQL("CREATE INDEX IF NOT EXISTS remove ON CrossLoggedExperimentTokens(toPackageName)");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS ChangeCounts(\n    packageName TEXT NOT NULL PRIMARY KEY,\n    count INTEGER NOT NULL\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS DogfoodsToken(\n    key INTEGER NOT NULL PRIMARY KEY,\n    token BLOB\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS LastFetch(\n    key INTEGER NOT NULL PRIMARY KEY,\n    servertimestamp INTEGER NOT NULL\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS FlagOverrides(\n    packageName TEXT NOT NULL,\n    user TEXT NOT NULL,\n    name TEXT NOT NULL,\n    flagType INTEGER NOT NULL,\n    intVal INTEGER,\n    boolVal INTEGER,\n    floatVal REAL,\n    stringVal TEXT,\n    extensionVal BLOB,\n    committed,\n    PRIMARY KEY(packageName, user, name, committed)\n  );\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS LastSyncAfterRequest(\n    packageName TEXT NOT NULL PRIMARY KEY,\n    servingVersion INTEGER NOT NULL DEFAULT 0,\n    androidPackageName TEXT DEFAULT NULL\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS StorageInfos (\n    androidPackageName TEXT UNIQUE NOT NULL,\n    secret BLOB NOT NULL,\n    deviceEncryptedSecret BLOB NOT NULL\n  )\n");
            sQLiteDatabase0.execSQL("  CREATE TABLE AppWideProperties (\n    androidPackageName TEXT UNIQUE NOT NULL,\n    appWideProperties BLOB NOT NULL\n  );\n");
            if(this.e >= 1001) {
                sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS android_packages(\n        android_package_id INTEGER PRIMARY KEY,\n        name TEXT UNIQUE NOT NULL\n    );\n");
                sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS config_packages(\n      config_package_id INTEGER PRIMARY KEY,\n      name TEXT UNIQUE NOT NULL,\n      android_package_id INTEGER NOT NULL REFERENCES android_packages ON DELETE CASCADE,\n      experiment_state_id INTEGER NOT NULL,\n      flags_content BLOB,\n      experiment_token BLOB,\n      server_token TEXT NOT NULL DEFAULT \'\',\n      serving_version INTEGER NOT NULL\n    );\n");
                sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS config_packages_by_android_package_id ON\n      config_packages(android_package_id);\n");
                sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS log_sources(\n      log_source_id INTEGER PRIMARY KEY,\n      name TEXT UNIQUE NOT NULL\n    );\n");
                sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS config_packages_to_log_sources(\n      config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n      log_source_id INTEGER NOT NULL REFERENCES log_sources ON DELETE RESTRICT,\n      PRIMARY KEY (log_source_id, config_package_id),\n      UNIQUE(config_package_id, log_source_id)\n    ) WITHOUT ROWID;\n");
                sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS cross_logged_tokens(\n      from_config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n      to_config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n      token NOT NULL,\n      diversion_provenance INTEGER NOT NULL\n    );\n");
                sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS cross_logged_tokens_by_to_config_package_id ON\n      cross_logged_tokens(to_config_package_id);\n");
                sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS cross_logged_tokens_by_from_config_package_id ON\n      cross_logged_tokens(from_config_package_id);\n");
                sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS flag_overrides(\n      config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n      name TEXT NOT NULL,\n      value NOT NULL,\n      type INTEGER NOT NULL,\n      PRIMARY KEY (config_package_id, name)\n    ) WITHOUT ROWID;\n");
            }
        }
    }

    private final void m(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.beginTransaction();
        try {
            gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/common/PhenotypeDbHelper", "onDowngrade", 1480, "PhenotypeDbHelper.onDowngrade()");
            try {
                ((ggtj)eiox.a.h()).F("onDowngrade %d to %d", v, v1);
                if(v1 < 1001 && v >= 1001) {
                    eiox.r(sQLiteDatabase0);
                }
                if(v1 >= 0x40B) {
                    Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT name\nFROM sqlite_master\nWHERE\n  type = \'table\'\n  AND name <> \'android_metadata\'\n  AND name NOT LIKE \'sqlite_%\';\n", null);
                    while(true) {
                        try {
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS " + cursor0.getString(0));
                        }
                        catch(Throwable throwable2) {
                            TWR.safeClose$NT(cursor0, throwable2);
                            throw throwable2;
                        }
                    }
                    cursor0.close();
                    this.l(sQLiteDatabase0);
                }
                sQLiteDatabase0.setVersion(v1);
                sQLiteDatabase0.setTransactionSuccessful();
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(gdqb0, throwable1);
                throw throwable1;
            }
            gdqb0.close();
        }
        catch(Throwable throwable0) {
            sQLiteDatabase0.endTransaction();
            if(v >= 1001 && v1 < 1001) {
                this.i.set(14904026);
            }
            throw throwable0;
        }
        sQLiteDatabase0.endTransaction();
        if(v >= 1001 && v1 < 1001) {
            this.i.set(14904026);
        }
    }

    private final void n(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        int v2;
        gdqb gdqb1;
        gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/common/PhenotypeDbHelper", "onUpgrade", 0x597, "PhenotypeDbHelper.onUpgrade()");
        try {
            bboh bboh0 = eioy.a;
            gdqb1 = gdqb0;
            ((ggtj)bboh0.h()).X("Upgrading %s database from version %d to %d", "DE", Integer.valueOf(v), Integer.valueOf(v1));
            gdqb1 = gdqb0;
            if(v < 3) {
                ((ggtj)bboh0.h()).x("Wiping Phenotype Database.");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS Packages");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS ApplicationStates");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS LogSources");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS WeakExperimentIds");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS ExperimentTokens");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS Flags");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS RequestTags");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS ApplicationTags");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS CrossLoggedExperimentTokens");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS ChangeCounts");
                sQLiteDatabase0.execSQL(eiox.c("Packages", new String[]{"packageName TEXT NOT NULL PRIMARY KEY", "version INTEGER NOT NULL", "params BLOB", "weak INTEGER NOT NULL", "androidPackageName TEXT NOT NULL"}));
                sQLiteDatabase0.execSQL(eiox.b("Packages", "androidPackageName", new String[]{"androidPackageName"}));
                sQLiteDatabase0.execSQL(eiox.c("ApplicationStates", new String[]{"packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", "version INTEGER NOT NULL", "patchable INTEGER"}));
                sQLiteDatabase0.execSQL(eiox.c("LogSources", new String[]{"logSourceName TEXT NOT NULL", "packageName TEXT NOT NULL" + eiox.e(new String[]{"logSourceName", "packageName"})}));
                sQLiteDatabase0.execSQL(eiox.b("LogSources", "packageName", new String[]{"packageName"}));
                sQLiteDatabase0.execSQL(eiox.c("WeakExperimentIds", new String[]{"packageName TEXT NOT NULL", "experimentId INTEGER NOT NULL"}));
                sQLiteDatabase0.execSQL(eiox.b("WeakExperimentIds", "packageName", new String[]{"packageName"}));
                sQLiteDatabase0.execSQL(eiox.c("ExperimentTokens", new String[]{"packageName TEXT NOT NULL", "version INTEGER NOT NULL", "user TEXT NOT NULL", "isCommitted INTEGER NOT NULL", "experimentToken BLOB NOT NULL", "serverToken TEXT NOT NULL" + eiox.e(new String[]{"packageName", "version", "user", "isCommitted"})}));
                sQLiteDatabase0.execSQL(eiox.b("ExperimentTokens", "committed", new String[]{"packageName", "version", "user", "isCommitted"}));
                sQLiteDatabase0.execSQL(eiox.c("Flags", new String[]{"packageName TEXT NOT NULL", "version INTEGER NOT NULL", "flagType INTEGER NOT NULL", "partitionId INTEGER NOT NULL", "user TEXT NOT NULL", "name TEXT NOT NULL", "intVal INTEGER", "boolVal INTEGER", "floatVal REAL", "stringVal TEXT", "extensionVal BLOB", "committed INTEGER NOT NULL" + eiox.e(new String[]{"packageName", "version", "flagType", "partitionId", "user", "name", "committed"})}));
                sQLiteDatabase0.execSQL(eiox.b("Flags", "committed", new String[]{"packageName", "version", "user", "committed"}));
                sQLiteDatabase0.execSQL(eiox.c("RequestTags", new String[]{"user TEXT NOT NULL PRIMARY KEY", "bytesTag BLOB NOT NULL"}));
                sQLiteDatabase0.execSQL(eiox.c("ApplicationTags", new String[]{"packageName TEXT NOT NULL", "version INTEGER NOT NULL", "partitionId INTEGER NOT NULL", "user TEXT NOT NULL", "tag BLOB NOT NULL" + eiox.e(new String[]{"packageName", "version", "partitionId", "user"})}));
                sQLiteDatabase0.execSQL(eiox.c("CrossLoggedExperimentTokens", new String[]{"fromPackageName TEXT NOT NULL", "fromVersion INTEGER NOT NULL", "fromUser TEXT NOT NULL", "toPackageName TEXT NOT NULL", "toVersion INTEGER NOT NULL", "isCommitted INTEGER NOT NULL", "token BLOB NOT NULL", "provenance INTEGER NOT NULL"}));
                sQLiteDatabase0.execSQL(eiox.b("CrossLoggedExperimentTokens", "apply", new String[]{"fromPackageName", "fromVersion", "fromUser", "toPackageName", "toVersion", "isCommitted"}));
                sQLiteDatabase0.execSQL(eiox.b("CrossLoggedExperimentTokens", "remove", new String[]{"toPackageName"}));
                sQLiteDatabase0.execSQL(eiox.c("ChangeCounts", new String[]{"key INTEGER NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"}));
            }
            if(v < 4) {
                ((ggtj)bboh0.h()).x("Adding DogfoodsToken table");
                sQLiteDatabase0.execSQL(eiox.c("DogfoodsToken", new String[]{"key INTEGER NOT NULL PRIMARY KEY", "token BLOB"}));
            }
            if(v < 5) {
                ((ggtj)bboh0.h()).x("Adding configHash to ExperimentTokens table");
                sQLiteDatabase0.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN configHash TEXT NOT NULL DEFAULT \'\'");
            }
            if(v < 6) {
                ((ggtj)bboh0.h()).x("Adding LastFetch table");
                sQLiteDatabase0.execSQL(eiox.c("LastFetch", new String[]{"key INTEGER NOT NULL PRIMARY KEY", "servertimestamp INTEGER NOT NULL"}));
            }
            if(v < 7) {
                ((ggtj)bboh0.h()).x("Relaxing LogSources Table restrictions");
                sQLiteDatabase0.execSQL(eiox.c("LogSources_copy", new String[]{"logSourceName TEXT NOT NULL", "packageName TEXT NOT NULL" + eiox.e(new String[]{"logSourceName", "packageName"})}));
                sQLiteDatabase0.execSQL("INSERT INTO LogSources_copy (logSourceName, packageName) SELECT logSourceName, packageName FROM LogSources");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS LogSources");
                sQLiteDatabase0.execSQL("ALTER TABLE LogSources_copy RENAME TO LogSources");
            }
            if(v < 8) {
                ((ggtj)bboh0.h()).x("Add isSynced to Packages");
                sQLiteDatabase0.execSQL("ALTER TABLE Packages ADD COLUMN isSynced DEFAULT 0");
            }
            if(v < 9) {
                ((ggtj)bboh0.h()).x("Add subscribedGcm to Packages");
                sQLiteDatabase0.execSQL("ALTER TABLE Packages ADD COLUMN subscribedGcm INTEGER NOT NULL DEFAULT 0");
                ((ggtj)bboh0.h()).x("Add UnsubscribeGcmPackages table");
                sQLiteDatabase0.execSQL(eiox.c("UnsubscribeGcmPackages", new String[]{"packageName TEXT NOT NULL PRIMARY KEY"}));
            }
            if(v < 10) {
                ((ggtj)bboh0.h()).x("Adding FlagOverrides table");
                sQLiteDatabase0.execSQL(eiox.c("FlagOverrides", new String[]{"packageName TEXT NOT NULL", "user TEXT NOT NULL", "name TEXT NOT NULL", "flagType INTEGER NOT NULL", "intVal INTEGER", "boolVal INTEGER", "floatVal REAL", "stringVal TEXT", "extensionVal BLOB", "committed" + eiox.e(new String[]{"packageName", "user", "name", "committed"})}));
            }
            if(v < 11) {
                ((ggtj)bboh0.h()).x("Update patchable to nullable in ApplicationStates");
                sQLiteDatabase0.execSQL("ALTER TABLE ApplicationStates RENAME TO OldApplicationStates");
                sQLiteDatabase0.execSQL(eiox.c("ApplicationStates", new String[]{"packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", "version INTEGER NOT NULL", "patchable INTEGER"}));
                sQLiteDatabase0.execSQL("INSERT INTO ApplicationStates(packageName,user,version,patchable) SELECT packageName,user,version,patchable FROM OldApplicationStates;");
                sQLiteDatabase0.execSQL("DROP TABLE OldApplicationStates;");
            }
            if(v < 12) {
                ((ggtj)bboh0.h()).x("Fix Phenotype registration to be weak");
                sQLiteDatabase0.execSQL("UPDATE Packages SET weak = 1 WHERE packageName = \'com.google.android.gms.phenotype\'");
            }
            if(v < 13) {
                ((ggtj)bboh0.h()).x("Update ChangeCounts schema");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS ChangeCounts");
                sQLiteDatabase0.execSQL(eiox.c("ChangeCounts", new String[]{"packageName TEXT NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"}));
            }
            if(v < 14) {
                ((ggtj)bboh0.h()).x("Add servingVersion to ExperimentTokens");
                sQLiteDatabase0.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN servingVersion INTEGER NOT NULL DEFAULT 0");
            }
            if(v < 15) {
                ((ggtj)bboh0.h()).x("Add dynamicParams to Packages");
                sQLiteDatabase0.execSQL("ALTER TABLE Packages ADD COLUMN dynamicParams BLOB DEFAULT NULL");
            }
            if(v < 16) {
                ((ggtj)bboh0.h()).x("Restructuring GCM data");
                sQLiteDatabase0.execSQL(eiox.c("GcmState", new String[]{"packageName TEXT NOT NULL PRIMARY KEY", "isSubscribed INTEGER NOT NULL", "subscribeAfterTime INTEGER NOT NULL DEFAULT 0"}));
                sQLiteDatabase0.execSQL("INSERT OR REPLACE INTO GcmState(packageName, isSubscribed) SELECT packageName, 1 FROM Packages WHERE subscribedGcm = 1");
                sQLiteDatabase0.execSQL("INSERT OR REPLACE INTO GcmState(packageName, isSubscribed) SELECT packageName, 1 FROM UnsubscribeGcmPackages");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS UnsubscribeGcmPackages");
                sQLiteDatabase0.execSQL("ALTER TABLE Packages RENAME TO OldPackages");
                sQLiteDatabase0.execSQL(eiox.c("Packages", new String[]{"packageName TEXT NOT NULL PRIMARY KEY", "version INTEGER NOT NULL", "params BLOB", "dynamicParams BLOB", "weak INTEGER NOT NULL", "androidPackageName TEXT NOT NULL", "isSynced INTEGER"}));
                sQLiteDatabase0.execSQL(eiox.b("Packages", "androidPackageName", new String[]{"androidPackageName"}));
                sQLiteDatabase0.execSQL("INSERT INTO Packages(packageName,version,params,dynamicParams,weak,androidPackageName,isSynced) SELECT packageName,version,params,dynamicParams,weak,androidPackageName,isSynced FROM OldPackages;");
                sQLiteDatabase0.execSQL("DROP TABLE OldPackages;");
            }
            if(v < 17) {
                ((ggtj)bboh0.h()).x("Add serializedDeclarativeRegInfo to Packages");
                sQLiteDatabase0.execSQL("ALTER TABLE Packages ADD COLUMN serializedDeclarativeRegInfo BLOB DEFAULT NULL");
            }
            if(v < 18) {
                sQLiteDatabase0.execSQL(eiox.c("GenericDimensions", new String[]{"packageName TEXT NOT NULL", "isolationkey TEXT NOT NULL DEFAULT \'\'", "namespace INTEGER NOT NULL", "instance INTEGER NOT NULL"}));
                sQLiteDatabase0.execSQL(eiox.b("GenericDimensions", "configPackageIsolationKey", new String[]{"packageName", "isolationkey"}));
                sQLiteDatabase0.execSQL(eiox.b("LogSources", "packageName", new String[]{"packageName"}));
                sQLiteDatabase0.execSQL(eiox.b("Packages", "androidPackageName", new String[]{"androidPackageName"}));
            }
            if(v < 19) {
                sQLiteDatabase0.execSQL("DROP TABLE GcmState;");
            }
            if(v < 20) {
                ((ggtj)bboh0.h()).x("Add tokensTag to ExperimentTokens");
                sQLiteDatabase0.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN tokensTag BLOB DEFAULT NULL");
            }
            if(v < 21) {
                sQLiteDatabase0.execSQL(eiox.c("MultiCommitApplicationStates", new String[]{"packageName TEXT NOT NULL", "user TEXT NOT NULL", "version INTEGER NOT NULL" + eiox.e(new String[]{"packageName", "user"})}));
            }
            if(v < 22) {
                ((ggtj)bboh0.h()).x("Create LastSyncAfterRequest table");
                sQLiteDatabase0.execSQL(eiox.c("LastSyncAfterRequest", new String[]{"packageName TEXT NOT NULL PRIMARY KEY", "servingVersion INTEGER NOT NULL DEFAULT 0"}));
                ((ggtj)bboh0.h()).x("Add flagsHash to ExperimentTokens");
                eioy.a(sQLiteDatabase0, "ExperimentTokens", "flagsHash", " INTEGER DEFAULT NULL");
            }
            if(v < 23) {
                ((ggtj)bboh0.h()).x("Add configTier to Packages");
                eioy.a(sQLiteDatabase0, "Packages", "configTier", " INTEGER DEFAULT NULL");
            }
            if(v < 24) {
                ((ggtj)bboh0.h()).x("Add baselineCl to Packages");
                eioy.a(sQLiteDatabase0, "Packages", "baselineCl", " INTEGER DEFAULT NULL");
            }
            if(v < 25) {
                ((ggtj)bboh0.h()).x("Add heterodyneInfo param names to Packages.");
                eioy.a(sQLiteDatabase0, "Packages", "heterodyneInfo", " BLOB DEFAULT NULL");
            }
            if(v < 26) {
                ((ggtj)bboh0.h()).x("Add androidPackageName to LastSyncAfterRequest.");
                eioy.a(sQLiteDatabase0, "LastSyncAfterRequest", "androidPackageName", " TEXT DEFAULT NULL");
            }
            if(v < 27) {
                ((ggtj)bboh0.h()).x("Add runtimeProperties to Packages.");
                eioy.a(sQLiteDatabase0, "Packages", "runtimeProperties", " BLOB DEFAULT NULL");
            }
            if(v < 28) {
                ((ggtj)bboh0.h()).x("Add ExternalExperimentTokens table.");
                sQLiteDatabase0.execSQL(eiox.c("ExternalExperimentTokens", new String[]{"packageName TEXT NOT NULL PRIMARY KEY", "experimentToken BLOB NOT NULL"}));
                sQLiteDatabase0.execSQL(eiox.b("ExternalExperimentTokens", "packageName", new String[]{"packageName"}));
            }
            if(v < 29) {
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS GenericDimensions");
            }
            if(v < 30) {
                ((ggtj)bboh0.h()).x("Create StorageInfos table.");
                sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS StorageInfos (androidPackageName TEXT UNIQUE NOT NULL, secret BLOB NOT NULL, deviceEncryptedSecret BLOB NOT NULL)");
            }
            if(v < 0x1F) {
                ((ggtj)bboh0.h()).x("Add declarativeRegistrationInfo column to Packages table.");
                eioy.a(sQLiteDatabase0, "Packages", "declarativeRegistrationInfo", " BLOB DEFAULT NULL");
            }
            if(v < 0x20) {
                ((ggtj)bboh0.h()).x("Add AppWideProperties table.");
                sQLiteDatabase0.execSQL("  CREATE TABLE IF NOT EXISTS AppWideProperties (\n    androidPackageName TEXT UNIQUE NOT NULL,\n    appWideProperties BLOB NOT NULL\n  );\n");
            }
            if(v < 1001) {
                v2 = v1;
                if(v2 < 1001) {
                    goto label_145;
                }
                else {
                    goto label_146;
                }
            }
            else {
                v2 = v1;
            label_145:
                if(v == 0x408 && v2 == 0x409) {
                label_146:
                    sQLiteDatabase0.execSQL("    CREATE TABLE android_packages(\n        android_package_id INTEGER PRIMARY KEY,\n        name TEXT UNIQUE NOT NULL\n    );\n");
                    sQLiteDatabase0.execSQL("    CREATE TABLE config_packages(\n      config_package_id INTEGER PRIMARY KEY,\n      name TEXT UNIQUE NOT NULL,\n      android_package_id INTEGER NOT NULL REFERENCES android_packages ON DELETE CASCADE,\n      experiment_state_id INTEGER NOT NULL,\n      flags_content BLOB,\n      experiment_token BLOB,\n      server_token TEXT NOT NULL DEFAULT \'\',\n      serving_version INTEGER NOT NULL\n    );\n");
                    sQLiteDatabase0.execSQL("    CREATE INDEX config_packages_by_android_package_id ON config_packages(android_package_id);\n");
                    sQLiteDatabase0.execSQL("    CREATE TABLE log_sources(\n      log_source_id INTEGER PRIMARY KEY,\n      name TEXT UNIQUE NOT NULL\n    );\n");
                    sQLiteDatabase0.execSQL("    CREATE TABLE config_packages_to_log_sources(\n      config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n      log_source_id INTEGER NOT NULL REFERENCES log_sources ON DELETE RESTRICT,\n      PRIMARY KEY (log_source_id, config_package_id),\n      UNIQUE(config_package_id, log_source_id)\n    ) WITHOUT ROWID;\n");
                    sQLiteDatabase0.execSQL("    CREATE TABLE cross_logged_tokens(\n      from_config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n      to_config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n      token NOT NULL,\n      diversion_provenance INTEGER NOT NULL\n    );\n");
                    sQLiteDatabase0.execSQL("    CREATE INDEX cross_logged_tokens_by_to_config_package_id ON\n      cross_logged_tokens(to_config_package_id);\n");
                    sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS cross_logged_tokens_by_from_config_package_id ON\n      cross_logged_tokens(from_config_package_id);\n");
                    sQLiteDatabase0.execSQL("    CREATE TABLE flag_overrides(\n      config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n      name TEXT NOT NULL,\n      value NOT NULL,\n      type INTEGER NOT NULL,\n      PRIMARY KEY (config_package_id, name)\n    ) WITHOUT ROWID;\n");
                    eiop eiop0 = new eior(sQLiteDatabase0, new eipk(), new eipm()).b();
                    try {
                        eiop0.c("INSERT INTO android_packages (name)\nSELECT DISTINCT androidPackageName\nFROM Packages;\n").f(new String[]{"Packages"}).d();
                        eiop0.c("WITH LatestTokens AS (\n  SELECT\n    ExperimentTokens.packageName,\n    ExperimentTokens.experimentToken,\n    ExperimentTokens.serverToken,\n    ExperimentTokens.servingVersion\n  FROM ExperimentTokens\n  INNER JOIN Packages\n      USING (packageName)\n  WHERE\n    ExperimentTokens.version = (\n      SELECT MAX(SubTokens.version)\n      FROM ExperimentTokens AS SubTokens\n      WHERE\n        SubTokens.packageName = ExperimentTokens.packageName\n        AND SubTokens.version <= Packages.version\n    )\n  GROUP BY ExperimentTokens.packageName\n)\nINSERT INTO config_packages (\n  name,\n  android_package_id,\n  experiment_state_id,\n  experiment_token,\n  server_token,\n  serving_version\n)\nSELECT\n  Packages.packageName AS name,\n  android_package_id,\n  -1 AS experiment_state_id,\n  LatestTokens.experimentToken AS experiment_token,\n  IFNULL(LatestTokens.serverToken, \'\') AS server_token,\n  IFNULL(LatestTokens.servingVersion, 0) AS serving_version\nFROM Packages\nINNER JOIN android_packages\n    ON (androidPackageName = android_packages.name)\n/* Packages with a committed override might not have a committed token. */\nLEFT OUTER JOIN LatestTokens\n   ON Packages.packageName = LatestTokens.packageName;\n").f(new String[]{"Packages"}).d();
                        eiop0.c("INSERT INTO log_sources (name)\nSELECT DISTINCT logSourceName FROM LogSources;\n").f(new String[]{"LogSources"}).d();
                        eiop0.c("INSERT INTO config_packages_to_log_sources\nSELECT config_package_id, log_source_id\nFROM LogSources\nINNER JOIN config_packages\n  ON LogSources.packageName = config_packages.name\nINNER JOIN log_sources\n  ON LogSources.logSourceName = log_sources.name;\n").f(new String[]{"LogSources"}).d();
                        eiop0.c("INSERT INTO cross_logged_tokens (from_config_package_id, to_config_package_id, token,\n  diversion_provenance)\nSELECT FromPackage.config_package_id, ToPackage.config_package_id, token, provenance\nFROM CrossLoggedExperimentTokens\nINNER JOIN config_packages as FromPackage\n  ON CrossLoggedExperimentTokens.fromPackageName = FromPackage.name\nINNER JOIN config_packages as ToPackage\n  ON CrossLoggedExperimentTokens.toPackageName = ToPackage.name;\n").f(new String[]{"CrossLoggedExperimentTokens"}).d();
                        eiop0.c("INSERT INTO flag_overrides (config_package_id, name, type, value)\nSELECT\n  config_packages.config_package_id,\n  FlagOverrides.name,\n  CASE\n    WHEN FlagOverrides.intVal NOT NULL THEN 1\n    WHEN FlagOverrides.boolVal NOT NULL THEN 2\n    WHEN FlagOverrides.floatVal NOT NULL THEN 3\n    WHEN FlagOverrides.stringVal NOT NULL THEN 4\n    ELSE 5\n  END AS type,\n  CASE\n    WHEN FlagOverrides.intVal NOT NULL THEN FlagOverrides.intVal\n    WHEN FlagOverrides.boolVal NOT NULL THEN FlagOverrides.boolVal\n    WHEN FlagOverrides.floatVal NOT NULL THEN FlagOverrides.floatVal\n    WHEN FlagOverrides.stringVal NOT NULL THEN FlagOverrides.stringVal\n    ELSE FlagOverrides.extensionVal\n  END AS value\nFROM FlagOverrides\nINNER JOIN config_packages\n  ON FlagOverrides.packageName = config_packages.name;\n").f(new String[]{"FlagOverrides"}).d();
                        HashMap hashMap0 = new HashMap();
                        fple fple0 = new fple();
                        try(eioe eioe0 = ((eioh)eiop0).g("SELECT name FROM config_packages;").e(new String[]{"config_packages"}).f()) {
                            while(true) {
                                if(!eioe0.b()) {
                                    break;
                                }
                                String s = eioe0.h(0);
                                if(s.equals(null)) {
                                    throw new NullPointerException("Whoops, guess I messed up");
                                }
                                eioa eioa0 = ((eioh)eiop0).g("SELECT\n  name,\n  CASE\n    WHEN boolVal NOT NULL THEN boolVal\n    WHEN intVal NOT NULL THEN 2\n    WHEN floatVal NOT NULL THEN 3\n    WHEN stringVal NOT NULL THEN 4\n    ELSE 5\n  END AS type,\n  COALESCE(intVal, floatVal, stringVal, extensionVal) AS value\nFROM Flags\nWHERE packageName = ?1;\n").h(new Object[]{s}).e(new String[]{"Flags"}).c();
                                TWR.declareResource(eioa0);
                                TWR.useResource$NT(eioa0);
                                fpky fpky0 = new fpky(0);
                                while(true) {
                                    TWR.useResource$NT(eioa0);
                                    if(!eioa0.b()) {
                                        break;
                                    }
                                    TWR.useResource$NT(eioa0);
                                    fpky0.b(eioa0.a);
                                }
                                try {
                                    TWR.useResource$NT(eioa0);
                                    fpkx fpkx0 = fpky0.a();
                                    Objects.requireNonNull(fpkx0);
                                    hashMap0.put(s, fple0.a(new eipb(fpkx0)));
                                }
                                catch(IOException iOException0) {
                                    TWR.useResource$NT(eioa0);
                                    throw new eipa(0x734E, "Failed to compress flags content.", iOException0);
                                }
                            }
                        }
                        catch(Throwable throwable2) {
                            TWR.safeClose$NT(fple0, throwable2);
                            throw throwable2;
                        }
                        fple0.close();
                        for(Object object0: hashMap0.entrySet()) {
                            eiop0.c("UPDATE config_packages\nSET flags_content = ?2\nWHERE name = ?1;\n").g(new Object[]{((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue()}).d();
                        }
                        eiop0.e();
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(eiop0, throwable1);
                        throw throwable1;
                    }
                    eiop0.close();
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(gdqb1, throwable0);
            throw throwable0;
        }
        gdqb1.close();
    }

    private static void o(String s) {
        try {
            Os.chmod(s, 0x1B0);
        }
        catch(ErrnoException errnoException0) {
            a.e(eiox.a.j(), "Failed to chmod(%s): ", s, errnoException0);
        }
    }

    private final void p(SQLiteDatabase sQLiteDatabase0, int v) {
        if(sQLiteDatabase0.getVersion() >= 1001) {
            this.i.set(14904024);
            return;
        }
        if(v >= 1001) {
            this.i.set(14904025);
        }
    }

    private static final void q(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS schema_upgrade_attempts;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS dogfood_token;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS last_fetch;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS config_packages_to_experiment_states_for_migration;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS cross_logged_tokens;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS experiment_states_to_overrides;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS experiment_states_to_partitions;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS flag_overrides_to_commit;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS config_packages_to_log_sources;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS external_experiments_to_log_sources;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS external_experiments;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS log_sources;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS flag_overrides;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS param_partitions;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS experiment_states;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS accounts;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS config_packages;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS static_config_packages;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS android_packages;");
    }

    private static final void r(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS schema_upgrade_attempts;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS config_packages_to_log_sources;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS cross_logged_tokens;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS flag_overrides;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS config_packages;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS log_sources;");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS android_packages;");
    }
}

