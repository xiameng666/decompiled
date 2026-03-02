import android.accounts.Account;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class ajiy {
    public final ajiw a;
    public final ajfq b;
    public final ajip c;
    public final baun d;

    public ajiy(ajiw ajiw0, ajfq ajfq0, ajip ajip0) {
        this.d = new baun(new String[]{"OracleUtils"}, null);
        this.a = ajiw0;
        this.b = ajfq0;
        this.c = ajip0;
    }

    public final KeyDerivationResult a(Account account0, String s, String s1, byte[] arr_b, byte[] arr_b1) {
        if(arr_b1 != null) {
            ajja ajja0 = this.a.h(s, account0).b;
            try {
                return new KeyDerivationResult(1, yha.c(ajja0.a, arr_b, arr_b1, s1, 0x20));
            }
            catch(InvalidKeyException invalidKeyException0) {
                this.c.b = 8;
                throw new ajgp(invalidKeyException0);
            }
        }
        throw new NullPointerException("Null info");
    }

    public final PlainText b(String s, Account account0, Payload payload0) {
        ajjb ajjb0;
        if(payload0.d != null) {
            try {
                ajjb0 = this.a.h(s, account0);
            }
            catch(ajiv ajiv0) {
                this.c.b = 10;
                throw ajiv0;
            }
            try {
                return ajiy.m(ajjb0.b.a, payload0, ajjb0.b.b, account0.name);
            }
            catch(hfur | ygz | NoSuchAlgorithmException | InvalidKeyException | SignatureException unused_ex) {
                this.d.h("Failed verifyDecrypt with Active key. Trying with Inactive keys.", new Object[0]);
                this.c.b = 7;
                return this.j(ajjb0.a, payload0, account0.name);
            }
        }
        this.c.b = 2;
        throw new NullPointerException("Null payload.");
    }

    public final PlainText c(String s, byte[] arr_b, Payload payload0) {
        ygy ygy0;
        byte[] arr_b1;
        long v2;
        long v1;
        int v;
        ygu ygu0;
        gmkv gmkv0;
        String s2;
        SQLiteDatabase sQLiteDatabase1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        ajfo ajfo0;
        if(payload0.d != null) {
            try {
                String s1 = bbmu.c(arr_b);
                ajfn.c.d("Querying for key=%s, handle=%s", new Object[]{s, s1});
                ajfo0 = ajfo.c(((ajfn)this.a).b);
                try {
                    sQLiteDatabase0 = ajfo0.getReadableDatabase();
                }
                catch(SQLiteException sQLiteException0) {
                    throw new ajiv("failed to open db ", sQLiteException0);
                }
                sQLiteDatabase0.beginTransaction();
                cursor0 = null;
            }
            catch(ajiv ajiv0) {
                this.c.b = 10;
                throw ajiv0;
            }
            try {
                cursor0 = ajfn.u(sQLiteDatabase0, null, "key_name = ? AND key_handle = ?", new String[]{s, bbmu.c(arr_b)});
            }
            catch(Throwable throwable0) {
                sQLiteDatabase1 = sQLiteDatabase0;
                goto label_53;
            }
            if(cursor0 != null) {
                try {
                    if(cursor0.moveToFirst() && cursor0.getCount() != 0) {
                        s2 = ajfn.k(cursor0);
                        ygg ygg0 = ajfn.d(cursor0);
                        gmkv0 = ajfn.j(cursor0);
                        try {
                            ygu0 = ajfn.e(cursor0);
                        }
                        catch(yhd yhd0) {
                            ajfn.c.l(yhd0);
                            ygu0 = ygu.d;
                        }
                        try {
                            v = ajfn.r(cursor0);
                        }
                        catch(yhd yhd1) {
                            ajfn.c.l(yhd1);
                            v = 1;
                        }
                        v1 = ajfn.b(cursor0);
                        v2 = ajfn.c(cursor0);
                        if(ygg0.equals(ygg.b)) {
                            arr_b1 = ajfn.n(cursor0);
                            sQLiteDatabase0.setTransactionSuccessful();
                            sQLiteDatabase1 = sQLiteDatabase0;
                            goto label_40;
                        }
                        sQLiteDatabase1 = sQLiteDatabase0;
                        throw new ajiv("Only symmetric key can be retrieved by keyHandle");
                    }
                    sQLiteDatabase1 = sQLiteDatabase0;
                    throw new ajiv("No key found in db");
                }
                catch(Throwable throwable0) {
                    try {
                        sQLiteDatabase1 = sQLiteDatabase0;
                        goto label_53;
                    label_40:
                        ygy0 = new ygy(s, s2, arr_b, gmkv0, ygu0, v, arr_b1, v1, v2);
                    }
                    catch(Throwable throwable0) {
                        goto label_53;
                    }
                }
                try {
                    sQLiteDatabase1.endTransaction();
                    ajfn.s(cursor0);
                    ajfo0.close();
                }
                catch(ajiv ajiv0) {
                    this.c.b = 10;
                    throw ajiv0;
                }
                try {
                    return ajiy.m(ygy0.c, payload0, ygy0.b, ygy0.a);
                }
                catch(hfur | ygz | NoSuchAlgorithmException | InvalidKeyException | SignatureException exception0) {
                    this.c.b = 7;
                    throw new ajgp(exception0);
                }
                try {
                    sQLiteDatabase1 = sQLiteDatabase0;
                    throw new ajiv("Only symmetric key can be retrieved by keyHandle");
                }
                catch(Throwable throwable0) {
                    goto label_53;
                }
            }
            sQLiteDatabase1 = sQLiteDatabase0;
            throw new ajiv("No key found in db");
            try {
            label_53:
                sQLiteDatabase1.endTransaction();
                ajfn.s(cursor0);
                ajfo0.close();
                throw throwable0;
            }
            catch(ajiv ajiv0) {
                this.c.b = 10;
                throw ajiv0;
            }
        }
        this.c.b = 2;
        throw new NullPointerException("Null payload.");
    }

    public final PlainText d(PrivateKey privateKey0, Account account0, byte[] arr_b) {
        SecretKey secretKey0;
        PublicKey publicKey0;
        ProtoLiteMessage hftv1;
        hfsl hfsl0;
        hhvf hhvf0;
        try {
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhvf.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hhvf0 = (hhvf)hftv0;
                hfsl0 = hhuu.a(hhvf0).f.k();
                hftv1 = ((ProtoLiteMessage)hhuz.a).x_newMutableInstance();
            }
            catch(hfur exception0) {
                this.c.b = 7;
                throw new ajgp(exception0);
            }
            try {
                hfwc hfwc0 = hfvu.a.c(hftv1);
                hfwc0.l(hftv1, hfsm.p(hfsl0), hftc.a);
                hfwc0.g(hftv1);
                goto label_28;
            }
            catch(hfur hfur0) {
            }
            catch(hfwr hfwr0) {
                goto label_15;
            }
            catch(IOException iOException0) {
                goto label_19;
            }
            catch(RuntimeException runtimeException0) {
                goto label_25;
            }
            try {
                if(hfur0.b) {
                    hfur0 = new hfur(hfur0);
                }
                hfur0.a = hftv1;
                throw hfur0;
            label_15:
                hfur hfur1 = hfwr0.a();
                hfur1.a = hftv1;
                throw hfur1;
            label_19:
                if((iOException0.getCause() instanceof hfur)) {
                    throw (hfur)iOException0.getCause();
                }
                hfur hfur2 = new hfur(iOException0);
                hfur2.a = hftv1;
                throw hfur2;
            label_25:
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
            catch(hfur exception0) {
                this.c.b = 7;
                throw new ajgp(exception0);
            }
            try {
            label_28:
                hfsl0.z(0);
                goto label_33;
            }
            catch(hfur hfur3) {
                try {
                    hfur3.a = hftv1;
                    throw hfur3;
                label_33:
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    publicKey0 = hhus.e(((hhuz)hftv1));
                    goto label_40;
                }
                catch(hfur exception0) {
                }
                this.c.b = 7;
                throw new ajgp(exception0);
            }
        }
        catch(InvalidKeySpecException exception0) {
            this.c.b = 7;
            throw new ajgp(exception0);
        }
        try {
        label_40:
            secretKey0 = hhth.a(privateKey0, publicKey0);
        }
        catch(InvalidKeyException invalidKeyException0) {
            this.c.b = 9;
            throw new ajgp(invalidKeyException0);
        }
        try {
            hhvb hhvb0 = hhuu.b(hhvf0, secretKey0, hhuq.a, secretKey0, hhup.b);
            return new PlainText((hhvb0.c == null ? hhva.a : hhvb0.c).toBytesArray(), hhvb0.d.toByteArray(), account0);
        }
        catch(NoSuchAlgorithmException | InvalidKeyException | SignatureException exception1) {
            this.c.b = 7;
            throw new ajgp(exception1);
        }
    }

    public final SignCryptedBlob e(String s, String s1, Account account0, Payload payload0) {
        PrivateKey privateKey0;
        ajja ajja0;
        ajiz ajiz0;
        if(payload0.d != null) {
            try {
                ajiz0 = this.a.f(s, account0);
            }
            catch(ajiv ajiv0) {
                this.c.b = 11;
                throw ajiv0;
            }
            try {
                ajja0 = this.a.h(s1, account0).b;
            }
            catch(ajiv ajiv1) {
                this.c.b = 10;
                throw ajiv1;
            }
            try {
                privateKey0 = yha.a(ajiz0.d);
            }
            catch(InvalidKeySpecException invalidKeySpecException0) {
                this.c.b = 3;
                throw new ajgp(invalidKeySpecException0);
            }
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(ajja0.a, "AES");
            hhut hhut0 = new hhut();
            hhut0.h(ajiz0.c);
            byte[] arr_b = payload0.c;
            if(arr_b != null) {
                hhut0.g(arr_b);
            }
            byte[] arr_b1 = payload0.b;
            if(arr_b1 != null) {
                hhut0.b = arr_b1;
            }
            try {
                hhvf hhvf0 = hhut0.b(privateKey0, ajiy.l(ajiz0.e), secretKeySpec0, ajiy.k(ajja0.b), payload0.d);
                return new SignCryptedBlob(hhvf0.c.toByteArray(), hhvf0.toBytesArray());
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | ygz exception0) {
                this.c.b = 6;
                throw new ajgp(exception0);
            }
        }
        this.c.b = 2;
        throw new NullPointerException("Null payload");
    }

    public final SignCryptedBlob f(PublicKey publicKey0, byte[] arr_b) {
        SecretKey secretKey0;
        KeyPair keyPair0 = hhus.d();
        try {
            secretKey0 = hhth.a(keyPair0.getPrivate(), publicKey0);
        }
        catch(InvalidKeyException invalidKeyException0) {
            this.c.b = 9;
            throw new ajgp(invalidKeyException0);
        }
        hhut hhut0 = new hhut();
        hhut0.f(hhus.c(keyPair0.getPublic()).toBytesArray());
        try {
            hhvf hhvf0 = hhut0.b(secretKey0, hhuq.a, secretKey0, hhup.b, arr_b);
            return new SignCryptedBlob(hhvf0.c.toByteArray(), hhvf0.toBytesArray());
        }
        catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
            this.c.b = 6;
            throw new ajgp(exception0);
        }
    }

    public final SignedBlob g(String s, Account account0, Payload payload0) {
        PrivateKey privateKey0;
        ajiz ajiz0;
        if(payload0.d != null) {
            try {
                ajiz0 = this.a.f(s, account0);
            }
            catch(ajiv ajiv0) {
                this.c.b = 11;
                throw ajiv0;
            }
            try {
                privateKey0 = yha.a(ajiz0.d);
            }
            catch(InvalidKeySpecException invalidKeySpecException0) {
                this.c.b = 3;
                throw new ajgp(invalidKeySpecException0);
            }
            hhut hhut0 = new hhut();
            hhut0.h(ajiz0.b);
            byte[] arr_b = payload0.c;
            if(arr_b != null) {
                hhut0.g(arr_b);
            }
            byte[] arr_b1 = payload0.b;
            if(arr_b1 != null) {
                hhut0.b = arr_b1;
            }
            try {
                hhuq hhuq0 = ajiy.l(ajiz0.e);
                byte[] arr_b2 = payload0.d;
                if(privateKey0 == null || hhuq0 == null || arr_b2 == null) {
                    throw null;
                }
                if(hhut0.a == null) {
                    return new SignedBlob(hhut0.c(privateKey0, hhuq0, hhut.e(hhut0.a(hhuq0, hhup.a, null).toBytesArray(), arr_b2), hhut0.b).toBytesArray());
                }
                throw new IllegalStateException("Cannot set decryptionKeyId for a cleartext message");
            }
            catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
                this.c.b = 8;
                throw new ajgp(exception0);
            }
        }
        this.c.b = 2;
        throw new NullPointerException("Null payload");
    }

    public final SignedBlob h(byte[] arr_b, String s, byte[] arr_b1) {
        ajiz ajiz0;
        if(arr_b == null) {
            throw new NullPointerException("Null keyHandle");
        }
        if(arr_b1 != null) {
            try {
                ajiz0 = this.a.g(arr_b);
            }
            catch(ajiv ajiv0) {
                this.c.b = 11;
                throw ajiv0;
            }
            try {
                PrivateKey privateKey0 = yha.a(ajiz0.d);
                Signature signature0 = Signature.getInstance(s);
                signature0.initSign(privateKey0);
                signature0.update(arr_b1);
                return new SignedBlob(signature0.sign());
            }
            catch(InvalidKeySpecException invalidKeySpecException0) {
                this.c.b = 3;
                throw new ajgp(invalidKeySpecException0);
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | SignatureException exception0) {
                this.c.b = 8;
                throw new ajgp(exception0);
            }
        }
        throw new NullPointerException("Null data");
    }

    public final SecretKey i(String s, Account account0, ClientPublicKey clientPublicKey0) {
        PublicKey publicKey0;
        PrivateKey privateKey0;
        try {
            privateKey0 = yha.a(this.a.f(s, account0).d);
        }
        catch(InvalidKeySpecException invalidKeySpecException0) {
            this.c.b = 3;
            throw new ajgp(invalidKeySpecException0);
        }
        catch(ajiv ajiv0) {
            this.c.b = 11;
            throw ajiv0;
        }
        try {
            publicKey0 = hhtk.b(clientPublicKey0.b);
        }
        catch(InvalidKeySpecException invalidKeySpecException1) {
            this.c.b = 3;
            throw new ajgp(invalidKeySpecException1);
        }
        try {
            return hhth.a(privateKey0, publicKey0);
        }
        catch(InvalidKeyException invalidKeyException0) {
            this.c.b = 9;
            throw new ajgp(invalidKeyException0);
        }
    }

    private final PlainText j(List list0, Payload payload0, String s) {
        for(Object object0: list0) {
            ajja ajja0 = (ajja)object0;
            try {
                return ajiy.m(ajja0.a, payload0, ajja0.b, s);
            }
            catch(hfur | ygz | NoSuchAlgorithmException | InvalidKeyException | SignatureException unused_ex) {
                this.d.d("Failed to perform verifyDecrypt with a InActive key.", new Object[0]);
            }
        }
        throw new ajgp(a.aA(list0, "Failed to verifyDecrypt with ", " Inactive Keys."));
    }

    private static final hhup k(gmkv gmkv0) {
        if(gmkv0.ordinal() == 2) {
            return hhup.b;
        }
        throw new ygz("Unrecognized keyType:" + gmkv0);
    }

    private static final hhuq l(gmkv gmkv0) {
        if(gmkv0.ordinal() == 4) {
            return hhuq.b;
        }
        throw new ajgp("Unrecognized keyType:" + gmkv0);
    }

    private static final PlainText m(byte[] arr_b, Payload payload0, gmkv gmkv0, String s) {
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhvf.a), payload0.d, 0, payload0.d.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        hhup hhup0 = ajiy.k(gmkv0);
        hhvb hhvb0 = hhuu.b(((hhvf)hftv0), secretKeySpec0, hhuq.a, secretKeySpec0, hhup0);
        Account account0 = new Account(s, "com.google");
        return new PlainText((hhvb0.c == null ? hhva.a : hhvb0.c).toBytesArray(), hhvb0.d.toByteArray(), account0);
    }
}

