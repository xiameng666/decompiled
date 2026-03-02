import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import jeb.synthetic.TWR;

final class eioy {
    public static final bboh a;

    static {
        eioy.a = bboh.b("PhenotypeDbUpgradeHelper", bbcu.al);
    }

    public static void a(SQLiteDatabase sQLiteDatabase0, String s, String s1, String s2) {
        try {
            Cursor cursor0 = sQLiteDatabase0.rawQuery(a.l(s, s1, "SELECT ", " FROM "), null);
            if(cursor0 != null) {
                cursor0.close();
            }
        }
        catch(SQLiteException unused_ex) {
            goto label_8;
        }
        if(cursor0 != null) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put(s1, null);
            sQLiteDatabase0.update(s, contentValues0, null, null);
            return;
        }
    label_8:
        sQLiteDatabase0.execSQL("ALTER TABLE " + s + " ADD COLUMN " + s1 + s2 + ";");
    }

    public static void b(SQLiteDatabase sQLiteDatabase0, Context context0, int v, int v1) {
        byte[] arr_b1;
        eiph eiph0;
        int v9;
        int v8;
        fple fple0;
        boolean z;
        Throwable throwable18;
        eioe eioe5;
        ArrayDeque arrayDeque0;
        long v7;
        Iterator iterator2;
        Throwable throwable14;
        eioe eioe4;
        HashMap hashMap2;
        Iterator iterator1;
        Iterator iterator0;
        HashSet hashSet1;
        int v5;
        int[] arr_v1;
        Throwable throwable10;
        eioe eioe3;
        HashMap hashMap1;
        HashMap hashMap0;
        Throwable throwable6;
        eioe eioe2;
        eioe eioe1;
        Throwable throwable2;
        eiop eiop1;
        eioe eioe0;
        HashSet hashSet0;
        if(v < 1001 && v1 >= 1001 || v == 0x408 && v1 == 0x409) {
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS accounts(\n      account_id INTEGER PRIMARY KEY,\n      name TEXT UNIQUE NOT NULL,\n      CONSTRAINT reservedIds CHECK ((account_id = 0) = (name = \'\'))\n    );\n");
            sQLiteDatabase0.execSQL("INSERT OR IGNORE INTO accounts (account_id, name) VALUES (0, \'\');");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS android_packages(\n      android_package_id INTEGER PRIMARY KEY,\n      name TEXT UNIQUE NOT NULL,\n      last_syncafter_serving_version INTEGER NOT NULL DEFAULT 0,\n      secret BLOB NOT NULL,\n      device_encrypted_secret BLOB NOT NULL,\n      app_wide_properties BLOB\n    );\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS static_config_packages(\n      static_config_package_id INTEGER PRIMARY KEY,\n      name TEXT UNIQUE NOT NULL,\n      CONSTRAINT nameNotEmpty CHECK (name <> \'\')\n    );\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS config_packages(\n      config_package_id INTEGER PRIMARY KEY,\n      name TEXT UNIQUE NOT NULL,\n      static_config_package_id INTEGER NOT NULL REFERENCES static_config_packages,\n      android_package_id INTEGER NOT NULL REFERENCES android_packages ON DELETE CASCADE,\n      params BLOB,\n      dynamic_params BLOB,\n      declarative_registration_info BLOB,\n      declarative_registration_info_from_client BLOB,\n      heterodyne_info BLOB,\n      runtime_properties BLOB,\n      version INTEGER NOT NULL,\n      baseline_cl INTEGER NOT NULL DEFAULT 0,\n      registration_generation INTEGER NOT NULL DEFAULT 0,\n      last_syncafter_serving_version INTEGER NOT NULL DEFAULT 0,\n      weak_packed_experiment_ids BLOB\n    );\n");
            sQLiteDatabase0.execSQL("    CREATE TRIGGER increment_registration_generation\n    AFTER UPDATE OF\n      params,\n      declarative_registration_info,\n      declarative_registration_info_from_client,\n      heterodyne_info,\n      runtime_properties,\n      version,\n      baseline_cl\n    ON config_packages\n    WHEN NOT (\n      OLD.params IS NEW.params\n      AND OLD.dynamic_params IS NEW.dynamic_params\n      AND OLD.declarative_registration_info IS NEW.declarative_registration_info\n      AND OLD.declarative_registration_info_from_client IS\n        NEW.declarative_registration_info_from_client\n      AND OLD.heterodyne_info IS NEW.heterodyne_info\n      AND OLD.runtime_properties IS NEW.runtime_properties\n      AND OLD.version IS NEW.version\n      AND OLD.baseline_cl = NEW.baseline_cl\n    ) AND OLD.registration_generation = NEW.registration_generation\n    BEGIN\n      UPDATE config_packages\n      SET registration_generation = NEW.registration_generation + 1\n      WHERE config_package_id = NEW.config_package_id;\n    END;\n");
            sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS config_packages_by_android_package_id ON\n      config_packages(android_package_id);\n");
            sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS config_packages_by_static_config_package_id ON\n      config_packages(static_config_package_id);\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS experiment_states(\n      experiment_state_id INTEGER PRIMARY KEY AUTOINCREMENT,\n      experiment_token BLOB,\n      server_token TEXT NOT NULL DEFAULT \'\',\n      serving_version INTEGER NOT NULL,\n      tokens_tag BLOB,\n      config_hash INTEGER DEFAULT 0,\n      registration_generation INTEGER NOT NULL,\n      account_id INTEGER NOT NULL REFERENCES accounts ON DELETE CASCADE,\n      config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE\n    );\n");
            sQLiteDatabase0.execSQL("CREATE INDEX experiment_states_ids ON experiment_states(\n  config_package_id,\n  account_id,\n  experiment_state_id DESC\n);\n");
            sQLiteDatabase0.execSQL("    ALTER TABLE config_packages ADD COLUMN committed_experiment_state_id INTEGER REFERENCES\n      experiment_states ON DELETE SET NULL;\n");
            sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS config_packages_by_committed_experiment_state_id\n      ON config_packages(committed_experiment_state_id);\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS param_partitions(\n      param_partition_id INTEGER PRIMARY KEY,\n      static_config_package_id INTEGER NOT NULL REFERENCES static_config_packages ON\n        DELETE CASCADE,\n      tag BLOB NOT NULL,\n      flags_content BLOB NOT NULL\n    );\n");
            sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS param_partitions_by_static_config_package_id_tag ON\n      param_partitions(static_config_package_id, tag);\n");
            sQLiteDatabase0.execSQL("    CREATE TRIGGER param_partition_unique BEFORE INSERT ON param_partitions\n      WHEN EXISTS(\n          SELECT NULL\n          FROM param_partitions AS existing\n          WHERE\n            existing.static_config_package_id = NEW.static_config_package_id\n            AND existing.tag = NEW.tag\n            AND existing.flags_content = NEW.flags_content\n      )\n      BEGIN\n        SELECT RAISE(FAIL,\n          \'Unique constraint on (static_config_package_id, tag, flags_content) failed)\');\n      END;\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS experiment_states_to_partitions(\n      experiment_state_id INTEGER NOT NULL REFERENCES experiment_states ON DELETE CASCADE,\n      ordinal INTEGER NOT NULL,\n      param_partition_id INTEGER NOT NULL REFERENCES param_partitions,\n      PRIMARY KEY(experiment_state_id, param_partition_id)\n    ) WITHOUT ROWID;\n");
            sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS experiment_states_to_partitions_by_param_partition_id ON\n      experiment_states_to_partitions(param_partition_id);\n");
            sQLiteDatabase0.execSQL("CREATE TRIGGER delete_unused_param_partitions_for_experiment_states\nAFTER DELETE ON experiment_states_to_partitions\nWHEN OLD.param_partition_id NOT IN (\n  SELECT param_partition_id FROM experiment_states_to_partitions\n)\nBEGIN\n  DELETE FROM param_partitions WHERE param_partition_id = OLD.param_partition_id;\nEND;\n");
            sQLiteDatabase0.execSQL("        CREATE TABLE IF NOT EXISTS log_sources(\n          log_source_id INTEGER PRIMARY KEY,\n          name TEXT UNIQUE NOT NULL\n        );\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS config_packages_to_log_sources(\n      config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n      log_source_id INTEGER NOT NULL REFERENCES log_sources ON DELETE RESTRICT,\n      PRIMARY KEY (log_source_id, config_package_id),\n      UNIQUE(config_package_id, log_source_id)\n    ) WITHOUT ROWID;\n");
            sQLiteDatabase0.execSQL("        CREATE TRIGGER delete_unused_log_sources_for_config_packages\n        AFTER DELETE ON config_packages_to_log_sources\n        WHEN\n          OLD.log_source_id NOT IN (SELECT log_source_id FROM config_packages_to_log_sources)\n          AND OLD.log_source_id NOT IN (\n              SELECT log_source_id FROM external_experiments_to_log_sources\n          )\n        BEGIN\n          DELETE FROM log_sources WHERE log_source_id = OLD.log_source_id;\n        END;\n");
            sQLiteDatabase0.execSQL("        CREATE TABLE IF NOT EXISTS cross_logged_tokens(\n          experiment_state_id INTEGER NOT NULL REFERENCES experiment_states ON DELETE CASCADE,\n          to_config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n          token NOT NULL,\n          diversion_provenance INTEGER NOT NULL\n        );\n");
            sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS cross_logged_tokens_by_experiment_state_id ON\n      cross_logged_tokens(experiment_state_id);\n");
            sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS cross_logged_tokens_by_to_config_package_id ON\n      cross_logged_tokens(to_config_package_id);\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS external_experiments(\n      namespace_id INTEGER PRIMARY KEY,\n      namespace TEXT NOT NULL UNIQUE,\n      android_package_id INTEGER NOT NULL REFERENCES android_packages ON DELETE CASCADE,\n      packed_experiments BLOB,\n      external_token BLOB\n    );\n");
            sQLiteDatabase0.execSQL("    CREATE INDEX IF NOT EXISTS external_experiments_by_android_package_id ON\n      external_experiments(android_package_id);\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS external_experiments_to_log_sources(\n      namespace_id INTEGER NOT NULL REFERENCES external_experiments ON DELETE CASCADE,\n      log_source_id INTEGER NOT NULL REFERENCES log_sources ON DELETE RESTRICT,\n      PRIMARY KEY (log_source_id, namespace_id),\n      UNIQUE(namespace_id, log_source_id)\n    ) WITHOUT ROWID;\n");
            sQLiteDatabase0.execSQL("        CREATE TRIGGER delete_unused_log_sources_for_external_experiments\n        AFTER DELETE ON external_experiments_to_log_sources\n        WHEN\n          OLD.log_source_id NOT IN (SELECT log_source_id FROM config_packages_to_log_sources)\n          AND OLD.log_source_id NOT IN (\n            SELECT log_source_id FROM external_experiments_to_log_sources\n          )\n        BEGIN\n          DELETE FROM log_sources WHERE log_source_id = OLD.log_source_id;\n        END;\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS flag_overrides(\n      override_id INTEGER PRIMARY KEY,\n      config_package_id INTEGER REFERENCES config_packages ON DELETE CASCADE,\n      config_package_name TEXT,\n      account_id INTEGER NOT NULL REFERENCES accounts ON DELETE CASCADE,\n      active INTEGER DEFAULT 1,\n      name TEXT NOT NULL,\n      value NOT NULL,\n      type INTEGER NOT NULL,\n      UNIQUE (config_package_id, account_id, active, name),\n      UNIQUE (config_package_name, account_id, active, name),\n      CHECK ((active IS NULL) OR (active IS 1)),\n      CHECK ((config_package_id IS NULL) != (config_package_name IS NULL))\n    );\n");
            sQLiteDatabase0.execSQL("        CREATE TABLE IF NOT EXISTS experiment_states_to_overrides(\n          experiment_state_id INTEGER NOT NULL REFERENCES experiment_states ON DELETE CASCADE,\n          override_id INTEGER NOT NULL REFERENCES flag_overrides,\n          PRIMARY KEY(experiment_state_id, override_id),\n          UNIQUE(override_id, experiment_state_id)\n        ) WITHOUT ROWID;\n");
            sQLiteDatabase0.execSQL("        CREATE TRIGGER delete_unused_flag_overrides_for_experiment_states\n        AFTER DELETE ON experiment_states_to_overrides\n        WHEN\n          OLD.override_id NOT IN (SELECT override_id FROM experiment_states_to_overrides)\n          AND OLD.override_id NOT IN (\n            SELECT override_id FROM flag_overrides WHERE active IS 1\n          )\n        BEGIN\n          DELETE FROM flag_overrides WHERE override_id = OLD.override_id;\n        END;\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS flag_overrides_to_commit(\n      override_id INTEGER NOT NULL REFERENCES flag_overrides ON DELETE CASCADE,\n      config_package_id INTEGER NOT NULL REFERENCES config_packages ON DELETE CASCADE,\n      account_id INTEGER NOT NULL REFERENCES accounts ON DELETE CASCADE,\n      PRIMARY KEY(override_id, config_package_id, account_id),\n      UNIQUE(config_package_id, account_id, override_id)\n    ) WITHOUT ROWID;\n");
            sQLiteDatabase0.execSQL("        CREATE TABLE IF NOT EXISTS last_fetch(\n          type INTEGER PRIMARY KEY,\n          serving_version INTEGER NOT NULL\n        );\n");
            sQLiteDatabase0.execSQL("    CREATE TABLE IF NOT EXISTS dogfood_token(\n      token_key INTEGER PRIMARY KEY CHECK (token_key = 0),\n      token BLOB\n    );\n");
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS config_packages_to_experiment_states_for_migration(\n  config_package_id INTEGER NOT NULL PRIMARY KEY REFERENCES config_packages ON DELETE\n    CASCADE,\n  experiment_state_id INTEGER NOT NULL REFERENCES experiment_states ON DELETE CASCADE,\n  UNIQUE(experiment_state_id, config_package_id)\n);\n");
            eiop eiop0 = new eior(sQLiteDatabase0, new eipk(), new eipm()).b();
            try {
                eiop0.c("INSERT INTO accounts (name) SELECT DISTINCT user FROM (\n  SELECT user FROM ApplicationStates UNION\n  SELECT user FROM ApplicationTags UNION\n  SELECT user FROM ExperimentTokens UNION\n  SELECT user FROM Flags UNION\n  SELECT fromUser FROM CrossLoggedExperimentTokens UNION\n  SELECT user FROM FlagOverrides UNION\n  SELECT user FROM RequestTags\n) WHERE user != \'\' AND user != \'*\';\n").f(new String[]{"ApplicationStates", "ApplicationTags", "ExperimentTokens", "Flags", "CrossLoggedExperimentTokens", "FlagOverrides", "RequestTags", "flag_overrides", "flag_overrides_to_commit", "experiment_states"}).d();
                hashSet0 = new HashSet();
                eioe0 = ((eioh)eiop0).g("SELECT account_id FROM accounts").e(new String[]{"accounts"}).f();
            }
            catch(Throwable throwable0) {
                goto label_183;
            }
            while(true) {
                try {
                label_40:
                    if(!eioe0.b()) {
                        break;
                    }
                }
                catch(Throwable throwable1) {
                    eiop1 = eiop0;
                    throwable2 = throwable1;
                    goto label_51;
                }
                try {
                    hashSet0.add(Long.valueOf(eioe0.f(0)));
                    goto label_40;
                }
                catch(Throwable throwable3) {
                    throwable2 = throwable3;
                    eiop1 = eiop0;
                }
                try {
                label_51:
                    eioe0.close();
                    throw throwable2;
                }
                catch(Throwable throwable4) {
                    try {
                        throwable2.addSuppressed(throwable4);
                        throw throwable2;
                    }
                    catch(Throwable throwable0) {
                        goto label_327;
                    }
                }
            }
            try {
                eioe0.close();
                eiop0.c("INSERT INTO accounts (name) SELECT \'*\' WHERE \'*\' IN (SELECT user FROM FlagOverrides);\n").f(new String[]{"FlagOverrides", "flag_overrides", "flag_overrides_to_commit", "experiment_states"}).d();
                eiop0.c("INSERT INTO android_packages (name, secret, device_encrypted_secret, app_wide_properties)\nSELECT androidPackageName, secret, deviceEncryptedSecret, appWideProperties\nFROM StorageInfos\nLEFT OUTER JOIN AppWideProperties\n    USING (androidPackageName);\n").f(new String[]{"StorageInfos"}).d();
                eioe1 = ((eioh)eiop0).g("SELECT androidPackageName FROM Packages\nUNION /* UNION instead of UNION ALL to ensure package names are distinct. */\nSELECT androidPackageName FROM AppWideProperties\nEXCEPT\nSELECT androidPackageName FROM StorageInfos;\n").e(new String[]{"AppWideProperties", "Packages", "StorageInfos"}).f();
            }
            catch(Throwable throwable0) {
                goto label_183;
            }
            while(true) {
                try {
                label_60:
                    if(!eioe1.b()) {
                        break;
                    }
                }
                catch(Throwable throwable5) {
                    eioe2 = eioe1;
                    eiop1 = eiop0;
                    throwable6 = throwable5;
                    goto label_74;
                }
                try {
                    eioe2 = eioe1;
                    eiop0.c("INSERT INTO android_packages (name, secret, device_encrypted_secret, app_wide_properties)\nSELECT ?1, ?2, ?3, (SELECT appWideProperties FROM AppWideProperties WHERE androidPackageName = ?1);\n").g(new Object[]{eioe1.h(0), fplb.c(), fplb.c()}).d();
                    eioe1 = eioe2;
                    goto label_60;
                }
                catch(Throwable throwable7) {
                    throwable6 = throwable7;
                    eiop1 = eiop0;
                }
                try {
                label_74:
                    eioe2.close();
                    throw throwable6;
                }
                catch(Throwable throwable8) {
                    try {
                        throwable6.addSuppressed(throwable8);
                        throw throwable6;
                    }
                    catch(Throwable throwable0) {
                        goto label_327;
                    }
                }
            }
            try {
                eioe1.close();
                eiop0.c("INSERT INTO static_config_packages (name)\nSELECT DISTINCT\n  CASE\n    WHEN INSTR(packageName, \'#\') > 0 THEN SUBSTR(packageName, 0, INSTR(packageName, \'#\'))\n    ELSE packageName\n  END as name\nFROM Packages\n/* Use GLOB instead of LIKE because we want it to be case sensitive. */\nWHERE packageName NOT GLOB \'__internal.*\';\n").f(new String[]{"Packages"}).d();
                eiop0.c("INSERT INTO config_packages (\n    name,\n    static_config_package_id,\n    android_package_id,\n    params,\n    dynamic_params,\n    declarative_registration_info,\n    declarative_registration_info_from_client,\n    heterodyne_info,\n    runtime_properties,\n    version,\n    baseline_cl,\n    registration_generation\n)\nSELECT\n  packageName AS name,\n  static_config_package_id,\n  android_package_id,\n  params,\n  dynamicParams,\n  declarativeRegistrationInfo AS declarative_registration_info,\n  serializedDeclarativeRegInfo AS declarative_registration_info_from_client,\n  heterodyneInfo AS heterodyne_info,\n  runtimeProperties AS runtime_properties,\n  version,\n  IFNULL(baselineCl, 0) AS baseline_cl,\n  /* Generation starting at 1 means that old experiment_states can be zero, to indicate a sync is\n  needed. */\n  1 AS registration_generation\nFROM Packages\nINNER JOIN android_packages\n  ON (androidPackageName = android_packages.name)\nINNER JOIN static_config_packages\n  ON (static_config_packages.name =\n        CASE\n          WHEN INSTR(packageName, \'#\') > 0 THEN SUBSTR(packageName, 0, INSTR(packageName, \'#\'))\n          ELSE packageName\n        END\n  )\nWHERE Packages.packageName NOT GLOB \'__internal.*\';\n").f(new String[]{"Packages"}).d();
                eiop0.c("INSERT INTO external_experiments (namespace, android_package_id)\nSELECT SUBSTR(packageName, LENGTH(\'__internal.\') + 1), android_package_id\nFROM Packages\nINNER JOIN android_packages\n    ON (androidPackageName = android_packages.name)\nWHERE Packages.packageName GLOB \'__internal.*\';\n").f(new String[]{"Packages"}).d();
                hashMap0 = new HashMap();
                hashMap1 = new HashMap();
                eioe3 = ((eioh)eiop0).g("SELECT COALESCE(config_package_id, (-1 * namespace_id) - 1) AS merged_id, experimentId\nFROM WeakExperimentIds\nLEFT JOIN config_packages ON (packageName = config_packages.name)\nLEFT JOIN external_experiments ON (\n  packageName GLOB \'__internal.*\'\n    AND\n  SUBSTR(packageName, LENGTH(\'__internal.\') + 1) = external_experiments.namespace\n)\nWHERE config_package_id NOT NULL OR namespace_id NOT NULL\n/* Sort IDs in SQL so that we don\'t need to re-sort to delta-encode. */\nORDER BY COALESCE(config_package_id, (-1 * namespace_id) - 1), experimentId;\n").e(new String[]{"WeakExperimentIds"}).f();
            }
            catch(Throwable throwable0) {
                goto label_183;
            }
            try {
                if(eioe3.b()) {
                    goto label_92;
                }
                else {
                    goto label_126;
                }
                goto label_127;
            }
            catch(Throwable throwable9) {
                eiop1 = eiop0;
                throwable10 = throwable9;
                goto label_121;
            }
            try {
            label_92:
                long v2 = eioe3.f(0);
                int[] arr_v = new int[400];
                int v3 = 0;
                while(true) {
                    long v4 = eioe3.f(0);
                    if(v4 == v2) {
                        arr_v1 = arr_v;
                        v5 = v3;
                    }
                    else {
                        eipc.a(arr_v, v3, v2, hashMap0, hashMap1);
                        arr_v1 = arr_v;
                        v2 = v4;
                        v5 = 0;
                    }
                    hashSet1 = hashSet0;
                    int v6 = (int)(((long)(((int)eioe3.f(1)))));
                    if(v6 <= 0) {
                        arr_v = arr_v1;
                        v3 = v5;
                    }
                    else {
                        arr_v = v5 == arr_v1.length ? Arrays.copyOf(arr_v1, (v5 >> 1) + v5) : arr_v1;
                        arr_v[v5] = v6;
                        v3 = v5 + 1;
                    }
                    if(!eioe3.b()) {
                        break;
                    }
                    hashSet0 = hashSet1;
                }
                eipc.a(arr_v, v3, v2, hashMap0, hashMap1);
                goto label_127;
            }
            catch(Throwable throwable11) {
                throwable10 = throwable11;
                eiop1 = eiop0;
            }
            try {
            label_121:
                eioe3.close();
                throw throwable10;
            }
            catch(Throwable throwable12) {
                try {
                    throwable10.addSuppressed(throwable12);
                    throw throwable10;
                }
                catch(Throwable throwable0) {
                    goto label_327;
                }
            }
        label_126:
            hashSet1 = hashSet0;
            try {
            label_127:
                eioe3.close();
                iterator0 = hashMap0.entrySet().iterator();
            alab1:
                while(true) {
                label_129:
                    if(iterator0.hasNext()) {
                        goto label_343;
                    }
                    iterator1 = hashMap1.entrySet().iterator();
                    while(true) {
                    label_131:
                        if(iterator1.hasNext()) {
                            goto label_340;
                        }
                        hashMap2 = new HashMap();
                        eioe4 = ((eioh)eiop0).g("SELECT new.namespace_id, old.experimentToken\n  FROM ExternalExperimentTokens AS old\n  INNER JOIN external_experiments AS new ON\n    old.packageName GLOB \'__internal.*\'\n      AND\n    SUBSTR(old.packageName, LENGTH(\'__internal.\') + 1) = new.namespace\n").e(new String[]{"ExternalExperimentTokens"}).f();
                        break alab1;
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_183;
            }
            while(true) {
                try {
                label_134:
                    if(!eioe4.b()) {
                        break;
                    }
                }
                catch(Throwable throwable13) {
                    eiop1 = eiop0;
                    throwable14 = throwable13;
                    goto label_145;
                }
                try {
                    hashMap2.put(Long.valueOf(eioe4.f(0)), eioe4.h(1));
                    goto label_134;
                }
                catch(Throwable throwable15) {
                    throwable14 = throwable15;
                    eiop1 = eiop0;
                }
                try {
                label_145:
                    eioe4.close();
                    throw throwable14;
                }
                catch(Throwable throwable16) {
                    try {
                        throwable14.addSuppressed(throwable16);
                        throw throwable14;
                    }
                    catch(Throwable throwable0) {
                        goto label_327;
                    }
                }
            }
            try {
                eioe4.close();
                iterator2 = hashMap2.entrySet().iterator();
                while(true) {
                label_152:
                    if(!iterator2.hasNext()) {
                        eiop0.c("INSERT INTO log_sources (name) SELECT DISTINCT logSourceName FROM LogSources;\n").f(new String[]{"LogSources"}).d();
                        eiop0.c("INSERT INTO config_packages_to_log_sources\nSELECT config_package_id, log_source_id\nFROM config_packages\nINNER JOIN log_sources\nINNER JOIN LogSources as old\n    ON (\n      old.logSourceName = log_sources.name\n        AND\n      old.packageName = config_packages.name\n    );\n").f(new String[]{"LogSources"}).d();
                        eiop0.c("INSERT INTO external_experiments_to_log_sources (namespace_id, log_source_id)\nSELECT namespace_id, log_source_id\nFROM Packages\nINNER JOIN LogSources USING (packageName)\nINNER JOIN external_experiments\nINNER JOIN log_sources ON (\n  log_sources.name = LogSources.logSourceName AND\n  (\'__internal.\' || external_experiments.namespace) = packageName\n);\n").f(new String[]{"external_experiments"}).d();
                        v7 = eiop0.c("INSERT INTO experiment_states (experiment_state_id, experiment_token, server_token, account_id,\n  config_package_id, serving_version, tokens_tag, config_hash, registration_generation)\nSELECT\n  (SELECT MAX(config_package_id) FROM config_packages) + 1,\n  NULL,\n  \'\',\n  0,\n  (SELECT MAX(config_package_id) FROM config_packages),\n  0,\n  NULL,\n  0,\n  0\nWHERE EXISTS(SELECT NULL FROM config_packages);\n").f(new String[]{"config_packages"}).c();
                        eiop0.c("WITH SnapshotPackages AS (\n  SELECT\n    config_package_id,\n    account_id,\n    ExperimentTokens.packageName AS packageName,\n    user,\n    experimentToken,\n    serverToken,\n    configHash,\n    servingVersion,\n    tokensTag,\n    Packages.isSynced IS 1 AS isSynced,\n    MAX(ExperimentTokens.version)\n  FROM ExperimentTokens\n  INNER JOIN Packages ON\n    Packages.packageName = ExperimentTokens.packageName\n      AND\n    /* Matches java logic in GetConfigurationSnapshotOperation */\n    ExperimentTokens.version <= Packages.version\n  INNER JOIN config_packages ON (ExperimentTokens.packageName = config_packages.name)\n  INNER JOIN accounts ON (accounts.name = user)\n  WHERE isCommitted = 0\n  GROUP BY ExperimentTokens.packageName, ExperimentTokens.user\n)\nINSERT INTO experiment_states (experiment_token, server_token, account_id,\n  config_package_id, serving_version, tokens_tag, config_hash,\n  registration_generation)\nSELECT\n  experimentToken AS experiment_token,\n  serverToken AS server_token,\n  account_id,\n  config_package_id,\n  servingVersion AS serving_version,\n  tokensTag AS tokens_tag,\n  CAST(configHash AS INTEGER) AS config_hash,\n  isSynced AS registration_generation\nFROM SnapshotPackages\n").f(new String[]{"ExperimentTokens"}).d();
                        eiop0.c("WITH OverridesPackages AS (\n  SELECT config_package_id, account_id\n  FROM FlagOverrides\n  INNER JOIN accounts ON (\n    /* If a wildcard override exists for a package, we need to create snapshots for every account.*/\n    accounts.name != \'*\'\n      AND\n    (accounts.name = FlagOverrides.user OR FlagOverrides.user = \'*\')\n  )\n  INNER JOIN config_packages ON (FlagOverrides.packageName = config_packages.name)\n  WHERE IFNULL(committed, 0) = 0\n)\nINSERT INTO experiment_states (experiment_token, server_token, account_id,\n  config_package_id, serving_version, tokens_tag, config_hash,\n  registration_generation)\nSELECT\n  zeroblob(0) AS experiment_token,\n  \'\' AS server_token,\n  account_id,\n  config_package_id,\n  0 AS serving_version,\n  NULL AS tokens_tag,\n  0 AS config_hash,\n  0 AS registration_generation\nFROM OverridesPackages\nLEFT JOIN experiment_states USING (config_package_id, account_id)\nWHERE experiment_states.experiment_state_id IS NULL\n").f(new String[]{"FlagOverrides", "accounts"}).d();
                        eiop0.c("DELETE FROM experiment_states WHERE experiment_state_id = ?").g(new Object[]{v7}).d();
                        arrayDeque0 = new ArrayDeque();
                        eioe5 = ((eioh)eiop0).g("SELECT config_package_id, static_config_package_id, name, Packages.version\nFROM config_packages\nINNER JOIN Packages ON (config_packages.name = Packages.packageName);\n").e(new String[]{"config_packages"}).f();
                        break;
                    }
                    goto label_331;
                }
            }
            catch(Throwable throwable0) {
                goto label_183;
            }
            while(true) {
                try {
                label_162:
                    if(!eioe5.b()) {
                        break;
                    }
                }
                catch(Throwable throwable17) {
                    eiop1 = eiop0;
                    throwable18 = throwable17;
                    goto label_173;
                }
                try {
                    arrayDeque0.add(new eiph(eioe5.f(0), eioe5.f(1), eioe5.h(2), eioe5.f(3)));
                    goto label_162;
                }
                catch(Throwable throwable19) {
                    throwable18 = throwable19;
                    eiop1 = eiop0;
                }
                try {
                label_173:
                    eioe5.close();
                    throw throwable18;
                }
                catch(Throwable throwable20) {
                    try {
                        throwable18.addSuppressed(throwable20);
                        throw throwable18;
                    }
                    catch(Throwable throwable0) {
                        goto label_327;
                    }
                }
            }
            try {
                eioe5.close();
                z = ((eioh)eiop0).g("SELECT EXISTS(SELECT NULL FROM FlagOverrides);\n").e(new String[]{"FlagOverrides"}).g();
                fple0 = new fple();
            }
            catch(Throwable throwable0) {
            label_183:
                eiop1 = eiop0;
                goto label_327;
            }
            try {
                v8 = arrayDeque0.size();
                v9 = 0;
                while(true) {
                label_187:
                    eiph0 = (eiph)arrayDeque0.poll();
                    break;
                }
            }
            catch(Throwable throwable21) {
                eiop1 = eiop0;
                goto label_277;
            }
            if(eiph0 == null) {
                goto label_282;
            }
            try {
                eipi.a(eiop0, hashSet1, v7, z, fple0, eiph0);
                eiop0 = eiop0;
                hashSet1 = hashSet1;
                goto label_187;
            }
            catch(RuntimeException runtimeException0) {
                try {
                    eiop1 = eiop0;
                    String s = eiph0.c;
                    ((ggtj)((ggtj)eipi.a.i()).s(runtimeException0)).z("Phenotype Phixit migration error. EventCode: %s", 0x2F);
                    hlsc hlsc0 = (hlsc)((ProtoLiteMessage)hlsf.a).v_newBuilder();
                    hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
                    if(!hlrg0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hlrg0).ensureMutable();
                    }
                    hlrh hlrh0 = (hlrh)hlrg0.b_message;
                    s.getClass();
                    hlrh0.b |= 1;
                    hlrh0.c = s;
                    if(!hlsc0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hlsc0).ensureMutable();
                    }
                    hlsf hlsf0 = (hlsf)hlsc0.b_message;
                    hlrh hlrh1 = (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
                    hlrh1.getClass();
                    hlsf0.c = hlrh1;
                    hlsf0.b |= 2;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlsb.a).v_newBuilder();
                    String s1 = runtimeException0.getClass().getName();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    s1.getClass();
                    ((hlsb)hftv0).b |= 1;
                    ((hlsb)hftv0).c = s1;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlsb hlsb0 = (hlsb)hftp0.b_message;
                    hlsb0.b |= 2;
                    hlsb0.d = 0x2F;
                    if(!hlsc0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hlsc0).ensureMutable();
                    }
                    hlsf hlsf1 = (hlsf)hlsc0.b_message;
                    hlsb hlsb1 = (hlsb)hftp0.N_build();
                    hlsb1.getClass();
                    hlsf1.e = hlsb1;
                    hlsf1.b |= 8;
                    hlsf hlsf2 = (hlsf)((ProtoLiteBuilder)hlsc0).N_build();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
                    bbed bbed0 = bbed.jw;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    bbdv bbdv0 = (bbdv)hftp1.b_message;
                    bbdv0.b = bbed0.a();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    ((bbdv)hftv1).c = 1;
                    bbdz bbdz0 = bbdz.c;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    bbdv bbdv1 = (bbdv)hftp1.b_message;
                    bbdv1.d = bbdz0.a();
                    bbdv bbdv2 = (bbdv)hftp1.N_build();
                    ayuc ayuc0 = new aytt(context0, "PHENOTYPE").a().j(((MessageLite)hlsf2), fhbe.b(context0, new icyo()));
                    ayuc0.k(0x2F);
                    ayuc0.l = bbdv2;
                    ayuc0.d();
                    if((runtimeException0 instanceof SQLiteDatabaseCorruptException)) {
                        throw runtimeException0;
                    }
                    ++v9;
                    if(v9 > v8 / 4) {
                        throw runtimeException0;
                    }
                    eiol eiol0 = eiop1.c("DELETE FROM experiment_states WHERE config_package_id = ?;\n");
                    Long long0 = (long)eiph0.a;
                    eiol0.g(new Object[]{long0}).d();
                    eiop1.c("DELETE FROM flag_overrides WHERE config_package_id = ?;\n").g(new Object[]{long0}).d();
                    eiop1.c("DELETE FROM param_partitions WHERE static_config_package_id = ? AND param_partition_id NOT IN (\n  SELECT ESPP.param_partition_id FROM experiment_states_to_partitions AS ESPP\n);\n").g(new Object[]{((long)eiph0.b)}).d();
                    eiop0 = eiop1;
                    hashSet1 = hashSet1;
                    arrayDeque0 = arrayDeque0;
                    v8 = v8;
                    goto label_187;
                }
                catch(Throwable throwable21) {
                    try {
                        TWR.safeClose$NT(fple0, throwable21);
                        throw throwable21;
                    }
                    catch(Throwable throwable0) {
                        goto label_327;
                    }
                }
            }
            catch(Throwable throwable21) {
                eiop1 = eiop0;
            }
            try {
            label_277:
                fple0.close();
                throw throwable21;
            }
            catch(Throwable throwable22) {
                try {
                    throwable21.addSuppressed(throwable22);
                    throw throwable21;
                label_282:
                    eiop1 = eiop0;
                    fple0.close();
                    ArrayList arrayList0 = new ArrayList();
                    try(eioe eioe6 = ((eioh)eiop1).g("SELECT experiment_state_id\nFROM experiment_states\nWHERE\n  config_hash = 0\n  AND EXISTS (\n    SELECT NULL\n    FROM experiment_states_to_partitions\n    WHERE experiment_states_to_partitions.experiment_state_id =\n      experiment_states.experiment_state_id\n  );\n").e(new String[]{"experiment_states"}).f()) {
                        while(true) {
                            if(!eioe6.b()) {
                                break;
                            }
                            arrayList0.add(Long.valueOf(eioe6.f(0)));
                        }
                        int v10 = arrayList0.size();
                        for(int v11 = 0; v11 < v10; ++v11) {
                            Long long1 = (Long)arrayList0.get(v11);
                            eioe eioe7 = ((eioh)eiop1).g("SELECT experiment_states_to_partitions.ordinal, param_partitions.tag\nFROM experiment_states_to_partitions\nINNER JOIN param_partitions\n  USING (param_partition_id)\nWHERE experiment_state_id = ?1\nORDER BY experiment_states_to_partitions.ordinal ASC;\n").h(new Object[]{long1}).f();
                            TWR.declareResource(eioe7);
                            int v12;
                            for(v12 = 0; true; v12 = v12 * 17 ^ v14) {
                                TWR.useResource$NT(eioe7);
                                if(!eioe7.b()) {
                                    break;
                                }
                                TWR.useResource$NT(eioe7);
                                long v13 = eioe7.f(0);
                                byte[] arr_b = eioe7.k(1);
                                int v14 = (int)(v13 ^ v13 >>> 0x20);
                                for(int v15 = 0; true; ++v15) {
                                    TWR.useResource$NT(eioe7);
                                    if(v15 >= arr_b.length) {
                                        break;
                                    }
                                    TWR.useResource$NT(eioe7);
                                    v14 = v14 * 0x1F + arr_b[v15];
                                }
                            }
                            if(v12 != 0) {
                                eiop1.c("UPDATE experiment_states SET config_hash = ?1 WHERE experiment_state_id = ?2;").g(new Object[]{v12, long1}).d();
                            }
                        }
                        eiop1.c("    INSERT INTO config_packages_to_experiment_states_for_migration\n      (config_package_id, experiment_state_id)\n    SELECT config_package_id, MAX(experiment_state_id) AS experiment_state_id\n    FROM experiment_states\n    GROUP by config_package_id;\n").f(new String[]{"experiment_states"}).d();
                        eiop1.c("INSERT INTO cross_logged_tokens (experiment_state_id, to_config_package_id, token,\n  diversion_provenance)\nSELECT DISTINCT experiment_state_id, ToPackage.config_package_id, token, provenance\nFROM accounts\nINNER JOIN experiment_states USING (account_id)\nINNER JOIN config_packages as FromPackage\nINNER JOIN config_packages as ToPackage\nINNER JOIN CrossLoggedExperimentTokens\nON (\n  FromPackage.config_package_id = experiment_states.config_package_id\n  AND CrossLoggedExperimentTokens.fromPackageName = FromPackage.name\n  AND CrossLoggedExperimentTokens.toPackageName = ToPackage.name\n  AND CrossLoggedExperimentTokens.fromUser = accounts.name\n  AND isCommitted = (\n    FromPackage.committed_experiment_state_id IS experiment_states.experiment_state_id\n  )\n);\n").f(new String[]{"CrossLoggedExperimentTokens"}).d();
                        eiop1.c("UPDATE android_packages SET last_syncafter_serving_version = (\n  SELECT servingVersion FROM LastSyncAfterRequest\n  WHERE androidPackageName IS android_packages.name AND\n        androidPackageName IS packageName\n)\nWHERE android_packages.name IN (\n  SELECT androidPackageName FROM LastSyncAfterRequest WHERE androidPackageName IS packageName\n);\n").f(new String[]{"LastSyncAfterRequest"}).d();
                        eiop1.c("UPDATE config_packages SET last_syncafter_serving_version = (\n  SELECT servingVersion\n  FROM android_packages\n  INNER JOIN LastSyncAfterRequest ON (\n    config_packages.name = LastSyncAfterRequest.packageName AND\n    android_packages.android_package_id = config_packages.android_package_id AND\n    /* If the android package in the old table is null, assume it is for our\n       registered version. If it doesn\'t match, drop it.*/\n    IFNULL(LastSyncAfterRequest.androidPackageName = android_packages.name, 1)\n  )\n)\nWHERE config_package_id IN (\n  SELECT nested.config_package_id\n  FROM config_packages AS nested\n  INNER JOIN android_packages USING (android_package_id)\n  INNER JOIN LastSyncAfterRequest ON\n    LastSyncAfterRequest.packageName = nested.name\n      AND\n    IFNULL(LastSyncAfterRequest.androidPackageName = android_packages.name, 1)\n);\n").f(new String[]{"LastSyncAfterRequest"}).d();
                        eiop1.c("INSERT INTO dogfood_token (token_key, token)\nSELECT \"key\", token FROM DogfoodsToken WHERE \"key\" = 0;\n").d();
                        eiop1.c("INSERT INTO last_fetch (type, serving_version) SELECT \"key\", serverTimestamp FROM LastFetch;\n").f(new String[]{"LastFetch"}).d();
                        eiop1.e();
                    }
                    goto label_329;
                }
                catch(Throwable throwable0) {
                }
            }
        label_327:
            Throwable throwable23 = throwable0;
            goto label_349;
        label_329:
            eiop1.close();
            goto label_354;
            try {
            label_331:
                Object object0 = iterator2.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                try {
                    arr_b1 = Base64.decode(((String)map$Entry0.getValue()), 0);
                }
                catch(RuntimeException runtimeException1) {
                    a.ae(eipi.a.i(), "Failed to decode ExternalExperimentToken Base64", runtimeException1);
                    goto label_152;
                }
                eiop0.c("UPDATE external_experiments SET external_token=?1 WHERE namespace_id = ?2").g(new Object[]{arr_b1, map$Entry0.getKey()}).d();
                goto label_152;
            label_340:
                Object object1 = iterator1.next();
                eiop0.c("UPDATE external_experiments SET packed_experiments = ?2 WHERE namespace_id = ?1;\n").g(new Object[]{((Map.Entry)object1).getKey(), ((Map.Entry)object1).getValue()}).d();
                goto label_131;
            label_343:
                Object object2 = iterator0.next();
                eiop0.c("UPDATE config_packages SET weak_packed_experiment_ids = ?2 WHERE config_package_id = ?1;\n").g(new Object[]{((Map.Entry)object2).getKey(), ((Map.Entry)object2).getValue()}).d();
                goto label_129;
            }
            catch(Throwable throwable24) {
                throwable23 = throwable24;
                eiop1 = eiop0;
            }
            try {
            label_349:
                eiop1.close();
            }
            catch(Throwable throwable25) {
                throwable23.addSuppressed(throwable25);
            }
            throw throwable23;
        }
    label_354:
        if(v < 0x40A && v1 >= 0x40A) {
            ((ggtj)eioy.a.h()).x("Updating trigger increment_registration_generation.");
            sQLiteDatabase0.execSQL("DROP TRIGGER IF EXISTS increment_registration_generation;");
            sQLiteDatabase0.execSQL("CREATE TRIGGER increment_registration_generation\nAFTER UPDATE OF\n  params,\n  dynamic_params,\n  declarative_registration_info,\n  declarative_registration_info_from_client,\n  heterodyne_info,\n  runtime_properties,\n  version,\n  baseline_cl\nON config_packages\nWHEN NOT (\n  OLD.params IS NEW.params\n  AND OLD.dynamic_params IS NEW.dynamic_params\n  AND OLD.declarative_registration_info IS NEW.declarative_registration_info\n  AND OLD.declarative_registration_info_from_client IS\n    NEW.declarative_registration_info_from_client\n  AND OLD.heterodyne_info IS NEW.heterodyne_info\n  AND OLD.runtime_properties IS NEW.runtime_properties\n  AND OLD.version IS NEW.version\n  AND OLD.baseline_cl = NEW.baseline_cl\n) AND OLD.registration_generation = NEW.registration_generation\nBEGIN\n  UPDATE config_packages\n  SET registration_generation = NEW.registration_generation + 1\n  WHERE config_package_id = NEW.config_package_id;\nEND;\n");
        }
        if(v < 0x40B && v1 >= 0x40B) {
            ((ggtj)eioy.a.h()).x("Adding `source` column to flag_overrides table.");
            eioy.a(sQLiteDatabase0, "flag_overrides", "source", " INTEGER DEFAULT 0");
        }
    }
}

