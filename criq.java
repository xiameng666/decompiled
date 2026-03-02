import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.TWR;

public final class criq extends crbz {
    public static final String[] a;
    private final crio b;
    private boolean c;

    static {
        criq.a = new String[]{"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    }

    public criq(crkt crkt0) {
        super(crkt0);
        this.b = new crio(this, this.aj());
    }

    @Override  // crbz
    protected final boolean p() {
        return false;
    }

    final SQLiteDatabase q() {
        if(this.c) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase0 = this.b.getWritableDatabase();
        if(sQLiteDatabase0 == null) {
            this.c = true;
            return null;
        }
        return sQLiteDatabase0;
    }

    final String r() {
        return "google_app_measurement_local.db";
    }

    final boolean s() {
        return this.aj().getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean t(int v, byte[] arr_b) {
        long v3;
        Cursor cursor1;
        int v2;
        int v1;
        ContentValues contentValues0;
        Cursor cursor0;
        this.m();
        this.n();
        if(!this.c) {
            cursor0 = null;
            AppMetadata appMetadata0 = this.am().t(crif.aL) ? this.f().t(null) : null;
            contentValues0 = new ContentValues();
            contentValues0.put("type", Integer.valueOf(v));
            contentValues0.put("entry", arr_b);
            if(this.am().t(crif.aL) && appMetadata0 != null) {
                contentValues0.put("app_version", appMetadata0.c);
                contentValues0.put("app_version_int", Long.valueOf(appMetadata0.j));
            }
            v1 = 5;
            v2 = 0;
            goto label_26;
        }
        try {
            return false;
        }
        catch(SQLiteFullException sQLiteFullException0) {
            cursor1 = null;
            goto label_63;
        }
        catch(SQLiteDatabaseLockedException unused_ex) {
            cursor1 = null;
            goto label_71;
        }
        catch(SQLiteException sQLiteException0) {
        }
        catch(Throwable throwable0) {
            goto label_92;
        }
    label_16:
        cursor1 = null;
    alab1:
        while(true) {
            try {
            label_17:
                if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                    sQLiteDatabase0.endTransaction();
                }
                this.aJ().c.b("Error writing entry to local database", sQLiteException0);
                this.c = true;
                if(cursor1 != null) {
                    goto label_22;
                }
                goto label_23;
            }
            catch(Throwable throwable0) {
                break;
            }
        label_22:
            cursor1.close();
        label_23:
            if(sQLiteDatabase0 != null) {
                sQLiteDatabase0.close();
            }
            while(true) {
                ++v2;
            label_26:
                if(v2 >= 5) {
                    this.aJ().k.a("Failed to write entry to local database");
                    return false;
                }
                try {
                    sQLiteDatabase0 = null;
                    sQLiteDatabase0 = this.q();
                    goto label_38;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    cursor1 = null;
                    goto label_71;
                }
                catch(SQLiteException sQLiteException0) {
                    cursor1 = null;
                    goto label_17;
                }
                catch(Throwable throwable0) {
                    goto label_92;
                }
                cursor1 = null;
                goto label_63;
            label_38:
                if(sQLiteDatabase0 == null) {
                    try {
                        this.c = true;
                        return false;
                    label_41:
                        v3 = 0L;
                        sQLiteDatabase0.beginTransaction();
                        cursor1 = sQLiteDatabase0.rawQuery("select count(1) from messages", null);
                        goto label_50;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        cursor1 = null;
                        goto label_63;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        cursor1 = null;
                        goto label_71;
                    }
                    catch(SQLiteException sQLiteException0) {
                        goto label_16;
                    }
                    catch(Throwable throwable0) {
                        goto label_92;
                    }
                }
                goto label_41;
            label_50:
                if(cursor1 != null) {
                    try {
                        if(cursor1.moveToFirst()) {
                            v3 = cursor1.getLong(0);
                        }
                    label_53:
                        if(Long.compare(v3, 100000L) >= 0) {
                            this.aJ().c.a("Data loss, local db full");
                            long v4 = (long)sQLiteDatabase0.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(100001L - v3)});
                            if(v4 != 100001L - v3) {
                                this.aJ().c.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(100001L - v3), Long.valueOf(v4), Long.valueOf(100001L - v3 - v4));
                            }
                        }
                        sQLiteDatabase0.insertOrThrow("messages", null, contentValues0);
                        sQLiteDatabase0.setTransactionSuccessful();
                        sQLiteDatabase0.endTransaction();
                        goto label_85;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        goto label_63;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        goto label_71;
                    }
                    catch(SQLiteException sQLiteException0) {
                        continue alab1;
                    }
                    catch(Throwable throwable0) {
                        break alab1;
                    }
                }
                goto label_53;
                try {
                label_63:
                    this.aJ().c.b("Error writing entry; local database full", sQLiteFullException0);
                    this.c = true;
                    if(cursor1 != null) {
                        goto label_66;
                    }
                    goto label_67;
                }
                catch(Throwable throwable0) {
                    break alab1;
                }
            label_66:
                cursor1.close();
            label_67:
                if(sQLiteDatabase0 != null) {
                    sQLiteDatabase0.close();
                }
                ++v2;
                goto label_26;
                try {
                label_71:
                    SystemClock.sleep(v1);
                    v1 += 20;
                    if(cursor1 != null) {
                        goto label_74;
                    }
                    goto label_75;
                }
                catch(Throwable throwable0) {
                    break alab1;
                }
            label_74:
                cursor1.close();
            label_75:
                if(sQLiteDatabase0 == null) {
                    break;
                }
                sQLiteDatabase0.close();
            }
            ++v2;
            goto label_26;
        }
        cursor0 = cursor1;
        goto label_92;
    label_85:
        if(cursor1 != null) {
            cursor1.close();
        }
        sQLiteDatabase0.close();
        return true;
    label_92:
        if(cursor0 != null) {
            cursor0.close();
        }
        if(sQLiteDatabase0 != null) {
            sQLiteDatabase0.close();
        }
        throw throwable0;
    }

    public final List u() {
        EventParams eventParams0;
        Parcel parcel3;
        ConditionalUserPropertyParcel conditionalUserPropertyParcel0;
        Parcel parcel2;
        UserAttributeParcel userAttributeParcel0;
        Parcel parcel1;
        EventParcel eventParcel0;
        crie crie2;
        Parcel parcel0;
        List list5;
        long v5;
        byte[] arr_b;
        crie crie1;
        crie crie0;
        String[] arr_s;
        List list4;
        List list3;
        long v3;
        Cursor cursor0;
        long v2;
        SQLiteDatabase sQLiteDatabase1;
        List list2;
        SQLiteDatabase sQLiteDatabase0;
        this.n();
        this.m();
        List list0 = null;
        if(this.c) {
            return null;
        }
        List list1 = new ArrayList();
        if(this.s()) {
            int v = 5;
            int v1 = 0;
            while(v1 < 5) {
                try {
                    sQLiteDatabase0 = list0;
                    sQLiteDatabase0 = this.q();
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    list2 = list0;
                    sQLiteDatabase0 = list2;
                    sQLiteDatabase1 = sQLiteDatabase0;
                    goto label_198;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    list2 = list0;
                    sQLiteDatabase0 = list2;
                    sQLiteDatabase1 = sQLiteDatabase0;
                    goto label_206;
                }
                catch(SQLiteException sQLiteException0) {
                    list2 = list0;
                    sQLiteDatabase0 = list2;
                    sQLiteDatabase1 = sQLiteDatabase0;
                    goto label_215;
                }
                catch(Throwable throwable0) {
                    goto label_229;
                }
                if(sQLiteDatabase0 == null) {
                    try {
                        this.c = true;
                        return list0;
                    label_32:
                        sQLiteDatabase0.beginTransaction();
                        goto label_33;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        list2 = list0;
                        sQLiteDatabase1 = list2;
                        goto label_198;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        list2 = list0;
                        sQLiteDatabase1 = list2;
                        goto label_206;
                    }
                    catch(SQLiteException sQLiteException0) {
                        list2 = list0;
                        sQLiteDatabase1 = list2;
                        goto label_215;
                    }
                    catch(Throwable throwable0) {
                        list2 = list0;
                        list0 = list2;
                        goto label_229;
                    }
                }
                goto label_32;
                try {
                label_33:
                    v2 = -1L;
                    cursor0 = sQLiteDatabase0.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                }
                catch(Throwable throwable1) {
                    list2 = list0;
                    cursor0 = list2;
                    goto label_45;
                }
                try {
                    if(cursor0.moveToFirst()) {
                        v3 = cursor0.getLong(0);
                        goto label_48;
                    }
                    else {
                        goto label_50;
                    }
                    goto label_52;
                }
                catch(Throwable throwable1) {
                    list2 = list0;
                }
                try {
                label_45:
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                    throw throwable1;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    sQLiteDatabase1 = list2;
                    goto label_198;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    sQLiteDatabase1 = list2;
                    goto label_206;
                }
                catch(SQLiteException sQLiteException0) {
                    sQLiteDatabase1 = list2;
                    goto label_215;
                }
                catch(Throwable throwable0) {
                    list0 = list2;
                    goto label_229;
                }
                try {
                label_48:
                    cursor0.close();
                    goto label_52;
                label_50:
                    cursor0.close();
                    v3 = -1L;
                label_52:
                    if(v3 == -1L) {
                        list3 = list0;
                        list4 = list3;
                    }
                    else {
                        list3 = "rowid<?";
                        list4 = new String[]{String.valueOf(v3)};
                    }
                    arr_s = new String[]{"rowid", "type", "entry"};
                    crie0 = crif.aL;
                    list2 = list0;
                    if(this.am().t(crie0)) {
                        arr_s = new String[]{"rowid", "type", "entry", "app_version", "app_version_int"};
                        crie1 = crie0;
                        sQLiteDatabase1 = sQLiteDatabase0.query("messages", arr_s, ((String)list3), ((String[])list4), null, null, "rowid asc", Integer.toString(100));
                        goto label_89;
                    }
                    crie1 = crie0;
                    sQLiteDatabase1 = sQLiteDatabase0.query("messages", arr_s, ((String)list3), ((String[])list4), null, null, "rowid asc", Integer.toString(100));
                    goto label_89;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    list2 = list0;
                    sQLiteDatabase1 = list2;
                    goto label_198;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    list2 = list0;
                    sQLiteDatabase1 = list2;
                    goto label_206;
                }
                catch(SQLiteException sQLiteException0) {
                    list2 = list0;
                    sQLiteDatabase1 = list2;
                    goto label_215;
                }
                catch(Throwable throwable0) {
                    list2 = list0;
                    list0 = list2;
                    goto label_229;
                }
                try {
                    arr_s = new String[]{"rowid", "type", "entry", "app_version", "app_version_int"};
                    crie1 = crie0;
                    sQLiteDatabase1 = sQLiteDatabase0.query("messages", arr_s, ((String)list3), ((String[])list4), null, null, "rowid asc", Integer.toString(100));
                    goto label_89;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    sQLiteDatabase1 = list2;
                    goto label_198;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    sQLiteDatabase1 = list2;
                    goto label_206;
                }
                catch(SQLiteException sQLiteException0) {
                    sQLiteDatabase1 = list2;
                    goto label_215;
                }
                catch(Throwable throwable0) {
                }
                list0 = list2;
                goto label_229;
                try {
                    while(true) {
                    label_89:
                        if(!((Cursor)sQLiteDatabase1).moveToNext()) {
                            sQLiteDatabase0 = sQLiteDatabase0;
                            goto label_185;
                        }
                        v2 = ((Cursor)sQLiteDatabase1).getLong(0);
                        int v4 = ((Cursor)sQLiteDatabase1).getInt(1);
                        arr_b = ((Cursor)sQLiteDatabase1).getBlob(2);
                        if(this.am().t(crie1)) {
                            String s = ((Cursor)sQLiteDatabase1).getString(3);
                            v5 = ((Cursor)sQLiteDatabase1).getLong(4);
                            list5 = s;
                            goto label_100;
                        }
                        break;
                    }
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_198;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_206;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_215;
                }
                catch(Throwable throwable0) {
                    goto label_195;
                }
                v5 = 0L;
                list5 = list2;
            label_100:
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase0;
                if(v4 == 0) {
                    try {
                        parcel0 = Parcel.obtain();
                        crie2 = crie1;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        goto label_197;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        goto label_205;
                    }
                    catch(SQLiteException sQLiteException0) {
                        goto label_214;
                    }
                    catch(Throwable throwable0) {
                        goto label_227;
                    }
                    try {
                        try {
                            parcel0.unmarshall(arr_b, 0, arr_b.length);
                            parcel0.setDataPosition(0);
                            eventParcel0 = (EventParcel)EventParcel.CREATOR.createFromParcel(parcel0);
                            goto label_114;
                        }
                        catch(batz unused_ex) {
                        }
                        this.aJ().c.a("Failed to load event from local database");
                    }
                    catch(Throwable throwable2) {
                        goto label_112;
                    }
                    try {
                        try {
                            parcel0.recycle();
                            sQLiteDatabase0 = sQLiteDatabase2;
                            crie1 = crie2;
                            goto label_89;
                        label_112:
                            parcel0.recycle();
                            throw throwable2;
                        label_114:
                            parcel0.recycle();
                            if(eventParcel0 != null) {
                                list1.add(new crip(eventParcel0, ((String)list5), v5));
                            }
                            sQLiteDatabase0 = sQLiteDatabase2;
                            crie1 = crie2;
                            goto label_89;
                        }
                        catch(SQLiteFullException sQLiteFullException0) {
                            goto label_197;
                        }
                        catch(SQLiteDatabaseLockedException unused_ex) {
                            goto label_205;
                        }
                        catch(SQLiteException sQLiteException0) {
                            goto label_214;
                        }
                        try {
                        label_118:
                            crie2 = crie1;
                            if(v4 == 1) {
                                parcel1 = Parcel.obtain();
                                goto label_121;
                            }
                            else {
                                goto label_136;
                            }
                        }
                        catch(SQLiteFullException sQLiteFullException0) {
                            sQLiteDatabase0 = sQLiteDatabase2;
                            goto label_198;
                        }
                        catch(SQLiteDatabaseLockedException unused_ex) {
                            sQLiteDatabase0 = sQLiteDatabase2;
                            goto label_206;
                        }
                        catch(SQLiteException sQLiteException0) {
                            sQLiteDatabase0 = sQLiteDatabase2;
                            goto label_215;
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_227;
                    }
                }
                else {
                    goto label_118;
                    try {
                        try {
                        label_121:
                            parcel1.unmarshall(arr_b, 0, arr_b.length);
                            parcel1.setDataPosition(0);
                            userAttributeParcel0 = (UserAttributeParcel)UserAttributeParcel.CREATOR.createFromParcel(parcel1);
                            goto label_132;
                        }
                        catch(batz unused_ex) {
                        }
                        this.aJ().c.a("Failed to load user property from local database");
                    }
                    catch(Throwable throwable3) {
                        goto label_130;
                    }
                    try {
                        parcel1.recycle();
                        userAttributeParcel0 = list2;
                        goto label_133;
                    label_130:
                        parcel1.recycle();
                        throw throwable3;
                    label_132:
                        parcel1.recycle();
                    label_133:
                        if(userAttributeParcel0 != null) {
                            list1.add(new crip(userAttributeParcel0, ((String)list5), v5));
                            sQLiteDatabase0 = sQLiteDatabase2;
                            crie1 = crie2;
                            goto label_89;
                        label_136:
                            if(v4 == 2) {
                                parcel2 = Parcel.obtain();
                                goto label_138;
                            }
                            else {
                                goto label_161;
                            }
                        }
                        sQLiteDatabase0 = sQLiteDatabase2;
                        crie1 = crie2;
                        goto label_89;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        sQLiteDatabase0 = sQLiteDatabase2;
                        goto label_198;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        sQLiteDatabase0 = sQLiteDatabase2;
                        goto label_206;
                    }
                    catch(SQLiteException sQLiteException0) {
                        sQLiteDatabase0 = sQLiteDatabase2;
                        goto label_215;
                    }
                    catch(Throwable throwable0) {
                        goto label_227;
                    }
                    try {
                        try {
                        label_138:
                            parcel2.unmarshall(arr_b, 0, arr_b.length);
                            parcel2.setDataPosition(0);
                            conditionalUserPropertyParcel0 = (ConditionalUserPropertyParcel)ConditionalUserPropertyParcel.CREATOR.createFromParcel(parcel2);
                            goto label_149;
                        }
                        catch(batz unused_ex) {
                        }
                        this.aJ().c.a("Failed to load conditional user property from local database");
                    }
                    catch(Throwable throwable4) {
                        goto label_147;
                    }
                    try {
                        try {
                            parcel2.recycle();
                            conditionalUserPropertyParcel0 = list2;
                            goto label_150;
                        label_147:
                            parcel2.recycle();
                            throw throwable4;
                        label_149:
                            parcel2.recycle();
                        label_150:
                            if(conditionalUserPropertyParcel0 != null) {
                                list1.add(new crip(conditionalUserPropertyParcel0, ((String)list5), v5));
                                sQLiteDatabase0 = sQLiteDatabase2;
                                crie1 = crie2;
                                goto label_89;
                            }
                            sQLiteDatabase0 = sQLiteDatabase2;
                            crie1 = crie2;
                            goto label_89;
                        }
                        catch(SQLiteFullException sQLiteFullException0) {
                            sQLiteDatabase0 = sQLiteDatabase2;
                            goto label_198;
                        }
                        catch(SQLiteDatabaseLockedException unused_ex) {
                            sQLiteDatabase0 = sQLiteDatabase2;
                            goto label_206;
                        }
                        catch(SQLiteException sQLiteException0) {
                            sQLiteDatabase0 = sQLiteDatabase2;
                            goto label_215;
                        }
                        try {
                        label_161:
                            switch(v4) {
                                case 3: {
                                    this.aJ().k.a("Skipping app launch break");
                                    sQLiteDatabase0 = sQLiteDatabase2;
                                    crie1 = crie2;
                                    goto label_89;
                                }
                                case 4: {
                                    parcel3 = Parcel.obtain();
                                    break;
                                }
                                default: {
                                    this.aJ().c.a("Unknown record type in local database");
                                    sQLiteDatabase0 = sQLiteDatabase2;
                                    crie1 = crie2;
                                    goto label_89;
                                }
                            }
                        }
                        catch(SQLiteFullException sQLiteFullException0) {
                            goto label_197;
                        }
                        catch(SQLiteDatabaseLockedException unused_ex) {
                            goto label_205;
                        }
                        catch(SQLiteException sQLiteException0) {
                            goto label_214;
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_227;
                    }
                    try {
                        try {
                            parcel3.unmarshall(arr_b, 0, arr_b.length);
                            parcel3.setDataPosition(0);
                            eventParams0 = (EventParams)EventParams.CREATOR.createFromParcel(parcel3);
                            goto label_178;
                        }
                        catch(batz unused_ex) {
                        }
                        this.aJ().c.a("Failed to load default event parameters from local database");
                    }
                    catch(Throwable throwable5) {
                        goto label_176;
                    }
                    try {
                        parcel3.recycle();
                        eventParams0 = list2;
                        goto label_179;
                    label_176:
                        parcel3.recycle();
                        throw throwable5;
                    label_178:
                        parcel3.recycle();
                    label_179:
                        if(eventParams0 != null) {
                            list1.add(new crip(eventParams0, ((String)list5), v5));
                        }
                        sQLiteDatabase0 = sQLiteDatabase2;
                        crie1 = crie2;
                        goto label_89;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        goto label_197;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        goto label_205;
                    }
                    catch(SQLiteException sQLiteException0) {
                        goto label_214;
                    }
                    catch(Throwable throwable0) {
                        goto label_227;
                    }
                }
                sQLiteDatabase0 = sQLiteDatabase2;
                crie1 = crie2;
                goto label_89;
                try {
                label_185:
                    if(sQLiteDatabase0.delete("messages", "rowid <= ?", new String[]{Long.toString(v2)}) < list1.size()) {
                        this.aJ().c.a("Fewer entries removed from local database than expected");
                    }
                    sQLiteDatabase0.setTransactionSuccessful();
                    sQLiteDatabase0.endTransaction();
                    goto label_234;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_206;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_215;
                }
                catch(Throwable throwable0) {
                    goto label_195;
                }
                try {
                    goto label_198;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                label_197:
                    sQLiteDatabase0 = sQLiteDatabase2;
                    try {
                    label_198:
                        this.aJ().c.b("Error reading entries from local database", sQLiteFullException0);
                        this.c = true;
                        if(sQLiteDatabase1 != null) {
                            goto label_201;
                        }
                        goto label_202;
                    }
                    catch(Throwable throwable0) {
                        goto label_195;
                    }
                label_201:
                    ((Cursor)sQLiteDatabase1).close();
                label_202:
                    if(sQLiteDatabase0 != null) {
                        sQLiteDatabase0.close();
                    }
                    ++v1;
                    list0 = list2;
                    continue;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                label_205:
                    sQLiteDatabase0 = sQLiteDatabase2;
                    try {
                    label_206:
                        SystemClock.sleep(v);
                        v += 20;
                        if(sQLiteDatabase1 != null) {
                            goto label_209;
                        }
                        goto label_210;
                    }
                    catch(Throwable throwable0) {
                        goto label_195;
                    }
                label_209:
                    ((Cursor)sQLiteDatabase1).close();
                label_210:
                    if(sQLiteDatabase0 != null) {
                        sQLiteDatabase0.close();
                    }
                    ++v1;
                    list0 = list2;
                    continue;
                }
                catch(SQLiteException sQLiteException0) {
                label_214:
                    sQLiteDatabase0 = sQLiteDatabase2;
                    try {
                    label_215:
                        if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                            sQLiteDatabase0.endTransaction();
                        }
                        this.aJ().c.b("Error reading entries from local database", sQLiteException0);
                        this.c = true;
                        if(sQLiteDatabase1 != null) {
                            goto label_220;
                        }
                        goto label_221;
                    }
                    catch(Throwable throwable0) {
                        goto label_195;
                    }
                label_220:
                    ((Cursor)sQLiteDatabase1).close();
                label_221:
                    if(sQLiteDatabase0 != null) {
                        sQLiteDatabase0.close();
                    }
                    ++v1;
                    list0 = list2;
                    continue;
                }
                catch(Throwable throwable0) {
                label_227:
                    sQLiteDatabase0 = sQLiteDatabase2;
                }
            label_195:
                list0 = sQLiteDatabase1;
            label_229:
                if(list0 != null) {
                    ((Cursor)list0).close();
                }
                if(sQLiteDatabase0 != null) {
                    sQLiteDatabase0.close();
                }
                throw throwable0;
            label_234:
                if(sQLiteDatabase1 != null) {
                    ((Cursor)sQLiteDatabase1).close();
                }
                sQLiteDatabase0.close();
                return list1;
            }
            this.aJ().f.a("Failed to read events from database in reasonable time");
            return list0;
        }
        return list1;
    }

    public final void v() {
        SQLiteDatabase sQLiteDatabase0;
        this.n();
        this.m();
        if(!this.c && this.s()) {
            int v = 5;
            int v1 = 0;
            while(v1 < 5) {
                try {
                    try {
                        sQLiteDatabase0 = null;
                        sQLiteDatabase0 = this.q();
                        if(sQLiteDatabase0 == null) {
                            this.c = true;
                            return;
                        }
                        sQLiteDatabase0.beginTransaction();
                        sQLiteDatabase0.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabase0.setTransactionSuccessful();
                        sQLiteDatabase0.endTransaction();
                        goto label_40;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        goto label_22;
                    }
                    catch(SQLiteException sQLiteException0) {
                        goto label_28;
                    }
                    this.aJ().c.b("Error deleting app launch break from local database", sQLiteFullException0);
                    this.c = true;
                    if(sQLiteDatabase0 != null) {
                        goto label_20;
                    }
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    goto label_38;
                }
            label_20:
                sQLiteDatabase0.close();
                goto label_35;
                try {
                label_22:
                    SystemClock.sleep(v);
                    v += 20;
                    if(sQLiteDatabase0 != null) {
                        goto label_25;
                    }
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    goto label_38;
                }
            label_25:
                sQLiteDatabase0.close();
                goto label_35;
                try {
                label_28:
                    if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                        sQLiteDatabase0.endTransaction();
                    }
                    this.aJ().c.b("Error deleting app launch break from local database", sQLiteException0);
                    this.c = true;
                    if(sQLiteDatabase0 != null) {
                        goto label_34;
                    }
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    goto label_38;
                }
            label_34:
                sQLiteDatabase0.close();
            label_35:
                ++v1;
                continue;
            label_38:
                TWR.safeClose$NT(sQLiteDatabase0, throwable0);
                throw throwable0;
            label_40:
                sQLiteDatabase0.close();
                return;
            }
            this.aJ().f.a("Error deleting app launch break from local database in reasonable time");
        }
    }
}

