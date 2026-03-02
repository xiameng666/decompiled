import android.content.ContentProviderOperation.Builder;
import android.content.Context;
import android.content.SyncStats;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.SystemClock;

public final class ehai extends ehaf {
    public final boolean b;
    private static final String[] c;
    private static final String[] d;
    private final Context e;
    private final ehcs f;
    private final ehim g;
    private final egzp h;
    private final ehdl i;

    static {
        ehai.c = new String[]{"sourceid", "_id", "data_version", "data14", "data_sync2", "starred", "data_sync1"};
        ehai.d = new String[]{"sourceid", "_id", "data_version", "data14", "data_sync2", "data_sync3", "starred", "data_sync1"};
    }

    private ehai(Context context0, Cursor cursor0, ehcs ehcs0, ehim ehim0, egzp egzp0, ehdl ehdl0, boolean z) {
        super(cursor0);
        this.e = context0;
        this.f = ehcs0;
        this.g = ehim0;
        this.h = egzp0;
        this.i = ehdl0;
        this.b = z;
    }

    public static ehai a(Context context0, ehbp ehbp0, Uri uri0, ehcs ehcs0, ehim ehim0, egzp egzp0, ehdl ehdl0, boolean z) {
        boolean z1 = egzo.a().f != 1 && hxdb.e() && z;
        Cursor cursor0 = ehbp0.a(uri0, (z1 ? ehai.d : ehai.c), (!z1 || ehjo.a(context0) != 1 ? "mimetype=\'vnd.android.cursor.item/photo\' AND data_sync2 IS NOT NULL AND (data_sync3 IS NULL OR data_sync3!=data_sync2)" : "mimetype=\'vnd.android.cursor.item/photo\' AND data_sync2 IS NOT NULL AND (data_sync3 IS NULL OR data_sync3!=data_sync2 OR data_sync1 NOT LIKE \'%Sync_High_Res\')"), null, null);
        if(cursor0 != null) {
            return new ehai(context0, cursor0, ehcs0, ehim0, egzp0, ehdl0, z1);
        }
        egig.b("FSA2_SyncDownPhotoCursor", "Failed to query photos need to sync down in CP2");
        throw new ehfh(new RemoteException("Unable to query CP2."));
    }

