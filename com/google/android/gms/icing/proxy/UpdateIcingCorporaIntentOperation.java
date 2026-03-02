package com.google.android.gms.icing.proxy;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.ContactsContract.RawContacts;
import bbdg;
import bbib;
import bwts;
import bwyl;
import bwyp;
import bwzd;
import bwzj;
import ccmq;
import cljp;
import clkn;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall.GlobalSearchSource;
import gfsx;
import hrqf;
import hubg;
import j..util.Objects;
import jeb.synthetic.TWR;

public class UpdateIcingCorporaIntentOperation extends IntentOperation {
    public static final ContentValues a;
    private static boolean b;

    static {
        UpdateIcingCorporaIntentOperation.a = new ContentValues();
        UpdateIcingCorporaIntentOperation.b = false;
    }

    public static Intent a(Context context0) {
        return UpdateIcingCorporaIntentOperation.c(context0, "DELTA");
    }

    public static Intent b(Context context0) {
        return UpdateIcingCorporaIntentOperation.c(context0, "MAYBE");
    }

    public static Intent c(Context context0, String s) {
        Intent intent0 = IntentOperation.getStartIntent(context0, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_UPDATE");
        if(intent0 != null) {
            intent0.putExtra("KEY_CONTACTS_UPDATE_MODE", s);
        }
        return intent0;
    }

    public final void d(int v, int v1) {
        int v2;
        bwzd.c(("maybeUpdateContacts attempt " + v1));
        Cursor cursor0 = this.f().b(ContactsContract.RawContacts.CONTENT_URI, null, null, null, null);
        if(cursor0 != null) {
            try {
                v2 = cursor0.getCount();
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
            hubg hubg0 = hubg.a;
            int v3 = (int)hubg0.j().f();
            bwzd.e("Curr/Prev: %d/%d", Integer.valueOf(v2), Integer.valueOf(v));
            if(v2 != v && v1 < v3) {
                long v4 = hubg0.j().g();
                if(v4 < 0L) {
                    bwzd.j("Not rescheduling contacts sync");
                    return;
                }
                if(!UpdateIcingCorporaIntentOperation.b) {
                    Intent intent0 = IntentOperation.getStartIntent(this, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS");
                    if(intent0 == null) {
                        return;
                    }
                    intent0.putExtra("EXTRA_ATTEMPT", v1 + 1);
                    intent0.putExtra("EXTRA_LAST_RAW_CONTACT_COUNT", v2);
                    PendingIntent pendingIntent0 = PendingIntent.getService(this, 0, intent0, 0xA000000);
                    bwzd.e("Scheduling alarm in %d s: %s", Long.valueOf(v4 / 1000L), intent0);
                    new bbib(this).d("Icing:CorporaIntent", 3, SystemClock.elapsedRealtime() + v4, pendingIntent0, null);
                    return;
                }
                UpdateIcingCorporaIntentOperation.g(this, v4, v2, v1 + 1);
                return;
            }
            if(v2 != v) {
                bwzd.o(("Number of contacts did not stabilize after attempt " + v1));
            }
            this.h("FORCE_ALL", null);
            return;
        }
        bwzd.o("Could not fetch contact count - no contacts provider present?");
    }

    static void e(Context context0) {
        long v = hubg.a.j().e();
        if(v < 0L) {
            bwzd.j("Not scheduling contacts sync");
            return;
        }
        UpdateIcingCorporaIntentOperation.b = true;
        UpdateIcingCorporaIntentOperation.g(context0, v, -1, 0);
    }

    private final bwyl f() {
        return new bwyl(new bwts(this), this.getContentResolver());
    }

    private static void g(Context context0, long v, int v1, int v2) {
        bwzd.d("Scheduling task in %d s: for updating contacts.", Long.valueOf(v / 1000L));
        cljp cljp0 = cljp.a(context0);
        Bundle bundle0 = new Bundle();
        bundle0.putInt("EXTRA_LAST_RAW_CONTACT_COUNT", v1);
        bundle0.putInt("EXTRA_ATTEMPT", v2);
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.icing.service.IcingGcmTaskChimeraService";
        clkn0.e(v, 3600L + v);
        clkn0.t("UpdateIcingIntentCorpora");
        clkn0.p = false;
        clkn0.v(1);
        clkn0.u = bundle0;
        cljp0.f(clkn0.a());
    }

    private final void h(String s, String[] arr_s) {
        bwzd.d("Updating corpora: CONTACTS=%s", s);
        new bwzj(this.getSharedPreferences("icing_internal_corpora_prefs", 0), this.f(), s, arr_s).a();
    }

    private static final boolean i(Intent intent0) {
        Uri uri0 = intent0.getData();
        return uri0 == null ? false : "com.android.providers.contacts".equals(uri0.getSchemeSpecificPart());
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.nm);
        if(intent0 == null) {
            bwzd.o("Received null intent.");
            return;
        }
        if(!Objects.equals(intent0.getAction(), "android.intent.action.PACKAGE_CHANGED") || !hrqf.c()) {
            if(Objects.equals(intent0.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
                intent0.setAction("android.intent.action.PACKAGE_CHANGED");
            }
            synchronized(bwyp.a) {
            }
            if(bwyp.b == null) {
                gfsx gfsx0 = bwyp.a(this);
                synchronized(bwyp.a) {
                    if(bwyp.b == null && gfsx0.i()) {
                        bwyp.b = Boolean.valueOf(((GetGlobalSearchSourcesCall.GlobalSearchSource)gfsx0.d()).j);
                    }
                }
            }
            if(!bwyp.g()) {
                bwzd.o("Contacts corpus disabled.");
                return;
            }
            String s = intent0.getAction();
            if("com.google.android.gms.icing.proxy.ACTION_UPDATE".equals(s)) {
                this.h(intent0.getStringExtra("KEY_CONTACTS_UPDATE_MODE"), intent0.getStringArrayExtra("KEY_CONTACTS_ARGS"));
                return;
            }
            if("com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS".equals(s)) {
                Bundle bundle0 = intent0.getExtras();
                if(bundle0 == null) {
                    bwzd.c("maybeUpdateContacts extras is null.");
                    return;
                }
                this.d(bundle0.getInt("EXTRA_LAST_RAW_CONTACT_COUNT", -1), bundle0.getInt("EXTRA_ATTEMPT", 0));
                return;
            }
            String s1 = intent0.getAction();
            bwzd.k(("Received " + intent0.toString()));
            if(!"android.intent.action.PACKAGE_CHANGED".equals(s1)) {
                if(!"android.intent.action.PACKAGE_DATA_CLEARED".equals(s1)) {
                    goto label_46;
                }
                if(UpdateIcingCorporaIntentOperation.i(intent0)) {
                    this.h("FORCE_ALL", null);
                    return;
                label_46:
                    if("android.provider.Contacts.DATABASE_CREATED".equals(s1)) {
                        UpdateIcingCorporaIntentOperation.e(this);
                        return;
                    }
                    if("android.intent.action.LOCALE_CHANGED".equals(s1)) {
                        this.h("FORCE_ALL", null);
                        return;
                    }
                    bwzd.o("Received unrecognized action.");
                }
            }
            else if(UpdateIcingCorporaIntentOperation.i(intent0)) {
                this.h("FORCE_ALL", null);
            }
        }
    }
}

