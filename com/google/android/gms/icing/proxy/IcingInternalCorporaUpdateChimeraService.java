package com.google.android.gms.icing.proxy;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.ProviderStatus;
import android.provider.ContactsContract;
import bbdg;
import bwts;
import bwxd;
import bwyl;
import bwyp;
import bwzd;
import ccmq;
import cliz;
import clja;
import cljp;
import cllr;
import com.google.android.gms.chimera.modules.icing.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import huar;
import hubg;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.TWR;

public class IcingInternalCorporaUpdateChimeraService extends GmsTaskChimeraService {
    static final cliz a;
    public static final int b;

    static {
        IcingInternalCorporaUpdateChimeraService.a = new cliz(ContactsContract.AUTHORITY_URI, 1);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.nm);
        String s = cllr0.a;
        bwzd.d("Running gcm task %s", s);
        if("internal-corpora-update".equals(s)) {
            try {
                List list0 = cllr0.c;
                bwzd.k("Processing triggered uris");
                if(list0 == null) {
                    bwzd.o("Triggered uri list is null");
                }
                else {
                    cliz cliz0 = IcingInternalCorporaUpdateChimeraService.a;
                    if(cliz0 == null) {
                        bwzd.c("Not process triggered uri because platform version is lower than N.");
                    }
                    else {
                        String s1 = ContactsContract.ProviderStatus.CONTENT_URI.toString();
                        String s2 = cliz0.a.toString();
                        boolean z = false;
                        boolean z1 = false;
                        for(Object object0: list0) {
                            Uri uri0 = (Uri)object0;
                            if(uri0 != null) {
                                String s3 = uri0.toString();
                                if(!z && s1.equals(s3)) {
                                    z = true;
                                }
                                else {
                                    if(z1 || !s3.startsWith(s2)) {
                                        continue;
                                    }
                                    z1 = true;
                                }
                            }
                        }
                        if(z) {
                            long v1 = -1L;
                            Cursor cursor0 = new bwyl(new bwts(this), this.getContentResolver()).b(ContactsContract.ProviderStatus.CONTENT_URI, new String[]{"database_creation_timestamp"}, null, null, null);
                            if(cursor0 == null) {
                            label_40:
                                if(cursor0 != null) {
                                label_41:
                                    cursor0.close();
                                }
                            }
                            else {
                                try {
                                    if(cursor0.moveToNext()) {
                                        v1 = (long)(cursor0.isNull(0) ? ((long)-1L) : cursor0.getLong(0));
                                        goto label_41;
                                    }
                                    else {
                                        goto label_40;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    TWR.safeClose$NT(cursor0, throwable0);
                                    throw throwable0;
                                }
                            }
                            SharedPreferences sharedPreferences0 = this.getSharedPreferences("icing_internal_corpora_prefs", 0);
                            if(sharedPreferences0.getLong("contacts_db_creation_time_ms", 0L) < v1) {
                                bwzd.k("Contacts database created");
                                sharedPreferences0.edit().putLong("contacts_db_creation_time_ms", v1).apply();
                                UpdateIcingCorporaIntentOperation.e(this);
                            }
                        }
                        if(z1) {
                            bwzd.k("Contacts provider changed");
                            bwxd.b(this);
                            Class class0 = bwxd.class;
                            synchronized(class0) {
                                bwxd bwxd0 = bwxd.a;
                                if(bwxd0 != null) {
                                    bwxd0.onChange(false);
                                }
                            }
                        }
                    }
                }
            }
            finally {
                IcingInternalCorporaUpdateChimeraService.d();
            }
            return 0;
        }
        if("InternalCorporaMaintenance".equals(s)) {
            bwyp.d(this);
        }
        return 0;
    }

    public static void d() {
        bwzd.k("Calling IcingInternalCorporaUpdateChimeraService.schedule");
        ArrayList arrayList0 = new ArrayList();
        if(huar.a.d().M() && hubg.d() >= 0L && bwyp.e()) {
            cliz cliz0 = IcingInternalCorporaUpdateChimeraService.a;
            if(cliz0 != null) {
                bwzd.k("Contacts Corpus is enabled. Adding its uri trigger to list");
                arrayList0.add(cliz0);
            }
        }
        if(!arrayList0.isEmpty()) {
            bwzd.k("Scheduling ContentUriTriggeredTask");
            cljp cljp0 = cljp.a(AppContextProvider.a());
            clja clja0 = new clja();
            clja0.t("internal-corpora-update");
            clja0.j = "com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateService";
            clja0.v(1);
            clja0.d(arrayList0);
            clja0.r(false);
            cljp0.f(clja0.a());
            bwzd.k("ContentUriTriggeredTask is scheduled");
            return;
        }
        bwzd.k("Not schedule ContentUriTriggeredTask because the uri trigger list is empty.");
    }
}