    @Override  // ehaf
    public final Object b() {
        Exception exception3;
        ehcs ehcs1;
        gfsx gfsx2;
        ehcs ehcs0;
        int v4;
        gfsx gfsx1;
        gfsx gfsx0;
        egiv.R();
        while(this.k()) {
            this.h.d();
            long v = this.g.a();
            String s = this.h("sourceid");
            long v1 = (long)this.g("_id");
            long v2 = v;
            long v3 = (long)this.g("data_version");
            String s1 = this.h("data_sync2");
            String s2 = this.h("data_sync1");
            this.g.h(girk.c, gjgi.d, true, 1, 1);
            SystemClock.elapsedRealtime();
            try {
                if(!this.b) {
                    if(ehcv.d(s2)) {
                        this.c();
                        gfsx0 = gfsx.l(this.f.b(s, 2));
                        goto label_88;
                    }
                    gfsx0 = gfsx.l(this.f.b(s, 1));
                    goto label_88;
                }
                switch(ehai.d(s1, this.h("data_sync3"), s2) - 1) {
                    case 0: {
                        if(ehjo.a(this.e) == 1) {
                            if(!hxdb.c()) {
                                goto label_31;
                            }
                            if(this.h("data14") == null) {
                                this.c();
                                gfsx1 = gfsx.l(this.f.b(s, 2));
                                break;
                            }
                        }
                        v4 = 0;
                        gfsx0 = null;
                        goto label_89;
                    }
                    case 2: {
                        goto label_42;
                    }
                    case 3: {
                        goto label_73;
                    }
                    default: {
                        v4 = 0;
                        gfsx0 = null;
                        goto label_89;
                    }
                }
            }
            catch(acse | ehfd | iapl exception0) {
                goto label_77;
            }
            try {
                v4 = hxdb.d() ? 0 : 1;
                gfsx0 = gfsx1;
                goto label_89;
            }
            catch(acse | ehfd | iapl exception1) {
                exception3 = exception1;
                v4 = 0;
                gfsx0 = gfsx1;
                goto label_80;
            }
            v4 = 1;
            gfsx0 = gfsx1;
            goto label_89;
            try {
            label_31:
                this.c();
                gfsx1 = gfsx.l(this.f.b(s, 2));
            }
            catch(acse | ehfd | iapl exception0) {
                goto label_77;
            }
            try {
                v4 = hxdb.d() ? 0 : 1;
                gfsx0 = gfsx1;
                goto label_89;
            }
            catch(acse | ehfd | iapl exception1) {
                exception3 = exception1;
                v4 = 0;
                gfsx0 = gfsx1;
                goto label_80;
            }
            v4 = 1;
            gfsx0 = gfsx1;
            goto label_89;
            try {
            label_42:
                if(ehjo.a(this.e) == 1) {
                    if(hxdb.c()) {
                        if(this.h("data14") == null) {
                            this.c();
                            ehcs0 = this.f;
                            gfsx1 = gfsx.l(ehcs0.b(s, 2));
                            goto label_48;
                        }
                        gfsx0 = gfsx.l(this.f.b(s, 1));
                        goto label_88;
                    }
                    else {
                        goto label_53;
                    }
                    goto label_68;
                }
                gfsx0 = gfsx.l(this.f.b(s, 1));
                goto label_88;
            }
            catch(acse | ehfd | iapl exception0) {
                goto label_77;
            }
            try {
            label_48:
                v4 = hxdb.d() ^ 1;
            }
            catch(acse | ehfd | iapl exception1) {
                exception3 = exception1;
                v4 = 0;
                gfsx0 = gfsx1;
                goto label_80;
            }
            try {
                gfsx2 = gfsx.l(ehcs0.b(s, 1));
                goto label_68;
            }
            catch(acse | ehfd | iapl exception2) {
                exception3 = exception2;
                gfsx0 = gfsx1;
                goto label_80;
            }
            try {
                gfsx0 = gfsx.l(this.f.b(s, 1));
                goto label_88;
            label_53:
                this.c();
                ehcs1 = this.f;
                gfsx1 = gfsx.l(ehcs1.b(s, 2));
            }
            catch(acse | ehfd | iapl exception0) {
                goto label_77;
            }
            try {
                v4 = hxdb.d() ^ 1;
            }
            catch(acse | ehfd | iapl exception1) {
                exception3 = exception1;
                v4 = 0;
                gfsx0 = gfsx1;
                goto label_80;
            }
            try {
                gfsx2 = gfsx.l(ehcs1.b(s, 1));
            }
            catch(acse | ehfd | iapl exception2) {
                exception3 = exception2;
                gfsx0 = gfsx1;
                goto label_80;
            }
        label_68:
            gfsx gfsx3 = gfsx2;
            gfsx0 = gfsx1;
            goto label_90;
            try {
                gfsx0 = gfsx.l(this.f.b(s, 1));
                goto label_88;
            label_73:
                this.c();
                gfsx0 = gfsx.l(this.f.b(s, 2));
                goto label_88;
            }
            catch(acse | ehfd | iapl exception0) {
            label_77:
                exception3 = exception0;
                v4 = 0;
                gfsx0 = null;
            }
        label_80:
            if(ehfl.a(true, gjgi.d, girk.c, exception3, this.g, 1) == girk.d) {
                this.i.d(1, false);
                return ehah.a(v1);
            }
            if(!(exception3 instanceof ehfd)) {
                continue;
            }
            boolean z = hwzc.a.c().aK();
            Boolean.valueOf(z).getClass();
            if(z) {
                continue;
            }
            goto label_89;
        label_88:
            v4 = 0;
        label_89:
            gfsx3 = null;
        label_90:
            if(gfsx0 != null && gfsx0.i()) {
                int v5 = ((byte[])gfsx0.d()).length;
                if(v5 > 800000) {
                    egig.d("FSA2_SyncDownPhotoCursor", "Contact %s photo too large {size=%d bytes}", new Object[]{s, v5});
                    this.g.r(gjgi.d, girk.c, "IMAGE_TOO_LARGE", null);
                    this.g.h(girk.c, gjgi.d, true, 2, 1);
                    SyncStats syncStats0 = ((ehiv)this.g).a.stats;
                    ++syncStats0.numIoExceptions;
                    gfsx0 = gfqx.a;
                }
            }
            SystemClock.elapsedRealtime();
            if(gfsx0 != null && gfsx0.i()) {
                byte[] arr_b = (byte[])gfsx0.d();
            }
            ContentProviderOperation.Builder contentProviderOperation$Builder0 = ehah.b(v1, v3);
            String s3 = ehcv.c(s2, "REGENERATE_HASH_KEY");
            boolean z1 = this.b;
            if(z1 && v4 != 0 && !hxdb.d()) {
                contentProviderOperation$Builder0.withValue("data_sync1", ehcv.a(ehcv.b(s3), true));
            }
            else {
                contentProviderOperation$Builder0.withValue("data_sync1", s3);
            }
            if(this.g.a() == v2) {
                this.i.d(1, false);
            }
            if(gfsx0 != null) {
                if(z1) {
                    if(gfsx0.i()) {
                        contentProviderOperation$Builder0.withValue("data15", gfsx0.d());
                        return contentProviderOperation$Builder0.withValue("data_sync3", s1).withValue("data_sync4", Long.valueOf(v3 + 11L)).withValue("data_version", Long.valueOf(v3 + 1L));
                    }
                    switch(ehai.d(s1, this.h("data_sync3"), s2) - 1) {
                        case 2: {
                            goto label_118;
                        }
                        case 3: {
                            contentProviderOperation$Builder0.withValue("data15", gfsx0.g());
                            return contentProviderOperation$Builder0.withValue("data_sync3", s1).withValue("data_sync4", Long.valueOf(v3 + 11L)).withValue("data_version", Long.valueOf(v3 + 1L));
                        }
                    }
                    return contentProviderOperation$Builder0.withValue("data_sync3", s1).withValue("data_sync4", Long.valueOf(v3 + 11L)).withValue("data_version", Long.valueOf(v3 + 1L));
                label_118:
                    if(gfsx3 != null) {
                        contentProviderOperation$Builder0.withValue("data15", gfsx3.g());
                        return contentProviderOperation$Builder0.withValue("data_sync3", s1).withValue("data_sync4", Long.valueOf(v3 + 11L)).withValue("data_version", Long.valueOf(v3 + 1L));
                    }
                }
                else {
                    contentProviderOperation$Builder0.withValue("data15", gfsx0.g());
                }
            }
            return contentProviderOperation$Builder0.withValue("data_sync3", s1).withValue("data_sync4", Long.valueOf(v3 + 11L)).withValue("data_version", Long.valueOf(v3 + 1L));
        }
        return null;
    }

    private final void c() {
        this.g.h(girk.c, gjgi.f, true, 1, 1);
    }

    private static final int d(String s, String s1, String s2) {
        if(s1 != null && s1.equals(s)) {
            return ehcv.d(s2) ? 2 : 1;
        }
        return ehcv.d(s2) ? 4 : 3;
    }
}

