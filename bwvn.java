import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import j..nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class bwvn {
    public final SharedPreferences a;
    public final bxgp b;
    public Mac c;
    private final SecureRandom d;

    public bwvn(Context context0, String s, File file0) {
        this.d = new SecureRandom();
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences(a.a(s, "AppDataSearch-", "-config"), 0);
        this.a = sharedPreferences0;
        if(!sharedPreferences0.contains("created")) {
            sharedPreferences0.edit().putLong("created", System.currentTimeMillis()).commit();
        }
        this.c();
        File file1 = hrnt.i() ? new File(ccsb.a.b(file0, s + "-corpus-scratch-data.tmp")) : new File(file0, s + "-corpus-scratch-data.tmp");
        Parser hfvs0 = (Parser)((ProtoLiteMessage)bwns.a).jf(7, null);
        this.b = new bxgp(file1, bwns.class, hfvs0);
    }

    public final String a(bwvl bwvl0) {
        Charset charset0 = Charset.defaultCharset();
        this.c.reset();
        this.c.update(bwvl0.a.getBytes(charset0));
        this.c.update(45);
        String s = bwvl0.b;
        if(s != null) {
            byte[] arr_b = s.getBytes(Charset.defaultCharset());
            this.c.update(arr_b);
        }
        String s1 = bboy.e(this.c.doFinal());
        return bwvl0.c == null ? s1 : a.r(bwvl0.c, s1, "-");
    }

    public final Collection b() {
        FileInputStream fileInputStream1;
        ByteBuffer byteBuffer0;
        FileInputStream fileInputStream0;
        Collection collection0 = new ArrayList(this.a.getAll().size());
        Iterator iterator0 = this.a.getAll().entrySet().iterator();
        while(true) {
            fileInputStream0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((String)map$Entry0.getKey()).startsWith("corpuskey:")) {
                ((List)collection0).add(((bwnr)bwwh.e(((String)map$Entry0.getValue()), ((Parser)((ProtoLiteMessage)bwnr.a).jf(7, null)))));
            }
        }
        bxgp bxgp0 = this.b;
        bwne.p("Requested read of file %s", bxgp0.c);
        try {
            byteBuffer0 = ByteBuffer.allocate(((int)bxgp0.d.length()));
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            String s = bwwh.f(bxgp0.d.length());
            bwne.j(illegalArgumentException0, "Error while reading from %s: file too large: %s", new Object[]{bxgp0.c, s});
            goto label_38;
        }
        try {
            fileInputStream1 = null;
            fileInputStream1 = new FileInputStream(bxgp0.d);
            goto label_22;
        }
        catch(FileNotFoundException unused_ex) {
            goto label_24;
        }
        catch(IOException iOException0) {
            goto label_32;
        }
        catch(Throwable throwable0) {
        }
        goto label_42;
        try {
            try {
            label_22:
                DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream1.getChannel()).read(byteBuffer0);
                goto label_48;
            }
            catch(FileNotFoundException unused_ex) {
            }
            catch(IOException iOException0) {
                goto label_32;
            }
        label_24:
            bwne.p("File %s not found, ignoring", bxgp0.c);
            if(fileInputStream1 != null) {
                goto label_26;
            }
            goto label_38;
        }
        catch(Throwable throwable0) {
            goto label_41;
        }
        try {
        label_26:
            fileInputStream1.close();
        }
        catch(IOException iOException1) {
            bwne.j(iOException1, "Error while closing stream to %s", new Object[]{bxgp0.c});
        }
        goto label_38;
        try {
        label_32:
            bwne.j(iOException0, "Error while reading from %s", new Object[]{bxgp0.c});
            if(fileInputStream1 != null) {
                goto label_34;
            }
            goto label_38;
        }
        catch(Throwable throwable0) {
            goto label_41;
        }
        try {
        label_34:
            fileInputStream1.close();
        }
        catch(IOException iOException2) {
            bwne.j(iOException2, "Error while closing stream to %s", new Object[]{bxgp0.c});
        }
    label_38:
        Collection collection1 = null;
        goto label_58;
    label_41:
        fileInputStream0 = fileInputStream1;
    label_42:
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(IOException iOException3) {
                bwne.j(iOException3, "Error while closing stream to %s", new Object[]{bxgp0.c});
            }
        }
        throw throwable0;
        try {
        label_48:
            fileInputStream1.close();
        }
        catch(IOException iOException4) {
            bwne.j(iOException4, "Error while closing stream to %s", new Object[]{bxgp0.c});
        }
        byteBuffer0.rewind();
        String s1 = bxgp0.c;
        bwne.b("Reading file %s", s1);
        collection1 = bbqf.c(byteBuffer0, bxgp0.a, bxgp0.b, true);
        if(collection1 == null) {
            bwne.g("Failed to read valid data from file %s", s1);
        }
    label_58:
        if(collection1 != null) {
            SparseArray sparseArray0 = new SparseArray(collection1.size());
            for(Object object1: collection1) {
                sparseArray0.append(((bwns)object1).c, ((bwns)object1));
            }
            for(int v = 0; v < ((List)collection0).size(); ++v) {
                bwnr bwnr0 = (bwnr)((List)collection0).get(v);
                bwns bwns0 = (bwns)sparseArray0.get((bwnr0.c == null ? bwnq.a : bwnr0.c).c);
                if(bwns0 != null) {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnr0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)bwnr0));
                    bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwny0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)bwny0));
                    bwnt bwnt0 = (bwnt)hftp1;
                    if(!bwnt0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)bwnt0).ensureMutable();
                    }
                    ((bwny)bwnt0.b_message).c = hfvv.a;
                    bwnt0.a(bwns0.e);
                    int v1 = bwns0.d;
                    if(!bwnt0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)bwnt0).ensureMutable();
                    }
                    bwny bwny1 = (bwny)bwnt0.b_message;
                    bwny1.b |= 16;
                    bwny1.f = v1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    bwnr bwnr1 = (bwnr)hftp0.b_message;
                    bwny bwny2 = (bwny)((ProtoLiteBuilder)bwnt0).N_build();
                    bwny2.getClass();
                    bwnr1.d = bwny2;
                    bwnr1.b |= 2;
                    ((List)collection0).set(v, ((bwnr)hftp0.N_build()));
                }
            }
        }
        return collection0;
    }

    public final void c() {
        SharedPreferences sharedPreferences0 = this.a;
        gftb.check(sharedPreferences0);
        String s = sharedPreferences0.getString("hmackey", null);
        if(s == null) {
            byte[] arr_b = new byte[20];
            this.d.nextBytes(arr_b);
            s = bboy.e(arr_b);
            sharedPreferences0.edit().putString("hmackey", s).commit();
        }
        try {
            Mac mac0 = bwwh.h();
            if(mac0 == null) {
                throw new IllegalArgumentException("Cannot find algo");
            }
            this.c = mac0;
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(s.getBytes("UTF-8"), "HmacSHA1");
            this.c.init(secretKeySpec0);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new IllegalArgumentException("CannotHappenException", unsupportedEncodingException0);
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new IllegalArgumentException("Bad key type", invalidKeyException0);
        }
    }

    public final boolean d(bwnr bwnr0) {
        String s = "corpuskey:" + this.a(new bwvl(bwnr0));
        return this.a.edit().putString(s, bwwh.g(((MessageLite)bwnr0))).commit();
    }
}

