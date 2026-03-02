import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aree {
    public static final aqql a;
    protected final gful_cronetEngineProvider b;
    public final Context c;
    public final arqt d;

    static {
        aree.a = (aqql)aqql.a("D2dIndexingProcessor");
    }

    public aree(Context context0, arqt arqt0) {
        this.b = gfus.a(((gful_cronetEngineProvider)new ared()));
        this.c = context0;
        this.d = arqt0;
    }

    public final boolean a(asbl asbl0, asbk asbk0, arqo arqo0) {
        if(!asbl0.c) {
            aree.a.h("Target device does not support hybrid restore", new Object[0]);
            return false;
        }
        if(!((Boolean)this.b.mr()).booleanValue()) {
            aree.a.h("Hybrid restore feature is not enabled", new Object[0]);
            return false;
        }
        if(!(arqo0 instanceof arqx)) {
            aree.a.h("Type handler is not a MediaFlavorHandler", new Object[0]);
            return false;
        }
        if(aqhj.a(asbk0) != aqfx.c) {
            aree.a.h("Media flavor type is not PHOTOS", new Object[0]);
            return false;
        }
        aree.a.h("Should use hybrid restore for photos", new Object[0]);
        return true;
    }

    public static boolean b(arjs arjs0, arbk arbk0) {
        try {
            if(arbk0.b) {
                aree.a.j("Target device was already aware that the Android Messages Custom D2D API is supported.", new Object[0]);
                return true;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arbh.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            arbh arbh0 = (arbh)hftp0.b_message;
            arbk0.getClass();
            arbh0.c = arbk0;
            arbh0.b = 1;
            arbh arbh1 = (arbh)hftp0.N_build();
            hfrh hfrh0 = (hfrh)((glyq)hfrh.a(arjs0.a(), new arjq(), arbh1)).v(hqhq.g(), TimeUnit.SECONDS);
            iapk iapk0 = hfrh0.a;
            if(!iapk0.equals(iapk.b)) {
                arjs.a.m("Messages Custom D2D API handshake failed with status: " + iapk0, new Object[0]);
            }
            arbi arbi0 = (arbi)hfrh0.b;
            if(arbi0 != null && (arbi0.b & 1) != 0) {
                if(arbi0.c) {
                    aree.a.j("Both target and source devices support the Messages Custom D2D API.", new Object[0]);
                    return true;
                }
                aree.a.j("Source device supports Messages Custom D2D API but will not be used.", new Object[0]);
                return false;
            }
            aree.a.j("Source device does not support Messages Custom D2D API.", new Object[0]);
            return false;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            aree.a.g("Error on Messages Custom D2D API handshake request", exception0, new Object[0]);
            throw exception0;
        }
    }

    public final asbo c(asbl asbl0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbo.a).v_newBuilder();
        Context context0 = this.c;
        long v1 = bbmq.d(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbo asbo0 = (asbo)hftp0.b_message;
        asbo0.b |= 1;
        asbo0.d = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbo asbo1 = (asbo)hftp0.b_message;
        asbo1.b |= 2;
        asbo1.e = true;
        for(Object object0: asbl0.b) {
            arqo arqo0 = this.d.a(((asbk)object0));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asbn.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbn asbn0 = (asbn)hftp1.b_message;
            ((asbk)object0).getClass();
            asbn0.c = (asbk)object0;
            asbn0.b |= 1;
            hftp1.cV(arqo0.c());
            if(this.a(asbl0, ((asbk)object0), arqo0)) {
                aree.a.h("Updating photos for hybrid media restore", new Object[0]);
                ((arqx)arqo0).h(context0, hftp0, hftp1);
            }
            asbm asbm0 = arqo0.k();
            if(!((ProtoLiteMessage)asbm0).equals(asbm.a)) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                asbn asbn1 = (asbn)hftp1.b_message;
                asbm0.getClass();
                asbn1.e = asbm0;
                asbn1.b |= 4;
            }
            hftp0.dk(hftp1);
            aree.a.j("Adding flavor summary %s with %d items", new Object[]{((asbk)object0).c, ((asbn)hftp1.b_message).d.size()});
        }
        this.d(hftp0, v);
        return (asbo)hftp0.N_build();
    }

    public final void d(ProtoLiteBuilder hftp0, int v) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asbh.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbh asbh0 = (asbh)hftp1.b_message;
        if(v == 0) {
            throw null;
        }
        asbh0.c = v - 1;
        asbh0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbo asbo0 = (asbo)hftp0.b_message;
        asbh asbh1 = (asbh)hftp1.N_build();
        asbh1.getClass();
        asbo0.g = asbh1;
        asbo0.b |= 16;
    }
}

