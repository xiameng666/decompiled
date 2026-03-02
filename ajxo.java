import android.content.Context;
import android.security.keystore.recovery.DecryptionFailedException;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.KeyChainProtectionParams.Builder;
import android.security.keystore.recovery.KeyChainProtectionParams;
import android.security.keystore.recovery.KeyDerivationParams;
import android.security.keystore.recovery.RecoveryController;
import android.security.keystore.recovery.RecoverySession;
import android.security.keystore.recovery.SessionExpiredException;
import android.security.keystore.recovery.WrappedApplicationKey.Builder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

public final class ajxo implements AutoCloseable {
    private static final baun a;
    private static final bboh b;
    private final ajxq c;
    private final Context d;
    private gmls e;
    private RecoverySession f;
    private final String g;

    static {
        ajxo.a = akea.a("KeyRecoveryController");
        ajxo.b = akea.b("KeyRecoveryController");
    }

    public ajxo(Context context0, ajxq ajxq0, String s) {
        this.c = ajxq0;
        this.d = context0;
        this.g = s;
    }

    public final gmlm a() {
        gmll gmll0 = this.c(5);
        ajxo.a.h("Using vault service for account \'%s\'", new Object[]{baun.q(this.c.a.name)});
        gmlm gmlm0 = new ajzg(this.d, this.c.a).b(gmll0);
        this.e = gmlm0.c == null ? gmls.a : gmlm0.c;
        return gmlm0;
    }

