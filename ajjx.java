import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

public final class ajjx extends cjtm {
    private final ajhm a;
    private final byte[] b;
    private static final baun c;

    static {
        ajjx.c = new baun(new String[]{"IncrementAndGetCounterOperation"}, null);
    }

    public ajjx(ajhm ajhm0, byte[] arr_b, azug azug0) {
        super(0x81, "IncrementAndGetCounterOperation", azug0);
        this.a = ajhm0;
        this.b = arr_b;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        long v;
        ProtoLiteMessage hftv1;
        hfsl hfsl0;
        ajiz ajiz0;
        ajjx.c.h("IncrementAndGetCounter operation is called", new Object[0]);
        ajip ajip0 = new ajip(context0);
        ajip0.a = 11;
        ajiy ajiy0 = ajix.a(context0, ajip0);
        try {
            ajiz0 = ajiy0.a.g(this.b);
            goto label_9;
        }
        catch(ajiv ajiv0) {
            try {
                ajiy0.c.b = 11;
                throw ajiv0;
            label_9:
                gquw gquw0 = gquw.d;
                byte[] arr_b = ajiy0.b.g(ajiz0.f, gquw0);
                if(arr_b == null) {
                    ajiy0.d.m("No Fido feature metadata found. Initializing...", new Object[0]);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqux.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqux gqux0 = (gqux)hftp0.b_message;
                    gqux0.b = gquw0.a();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqvc.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gqvc)hftp1.b_message).b = 0L;
                    ByteString hfsf0 = ((gqvc)hftp1.N_build()).getDefaultInstanceForType();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gqux)hftp0.b_message).c = hfsf0;
                    arr_b = ((gqux)hftp0.N_build()).toBytesArray();
                }
                try {
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqux.a), arr_b, 0, arr_b.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    hfsl0 = ((gqux)hftv0).c.k();
                    hftv1 = ((ProtoLiteMessage)gqvc.a).x_newMutableInstance();
                }
                catch(hfur unused_ex) {
                    ajiy0.c.b = 12;
                    throw new ajiv("Error parsing feature metadata.");
                }
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv1);
                    hfwc0.l(hftv1, hfsm.p(hfsl0), hftc.a);
                    hfwc0.g(hftv1);
                    goto label_54;
                }
                catch(hfur hfur0) {
                }
                catch(hfwr hfwr0) {
                    goto label_41;
                }
                catch(IOException iOException0) {
                    goto label_45;
                }
                catch(RuntimeException runtimeException0) {
                    goto label_51;
                }
                try {
                    if(hfur0.b) {
                        hfur0 = new hfur(hfur0);
                    }
                    hfur0.a = hftv1;
                    throw hfur0;
                label_41:
                    hfur hfur1 = hfwr0.a();
                    hfur1.a = hftv1;
                    throw hfur1;
                label_45:
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur2 = new hfur(iOException0);
                    hfur2.a = hftv1;
                    throw hfur2;
                label_51:
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                }
                catch(hfur unused_ex) {
                    ajiy0.c.b = 12;
                    throw new ajiv("Error parsing feature metadata.");
                }
                try {
                label_54:
                    hfsl0.z(0);
                    goto label_59;
                }
                catch(hfur hfur3) {
                    try {
                        hfur3.a = hftv1;
                        throw hfur3;
                    label_59:
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        v = ((gqvc)hftv1).b + 1L;
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqux.a).v_newBuilder();
                        gquw gquw1 = gquw.d;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gqux gqux1 = (gqux)hftp2.b_message;
                        gqux1.b = gquw1.a();
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqvc.a).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((gqvc)hftp3.b_message).b = v;
                        ByteString hfsf1 = ((gqvc)hftp3.N_build()).getDefaultInstanceForType();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gqux)hftp2.b_message).c = hfsf1;
                        byte[] arr_b1 = ((gqux)hftp2.N_build()).toBytesArray();
                        ajiy0.b.f(ajiz0.f, gquw1, arr_b1);
                        goto label_81;
                    }
                    catch(hfur unused_ex) {
                    }
                }
                ajiy0.c.b = 12;
                throw new ajiv("Error parsing feature metadata.");
            label_81:
                ajip0.b = 1;
                ajip0.a();
                ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
                this.a.b(v, apiMetadata0);
                return;
            }
            catch(ajiv unused_ex) {
            }
        }
        ajip0.a();
        this.j(new Status(25508));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

