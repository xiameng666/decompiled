import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.regex.Matcher;

public final class bwjo extends wby implements bwjp {
    private final Context a;
    private final bsvs b;

    public bwjo() {
        super("com.google.android.gms.http.IGoogleHttpService");
    }

    public bwjo(Context context0) {
        super("com.google.android.gms.http.IGoogleHttpService");
        this.a = context0.getApplicationContext();
        this.b = bsvs.a();
    }

    @Override  // bwjp
    public final Bundle a(String s) {
        Bundle bundle0;
        CharSequence charSequence0;
        bsvt bsvt0;
        this.c();
        long v = Binder.clearCallingIdentity();
        try {
            bsvv bsvv0 = bsvv.a(this.a);
            Matcher matcher0 = bsvv0.c.matcher(s);
            int v2 = 0;
            if(matcher0.lookingAt()) {
                int v3 = 0;
                while(true) {
                    bsvt[] arr_bsvt = bsvv0.b;
                    if(v3 >= arr_bsvt.length) {
                        break;
                    }
                    if(matcher0.group(v3 + 1) != null) {
                        bsvt0 = arr_bsvt[v3];
                        goto label_18;
                    }
                    ++v3;
                }
            }
            bsvt0 = bsvt.a;
        label_18:
            bundle0 = null;
            if(bsvt0.d) {
                charSequence0 = null;
            }
            else {
                charSequence0 = bsvt0.c == null ? s : bsvt0.c + s.substring(bsvt0.b.length());
            }
            if(!TextUtils.equals(charSequence0, s)) {
                bundle0 = new Bundle();
                if(charSequence0 == null) {
                    bundle0.putString("block", "1");
                }
                else {
                    bundle0.putString("rewrite", ((String)charSequence0));
                }
            }
            if(bundle0 != null && bundle0.containsKey("block")) {
                Log.w("GCM.HTTP", "HTTP request blocked due to server rule: " + s);
            }
            else {
                if(bundle0 != null && bundle0.containsKey("rewrite")) {
                    s = bundle0.getString("rewrite");
                }
                bsvs bsvs0 = this.b;
                if(bsvs.b()) {
                    String s1 = bsvs.c(s);
                    if(s1 != null) {
                        Map map0 = bsvs0.b;
                        synchronized(map0) {
                            bsvr bsvr0 = (bsvr)map0.get(s1);
                            if(bsvr0 != null && bsvr0.c > SystemClock.elapsedRealtime()) {
                                Log.i("GCM.HTTP", "Last HTTP status code for blocked entry: " + bsvr0.d);
                                v2 = 2;
                            }
                        }
                    }
                }
                if(v2 == 2) {
                    bundle0 = new Bundle();
                    bundle0.putString("name", "temporary_blocked" + 2);
                    bundle0.putString("block", "1");
                    Log.w("GCM.HTTP", "HTTP request blocked due to automatic backoff: " + s);
                }
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
        return bundle0;
    }

    @Override  // bwjp
    public final void b(String s, int v) {
        this.c();
        long v1 = Binder.clearCallingIdentity();
        try {
            bsvs bsvs0 = this.b;
            if(bsvs.b()) {
                String s1 = bsvs.c(s);
                if(s1 != null) {
                    int v2 = 429;
                    Map map0 = bsvs0.b;
                    synchronized(map0) {
                        if(v <= 0 || v >= 500) {
                            v2 = v;
                            goto label_13;
                        }
                        else if(v == 429) {
                        label_13:
                            bsvr bsvr0 = (bsvr)map0.get(s1);
                            if(bsvr0 != null) {
                            label_21:
                                int v3 = bsvr0.a + 1;
                                bsvr0.a = v3;
                                if(v3 > 3) {
                                    bsvr0.b = ((long)(bsvr0.e.a.nextInt(9000) + 1000)) + Math.min(((long)bsvr0.a) * 1000L, 86400000L);
                                    bsvr0.c = SystemClock.elapsedRealtime() + bsvr0.b;
                                }
                                bsvr0.d = v2;
                            }
                            else if(((bzs)map0).d_num < 100) {
                                bsvr0 = new bsvr(bsvs0);
                                map0.put(s1, bsvr0);
                                goto label_21;
                            }
                            else {
                                Log.w("GCM.HTTP", "Backoff lookup map has grown too big. Not considering for backoff newly failing url: " + s);
                            }
                        }
                        else {
                            map0.remove(s1);
                        }
                    }
                }
            }
            if(v > 0) {
                clll.a(this.a, btar.b);
            }
        }
        catch(Throwable throwable0) {
            Binder.restoreCallingIdentity(v1);
            throw throwable0;
        }
        Binder.restoreCallingIdentity(v1);
    }

    private final void c() {
        int v = Binder.getCallingUid();
        if(v != Process.myUid() && !azql.c(this.a).i(v)) {
            throw new SecurityException("Uid is not Google Signed");
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                bwjo.gr(parcel0);
                Bundle bundle0 = this.a(s);
                parcel1.writeNoException();
                wbz.g(parcel1, bundle0);
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                int v1 = parcel0.readInt();
                bwjo.gr(parcel0);
                this.b(s1, v1);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