    public final void b(String s) {
        ajxe ajxe0;
        Object object3;
        ArrayList arrayList1;
        String s1;
        boolean z;
        PrivateKey privateKey0;
        grdt grdt0;
        Throwable throwable1;
        Class class0;
        akbl akbl0;
        ajxc ajxc1;
        Throwable throwable0;
        Map map0;
        if(this.f == null) {
            throw new ajxr("Cannot import application keys before starting session", 15);
        }
        byte[] arr_b = this.d().f.toByteArray();
        hfuo hfuo0 = this.d().g;
        ArrayList arrayList0 = new ArrayList(hfuo0.size());
        for(Object object0: hfuo0) {
            gmlh gmlh0 = (gmlh)object0;
            ByteString hfsf0 = gmlh0.b == 3 ? ((ByteString)gmlh0.c) : ByteString.b;
            if(!hfsf0.isEmpty()) {
                arrayList0.add(new WrappedApplicationKey.Builder().setAlias(gmlh0.d).setEncryptedKeyMaterial(hfsf0.toByteArray()).build());
            }
            else if(gmlh0.b == 4) {
                arrayList0.add(new WrappedApplicationKey.Builder().setAlias(gmlh0.d).setEncryptedKeyMaterial((gmlh0.b == 4 ? ((gmli)gmlh0.c) : gmli.a).d.toByteArray()).build());
            }
        }
        ((ggtj)ajxo.b.h()).z("Attempting to recover %d application keys", arrayList0.size());
        try {
            map0 = this.f.recoverKeyChainSnapshot(arr_b, arrayList0);
            ((ggtj)ajxo.b.h()).z("Got %d keys back from framework", map0.size());
            throwable0 = null;
            this.e = null;
        }
        catch(SessionExpiredException sessionExpiredException0) {
            throw new ajxr("Recovery session expired", ((Throwable)sessionExpiredException0), 15);
        }
        catch(DecryptionFailedException decryptionFailedException0) {
            throw new ajxr("Client crypto error", ((Throwable)decryptionFailedException0), 13);
        }
        catch(InternalRecoveryServiceException | NullPointerException exception0) {
            throw new ajxr("Failed to recover snapshot", exception0, 16);
        }
        for(Object object1: hfuo0) {
            gmlh gmlh1 = (gmlh)object1;
            if(gmlh1.b == 4) {
                gmli gmli0 = (gmli)gmlh1.c;
                Key key0 = (Key)map0.get(gmlh1.d);
                if(key0 == null) {
                    ((ggtj)ajxo.b.j()).x("Snapshot has AsymmetricKeyPair, but wrapping key was not recovered");
                }
                else {
                    try {
                        byte[] arr_b1 = akdy.q(key0, gmli0.c);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ajxc.a).v_newBuilder();
                        ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((ajxc)hftp0.b_message).d = hfsf1;
                        ByteString hfsf2 = gmli0.b;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ajxc ajxc0 = (ajxc)hftp0.b_message;
                        hfsf2.getClass();
                        ajxc0.c = hfsf2;
                        ajxc1 = (ajxc)hftp0.N_build();
                    }
                    catch(BadPaddingException | InvalidKeyException | IllegalBlockSizeException exception1) {
                        a.ae(ajxo.b.j(), "Could not decrypt AsymmetricKeyPair.", exception1);
                        return;
                    }
                    try {
                        akbm akbm0 = new akbm();
                        akbm0.a = this.c.a;
                        akbm0.b = akbn.e;
                        akbl0 = new akbl(akbm0.a());
                        class0 = akbl.class;
                        __monitor_enter(class0);
                    }
                    catch(akbi akbi0) {
                        throwable1 = throwable0;
                        goto label_139;
                    }
                    try {
                        akbl.a.h("Recovering security domain keys.", new Object[0]);
                        grdt0 = akbl0.f(akbl.i(ajxc1.c.toByteArray()));
                    }
                    catch(akbi akbi1) {
                        throwable1 = throwable0;
                        goto label_131;
                    }
                    catch(Throwable throwable2) {
                        throwable1 = throwable0;
                        goto label_136;
                    }
                    try {
                        grff grff0 = akbl0.b().d(grdt0);
                        privateKey0 = akbl.j(ajxc1.d.toByteArray());
                        z = false;
                        Iterator iterator2 = grff0.e.iterator();
                    alab1:
                        while(true) {
                        label_77:
                            if(!iterator2.hasNext()) {
                                goto label_116;
                            }
                            Object object2 = iterator2.next();
                            s1 = akbl.g(((grfe)object2).c);
                            hfuo hfuo1 = ((grfe)object2).d;
                            arrayList1 = new ArrayList();
                            Iterator iterator3 = hfuo1.iterator();
                            while(true) {
                            label_83:
                                if(!iterator3.hasNext()) {
                                    goto label_109;
                                }
                                object3 = iterator3.next();
                                throwable1 = throwable0;
                                break alab1;
                            }
                        }
                    }
                    catch(ajqz ajqz0) {
                        throwable1 = throwable0;
                        goto label_121;
                    }
                    catch(akbi akbi1) {
                        throwable1 = throwable0;
                        goto label_131;
                    }
                    catch(Throwable throwable2) {
                        throwable1 = throwable0;
                        goto label_136;
                    }
                    try {
                        int v = ((grfn)object3).b;
                        byte[] arr_b2 = akbl.C(privateKey0, ((grfn)object3).c.toByteArray());
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ajxe.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((ajxe)hftp1.b_message).c = v;
                        ByteString hfsf3 = ByteString.copyFrom(arr_b2);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((ajxe)hftp1.b_message).d = hfsf3;
                        arrayList1.add(((ajxe)hftp1.N_build()));
                        throwable0 = throwable1;
                        goto label_83;
                        try {
                        label_109:
                            throwable1 = throwable0;
                            akbl0.c.K(akbl0.e.name, s1, arrayList1, akbl0.d.e, 11);
                            throwable0 = throwable1;
                            z = true;
                            goto label_77;
                        }
                        catch(IOException | acse exception2) {
                            throw new akbi(13, exception2);
                        }
                    label_116:
                        throwable1 = throwable0;
                        if(z) {
                            akbl0.t();
                        }
                        goto label_128;
                    }
                    catch(ajqz ajqz0) {
                    }
                    catch(akbi akbi1) {
                        goto label_131;
                    }
                    catch(Throwable throwable2) {
                        goto label_136;
                    }
                    try {
                    label_121:
                        int v1 = ajqz0.b - 1;
                        if(ajqz0.b == 0) {
                            throw throwable1;
                        }
                        if(v1 == 8) {
                            akbl.a.i("Security domain member was not found", ajqz0, new Object[0]);
                        }
                        else {
                            akbl.a.i("Error during getSecurityDomainMember call", ajqz0, new Object[0]);
                        }
                    label_128:
                        akbl.I(akbl0.d, 3);
                        goto label_133;
                    }
                    catch(akbi akbi1) {
                    }
                    catch(Throwable throwable2) {
                        goto label_136;
                    }
                    try {
                    label_131:
                        akbl.I(akbl0.d, akbi1.a);
                        throw akbi1;
                    label_133:
                        __monitor_exit(class0);
                        goto label_140;
                    label_136:
                        __monitor_exit(class0);
                    }
                    catch(Throwable throwable2) {
                        goto label_136;
                    }
                    try {
                        throw throwable2;
                    }
                    catch(akbi akbi0) {
                    }
                label_139:
                    a.ae(ajxo.b.j(), "Could not recover shared keys with AsymmetricKeyPair", akbi0);
                label_140:
                    throwable0 = throwable1;
                }
            }
        }
        if(hpvv.a.g().L()) {
            for(Object object4: hfuo0) {
                gmlh gmlh2 = (gmlh)object4;
                String s2 = gmlh2.d;
                if(!akbl.A(s2)) {
                }
                else if(gmlh2.e.isEmpty()) {
                    ((ggtj)ajxo.b.j()).x("Missing key metadata");
                }
                else {
                    Key key1 = (Key)map0.get(s2);
                    if(key1 == null) {
                        ((ggtj)ajxo.b.j()).x("Key from the snapshot was not recovered.");
                    }
                    else {
                        try {
                            byte[] arr_b3 = akdy.q(key1, gmlh2.e);
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ajxe.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ((ajxe)hftp2.b_message).c = 1;
                            ByteString hfsf4 = ByteString.copyFrom(arr_b3);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ((ajxe)hftp2.b_message).d = hfsf4;
                            ajxe0 = (ajxe)hftp2.N_build();
                        }
                        catch(BadPaddingException | InvalidKeyException | IllegalBlockSizeException exception3) {
                            a.ae(ajxo.b.j(), "Could not decrypt SharedKey", exception3);
                            continue;
                        }
                        try {
                            ((akba)akba.b.b()).K(this.c.a.name, s2, Arrays.asList(new ajxe[]{ajxe0}), s, 11);
                        }
                        catch(IOException | acse exception4) {
                            a.ae(ajxo.b.j(), "Could not store shared key.", exception4);
                        }
                    }
                }
            }
        }
    }

    public final gmll c(int v) {
        long v1;
        byte[] arr_b4;
        KeyChainProtectionParams keyChainProtectionParams0 = new KeyChainProtectionParams.Builder().setUserSecretType(100).setLockScreenUiFormat(2).setKeyDerivationParams(KeyDerivationParams.createSha256Params(new byte[0])).setSecret(this.c.b.toByteArray()).build();
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(keyChainProtectionParams0);
        byte[] arr_b = this.c.e.toByteArray();
        byte[] arr_b1 = this.c.h.toByteArray();
        byte[] arr_b2 = ByteBuffer.allocate(arr_b.length + 12 + arr_b1.length).order(ByteOrder.LITTLE_ENDIAN).put(arr_b).putLong(this.c.g).putInt(this.c.f).put(arr_b1).array();
        bboh bboh0 = ajxo.b;
        ((ggtj)bboh0.h()).z("Vault params length = %d", arr_b2.length);
        ((ggtj)bboh0.h()).x("Starting recovery session");
        RecoverySession recoverySession0 = RecoveryController.getInstance(this.d).createRecoverySession();
        this.f = recoverySession0;
        try {
            String s = hput.d();
            byte[] arr_b3 = this.c.c.toByteArray();
            arr_b4 = recoverySession0.start(s, this.c.d, arr_b2, arr_b3, arrayList0);
        }
        catch(InternalRecoveryServiceException internalRecoveryServiceException0) {
            a.ae(ajxo.b.j(), "Error during RecoverySession.start call", ((Throwable)internalRecoveryServiceException0));
            throw new ajxr("Failed to recover snapshot", ((Throwable)internalRecoveryServiceException0), 17);
        }
        catch(CertificateException certificateException0) {
            a.ae(ajxo.b.j(), "Error during RecoverySession.start call", certificateException0);
            throw new ajxr("Failed to recover snapshot", certificateException0, 13);
        }
        if(arr_b4 != null) {
            ((ggtj)bboh0.h()).z("RecoveryClaim length = %d", arr_b4.length);
            baun baun0 = ajxo.a;
            ajxq ajxq0 = this.c;
            ByteString hfsf0 = ajxq0.h;
            if(hfsf0 == null) {
                v1 = -1L;
            }
            else {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(hfsf0.toByteArray()).order(ByteOrder.LITTLE_ENDIAN);
                byteBuffer0.get();
                byteBuffer0.getLong();
                v1 = byteBuffer0.getLong();
            }
            ByteString hfsf1 = ajxq0.c;
            baun0.d("Request created to open vault for device %d with challenge \'%s\' ... ", new Object[]{v1, bboy.c(hfsf1.toByteArray())});
            ByteString hfsf2 = ByteString.copyFrom(arr_b4);
            String s1 = this.g;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmll.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gmll)hftv0).e = hfsf1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gmll)hftv1).d = hfsf2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            hfsf0.getClass();
            ((gmll)hftv2).c = hfsf0;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gmll)hftp0.b_message).f = 1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmln.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gmln.b(((gmln)hftp1.b_message));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gmln gmln0 = (gmln)hftp1.b_message;
            s1.getClass();
            gmln0.b = s1;
            gmln gmln1 = (gmln)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            gmln1.getClass();
            ((gmll)hftv3).h = gmln1;
            ((gmll)hftv3).b |= 1;
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gmll)hftp0.b_message).g = v - 2;
            return (gmll)hftp0.N_build();
        }
        ((ggtj)bboh0.j()).x("Recovery claim is null");
        throw new ajxr("Failed to recover snapshot", 17);
    }

    @Override
    public final void close() {
        RecoverySession recoverySession0 = this.f;
        if(recoverySession0 != null) {
            recoverySession0.close();
        }
    }

    private final gmls d() {
        gmls gmls0 = this.e;
        if(gmls0 != null) {
            return gmls0;
        }
        throw new ajxr("Please first call startRecovery().", 15);
    }
}

