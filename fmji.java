import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;

public final class fmji implements flzo {
    final int a;
    private final AccountContext b;
    private final String c;
    private final fmjm d;
    private final gmcg e;

    public fmji(AccountContext accountContext0, String s, fmjm fmjm0, int v) {
        this.b = accountContext0;
        this.c = s;
        this.d = fmjm0;
        this.e = flbs.b().a;
        this.a = v;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnxx.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnxf.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hnxf)hftv0).d = 10;
        fmjm fmjm0 = this.d;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnxf hnxf0 = (hnxf)hftp1.b_message;
        fmjm0.a.getClass();
        hnxf0.c = fmjm0.a;
        hftw hftw0 = hftw.b(fmjm0.b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnxf hnxf1 = (hnxf)hftp1.b_message;
        hftw0.getClass();
        hnxf1.e = hftw0;
        hnxf1.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnxx hnxx0 = (hnxx)hftp0.b_message;
        hnxf hnxf2 = (hnxf)hftp1.N_build();
        hnxf2.getClass();
        hnxx0.d = hnxf2;
        hnxx0.b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnxx hnxx1 = (hnxx)hftp0.b_message;
        hnxl0.getClass();
        hnxx1.c = hnxl0;
        hnxx1.b |= 1;
        return gmbu.i(((hnxx)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.f(gmcd0, (fmjf fmjf0) -> {
            byte[] arr_b;
            String s;
            HttpsURLConnection httpsURLConnection0;
            URL uRL0;
            File file0;
            try {
                file0 = new File(this.c);
                File file1 = file0.getParentFile();
                if(!file1.exists() && !file1.mkdirs()) {
                    throw fmjf.a("Unknown", "Unable to create parent directory", iapk.q);
                }
                if(fmjf0.d == null) {
                    uRL0 = new URL(iadl.g());
                    httpsURLConnection0 = (HttpsURLConnection)uRL0.openConnection();
                    goto label_10;
                }
                goto label_36;
            }
            catch(MalformedURLException malformedURLException0) {
                throw new iapn(iapk.e.e(malformedURLException0));
            }
            try {
                httpsURLConnection0 = (HttpsURLConnection)uRL0.openConnection();
                goto label_10;
            }
            catch(IOException iOException0) {
                try {
                    throw fmjf.b("Unknown", "Unable to open connection", iapk.q, iOException0);
                label_10:
                    httpsURLConnection0.setConnectTimeout(((int)iacq.b()));
                    httpsURLConnection0.setReadTimeout(((int)iacq.c()));
                    httpsURLConnection0.setInstanceFollowRedirects(true);
                    httpsURLConnection0.setRequestProperty("X-Goog-Download-Metadata", Base64.encodeToString(((hnxx)object0).toBytesArray(), 2));
                    httpsURLConnection0.setRequestProperty("Authorization", "Bearer " + fmjf0.a);
                }
                catch(MalformedURLException malformedURLException0) {
                    throw new iapn(iapk.e.e(malformedURLException0));
                }
            }
            try {
                BufferedInputStream bufferedInputStream0 = new BufferedInputStream(httpsURLConnection0.getInputStream());
                BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(new FileOutputStream(file0));
                ghjj.b(bufferedInputStream0, bufferedOutputStream0);
                bufferedOutputStream0.close();
                bufferedInputStream0.close();
                return new Object();
            }
            catch(IOException iOException1) {
                try {
                    file0.delete();
                }
                catch(MalformedURLException malformedURLException0) {
                    throw new iapn(iapk.e.e(malformedURLException0));
                }
                try {
                    int v = httpsURLConnection0.getResponseCode();
                    if(httpsURLConnection0.getHeaderField("x-guploader-uploadid") == null) {
                        s = "Unknown";
                    }
                    else {
                        s = httpsURLConnection0.getHeaderField("x-guploader-uploadid");
                        flbj.a("ScottyStub", "Media Download requestId=" + s);
                    }
                    switch(v) {
                        case 200: {
                            break;
                        }
                        case 401: {
                            throw fmjf.a(s, "Media download unauthenticated (Response Code 401)", iapk.j);
                        }
                        case 404: {
                            throw fmjf.a(s, "404 error", iapk.g);
                        }
                        default: {
                            throw fmjf.a(s, "Media download failed: responseCode=" + v, iapk.q);
                        }
                    }
                }
                catch(IOException iOException2) {
                    throw fmjf.b("Unknown", "Missing Status", iapk.q, iOException2);
                }
                try {
                    throw new iapn(iapk.d.e(iOException1));
                }
                catch(MalformedURLException malformedURLException0) {
                    throw new iapn(iapk.e.e(malformedURLException0));
                }
                try {
                    throw fmjf.a(s, "Media download unauthenticated (Response Code 401)", iapk.j);
                }
                catch(IOException iOException2) {
                    try {
                        throw fmjf.b("Unknown", "Missing Status", iapk.q, iOException2);
                    label_36:
                        HashMap hashMap0 = new HashMap();
                        hashMap0.put("X-Goog-Download-Metadata", Base64.encodeToString(((hnxx)object0).toBytesArray(), 2));
                        hashMap0.put("Authorization", "Bearer " + fmjf0.a);
                        try {
                            String s1 = iadl.g();
                            int v1 = (int)iacq.c();
                            arr_b = fmjf0.d.a(fmjf0.b, s1, hashMap0, v1);
                        }
                        catch(RuntimeException runtimeException0) {
                            try {
                                throw new iapn(iapk.d.e(runtimeException0));
                            }
                            catch(iapn iapn0) {
                                goto label_56;
                            }
                        }
                    }
                    catch(MalformedURLException malformedURLException0) {
                        throw new iapn(iapk.e.e(malformedURLException0));
                    }
                }
            }
            if(arr_b != null) {
                try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
                    fileOutputStream0.write(arr_b);
                    return new Object();
                }
                catch(IOException iOException3) {
                }
                catch(iapn iapn0) {
                    goto label_56;
                }
                try {
                    try {
                        throw new iapn(iapk.d.e(iOException3));
                    }
                    catch(iapn iapn0) {
                        goto label_56;
                    }
                    return new Object();
                    try {
                        throw new iapn(iapk.q);
                    }
                    catch(iapn iapn0) {
                    }
                label_56:
                    file0.delete();
                    throw fmjf.a("Unknown", "Media download failed", iapn0.a);
                }
                catch(MalformedURLException malformedURLException0) {
                    throw new iapn(iapk.e.e(malformedURLException0));
                }
            }
            throw new iapn(iapk.q);
        }, this.e);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        fmiw fmiw0 = new fmiw();
        fmiw0.b(this.c);
        return fmiw0.a();
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        int v2 = iapk0.t.r;
        Throwable throwable0 = iapk0.v;
        if((throwable0 instanceof fmja)) {
            fmja fmja0 = (fmja)throwable0;
        }
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(this.a);
        fmai0.m(Integer.valueOf(v2));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        fmix fmix0 = (fmix)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(this.a);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

