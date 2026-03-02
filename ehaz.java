import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings.Global;

public final class ehaz {
    public final Context a;
    public final efur b;
    public final ehim c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public ehaz(Context context0, efur efur0, ehim ehim0, String s, boolean z) {
        this.a = context0;
        this.b = efur0;
        this.c = ehim0;
        this.d = s;
        this.e = z;
        this.f = hxbk.a.c().h();
    }

    public final void a() {
        if(hxbk.a.c().l()) {
            ehim ehim0 = this.c;
            if(((ehiv)ehim0).y || this.e) {
                Context context0 = this.a;
                if(Settings.Global.getInt(context0.getContentResolver(), "device_provisioned", 0) == 1) {
                    ehim0.m(true, ehcz.a(context0).c());
                    ehcz.a(context0).c();
                    return;
                }
                ehim0.m(false, 0L);
                ehcz.a(context0).c();
            }
        }
    }

    public final void b(int v) {
        SharedPreferences sharedPreferences0 = this.b.a;
        String s = this.d;
        int v1 = this.b.M(s);
        long v2 = System.currentTimeMillis();
        if(v1 != v || (v2 - sharedPreferences0.getLong("focus_first_full_sync_status_last_log_timestamp_" + s, 0L)) / 1000L >= hxdh.a.c().a()) {
            ehim ehim0 = this.c;
            long v3 = sharedPreferences0.getLong("focus_first_full_sync_initial_timestamp_" + s, 0L);
            long v4 = sharedPreferences0.getLong("focus_first_full_sync_start_timestamp_" + s, 0L);
            long v5 = sharedPreferences0.getLong("focus_first_full_sync_finish_timestamp_" + s, 0L);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girq.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((girq)hftv0).c = v1 - 1;
            ((girq)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((girq)hftv1).b |= 2;
            ((girq)hftv1).d = v3;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((girq)hftv2).b |= 4;
            ((girq)hftv2).e = v4;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            girq girq0 = (girq)hftp0.b_message;
            girq0.b |= 8;
            girq0.f = v5;
            ((ehiv)ehim0).z = (girq)hftp0.N_build();
            batl.k(null);
            sharedPreferences0.edit().putLong("focus_first_full_sync_status_last_log_timestamp_" + s, v2).commit();
        }
        this.a();
    }
}

