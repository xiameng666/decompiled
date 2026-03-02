import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flro implements kar {
    public final ProtoLiteBuilder a;

    public flro(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        gmdo gmdo0;
        if(((ConversationId)object0).e() == ConversationId.IdType.a) {
            gmdo0 = flsl.c(((ConversationId)object0).c());
        }
        else {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmdo.a).v_newBuilder();
            String s = ((ConversationId)object0).d().a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gmdo)hftp0.b_message).e = s;
            String s1 = ((ConversationId)object0).d().b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gmdo)hftv0).c = s1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gmdo)hftp0.b_message).b = 4;
            gmdo0 = (gmdo)hftp0.N_build();
        }
        ProtoLiteBuilder hftp1 = this.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmdi gmdi0 = (gmdi)hftp1.b_message;
        gmdo0.getClass();
        gmdi0.f = gmdo0;
        gmdi0.b |= 2;
    }
}

