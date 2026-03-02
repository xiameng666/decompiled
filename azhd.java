import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public final class azhd {
    static final ayuj a;
    public static final int b;

    static {
        azhd.a = ayuj.a(0x5A79DBF, hlqj.g);
    }

    public static azfx a(Context context0, String s, MessageLite hfvm0, ayvn ayvn0, boolean z, String s1) {
        ayud ayud0;
        if(ayvn0.equals(ayvn.b)) {
            ayud0 = ayud.k(context0, s);
        }
        else {
            ayud0 = ayvn0.equals(ayvn.c) ? ayud.l(context0, s) : new aytt(context0, s).a();
        }
        ayuc ayuc0 = ayud0.i(hfvm0);
        if(hraq.c()) {
            ayuc0.g(azhd.a);
            try {
                ayuc0.e().get();
            }
            catch(ExecutionException | InterruptedException exception0) {
                Log.e("CCTLogRequestBuilder", "Failed to get ComplianceSocsData: ", exception0);
            }
        }
        LogEventParcelable logEventParcelable0 = ayuc0.c();
        ModuleManager moduleManager0 = ModuleManager.get(context0);
        azem azem0 = new azem(context0);
        azer azer0 = new azer(azer.a, logEventParcelable0, null, moduleManager0, "com.google.android.gms", azem0, null);
        eiox eiox0 = eiov.b(context0);
        ProtoLiteBuilder hftp0 = azif.c(logEventParcelable0.a);
        if(!z) {
            azer.g(context0, hftp0);
        }
        else if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlsi hlsi0 = (hlsi)hftp0.b_message;
            hlsi0.b |= 0x80;
            hlsi0.h = s1;
        }
        azer0.c(context0, hftp0);
        azer.e(hftp0, eiox0);
        azer.d(context0, hftp0);
        hlsi hlsi1 = (hlsi)hftp0.N_build();
        gftb.check(logEventParcelable0.b);
        String s2 = azif.a(logEventParcelable0.a);
        ByteString hfsf0 = azer0.b(context0, logEventParcelable0.b, new int[0], logEventParcelable0.d, logEventParcelable0.e, logEventParcelable0.f, logEventParcelable0.g, logEventParcelable0.h, logEventParcelable0.a(), s2, logEventParcelable0.a.g, null, -1.0, eiox0, null);
        byte[] arr_b = new byte[CodedOutputStream.Y(hfsf0.size())];
        CodedOutputStream.ad(arr_b).writeRawVarint32(hfsf0.size());
        return new azfx(hlsi1, Arrays.asList(new azfw[]{new azfw(null, ByteString.copyFrom(arr_b).t(hfsf0), 1, 0)}));
    }

    public static final hlps b(hftr hftr0) {
        return (hlps)((ProtoLiteBuilder)hftr0).N_build();
    }

    public static final void c(gged_interceptors gged0, hftr hftr0) {
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            hftr0.ds(((azfw)gged0.get(v1)).b);
        }
    }

    public static final void d(Context context0, boolean z, hftr hftr0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlpn.a).v_newBuilder();
        boolean z1 = azib.d(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hlpn)hftv0).b |= 2;
        ((hlpn)hftv0).d = z1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlpn hlpn0 = (hlpn)hftp0.b_message;
        hlpn0.b |= 8;
        hlpn0.f = z;
        boolean z2 = azib.e(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlpn hlpn1 = (hlpn)hftp0.b_message;
        hlpn1.b |= 1;
        hlpn1.c = z2;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hlps hlps0 = (hlps)hftr0.b_message;
        hlpn hlpn2 = (hlpn)hftp0.N_build();
        hlpn2.getClass();
        hlps0.m = hlpn2;
        hlps0.b |= 0x200;
    }

    public static final void e(int v, hftr hftr0) {
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((hlps)hftr0.b_message).l = v - 1;
        ((hlps)hftr0.b_message).b |= 0x100;
    }
}

