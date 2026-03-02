import j..util.DesugarCollections;
import java.util.List;

public final class ginl {
    public static final void a(gkas gkas0, ProtoLiteBuilder hftp0) {
        ibuq.f(gkas0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkai gkai0 = (gkai)hftp0.b_message;
        gkas0.getClass();
        gkai0.b();
        gkai0.c.add(gkas0);
    }

    public static final void b(ProtoLiteBuilder hftp0) {
        List list0 = DesugarCollections.unmodifiableList(((gkai)hftp0.b_message).c);
        ibuq.e(list0, "getFormFieldStatesList(...)");
        new hfxu(list0);
    }
}

