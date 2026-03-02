import org.json.JSONObject;

public final class dmlm implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((JSONObject)object1), "command");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fswu.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        String s = "Apdu" + (((int)(((Integer)object0))) + 1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fswu fswu0 = (fswu)hftp0.b_message;
        fswu0.b |= 1;
        fswu0.c = s;
        Object object2 = ((JSONObject)object1).get("apduCommand");
        ibuq.d(object2, "null cannot be cast to non-null type kotlin.String");
        ibuq.f(((String)object2), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fswu fswu1 = (fswu)hftp0.b_message;
        ((String)object2).getClass();
        fswu1.b |= 2;
        fswu1.d = (String)object2;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (fswu)hftv0;
    }
}

