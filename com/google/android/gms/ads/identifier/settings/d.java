package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import bbln;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import hosu;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class d {
    public static final String a;

    static {
        d.a = new VersionInfoParcel(0xF1B18AD, 0xF1B18AD).a;
    }

    public static void a(Context context0, Bundle bundle0) {
        new bbln(10, new c(context0, bundle0));
    }

    public static void b(Context context0, String s, String s1) {
        if(!hosu.k()) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("error_type", s);
        bundle0.putString("error_detail", s1);
        d.a(context0, bundle0);
    }

    public static void c(Context context0, String s, Throwable throwable0) {
        if(!hosu.k()) {
            return;
        }
        String s1 = throwable0 == null ? "NULL_EXCEPTION" : Log.getStackTraceString(throwable0);
        Bundle bundle0 = new Bundle();
        bundle0.putString("error_type", s);
        bundle0.putString("exception", s1);
        d.a(context0, bundle0);
    }

    public static void d(Context context0, String s, String s1) {
        if(!hosu.k()) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("info_type", s);
        bundle0.putString("info_detail", s1);
        d.a(context0, bundle0);
    }

    public static byte[] e(UUID uUID0) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[16]);
        byteBuffer0.putLong(uUID0.getMostSignificantBits());
        byteBuffer0.putLong(uUID0.getLeastSignificantBits());
        return byteBuffer0.array();
    }
}

