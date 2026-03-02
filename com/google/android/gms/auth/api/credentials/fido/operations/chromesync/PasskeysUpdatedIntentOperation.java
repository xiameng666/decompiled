package com.google.android.gms.auth.api.credentials.fido.operations.chromesync;

import aepg;
import aflt;
import afwq;
import afwr;
import afwt;
import aggi;
import android.content.Intent;
import android.util.Pair;
import bboh;
import bxrz;
import bxsy;
import com.google.android.chimera.IntentOperation;
import gged_interceptors;
import ggtj;
import gmap;
import gmbu;
import gmcd;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class PasskeysUpdatedIntentOperation extends IntentOperation {
    public static final bboh a;

    static {
        PasskeysUpdatedIntentOperation.a = aggi.a("PasskeysUpdatedIntentOperation");
    }

    public static void b() {
        bxsy bxsy0 = ((bxrz)aepg.a.mr()).N().c();
        bxsy bxsy1 = ((afwq)afwr.a.mr()).a(null, "").c();
        gmbu.t(gmbu.b(new gmcd[]{bxsy0, bxsy1}).a(() -> try {
            return Pair.create(((String)gmbu.r(bxsy0)), ((gged_interceptors)gmbu.r(bxsy1)));
        }
        catch(ExecutionException | CancellationException exception0) {
            ByteBuffer byteBuffer0 = aflt.f();
            String s = byteBuffer0 == null ? null : aflt.e(byteBuffer0);
            if(s != null) {
                return Pair.create(s, ((gged_interceptors)gmbu.r(bxsy1)));
            }
            throw exception0;
        }, gmap.a), new afwt(), gmap.a);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!aflt.g()) {
            return;
        }
        String s = intent0.getAction();
        if((s == null || !s.equals("com.google.android.gms.auth.api.credentials.PASSKEYS_UPDATED")) && aflt.d().exists()) {
            int v = aflt.a(aflt.f());
            if(v != 1) {
                ((ggtj)PasskeysUpdatedIntentOperation.a.h()).an(v);
                goto label_10;
            }
            ((ggtj)PasskeysUpdatedIntentOperation.a.h()).z("Using passkey-cache with version %d", 1);
            return;
        }
    label_10:
        PasskeysUpdatedIntentOperation.b();
    }
}

