import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLException;

public final class iglk {
    public final BufferedInputStream a;
    public String b;
    public Map c;
    public String d;
    public final String e;
    public int f;
    private final igln g;
    private final OutputStream h;
    private int i;
    private int j;
    private Map k;
    private iglr l;
    private String m;
    private final iglz n;

    public iglk(igln igln0, iglz iglz0, InputStream inputStream0, OutputStream outputStream0, InetAddress inetAddress0) {
        this.g = igln0;
        this.n = iglz0;
        this.a = new BufferedInputStream(inputStream0, 0x2000);
        this.h = outputStream0;
        this.e = inetAddress0.isLoopbackAddress() || inetAddress0.isAnyLocalAddress() ? "127.0.0.1" : inetAddress0.getHostAddress().toString();
        this.c = new HashMap();
    }

    public final void a() {
        Object object2;
        Object object1;
        boolean z;
        int v8;
        String s6;
        String s5;
        StringTokenizer stringTokenizer3;
        String s2;
        StringTokenizer stringTokenizer1;
        BufferedReader bufferedReader1;
        int v5;
        String s1;
        Map map2;
        Map map1;
        HashMap hashMap0;
        BufferedReader bufferedReader0;
        int v;
        byte[] arr_b;
        try {
            try {
                arr_b = new byte[0x2000];
                this.i = 0;
                this.j = 0;
                this.a.mark(0x2000);
            }
            catch(SocketException socketException0) {
                object2 = null;
                throw socketException0;
            }
            catch(SocketTimeoutException socketTimeoutException0) {
                object2 = null;
                throw socketTimeoutException0;
            }
            catch(SSLException sSLException0) {
                goto label_211;
            }
            catch(IOException iOException0) {
                goto label_216;
            }
            try {
                v = this.a.read(arr_b, 0, 0x2000);
                goto label_11;
            }
            catch(SSLException sSLException1) {
            }
            catch(IOException unused_ex) {
                goto label_8;
            }
            try {
                throw sSLException1;
            label_8:
                igln.h(this.a);
                igln.h(this.h);
                throw new SocketException("NanoHttpd Shutdown");
            }
            catch(SocketException socketException0) {
                object2 = null;
                throw socketException0;
            }
            catch(SocketTimeoutException socketTimeoutException0) {
                object2 = null;
                throw socketTimeoutException0;
            }
            catch(SSLException sSLException0) {
                goto label_211;
            }
            catch(IOException iOException0) {
                goto label_216;
            }
        label_11:
            if(v == -1) {
                goto label_201;
            }
            try {
                while(v > 0) {
                    int v1 = 0;
                    int v2 = this.j + v;
                    this.j = v2;
                    int v3 = 0;
                    while(v3 + 1 < v2) {
                        int v4 = arr_b[v3];
                        if(v4 == 13) {
                            if(arr_b[v3 + 1] == 10 && v3 + 3 < v2 && arr_b[v3 + 2] == 13 && arr_b[v3 + 3] == 10) {
                                v1 = v3 + 4;
                                break;
                            }
                            else {
                                ++v3;
                                continue;
                            }
                        }
                        if(v4 == 10 && arr_b[v3 + 1] == 10) {
                            v1 = v3 + 2;
                            break;
                        }
                        ++v3;
                    }
                    this.i = v1;
                    if(v1 > 0) {
                        break;
                    }
                    v = this.a.read(arr_b, this.j, 0x2000 - this.j);
                }
                if(this.i < this.j) {
                    this.a.reset();
                    this.a.skip(((long)this.i));
                }
                this.k = new HashMap();
                Map map0 = this.c;
                if(map0 == null) {
                    this.c = new HashMap();
                }
                else {
                    map0.clear();
                }
                bufferedReader0 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(arr_b, 0, this.j)));
                hashMap0 = new HashMap();
                map1 = this.k;
                map2 = this.c;
            }
            catch(SocketException socketException0) {
                object2 = null;
                throw socketException0;
            }
            catch(SocketTimeoutException socketTimeoutException0) {
                object2 = null;
                throw socketTimeoutException0;
            }
            catch(SSLException sSLException0) {
                goto label_211;
            }
            catch(IOException iOException0) {
                goto label_216;
            }
            try {
                String s = bufferedReader0.readLine();
                if(s != null) {
                    StringTokenizer stringTokenizer0 = new StringTokenizer(s);
                    if(!stringTokenizer0.hasMoreTokens()) {
                        throw new iglm(iglw.m, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                    }
                    hashMap0.put("method", stringTokenizer0.nextToken());
                    if(!stringTokenizer0.hasMoreTokens()) {
                        throw new iglm(iglw.m, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                    }
                    s1 = stringTokenizer0.nextToken();
                    v5 = s1.indexOf(0x3F);
                    if(v5 < 0) {
                        bufferedReader1 = bufferedReader0;
                        stringTokenizer1 = stringTokenizer0;
                        s2 = igln.g(s1);
                    }
                    else {
                        String s3 = s1.substring(v5 + 1);
                        if(s3 == null) {
                            this.d = "";
                            bufferedReader1 = bufferedReader0;
                            stringTokenizer1 = stringTokenizer0;
                        }
                        else {
                            this.d = s3;
                            bufferedReader1 = bufferedReader0;
                            stringTokenizer1 = stringTokenizer0;
                            StringTokenizer stringTokenizer2 = new StringTokenizer(s3, "&");
                            while(true) {
                                if(!stringTokenizer2.hasMoreTokens()) {
                                    goto label_87;
                                }
                                String s4 = stringTokenizer2.nextToken();
                                int v6 = s4.indexOf(61);
                                if(v6 >= 0) {
                                    stringTokenizer3 = stringTokenizer2;
                                    s5 = igln.g(s4.substring(0, v6)).trim();
                                    s6 = igln.g(s4.substring(v6 + 1));
                                }
                                else {
                                    stringTokenizer3 = stringTokenizer2;
                                    s5 = igln.g(s4).trim();
                                    s6 = "";
                                }
                                List list0 = (List)map1.get(s5);
                                if(list0 == null) {
                                    list0 = new ArrayList();
                                    map1.put(s5, list0);
                                }
                                list0.add(s6);
                                stringTokenizer2 = stringTokenizer3;
                            }
                        }
                        goto label_88;
                    }
                    goto label_89;
                }
                goto label_104;
            }
            catch(IOException iOException1) {
                throw new iglm(iglw.C, "SERVER INTERNAL ERROR: IOException: " + iOException1.getMessage(), iOException1);
            }
        label_87:
            try {
            label_88:
                s2 = igln.g(s1.substring(0, v5));
            label_89:
                if(stringTokenizer1.hasMoreTokens()) {
                    this.m = stringTokenizer1.nextToken();
                }
                else {
                    this.m = "HTTP/1.1";
                    igln.m.logp(Level.FINE, "org.nanohttpd.protocols.http.HTTPSession", "decodeHeader", "no protocol version specified, strange. Assuming HTTP/1.1.");
                }
                while(true) {
                    String s7 = bufferedReader1.readLine();
                    if(s7 == null || s7.trim().isEmpty()) {
                        break;
                    }
                    int v7 = s7.indexOf(58);
                    if(v7 >= 0) {
                        map2.put(s7.substring(0, v7).trim().toLowerCase(Locale.US), s7.substring(v7 + 1).trim());
                    }
                }
                hashMap0.put("uri", s2);
                goto label_104;
            }
            catch(IOException iOException1) {
                try {
                    throw new iglm(iglw.C, "SERVER INTERNAL ERROR: IOException: " + iOException1.getMessage(), iOException1);
                label_104:
                    String s8 = this.e;
                    if(s8 != null) {
                        this.c.put("remote-addr", s8);
                        this.c.put("http-client-ip", s8);
                    }
                    v8 = 0;
                    String s9 = (String)hashMap0.get("method");
                    if(s9 != null) {
                        goto label_111;
                    }
                    goto label_148;
                }
                catch(SocketException socketException0) {
                    object2 = null;
                    throw socketException0;
                }
                catch(SocketTimeoutException socketTimeoutException0) {
                    object2 = null;
                    throw socketTimeoutException0;
                }
                catch(SSLException sSLException0) {
                    goto label_211;
                }
                catch(IOException iOException0) {
                    goto label_216;
                }
            }
        }
        catch(iglm iglm0) {
            goto label_221;
        }
        catch(Throwable throwable0) {
            object2 = null;
            igln.h(object2);
            this.n.a();
            throw throwable0;
        }
    label_111:
        switch(s9) {
            case "CONNECT": {
                v8 = 8;
                break;
            }
            case "COPY": {
                v8 = 14;
                break;
            }
            case "DELETE": {
                v8 = 4;
                break;
            }
            case "GET": {
                v8 = 1;
                break;
            }
            case "HEAD": {
                v8 = 5;
                break;
            }
            case "LOCK": {
                v8 = 15;
                break;
            }
            case "MKCOL": {
                v8 = 12;
                break;
            }
            case "MOVE": {
                v8 = 13;
                break;
            }
            case "NOTIFY": {
                v8 = 17;
                break;
            }
            case "OPTIONS": {
                v8 = 6;
                break;
            }
            case "PATCH": {
                v8 = 9;
                break;
            }
            case "POST": {
                v8 = 3;
                break;
            }
            case "PROPFIND": {
                v8 = 10;
                break;
            }
            case "PROPPATCH": {
                goto label_147;
            }
            case "PUT": {
                v8 = 2;
                break;
            }
            case "SUBSCRIBE": {
                v8 = 18;
                break;
            }
            case "TRACE": {
                v8 = 7;
                break;
            }
            case "UNLOCK": {
                v8 = 16;
                break;
            }
            default: {
                try {
                    throw new IllegalArgumentException();
                label_147:
                    v8 = 11;
                }
                catch(IllegalArgumentException unused_ex) {
                }
                catch(SocketException socketException0) {
                    object2 = null;
                    throw socketException0;
                }
                catch(SocketTimeoutException socketTimeoutException0) {
                    object2 = null;
                    throw socketTimeoutException0;
                }
                catch(SSLException sSLException0) {
                    goto label_211;
                }
                catch(IOException iOException0) {
                    goto label_216;
                }
                catch(iglm iglm0) {
                    goto label_221;
                }
                catch(Throwable throwable0) {
                    object2 = null;
                    igln.h(object2);
                    this.n.a();
                    throw throwable0;
                }
            }
        }
        try {
        label_148:
            this.f = v8;
            if(v8 == 0) {
                String s10 = (String)hashMap0.get("method");
                throw new iglm(iglw.m, "BAD REQUEST: Syntax error. HTTP verb " + s10 + " unhandled.");
            }
            this.b = (String)hashMap0.get("uri");
            this.l = new iglr(this.c);
            String s11 = (String)this.c.get("connection");
            z = "HTTP/1.1".equals(this.m) && (s11 == null || !s11.matches("(?i).*close.*"));
            igln igln0 = this.g;
            for(Object object0: igln0.r) {
                object1 = ((igll)object0).a(this);
                if(object1 == null) {
                    continue;
                }
                goto label_164;
            }
            object1 = igln0.s.a(this);
        }
        catch(SocketException socketException0) {
            object2 = null;
            throw socketException0;
        }
        catch(SocketTimeoutException socketTimeoutException0) {
            object2 = null;
            throw socketTimeoutException0;
        }
        catch(SSLException sSLException0) {
            goto label_211;
        }
        catch(IOException iOException0) {
            goto label_216;
        }
        catch(iglm iglm0) {
            goto label_221;
        }
        catch(Throwable throwable0) {
            object2 = null;
            igln.h(object2);
            this.n.a();
            throw throwable0;
        }
        try {
        label_164:
            if(object1 == null) {
                throw new iglm(iglw.C, "SERVER INTERNAL ERROR: Serve() returned a null response.");
            }
            String s12 = (String)this.c.get("accept-encoding");
            ArrayList arrayList0 = this.l.a;
            if(arrayList0.size() > 0) {
                iglq iglq0 = (iglq)arrayList0.get(0);
                throw null;
            }
            object1.e = this.f;
            if(s12 == null || !s12.contains("gzip")) {
                ((iglv)object1).h();
            }
            object1.d = z;
            ((iglv)object1).d(this.h);
            if(!z || "close".equals(((iglv)object1).a("connection"))) {
                throw new SocketException("NanoHttpd Shutdown");
            }
            goto label_228;
        }
        catch(SocketException socketException0) {
            object2 = object1;
            throw socketException0;
        }
        catch(SocketTimeoutException socketTimeoutException0) {
        }
        catch(SSLException sSLException0) {
            object2 = object1;
            goto label_212;
        }
        catch(IOException iOException0) {
            object2 = object1;
            goto label_217;
        }
        catch(iglm iglm0) {
            object2 = object1;
            goto label_222;
        }
        catch(Throwable throwable0) {
            object2 = object1;
            igln.h(object2);
            this.n.a();
            throw throwable0;
        }
        object2 = object1;
        throw socketTimeoutException0;
        try {
        label_201:
            igln.h(this.a);
            igln.h(this.h);
            throw new SocketException("NanoHttpd Shutdown");
        }
        catch(SocketException socketException0) {
        }
        catch(SocketTimeoutException socketTimeoutException0) {
            object2 = null;
            throw socketTimeoutException0;
        }
        catch(SSLException sSLException0) {
            goto label_211;
        }
        catch(IOException iOException0) {
            goto label_216;
        }
        catch(iglm iglm0) {
            goto label_221;
        }
        catch(Throwable throwable0) {
            object2 = null;
            igln.h(object2);
            this.n.a();
            throw throwable0;
        }
        try {
            object2 = null;
            throw socketException0;
        label_211:
            object2 = null;
        label_212:
            iglv.f(iglw.C, "SSL PROTOCOL FAILURE: " + sSLException0.getMessage()).d(this.h);
            igln.h(this.h);
            object1 = object2;
            igln.h(object1);
            this.n.a();
            return;
        label_216:
            object2 = null;
        label_217:
            iglv.f(iglw.C, a.ac(iOException0, "SERVER INTERNAL ERROR: IOException: ")).d(this.h);
            igln.h(this.h);
            object1 = object2;
            igln.h(object1);
            this.n.a();
            return;
        label_221:
            object2 = null;
        label_222:
            iglv.f(iglm0.a, iglm0.getMessage()).d(this.h);
            igln.h(this.h);
            object1 = object2;
        }
        catch(Throwable throwable0) {
            igln.h(object2);
            this.n.a();
            throw throwable0;
        }
    label_228:
        igln.h(object1);
        this.n.a();
    }
}

