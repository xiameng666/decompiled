import android.util.Base64;
import android.util.Log;
import j..net.URLDecoder;
import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

final class fnbv implements Runnable, Delayed {
    final fnbp a;
    final fnbz b;

    public fnbv() {
        throw null;
    }

    public fnbv(fnbz fnbz0, fnbp fnbp0) {
        this.a = fnbp0;
        Objects.requireNonNull(fnbz0);
        this.b = fnbz0;
        super();
    }

    @Override
    public final int compareTo(Object object0) {
        Delayed delayed0 = (Delayed)object0;
        return 0;
    }

    @Override
    public final long getDelay(TimeUnit timeUnit0) {
        return 0L;
    }

    @Override
    public final void run() {
        int v12;
        boolean z6;
        fnbl fnbl7;
        String s15;
        int v18;
        long v17;
        long v16;
        HttpURLConnection httpURLConnection4;
        long v15;
        InputStream inputStream0;
        long v14;
        String s14;
        HttpURLConnection httpURLConnection3;
        fnbl fnbl6;
        String s11;
        fnbl fnbl5;
        long v10;
        Iterator iterator0;
        HttpURLConnection httpURLConnection1;
        FileInputStream fileInputStream0;
        fnbl fnbl4;
        File file5;
        long v9;
        String s8;
        File file4;
        fnbl fnbl3;
        String s7;
        String s6;
        fnbl fnbl2;
        long v7;
        File file3;
        Throwable throwable3;
        int v6;
        long v5;
        fnbl fnbl1;
        long v4;
        ByteArrayInputStream byteArrayInputStream0;
        byte[] arr_b;
        String[] arr_s;
        String s4;
        String s3;
        File file2;
        String s2;
        fnbl fnbl0;
        fnbn fnbn0;
        fnbo fnbo0;
        fncc fncc0;
        String s1;
        File file0;
        String s;
        fnbm fnbm0;
        fnbz fnbz0 = this.b;
        fnbp fnbp0 = this.a;
        synchronized(fnbz0) {
            fnbm0 = fnbp0.d;
            boolean z = fnbp0.f();
            s = fnbp0.a;
            file0 = fnbp0.b;
            s1 = fnbp0.c;
            boolean z1 = fnbi.a(s);
            boolean z2 = fnbp.g(s);
            fncc0 = fnbp0.e;
            fnbo0 = fnbp0.a();
            fnbn0 = fnbp0.j;
            int v = fnbp0.i + 1;
            fnbp0.i = v;
        }
        __monitor_exit(fnbz0);
        File file1 = new File(file0, s1);
        gghp gghp0 = fnbp0.f;
        HttpURLConnection httpURLConnection0 = null;
        long v1 = 0L;
        try {
            if(z) {
                fnbl0 = new fnbl(2, -1, null, null, null);
                s2 = s1;
                file2 = file1;
                goto label_187;
            }
            boolean z3 = fnbz0.l(fnbo0);
        }
        catch(RuntimeException | IOException exception0) {
            s3 = s1;
            file2 = file1;
            fnbl1 = null;
            v5 = 0L;
            goto label_570;
        }
        catch(Throwable throwable1) {
            s3 = s1;
            file2 = file1;
            throwable3 = throwable1;
            file3 = file0;
            fnbl2 = null;
            v7 = 0L;
            v6 = 0;
            goto label_616;
        }
        if(!z3) {
            if(fnbp0.k != -1) {
                fnbz0.e();
            }
            try {
                if(fncc0.b() > 0L) {
                    fnbp0.i = 1;
                }
            }
            catch(IOException iOException0) {
                Log.w(fnbz.a, "Maybe reset connectionAttempts failed, see exception: ", iOException0);
            }
            fnbz0.f(fnbp0);
            return;
        }
        if(z1) {
            try {
                gftb.checkTrue(fnbi.a(s));
                int v2 = s.indexOf(44);
                if(v2 != -1) {
                    s4 = s.substring(v2 + 1);
                    arr_s = s.substring(5, v2).split(";");
                    goto label_68;
                }
                goto label_147;
            }
            catch(fnbh fnbh0) {
                s2 = s1;
                file2 = file1;
                goto label_152;
            }
            catch(RuntimeException | IOException exception0) {
                s2 = s1;
                file2 = file1;
                s3 = s2;
                fnbl1 = null;
                v5 = 0L;
                goto label_570;
            }
            catch(Throwable throwable1) {
                s2 = s1;
                file2 = file1;
                goto label_169;
            }
        label_68:
            int v3 = 1;
            boolean z4 = false;
            while(v3 < arr_s.length) {
                try {
                    String s5 = arr_s[v3];
                    if(s5.equals("base64")) {
                        z4 = true;
                    }
                    else if(!s5.startsWith("charset=")) {
                        Log.e(fnbi.a, a.l(s, s5, "Unknown data-URI option \'", "\' in "));
                        throw new fnbh(2);
                    }
                    ++v3;
                }
                catch(fnbh fnbh0) {
                    try {
                        s2 = s1;
                        file2 = file1;
                        goto label_152;
                    }
                    catch(fnbh fnbh0) {
                        goto label_152;
                    }
                    catch(RuntimeException | IOException exception0) {
                        s3 = s2;
                        fnbl1 = null;
                        v5 = 0L;
                        goto label_570;
                    }
                    catch(Throwable throwable1) {
                        goto label_169;
                    }
                }
                catch(RuntimeException | IOException exception0) {
                    s3 = s1;
                    file2 = file1;
                    fnbl1 = null;
                    v5 = 0L;
                    goto label_570;
                }
                catch(Throwable throwable1) {
                    s3 = s1;
                    file2 = file1;
                    throwable3 = throwable1;
                    file3 = file0;
                    fnbl2 = null;
                    v7 = 0L;
                    v6 = 0;
                    goto label_616;
                }
            }
            if(z4) {
                try {
                    arr_b = Base64.decode(s4, 0);
                    goto label_99;
                }
                catch(IllegalArgumentException unused_ex) {
                    try {
                        s2 = s1;
                        file2 = file1;
                        Log.e("fnbi", "Invalid base64 payload in data URI: " + s);
                        throw new fnbh(4);
                    }
                    catch(fnbh fnbh0) {
                        goto label_152;
                    }
                    catch(RuntimeException | IOException exception0) {
                        s3 = s2;
                        fnbl1 = null;
                        v5 = 0L;
                        goto label_570;
                    }
                    catch(Throwable throwable1) {
                        goto label_169;
                    }
                    try {
                    label_99:
                        Log.i(fnbi.a, "Successfully decoded data uri: " + s);
                    }
                    catch(fnbh fnbh0) {
                        s2 = s1;
                        file2 = file1;
                        goto label_152;
                    }
                    catch(RuntimeException | IOException exception0) {
                        s2 = s1;
                        goto label_118;
                    }
                    catch(Throwable throwable1) {
                        s2 = s1;
                        file2 = file1;
                        goto label_169;
                    }
                }
                catch(fnbh fnbh0) {
                    s2 = s1;
                    file2 = file1;
                    goto label_152;
                }
                catch(RuntimeException | IOException exception0) {
                    s2 = s1;
                    goto label_118;
                }
                catch(Throwable throwable1) {
                    s2 = s1;
                    file2 = file1;
                    goto label_169;
                }
                try {
                    byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                    goto label_124;
                }
                catch(fnbh fnbh0) {
                    s2 = s1;
                    file2 = file1;
                    goto label_152;
                }
                catch(RuntimeException | IOException exception0) {
                    s2 = s1;
                label_118:
                    file2 = file1;
                    s3 = s2;
                    fnbl1 = null;
                    v5 = 0L;
                    goto label_570;
                }
                catch(Throwable throwable1) {
                    s2 = s1;
                }
                file2 = file1;
                goto label_169;
                try {
                label_124:
                    s2 = s1;
                    file2 = file1;
                    v4 = fncc0.a(byteArrayInputStream0, 0L, -1L);
                }
                catch(RuntimeException | IOException exception0) {
                    s3 = s2;
                    fnbl1 = null;
                    v5 = 0L;
                    goto label_570;
                }
                catch(Throwable throwable1) {
                    goto label_169;
                }
                try {
                    byteArrayInputStream0.close();
                    goto label_239;
                }
                catch(RuntimeException | IOException exception0) {
                    fnbl1 = null;
                    v5 = 0L;
                    v1 = v4;
                    v6 = 0;
                    s3 = s2;
                    goto label_571;
                }
                catch(Throwable throwable2) {
                    throwable3 = throwable2;
                    file3 = file0;
                    v7 = v4;
                    s3 = s2;
                    fnbl2 = null;
                    v6 = 0;
                    goto label_616;
                }
            }
            try {
                s2 = s1;
                file2 = file1;
                Log.e(fnbi.a, "We only understand base64-encoded data URIs: " + s);
                throw new fnbh(3);
            label_147:
                s2 = s1;
                file2 = file1;
                Log.e(fnbi.a, "Comma not found in data URI: " + s);
                throw new fnbh(1);
            }
            catch(fnbh fnbh0) {
                try {
                label_152:
                    int v8 = fnbh0.a;
                    switch(v8) {
                        case 0: {
                            throw null;
                        }
                        case 1: {
                            s6 = "MALFORMED";
                            break;
                        }
                        case 2: {
                            s6 = "UNKNOWN_OPTION";
                            break;
                        }
                        default: {
                            s6 = v8 == 3 ? "INVALID_ENCODING" : "INVALID_PAYLOAD";
                        }
                    }
                    fnbl0 = new fnbl(3, -1, "DataUri error type: " + s6, null, null);
                    goto label_187;
                }
                catch(RuntimeException | IOException exception0) {
                    s3 = s2;
                    fnbl1 = null;
                    v5 = 0L;
                    goto label_570;
                }
                catch(Throwable throwable1) {
                }
            }
            catch(RuntimeException | IOException exception0) {
                s3 = s2;
                fnbl1 = null;
                v5 = 0L;
                goto label_570;
            }
            catch(Throwable throwable1) {
            }
        label_169:
            s3 = s2;
        }
        else {
            s2 = s1;
            file2 = file1;
            if(z2) {
                try {
                    s7 = URLDecoder.decode(s, "UTF-8");
                }
                catch(IllegalArgumentException | UnsupportedEncodingException unused_ex) {
                    try {
                        fnbl3 = new fnbl(3, -1, "Badly encoded file url: " + s, null, null);
                    }
                    catch(RuntimeException | IOException exception0) {
                        file4 = file2;
                        s8 = s2;
                        goto label_256;
                    }
                    catch(Throwable throwable1) {
                        file4 = file2;
                        s8 = s2;
                        goto label_261;
                    }
                    fnbl0 = fnbl3;
                label_187:
                    if(fnbp0.k != -1) {
                        fnbz0.e();
                    }
                    try {
                        if(fncc0.b() > 0L) {
                            fnbp0.i = 1;
                        }
                    }
                    catch(IOException iOException1) {
                        Log.w("fnbz", "Maybe reset connectionAttempts failed, see exception: ", iOException1);
                    }
                    v9 = 0L;
                    file5 = file0;
                    s3 = s2;
                    fnbl4 = fnbl0;
                    fnbz0.h(file5, s3, fnbm0, fnbl4, file2, v9);
                    return;
                }
                catch(RuntimeException | IOException exception0) {
                    s3 = s2;
                    fnbl1 = null;
                    v5 = 0L;
                    goto label_570;
                }
                catch(Throwable throwable1) {
                    s3 = s2;
                    throwable3 = throwable1;
                    file3 = file0;
                    fnbl2 = null;
                    v7 = 0L;
                    v6 = 0;
                    goto label_616;
                }
                try {
                    File file6 = new File(s7.replace("file:/", ""));
                    fileInputStream0 = null;
                    fileInputStream0 = new FileInputStream(file6);
                    v4 = fncc0.a(fileInputStream0, 0L, file6.length());
                    goto label_224;
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    fileInputStream0 = null;
                    v4 = 0L;
                    throw new fnby(fileNotFoundException0, 9);
                }
                catch(Throwable throwable4) {
                    v4 = 0L;
                }
                if(fileInputStream0 != null) {
                    try {
                        try {
                            fileInputStream0.close();
                        }
                        catch(IOException unused_ex) {
                            try {
                                throw throwable4;
                            }
                            catch(RuntimeException | IOException exception0) {
                                goto label_227;
                            }
                            try {
                            label_224:
                                fileInputStream0.close();
                                goto label_239;
                            }
                            catch(IOException unused_ex) {
                                goto label_239;
                            }
                            catch(RuntimeException exception0) {
                                goto label_227;
                            }
                        }
                        catch(RuntimeException exception0) {
                        label_227:
                            fnbl1 = null;
                            v5 = 0L;
                            v1 = v4;
                            v6 = 0;
                            s3 = s2;
                            goto label_571;
                        }
                    }
                    catch(Throwable throwable5) {
                        goto label_233;
                    }
                }
                throw throwable4;
            label_233:
                throwable3 = throwable5;
                file3 = file0;
                v7 = v4;
                s3 = s2;
                fnbl2 = null;
                v6 = 0;
                goto label_616;
            label_239:
                if(fnbp0.k != -1) {
                    fnbz0.e();
                }
                try {
                    if(fncc0.b() > 0L) {
                        fnbp0.i = 1;
                    }
                }
                catch(IOException iOException2) {
                    Log.w("fnbz", "Maybe reset connectionAttempts failed, see exception: ", iOException2);
                }
                file5 = file0;
                fnbl4 = null;
                v9 = v4;
                s3 = s2;
                fnbz0.h(file5, s3, fnbm0, fnbl4, file2, v9);
                return;
            }
            try {
                file4 = file2;
                s8 = s2;
                httpURLConnection1 = fnbz0.b(fnbz.a(file0, s8), s);
                goto label_267;
            }
            catch(RuntimeException | IOException exception0) {
            label_256:
                s3 = s8;
                file2 = file4;
                fnbl1 = null;
                v5 = 0L;
                goto label_570;
            }
            catch(Throwable throwable1) {
            }
        label_261:
            s3 = s8;
            file2 = file4;
        }
        throwable3 = throwable1;
        file3 = file0;
        fnbl2 = null;
        v7 = 0L;
        v6 = 0;
        goto label_616;
        try {
        label_267:
            gftb.z(httpURLConnection1, "Http request must not be null when actually starting a download");
            iterator0 = gghp0.z().iterator();
            while(true) {
            label_269:
                boolean z5 = iterator0.hasNext();
                goto label_276;
            }
        }
        catch(RuntimeException | IOException exception0) {
            s3 = s8;
            HttpURLConnection httpURLConnection2 = httpURLConnection1;
            file2 = file4;
            httpURLConnection0 = httpURLConnection2;
            fnbl1 = null;
            v5 = 0L;
            goto label_570;
            try {
            label_276:
                if(z5) {
                    Object object0 = iterator0.next();
                    String s9 = (String)object0;
                    Iterator iterator1 = ((gfxo)gghp0).g(s9).iterator();
                label_280:
                    if(!iterator1.hasNext()) {
                        goto label_269;
                    }
                    Object object1 = iterator1.next();
                    httpURLConnection1.setRequestProperty(s9, ((String)object1));
                    goto label_280;
                }
                v10 = fncc0.b();
                goto label_304;
            }
            catch(RuntimeException | IOException exception0) {
            }
            catch(Throwable throwable6) {
                goto label_295;
            }
            s3 = s8;
            httpURLConnection2 = httpURLConnection1;
            file2 = file4;
            httpURLConnection0 = httpURLConnection2;
            fnbl1 = null;
            v5 = 0L;
            goto label_570;
        }
        catch(Throwable throwable6) {
        label_295:
            s3 = s8;
            file2 = file4;
            file3 = file0;
            fnbl2 = null;
            httpURLConnection0 = httpURLConnection1;
            throwable3 = throwable6;
        }
        v7 = 0L;
        v6 = 0;
        goto label_616;
        try {
            try {
            label_304:
                int v11 = Long.compare(v10, 0L);
                if(v11 > 0) {
                    httpURLConnection1.setRequestProperty("Range", a.D(v10, "bytes=", "-"));
                }
                if(fnbn0 == null) {
                    goto label_319;
                }
                else {
                    String s10 = fnbn0.a();
                    if(s10 == null) {
                        fnbl5 = new fnbl(12, -1, null, null, null);
                        goto label_364;
                    }
                    else {
                        httpURLConnection1.setRequestProperty("Authorization", "Bearer " + s10);
                        s11 = s10;
                        goto label_314;
                    }
                }
                goto label_630;
            }
            catch(RuntimeException | IOException exception0) {
                goto label_377;
            }
            try {
            label_314:
                fnbz0.n(httpURLConnection1, fnbp0.k);
                httpURLConnection1.connect();
                iOException3 = null;
            }
            catch(IOException iOException3) {
                goto label_326;
            }
            catch(RuntimeException exception0) {
                goto label_377;
            }
            try {
                __monitor_enter(fnbz0);
            }
            catch(RuntimeException | IOException exception0) {
                goto label_377;
            }
        }
        catch(Throwable throwable7) {
            goto label_371;
        }
        try {
            goto label_327;
        }
        catch(Throwable throwable8) {
            goto label_348;
        }
        try {
            try {
            label_319:
                s11 = null;
            }
            catch(RuntimeException | IOException exception0) {
                goto label_377;
            }
            try {
                fnbz0.n(httpURLConnection1, fnbp0.k);
                httpURLConnection1.connect();
                goto label_325;
            }
            catch(IOException iOException3) {
            }
            catch(RuntimeException exception0) {
                goto label_377;
            }
        }
        catch(Throwable throwable7) {
            goto label_371;
        }
        goto label_326;
    label_325:
        iOException3 = null;
        try {
        label_326:
            __monitor_enter(fnbz0);
        }
        catch(RuntimeException | IOException exception0) {
            goto label_377;
        }
        catch(Throwable throwable7) {
            goto label_371;
        }
        try {
        label_327:
            if(fnbp0.f()) {
                fnbz.k(httpURLConnection1);
                fnbl6 = new fnbl(2, -1, null, null, null);
                goto label_330;
            }
            else {
                goto label_345;
            }
            goto label_630;
        }
        catch(Throwable throwable8) {
            goto label_348;
        }
        try {
        label_330:
            __monitor_exit(fnbz0);
        }
        catch(Throwable throwable8) {
            s3 = s8;
            httpURLConnection3 = httpURLConnection1;
            v5 = v10;
            file2 = file4;
            httpURLConnection0 = fnbl6;
            __monitor_exit(fnbz0);
            break;
        }
        String s12 = s8;
        file2 = file4;
        httpURLConnection3 = httpURLConnection1;
        v5 = v10;
        httpURLConnection0 = fnbl6;
        goto label_630;
        try {
        label_345:
            __monitor_exit(fnbz0);
            goto label_361;
        }
        catch(Throwable throwable8) {
        label_348:
            s3 = s8;
            httpURLConnection3 = httpURLConnection1;
            v5 = v10;
            file2 = file4;
        }
        while(true) {
            __monitor_exit(fnbz0);
            break;
        }
        try {
            throw throwable8;
        }
        catch(RuntimeException | IOException exception0) {
            goto label_567;
        }
        catch(Throwable throwable7) {
            goto label_609;
        }
    label_361:
        if(iOException3 == null) {
            goto label_394;
            try {
            label_396:
                if(httpURLConnection1.getResponseCode() == 206) {
                    goto label_397;
                }
                else {
                    goto label_399;
                }
                goto label_400;
            }
            catch(RuntimeException | IOException exception0) {
                goto label_447;
            }
            catch(Throwable throwable7) {
                goto label_453;
            }
        label_397:
            int v13 = 1;
            goto label_400;
        label_399:
            v13 = 0;
            try {
            label_400:
                if(v13 != 0 && v11 == 0) {
                    Log.e("fnbz", "Got partial HTTP response, but no existing bytes");
                }
                if(v11 > 0) {
                    if(v13 != 0) {
                    }
                    file4.getName();
                }
            }
            catch(RuntimeException | IOException exception0) {
                goto label_416;
            }
            catch(Throwable throwable7) {
                goto label_422;
            }
            try {
                String s13 = httpURLConnection1.getHeaderField("Transfer-Encoding");
                if(s13 == null || s13.equals("identity")) {
                    s14 = httpURLConnection1.getHeaderField("Content-Length");
                    if(s14 == null) {
                        v14 = -1L;
                    }
                    else {
                        v14 = Long.parseLong(s14);
                        inputStream0 = httpURLConnection1.getInputStream();
                        goto label_458;
                    }
                }
                else {
                    goto label_429;
                }
                inputStream0 = httpURLConnection1.getInputStream();
                goto label_458;
            }
            catch(RuntimeException | IOException exception0) {
                goto label_447;
            }
            catch(Throwable throwable7) {
                goto label_453;
            }
            try {
                try {
                    v14 = Long.parseLong(s14);
                    inputStream0 = httpURLConnection1.getInputStream();
                    goto label_458;
                }
                catch(NumberFormatException unused_ex) {
                    Log.e("fnbz", "Unparseable Content-Length: " + s14);
                }
            }
            catch(RuntimeException | IOException exception0) {
            label_416:
                s3 = s8;
                httpURLConnection3 = httpURLConnection1;
                v5 = v10;
                file2 = file4;
                goto label_567;
            }
            catch(Throwable throwable7) {
            label_422:
                s3 = s8;
                httpURLConnection3 = httpURLConnection1;
                v5 = v10;
                file2 = file4;
                goto label_609;
            }
            v14 = -1L;
            inputStream0 = httpURLConnection1.getInputStream();
            goto label_458;
        label_429:
            v14 = -1L;
            try {
                inputStream0 = httpURLConnection1.getInputStream();
                goto label_458;
            }
            catch(ClassCastException classCastException0) {
            }
            catch(IOException iOException5) {
                goto label_441;
            }
            catch(RuntimeException exception0) {
                goto label_447;
            }
            catch(Throwable throwable7) {
                goto label_453;
            }
            try {
                s12 = s8;
                file2 = file4;
                httpURLConnection3 = httpURLConnection1;
                v5 = v10;
                throw classCastException0;
            }
            catch(IOException iOException5) {
                throw new fnby(iOException5, 6);
            label_441:
                s12 = s8;
                file2 = file4;
                httpURLConnection3 = httpURLConnection1;
                v5 = v10;
                try {
                    throw new fnby(iOException5, 6);
                label_447:
                    s12 = s8;
                    file2 = file4;
                    httpURLConnection3 = httpURLConnection1;
                    v5 = v10;
                    goto label_566;
                label_453:
                    s12 = s8;
                    file2 = file4;
                    httpURLConnection3 = httpURLConnection1;
                    v5 = v10;
                    goto label_608;
                }
                catch(RuntimeException | IOException exception0) {
                    goto label_566;
                }
                catch(Throwable throwable7) {
                    goto label_608;
                }
            label_458:
                if(1 == v13) {
                    v5 = v10;
                    v15 = v14;
                    httpURLConnection4 = httpURLConnection1;
                    v16 = v5;
                }
                else {
                    v5 = v10;
                    v15 = v14;
                    httpURLConnection4 = httpURLConnection1;
                    v16 = 0L;
                }
                try {
                    v17 = fncc0.a(inputStream0, v16, v15);
                    goto label_509;
                }
                catch(IOException iOException6) {
                    try {
                        s2 = s8;
                        file2 = file4;
                        if((iOException6 instanceof fnby)) {
                            throw iOException6;
                        }
                        if(!(iOException6 instanceof SocketTimeoutException)) {
                            throw new fnby(iOException6, 11);
                        }
                    }
                    catch(Throwable throwable9) {
                        goto label_486;
                    }
                    try {
                        throw new fnby(iOException6, 8);
                    }
                    catch(Throwable throwable9) {
                        v18 = 1;
                        goto label_487;
                    }
                }
                catch(Throwable throwable9) {
                    s2 = s8;
                    file2 = file4;
                }
            label_486:
                v18 = 0;
                try {
                    try {
                    label_487:
                        inputStream0.close();
                        throw throwable9;
                    }
                    catch(IOException iOException7) {
                    }
                    catch(RuntimeException exception0) {
                        goto label_497;
                    }
                    try {
                        if(!(iOException7 instanceof fnby)) {
                            throw new fnby(iOException7, 11);
                        }
                        throw iOException7;
                    label_497:
                        httpURLConnection0 = httpURLConnection4;
                        fnbl1 = null;
                        v6 = v18;
                    }
                    catch(RuntimeException | IOException exception0) {
                        goto label_497;
                    }
                }
                catch(Throwable throwable10) {
                    goto label_502;
                }
                s3 = s2;
                goto label_571;
            label_502:
                file3 = file0;
                fnbl2 = null;
                httpURLConnection0 = httpURLConnection4;
                throwable3 = throwable10;
                v6 = v18;
                s3 = s2;
                v7 = v1;
                goto label_615;
                try {
                label_509:
                    inputStream0.close();
                    goto label_541;
                }
                catch(IOException iOException8) {
                    try {
                        s15 = s8;
                        file2 = file4;
                        v1 = v17;
                        if(!(iOException8 instanceof fnby)) {
                            throw new fnby(iOException8, 11);
                        }
                        throw iOException8;
                    }
                    catch(RuntimeException | IOException exception0) {
                        goto label_526;
                    }
                    catch(Throwable throwable11) {
                    }
                }
                catch(RuntimeException exception0) {
                    s15 = s8;
                    file2 = file4;
                    v1 = v17;
                label_526:
                    httpURLConnection0 = httpURLConnection4;
                    fnbl1 = null;
                    s3 = s15;
                    v6 = 0;
                    goto label_571;
                }
                catch(Throwable throwable11) {
                    s15 = s8;
                    file2 = file4;
                    v1 = v17;
                }
                file3 = file0;
                fnbl2 = null;
                httpURLConnection0 = httpURLConnection4;
                throwable3 = throwable11;
                s3 = s15;
                goto label_613;
            label_541:
                fnbz.k(httpURLConnection4);
                if(fnbp0.k != -1) {
                    fnbz0.e();
                }
                try {
                    if(fncc0.b() > v5) {
                        fnbp0.i = 1;
                    }
                }
                catch(IOException iOException9) {
                    Log.w("fnbz", "Maybe reset connectionAttempts failed, see exception: ", iOException9);
                }
                file5 = file0;
                fnbl4 = null;
                s3 = s8;
                v9 = v17;
                file2 = file4;
                fnbz0.h(file5, s3, fnbm0, fnbl4, file2, v9);
                return;
                try {
                label_555:
                    s12 = s8;
                    file2 = file4;
                    httpURLConnection3 = httpURLConnection1;
                    v5 = v10;
                    Log.e("fnbz", a.s(s, v12, "Non-success http response code ", " for: "));
                    if(v12 == 0x1A0) {
                        v1 = v5;
                    }
                    else {
                        fnbl7 = new fnbl(4, v12, null, s11, null);
                        goto label_629;
                    }
                    goto label_630;
                }
                catch(RuntimeException | IOException exception0) {
                    goto label_566;
                }
                catch(Throwable throwable7) {
                }
            }
            catch(RuntimeException exception0) {
            label_566:
                s3 = s12;
            label_567:
                HttpURLConnection httpURLConnection5 = httpURLConnection0;
                httpURLConnection0 = httpURLConnection3;
                fnbl1 = httpURLConnection5;
            label_570:
                v6 = 0;
                try {
                label_571:
                    if(fnbp0.f()) {
                        z6 = false;
                        fnbl1 = new fnbl(2, -1, null, null, null);
                    }
                    else if(fnbz0.l(fnbo0)) {
                        Log.w("fnbz", "Request failed for unknown reason, see exception: ", exception0);
                        fnbl1 = (exception0 instanceof fnby) ? fnbl.a(((fnby)exception0).a, ((fnby)exception0)) : fnbl.a(((exception0 instanceof IOException) ? 11 : 1), exception0);
                        z6 = false;
                    }
                    else {
                        z6 = true;
                    }
                }
                catch(Throwable throwable12) {
                    file3 = file0;
                    fnbl2 = fnbl1;
                    throwable3 = throwable12;
                    v7 = v1;
                    goto label_615;
                }
                fnbz.k(httpURLConnection0);
                if(fnbp0.k != -1) {
                    fnbz0.e();
                }
                try {
                    if(fncc0.b() > v5) {
                        fnbp0.i = 1;
                    }
                }
                catch(IOException iOException10) {
                    Log.w("fnbz", "Maybe reset connectionAttempts failed, see exception: ", iOException10);
                }
                if(v6 != 0) {
                    fnbz0.j(fnbp0);
                    return;
                }
                if(z6) {
                    fnbz0.f(fnbp0);
                    return;
                }
                file5 = file0;
                fnbl4 = fnbl1;
                v9 = v1;
                fnbz0.h(file5, s3, fnbm0, fnbl4, file2, v9);
                return;
            }
            catch(Throwable throwable7) {
            }
        label_608:
            s3 = s12;
        label_609:
            file3 = file0;
            fnbl2 = httpURLConnection0;
            httpURLConnection0 = httpURLConnection3;
            throwable3 = throwable7;
        label_613:
            v7 = v1;
            v6 = 0;
        label_615:
            v1 = v5;
        label_616:
            fnbz.k(httpURLConnection0);
            if(fnbp0.k != -1) {
                fnbz0.e();
            }
            try {
                if(fncc0.b() > v1) {
                    fnbp0.i = 1;
                }
            }
            catch(IOException iOException11) {
                Log.w("fnbz", "Maybe reset connectionAttempts failed, see exception: ", iOException11);
            }
            if(v6 == 0) {
                fnbz0.h(file3, s3, fnbm0, fnbl2, file2, v7);
            }
            else {
                fnbz0.j(fnbp0);
            }
            throw throwable3;
        label_629:
            httpURLConnection0 = fnbl7;
        }
        else {
            if((iOException3 instanceof fnbx)) {
                try {
                    fnbl5 = new fnbl(3, -1, iOException3.getMessage(), null, null);
                label_364:
                    s12 = s8;
                    file2 = file4;
                    httpURLConnection3 = httpURLConnection1;
                    v5 = v10;
                    httpURLConnection0 = fnbl5;
                    goto label_630;
                label_371:
                    s3 = s8;
                    httpURLConnection3 = httpURLConnection1;
                    v5 = v10;
                    file2 = file4;
                    goto label_609;
                label_377:
                    s3 = s8;
                    httpURLConnection3 = httpURLConnection1;
                    v5 = v10;
                    file2 = file4;
                    goto label_567;
                }
                catch(RuntimeException | IOException exception0) {
                    goto label_377;
                }
                catch(Throwable throwable7) {
                    goto label_371;
                }
            }
            if(v < 3) {
                fnbz.k(httpURLConnection1);
                if(fnbp0.k != -1) {
                    fnbz0.e();
                }
                try {
                    if(fncc0.b() > v10) {
                        fnbp0.i = 1;
                    }
                }
                catch(IOException iOException4) {
                    Log.w("fnbz", "Maybe reset connectionAttempts failed, see exception: ", iOException4);
                }
                fnbz0.j(fnbp0);
                return;
            }
            try {
                throw new fnby(iOException3, 5);
            label_394:
                v12 = httpURLConnection1.getResponseCode();
                if(v12 >= 200 && v12 < 300) {
                    goto label_396;
                }
                goto label_555;
            }
            catch(RuntimeException | IOException exception0) {
                goto label_416;
            }
            catch(Throwable throwable7) {
                goto label_422;
            }
        }
    label_630:
        fnbz.k(httpURLConnection3);
        if(fnbp0.k != -1) {
            fnbz0.e();
        }
        try {
            if(fncc0.b() > v5) {
                fnbp0.i = 1;
            }
        }
        catch(IOException iOException12) {
            Log.w("fnbz", "Maybe reset connectionAttempts failed, see exception: ", iOException12);
        }
        fnbz0.h(file0, s12, fnbm0, ((fnbl)httpURLConnection0), file2, v1);
    }
}

