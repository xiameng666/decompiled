import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri.Builder;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.authzen.cryptauth.SyncAlarmIntentOperation;

public final class aiix {
    public final Object a;
    public final aiic b;
    public static final baun c;
    private static final gged_interceptors d;
    private static aiix e;
    private final Context f;
    private final aiiw g;
    private final aikj h;
    private final aiit i;
    private final SharedPreferences j;
    private final aijz k;

    static {
        aiix.d = gged_interceptors.n(Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(200));
        aiix.c = new baun(new String[]{"SyncManager"});
    }

    private aiix(Context context0) {
        aiic aiic0 = new aiic(context0);
        aiiw aiiw0 = new aiiw(context0, new bbib(context0));
        aikj aikj0 = aikj.a();
        aiit aiit0 = aiit.b(context0);
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.android.gms.auth.authzen.cryptauth.SyncManager.proximity_features", 0);
        aijz aijz0 = new aijz(context0);
        super();
        this.f = context0;
        this.b = aiic0;
        this.g = aiiw0;
        batl.s(aiit0);
        this.i = aiit0;
        batl.s(aikj0);
        this.h = aikj0;
        batl.s(sharedPreferences0);
        this.j = sharedPreferences0;
        this.k = aijz0;
        this.a = new Object();
    }

    public static aiix a(Context context0) {
        synchronized(aiix.class) {
            if(aiix.e == null) {
                aiix.e = new aiix(context0.getApplicationContext());
            }
        }
        return aiix.e;
    }

    static String b(int v, String s) {
        return String.format("lastSyncedTime:%d:%s", v, s);
    }

    public final void c(int v, int v1) {
        synchronized(this.a) {
            for(Object object1: this.b.a()) {
                this.d(v, ((Account)object1).name, v1);
            }
        }
    }

    public final void d(int v, String s, int v1) {
        synchronized(this.a) {
            this.e(v, s, 3, v1, 0);
        }
    }

    public final void e(int v, String s, int v1, int v2, int v3) {
        long v10;
        int v9;
        long v7;
        long v5;
        baun baun0 = aiix.c;
        baun0.h("Sync requested for event %d, account %s, and components %x, with reason %d", new Object[]{v, baun.q(s), v1, v2});
        if((v1 & 1) != 0) {
            this.f(v, s, v2, v3);
        }
        if((v1 & 2) != 0) {
            switch(v) {
                case 100: {
                label_9:
                    long v4 = System.currentTimeMillis();
                    batl.b(v != 300);
                    if(v == 100) {
                        v5 = 0L;
                    }
                    else {
                        if(v == 0) {
                            gged_interceptors gged0 = aiix.d;
                            int v6 = ((ggna)gged0).c;
                            v7 = 0x8000000000000000L;
                            for(int v8 = 0; v8 < v6; ++v8) {
                                v7 = Math.max(v7, this.g(((Integer)gged0.get(v8)).intValue(), s));
                            }
                            v9 = 0;
                        }
                        else {
                            v7 = this.g(v, s);
                            v9 = v;
                        }
                        switch(v9) {
                            case 0: {
                                v10 = hpqx.a.c().f();
                                goto label_35;
                            }
                            case 100: {
                                v10 = 0L;
                                goto label_35;
                            }
                            case 200: {
                                goto label_34;
                            }
                        }
                        v10 = hpqx.a.c().b();
                        goto label_35;
                    label_34:
                        v10 = hpqx.a.c().g();
                    label_35:
                        v5 = v10 - (v4 - v7);
                    }
                    if(v5 <= 0L) {
                        this.j.edit().putLong(aiix.b(v, s), v4).commit();
                        this.i.c(s, v2);
                        return;
                    }
                    baun0.h("avoiding sync because the last sync was too recent", new Object[0]);
                    if(v != 0) {
                        Long long0 = v5;
                        baun0.h("scheduling sync for %d at %d", new Object[]{v, long0});
                        Intent intent0 = IntentOperation.getStartIntent(this.f, SyncAlarmIntentOperation.class, "com.google.android.gms.auth.authzen.cryptauth.SyncAlarmIntent");
                        intent0.setData(new Uri.Builder().scheme("content").authority("com.google.android.gms.auth.be.cryptauth.sync").appendQueryParameter("eventType", Integer.toString(v)).appendQueryParameter("accountName", s).appendQueryParameter("syncComponent", Integer.toString(2)).build());
                        intent0.putExtra("invocationReason", v2);
                        intent0.putExtra("retryCount", v3);
                        aiiw aiiw0 = this.g;
                        Context context0 = aiiw0.a;
                        if(PendingIntent.getService(context0, 0, intent0, 0x22000000) == null) {
                            baun0.h("Setting up sync %dms later.", new Object[]{long0});
                            long v11 = SystemClock.elapsedRealtime() + v5;
                            PendingIntent pendingIntent0 = PendingIntent.getService(context0, 0, intent0, 0xA000000);
                            aiiw0.b.d("CryptAuthSync SyncManager", 3, v11, pendingIntent0, "com.google.android.gms");
                            return;
                        }
                        baun0.h("Sync not scheduled because there\'s an existing PendingIntent.", new Object[0]);
                        return;
                    }
                    return;
                }
                case 300: {
                    break;
                }
                default: {
                    if(!this.h(s) && !this.k.c(s)) {
                        baun0.h("Ignoring proximity features sync because it\'s not enabled, and force sync is not requested", new Object[0]);
                        return;
                    }
                    goto label_9;
                }
            }
            baun0.m("update_registration is not applicable to proximity features.", new Object[0]);
        }
    }

    public final boolean f(int v, String s, int v1, int v2) {
        int v4;
        int v3 = 2;
        switch(v) {
            case 100: {
                aiix.c.h("Triggering AuthZen registration...", new Object[0]);
                v4 = 2;
                break;
            }
            case 0: 
            case 200: {
                aiix.c.h("Triggering AuthZen registration check...", new Object[0]);
                v4 = 1;
                break;
            }
            case 300: {
                v4 = 3;
                break;
            }
            default: {
                aiix.c.f("Unknown event type: %d.", new Object[]{v});
                return false;
            }
        }
        if(v4 != 1 || !this.h(s)) {
            v3 = v4;
        }
        Object object0 = this.a;
        return this.h.b(v3, s, v1, v2);
    }

    private final long g(int v, String s) {
        return this.j.getLong(aiix.b(v, s), 0L);
    }

    private final boolean h(String s) {
        return this.k.c(s) ? false : bbmq.S() || hprq.a.b().a();
    }
}

