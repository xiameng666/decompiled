import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.multidevice.XdFeatureListenerOptions;
import j..util.DesugarCollections;
import java.util.List;

public final class ctcq extends azts implements csrd {
    public static final bboh a;

    static {
        String s = new ibuk(ctcq.class).c();
        ctcq.a = bboh.c("Multidevice", bbcu.fJ, s);
    }

    public ctcq(Context context0) {
        ibuq.f(context0, "context");
        super(context0, ctcs.a, azsx.s, aztr_settings.a);
    }

    @Override  // csrd
    public final evql b(csrl csrl0) {
        return this.jm(azyg.a(csrl0, "XdFeatureStatusListener"), 0x80EF);
    }

    @Override  // csrd
    public final evql c(List list0, csrl csrl0) {
        ibuq.f(list0, "keys");
        ibuq.f(csrl0, "listener");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cteo.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        List list1 = DesugarCollections.unmodifiableList(((cteo)hftp0.b_message).b);
        ibuq.e(list1, "getFeatureKeysList(...)");
        new hfxu(list1);
        ibuq.f(list0, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cteo cteo0 = (cteo)hftp0.b_message;
        hfuf hfuf0 = cteo0.b;
        if(!hfuf0.c()) {
            cteo0.b = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(list0, cteo0.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((cteo)hftp0.b_message).c = true;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((cteo)hftv0), "proto");
        XdFeatureListenerOptions xdFeatureListenerOptions0 = new XdFeatureListenerOptions(((cteo)hftv0));
        azyf azyf0 = this.iD(csrl0, "XdFeatureStatusListener");
        ctcj ctcj0 = new ctcj(azyf0);
        ctcl ctcl0 = new ctcl(ctcj0, xdFeatureListenerOptions0);
        ctcm ctcm0 = new ctcm(ctcj0);
        azyq azyq0 = new azyq();
        azyq0.a = ctcl0;
        azyq0.b = ctcm0;
        azyq0.c = azyf0;
        azyq0.d = new Feature[]{csre.a};
        azyq0.e = 33006;
        return this.iH(azyq0.a());
    }
}

