import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.TWR;

final class crdg extends crqc {
    public static final String[] a;
    static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public final crpu l;
    private final crdf n;

    static {
        crdg.a = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
        crdg.b = new String[]{"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
        crdg.c = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
        crdg.d = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
        crdg.e = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
        crdg.f = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
        crdg.g = new String[]{"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        crdg.h = new String[]{"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
        crdg.i = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
        crdg.j = new String[]{"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
        crdg.k = new String[]{"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    }

    public crdg(crqq crqq0) {
        super(crqq0);
        this.l = new crpu();
        this.n = new crdf(this, this.aj());
    }

    public final List A(String s, String s1, String s2) {
        String s6;
        Object object0;
        String s4;
        crdg crdg0;
        StringBuilder stringBuilder0;
        String s3;
        ArrayList arrayList0;
        batl.q(s);
        this.n();
        this.aA();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            try {
                arrayList0 = new ArrayList(3);
                s3 = s;
                arrayList0.add(s3);
                stringBuilder0 = new StringBuilder("app_id=?");
                if(TextUtils.isEmpty(s1)) {
                    goto label_19;
                }
                else {
                    goto label_15;
                }
                goto label_20;
            }
            catch(SQLiteException sQLiteException0) {
                crdg0 = this;
                s4 = s1;
                goto label_50;
            }
            try {
            label_15:
                s4 = s1;
                arrayList0.add(s4);
                stringBuilder0.append(" and origin=?");
                goto label_20;
            label_19:
                s4 = s1;
            label_20:
                if(!TextUtils.isEmpty(s2)) {
                    arrayList0.add(s2 + "*");
                    stringBuilder0.append(" and name glob ?");
                }
                cursor0 = this.g().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, stringBuilder0.toString(), ((String[])arrayList0.toArray(new String[arrayList0.size()])), null, null, "rowid", "1001");
                if(cursor0.moveToFirst()) {
                    while(true) {
                        if(list0.size() >= 1000) {
                            this.aJ().c.b("Read more than the max allowed user properties, ignoring excess", Integer.valueOf(1000));
                            break;
                        }
                        String s5 = cursor0.getString(0);
                        long v = cursor0.getLong(1);
                        crdg0 = this;
                        try {
                            object0 = crdg0.t(cursor0, 2);
                            s6 = cursor0.getString(3);
                        }
                        catch(SQLiteException sQLiteException0) {
                            goto label_50;
                        }
                        if(object0 == null) {
                            try {
                                crdg0.aJ().c.d("(2)Read invalid user property value, ignoring it", crji.a(s3), s6, s2);
                                goto label_40;
                            label_39:
                                list0.add(new crqv(s3, s6, s5, v, object0));
                            label_40:
                                if(!cursor0.moveToNext()) {
                                    break;
                                }
                                goto label_45;
                            }
                            catch(SQLiteException sQLiteException0) {
                            }
                            goto label_43;
                        }
                        else {
                            goto label_39;
                        }
                        goto label_40;
                    label_43:
                        s4 = s6;
                        goto label_50;
                    label_45:
                        s3 = s;
                        s4 = s6;
                    }
                }
                goto label_56;
            }
            catch(SQLiteException sQLiteException0) {
                crdg0 = this;
            }
        label_50:
            crdg0.aJ().c.d("(2)Error querying user properties", crji.a(s), s4, sQLiteException0);
            list0 = Collections.EMPTY_LIST;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_56:
        if(cursor0 != null) {
            cursor0.close();
        }
        return list0;
    }

    public final void B(String s, Long long0, String s1, Bundle bundle0) {
        Bundle bundle3;
        crsu crsu0;
        Cursor cursor1;
        Cursor cursor0;
        crdg crdg0 = this;
        String s2 = s;
        batl.s(bundle0);
        crdg0.n();
        crdg0.aA();
        crde crde0 = long0 == null ? new crde(crdg0, s2) : new crde(crdg0, s2, ((long)long0));
        List list0 = crde0.a();
        while(!list0.isEmpty()) {
            Iterator iterator0 = list0.iterator();
        label_9:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                crdd crdd0 = (crdd)object0;
                if(!TextUtils.isEmpty(s1)) {
                    try {
                        cursor0 = null;
                        cursor1 = crdg0.g().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{s2, Long.toString(crdd0.b)}, null, null, "rowid", "2");
                        goto label_19;
                    }
                    catch(SQLiteException sQLiteException0) {
                        crsu0 = null;
                        goto label_38;
                        try {
                        label_19:
                            if(cursor1.moveToFirst()) {
                                byte[] arr_b = cursor1.getBlob(0);
                                try {
                                    crsu0 = (crsu)((ProtoLiteBuilder)(((crst)crqt.o(((Builder)(((crst)((ProtoLiteMessage)crsu.a).v_newBuilder()))), arr_b)))).N_build();
                                    goto label_32;
                                }
                                catch(IOException iOException0) {
                                    crdg0.aJ().c.c("Data loss. Failed to merge raw event metadata. appId", crji.a(s2), iOException0);
                                    goto label_27;
                                }
                            }
                            else {
                                crdg0.aJ().c.b("Raw event metadata record is missing. appId", crji.a(s2));
                                goto label_27;
                            }
                            goto label_51;
                        }
                        catch(SQLiteException sQLiteException0) {
                            goto label_30;
                        }
                        catch(Throwable throwable0) {
                            goto label_47;
                        }
                    label_27:
                        cursor1.close();
                        goto label_51;
                    label_30:
                        crsu0 = null;
                        goto label_37;
                        try {
                        label_32:
                            if(cursor1.moveToNext()) {
                                crdg0.aJ().f.b("Get multiple raw event metadata records, expected one. appId", crji.a(s2));
                            }
                            cursor1.close();
                            goto label_49;
                        }
                        catch(SQLiteException sQLiteException0) {
                        }
                        catch(Throwable throwable0) {
                            goto label_47;
                        }
                    label_37:
                        cursor0 = cursor1;
                        try {
                        label_38:
                            crdg0.aJ().c.c("Data loss. Error selecting raw event. appId", crji.a(s2), sQLiteException0);
                            goto label_43;
                        }
                        catch(Throwable throwable0) {
                        }
                        goto label_41;
                    }
                    catch(Throwable throwable0) {
                    label_41:
                        TWR.safeClose$NT(cursor0, throwable0);
                        throw throwable0;
                    }
                label_43:
                    if(cursor0 != null) {
                        cursor0.close();
                        goto label_50;
                    label_47:
                        TWR.safeClose$NT(cursor1, throwable0);
                        throw throwable0;
                    label_49:
                        cursor1.close();
                    }
                label_50:
                    cursor0 = crsu0;
                label_51:
                    if(cursor0 != null) {
                        for(Object object1: cursor0.f) {
                            if(((crtg)object1).d.equals(s1)) {
                                continue label_9;
                            }
                        }
                    }
                }
                crqt crqt0 = crdg0.aw();
                crso crso0 = crdd0.d;
                Bundle bundle1 = new Bundle();
                for(Object object2: crso0.c) {
                    crsq crsq0 = (crsq)object2;
                    int v = crsq0.b;
                    if((v & 16) != 0) {
                        bundle1.putDouble(crsq0.c, crsq0.g);
                    }
                    else if((v & 8) != 0) {
                        bundle1.putFloat(crsq0.c, crsq0.f);
                    }
                    else if((v & 4) != 0) {
                        bundle1.putLong(crsq0.c, crsq0.e);
                    }
                    else if((v & 2) != 0) {
                        bundle1.putString(crsq0.c, crsq0.d);
                    }
                    else if(crsq0.h.isEmpty()) {
                        crqt0.aJ().c.b("Unexpected parameter type for parameter", crsq0);
                    }
                    else {
                        bundle1.putParcelableArray(crsq0.c, crqt.z(crsq0.h));
                    }
                }
                String s3 = bundle1.getString("_o");
                bundle1.remove("_o");
                String s4 = crso0.d;
                if(s3 == null) {
                    s3 = "";
                }
                crjj crjj0 = new crjj(s4, s3, bundle1, crso0.e, 0L);
                crqx crqx0 = crdg0.aq();
                Bundle bundle2 = crjj0.e;
                if(crjj0.a.equals("_cmp")) {
                    bundle3 = new Bundle(bundle0);
                    for(Object object3: bundle0.keySet()) {
                        String s5 = (String)object3;
                        if(s5.startsWith("gad_")) {
                            bundle3.remove(s5);
                        }
                    }
                }
                else {
                    bundle3 = bundle0;
                }
                crqx0.I(bundle2, bundle3);
                crdm crdm0 = new crdm(crdg0.y, crjj0.b, s2, crso0.d, crso0.e, crso0.f, bundle2);
                this.n();
                this.aA();
                String s6 = crdm0.a;
                batl.q(s6);
                byte[] arr_b1 = this.aw().l(crdm0).toBytesArray();
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("app_id", s6);
                contentValues0.put("name", crdm0.b);
                contentValues0.put("timestamp", Long.valueOf(crdm0.d));
                contentValues0.put("metadata_fingerprint", Long.valueOf(crdd0.b));
                contentValues0.put("data", arr_b1);
                contentValues0.put("realtime", Integer.valueOf(((int)crdd0.c)));
                try {
                    long v1 = (long)this.g().update("raw_events", contentValues0, "rowid = ?", new String[]{String.valueOf(crdd0.a)});
                    if(v1 != 1L) {
                        this.aJ().c.c("Failed to update raw event. appId, updatedRows", crji.a(s6), Long.valueOf(v1));
                    }
                }
                catch(SQLiteException sQLiteException1) {
                    this.aJ().c.c("Error updating raw event. appId", crji.a(crdm0.a), sQLiteException1);
                }
                crdg0 = this;
                s2 = s;
            }
            list0 = crde0.a();
            crdg0 = this;
            s2 = s;
        }
    }

    public final void C() {
        this.aA();
        this.g().beginTransaction();
    }

    final void D(String s) {
        this.aA();
        this.n();
        batl.q(s);
        try {
            SQLiteDatabase sQLiteDatabase0 = this.g();
            String[] arr_s = {s};
            int v = sQLiteDatabase0.delete("events", "app_id=?", arr_s) + sQLiteDatabase0.delete("user_attributes", "app_id=?", arr_s) + sQLiteDatabase0.delete("conditional_properties", "app_id=?", arr_s) + sQLiteDatabase0.delete("apps", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events_metadata", "app_id=?", arr_s) + sQLiteDatabase0.delete("event_filters", "app_id=?", arr_s) + sQLiteDatabase0.delete("property_filters", "app_id=?", arr_s) + sQLiteDatabase0.delete("audience_filter_values", "app_id=?", arr_s) + sQLiteDatabase0.delete("consent_settings", "app_id=?", arr_s) + sQLiteDatabase0.delete("default_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("trigger_uris", "app_id=?", arr_s);
            if(v > 0) {
                this.aJ().k.c("Deleted application data. app, records", s, Integer.valueOf(v));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error deleting application data. appId, error", crji.a(s), sQLiteException0);
        }
    }

    final void E(String s) {
        this.aF("events_snapshot", s);
    }

    public final void F(String s) {
        this.E(s);
        List list0 = Collections.singletonList("name");
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = this.g().query("events", ((String[])list0.toArray(new String[0])), "app_id=?", new String[]{s}, null, null, null);
                if(cursor0.moveToFirst()) {
                    do {
                        String s1 = cursor0.getString(0);
                        if(s1 != null) {
                            crdn crdn0 = this.o(s, s1);
                            if(crdn0 != null) {
                                this.aG("events_snapshot", crdn0);
                            }
                        }
                    }
                    while(cursor0.moveToNext());
                }
            }
            catch(SQLiteException sQLiteException0) {
                this.aJ().c.c("Error creating snapshot. appId", crji.a(s), sQLiteException0);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
    }

    public final void G(List list0) {
        batl.s(list0);
        this.n();
        this.aA();
        StringBuilder stringBuilder0 = new StringBuilder("rowid in (");
        for(int v = 0; v < list0.size(); ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(((Long)list0.get(v)).longValue());
        }
        stringBuilder0.append(")");
        int v1 = this.g().delete("raw_events", stringBuilder0.toString(), null);
        if(v1 != list0.size()) {
            this.aJ().c.c("Deleted fewer rows from raw events table than expected", Integer.valueOf(v1), Integer.valueOf(list0.size()));
        }
    }

    public final void H(String s) {
        SQLiteDatabase sQLiteDatabase0 = this.g();
        try {
            sQLiteDatabase0.execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{s, s});
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Failed to remove unused event metadata. appId", crji.a(s), sQLiteException0);
        }
    }

    public final void I(Long long0) {
        this.n();
        this.aA();
        SQLiteDatabase sQLiteDatabase0 = this.g();
        try {
            if(sQLiteDatabase0.delete("upload_queue", "rowid=?", new String[]{long0.toString()}) != 1) {
                this.aJ().f.a("Deleted fewer rows from upload_queue than expected");
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.b("Failed to delete a MeasurementBatch in a upload_queue table", sQLiteException0);
            throw sQLiteException0;
        }
    }

    public final void J() {
        this.aA();
        this.g().endTransaction();
    }

    final void K(Long long0) {
        this.n();
        this.aA();
        if(!this.W()) {
            return;
        }
        if(this.e(a.i(long0, "SELECT COUNT(1) FROM upload_queue WHERE rowid = ", " AND retry_count =  2147483647 LIMIT 1"), null) > 0L) {
            this.aJ().f.a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            this.g().execSQL("UPDATE upload_queue" + a.u(System.currentTimeMillis(), " SET retry_count = retry_count + 1, last_upload_timestamp = ") + " WHERE rowid = " + long0 + " AND retry_count < 2147483647");
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.b("Error incrementing retry count. error", sQLiteException0);
        }
    }

    final void L() {
        this.n();
        this.aA();
        if(this.W()) {
            long v = SystemClock.elapsedRealtime();
            if(Math.abs(v - this.av().a.a()) > crcu.G()) {
                this.av().a.b(v);
                this.n();
                this.aA();
                if(this.W()) {
                    int v1 = this.g().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(crcu.D())});
                    if(v1 > 0) {
                        this.aJ().k.b("Deleted stale rows. rowsDeleted", Integer.valueOf(v1));
                    }
                }
            }
        }
    }

    public final void M(String s, String s1) {
        batl.q(s);
        batl.q(s1);
        this.n();
        this.aA();
        try {
            this.g().delete("user_attributes", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.d("Error deleting user property. appId", crji.a(s), this.ao().e(s1), sQLiteException0);
        }
    }

    public final void N(String s) {
        boolean z;
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{"name", "lifetime_count"}));
        crdn crdn0 = this.o(s, "_f");
        crdn crdn1 = this.o(s, "_v");
        this.aF("events", s);
        Cursor cursor0 = null;
        int v = 0;
        try {
            cursor0 = this.g().query("events_snapshot", ((String[])arrayList0.toArray(new String[0])), "app_id=?", new String[]{s}, null, null, null);
            if(cursor0.moveToFirst()) {
                goto label_22;
            }
            else {
                goto label_15;
            }
            goto label_62;
        }
        catch(SQLiteException sQLiteException0) {
            z = false;
            goto label_39;
        }
        catch(Throwable throwable0) {
            z = false;
            goto label_46;
        }
    label_15:
        cursor0.close();
        if(crdn0 != null) {
            this.Q(crdn0);
            goto label_62;
        label_22:
            int v1 = 0;
            z = false;
            try {
                do {
                    String s1 = cursor0.getString(0);
                    if(cursor0.getLong(1) >= 1L) {
                        if("_f".equals(s1)) {
                            v1 = 1;
                        }
                        else if("_v".equals(s1)) {
                            z = true;
                        }
                    }
                    if(s1 != null) {
                        crdn crdn2 = this.aD("events_snapshot", s, s1);
                        if(crdn2 != null) {
                            this.Q(crdn2);
                        }
                    }
                }
                while(cursor0.moveToNext());
                goto label_55;
            }
            catch(SQLiteException sQLiteException0) {
                v = v1;
                try {
                label_39:
                    this.aJ().c.c("Error querying snapshot. appId", crji.a(s), sQLiteException0);
                    v1 = v;
                    goto label_55;
                }
                catch(Throwable throwable0) {
                }
            }
            catch(Throwable throwable0) {
                v = v1;
            }
        label_46:
            if(cursor0 != null) {
                cursor0.close();
            }
            if(v == 0 && crdn0 != null) {
                this.Q(crdn0);
            }
            else if(!z && crdn1 != null) {
                this.Q(crdn1);
            }
            this.E(s);
            throw throwable0;
        label_55:
            if(cursor0 != null) {
                cursor0.close();
            }
            if(v1 == 0 && crdn0 != null) {
                this.Q(crdn0);
            }
            else if(!z && crdn1 != null) {
                this.Q(crdn1);
            }
        }
        else if(crdn1 != null) {
            this.Q(crdn1);
        }
    label_62:
        this.E(s);
    }

    public final void O() {
        this.aA();
        this.g().setTransactionSuccessful();
    }

    public final void P(crca crca0) {
        this.ah(crca0, false);
    }

    public final void Q(crdn crdn0) {
        this.aG("events", crdn0);
    }

    public final void R(String s, crmb crmb0) {
        batl.s(s);
        this.n();
        this.aA();
        this.S(s, this.q(s));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("storage_consent_at_bundling", crmb0.n());
        this.ai(contentValues0);
    }

    public final void S(String s, crmb crmb0) {
        batl.s(s);
        batl.s(crmb0);
        this.n();
        this.aA();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("consent_state", crmb0.n());
        contentValues0.put("consent_source", Integer.valueOf(crmb0.c));
        this.ai(contentValues0);
    }

    public final boolean T(String s) {
        ArrayList arrayList0 = new ArrayList(1);
        arrayList0.add(Integer.valueOf(crnq.b.g));
        return this.e("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?" + crdg.aH(arrayList0) + " AND NOT " + this.aE(), new String[]{s}) != 0L;
    }

    public final boolean U(String s, String s1) {
        return this.e("select count(1) from raw_events where app_id = ? and name = ?", new String[]{s, s1}) > 0L;
    }

    public final boolean V(crdm crdm0, long v, boolean z) {
        this.n();
        this.aA();
        String s = crdm0.a;
        batl.q(s);
        byte[] arr_b = this.aw().l(crdm0).toBytesArray();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("name", crdm0.b);
        contentValues0.put("timestamp", Long.valueOf(crdm0.d));
        contentValues0.put("metadata_fingerprint", Long.valueOf(v));
        contentValues0.put("data", arr_b);
        contentValues0.put("realtime", Integer.valueOf(((int)z)));
        try {
            if(this.g().insert("raw_events", null, contentValues0) == -1L) {
                this.aJ().c.b("Failed to insert raw event (got -1). appId", crji.a(s));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error storing raw event. appId", crji.a(crdm0.a), sQLiteException0);
            return false;
        }
    }

    protected final boolean W() {
        return this.aj().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean X(ConditionalUserPropertyParcel conditionalUserPropertyParcel0) {
        this.n();
        this.aA();
        String s = conditionalUserPropertyParcel0.a;
        batl.s(s);
        if(this.s(s, conditionalUserPropertyParcel0.c.b) == null && this.e("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{s}) >= 1000L) {
            return false;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("origin", conditionalUserPropertyParcel0.b);
        contentValues0.put("name", conditionalUserPropertyParcel0.c.b);
        Object object0 = conditionalUserPropertyParcel0.c.a();
        batl.s(object0);
        crdg.af(contentValues0, object0);
        contentValues0.put("active", Boolean.valueOf(conditionalUserPropertyParcel0.e));
        contentValues0.put("trigger_event_name", conditionalUserPropertyParcel0.f);
        contentValues0.put("trigger_timeout", Long.valueOf(conditionalUserPropertyParcel0.h));
        contentValues0.put("timed_out_event", this.aq().ag(conditionalUserPropertyParcel0.g));
        contentValues0.put("creation_timestamp", Long.valueOf(conditionalUserPropertyParcel0.d));
        contentValues0.put("triggered_event", this.aq().ag(conditionalUserPropertyParcel0.i));
        contentValues0.put("triggered_timestamp", Long.valueOf(conditionalUserPropertyParcel0.c.c));
        contentValues0.put("time_to_live", Long.valueOf(conditionalUserPropertyParcel0.j));
        contentValues0.put("expired_event", this.aq().ag(conditionalUserPropertyParcel0.k));
        try {
            if(this.g().insertWithOnConflict("conditional_properties", null, contentValues0, 5) == -1L) {
                this.aJ().c.b("Failed to insert/update conditional user property (got -1)", crji.a(s));
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error storing conditional user property", crji.a(s), sQLiteException0);
        }
        return true;
    }

    public final boolean Y(crqv crqv0) {
        this.n();
        this.aA();
        String s = crqv0.a;
        String s1 = crqv0.c;
        if(this.s(s, s1) == null) {
            if(crqx.ad(s1)) {
                if(this.e("select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{s}) >= ((long)this.am().g(s, crif.U, 25, 100))) {
                    return false;
                }
            }
            else if(!"_npa".equals(s1) && this.e("select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'", new String[]{s, crqv0.b}) >= 25L) {
                return false;
            }
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("origin", crqv0.b);
        contentValues0.put("name", s1);
        contentValues0.put("set_timestamp", Long.valueOf(crqv0.d));
        crdg.af(contentValues0, crqv0.e);
        try {
            if(this.g().insertWithOnConflict("user_attributes", null, contentValues0, 5) == -1L) {
                this.aJ().c.b("Failed to insert/update user property (got -1). appId", crji.a(s));
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error storing user property. appId", crji.a(crqv0.a), sQLiteException0);
        }
        return true;
    }

    public final void Z(String s, long v, long v1, crqn crqn0) {
        int v11;
        crsn crsn0;
        Cursor cursor5;
        String[] arr_s2;
        String[] arr_s3;
        String s8;
        String s7;
        Cursor cursor4;
        crsu crsu0;
        Cursor cursor3;
        String s6;
        String s5;
        Cursor cursor2;
        String s4;
        String s2;
        Cursor cursor1;
        long v2;
        String s1;
        SQLiteDatabase sQLiteDatabase0;
        this.n();
        this.aA();
        Cursor cursor0 = null;
        try {
            sQLiteDatabase0 = this.g();
            s1 = "";
            v2 = -1L;
            if(TextUtils.isEmpty(s)) {
                int v3 = Long.compare(v1, -1L);
                String[] arr_s = v3 == 0 ? new String[]{String.valueOf(v)} : new String[]{String.valueOf(v1), String.valueOf(v)};
                if(v3 != 0) {
                    s1 = "rowid <= ? and ";
                }
                cursor1 = sQLiteDatabase0.rawQuery(a.a(s1, "select app_id, metadata_fingerprint from raw_events where ", "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"), arr_s);
                goto label_12;
            }
            else {
                goto label_27;
            }
            goto label_206;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_32;
        }
        catch(Throwable throwable0) {
            goto label_199;
        }
        try {
        label_12:
            if(cursor1.moveToFirst()) {
                s2 = cursor1.getString(0);
                goto label_18;
            }
            goto label_206;
        }
        catch(SQLiteException sQLiteException0) {
            String s3 = s;
            goto label_194;
            try {
            label_18:
                s4 = cursor1.getString(1);
                cursor1.close();
                cursor2 = cursor1;
                s5 = s2;
                goto label_54;
            }
            catch(SQLiteException sQLiteException0) {
            }
            catch(Throwable throwable0) {
                goto label_202;
            }
            cursor0 = cursor1;
            s3 = s2;
            goto label_195;
            try {
            label_27:
                int v4 = Long.compare(v1, -1L);
                if(v4 == 0) {
                    goto label_36;
                }
                else {
                    s6 = s;
                    goto label_34;
                }
                goto label_38;
            }
            catch(SQLiteException sQLiteException0) {
            label_32:
                s6 = s;
                goto label_52;
                try {
                label_34:
                    String[] arr_s1 = {s6, String.valueOf(v1)};
                    goto label_38;
                label_36:
                    s6 = s;
                    arr_s1 = new String[]{s6};
                label_38:
                    if(v4 != 0) {
                        s1 = " and rowid <= ?";
                    }
                    cursor1 = sQLiteDatabase0.rawQuery(a.a(s1, "select metadata_fingerprint from raw_events where app_id = ?", " order by rowid limit 1;"), arr_s1);
                    goto label_44;
                }
                catch(SQLiteException sQLiteException0) {
                }
                catch(Throwable throwable0) {
                    goto label_199;
                }
                goto label_52;
                try {
                label_44:
                    if(cursor1.moveToFirst()) {
                        s4 = cursor1.getString(0);
                        cursor1.close();
                        cursor2 = cursor1;
                        s5 = s6;
                        goto label_54;
                    }
                    goto label_206;
                }
                catch(SQLiteException sQLiteException0) {
                }
                catch(Throwable throwable0) {
                    goto label_202;
                }
                cursor0 = cursor1;
            label_52:
                s3 = s6;
                goto label_195;
                try {
                label_54:
                    cursor3 = sQLiteDatabase0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{s5, s4}, null, null, "rowid", "2");
                }
                catch(SQLiteException sQLiteException0) {
                    s3 = s5;
                    cursor0 = cursor2;
                    goto label_195;
                }
                catch(Throwable throwable0) {
                    cursor0 = cursor2;
                    goto label_203;
                }
                try {
                    if(cursor3.moveToFirst()) {
                        byte[] arr_b = cursor3.getBlob(0);
                        try {
                            crsu0 = (crsu)((ProtoLiteBuilder)(((crst)crqt.o(((Builder)(((crst)((ProtoLiteMessage)crsu.a).v_newBuilder()))), arr_b)))).N_build();
                            goto label_76;
                        }
                        catch(IOException iOException0) {
                        }
                        goto label_71;
                    }
                    else {
                        this.aJ().c.b("Raw event metadata record is missing. appId", crji.a(s5));
                        cursor4 = cursor3;
                        goto label_74;
                    }
                    goto label_206;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_85;
                }
                catch(Throwable throwable0) {
                    goto label_117;
                }
                try {
                label_71:
                    s3 = s5;
                    cursor4 = cursor3;
                    this.aJ().c.c("Data loss. Failed to merge raw event metadata. appId", crji.a(s3), iOException0);
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_127;
                }
                catch(Throwable throwable0) {
                    goto label_130;
                }
            label_74:
                cursor1 = cursor4;
                goto label_206;
                try {
                label_76:
                    if(cursor3.moveToNext()) {
                        this.aJ().f.b("Get multiple raw event metadata records, expected one. appId", crji.a(s5));
                    }
                    s7 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    cursor3.close();
                    batl.s(crsu0);
                    crqn0.a = crsu0;
                    if(this.am().t(crif.aS)) {
                        goto label_88;
                    }
                    else {
                        goto label_105;
                    }
                    goto label_122;
                }
                catch(SQLiteException sQLiteException0) {
                label_85:
                    s3 = s5;
                    cursor4 = cursor3;
                    goto label_127;
                    try {
                    label_88:
                        s8 = s5;
                        long v5 = this.f("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{s8, s4}, -1L);
                        if(v1 != -1L) {
                            v2 = v1;
                            goto label_94;
                        }
                        else if(v5 == -1L) {
                            arr_s3 = new String[]{s8, s4};
                            goto label_119;
                        label_105:
                            s8 = s5;
                            if(v1 == -1L) {
                                arr_s3 = new String[]{s8, s4};
                                goto label_119;
                            }
                            else {
                                arr_s2 = new String[]{s8, s4, String.valueOf(v1)};
                                cursor5 = cursor3;
                            }
                        }
                        else {
                        label_94:
                            int v6 = Long.compare(v2, -1L);
                            if(v6 != 0 && v5 != -1L) {
                                v5 = Math.min(v2, v5);
                            }
                            else if(v6 != 0) {
                                v5 = v2;
                            }
                            arr_s2 = new String[]{s8, s4, String.valueOf(v5)};
                            cursor5 = cursor3;
                        }
                        goto label_122;
                    }
                    catch(SQLiteException sQLiteException0) {
                    }
                    catch(Throwable throwable0) {
                        goto label_117;
                    }
                    cursor4 = cursor3;
                    s3 = s8;
                    goto label_127;
                }
                catch(Throwable throwable0) {
                label_117:
                    cursor4 = cursor3;
                    goto label_130;
                }
            label_119:
                cursor5 = cursor3;
                s7 = "app_id = ? and metadata_fingerprint = ?";
                arr_s2 = arr_s3;
                try {
                label_122:
                    cursor4 = cursor5;
                    s3 = s8;
                    cursor1 = sQLiteDatabase0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, s7, arr_s2, null, null, "rowid", null);
                    goto label_132;
                }
                catch(SQLiteException sQLiteException0) {
                label_127:
                    cursor0 = cursor4;
                    goto label_195;
                }
                catch(Throwable throwable0) {
                }
            label_130:
                cursor0 = cursor4;
                goto label_203;
                try {
                label_132:
                    if(cursor1.moveToFirst()) {
                        do {
                            long v7 = cursor1.getLong(0);
                            byte[] arr_b1 = cursor1.getBlob(3);
                            try {
                                crsn0 = (crsn)crqt.o(((Builder)(((crsn)((ProtoLiteMessage)crso.a).v_newBuilder()))), arr_b1);
                            }
                            catch(IOException iOException1) {
                                this.aJ().c.c("Data loss. Failed to merge raw event. appId", crji.a(s3), iOException1);
                                continue;
                            }
                            String s9 = cursor1.getString(1);
                            if(!crsn0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crsn0).ensureMutable();
                            }
                            crso crso0 = (crso)crsn0.b_message;
                            s9.getClass();
                            crso0.b |= 1;
                            crso0.d = s9;
                            long v8 = cursor1.getLong(2);
                            if(!crsn0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crsn0).ensureMutable();
                            }
                            crso crso1 = (crso)crsn0.b_message;
                            crso1.b |= 2;
                            crso1.e = v8;
                            crso crso2 = (crso)((ProtoLiteBuilder)crsn0).N_build();
                            batl.s(crso2);
                            if(crqn0.c == null) {
                                crqn0.c = new ArrayList();
                            }
                            if(crqn0.b == null) {
                                crqn0.b = new ArrayList();
                            }
                            if(!crqn0.c.isEmpty() && crqn.a(((crso)crqn0.c.get(0))) != crqn.a(crso2)) {
                                break;
                            }
                            long v9 = crqn0.d;
                            if(((ProtoLiteMessage)crso2).isImmutable()) {
                                v11 = ((ProtoLiteMessage)crso2).t(null);
                                if(v11 < 0) {
                                    throw new IllegalStateException("serialized size must be non-negative, was " + v11);
                                }
                            }
                            else {
                                int v10 = crso2.memoizedSerializedSize & 0x7FFFFFFF;
                                if(v10 == 0x7FFFFFFF) {
                                    v11 = ((ProtoLiteMessage)crso2).t(null);
                                    if(v11 < 0) {
                                        throw new IllegalStateException("serialized size must be non-negative, was " + v11);
                                    }
                                    crso2.memoizedSerializedSize = crso2.memoizedSerializedSize & 0x80000000 | v11;
                                }
                                else {
                                    v11 = v10;
                                }
                            }
                            long v12 = v9 + ((long)v11);
                            crqq crqq0 = crqn0.e;
                            if(!crqq0.n().t(crif.aN)) {
                                crqq0.n();
                                if(v12 < ((long)crcu.B())) {
                                    goto label_183;
                                }
                                break;
                            }
                            else if(!crqn0.c.isEmpty()) {
                                crqq0.n();
                                if(v12 >= ((long)crcu.B())) {
                                    break;
                                }
                            }
                        label_183:
                            crqn0.d = v12;
                            crqn0.c.add(crso2);
                            crqn0.b.add(Long.valueOf(v7));
                            int v13 = crqn0.c.size();
                            crqq0.n();
                            if(v13 >= Math.max(1, ((Integer)crif.k.a()).intValue())) {
                                break;
                            }
                        }
                        while(cursor1.moveToNext());
                    }
                    else {
                        this.aJ().f.b("Raw event data disappeared while in transaction. appId", crji.a(s3));
                    }
                    goto label_206;
                }
                catch(SQLiteException sQLiteException0) {
                }
                catch(Throwable throwable0) {
                    goto label_202;
                }
            label_194:
                cursor0 = cursor1;
                try {
                label_195:
                    this.aJ().c.c("Data loss. Error selecting raw event. appId", crji.a(s3), sQLiteException0);
                    cursor1 = cursor0;
                    goto label_206;
                }
                catch(Throwable throwable0) {
                }
                goto label_199;
            }
            catch(Throwable throwable0) {
            label_199:
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        }
        catch(Throwable throwable0) {
        label_202:
            cursor0 = cursor1;
        }
    label_203:
        if(cursor0 != null) {
            cursor0.close();
        }
        throw throwable0;
    label_206:
        if(cursor1 != null) {
            cursor1.close();
        }
    }

    private final crdn aD(String s, String s1, String s2) {
        crdn crdn0;
        Boolean boolean0;
        Cursor cursor0;
        boolean z;
        batl.q(s1);
        batl.q(s2);
        this.n();
        this.aA();
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"}));
        try {
            z = false;
            cursor0 = null;
            cursor0 = this.g().query(s, ((String[])arrayList0.toArray(new String[0])), "app_id=? and name=?", new String[]{s1, s2}, null, null, null);
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_34;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_12:
                if(cursor0.moveToFirst()) {
                    long v = cursor0.getLong(0);
                    long v1 = cursor0.getLong(1);
                    long v2 = cursor0.getLong(2);
                    long v3 = 0L;
                    long v4 = cursor0.isNull(3) ? 0L : cursor0.getLong(3);
                    Long long0 = cursor0.isNull(4) ? null : cursor0.getLong(4);
                    Long long1 = cursor0.isNull(5) ? null : cursor0.getLong(5);
                    Long long2 = cursor0.isNull(6) ? null : cursor0.getLong(6);
                    if(cursor0.isNull(7)) {
                        boolean0 = null;
                    }
                    else {
                        if(cursor0.getLong(7) == 1L) {
                            z = true;
                        }
                        boolean0 = Boolean.valueOf(z);
                    }
                    if(!cursor0.isNull(8)) {
                        v3 = cursor0.getLong(8);
                    }
                    crdn0 = new crdn(s1, s2, v, v1, v3, v2, v4, long0, long1, long2, boolean0);
                    if(cursor0.moveToNext()) {
                        this.aJ().c.b("Got multiple records for event aggregates, expected one. appId", crji.a(s1));
                    }
                    goto label_39;
                }
            }
            catch(SQLiteException sQLiteException0) {
            label_34:
                this.aJ().c.d("Error querying events. appId", crji.a(s1), this.ao().c(s2), sQLiteException0);
            }
            goto label_41;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_39:
        cursor0.close();
        return crdn0;
    label_41:
        if(cursor0 != null) {
            cursor0.close();
        }
        return null;
    }

    private final String aE() {
        Integer integer0 = (int)crnq.b.g;
        Long long0 = System.currentTimeMillis();
        return "(" + String.format(Locale.US, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", integer0, long0, ((Long)crif.R.a())) + " OR " + String.format(Locale.US, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", integer0, long0, crcu.D()) + ")";
    }

    private final void aF(String s, String s1) {
        batl.q(s1);
        this.n();
        this.aA();
        try {
            this.g().delete(s, "app_id=?", new String[]{s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error deleting snapshot. appId", crji.a(s1), sQLiteException0);
        }
    }

    private final void aG(String s, crdn crdn0) {
        batl.s(crdn0);
        this.n();
        this.aA();
        ContentValues contentValues0 = new ContentValues();
        String s1 = crdn0.a;
        contentValues0.put("app_id", s1);
        contentValues0.put("name", crdn0.b);
        contentValues0.put("lifetime_count", Long.valueOf(crdn0.c));
        contentValues0.put("current_bundle_count", Long.valueOf(crdn0.d));
        contentValues0.put("last_fire_timestamp", Long.valueOf(crdn0.f));
        contentValues0.put("last_bundled_timestamp", Long.valueOf(crdn0.g));
        contentValues0.put("last_bundled_day", crdn0.h);
        contentValues0.put("last_sampled_complex_event_id", crdn0.i);
        contentValues0.put("last_sampling_rate", crdn0.j);
        contentValues0.put("current_session_count", Long.valueOf(crdn0.e));
        contentValues0.put("last_exempt_from_sampling", (crdn0.k == null || !crdn0.k.booleanValue() ? null : ((long)1L)));
        try {
            if(this.g().insertWithOnConflict(s, null, contentValues0, 5) == -1L) {
                this.aJ().c.b("Failed to insert/update event aggregates (got -1). appId", crji.a(s1));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error storing event aggregates. appId", crji.a(crdn0.a), sQLiteException0);
        }
    }

    private static final String aH(List list0) {
        return list0.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list0));
    }

    @Override  // crqc
    protected final void aM() {
    }

    public final crdc aa(long v, String s, boolean z, boolean z1, boolean z2, boolean z3) {
        return this.l(v, s, 1L, false, false, z, false, z1, z2, z3);
    }

    public final void ab(crsu crsu0, boolean z) {
        byte[] arr_b1;
        this.n();
        this.aA();
        batl.s(crsu0);
        batl.q(crsu0.r);
        batl.l((crsu0.b & 8) != 0);
        this.L();
        long v = System.currentTimeMillis();
        if(crsu0.i < v - crcu.D() || crsu0.i > crcu.D() + v) {
            this.aJ().f.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", crji.a(crsu0.r), Long.valueOf(v), Long.valueOf(crsu0.i));
        }
        byte[] arr_b = crsu0.toBytesArray();
        try {
            arr_b1 = this.aw().y(arr_b);
        }
        catch(IOException iOException0) {
            this.aJ().c.c("Data loss. Failed to serialize bundle. appId", crji.a(crsu0.r), iOException0);
            return;
        }
        this.aJ().k.b("Saving bundle, size", Integer.valueOf(arr_b1.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", crsu0.r);
        contentValues0.put("bundle_end_timestamp", Long.valueOf(crsu0.i));
        contentValues0.put("data", arr_b1);
        contentValues0.put("has_realtime", Integer.valueOf(((int)z)));
        if((crsu0.c & 2) != 0) {
            contentValues0.put("retry_count", Integer.valueOf(crsu0.J));
        }
        try {
            if(this.g().insert("queue", null, contentValues0) == -1L) {
                this.aJ().c.b("Failed to insert bundle (got -1). appId", crji.a(crsu0.r));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error storing bundle. appId", crji.a(crsu0.r), sQLiteException0);
        }
    }

    public final void ac(String s, TriggerUriParcel triggerUriParcel0) {
        this.n();
        this.aA();
        batl.q(s);
        long v = System.currentTimeMillis();
        long v1 = v - ((long)(((Long)crif.ao.a())));
        long v2 = triggerUriParcel0.b;
        if(v2 < v1 || v2 > ((long)(((Long)crif.ao.a()))) + v) {
            this.aJ().f.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", crji.a(s), Long.valueOf(v), Long.valueOf(v2));
        }
        this.aJ().k.a("Saving trigger URI");
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("trigger_uri", triggerUriParcel0.a);
        contentValues0.put("source", Integer.valueOf(triggerUriParcel0.c));
        contentValues0.put("timestamp_millis", Long.valueOf(v2));
        try {
            if(this.g().insert("trigger_uris", null, contentValues0) == -1L) {
                this.aJ().c.b("Failed to insert trigger URI (got -1). appId", crji.a(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error storing trigger URI. appId", crji.a(s), sQLiteException0);
        }
    }

    public final void ad(String s, String s1) {
        batl.q(s);
        batl.q(s1);
        this.n();
        this.aA();
        try {
            this.g().delete("conditional_properties", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.d("Error deleting conditional property", crji.a(s), this.ao().e(s1), sQLiteException0);
        }
    }

    public final void ae(String s, Long long0, long v, crso crso0) {
        this.n();
        this.aA();
        batl.s(crso0);
        batl.q(s);
        byte[] arr_b = crso0.toBytesArray();
        this.aJ().k.c("Saving complex main event, appId, data size", this.ao().c(s), Integer.valueOf(arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("event_id", long0);
        contentValues0.put("children_to_process", Long.valueOf(v));
        contentValues0.put("main_event", arr_b);
        try {
            if(this.g().insertWithOnConflict("main_event_params", null, contentValues0, 5) == -1L) {
                this.aJ().c.b("Failed to insert complex main event (got -1). appId", crji.a(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error storing complex main event. appId", crji.a(s), sQLiteException0);
        }
    }

    static final void af(ContentValues contentValues0, Object object0) {
        batl.q("value");
        if((object0 instanceof String)) {
            contentValues0.put("value", ((String)object0));
            return;
        }
        if((object0 instanceof Long)) {
            contentValues0.put("value", ((Long)object0));
            return;
        }
        if(!(object0 instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        }
        contentValues0.put("value", ((Double)object0));
    }

    public final String ag(String s, String[] arr_s) {
        String s1;
        SQLiteDatabase sQLiteDatabase0 = this.g();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    s1 = cursor0.getString(0);
                    goto label_12;
                }
                goto label_14;
            }
            catch(SQLiteException sQLiteException0) {
                this.aJ().c.c("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_12:
        cursor0.close();
        return s1;
    label_14:
        cursor0.close();
        return "";
    }

    public final void ah(crca crca0, boolean z) {
        this.n();
        this.aA();
        String s = crca0.t();
        batl.s(s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        if(z) {
            contentValues0.put("app_instance_id", null);
        }
        else if(this.m.w(s).q()) {
            contentValues0.put("app_instance_id", crca0.u());
        }
        contentValues0.put("gmp_app_id", crca0.y());
        crqq crqq0 = this.m;
        if(crqq0.w(s).o()) {
            contentValues0.put("resettable_device_id_hash", crca0.z());
        }
        contentValues0.put("last_bundle_index", Long.valueOf(crca0.l()));
        contentValues0.put("last_bundle_start_timestamp", Long.valueOf(crca0.m()));
        contentValues0.put("last_bundle_end_timestamp", Long.valueOf(crca0.k()));
        contentValues0.put("app_version", crca0.w());
        contentValues0.put("app_store", crca0.v());
        contentValues0.put("gmp_version", Long.valueOf(crca0.i()));
        contentValues0.put("dev_cert_hash", Long.valueOf(crca0.f()));
        contentValues0.put("measurement_enabled", Boolean.valueOf(crca0.al()));
        crkt crkt0 = crca0.a;
        crkt0.s();
        contentValues0.put("day", Long.valueOf(crca0.i));
        crkt0.s();
        contentValues0.put("daily_public_events_count", Long.valueOf(crca0.j));
        crkt0.s();
        contentValues0.put("daily_events_count", Long.valueOf(crca0.k));
        crkt0.s();
        contentValues0.put("daily_conversions_count", Long.valueOf(crca0.l));
        contentValues0.put("config_fetched_time", Long.valueOf(crca0.e()));
        contentValues0.put("failed_config_fetch_time", Long.valueOf(crca0.h()));
        contentValues0.put("app_version_int", Long.valueOf(crca0.c()));
        contentValues0.put("firebase_instance_id", crca0.x());
        crkt0.s();
        contentValues0.put("daily_error_events_count", Long.valueOf(crca0.m));
        crkt0.s();
        contentValues0.put("daily_realtime_events_count", Long.valueOf(crca0.n));
        crkt0.s();
        contentValues0.put("health_monitor_sample", crca0.o);
        contentValues0.put("android_id", Long.valueOf(0L));
        contentValues0.put("adid_reporting_enabled", Boolean.valueOf(crca0.ak()));
        contentValues0.put("dynamite_version", Long.valueOf(crca0.g()));
        if(crqq0.w(s).q()) {
            contentValues0.put("session_stitching_token", crca0.B());
        }
        contentValues0.put("sgtm_upload_enabled", Boolean.valueOf(crca0.an()));
        contentValues0.put("target_os_version", Long.valueOf(crca0.o()));
        contentValues0.put("session_stitching_token_hash", Long.valueOf(crca0.n()));
        hvhs.c();
        if(this.am().u(s, crif.aC)) {
            contentValues0.put("ad_services_version", Integer.valueOf(crca0.a()));
            contentValues0.put("attribution_eligibility_status", Long.valueOf(crca0.d()));
        }
        contentValues0.put("unmatched_first_open_without_ad_id", Boolean.valueOf(crca0.ao()));
        contentValues0.put("npa_metadata_value", crca0.p());
        contentValues0.put("bundle_delivery_index", Long.valueOf(crca0.j()));
        contentValues0.put("sgtm_preview_key", crca0.C());
        crkt0.s();
        contentValues0.put("dma_consent_state", Integer.valueOf(crca0.f));
        crkt0.s();
        contentValues0.put("daily_realtime_dcu_count", Integer.valueOf(crca0.g));
        contentValues0.put("serialized_npa_metadata", crca0.A());
        contentValues0.put("client_upload_eligibility", Integer.valueOf(crca0.b()));
        List list0 = crca0.D();
        if(list0 != null) {
            if(list0.isEmpty()) {
                this.aJ().f.b("Safelisted events should not be an empty list. appId", s);
            }
            else {
                contentValues0.put("safelisted_events", TextUtils.join(",", list0));
            }
        }
        contentValues0.put("unmatched_pfo", crca0.q());
        contentValues0.put("unmatched_uwa", crca0.r());
        contentValues0.put("ad_campaign_info", crca0.ap());
        try {
            SQLiteDatabase sQLiteDatabase0 = this.g();
            if(((long)sQLiteDatabase0.update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L && sQLiteDatabase0.insertWithOnConflict("apps", null, contentValues0, 5) == -1L) {
                this.aJ().c.b("Failed to insert/update app (got -1). appId", crji.a(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error storing app. appId", crji.a(s), sQLiteException0);
        }
    }

    public final void ai(ContentValues contentValues0) {
        try {
            SQLiteDatabase sQLiteDatabase0 = this.g();
            String s = contentValues0.getAsString("app_id");
            if(s == null) {
                this.aJ().e.b("Value of the primary key is not set.", crji.a("app_id"));
                return;
            }
            if(((long)sQLiteDatabase0.update("consent_settings", contentValues0, "app_id = ?", new String[]{s})) == 0L && sQLiteDatabase0.insertWithOnConflict("consent_settings", null, contentValues0, 5) == -1L) {
                this.aJ().c.c("Failed to insert/update table (got -1). key", crji.a("consent_settings"), crji.a("app_id"));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.d("Error storing into table. key", crji.a("consent_settings"), crji.a("app_id"), sQLiteException0);
        }
    }

    public final long b(String s) {
        batl.q(s);
        this.n();
        this.aA();
        try {
            return (long)this.g().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{s, String.valueOf(Math.max(0, Math.min(1000000, this.am().f(s, crif.q))))});
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().c.c("Error deleting over the limit events. appId", crji.a(s), sQLiteException0);
            return 0L;
        }
    }

    public final long c(String s, crss crss0, String s1, Map map0, crnq crnq0, Long long0) {
        this.n();
        this.aA();
        batl.s(crss0);
        batl.q(s);
        this.n();
        this.aA();
        if(this.W()) {
            long v = SystemClock.elapsedRealtime();
            long v1 = crcu.G();
            if(Math.abs(v - this.av().b.a()) > v1) {
                this.av().b.b(v);
                this.n();
                this.aA();
                if(this.W()) {
                    int v2 = this.g().delete("upload_queue", this.aE(), new String[0]);
                    if(v2 > 0) {
                        this.aJ().k.b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(v2));
                    }
                }
                batl.q(s);
                this.n();
                this.aA();
                try {
                    int v3 = this.am().f(s, crif.z);
                    if(v3 > 0) {
                        this.g().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{s, String.valueOf(v3)});
                    }
                }
                catch(SQLiteException sQLiteException0) {
                    this.aJ().c.c("Error deleting over the limit queued batches. appId", crji.a(s), sQLiteException0);
                }
            }
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            arrayList0.add(((String)((Map.Entry)object0).getKey()) + "=" + ((String)((Map.Entry)object0).getValue()));
        }
        byte[] arr_b = crss0.toBytesArray();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("measurement_batch", arr_b);
        contentValues0.put("upload_uri", s1);
        contentValues0.put("upload_headers", TextUtils.join("\r\n", arrayList0));
        contentValues0.put("upload_type", Integer.valueOf(crnq0.g));
        contentValues0.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues0.put("retry_count", Integer.valueOf(0));
        if(long0 != null) {
            contentValues0.put("associated_row_id", long0);
        }
        try {
            long v4 = this.g().insert("upload_queue", null, contentValues0);
            if(v4 == -1L) {
                this.aJ().c.b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", s);
                return -1L;
            }
            return v4;
        }
        catch(SQLiteException sQLiteException1) {
            this.aJ().c.c("Error storing MeasurementBatch to upload_queue. appId", s, sQLiteException1);
            return -1L;
        }
    }

    protected final long d(String s, String s1) {
        SQLiteException sQLiteException1;
        long v2;
        long v1;
        batl.q(s);
        batl.q(s1);
        this.n();
        this.aA();
        SQLiteDatabase sQLiteDatabase0 = this.g();
        sQLiteDatabase0.beginTransaction();
        try {
            v1 = -1L;
            v2 = this.f(a.a(s1, "select ", " from app2 where app_id=?"), new String[]{s}, -1L);
            if(Long.compare(v2, -1L) == 0) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("app_id", s);
                Integer integer0 = (int)0;
                contentValues0.put("first_open_count", integer0);
                contentValues0.put("previous_install_count", integer0);
                if(sQLiteDatabase0.insertWithOnConflict("app2", null, contentValues0, 5) == -1L) {
                    this.aJ().c.c("Failed to insert column (got -1). appId", crji.a(s), s1);
                }
                else {
                    v2 = 0L;
                    goto label_24;
                }
            }
            else {
                goto label_24;
            }
            return v1;
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            this.aJ().c.d("Error inserting column. appId", crji.a(s), s1, sQLiteException1);
            return 0L;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        try {
        label_24:
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("app_id", s);
            contentValues1.put(s1, Long.valueOf(1L + v2));
            if(((long)sQLiteDatabase0.update("app2", contentValues1, "app_id = ?", new String[]{s})) == 0L) {
                this.aJ().c.c("Failed to update column (got 0). appId", crji.a(s), s1);
            }
            else {
                sQLiteDatabase0.setTransactionSuccessful();
                return v2;
            }
            return v1;
        }
        catch(SQLiteException sQLiteException1) {
        }
        this.aJ().c.d("Error inserting column. appId", crji.a(s), s1, sQLiteException1);
        return v2;
    }

    public final long e(String s, String[] arr_s) {
        long v;
        SQLiteDatabase sQLiteDatabase0 = this.g();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(!cursor0.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                v = cursor0.getLong(0);
            }
            catch(SQLiteException sQLiteException0) {
                this.aJ().c.c("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }

    public final long f(String s, String[] arr_s, long v) {
        SQLiteDatabase sQLiteDatabase0 = this.g();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    v = cursor0.getLong(0);
                }
            }
            catch(SQLiteException sQLiteException0) {
                this.aJ().c.c("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }

    final SQLiteDatabase g() {
        this.n();
        try {
            return this.n.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            this.aJ().f.b("Error opening database", sQLiteException0);
            throw sQLiteException0;
        }
    }

    public final Bundle h(String s) {
        Bundle bundle0;
        crso crso0;
        Cursor cursor0;
        this.n();
        this.aA();
        try {
            cursor0 = null;
            cursor0 = this.g().rawQuery("select parameters from default_event_params where app_id=?", new String[]{s});
            goto label_8;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_8:
                if(!cursor0.moveToFirst()) {
                    this.aJ().k.a("Default event parameters not found");
                    goto label_22;
                }
                byte[] arr_b = cursor0.getBlob(0);
                try {
                    crso0 = (crso)((ProtoLiteBuilder)(((crsn)crqt.o(((Builder)(((crsn)((ProtoLiteMessage)crso.a).v_newBuilder()))), arr_b)))).N_build();
                }
                catch(IOException iOException0) {
                    this.aJ().c.c("Failed to retrieve default event parameters. appId", crji.a(s), iOException0);
                    goto label_22;
                }
                this.aw();
                bundle0 = crqt.C(crso0.c);
                goto label_28;
            }
            catch(SQLiteException sQLiteException0) {
            label_21:
                this.aJ().c.b("Error selecting default event parameters", sQLiteException0);
            }
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
    label_22:
        if(cursor0 != null) {
            cursor0.close();
        }
        return null;
    label_26:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_28:
        cursor0.close();
        return bundle0;
    }

    public final crca i(String s) {
        String s1;
        crca crca0;
        crdg crdg0;
        Cursor cursor0;
        batl.q(s);
        this.n();
        this.aA();
        try {
            cursor0 = this.g().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{s}, null, null, null);
        }
        catch(SQLiteException sQLiteException0) {
            crdg0 = this;
            cursor0 = null;
            goto label_121;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            try {
                if(cursor0.moveToFirst()) {
                    goto label_17;
                }
                goto label_128;
            }
            catch(SQLiteException sQLiteException0) {
                crdg0 = this;
                goto label_121;
            }
            try {
            label_17:
                crdg0 = this;
                crqq crqq0 = crdg0.m;
                crca0 = new crca(crqq0.i, s);
                if(crqq0.w(s).q()) {
                    crca0.I(cursor0.getString(0));
                }
                int v = 1;
                crca0.S(cursor0.getString(1));
                if(crqq0.w(s).o()) {
                    crca0.aa(cursor0.getString(2));
                }
                crca0.W(cursor0.getLong(3));
                crca0.X(cursor0.getLong(4));
                crca0.V(cursor0.getLong(5));
                crca0.K(cursor0.getString(6));
                crca0.J(cursor0.getString(7));
                crca0.T(cursor0.getLong(8));
                crca0.O(cursor0.getLong(9));
                crca0.Y(cursor0.isNull(10) || cursor0.getInt(10) != 0);
                long v1 = cursor0.getLong(11);
                crkt crkt0 = crca0.a;
                crkt0.s();
                crca0.p |= (crca0.i == v1 ? 0 : 1);
                crca0.i = v1;
                long v2 = cursor0.getLong(12);
                crkt0.s();
                crca0.p |= (crca0.j == v2 ? 0 : 1);
                crca0.j = v2;
                long v3 = cursor0.getLong(13);
                crkt0.s();
                crca0.p |= (crca0.k == v3 ? 0 : 1);
                crca0.k = v3;
                long v4 = cursor0.getLong(14);
                crkt0.s();
                crca0.p |= (crca0.l == v4 ? 0 : 1);
                crca0.l = v4;
                crca0.N(cursor0.getLong(15));
                crca0.Q(cursor0.getLong(16));
                crca0.L((cursor0.isNull(17) ? 0xFFFFFFFF80000000L : ((long)cursor0.getInt(17))));
                crca0.R(cursor0.getString(18));
                long v5 = cursor0.getLong(19);
                crkt0.s();
                crca0.p |= (crca0.m == v5 ? 0 : 1);
                crca0.m = v5;
                long v6 = cursor0.getLong(20);
                crkt0.s();
                crca0.p |= (crca0.n == v6 ? 0 : 1);
                crca0.n = v6;
                crca0.U(cursor0.getString(21));
                crca0.H(cursor0.isNull(23) || cursor0.getInt(23) != 0);
                crca0.P((cursor0.isNull(25) ? 0L : cursor0.getLong(25)));
                if(!cursor0.isNull(26)) {
                    List list0 = Arrays.asList(cursor0.getString(26).split(",", -1));
                    crkt0.s();
                    if(!Objects.equals(crca0.d, list0)) {
                        crca0.p = true;
                        crca0.d = list0 == null ? null : new ArrayList(list0);
                    }
                }
                if(crqq0.w(s).q()) {
                    crca0.ac(cursor0.getString(28));
                }
                crca0.af(!cursor0.isNull(29) && cursor0.getInt(29) != 0);
                long v7 = cursor0.getLong(39);
                crkt0.s();
                crca0.p |= (crca0.h == v7 ? 0 : 1);
                crca0.h = v7;
                crca0.ae(cursor0.getString(36));
                crca0.ag(cursor0.getLong(30));
                crca0.ad(cursor0.getLong(0x1F));
                hvhs.c();
                if(crdg0.am().u(s, crif.aC)) {
                    crca0.G(cursor0.getInt(0x20));
                    long v8 = cursor0.getLong(35);
                    crkt0.s();
                    crca0.p |= (crca0.e == v8 ? 0 : 1);
                    crca0.e = v8;
                }
                crca0.ah(!cursor0.isNull(33) && cursor0.getInt(33) != 0);
                crca0.Z((cursor0.isNull(34) ? null : Boolean.valueOf(cursor0.getInt(34) != 0)));
                int v9 = cursor0.getInt(37);
                crkt0.s();
                crca0.p |= (crca0.f == v9 ? 0 : 1);
                crca0.f = v9;
                int v10 = cursor0.getInt(38);
                crkt0.s();
                int v11 = crca0.p;
                if(crca0.g == v10) {
                    v = 0;
                }
                crca0.p = v | v11;
                crca0.g = v10;
                if(cursor0.isNull(40)) {
                    s1 = "";
                }
                else {
                    s1 = cursor0.getString(40);
                    batl.s(s1);
                }
                crca0.ab(s1);
                if(!cursor0.isNull(41)) {
                    crca0.ai(Long.valueOf(cursor0.getLong(41)));
                }
                if(!cursor0.isNull(42)) {
                    crca0.aj(Long.valueOf(cursor0.getLong(42)));
                }
                crca0.F(cursor0.getBlob(43));
                if(!cursor0.isNull(44)) {
                    crca0.M(cursor0.getInt(44));
                }
                crkt0.s();
                crca0.p = false;
                if(cursor0.moveToNext()) {
                    crdg0.aJ().c.b("Got multiple records for app, expected one. appId", crji.a(s));
                }
                goto label_126;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_121:
            crdg0.aJ().c.c("Error querying app. appId", crji.a(s), sQLiteException0);
            goto label_128;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_126:
        cursor0.close();
        return crca0;
    label_128:
        if(cursor0 != null) {
            cursor0.close();
        }
        return null;
    }

    public final ConditionalUserPropertyParcel j(String s, String s1) {
        ConditionalUserPropertyParcel conditionalUserPropertyParcel0;
        EventParcel eventParcel2;
        long v3;
        long v2;
        EventParcel eventParcel1;
        long v1;
        EventParcel eventParcel0;
        long v;
        String s4;
        boolean z;
        Object object0;
        String s3;
        String s2;
        Cursor cursor0;
        batl.q(s);
        batl.q(s1);
        this.n();
        this.aA();
        try {
            cursor0 = this.g().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
        }
        catch(SQLiteException sQLiteException0) {
            s2 = s1;
            cursor0 = null;
            goto label_37;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            try {
                if(cursor0.moveToFirst()) {
                    s3 = cursor0.getString(0);
                    if(s3 == null) {
                        s3 = "";
                    }
                    object0 = this.t(cursor0, 1);
                    z = cursor0.getInt(2) != 0;
                    s4 = cursor0.getString(3);
                    v = cursor0.getLong(4);
                    eventParcel0 = (EventParcel)this.aw().i(cursor0.getBlob(5), EventParcel.CREATOR);
                    v1 = cursor0.getLong(6);
                    eventParcel1 = (EventParcel)this.aw().i(cursor0.getBlob(7), EventParcel.CREATOR);
                    v2 = cursor0.getLong(8);
                    v3 = cursor0.getLong(9);
                    eventParcel2 = (EventParcel)this.aw().i(cursor0.getBlob(10), EventParcel.CREATOR);
                    s2 = s1;
                    goto label_32;
                }
                goto label_44;
            }
            catch(SQLiteException sQLiteException0) {
                s2 = s1;
                goto label_37;
            }
            try {
            label_32:
                conditionalUserPropertyParcel0 = new ConditionalUserPropertyParcel(s, s3, new UserAttributeParcel(s2, v2, object0, s3), v1, z, s4, eventParcel0, v, eventParcel1, v3, eventParcel2);
                if(cursor0.moveToNext()) {
                    this.aJ().c.c("Got multiple records for conditional property, expected one", crji.a(s), this.ao().e(s2));
                }
                goto label_42;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_37:
            this.aJ().c.d("Error querying conditional property", crji.a(s), this.ao().e(s2), sQLiteException0);
            goto label_44;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_42:
        cursor0.close();
        return conditionalUserPropertyParcel0;
    label_44:
        if(cursor0 != null) {
            cursor0.close();
        }
        return null;
    }

    public final crdb k(String s) {
        crdb crdb0;
        String s2;
        String s1;
        byte[] arr_b;
        Cursor cursor1;
        batl.q(s);
        this.n();
        this.aA();
        Cursor cursor0 = null;
        try {
            cursor1 = null;
            cursor1 = this.g().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{s}, null, null, null);
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_20;
        }
        catch(Throwable throwable0) {
        }
        Throwable throwable1 = throwable0;
        goto label_25;
        try {
        label_10:
            if(cursor1.moveToFirst()) {
                arr_b = cursor1.getBlob(0);
                s1 = cursor1.getString(1);
                s2 = cursor1.getString(2);
                if(cursor1.moveToNext()) {
                    this.aJ().c.b("Got multiple records for app config, expected one. appId", crji.a(s));
                }
                goto label_16;
            }
            goto label_30;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_20;
        }
        catch(Throwable throwable2) {
            goto label_23;
        }
    label_16:
        if(arr_b != null) {
            try {
                try {
                    crdb0 = new crdb(arr_b, s1, s2);
                    goto label_28;
                }
                catch(SQLiteException sQLiteException0) {
                label_20:
                    this.aJ().c.c("Error querying remote config. appId", crji.a(s), sQLiteException0);
                    goto label_30;
                }
            }
            catch(Throwable throwable2) {
            label_23:
                throwable1 = throwable2;
                cursor0 = cursor1;
            }
        label_25:
            if(cursor0 != null) {
                cursor0.close();
            }
            throw throwable1;
        label_28:
            cursor1.close();
            return crdb0;
        }
    label_30:
        if(cursor1 != null) {
            cursor1.close();
        }
        return null;
    }

    public final crdc l(long v, String s, long v1, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        batl.q(s);
        this.n();
        this.aA();
        String[] arr_s = {s};
        crdc crdc0 = new crdc();
        Cursor cursor0 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase0 = this.g();
                cursor0 = sQLiteDatabase0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{s}, null, null, null);
                if(cursor0.moveToFirst()) {
                    if(cursor0.getLong(0) == v) {
                        crdc0.b = cursor0.getLong(1);
                        crdc0.a = cursor0.getLong(2);
                        crdc0.c = cursor0.getLong(3);
                        crdc0.d = cursor0.getLong(4);
                        crdc0.e = cursor0.getLong(5);
                        crdc0.f = cursor0.getLong(6);
                        crdc0.g = cursor0.getLong(7);
                    }
                    if(z) {
                        crdc0.b += v1;
                    }
                    if(z1) {
                        crdc0.a += v1;
                    }
                    if(z2) {
                        crdc0.c += v1;
                    }
                    if(z3) {
                        crdc0.d += v1;
                    }
                    if(z4) {
                        crdc0.e += v1;
                    }
                    if(z5) {
                        crdc0.f += v1;
                    }
                    if(z6) {
                        crdc0.g += v1;
                    }
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("day", Long.valueOf(v));
                    contentValues0.put("daily_public_events_count", Long.valueOf(crdc0.a));
                    contentValues0.put("daily_events_count", Long.valueOf(crdc0.b));
                    contentValues0.put("daily_conversions_count", Long.valueOf(crdc0.c));
                    contentValues0.put("daily_error_events_count", Long.valueOf(crdc0.d));
                    contentValues0.put("daily_realtime_events_count", Long.valueOf(crdc0.e));
                    contentValues0.put("daily_realtime_dcu_count", Long.valueOf(crdc0.f));
                    contentValues0.put("daily_registered_triggers_count", Long.valueOf(crdc0.g));
                    sQLiteDatabase0.update("apps", contentValues0, "app_id=?", arr_s);
                }
                else {
                    this.aJ().f.b("Not updating daily counts, app is not known. appId", crji.a(s));
                }
            }
            catch(SQLiteException sQLiteException0) {
                this.aJ().c.c("Error updating daily counts. appId", crji.a(s), sQLiteException0);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        return crdc0;
    }

    public final crdn o(String s, String s1) {
        return this.aD("events", s, s1);
    }

    public final crmb p(String s) {
        batl.s(s);
        this.n();
        this.aA();
        return crmb.h(this.ag("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{s}));
    }

    public final crmb q(String s) {
        SQLiteException sQLiteException1;
        Cursor cursor0;
        batl.s(s);
        this.n();
        this.aA();
        crmb crmb0 = null;
        try {
            cursor0 = this.g().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{s});
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            cursor0 = null;
            goto label_19;
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        try {
            if(!cursor0.moveToFirst()) {
                this.aJ().k.a("No data found");
                goto label_14;
            }
            crmb0 = crmb.i(cursor0.getString(0), cursor0.getInt(1));
            goto label_28;
        }
        catch(SQLiteException sQLiteException1) {
            goto label_19;
        }
        catch(Throwable throwable0) {
            goto label_24;
        }
    label_14:
        cursor0.close();
        return crmb.a;
        try {
            crmb0 = crmb.i(cursor0.getString(0), cursor0.getInt(1));
            goto label_28;
        }
        catch(SQLiteException sQLiteException1) {
            try {
            label_19:
                this.aJ().c.b("Error querying database.", sQLiteException1);
                if(cursor0 != null) {
                    goto label_21;
                }
                return crmb0 == null ? crmb.a : crmb0;
            }
            catch(Throwable throwable0) {
                goto label_24;
            }
        label_21:
            cursor0.close();
            return crmb.a;
        }
        catch(Throwable throwable0) {
        label_24:
            crmb0 = cursor0;
        }
    label_25:
        if(crmb0 != null) {
            ((Cursor)crmb0).close();
        }
        throw throwable0;
    label_28:
        cursor0.close();
        return crmb0 == null ? crmb.a : crmb0;
    }

    public final crqs r(String s, long v, byte[] arr_b, String s1, String s2, int v1, int v2, long v3, long v4, long v5) {
        crnq crnq0;
        if(!TextUtils.isEmpty(s1)) {
            try {
                crsr crsr0 = (crsr)crqt.o(((Builder)(((crsr)((ProtoLiteMessage)crss.a).v_newBuilder()))), arr_b);
                crnq[] arr_crnq = crnq.values();
                for(int v6 = 0; true; ++v6) {
                    if(v6 >= arr_crnq.length) {
                        crnq0 = crnq.f;
                        break;
                    }
                    crnq crnq1 = arr_crnq[v6];
                    if(crnq1.g == v1) {
                        crnq0 = crnq1;
                        break;
                    }
                }
                if(crnq0 != crnq.b && crnq0 != crnq.e && v2 > 0) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: DesugarCollections.unmodifiableList(((crss)crsr0.b_message).c)) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((crsu)object0))).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)(((crsu)object0))));
                        crst crst0 = (crst)hftp0;
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        ((crsu)crst0.b_message).c |= 2;
                        ((crsu)crst0.b_message).J = v2;
                        arrayList0.add(((crsu)((ProtoLiteBuilder)crst0).N_build()));
                    }
                    if(!crsr0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crsr0).ensureMutable();
                    }
                    ((crss)crsr0.b_message).c = hfvv.a;
                    crsr0.a(arrayList0);
                }
                HashMap hashMap0 = new HashMap();
                if(s2 != null) {
                    String[] arr_s = s2.split("\r\n");
                    int v7 = 0;
                    while(v7 < arr_s.length) {
                        String s3 = arr_s[v7];
                        if(s3.isEmpty()) {
                            break;
                        }
                        String[] arr_s1 = s3.split("=", 2);
                        if(arr_s1.length == 2) {
                            hashMap0.put(arr_s1[0], arr_s1[1]);
                            ++v7;
                            continue;
                        }
                        else {
                            this.aJ().c.b("Invalid upload header: ", s3);
                        }
                        break;
                    }
                }
                return new crqs(v, ((crss)((ProtoLiteBuilder)crsr0).N_build()), s1, hashMap0, crnq0, v3, v4, v5, v2);
            }
            catch(IOException iOException0) {
                this.aJ().c.c("Failed to queued MeasurementBatch from upload_queue. appId", s, iOException0);
                return null;
            }
        }
        this.aJ().j.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
        return null;
    }

    public final crqv s(String s, String s1) {
        crqv crqv0;
        String s4;
        Object object0;
        long v;
        Throwable throwable1;
        SQLiteException sQLiteException1;
        String s3;
        String s2;
        Cursor cursor1;
        batl.q(s);
        batl.q(s1);
        this.n();
        this.aA();
        Cursor cursor0 = null;
        try {
            cursor1 = this.g().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
        }
        catch(SQLiteException sQLiteException0) {
            s2 = s;
            s3 = s1;
            sQLiteException1 = sQLiteException0;
            cursor1 = null;
            goto label_34;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_39;
        }
        try {
            try {
                if(cursor1.moveToFirst()) {
                    v = cursor1.getLong(0);
                    object0 = this.t(cursor1, 1);
                    if(object0 != null) {
                        s4 = cursor1.getString(2);
                        s2 = s;
                        s3 = s1;
                        goto label_28;
                    }
                }
            }
            catch(SQLiteException sQLiteException2) {
                s2 = s;
                s3 = s1;
                sQLiteException1 = sQLiteException2;
                this.aJ().c.d("Error querying user property. appId", crji.a(s2), this.ao().e(s3), sQLiteException1);
            }
            goto label_44;
            try {
            label_28:
                crqv0 = new crqv(s2, s4, s3, v, object0);
                if(cursor1.moveToNext()) {
                    this.aJ().c.b("Got multiple records for user property, expected one. appId", crji.a(s2));
                }
                goto label_42;
            }
            catch(SQLiteException sQLiteException2) {
            }
            sQLiteException1 = sQLiteException2;
        label_34:
            this.aJ().c.d("Error querying user property. appId", crji.a(s2), this.ao().e(s3), sQLiteException1);
            goto label_44;
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            cursor0 = cursor1;
        }
    label_39:
        if(cursor0 != null) {
            cursor0.close();
        }
        throw throwable1;
    label_42:
        cursor1.close();
        return crqv0;
    label_44:
        if(cursor1 != null) {
            cursor1.close();
        }
        return null;
    }

    final Object t(Cursor cursor0, int v) {
        int v1 = cursor0.getType(v);
        switch(v1) {
            case 0: {
                this.aJ().c.a("Loaded invalid null value from database");
                return null;
            }
            case 1: {
                return cursor0.getLong(v);
            }
            case 2: {
                return cursor0.getDouble(v);
            }
            case 3: {
                return cursor0.getString(v);
            }
            case 4: {
                this.aJ().c.a("Loaded invalid blob type value, ignoring it");
                return null;
            }
            default: {
                this.aJ().c.b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(v1));
                return null;
            }
        }
    }

    final String u() {
        return "google_app_measurement.db";
    }

    public final String v() {
        String s;
        SQLiteException sQLiteException1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0 = this.g();
        try {
            cursor0 = sQLiteDatabase0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            cursor0 = null;
            goto label_14;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            try {
                if(cursor0.moveToFirst()) {
                    s = cursor0.getString(0);
                    goto label_19;
                }
                goto label_21;
            }
            catch(SQLiteException sQLiteException1) {
            }
        label_14:
            this.aJ().c.b("Database error getting next bundle app id", sQLiteException1);
            goto label_21;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_19:
        cursor0.close();
        return s;
    label_21:
        if(cursor0 != null) {
            cursor0.close();
        }
        return null;
    }

    public final List w(String s, String s1, String s2) {
        batl.q(s);
        this.n();
        this.aA();
        ArrayList arrayList0 = new ArrayList(3);
        arrayList0.add(s);
        StringBuilder stringBuilder0 = new StringBuilder("app_id=?");
        if(!TextUtils.isEmpty(s1)) {
            arrayList0.add(s1);
            stringBuilder0.append(" and origin=?");
        }
        if(!TextUtils.isEmpty(s2)) {
            arrayList0.add(s2 + "*");
            stringBuilder0.append(" and name glob ?");
        }
        return this.x(stringBuilder0.toString(), ((String[])arrayList0.toArray(new String[arrayList0.size()])));
    }

    public final List x(String s, String[] arr_s) {
        crdg crdg0;
        String s3;
        String s2;
        String s1;
        this.n();
        this.aA();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = this.g().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, s, arr_s, null, null, "rowid", "1001");
                if(cursor0.moveToFirst()) {
                    while(true) {
                    label_6:
                        if(list0.size() >= 1000) {
                            this.aJ().c.b("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(1000));
                            break;
                        }
                        s1 = cursor0.getString(0);
                        s2 = cursor0.getString(1);
                        s3 = cursor0.getString(2);
                        crdg0 = this;
                        goto label_17;
                    }
                }
                goto label_37;
            }
            catch(SQLiteException sQLiteException0) {
                crdg0 = this;
                goto label_31;
            }
            try {
            label_17:
                Object object0 = crdg0.t(cursor0, 3);
                boolean z = cursor0.getInt(4) != 0;
                String s4 = cursor0.getString(5);
                long v = cursor0.getLong(6);
                EventParcel eventParcel0 = (EventParcel)crdg0.aw().i(cursor0.getBlob(7), EventParcel.CREATOR);
                long v1 = cursor0.getLong(8);
                EventParcel eventParcel1 = (EventParcel)crdg0.aw().i(cursor0.getBlob(9), EventParcel.CREATOR);
                long v2 = cursor0.getLong(10);
                long v3 = cursor0.getLong(11);
                EventParcel eventParcel2 = (EventParcel)crdg0.aw().i(cursor0.getBlob(12), EventParcel.CREATOR);
                list0.add(new ConditionalUserPropertyParcel(s1, s2, new UserAttributeParcel(s3, v2, object0, s2), v1, z, s4, eventParcel0, v, eventParcel1, v3, eventParcel2));
                if(cursor0.moveToNext()) {
                    goto label_6;
                }
                goto label_37;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_31:
            crdg0.aJ().c.b("Error querying conditional user property value", sQLiteException0);
            list0 = Collections.EMPTY_LIST;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_37:
        if(cursor0 != null) {
            cursor0.close();
        }
        return list0;
    }

    public final List y(String s, UploadBatchesCriteria uploadBatchesCriteria0, int v) {
        List list0;
        batl.q(s);
        this.n();
        this.aA();
        Cursor cursor0 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase0 = this.g();
                String s1 = "app_id=?" + crdg.aH(uploadBatchesCriteria0.a) + " AND NOT " + this.aE();
                cursor0 = sQLiteDatabase0.query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, s1, new String[]{s}, null, null, "creation_timestamp ASC", (v <= 0 ? null : String.valueOf(v)));
                list0 = new ArrayList();
                while(cursor0.moveToNext()) {
                    crqs crqs0 = this.r(s, cursor0.getLong(0), cursor0.getBlob(2), cursor0.getString(3), cursor0.getString(4), cursor0.getInt(5), cursor0.getInt(6), cursor0.getLong(7), cursor0.getLong(8), cursor0.getLong(9));
                    if(crqs0 != null) {
                        list0.add(crqs0);
                    }
                }
            }
            catch(SQLiteException sQLiteException0) {
                this.aJ().c.c("Error to querying MeasurementBatch from upload_queue. appId", s, sQLiteException0);
                list0 = Collections.EMPTY_LIST;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        return list0;
    }

    public final List z(String s) {
        String s1;
        batl.q(s);
        this.n();
        this.aA();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = this.g().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{s}, null, null, "rowid", "1000");
            }
            catch(SQLiteException sQLiteException0) {
                s1 = s;
                goto label_31;
            }
            try {
                if(cursor0.moveToFirst()) {
                    while(true) {
                        String s2 = cursor0.getString(0);
                        String s3 = cursor0.getString(1);
                        if(s3 == null) {
                            s3 = "";
                        }
                        long v = cursor0.getLong(2);
                        Object object0 = this.t(cursor0, 3);
                        if(object0 == null) {
                            this.aJ().c.b("Read invalid user property value, ignoring it. appId", crji.a(s));
                            s1 = s;
                        }
                        else {
                            try {
                                s1 = s;
                                list0.add(new crqv(s1, s3, s2, v, object0));
                            label_23:
                                if(!cursor0.moveToNext()) {
                                    break;
                                }
                                goto label_27;
                            }
                            catch(SQLiteException sQLiteException0) {
                            }
                            goto label_26;
                        }
                        goto label_23;
                    label_26:
                        goto label_31;
                    label_27:
                        s = s1;
                    }
                }
                goto label_37;
            }
            catch(SQLiteException sQLiteException0) {
                s1 = s;
            }
        label_31:
            this.aJ().c.c("Error querying user properties. appId", crji.a(s1), sQLiteException0);
            list0 = Collections.EMPTY_LIST;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_37:
        if(cursor0 != null) {
            cursor0.close();
        }
        return list0;
    }
}

