import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.fastpair.internal.RequestPeripheralActiveParams;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class cyue extends cyua {
    private fcfe g;
    private cyus h;

    public cyue(RequestPeripheralActiveParams requestPeripheralActiveParams0, String s, int v, int v1) {
        super("RequestPeripheralActive", requestPeripheralActiveParams0, s, v, v1, 3);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s4;
        int v = cuul.a.nextInt();
        String s = cwfb.u.b(v);
        String s1 = cwfa.c(s, cxlb.o);
        cust cust0 = cwfa.a(s1, s);
        if(hvpp.aH()) {
            String s2 = this.c;
            if(!cygn.b(context0, s2) && (!azql.c(context0).g(s2) || !hvpg.a.aY().fz().b.contains(s2))) {
                cygn.c(s2);
                this.b(context0, 3);
                throw new cjuh(40500, String.format(Locale.US, "%s Only allow for allow listed 1P and oem home app", s1));
            }
            gged_interceptors gged0 = cyua.a;
            if(cygn.a(context0, this.d, this.e, gged0)) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cyxh.a).v_newBuilder();
                RequestPeripheralActiveParams requestPeripheralActiveParams0 = (RequestPeripheralActiveParams)this.b;
                String s3 = requestPeripheralActiveParams0.c;
                if(BluetoothAdapter.checkBluetoothAddress(s3)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    s3.getClass();
                    ((cyxh)hftv0).b |= 1;
                    ((cyxh)hftv0).c = s3;
                    long v1 = requestPeripheralActiveParams0.b;
                    int v2 = Long.compare(v1, 1L);
                    if(v2 != 0 && v1 != 2L) {
                        this.b(context0, 7);
                        throw new cjuh(40502, String.format(Locale.US, "%s Invalid request profile %s.", s1, v1));
                    }
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((cyxh)hftv1).b |= 2;
                    ((cyxh)hftv1).d = v2 == 0 ? 0x110B : 4360;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    cyxh cyxh0 = (cyxh)hftp0.b_message;
                    s1.getClass();
                    cyxh0.b |= 4;
                    cyxh0.e = s1;
                    try {
                        if(this.h == null) {
                            this.h = new cyus(context0, null);
                        }
                        s4 = (String)((glyq)glzd.f(this.h.a.a(), new cyvq(), gmap.a)).v(hvpg.aa(), TimeUnit.MILLISECONDS);
                    }
                    catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                        this.b(context0, 8);
                        throw new cjuh(40505, String.format(Locale.US, "%s Timeout when query phone id from data store, please try again later.", s1), null, exception0);
                    }
                    if(!gfta.c(s4)) {
                        try {
                            if(this.g == null) {
                                this.g = fcfo.d(context0);
                            }
                            byte[] arr_b = (byte[])evrg.o(this.g.i(s4, "/fastpair/request_set_active", ((cyxh)hftp0.N_build()).toBytesArray()), hvpg.aK(), TimeUnit.MILLISECONDS);
                            hftc hftc0 = hftc.a();
                            ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)cyxi.a), arr_b, 0, arr_b.length, hftc0);
                            ProtoLiteMessage.P_makeImmutable(hftv2);
                            int v3 = cygt.b(((cyxi)hftv2).c);
                            int v4 = v3 == 0 ? 1 : v3;
                            ggtj ggtj0 = cust0.d();
                            String s5 = fgjo.c(((cyxh)hftp0.b_message).c);
                            try {
                                ggtj0.Y("RequestPeripheralActive request (%s, %s), phone node id=%s, result=%s", (v1 == 2L ? "HFP" : "A2DP"), s5, s4, cygt.a(v4));
                                s4 = s4;
                            }
                            catch(ExecutionException | InterruptedException | TimeoutException exception1) {
                                s4 = s4;
                                goto label_69;
                            }
                            if(v4 == 2) {
                                this.c(context0, 2, 2);
                                ((RequestPeripheralActiveParams)this.b).a.a(new Status(0));
                                return;
                            }
                            this.c(context0, 5, v4);
                            throw new cjuh(8, String.format(Locale.US, "%s Remote response error %s.", s1, cygt.a(v4)));
                        }
                        catch(ExecutionException | InterruptedException | TimeoutException exception1) {
                        label_69:
                            this.b(context0, 9);
                            throw new cjuh(15, String.format(Locale.US, "%s WearAPI call sendRequest exceeds time limit with phoneId=%s.", s1, s4), null, exception1);
                        }
                        catch(hfur hfur0) {
                            this.b(context0, 5);
                            throw new cjuh(8, String.format(Locale.US, "%s Can\'t parse response data.", s1), null, hfur0);
                        }
                    }
                    this.b(context0, 5);
                    throw new cjuh(8, String.format(Locale.US, "%s Can\'t find phone id from data store, please make sure the phone and watch are close.", s1));
                }
                this.b(context0, 7);
                throw new cjuh(40502, String.format(Locale.US, "%s Invalid request id %s.", s1, s3));
            }
            this.b(context0, 4);
            throw new cjuh(40503, String.format(Locale.US, "%s Required permissions %s missing", s1, gged0));
        }
        this.b(context0, 6);
        throw new cjuh(40504, String.format(Locale.US, "%s Api is disabled", s1));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ((RequestPeripheralActiveParams)this.b).a.a(status0);
    }
}

