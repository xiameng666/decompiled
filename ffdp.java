import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class ffdp extends bboo {
    public ffdp(Context context0) {
        super(context0.getApplicationContext(), "connectionconfig.db", "connectionconfig.db", 13);
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE connectionConfigurations (_id INTEGER PRIMARY KEY AUTOINCREMENT,androidId TEXT,allowedConfigPackages TEXT,name TEXT NOT NULL,pairedBtAddress TEXT NOT NULL,connectionType INTEGER NOT NULL,role INTEGER NOT NULL,connectionEnabled INTEGER NOT NULL,nodeId TEXT,crypto TEXT,packageName TEXT,isMigrating INTEGER DEFAULT 0, dataItemSyncEnabled INTEGER DEFAULT 1, restrictions BLOB,removeConnectionWhenBondRemovedByUser INTEGER DEFAULT 1, connectionDelayFilters BLOB,maxSupportedRemoteAndroidSdkVersion INTEGER DEFAULT 0,runtimeType INTEGER DEFAULT 0, peerSupportsBle INTEGER DEFAULT 0, skipConnectingIfNotBonded INTEGER DEFAULT 0,  UNIQUE(name) ON CONFLICT REPLACE);");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        if(v == 1) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", "connectionConfigurations", "nodeId"));
            v = 2;
        }
        if(v == 2) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", "connectionConfigurations", "crypto"));
            v = 3;
        }
        if(v == 3) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", "connectionConfigurations", "packageName"));
            v = 4;
        }
        if(v == 4) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", "connectionConfigurations", "allowedConfigPackages"));
            v = 5;
        }
        if(v == 5) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT 0;", "connectionConfigurations", "isMigrating"));
            v = 6;
        }
        if(v == 6) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT 1;", "connectionConfigurations", "dataItemSyncEnabled"));
            v = 7;
        }
        if(v == 7) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s BLOB;", "connectionConfigurations", "restrictions"));
            v = 8;
        }
        if(v == 8) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT 1;", "connectionConfigurations", "removeConnectionWhenBondRemovedByUser"));
            v = 9;
        }
        if(v == 9) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s BLOB;", "connectionConfigurations", "connectionDelayFilters"));
            v = 10;
        }
        if(v == 10) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT 0;", "connectionConfigurations", "maxSupportedRemoteAndroidSdkVersion"));
            v = 11;
        }
        if(v == 11) {
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT 0;", "connectionConfigurations", "runtimeType"));
            sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT 0;", "connectionConfigurations", "peerSupportsBle"));
        }
        else if(v != 12) {
            return;
        }
        sQLiteDatabase0.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT 0;", "connectionConfigurations", "skipConnectingIfNotBonded"));
    }
}

