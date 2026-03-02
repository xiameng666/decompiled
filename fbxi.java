import android.content.Context;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

public final class fbxi extends wby implements fbxj {
    private Context a;
    private bbeo b;

    public fbxi() {
        super("com.google.android.gms.wallet.service.reauth.IReauthService");
    }

    public fbxi(Context context0) {
        super("com.google.android.gms.wallet.service.reauth.IReauthService");
        this.a = context0;
    }

    @Override  // fbxj
    public final ReauthProofTokenResponse a(ReauthProofTokenRequest reauthProofTokenRequest0) {
        ReauthProofTokenResponse reauthProofTokenResponse0;
        Object object0;
        RequestFuture requestFuture0;
        long v = SystemClock.elapsedRealtime();
        baqr baqr0 = new baqr();
        baqr0.a = Process.myUid();
        baqr0.c = reauthProofTokenRequest0.a;
        baqr0.b = reauthProofTokenRequest0.a;
        baqr0.d = "com.google.android.gms";
        baqr0.e = "com.google.android.gms";
        hzra hzra0 = hzra.a;
        baqr0.l(hzra0.b().d());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqnt.a).v_newBuilder();
        int v1 = reauthProofTokenRequest0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if(v1 == 0) {
            throw null;
        }
        ((gqnt)hftv0).c = v1 - 1;
        ((gqnt)hftv0).b |= 1;
        String s = reauthProofTokenRequest0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqnt gqnt0 = (gqnt)hftp0.b_message;
        s.getClass();
        gqnt0.b |= 4;
        gqnt0.d = s;
        gqnt gqnt1 = (gqnt)hftp0.N_build();
        long v2 = hzra0.b().b();
        if(Long.compare(reauthProofTokenRequest0.c, v2) < 0) {
            try {
                bbeo bbeo0 = this.b;
                if(bbeo0 == null) {
                    Context context0 = this.a;
                    String s1 = hzra0.b().h();
                    String s2 = hzra0.b().c();
                    boolean z = hzra0.b().i();
                    hzra0.b().j();
                    bbeo0 = new bbeo(context0, s1, s2, z, hzra0.b().f(), hzra0.b().e(), 0x1B00);
                    this.b = bbeo0;
                }
                String s3 = hzra0.b().g();
                byte[] arr_b = gqnt1.toBytesArray();
                gqod gqod0 = gqod.a;
                long v3 = hzra0.b().a();
                int v4 = bbeo0.d;
                String s4 = s3;
                try {
                    String s5 = ((AbstractServer)bbeo0).getAuthToken(baqr0);
                    try {
                        requestFuture0 = bbeo0.f(s5, baqr0, 1, s4, arr_b, gqod0, v4);
                        bbeo0 = bbeo0;
                        s4 = s4;
                    }
                    catch(InterruptedException unused_ex) {
                        bbeo0 = bbeo0;
                        s4 = s4;
                        throw new VolleyError("Thread interrupted");
                    }
                    catch(ExecutionException executionException0) {
                        bbeo0 = bbeo0;
                        s4 = s4;
                        bbeo0.d(executionException0, s5);
                        throw new VolleyError("Error executing network request", executionException0);
                    }
                    catch(VolleyError volleyError1) {
                        bbeo0 = bbeo0;
                        s4 = s4;
                        goto label_65;
                    }
                    try {
                        object0 = requestFuture0.get(v3, TimeUnit.MILLISECONDS);
                        return new ReauthProofTokenResponse(((gqod)object0).b, 0, fbxi.c(v));
                    }
                    catch(InterruptedException unused_ex) {
                        throw new VolleyError("Thread interrupted");
                    }
                    catch(ExecutionException executionException0) {
                    }
                    bbeo0.d(executionException0, s5);
                    throw new VolleyError("Error executing network request", executionException0);
                }
                catch(VolleyError volleyError1) {
                }
            label_65:
                if(bbeo.e(volleyError1)) {
                    object0 = bbeo0.i(baqr0, 1, s4, arr_b, gqod0, v4);
                }
                else {
                    throw volleyError1;
                }
                return new ReauthProofTokenResponse(((gqod)object0).b, 0, fbxi.c(v));
            }
            catch(acse unused_ex) {
                reauthProofTokenResponse0 = new ReauthProofTokenResponse("", 3, fbxi.c(v));
                Log.e("ReauthService", "Error occurred while getting reauth token");
                return reauthProofTokenResponse0;
            }
            catch(VolleyError volleyError0) {
                NetworkResponse networkResponse0 = volleyError0.networkResponse;
                if(networkResponse0 != null) {
                    try {
                        byte[] arr_b1 = networkResponse0.data;
                        GZIPInputStream gZIPInputStream0 = bbpb.c(arr_b1) ? new GZIPInputStream(new ByteArrayInputStream(arr_b1)) : new ByteArrayInputStream(arr_b1);
                        ReauthProofTokenResponse reauthProofTokenResponse1 = null;
                        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(gZIPInputStream0));
                        do {
                            String s6 = bufferedReader0.readLine();
                            if(s6 == null) {
                                return reauthProofTokenResponse1 == null ? new ReauthProofTokenResponse("", 3, fbxi.c(v)) : reauthProofTokenResponse1;
                            }
                            String s7 = s6.toUpperCase();
                            if(s7.contains("FORBIDDEN")) {
                                reauthProofTokenResponse1 = new ReauthProofTokenResponse("", 2, fbxi.c(v));
                                return reauthProofTokenResponse1 == null ? new ReauthProofTokenResponse("", 3, fbxi.c(v)) : reauthProofTokenResponse1;
                            }
                        }
                        while(!s7.contains("INVALID_GRANT"));
                        reauthProofTokenResponse1 = new ReauthProofTokenResponse("", 1, fbxi.c(v));
                        return reauthProofTokenResponse1 == null ? new ReauthProofTokenResponse("", 3, fbxi.c(v)) : reauthProofTokenResponse1;
                    }
                    catch(IOException unused_ex) {
                        return new ReauthProofTokenResponse("", 3, fbxi.c(v));
                    }
                }
                return new ReauthProofTokenResponse("", 3, fbxi.c(v));
            }
            catch(TimeoutException timeoutException0) {
                reauthProofTokenResponse0 = new ReauthProofTokenResponse("", 3, fbxi.c(v));
                Log.e("ReauthService", "Timed out calling reauth service", timeoutException0);
                return reauthProofTokenResponse0;
            }
        }
        return new ReauthProofTokenResponse("", 2, fbxi.c(v));
    }

    private static long c(long v) {
        return SystemClock.elapsedRealtime() - v;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            ReauthProofTokenRequest reauthProofTokenRequest0 = (ReauthProofTokenRequest)wbz.a(parcel0, ReauthProofTokenRequest.CREATOR);
            fbxi.gr(parcel0);
            ReauthProofTokenResponse reauthProofTokenResponse0 = this.a(reauthProofTokenRequest0);
            parcel1.writeNoException();
            wbz.g(parcel1, reauthProofTokenResponse0);
            return true;
        }
        return false;
    }
}

