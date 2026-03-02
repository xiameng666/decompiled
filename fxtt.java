import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.location.reporting.UploadRequest;
import j..util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.crypto.spec.SecretKeySpec;

public final class fxtt {
    public static final Object a;
    public final Context b;
    public final SharedPreferences c;
    private final Random d;

    static {
        fxtt.a = new Object();
    }

    public fxtt(Context context0, SharedPreferences sharedPreferences0, Random random0) {
        this.b = context0;
        this.c = sharedPreferences0;
        this.d = random0;
        synchronized(fxtt.a) {
            int v1 = sharedPreferences0.getInt("apiLevel", (sharedPreferences0.getAll().isEmpty() ? 3 : 0));
            if(v1 < 2) {
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                sharedPreferences$Editor0.remove("lastPosition");
                sharedPreferences$Editor0.remove("lastActivityProcessedMillis");
                sharedPreferences$Editor0.remove("locationReportingIntentTimestamp");
                sharedPreferences$Editor0.remove("locationReportsSinceLastWifiAttached");
                sharedPreferences$Editor0.apply();
            }
            if(v1 < 3) {
                this.g();
            }
            sharedPreferences0.edit().putInt("apiLevel", 3).apply();
        }
    }

    public static fxtt a(Context context0) {
        fxva.g(context0);
        fxuq.a();
        return new fxtt(context0, context0.getSharedPreferences("LOCATION_REPORTING", 0), new Random());
    }

    public final fxuf b(UploadRequest uploadRequest0, Long long0, long v, String s) {
        fxuf fxuf0;
        long v1 = uploadRequest0.c;
        long v2 = hzek.f();
        if(v1 > v2) {
            fxqw.h(new AssertionError(uploadRequest0 + " duration too long; programming or deserialization error?"));
            v1 = v2;
        }
        synchronized(fxtt.a) {
            ArrayList arrayList0 = new ArrayList(this.e());
            long v4 = long0 == null ? this.c.getLong("uploadRequestId", 0L) + 1L : ((long)long0);
            fxuf0 = new fxuf(v4, v + v1, uploadRequest0, s);
            arrayList0.add(fxuf0);
            String s1 = fxtt.m(arrayList0);
            this.c.edit().putString("uploadRequests", s1).putLong("uploadRequestId", v4).apply();
        }
        return fxuf0;
    }

    public final String c() {
        return this.c.getString("homePlaceId", null);
    }

    public final String d() {
        return this.c.getString("workPlaceId", null);
    }

