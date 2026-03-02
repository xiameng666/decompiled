import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import android.util.Pair;
import j..nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import jeb.synthetic.FIN;

public final class awbo implements xip {
    @Override  // xip
    public final boolean a(File file0) {
        ByteBuffer byteBuffer4;
        X509Certificate[][] arr2_x509Certificate;
        long v11;
        Pair pair0;
        int v;
        RandomAccessFile randomAccessFile0;
        babh babh1;
        babh babh0 = babh.a();
        PackageInfo packageInfo0 = new PackageInfo();
        try {
            elgf.b(babh0);
            if(hrkh.a.b().c()) {
                packageInfo0.signatures = awbo.b(file0);
                babh1 = babh0;
            }
            else {
                String s = file0.getAbsolutePath();
                try {
                    try {
                        randomAccessFile0 = new RandomAccessFile(s, "r");
                        v = FIN.finallyOpen$NT();
                        if(randomAccessFile0.length() < 22L) {
                            pair0 = null;
                        }
                        else {
                            pair0 = xiv.b(randomAccessFile0, 0);
                            if(pair0 == null) {
                                pair0 = xiv.b(randomAccessFile0, 0xFFFF);
                            }
                        }
                        if(pair0 == null) {
                            throw new xib("Not an APK file: ZIP End of Central Directory record not found");
                        }
                        ByteBuffer byteBuffer0 = (ByteBuffer)pair0.first;
                        long v1 = (long)(((Long)pair0.second));
                        if(-20L + v1 >= 0L) {
                            randomAccessFile0.seek(-20L + v1);
                            if(randomAccessFile0.readInt() == 0x504B0607) {
                                throw new xib("ZIP64 APK not supported");
                            }
                        }
                        xiv.c(byteBuffer0);
                        long v2 = xiv.a(byteBuffer0, byteBuffer0.position() + 16);
                        if(v2 >= v1) {
                            throw new xib(a.J(v1, v2, "ZIP Central Directory offset out of range: ", ". ZIP End of Central Directory offset: "));
                        }
                        xiv.c(byteBuffer0);
                        if(v2 + xiv.a(byteBuffer0, byteBuffer0.position() + 12) != v1) {
                            throw new xib("ZIP Central Directory is not immediately followed by End of Central Directory");
                        }
                        if(v2 < 0x20L) {
                            throw new xib(a.u(v2, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
                        }
                        ByteBuffer byteBuffer1 = ByteBuffer.allocate(24);
                        byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile0.seek(v2 - ((long)byteBuffer1.capacity()));
                        randomAccessFile0.readFully(byteBuffer1.array(), byteBuffer1.arrayOffset(), byteBuffer1.capacity());
                        if(byteBuffer1.getLong(8) != 0x20676953204B5041L || byteBuffer1.getLong(16) != 0x3234206B636F6C42L) {
                            throw new xib("No APK Signing Block before ZIP Central Directory");
                        }
                        long v3 = byteBuffer1.getLong(0);
                        if(v3 < ((long)byteBuffer1.capacity()) || v3 > 0x7FFFFFF7L) {
                            throw new xib(a.u(v3, "APK Signing Block size out of range: "));
                        }
                        long v4 = v2 - ((long)(((int)(v3 + 8L))));
                        if(v4 < 0L) {
                            throw new xib(a.u(v4, "APK Signing Block offset out of range: "));
                        }
                        ByteBuffer byteBuffer2 = ByteBuffer.allocate(((int)(v3 + 8L)));
                        byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile0.seek(v4);
                        randomAccessFile0.readFully(byteBuffer2.array(), byteBuffer2.arrayOffset(), byteBuffer2.capacity());
                        long v5 = byteBuffer2.getLong(0);
                        if(v5 != v3) {
                            throw new xib(a.J(v3, v5, "APK Signing Block sizes in header and footer do not match: ", " vs "));
                        }
                        Pair pair1 = Pair.create(byteBuffer2, Long.valueOf(v4));
                        ByteBuffer byteBuffer3 = (ByteBuffer)pair1.first;
                        long v6 = (long)(((Long)pair1.second));
                        if(byteBuffer3.order() != ByteOrder.LITTLE_ENDIAN) {
                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                        }
                        int v7 = byteBuffer3.capacity() - 24;
                        if(v7 < 8) {
                            throw new IllegalArgumentException(a.z(8, v7, "end < start: ", " < "));
                        }
                        int v8 = byteBuffer3.capacity();
                        if(v7 > byteBuffer3.capacity()) {
                            throw new IllegalArgumentException(a.z(v8, v7, "end > capacity: ", " > "));
                        }
                        try {
                            byteBuffer3.position(0);
                            byteBuffer3.limit(v7);
                            byteBuffer3.position(8);
                            byteBuffer4 = byteBuffer3.slice();
                            byteBuffer4.order(byteBuffer3.order());
                        }
                        finally {
                            byteBuffer3.position(0);
                            byteBuffer3.limit(byteBuffer3.limit());
                            byteBuffer3.position(byteBuffer3.position());
                        }
                        int v10 = 0;
                        while(true) {
                            if(!byteBuffer4.hasRemaining()) {
                                throw new xib("No APK Signature Scheme v2 block in APK Signing Block");
                            }
                            ++v10;
                            if(byteBuffer4.remaining() < 8) {
                                throw new xib("Insufficient data to read size of APK Signing Block entry #" + v10);
                            }
                            v11 = byteBuffer4.getLong();
                            babh1 = babh0;
                            if(Long.compare(v11, 4L) < 0 || v11 > 0x7FFFFFFFL) {
                                throw new xib(a.n(v11, v10, "APK Signing Block entry #", " size out of range: "));
                            }
                            int v12 = byteBuffer4.position() + ((int)v11);
                            if(((int)v11) > byteBuffer4.remaining()) {
                                throw new xib("APK Signing Block entry #" + v10 + " size out of range: " + ((int)v11) + ", available: " + byteBuffer4.remaining());
                            }
                            if(byteBuffer4.getInt() == 0x7109871A) {
                                break;
                            }
                            byteBuffer4.position(v12);
                            v2 = v2;
                            babh0 = babh1;
                            v6 = v6;
                        }
                        xia xia0 = new xia(xie.a(byteBuffer4, ((int)v11) - 4), v6, v2, v1, byteBuffer0);
                        arr2_x509Certificate = xie.b(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile0.getChannel()), xia0);
                        randomAccessFile0.close();
                    }
                    catch(xib xib0) {
                        throw new GeneralSecurityException("Package is not signed", xib0);
                    }
                    catch(IOException exception1) {
                        throw new GeneralSecurityException("Failed to verify signatures", exception1);
                    }
                    try {
                        FIN.finallyCodeBegin$NT(v);
                        randomAccessFile0.close();
                        FIN.finallyCodeEnd$NT(v);
                        goto label_104;
                    }
                    catch(IOException unused_ex) {
                        goto label_104;
                    }
                    catch(xib xib0) {
                    }
                }
                catch(RuntimeException exception1) {
                    throw new GeneralSecurityException("Failed to verify signatures", exception1);
                }
                throw new GeneralSecurityException("Package is not signed", xib0);
            label_104:
                Signature[] arr_signature = new Signature[arr2_x509Certificate.length];
                for(int v13 = 0; v13 < arr2_x509Certificate.length; ++v13) {
                    arr_signature[v13] = new Signature(arr2_x509Certificate[v13][0].getEncoded());
                }
                packageInfo0.signatures = arr_signature;
            }
        }
        catch(Exception exception0) {
            Log.w("GmsSigVfyr", file0.getAbsolutePath() + " failed signature check", exception0);
            return false;
        }
        azql azql0 = azql.c(babh1);
        String s1 = packageInfo0.packageName;
        packageInfo0.packageName = "com.google.android.gms.chimera";
        azqg azqg0 = azql0.b(packageInfo0, true);
        packageInfo0.packageName = s1;
        return azqg0.b;
    }

    private static final Signature[] b(File file0) {
        qwx qwx0;
        RandomAccessFile randomAccessFile0 = null;
        try {
            randomAccessFile0 = new RandomAccessFile(file0, "r");
            qwx0 = qwy.a(rbc.b(randomAccessFile0, randomAccessFile0.length()), Integer.valueOf(28));
            goto label_8;
        }
        catch(Throwable throwable0) {
            try {
                if(randomAccessFile0 != null) {
                    randomAccessFile0.close();
                }
                throw throwable0;
            label_8:
                randomAccessFile0.close();
                goto label_12;
            }
            catch(IOException | qxe | NoSuchAlgorithmException | IllegalStateException exception0) {
            }
        }
        throw new GeneralSecurityException("Failed to verify signatures", exception0);
    label_12:
        if(!qwx0.k) {
            throw new GeneralSecurityException("Package is not signed");
        }
        ArrayList arrayList0 = new ArrayList(qwx0.c.size());
        for(Object object0: qwx0.c) {
            arrayList0.add(new Signature(((X509Certificate)object0).getEncoded()));
        }
        return (Signature[])arrayList0.toArray(new Signature[0]);
    }
}

