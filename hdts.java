import j..util.DesugarCollections;
import java.util.List;

public final class hdts {
    public static final void a(hdud hdud0, ProtoLiteBuilder hftp0) {
        ibuq.f(hdud0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtt hdtt0 = (hdtt)hftp0.b_message;
        hdud0.getClass();
        hdtt0.b();
        hdtt0.b.add(hdud0);
    }

    public static final void b(ProtoLiteBuilder hftp0) {
        List list0 = DesugarCollections.unmodifiableList(((hdtt)hftp0.b_message).b);
        ibuq.e(list0, "getOneOfOptionList(...)");
        new hfxu(list0);
    }
}

