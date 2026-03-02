import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;

public final class azqo {
    private final Context a;
    private final String b;
    private final long c;
    private final boolean d;

    public azqo(Context context0, String s, long v) {
        this(context0, s, v, false);
    }

    public azqo(Context context0, String s, long v, boolean z) {
        this.a = context0;
        this.b = s;
        this.c = v;
        this.d = z;
    }

    public final azqq a() {
        gged_interceptors gged0;
        qxc qxc1;
        qxc qxc0;
        Context context0 = this.a;
        bbsq bbsq0 = bbsr.b(context0);
        String s = this.b;
        PackageInfo packageInfo0 = bbsq0.e(s, 0);
        if((packageInfo0 == null ? 0x7FFFFFFFFFFFFFFFL : packageInfo0.getLongVersionCode()) < this.c) {
            return new azqq(azqp.b, ggna.a);
        }
        File file0 = new File(bbsr.b(context0).d(s, 0).sourceDir);
        int v = Build.VERSION.SDK_INT;
        int v1 = Build.VERSION.SDK_INT;
        RandomAccessFile randomAccessFile0 = null;
        try {
            try {
                randomAccessFile0 = new RandomAccessFile(file0, "r");
                qxc0 = qxd.a(rbc.b(randomAccessFile0, randomAccessFile0.length()), file0, v, v1);
                goto label_24;
            }
            catch(IOException iOException0) {
            }
            qxc1 = new qxc();
            qxc1.d(29, new Object[]{iOException0});
            if(randomAccessFile0 != null) {
                goto label_17;
            }
            qxc0 = qxc1;
            goto label_25;
        }
        catch(Throwable throwable0) {
            goto label_21;
        }
        try {
        label_17:
            randomAccessFile0.close();
        }
        catch(IOException unused_ex) {
        }
        qxc0 = qxc1;
        goto label_25;
    label_21:
        if(randomAccessFile0 != null) {
            try {
                randomAccessFile0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_24:
            randomAccessFile0.close();
        }
        catch(IOException unused_ex) {
        }
    label_25:
        if(!qxc0.g) {
            List list0 = qxc0.f;
            if(list0.size() != 1) {
                return azqq.a();
            }
            int v2 = ((qwk)gggq.r(list0)).a;
            if(v2 == 25) {
                return azqq.b();
            }
            return !this.d || v2 != 30 ? azqq.a() : azqq.b();
        }
        qxb qxb0 = qxc0.e;
        List list1 = qxb0.a;
        if(list1.isEmpty()) {
            gged0 = qxb0.a() == null ? ggna.a : gged_interceptors.l(qxb0.a());
        }
        else {
            gged0 = gged_interceptors.i(list1);
        }
        if(gged0.isEmpty()) {
            return azqq.b();
        }
        gged_interceptors gged1 = this.d ? azqn.c : azqn.b;
        int v3 = gged0.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            byte[] arr_b = azqo.b(((X509Certificate)gged0.get(v4)));
            if(arr_b == null) {
                Log.w("GoogleSourceStampsChkr", "Unable to encode stamp from X509Certificate");
            }
            else {
                int v5 = ((ggna)gged1).c;
                int v6 = 0;
                while(v6 < v5) {
                    boolean z = Arrays.equals(arr_b, ((azqm)gged1.get(v6)).a);
                    ++v6;
                    if(z) {
                        byte[] arr_b1 = bbms.k(this.a, this.b);
                        long v7 = qxc0.e.b;
                        if(arr_b1 == null) {
                            return new azqq(azqp.l, gged0);
                        }
                        List list2 = qxc0.d;
                        if(list2.isEmpty()) {
                            list2 = qxc0.c;
                            if(list2.isEmpty()) {
                                list2 = qxc0.b;
                                if(list2.isEmpty()) {
                                    list2 = qxc0.a;
                                    if(list2.isEmpty()) {
                                        return new azqq(azqp.h, gged0);
                                    }
                                }
                            }
                        }
                        if(list2.size() > 1) {
                            return new azqq(azqp.g, gged0);
                        }
                        byte[] arr_b2 = azqo.b(((qxa)list2.get(0)).a);
                        if(arr_b2 == null) {
                            return new azqq(azqp.k, gged0);
                        }
                        return Arrays.equals(arr_b2, arr_b1) ? new azqq(azqp.a, gged0, v7) : new azqq(azqp.i, gged0);
                    }
                }
            }
        }
        batl.m(((boolean)(gged0.isEmpty() ^ 1)), "stampList should not be empty");
        return new azqq(azqp.f, gged0);
    }

    private static byte[] b(X509Certificate x509Certificate0) {
        try {
            return x509Certificate0.getEncoded();
        }
        catch(CertificateEncodingException certificateEncodingException0) {
            Log.w("GoogleSourceStampsChkr", "Unable to encode certificate", certificateEncodingException0);
            return null;
        }
    }
}

