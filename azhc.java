import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.chimera.modules.clearcut.AppContextProvider;
import j..util.Objects;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpCookie;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.TWR;

public final class azhc implements azgx {
    public final azdl a;
    private static final Pattern b;
    private final Context c;
    private final String d;

    static {
        azhc.b = Pattern.compile("[^,;\\s\"]+");
    }

    public azhc(Context context0, String s, azdl azdl0) {
        this.c = context0;
        this.d = s;
        this.a = azdl0;
    }

    @Override  // azgx
    public final azgw a(hlsi hlsi0, azgp azgp0, String s, String s1, gfsx gfsx0) {
        azgw azgw0;
        GZIPOutputStream gZIPOutputStream0;
        hfse hfse1;
        gdqb gdqb3;
        String s7;
        String s6;
        ByteString hfsf0;
        String s4;
        String s3;
        clcj clcj0;
        azhb azhb0;
        hlps hlps0;
        int v2;
        List list0;
        ArrayList arrayList0;
        long v1;
        long v;
        gdqb gdqb1;
        Throwable throwable2;
        String s2;
        gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/uploader/GmsNetworkTransport", "makeNetworkRequest", 105, "GmsNetworkTransport#makeNetworkRequest");
        try {
            s2 = this.d;
            URL uRL0 = new URL(s2);
            if(!azie.d(((gful_cronetEngineProvider)new azha()), "debug_allow_http", Boolean.valueOf(false))) {
                goto label_4;
            }
            goto label_10;
        }
        catch(Throwable throwable0) {
            goto label_18;
        }
        try {
        label_4:
            if(!Objects.equals(uRL0.getProtocol(), "https")) {
                throw new IllegalStateException("Abort attempt to upload logs in plaintext: requestUrl=" + s2);
            }
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            gdqb1 = gdqb0;
            goto label_183;
        }
        try {
        label_10:
            this.a.m(hlsi0);
            v = SystemClock.elapsedRealtime();
            v1 = System.currentTimeMillis();
            arrayList0 = new ArrayList();
            list0 = azgp0.b;
            __monitor_enter(list0);
        }
        catch(Throwable throwable0) {
        label_18:
            gdqb1 = gdqb0;
            goto label_182;
        }
        try {
            Iterator iterator0 = list0.iterator();
            while(true) {
            label_21:
                v2 = 2;
                if(!iterator0.hasNext()) {
                    goto label_46;
                }
                Object object0 = iterator0.next();
                hlps0 = (hlps)object0;
                gdqb1 = gdqb0;
                break;
            }
        }
        catch(Throwable throwable3) {
            gdqb1 = gdqb0;
            goto label_52;
        }
        try {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hlps0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hlps0));
            hftr hftr0 = (hftr)hftp0;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hlps hlps1 = (hlps)hftr0.b_message;
            hlps1.b |= 2;
            hlps1.d = v;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hlps hlps2 = (hlps)hftr0.b_message;
            hlps2.b |= 1;
            hlps2.c = v1;
            arrayList0.add(((hlps)((ProtoLiteBuilder)hftr0).N_build()));
            gdqb0 = gdqb1;
            goto label_21;
        label_46:
            gdqb1 = gdqb0;
            list0.clear();
            list0.addAll(arrayList0);
            __monitor_exit(list0);
            goto label_54;
        label_52:
            __monitor_exit(list0);
        }
        catch(Throwable throwable3) {
            goto label_52;
        }
        try {
            throw throwable3;
        label_54:
            azhb0 = new azhb();
            clbs clbs0 = clbv.a(AppContextProvider.a());
            clcf clcf0 = clcg.f(s2, ckcm.b, clbk.a, clbj.a);
            int v3 = gfsx0.i() ? ((int)(((Integer)gfsx0.d()))) : -1;
            clcj0 = clbs0.e(clcf0, azhb0, gmap.a, v3, 0x1065FFF);
            clcj0.n("POST");
            clcj0.f();
            boolean z = hlsi0.j;
            if(!z) {
                azhc.b(azgp0);
            }
            if(s != null && !s.isEmpty()) {
                clcj0.i("Authorization", s);
            }
            if(s1 != null && !s1.isEmpty() && !z) {
                clcj0.i("X-SERVER-TOKEN", s1);
            }
            if(z) {
                s3 = "ANONYMOUS";
                s4 = "ANONYMOUS";
            }
            else {
                s3 = ejky.b(this.c).a;
                if(hraz.a.e().W()) {
                    s4 = s3;
                    s3 = gfta.b(s3);
                }
                else if(s3 == null) {
                    s4 = null;
                    s3 = "\"\"";
                }
                else if(!azhc.b.matcher(s3).matches()) {
                    s4 = s3;
                    s3 = a.a(s3, "\"", "\"");
                }
                else {
                    s4 = s3;
                }
            }
            clcj0.i("Cookie", "NID=" + s3);
            Context context0 = this.c;
            try {
                String s5 = hraz.f();
                switch(s5.hashCode()) {
                    case 0xAFC87959: {
                        goto label_91;
                    }
                    case 0x47AEF771: {
                        goto label_93;
                    }
                }
            }
            catch(IllegalArgumentException | NullPointerException unused_ex) {
                goto label_95;
            }
            throw new IllegalArgumentException();
        label_91:
            if(!s5.equals("BROTLI_ONLY")) {
                throw new IllegalArgumentException();
            label_93:
                if(!s5.equals("GZIP_ONLY")) {
                    try {
                        throw new IllegalArgumentException();
                    }
                    catch(IllegalArgumentException | NullPointerException unused_ex) {
                    label_95:
                        Log.e("CCTLogRequestSerializer", String.format("Received invalid compression strategy: %s", hraz.f()));
                    }
                }
                v2 = 1;
            }
            if(v2 - 1 == 1) {
                int v4 = (int)hraz.a.e().m();
                long v5 = hraz.a.e().n();
                try(gdqb gdqb2 = gdsp.e("com/google/android/gms/clearcut/uploader/LogRequestSerializer", "serializeWithBrotli", 0x77, "serializeWithBrotli")) {
                    hfse hfse0 = new hfse(0x80);
                    try(OutputStream outputStream0 = ccjq.c(context0, hfse0, v4, ((int)v5))) {
                        azhe.a(outputStream0, azgp0);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        Log.e("CCTLogRequestSerializer", "Compression level or window size is invalid.", illegalArgumentException0);
                        throw new ccjo(illegalArgumentException0);
                    }
                    hfsf0 = hfse0.b();
                    s6 = "br";
                    s7 = "application/x-brotli";
                    goto label_138;
                }
                catch(ccjo unused_ex) {
                }
                goto label_121;
            }
            else {
            label_121:
                gdqb3 = gdsp.e("com/google/android/gms/clearcut/uploader/LogRequestSerializer", "serializeWithGzip", 104, "serializeWithGzip");
                goto label_122;
            }
            goto label_138;
        }
        catch(Throwable throwable0) {
            goto label_182;
        }
        try {
        label_122:
            hfse1 = new hfse(0x80);
            gZIPOutputStream0 = new GZIPOutputStream(hfse1, 0x4000);
        }
        catch(Throwable throwable4) {
            goto label_134;
        }
        try {
            azhe.a(gZIPOutputStream0, azgp0);
            goto label_129;
        }
        catch(Throwable throwable5) {
            try {
                TWR.safeClose$NT(gZIPOutputStream0, throwable5);
                throw throwable5;
            label_129:
                gZIPOutputStream0.close();
                hfsf0 = hfse1.b();
                s7 = "application/x-gzip";
                goto label_136;
            }
            catch(Throwable throwable4) {
            }
        }
        try {
        label_134:
            TWR.safeClose$NT(gdqb3, throwable4);
            throw throwable4;
        label_136:
            gdqb3.close();
            s6 = "gzip";
        label_138:
            clcj0.i("Content-Encoding", s6);
            clcj0.i("Content-Type", s7);
            azdl azdl0 = this.a;
            azdl0.h(hlsi0, ((long)hfsf0.size()));
            Context context1 = this.c;
            clcj0.q(context1, hfsf0.n(), clbk.a, clbj.a);
            clcj0.g(new clco(this, hlsi0, hfsf0), gmap.a);
            clcn clcn0 = clcj0.e();
            try(gdqb gdqb4 = gdsp.e("com/google/android/gms/clearcut/uploader/GmsNetworkTransport", "fireRequestAndProcessResponse", 0xB3, "GmsNetworkTransport#request.start")) {
                clcn0.a();
                long v6 = (long)Math.max(((int)hraz.a.e().w()), 30000);
                if(!azhb0.d.block(v6)) {
                    clcn0.b();
                    throw new SocketTimeoutException();
                }
                Exception exception0 = azhb0.c;
                if((exception0 instanceof clbw)) {
                    throw new IOException(((clbw)exception0));
                }
                if(exception0 != null) {
                    throw new IOException(exception0);
                }
                clcq clcq0 = azhb0.b;
                azdl0.k(clcq0.a());
                gged_interceptors gged0 = (gged_interceptors)clcq0.d().get("Set-Cookie");
                if(gged0 != null) {
                    int v7 = gged0.size();
                    int v8 = 0;
                    while(v8 < v7) {
                        for(Object object1: ggia.g(HttpCookie.parse(((String)gged0.get(v8))))) {
                            HttpCookie httpCookie0 = (HttpCookie)object1;
                            if(!httpCookie0.getName().equals("NID") || httpCookie0.getValue() == null) {
                                continue;
                            }
                            else if(!ejlg.b(new ejjz(httpCookie0.getValue(), s4), context1)) {
                                Log.e("CCTCronetTransport", "Error in PseudonymousId compareAndSet() operation");
                                azdl0.g();
                            }
                            break;
                        }
                        ++v8;
                    }
                }
                azgw0 = new azgw(azhb0.a.b().toByteArray(), clcq0.a(), clcq0.e());
            }
            goto label_188;
        }
        catch(Throwable throwable0) {
        }
    label_182:
        throwable2 = throwable0;
        try {
        label_183:
            gdqb1.close();
        }
        catch(Throwable throwable6) {
            throwable2.addSuppressed(throwable6);
        }
        throw throwable2;
    label_188:
        gdqb1.close();
        return azgw0;
    }

    private static final void b(azgp azgp0) {
        hraz hraz0 = hraz.a;
        if(!hraz0.e().M()) {
            return;
        }
        gmcd gmcd0 = ejkx.b(gged_interceptors.i(azgp0.c()));
        try {
            gged_interceptors gged0 = (gged_interceptors)((glyq)gmcd0).v(Math.max(hraz0.e().x(), 0L), TimeUnit.MILLISECONDS);
            azgp0.e.clear();
            azgp0.e.addAll(gged0);
            azgp0.d = hraz0.e().O();
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            Log.e("CCTCronetTransport", "Error fetching Session Zwiebacks");
        }
    }
}

