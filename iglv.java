import j..util.DesugarTimeZone;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.logging.Level;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

public final class iglv implements Closeable {
    public final String a;
    public final Map b;
    public boolean c;
    public boolean d;
    public int e;
    private final iglt f;
    private final InputStream g;
    private final long h;
    private final Map i;
    private final List j;
    private int k;

    public iglv(iglt iglt0, String s, InputStream inputStream0, long v) {
        this.i = new iglu(this);
        this.b = new HashMap();
        this.k = 1;
        this.f = iglt0;
        this.a = s;
        boolean z = false;
        if(inputStream0 == null) {
            this.g = new ByteArrayInputStream(new byte[0]);
            this.h = 0L;
            v = 0L;
        }
        else {
            this.g = inputStream0;
            this.h = v;
        }
        if(v < 0L) {
            z = true;
        }
        this.c = z;
        this.d = true;
        this.j = new ArrayList(10);
    }

    public final String a(String s) {
        return (String)this.b.get(s.toLowerCase());
    }

    public static iglv b(iglt iglt0, String s, byte[] arr_b) {
        return new iglv(iglt0, s, new ByteArrayInputStream(arr_b), ((long)arr_b.length));
    }

    public final void c(String s, String s1) {
        this.i.put(s, s1);
    }

    @Override
    public final void close() {
        InputStream inputStream0 = this.g;
        if(inputStream0 != null) {
            inputStream0.close();
        }
    }

