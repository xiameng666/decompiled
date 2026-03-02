import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class fdun {
    public final String a;
    public final String b;
    public final Uri c;
    public Boolean d;
    public byte[] e;
    public long f;
    private static final Map g;
    private Map h;

    static {
        fdun.g = Collections.EMPTY_MAP;
    }

    public fdun(fdun fdun0, String s) {
        String s1 = fdun0.a;
        if(s == null) {
            s = fdun0.b;
        }
        this(s1, s, fdun0.f);
        this.h = fdun0.h;
        this.e = fdun0.e;
    }

    public fdun(String s, String s1) {
        this(s, s1, 0L);
    }

    public fdun(String s, String s1, long v) {
        this.d = null;
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("host must not be empty");
        }
        if(TextUtils.isEmpty(s1)) {
            throw new IllegalArgumentException("path must not be empty");
        }
        this.h = fdun.g;
        this.e = null;
        Uri uri0 = new Uri.Builder().scheme("wear").authority(s).path(s1).build();
        this.c = uri0;
        String s2 = uri0.getHost();
        batl.s(s2);
        this.a = s2;
        String s3 = uri0.getPath();
        batl.s(s3);
        this.b = s3;
        this.f = v;
    }

    public fdun(String s, String s1, boolean z, long v) {
        this(s, s1, v);
        this.d = Boolean.valueOf(z);
    }

    public final String a(boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder("DataItemInternal{ ");
        String s = this.a;
        String s1 = this.b;
        int v = s.hashCode() * 0x1F + s1.hashCode();
        int v1 = this.h.size();
        for(Object object0: this.h.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            v1 = v1 * 0x1F + ((String)map$Entry0.getKey()).hashCode();
            if(((fdpo)map$Entry0.getValue()).b != null) {
                String s2 = ((fdpo)map$Entry0.getValue()).b;
                batl.s(s2);
                v1 = v1 * 0x1F + s2.hashCode();
            }
        }
        stringBuilder0.append("@" + Integer.toHexString((v * 0x1F + v1) * 0x1F + (this.e == null ? 0 : Arrays.hashCode(this.e))));
        stringBuilder0.append(", host=" + s);
        stringBuilder0.append(", path=" + s1);
        stringBuilder0.append(", deadline=" + this.f);
        byte[] arr_b = this.e;
        String s3 = arr_b == null ? "null" : ((int)arr_b.length);
        stringBuilder0.append(", dataSz=" + s3.toString());
        stringBuilder0.append(", numAssets=" + this.h.size());
        if(z && !this.h.isEmpty()) {
            stringBuilder0.append(", assets=[");
            String s4 = "";
            for(Object object1: this.h.entrySet()) {
                stringBuilder0.append(s4 + ((String)((Map.Entry)object1).getKey()) + ": " + ((Map.Entry)object1).getValue());
                s4 = ", ";
            }
            stringBuilder0.append("]");
        }
        stringBuilder0.append(" }");
        return stringBuilder0.toString();
    }

    public final Map b() {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.h.keySet()) {
            hashMap0.put(((String)object0), ((fdpo)this.h.get(((String)object0))));
        }
        return DesugarCollections.unmodifiableMap(hashMap0);
    }

    public final byte[] c() {
        return (byte[])MoreObjects.firstNonNull(this.e, new byte[0]);
    }

    public final void d(String s, fdpo fdpo0) {
        if(this.h == fdun.g) {
            this.h = new HashMap();
        }
        this.h.put(s, fdpo0);
    }

    @Override
    public final String toString() {
        return this.a(Log.isLoggable("DataItem", 3));
    }
}

