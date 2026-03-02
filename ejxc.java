import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncResult;
import java.util.ArrayList;

public final class ejxc {
    public static final bboh a;

    static {
        ejxc.a = bboh.b("RemindersSync", bbcu.s);
    }

    public static gefz a(Context context0) {
        return ejws.e(context0, null, true);
    }

    public static gefz b(Context context0, gefz gefz0) {
        return gefz0 == null ? ejws.e(context0, null, true) : ejws.e(context0, gefz0.d, true);
    }

    public static final MessageLite c(int v, byte[] arr_b, ejwv ejwv0, Context context0) {
        try {
            switch(v) {
                case 0: {
                    hfrj hfrj0 = ((ProtoLiteMessage)gedu.a).v_newBuilder().A(arr_b, hftc.a());
                    gefz gefz0 = ((gedu)((ProtoLiteBuilder)hfrj0).b_message).c;
                    if(gefz0 == null) {
                        gefz0 = gefz.a;
                    }
                    gefz gefz1 = ejxc.b(context0, gefz0);
                    if(!((ProtoLiteBuilder)hfrj0).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfrj0).ensureMutable();
                    }
                    gedu gedu0 = (gedu)((ProtoLiteBuilder)hfrj0).b_message;
                    gefz1.getClass();
                    gedu0.c = gefz1;
                    gedu0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp0 = ejwv0.e;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gedo gedo0 = (gedo)hftp0.b_message;
                        gedu gedu1 = (gedu)((ProtoLiteBuilder)hfrj0).N_build();
                        gedu1.getClass();
                        gedo0.d = gedu1;
                        gedo0.b |= 2;
                        gefz gefz2 = ((gedu)((ProtoLiteBuilder)hfrj0).b_message).c;
                        if(gefz2 == null) {
                            gefz2 = gefz.a;
                        }
                        ejwv0.a = gefz2;
                        ++ejwv0.b;
                    }
                    return ((ProtoLiteBuilder)hfrj0).N_build();
                }
                case 1: {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)geed.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((geed)hftv0))).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)(((geed)hftv0))));
                    gefz gefz3 = ((geed)hftp1.b_message).c;
                    if(gefz3 == null) {
                        gefz3 = gefz.a;
                    }
                    gefz gefz4 = ejxc.b(context0, gefz3);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    geed geed0 = (geed)hftp1.b_message;
                    gefz4.getClass();
                    geed0.c = gefz4;
                    geed0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp2 = ejwv0.e;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gedo gedo1 = (gedo)hftp2.b_message;
                        geed geed1 = (geed)hftp1.N_build();
                        geed1.getClass();
                        gedo1.f = geed1;
                        gedo1.b |= 8;
                        gefz gefz5 = ((geed)hftp1.b_message).c;
                        if(gefz5 == null) {
                            gefz5 = gefz.a;
                        }
                        ejwv0.a = gefz5;
                        ++ejwv0.c;
                    }
                    return hftp1.N_build();
                }
                case 2: {
                    hftc hftc1 = hftc.a();
                    ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)geeb.a), arr_b, 0, arr_b.length, hftc1);
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)(((geeb)hftv1))).jf(5, null);
                    hftp3.X(((ProtoLiteMessage)(((geeb)hftv1))));
                    gefz gefz6 = ((geeb)hftp3.b_message).c;
                    if(gefz6 == null) {
                        gefz6 = gefz.a;
                    }
                    gefz gefz7 = ejxc.b(context0, gefz6);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    geeb geeb0 = (geeb)hftp3.b_message;
                    gefz7.getClass();
                    geeb0.c = gefz7;
                    geeb0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp4 = ejwv0.e;
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        gedo gedo2 = (gedo)hftp4.b_message;
                        geeb geeb1 = (geeb)hftp3.N_build();
                        geeb1.getClass();
                        gedo2.g = geeb1;
                        gedo2.b |= 16;
                        gefz gefz8 = ((geeb)hftp3.b_message).c;
                        if(gefz8 == null) {
                            gefz8 = gefz.a;
                        }
                        ejwv0.a = gefz8;
                        ++ejwv0.c;
                    }
                    return hftp3.N_build();
                }
                case 3: {
                    hfrj hfrj1 = ((ProtoLiteMessage)geej.a).v_newBuilder().A(arr_b, hftc.a());
                    gefz gefz9 = ((geej)((ProtoLiteBuilder)hfrj1).b_message).c;
                    if(gefz9 == null) {
                        gefz9 = gefz.a;
                    }
                    gefz gefz10 = ejxc.b(context0, gefz9);
                    if(!((ProtoLiteBuilder)hfrj1).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfrj1).ensureMutable();
                    }
                    geej geej0 = (geej)((ProtoLiteBuilder)hfrj1).b_message;
                    gefz10.getClass();
                    geej0.c = gefz10;
                    geej0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp5 = ejwv0.e;
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gedo gedo3 = (gedo)hftp5.b_message;
                        geej geej1 = (geej)((ProtoLiteBuilder)hfrj1).N_build();
                        geej1.getClass();
                        gedo3.h = geej1;
                        gedo3.b |= 0x20;
                        gefz gefz11 = ((geej)((ProtoLiteBuilder)hfrj1).b_message).c;
                        if(gefz11 == null) {
                            gefz11 = gefz.a;
                        }
                        ejwv0.a = gefz11;
                        ++ejwv0.d;
                    }
                    return ((ProtoLiteBuilder)hfrj1).N_build();
                }
                case 4: {
                    hfrj hfrj2 = ((ProtoLiteMessage)geeh.a).v_newBuilder().A(arr_b, hftc.a());
                    gefz gefz12 = ((geeh)((ProtoLiteBuilder)hfrj2).b_message).c;
                    if(gefz12 == null) {
                        gefz12 = gefz.a;
                    }
                    gefz gefz13 = ejxc.b(context0, gefz12);
                    if(!((ProtoLiteBuilder)hfrj2).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfrj2).ensureMutable();
                    }
                    geeh geeh0 = (geeh)((ProtoLiteBuilder)hfrj2).b_message;
                    gefz13.getClass();
                    geeh0.c = gefz13;
                    geeh0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp6 = ejwv0.e;
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        gedo gedo4 = (gedo)hftp6.b_message;
                        geeh geeh1 = (geeh)((ProtoLiteBuilder)hfrj2).N_build();
                        geeh1.getClass();
                        gedo4.i = geeh1;
                        gedo4.b |= 0x40;
                        gefz gefz14 = ((geeh)((ProtoLiteBuilder)hfrj2).b_message).c;
                        if(gefz14 == null) {
                            gefz14 = gefz.a;
                        }
                        ejwv0.a = gefz14;
                        ++ejwv0.d;
                    }
                    return ((ProtoLiteBuilder)hfrj2).N_build();
                }
                case 5: {
                    hfrj hfrj3 = ((ProtoLiteMessage)gegi.a).v_newBuilder().A(arr_b, hftc.a());
                    gefz gefz15 = ((gegi)((ProtoLiteBuilder)hfrj3).b_message).c;
                    if(gefz15 == null) {
                        gefz15 = gefz.a;
                    }
                    gefz gefz16 = ejxc.b(context0, gefz15);
                    if(!((ProtoLiteBuilder)hfrj3).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfrj3).ensureMutable();
                    }
                    gegi gegi0 = (gegi)((ProtoLiteBuilder)hfrj3).b_message;
                    gefz16.getClass();
                    gegi0.c = gefz16;
                    gegi0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp7 = ejwv0.e;
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        gedo gedo5 = (gedo)hftp7.b_message;
                        gegi gegi1 = (gegi)((ProtoLiteBuilder)hfrj3).N_build();
                        gegi1.getClass();
                        gedo5.l = gegi1;
                        gedo5.b |= 0x200;
                        gefz gefz17 = ((gegi)((ProtoLiteBuilder)hfrj3).b_message).c;
                        if(gefz17 == null) {
                            gefz17 = gefz.a;
                        }
                        ejwv0.a = gefz17;
                        ++ejwv0.b;
                    }
                    return ((ProtoLiteBuilder)hfrj3).N_build();
                }
                case 6: {
                    hfrj hfrj4 = ((ProtoLiteMessage)gegd.a).v_newBuilder().A(arr_b, hftc.a());
                    gefz gefz18 = ((gegd)((ProtoLiteBuilder)hfrj4).b_message).c;
                    if(gefz18 == null) {
                        gefz18 = gefz.a;
                    }
                    gefz gefz19 = ejxc.b(context0, gefz18);
                    if(!((ProtoLiteBuilder)hfrj4).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfrj4).ensureMutable();
                    }
                    gegd gegd0 = (gegd)((ProtoLiteBuilder)hfrj4).b_message;
                    gefz19.getClass();
                    gegd0.c = gefz19;
                    gegd0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp8 = ejwv0.e;
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        gedo gedo6 = (gedo)hftp8.b_message;
                        gegd gegd1 = (gegd)((ProtoLiteBuilder)hfrj4).N_build();
                        gegd1.getClass();
                        gedo6.m = gegd1;
                        gedo6.b |= 0x400;
                        gefz gefz20 = ((gegd)((ProtoLiteBuilder)hfrj4).b_message).c;
                        if(gefz20 == null) {
                            gefz20 = gefz.a;
                        }
                        ejwv0.a = gefz20;
                        ++ejwv0.b;
                    }
                    return ((ProtoLiteBuilder)hfrj4).N_build();
                }
                case 7: {
                    hfrj hfrj5 = ((ProtoLiteMessage)gefc.a).v_newBuilder().A(arr_b, hftc.a());
                    gefz gefz21 = ((gefc)((ProtoLiteBuilder)hfrj5).b_message).c;
                    if(gefz21 == null) {
                        gefz21 = gefz.a;
                    }
                    gefz gefz22 = ejxc.b(context0, gefz21);
                    if(!((ProtoLiteBuilder)hfrj5).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfrj5).ensureMutable();
                    }
                    gefc gefc0 = (gefc)((ProtoLiteBuilder)hfrj5).b_message;
                    gefz22.getClass();
                    gefc0.c = gefz22;
                    gefc0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp9 = ejwv0.e;
                        if(!hftp9.b_message.isImmutable()) {
                            hftp9.ensureMutable();
                        }
                        gedo gedo7 = (gedo)hftp9.b_message;
                        gefc gefc1 = (gefc)((ProtoLiteBuilder)hfrj5).N_build();
                        gefc1.getClass();
                        gedo7.k = gefc1;
                        gedo7.b |= 0x100;
                        gefz gefz23 = ((gefc)((ProtoLiteBuilder)hfrj5).b_message).c;
                        if(gefz23 == null) {
                            gefz23 = gefz.a;
                        }
                        ejwv0.a = gefz23;
                        ++ejwv0.b;
                    }
                    return ((ProtoLiteBuilder)hfrj5).N_build();
                }
                case 8: {
                    hfrj hfrj6 = ((ProtoLiteMessage)gefa.a).v_newBuilder().A(arr_b, hftc.a());
                    gefz gefz24 = ((gefa)((ProtoLiteBuilder)hfrj6).b_message).c;
                    if(gefz24 == null) {
                        gefz24 = gefz.a;
                    }
                    gefz gefz25 = ejxc.b(context0, gefz24);
                    if(!((ProtoLiteBuilder)hfrj6).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfrj6).ensureMutable();
                    }
                    gefa gefa0 = (gefa)((ProtoLiteBuilder)hfrj6).b_message;
                    gefz25.getClass();
                    gefa0.c = gefz25;
                    gefa0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp10 = ejwv0.e;
                        if(!hftp10.b_message.isImmutable()) {
                            hftp10.ensureMutable();
                        }
                        gedo gedo8 = (gedo)hftp10.b_message;
                        gefa gefa1 = (gefa)((ProtoLiteBuilder)hfrj6).N_build();
                        gefa1.getClass();
                        gedo8.j = gefa1;
                        gedo8.b |= 0x80;
                        gefz gefz26 = ((gefa)((ProtoLiteBuilder)hfrj6).b_message).c;
                        if(gefz26 == null) {
                            gefz26 = gefz.a;
                        }
                        ejwv0.a = gefz26;
                        ++ejwv0.b;
                    }
                    return ((ProtoLiteBuilder)hfrj6).N_build();
                }
                case 9: {
                    hfrj hfrj7 = ((ProtoLiteMessage)gedw.a).v_newBuilder().A(arr_b, hftc.a());
                    gefz gefz27 = ((gedw)((ProtoLiteBuilder)hfrj7).b_message).c;
                    if(gefz27 == null) {
                        gefz27 = gefz.a;
                    }
                    gefz gefz28 = ejxc.b(context0, gefz27);
                    if(!((ProtoLiteBuilder)hfrj7).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfrj7).ensureMutable();
                    }
                    gedw gedw0 = (gedw)((ProtoLiteBuilder)hfrj7).b_message;
                    gefz28.getClass();
                    gedw0.c = gefz28;
                    gedw0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp11 = ejwv0.e;
                        if(!hftp11.b_message.isImmutable()) {
                            hftp11.ensureMutable();
                        }
                        gedo gedo9 = (gedo)hftp11.b_message;
                        gedw gedw1 = (gedw)((ProtoLiteBuilder)hfrj7).N_build();
                        gedw1.getClass();
                        gedo9.e = gedw1;
                        gedo9.b |= 4;
                        gefz gefz29 = ((gedw)((ProtoLiteBuilder)hfrj7).b_message).c;
                        if(gefz29 == null) {
                            gefz29 = gefz.a;
                        }
                        ejwv0.a = gefz29;
                        ++ejwv0.b;
                    }
                    return ((ProtoLiteBuilder)hfrj7).N_build();
                }
                case 10: {
                    hfrj hfrj8 = ((ProtoLiteMessage)geds.a).v_newBuilder().A(arr_b, hftc.a());
                    gefz gefz30 = ((geds)((ProtoLiteBuilder)hfrj8).b_message).c;
                    if(gefz30 == null) {
                        gefz30 = gefz.a;
                    }
                    gefz gefz31 = ejxc.b(context0, gefz30);
                    if(!((ProtoLiteBuilder)hfrj8).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfrj8).ensureMutable();
                    }
                    geds geds0 = (geds)((ProtoLiteBuilder)hfrj8).b_message;
                    gefz31.getClass();
                    geds0.c = gefz31;
                    geds0.b |= 1;
                    if(ejwv0 != null) {
                        ProtoLiteBuilder hftp12 = ejwv0.e;
                        if(!hftp12.b_message.isImmutable()) {
                            hftp12.ensureMutable();
                        }
                        gedo gedo10 = (gedo)hftp12.b_message;
                        geds geds1 = (geds)((ProtoLiteBuilder)hfrj8).N_build();
                        geds1.getClass();
                        gedo10.c = geds1;
                        gedo10.b |= 1;
                        geds geds2 = (geds)((ProtoLiteBuilder)hfrj8).b_message;
                        ejwv0.a = geds2.c == null ? gefz.a : geds2.c;
                        ejwv0.b += geds2.d.size();
                    }
                    return ((ProtoLiteBuilder)hfrj8).N_build();
                }
                case 11: {
                    hftc hftc2 = hftc.a();
                    ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gefw.a), arr_b, 0, arr_b.length, hftc2);
                    ProtoLiteMessage.P_makeImmutable(hftv2);
                    return (gefw)hftv2;
                }
                default: {
                    ((ggtj)((ggtj)ejxc.a.i()).ar(0x345F)).H("Unknown operation:%d %s", v, ejxg.a());
                    return null;
                }
            }
        }
        catch(hfur unused_ex) {
            return null;
        }
    }

    public static final void d(long v, ContentResolver contentResolver0) {
        contentResolver0.delete(ContentUris.withAppendedId(ejtw.a, v), null, null);
    }

    public static final boolean e(long v, int v1, ContentResolver contentResolver0) {
        if(((long)(v1 + 1)) >= hxsx.a.h().l()) {
            return true;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("error_count", Integer.valueOf(v1 + 1));
        contentResolver0.update(ContentUris.withAppendedId(ejtw.a, v), contentValues0, null, null);
        return false;
    }

    public static final void f(gedm gedm0, ejwt ejwt0, baqr baqr0, ejth ejth0, ContentResolver contentResolver0, gefz gefz0) {
        ArrayList arrayList0 = new ArrayList();
        String[] arr_s = {gedm0.c, String.valueOf(ejth0.a)};
        arrayList0.add(ContentProviderOperation.newUpdate(ejtz.a).withSelection("client_assigned_id=? AND account_id=?", arr_s).withValue("deleted", Integer.valueOf(1)).build());
        String s = gedm0.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geew.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geew geew0 = (geew)hftp0.b_message;
        gefz0.getClass();
        geew0.c = gefz0;
        geew0.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gedm.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gedm gedm1 = (gedm)hftp1.b_message;
        s.getClass();
        gedm1.b |= 2;
        gedm1.c = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geew geew1 = (geew)hftp0.b_message;
        gedm gedm2 = (gedm)hftp1.N_build();
        gedm2.getClass();
        geew1.b();
        geew1.d.add(gedm2);
        geew geew2 = (geew)hftp0.N_build();
        gefy gefy0 = null;
        try {
            geex geex0 = new ejwt(ejwt0, cmlp.a, cktv.b).b(baqr0, geew2);
            if(geex0.b.size() > 0) {
                gefy0 = (gefy)geex0.b.get(0);
            }
        }
        catch(iapl iapl0) {
            ((ggtj)((ggtj)((ggtj)ejxc.a.i()).s(iapl0)).ar(0x3466)).R("NetworkError when getting task:%s %s", iapl0, ejxg.a());
        }
        catch(acse acse0) {
            ((ggtj)((ggtj)((ggtj)ejxc.a.i()).s(acse0)).ar(0x3467)).R("GoogleAuthException when getting task:%s %s", acse0, ejxg.a());
        }
        if(gefy0 != null) {
            ContentValues contentValues0 = new ContentValues();
            ejxk.c(contentValues0, gefy0);
            contentValues0.put("account_id", Long.valueOf(ejth0.a));
            arrayList0.add(ContentProviderOperation.newInsert(ejtz.b).withValues(contentValues0).build());
        }
        bbeh.c(contentResolver0, arrayList0, "RemindersSync");
    }

    public static final void g(ejth ejth0, SyncResult syncResult0, Context context0) {
        boolean z = syncResult0.madeSomeProgress();
        boolean z1 = ejxf.d(context0, ContentUris.withAppendedId(ejtu.a, ejth0.a), "was_last_sync_error");
        ((ggtj)((ggtj)ejxc.a.i()).ar(0x3475)).X("UpSync failed, madeSomeProgress: %b, wasLastSyncError: %b %s", Boolean.valueOf(syncResult0.madeSomeProgress()), Boolean.valueOf(z1), ejxg.a());
        if(z && z1) {
            ejws.f(ejth0);
            return;
        }
        ++syncResult0.stats.numIoExceptions;
    }
}