    public final void d(OutputStream outputStream0) {
        String s2;
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss \'GMT\'", Locale.US);
        simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        try {
            iglt iglt0 = this.f;
            if(iglt0 == null) {
                throw new Error("sendResponse(): Status can\'t be null.");
            }
            String s = "";
            String s1 = this.a;
            if(s1 == null) {
                s2 = "UTF-8";
            }
            else {
                s = iglp.a(s1, iglp.a, "", 1);
                s2 = iglp.a(s1, iglp.b, null, 2);
            }
            if("multipart/form-data".equalsIgnoreCase(s)) {
                iglp.a(s1, iglp.c, null, 2);
            }
            PrintWriter printWriter0 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream0, iglp.b(s2))), false);
            printWriter0.append("HTTP/1.1 ").append(((iglw)iglt0).G + " " + ((iglw)iglt0).H).append(" \r\n");
            if(s1 != null) {
                iglv.g(printWriter0, "Content-Type", s1);
            }
            if(this.a("date") == null) {
                iglv.g(printWriter0, "Date", simpleDateFormat0.format(new Date()));
            }
            for(Object object0: this.i.entrySet()) {
                iglv.g(printWriter0, ((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            for(Object object1: this.j) {
                iglv.g(printWriter0, "Set-Cookie", ((String)object1));
            }
            if(this.a("connection") == null) {
                iglv.g(printWriter0, "Connection", (this.d ? "keep-alive" : "close"));
            }
            if(this.a("content-length") != null) {
                this.h();
            }
            if(this.e()) {
                iglv.g(printWriter0, "Content-Encoding", "gzip");
                this.c = true;
            }
            long v = this.g == null ? 0L : this.h;
            if(this.e != 5 && this.c) {
                iglv.g(printWriter0, "Transfer-Encoding", "chunked");
            }
            else if(!this.e()) {
                String s3 = this.a("content-length");
                if(s3 == null) {
                    printWriter0.print(a.D(v, "Content-Length: ", "\r\n"));
                }
                else {
                    try {
                        v = Long.parseLong(s3);
                    }
                    catch(NumberFormatException unused_ex) {
                        igln.m.logp(Level.SEVERE, "org.nanohttpd.protocols.http.response.Response", "sendContentLengthHeaderIfNotAlreadyPresent", "content-length was no number " + s3);
                    }
                }
            }
            printWriter0.append("\r\n");
            printWriter0.flush();
            if(this.e == 5 || !this.c) {
                this.j(outputStream0, v);
            }
            else {
                igls igls0 = new igls(outputStream0);
                this.j(igls0, -1L);
                try {
                    igls0.a();
                }
                catch(Exception unused_ex) {
                    InputStream inputStream0 = this.g;
                    if(inputStream0 != null) {
                        inputStream0.close();
                    }
                }
            }
            outputStream0.flush();
            igln.h(this.g);
        }
        catch(IOException iOException0) {
            igln.m.logp(Level.SEVERE, "org.nanohttpd.protocols.http.response.Response", "send", "Could not send response to the client", iOException0);
        }
    }

    public final boolean e() {
        int v = this.k;
        if(v == 1) {
            return this.a == null ? false : this.a.toLowerCase().contains("text/") || this.a.toLowerCase().contains("/json");
        }
        return v == 2;
    }

    public static iglv f(iglt iglt0, String s) {
        Pattern pattern0 = iglp.a;
        String s1 = "text/plain";
        String s2 = iglp.a("text/plain", pattern0, "", 1);
        Pattern pattern1 = iglp.b;
        String s3 = iglp.a("text/plain", pattern1, null, 2);
        if("multipart/form-data".equalsIgnoreCase(s2)) {
            iglp.a("text/plain", iglp.c, null, 2);
        }
        if(s == null) {
            return new iglv(iglt0, "text/plain", new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if(!Charset.forName(iglp.b(s3)).newEncoder().canEncode(s) && s3 == null) {
                String s4 = iglp.a("text/plain; charset=UTF-8", pattern0, "", 1);
                s3 = iglp.a("text/plain; charset=UTF-8", pattern1, null, 2);
                if("multipart/form-data".equalsIgnoreCase(s4)) {
                    iglp.a("text/plain; charset=UTF-8", iglp.c, null, 2);
                }
                s1 = "text/plain; charset=UTF-8";
            }
            byte[] arr_b = s.getBytes(iglp.b(s3));
            return new iglv(iglt0, s1, new ByteArrayInputStream(arr_b), ((long)arr_b.length));
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            igln.m.logp(Level.SEVERE, "org.nanohttpd.protocols.http.response.Response", "newFixedLengthResponse", "encoding problem, responding nothing", unsupportedEncodingException0);
            return new iglv(iglt0, s1, new ByteArrayInputStream(new byte[0]), 0L);
        }
    }

    protected static final void g(PrintWriter printWriter0, String s, String s1) {
        printWriter0.append(s).append(": ").append(s1).append("\r\n");
    }

    public final void h() {
        this.k = 3;
    }

    private final void i(OutputStream outputStream0, long v) {
        byte[] arr_b = new byte[0x4000];
        long v1 = v;
        while(true) {
            int v2 = 1;
            int v3 = Long.compare(v, -1L) == 0 ? 1 : 0;
            if(v1 > 0L) {
                v2 = v3;
            }
            else if(v3 == 0) {
                break;
            }
            int v4 = this.g.read(arr_b, 0, ((int)(v2 == 0 ? Math.min(v1, 0x4000L) : 0x4000L)));
            if(v4 <= 0) {
                break;
            }
            try {
                outputStream0.write(arr_b, 0, v4);
            }
            catch(Exception unused_ex) {
                InputStream inputStream0 = this.g;
                if(inputStream0 != null) {
                    inputStream0.close();
                }
            }
            if(v2 == 0) {
                v1 -= (long)v4;
            }
        }
    }

    private final void j(OutputStream outputStream0, long v) {
        GZIPOutputStream gZIPOutputStream0;
        if(this.e()) {
            try {
                gZIPOutputStream0 = new GZIPOutputStream(outputStream0);
            }
            catch(Exception unused_ex) {
                InputStream inputStream0 = this.g;
                gZIPOutputStream0 = null;
                if(inputStream0 != null) {
                    inputStream0.close();
                }
            }
            if(gZIPOutputStream0 != null) {
                this.i(gZIPOutputStream0, -1L);
                gZIPOutputStream0.finish();
            }
            return;
        }
        this.i(outputStream0, v);
    }
}