    public final List e() {
        String s;
        synchronized(fxtt.a) {
            s = this.c.getString("uploadRequests", null);
        }
        if(s == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            byte[] arr_b = Base64.decode(s, 2);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fxrr.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ((fxrr)hftv0).b) {
                fxsa fxsa0 = ((fxrs)object0).e;
                if(fxsa0 == null) {
                    fxsa0 = fxsa.a;
                }
                UploadRequest uploadRequest0 = new UploadRequest(new Account(((fxsa0.b & 2) == 0 ? null : fxsa0.d), ((fxsa0.b & 4) == 0 ? null : fxsa0.e)), fxsa0.f, fxsa0.g, fxsa0.h, fxsa0.i, ((fxsa0.b & 0x80) == 0 ? null : fxsa0.j));
                arrayList0.add(new fxuf(((fxrs)object0).c, ((fxrs)object0).d, uploadRequest0, ((fxrs)object0).f));
            }
            return DesugarCollections.unmodifiableList(arrayList0);
        }
        catch(RuntimeException | hfur exception0) {
            fxqw.g(("Can\'t parse upload request from: " + s), exception0);
            this.c.edit().remove("uploadRequests").apply();
            return Collections.EMPTY_LIST;
        }
    }

    public final SecretKeySpec f() {
        long[] arr_v;
        synchronized(fxtt.a) {
            arr_v = new long[4];
            int v2 = 0;
            while(v2 < 4) {
                SharedPreferences sharedPreferences0 = this.c;
                if(sharedPreferences0.contains("encryptionKey_" + v2)) {
                    arr_v[v2] = sharedPreferences0.getLong("encryptionKey_" + v2, 0L);
                    ++v2;
                    continue;
                }
                else {
                    arr_v = null;
                }
                break;
            }
            if(arr_v == null) {
                SharedPreferences.Editor sharedPreferences$Editor0 = this.c.edit();
                long[] arr_v1 = new long[4];
                for(int v3 = 0; v3 < 4; ++v3) {
                    long v4 = this.d.nextLong();
                    arr_v1[v3] = v4;
                    sharedPreferences$Editor0.putLong("encryptionKey_" + v3, v4);
                }
                sharedPreferences$Editor0.apply();
                arr_v = arr_v1;
            }
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(0x20);
        for(int v1 = 0; v1 < 4; ++v1) {
            byteBuffer0.putLong(arr_v[v1]);
        }
        return new SecretKeySpec(byteBuffer0.array(), "AES");
    }

    public final void g() {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.c.edit();
        sharedPreferences$Editor0.remove("uploadRequests");
        sharedPreferences$Editor0.apply();
    }

    public final void h(String s) {
        if(s == null) {
            return;
        }
        this.c.edit().putString("homePlaceId", s).apply();
    }

    public final void i(long v) {
        this.c.edit().putLong("lastInferredPlacesRefreshTime", v).apply();
    }

    public final void j(String s) {
        if(s == null) {
            return;
        }
        this.c.edit().putString("workPlaceId", s).apply();
    }

    public final boolean k() {
        return this.c.getBoolean("lastDeepStillModeValue", false);
    }

    public final boolean l(Collection collection0) {
        boolean z;
        synchronized(fxtt.a) {
            bxf bxf0 = new bxf();
            bxf0.addAll(this.e());
            z = bxf0.removeAll(collection0);
            String s = fxtt.m(bxf0);
            this.c.edit().putString("uploadRequests", s).apply();
        }
        return z;
    }

    private static final String m(Collection collection0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fxrr.a).v_newBuilder();
        for(Object object0: collection0) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fxrs.a).v_newBuilder();
            long v = ((fxuf)object0).a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((fxrs)hftv0).b |= 1;
            ((fxrs)hftv0).c = v;
            long v1 = ((fxuf)object0).b;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            fxrs fxrs0 = (fxrs)hftp1.b_message;
            fxrs0.b |= 2;
            fxrs0.d = v1;
            UploadRequest uploadRequest0 = ((fxuf)object0).c;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fxsa.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            fxsa fxsa0 = (fxsa)hftp2.b_message;
            fxsa0.b |= 1;
            fxsa0.c = 1;
            Account account0 = uploadRequest0.a;
            if(account0.name != null) {
                String s = account0.name;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fxsa fxsa1 = (fxsa)hftp2.b_message;
                s.getClass();
                fxsa1.b |= 2;
                fxsa1.d = s;
            }
            if(account0.type != null) {
                String s1 = account0.type;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fxsa fxsa2 = (fxsa)hftp2.b_message;
                s1.getClass();
                fxsa2.b |= 4;
                fxsa2.e = s1;
            }
            String s2 = uploadRequest0.b;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            s2.getClass();
            ((fxsa)hftv1).b |= 8;
            ((fxsa)hftv1).f = s2;
            long v2 = uploadRequest0.c;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            ((fxsa)hftv2).b |= 16;
            ((fxsa)hftv2).g = v2;
            long v3 = uploadRequest0.d;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp2.b_message;
            ((fxsa)hftv3).b |= 0x20;
            ((fxsa)hftv3).h = v3;
            long v4 = uploadRequest0.e;
            if(!hftv3.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp2.b_message;
            ((fxsa)hftv4).b |= 0x40;
            ((fxsa)hftv4).i = v4;
            String s3 = uploadRequest0.f;
            if(s3 != null) {
                if(!hftv4.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fxsa fxsa3 = (fxsa)hftp2.b_message;
                fxsa3.b |= 0x80;
                fxsa3.j = s3;
            }
            fxsa fxsa4 = (fxsa)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp1.b_message;
            fxsa4.getClass();
            ((fxrs)hftv5).e = fxsa4;
            ((fxrs)hftv5).b |= 4;
            String s4 = ((fxuf)object0).d;
            if(s4 != null) {
                if(!hftv5.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fxrs fxrs1 = (fxrs)hftp1.b_message;
                fxrs1.b |= 8;
                fxrs1.f = s4;
            }
            fxrs fxrs2 = (fxrs)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fxrr fxrr0 = (fxrr)hftp0.b_message;
            fxrs2.getClass();
            hfuo hfuo0 = fxrr0.b;
            if(!hfuo0.c()) {
                fxrr0.b = ProtoLiteMessage.E(hfuo0);
            }
            fxrr0.b.add(fxrs2);
        }
        return Base64.encodeToString(((fxrr)hftp0.N_build()).toBytesArray(), 2);
    }
}

