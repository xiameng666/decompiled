import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.cryptauth.PlainText;
import java.io.IOException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jeb.synthetic.TWR;

public final class ajge {
    private static final baun a;
    private final Context b;
    private final ajga c;
    private final yhb d;
    private final ajfv e;
    private final ajfn f;
    private final ajgj g;
    private final ajgl h;
    private final ajgh i;
    private final ajiy j;

    static {
        ajge.a = new baun(new String[]{"DeviceSyncController"}, null);
    }

    public ajge(Context context0, ajga ajga0, ajfn ajfn0, yhb yhb0, ajfv ajfv0, ajgj ajgj0, ajiy ajiy0, ajgl ajgl0, ajgh ajgh0) {
        this.b = context0;
        this.c = ajga0;
        this.d = yhb0;
        this.e = ajfv0;
        this.g = ajgj0;
        this.j = ajiy0;
        this.f = ajfn0;
        this.h = ajgl0;
        this.i = ajgh0;
    }

    public final boolean a(Account account0, String s, int v, byte[] arr_b, List list0, int v1, String s1) {
        ajfu ajfu0;
        gmjq gmjq0;
        Class class0;
        gRPCMethodDescriptor iaoj0;
        iakr iakr0;
        gmjx gmjx1;
        gmjx gmjx0;
        gmjp gmjp1;
        gmka gmka0;
        ajgh ajgh0;
        yhc yhc2;
        boolean z1;
        gmke gmke1;
        String s2;
        boolean z;
        gftb.q(((boolean)(this.c.b() ^ 1)));
        try {
            try {
                this.f.f(s, account0);
            }
            catch(ajiv unused_ex) {
                ajge.e(12, s1, v1);
                return true;
            }
            yhc yhc0 = this.d.b(s, account0.name);
            if(yhc0 == null) {
                yhc0 = ajge.d(account0, s);
                z = true;
            }
            else {
                z = false;
            }
            yhc yhc1 = yhc0;
            ByteString hfsf0 = ByteString.copyFrom(hhtk.c(yhc1.c));
            gmkj gmkj0 = ajjl.a(v);
            gmke gmke0 = this.b(account0, s, hfsf0, yhc1.d, gmkj0, arr_b, s1, v1);
            if(hfsf0.equals(gmke0.d)) {
                s2 = s;
                gmke1 = gmke0;
                z1 = z;
            }
            else {
                if(gmke0.d.isEmpty()) {
                    yhc2 = ajge.d(account0, s);
                    ajge.e(17, s1, v1);
                }
                else {
                    try {
                        yhc2 = new yhc(s, account0.name, hhtk.b(gmke0.d.toByteArray()), null);
                    }
                    catch(InvalidKeySpecException invalidKeySpecException0) {
                        throw new ajgn("Couldn\'t parse returned group public key", invalidKeySpecException0);
                    }
                    ajge.e(3, s1, v1);
                }
                yhc1 = yhc2;
                String s3 = account0.name;
                ajfx.a(s, new Object(), this.b.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.RegisteredDeviceSyncProperties", 0), s3.hashCode());
                s2 = s;
                gmke1 = this.b(account0, s, ByteString.copyFrom(hhtk.c(yhc1.c)), yhc1.d, gmkj.k, arr_b, s1, v1);
                z1 = true;
            }
            this.c(gmke1, account0, yhc1, z1, s1, v1);
            ajge.e(2, s1, v1);
            try {
                ajgh0 = this.i;
                try {
                    ajgj ajgj0 = ajgh0.b;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmkk.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gmkk gmkk0 = (gmkk)hftp0.b_message;
                    gmkk0.b = gmkj0.a();
                    gmka0 = ajgj0.a(s2, ((gmkk)hftp0.N_build()));
                }
                catch(ajgo ajgo0) {
                    ajgh.a(11, v1);
                    throw new ajgi("Failed to generate request context", ajgo0);
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmjp.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                gmka0.getClass();
                ((gmjp)hftv0).c = gmka0;
                ((gmjp)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gmjp gmjp0 = (gmjp)hftp1.b_message;
                hfuo hfuo0 = gmjp0.d;
                if(!hfuo0.c()) {
                    gmjp0.d = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(list0, gmjp0.d);
                gmjp1 = (gmjp)hftp1.N_build();
                try {
                    try {
                        gmjx0 = ajgh0.a.a.c();
                    }
                    catch(acse | IOException exception0) {
                        throw new ygb("failed to create stub", exception0, 5);
                    }
                    try {
                        gmjx1 = (gmjx)gmjx0.q(cmlp.a, cjzd.b);
                        iakr0 = gmjx1.a;
                        iaoj0 = gmjy.c;
                        if(iaoj0 == null) {
                            class0 = gmjy.class;
                            __monitor_enter(class0);
                            goto label_74;
                        }
                        goto label_90;
                    }
                    catch(iapn iapn0) {
                        throw new ygb("Failed to make BatchGetFeatureStatusesRequest", iapn0, ajga.c(iapn0.a.t));
                    }
                }
                catch(ygb ygb0) {
                    goto label_95;
                }
            }
            catch(ajgi ajgi0) {
                throw new ajgn("Error in getting feature statuses", ajgi0);
            }
        }
        catch(ajgn ajgn0) {
            goto label_135;
        }
        try {
        label_74:
            gRPCMethodDescriptor iaoj1 = gmjy.c;
            if(iaoj1 == null) {
                gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                iaog0.methodType = gRPCMethodType.a;
                iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.cryptauth.devicesync.v1.DeviceSync", "BatchGetFeatureStatuses");
                iaog0.setSampledToLocalTracing();
                iaog0.requestMarshaller = new ibjh(((MessageLite)gmjp.a));
                iaog0.responseMarshaller = new ibjh(((MessageLite)gmjq.a));
                iaoj1 = iaog0.build();
                gmjy.c = iaoj1;
            }
            __monitor_exit(class0);
            iaoj0 = iaoj1;
            goto label_90;
        }
        catch(Throwable throwable0) {
            try {
                try {
                    try {
                        __monitor_exit(class0);
                        throw throwable0;
                    label_90:
                        gmjq0 = (gmjq)ibjw.b(iakr0, iaoj0, gmjx1.b, gmjp1);
                    }
                    catch(iapn iapn0) {
                        throw new ygb("Failed to make BatchGetFeatureStatusesRequest", iapn0, ajga.c(iapn0.a.t));
                    }
                }
                catch(ygb ygb0) {
                label_95:
                    ajgh.a(ygb0.a, v1);
                    throw new ajgi("Failed to make get feature statuses request", ygb0);
                }
                ajfu0 = ajgh0.c.a();
            }
            catch(ajgi ajgi0) {
                throw new ajgn("Error in getting feature statuses", ajgi0);
            }
            catch(ajgn ajgn0) {
                goto label_135;
            }
        }
        try {
            hfuo hfuo1 = gmjq0.b;
            synchronized(ajfs.class) {
                if(((ajfs)ajfu0).d()) {
                    try {
                        boolean z2 = ((ajfs)ajfu0).f(ajfs.g(s2, account0), ajfr.a(hfuo1));
                        goto label_111;
                    }
                    catch(IOException iOException0) {
                        ajfs.a.n("Error serializing feature status list", iOException0, new Object[0]);
                    }
                }
                goto label_113;
            label_111:
                if(!z2) {
                label_113:
                    ajgh.a(10, v1);
                    throw new ajgi();
                }
            }
        }
        catch(Throwable throwable1) {
            try {
                try {
                    TWR.safeClose$NT(ajfu0, throwable1);
                    throw throwable1;
                }
                catch(ajgi ajgi0) {
                    throw new ajgn("Error in getting feature statuses", ajgi0);
                }
                ajge.a.h("Device sync completed, sending broadcast", new Object[0]);
                ajio.a(2);
                String s4 = account0.name;
                Intent intent0 = new Intent("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FINISHED");
                intent0.setPackage("com.google.android.gms");
                intent0.putExtra("account_name", s4);
                intent0.putExtra("key_name", s2);
                intent0.putExtra("invocation_reason", v);
                this.b.sendBroadcast(intent0);
                ajir.b(2);
                return true;
            }
            catch(ajgn ajgn0) {
            }
        }
    label_135:
        ajir.b(3);
        ajge.a.n("Error in syncing metadata", ajgn0, new Object[0]);
        return false;
    }

    private final gmke b(Account account0, String s, ByteString hfsf0, PrivateKey privateKey0, gmkj gmkj0, byte[] arr_b, String s1, int v) {
        gmjx gmjx0;
        gmka gmka0;
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmkk.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmkk gmkk0 = (gmkk)hftp0.b_message;
            gmkk0.b = gmkj0.a();
            if(s1 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gmkk)hftp0.b_message).c = s1;
            }
            gmkk gmkk1 = (gmkk)hftp0.N_build();
            gmka0 = this.g.a(s, gmkk1);
        }
        catch(ajgo ajgo0) {
            ajge.e(11, s1, v);
            throw new ajgn("Failed to generate request context", ajgo0);
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmkd.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gmka0.getClass();
        ((gmkd)hftv0).c = gmka0;
        boolean z = true;
        ((gmkd)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gmkd)hftv1).d = hfsf0;
        if(privateKey0 != null) {
            z = false;
        }
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gmkd)hftp1.b_message).f = z;
        if(arr_b != null) {
            try {
                String s2 = account0.name;
                Object object0 = new Object();
                SharedPreferences sharedPreferences0 = this.b.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.RegisteredDeviceSyncProperties", 0);
                int v1 = s2.hashCode();
                byte[] arr_b1 = null;
                String s3 = sharedPreferences0.getString(ajfx.b("SYNCED_ENCRYPTED_METADATA", s, v1), null);
                if(s3 != null) {
                    try {
                        arr_b1 = bbmu.f(s3);
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                }
                if(arr_b1 == null) {
                    PublicKey publicKey0 = hhtk.b(hfsf0.toByteArray());
                    arr_b1 = this.j.f(publicKey0, arr_b).c;
                }
                ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gmkd)hftp1.b_message).e = hfsf1;
                synchronized(object0) {
                    sharedPreferences0.edit().putString(ajfx.b("SYNCED_ENCRYPTED_METADATA", s, v1), bbmu.c(arr_b1)).commit();
                }
            }
            catch(ajgp | InvalidKeySpecException exception0) {
                ajge.e(16, s1, v);
                throw new ajgn("Couldn\'t encrypt metadata", exception0);
            }
        }
        try {
            gmkd gmkd0 = (gmkd)hftp1.N_build();
            try {
                gmjx0 = this.c.a.c();
            }
            catch(acse | IOException exception1) {
                throw new ygb("failed to create stub", exception1, 5);
            }
            try {
                gmjx gmjx1 = (gmjx)gmjx0.q(cmlp.a, cjzf.b);
                iakr iakr0 = gmjx1.a;
                gRPCMethodDescriptor iaoj0 = gmjy.a;
                if(iaoj0 == null) {
                    synchronized(gmjy.class) {
                        gRPCMethodDescriptor iaoj1 = gmjy.a;
                        if(iaoj1 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.cryptauth.devicesync.v1.DeviceSync", "SyncMetadata");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gmkd.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gmke.a));
                            iaoj1 = iaog0.build();
                            gmjy.a = iaoj1;
                        }
                        iaoj0 = iaoj1;
                    }
                }
                return (gmke)ibjw.b(iakr0, iaoj0, gmjx1.b, gmkd0);
            }
            catch(iapn iapn0) {
                throw new ygb("Failed to make SyncMetadataRequest", iapn0, ajga.c(iapn0.a.t));
            }
        }
        catch(ygb ygb0) {
            ajge.e(ygb0.a, s1, v);
            throw new ajgn("Failed to make sync metadata request", ygb0);
        }
    }

    private final void c(gmke gmke0, Account account0, yhc yhc0, boolean z, String s, int v) {
        boolean z1;
        SQLiteDatabase sQLiteDatabase0;
        PrivateKey privateKey0;
        int v1 = 1;
        String s1 = yhc0.a;
        if((gmke0.b & 1) != 0) {
            gmjz gmjz0 = gmke0.e == null ? gmjz.a : gmke0.e;
            if(!gmjz0.d.isEmpty()) {
                try {
                    privateKey0 = yha.a(this.f.f(s1, account0).d);
                    goto label_10;
                }
                catch(ajiv | InvalidKeySpecException exception0) {
                }
                catch(ajgp exception1) {
                    ajge.e(13, s, v);
                    throw new ajgn("Failed to decrypt group private key", exception1);
                }
                try {
                    ajge.e(12, s, v);
                    throw new ajgn("Couldn\'t retrieve device public key", exception0);
                label_10:
                    byte[] arr_b = gmjz0.d.toByteArray();
                    PlainText plainText0 = this.j.d(privateKey0, account0, arr_b);
                    String s2 = account0.name;
                    PrivateKey privateKey1 = yha.a(plainText0.c);
                    yhc0 = new yhc(s1, s2, yhc0.c, privateKey1);
                    z = true;
                    goto label_22;
                }
                catch(ajgp | InvalidKeySpecException exception1) {
                }
                ajge.e(13, s, v);
                throw new ajgn("Failed to decrypt group private key", exception1);
            }
            ajge.e(18, s, v);
            throw new ajgn("Received empty group private key");
        }
    label_22:
        if(z) {
            try {
                ajfo ajfo0 = ajfo.c(((ajfp)this.d).a);
                try {
                    sQLiteDatabase0 = ajfo0.getWritableDatabase();
                }
                catch(SQLiteException sQLiteException0) {
                    throw new yhe(sQLiteException0);
                }
                sQLiteDatabase0.beginTransaction();
                try {
                    ContentValues contentValues0 = new ContentValues();
                    String s3 = yhc0.b;
                    contentValues0.put("account", s3);
                    String s4 = yhc0.a;
                    contentValues0.put("key_name", s4);
                    contentValues0.put("public_key", bbmu.c(hhtk.d(yhc0.c)));
                    PrivateKey privateKey2 = yhc0.d;
                    if(privateKey2 == null) {
                        v1 = 2;
                    }
                    else {
                        contentValues0.put("private_key", bbmu.c(hhtk.e(privateKey2)));
                        sQLiteDatabase0.delete("group_keys", "key_name = ? AND account = ? AND key_state = " + 2, new String[]{s4, s3});
                    }
                    contentValues0.put("key_state", Integer.valueOf(v1));
                    if(sQLiteDatabase0.insertWithOnConflict("group_keys", null, contentValues0, 5) < 0L) {
                        throw new yhe(a.a(s4, "Failed to add key=", " to the database."));
                    }
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                    ajfo0.close();
                }
            }
            catch(yhe yhe0) {
                ajge.e(8, s, v);
                throw new ajgn("Failed to save group key", yhe0);
            }
        }
        if(yhc0.d != null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: gmke0.c) {
                gmjv gmjv0 = (gmjv)object0;
                if(!gmjv0.c.isEmpty()) {
                    arrayList0.add(gmjv0);
                }
            }
            try(ajfu ajfu0 = this.e.a()) {
                synchronized(ajfs.class) {
                    if(!((ajfs)ajfu0).d()) {
                        ajge.e(9, s, v);
                        throw new ajgn("Failed to persist device metadata");
                    }
                    List list0 = ((ajfs)ajfu0).b(s1, account0);
                    if(list0 == null) {
                        z1 = ((ajfs)ajfu0).e(s1, account0, arrayList0);
                    }
                    else {
                        HashMap hashMap0 = new HashMap();
                        Iterator iterator1 = list0.iterator();
                        while(true) {
                            if(!iterator1.hasNext()) {
                                break;
                            }
                            Object object1 = iterator1.next();
                            hashMap0.put(((gmjv)object1).b, ((gmjv)object1));
                        }
                        Iterator iterator2 = arrayList0.iterator();
                        while(true) {
                            if(!iterator2.hasNext()) {
                                break;
                            }
                            Object object2 = iterator2.next();
                            hashMap0.put(((gmjv)object2).b, ((gmjv)object2));
                        }
                        z1 = ((ajfs)ajfu0).e(s1, account0, ggia.b(hashMap0.values()));
                    }
                }
                if(!z1) {
                    ajge.e(9, s, v);
                    throw new ajgn("Failed to persist device metadata");
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object3: gmke0.c) {
                gmjv gmjv1 = (gmjv)object3;
                if(gmjv1.d) {
                    arrayList1.add(gmjv1);
                }
            }
            if(!arrayList1.isEmpty()) {
                try {
                    this.h.a(account0, s1, arrayList1, v);
                }
                catch(ajgm ajgm0) {
                    throw new ajgn("Couldn\'t share group key", ajgm0);
                }
            }
        }
    }

    private static final yhc d(Account account0, String s) {
        KeyPair keyPair0 = hhus.d();
        return new yhc(s, account0.name, keyPair0.getPublic(), keyPair0.getPrivate());
    }

    private static final void e(int v, String s, int v1) {
        ajir.a(new ajiq(3, v, s, v1));
    }
}

