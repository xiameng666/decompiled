import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

public final class goxd extends AsyncTask {
    private static final baun a;
    private final String b;
    private final String c;
    private final WeakReference d;
    private final Uri.Builder e;
    private final String f;

    static {
        goxd.a = new baun("FirebaseAuth", new String[]{"GetAuthDomainTask"});
    }

    public goxd(String s, String s1, Intent intent0, goxf goxf0) {
        batl.q(s);
        this.b = s;
        batl.q(s1);
        batl.s(intent0);
        String s2 = intent0.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        batl.q(s2);
        Uri.Builder uri$Builder0 = Uri.parse(goxf0.b()).buildUpon();
        Uri.Builder uri$Builder1 = uri$Builder0.appendPath("getProjectConfig").appendQueryParameter("alt", "proto").appendQueryParameter("key", s2).appendQueryParameter("androidPackageName", s);
        batl.s(s1);
        uri$Builder1.appendQueryParameter("sha1Cert", s1);
        this.c = uri$Builder0.build().toString();
        this.d = new WeakReference(goxf0);
        this.e = goxf0.a(intent0, s, s1);
        this.f = intent0.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    private final void a(goxc goxc0) {
        String s1;
        String s;
        goxf goxf0 = (goxf)this.d.get();
        if(goxc0 == null) {
            s = null;
            s1 = null;
        }
        else {
            s = goxc0.a;
            s1 = goxc0.b;
        }
        if(goxf0 == null) {
            goxd.a.f("An error has occurred: the handler reference has returned null.", new Object[0]);
            return;
        }
        if(!TextUtils.isEmpty(s)) {
            Uri.Builder uri$Builder0 = this.e;
            if(uri$Builder0 != null) {
                uri$Builder0.authority(s);
                goxf0.g(uri$Builder0.build(), this.b);
                return;
            }
        }
        Status status0 = gozl.a(s1);
        goxf0.f(this.b, status0);
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        byte[] arr_b1;
        String s2;
        Void[] arr_void = (Void[])arr_object;
        String s = this.f;
        if(!TextUtils.isEmpty(s)) {
            return goxc.a(s);
        }
        try {
            URL uRL0 = new URL(this.c);
            HttpURLConnection httpURLConnection0 = ((goxf)this.d.get()).c(uRL0);
            httpURLConnection0.addRequestProperty("Content-Type", "application/x-protobuf");
            int v = httpURLConnection0.getResponseCode();
            if(v == 200) {
                InputStream inputStream0 = httpURLConnection0.getInputStream();
                hftc hftc0 = hftc.a();
                hfsl hfsl0 = hfsl.N(inputStream0);
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gdht.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                    hfwc0.g(hftv0);
                }
                catch(hfur hfur0) {
                    if(hfur0.b) {
                        hfur0 = new hfur(hfur0);
                    }
                    hfur0.a = hftv0;
                    throw hfur0;
                }
                catch(hfwr hfwr0) {
                    hfur hfur1 = hfwr0.a();
                    hfur1.a = hftv0;
                    throw hfur1;
                }
                catch(IOException iOException1) {
                    if((iOException1.getCause() instanceof hfur)) {
                        throw (hfur)iOException1.getCause();
                    }
                    hfur hfur2 = new hfur(iOException1);
                    hfur2.a = hftv0;
                    throw hfur2;
                }
                catch(RuntimeException runtimeException0) {
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                }
                ProtoLiteMessage.P_makeImmutable(hftv0);
                for(Object object0: ((gdht)hftv0).b) {
                    String s1 = (String)object0;
                    if(s1.endsWith("firebaseapp.com") || s1.endsWith("web.app")) {
                        return goxc.a(s1);
                    }
                }
                return null;
            }
            try {
                if(httpURLConnection0.getResponseCode() >= 400) {
                    InputStream inputStream1 = httpURLConnection0.getErrorStream();
                    if(inputStream1 == null) {
                        s2 = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
                    }
                    else {
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        try {
                            byte[] arr_b = new byte[0x80];
                            int v2;
                            while((v2 = inputStream1.read(arr_b)) != -1) {
                                byteArrayOutputStream0.write(arr_b, 0, v2);
                            }
                            arr_b1 = byteArrayOutputStream0.toByteArray();
                        }
                        finally {
                            byteArrayOutputStream0.close();
                        }
                        s2 = new String(arr_b1);
                    }
                }
                else {
                    goto label_65;
                }
                goto label_66;
            }
            catch(IOException iOException2) {
                goxd.a.m("Error parsing error message from response body in getErrorMessageFromBody. " + iOException2.toString(), new Object[0]);
            }
        label_65:
            s2 = null;
        label_66:
            goxd.a.f(String.format("Error getting project config. Failed with %s %s", s2, v), new Object[0]);
            goxc goxc0 = new goxc();
            goxc0.b = s2;
            return goxc0;
        }
        catch(IOException iOException0) {
            goxd.a.f("IOException occurred: " + iOException0.toString(), new Object[0]);
            return null;
        }
        catch(NullPointerException nullPointerException0) {
            goxd.a.f("Null pointer encountered: " + nullPointerException0.toString(), new Object[0]);
            return null;
        }
    }

    @Override  // android.os.AsyncTask
    protected final void onCancelled(Object object0) {
        goxc goxc0 = (goxc)object0;
        this.a(null);
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        this.a(((goxc)object0));
    }
}

