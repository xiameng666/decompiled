import android.content.Context;
import android.util.Log;
import j..net.URLEncoder;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;
import jeb.synthetic.FIN;

public final class fedw implements fedv {
    private final Context a;
    private final gmcg b;
    private final fdso c;
    private final fdvx d;
    private final fdvl e;
    private final fdwc f;
    private final ffmt g;
    private final fdyc h;

    public fedw(fdyc fdyc0, fdvl fdvl0, fdso fdso0, fdvx fdvx0, ffmt ffmt0, fdwc fdwc0, Context context0) {
        this.h = fdyc0;
        this.a = context0;
        this.c = fdso0;
        this.g = ffmt0;
        this.d = fdvx0;
        this.e = fdvl0;
        this.f = fdwc0;
        this.b = new bblp(0x7FFFFFFF, 10);
    }

    @Override  // fedv
    public final String a(String s) {
        fedu fedu0;
        fdwc fdwc0;
        String s3;
        String s1;
        if(Log.isLoggable("CloudNode", 4)) {
            Log.i("CloudNode", "Downloading asset " + s);
        }
        this.f.a("media");
        try {
            clbs clbs0 = clbv.a(this.a);
            s1 = null;
            clbc clbc0 = new clbc(null);
            clbc0.c(hzuz.g());
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffcv.a).v_newBuilder();
            String s2 = URLEncoder.encode(s, "UTF-8");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffcv ffcv0 = (ffcv)hftp0.b_message;
            s2.getClass();
            ffcv0.b |= 1;
            ffcv0.c = s2;
            clbc0.d(((MessageLite)(((ffcv)hftp0.N_build()))), claf.c, ffcw.a);
            clbd clbd0 = new clbd(clbc0);
            clba clba0 = new clba(null);
            clba0.a("alt", "media");
            clcf clcf0 = clcg.b(clbd0, new cldm(clba0), claf.c.a);
            if(fdso.n(s)) {
                try {
                    s3 = this.c.d(s);
                }
                catch(GeneralSecurityException generalSecurityException0) {
                    fdwc0 = this.f;
                    fdwc0.c("media", "digest decryption failed: " + generalSecurityException0.getMessage());
                    goto label_56;
                }
            }
            else {
                s3 = s;
            }
            try {
                fedu0 = new fedu(s, s3, this.e, this.c, this.b);
            }
            catch(GeneralSecurityException generalSecurityException1) {
                this.f.c("media", "setting up asset decryption failed: " + generalSecurityException1.getMessage());
                throw new IOException("Setting up asset decryption failed", generalSecurityException1);
            }
            clcj clcj0 = clbs0.e(clcf0, fedu0, this.b, -1, 0x703);
            clcj0.n("GET");
            clcp clcp0 = (clcp)fedw.d(clcj0.e().a());
            long v = (long)(((Long)fedw.d(fedu0.f)));
            int v1 = clcp0.a.a();
            this.e(fedr.b, v1);
            int v2 = (int)clcp0.a.b();
            this.d.a(fedr.b, "bytesRecv", v2);
            if(v1 != 200) {
                Log.w("CloudNode", "Fetching asset failed (error " + v1 + "): " + fedu0.g());
                this.f.c("media", "failed: " + v1);
                throw new IOException("Fetching asset failed (error " + v1 + "): " + fedu0.g());
            }
            if(this.h.a(s3) == null) {
                this.f.c("media", "failed: the file went missing!?");
                throw new IOException("Download completed apparently successfully, but file got lost.");
            }
            this.g.d();
            fdwc0 = this.f;
            fdwc0.c("media", a.u(v, "bytesWritten="));
            s1 = s3;
        }
        catch(Throwable throwable0) {
            this.f.c("media", "something went wrong");
            throw throwable0;
        }
    label_56:
        fdwc0.c("media", "something went wrong");
        return s1;
    }

    @Override  // fedv
    public final String b() {
        return "UNS GmsNetworkEngine";
    }

    @Override  // fedv
    public final void c(String s, String s1) {
        String s3;
        if(Log.isLoggable("CloudNode", 4)) {
            Log.i("CloudNode", a.l(s1, s, "Uploading ", " to "));
        }
        fdwc fdwc0 = this.f;
        fdwc0.a("upload");
        int v = FIN.finallyOpen$NT();
        clbs clbs0 = clbv.a(this.a);
        clbc clbc0 = new clbc(null);
        clbc0.c(hzuz.g());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffcx.a).v_newBuilder();
        String s2 = URLEncoder.encode(s1, "UTF-8");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffcx ffcx0 = (ffcx)hftp0.b_message;
        s2.getClass();
        ffcx0.b |= 1;
        ffcx0.c = s2;
        clbc0.d(((MessageLite)(((ffcx)hftp0.N_build()))), clag.c, ffcy.a);
        clbd clbd0 = new clbd(clbc0);
        clba clba0 = new clba(null);
        clba0.a("uploadType", "media");
        clcf clcf0 = clcg.b(clbd0, new cldm(clba0), clag.c.a);
        File file0 = this.h.a(s);
        feeb feeb0 = new feeb();
        feea feea0 = fdso.n(s1) ? new feea(file0, this.c, this.b, s1) : new feec(file0, s1);
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "Uploading to " + clcf0.c() + " using " + feea0.getClass().getName());
        }
        claw claw0 = new claw(null);
        claw0.a("Content-Type", "application/octet-stream");
        clax clax0 = new clax(claw0);
        clcj clcj0 = clbs0.e(clcf0, feeb0, this.b, -1, 0x704);
        clcj0.n("POST");
        clcj0.m(clax0);
        clcj0.r(feea0, this.b, clbk.a, clbj.a);
        gmcd gmcd0 = clcj0.e().a();
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "Upload triggered...");
        }
        clcq clcq0 = ((clcp)fedw.d(gmcd0)).a;
        int v1 = clcq0.a();
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "Upload complete. Status code: " + v1);
        }
        int v2 = feea0.e();
        this.d.a(fedr.a, "bytesSent", v2);
        int v3 = (int)clcq0.b();
        this.d.a(fedr.a, "bytesRecv", v3);
        this.e(fedr.a, v1);
        if(v1 == 200) {
            this.g.d();
            fdwc0.c("upload", "bytesSent=" + file0.length());
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        ByteBuffer byteBuffer0 = feeb0.a;
        if(byteBuffer0 == null) {
            s3 = null;
        }
        else {
            if(byteBuffer0.position() != 0) {
                feeb0.a.flip();
            }
            s3 = StandardCharsets.UTF_8.decode(feeb0.a).toString();
        }
        if(s3 == null) {
            s3 = "(null)";
        }
        Log.w("CloudNode", "error posting asset " + clcf0.toString() + ", " + v1 + " " + clcq0.e() + ": " + s3);
        fdwc0.c("upload", "failed: " + v1);
        if(v1 >= 400 && v1 < 500) {
            throw new fdsp(2, s3);
        }
        throw v1 < 500 ? new IOException("Received unexpected status code: " + v1) : new IOException(s3);
    }

    private static Object d(gmcd gmcd0) {
        try {
            return gmcd0.get();
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw new IOException("We were interrupted while waiting for the fetch to complete", interruptedException0);
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if(throwable0 != null) {
                executionException0 = throwable0;
            }
            if(!(executionException0 instanceof fdsp)) {
                throw (executionException0 instanceof IOException) ? ((IOException)executionException0) : new IOException("Something went wrong while making a request", executionException0);
            }
            throw (fdsp)executionException0;
        }
    }

    private final void e(fdvw fdvw0, int v) {
        if(v == 200) {
            this.d.a(fdvw0, "success", 1);
            return;
        }
        if(v >= 300 && v < 400) {
            this.d.a(fdvw0, "300s", 1);
            return;
        }
        if(v >= 400 && v < 500) {
            this.d.a(fdvw0, "400s", 1);
            return;
        }
        if(v >= 500 && v < 600) {
            this.d.a(fdvw0, "500s", 1);
            return;
        }
        this.d.a(fdvw0, "IOException", 1);
    }
}

