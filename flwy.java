import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

public final class flwy {
    public static ConversationId a(AccountContext accountContext0, hnrr hnrr0) {
        ContactId contactId0 = accountContext0.c().f();
        int v = hnrr0.d;
        int v1 = 2;
        if(v != 0) {
            switch(v) {
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
        }
        if(v1 == 4) {
            fmew fmew0 = new fmew();
            fmex fmex0 = new fmex();
            fmex0.c((hnrr0.b == 103 ? ((hnro)hnrr0.c) : hnro.a).b);
            fmex0.b((hnrr0.b == 103 ? ((hnro)hnrr0.c) : hnro.a).c);
            fmew0.c(fmex0.a());
            fmew0.b(contactId0);
            return fmew0.a();
        }
        List list0 = ggia.h((hnrr0.b == 101 ? ((hnsj)hnrr0.c) : hnsj.a).b, new flwx());
        fmew fmew1 = new fmew();
        fmew1.d(((ContactId)gggq.k(list0, new gfti(gftl.b(contactId0)))));
        fmew1.b(accountContext0.c().f());
        return fmew1.a();
    }

    public static hnrr b(ConversationId conversationId0) {
        if(conversationId0.e() == ConversationId.IdType.b) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnrr.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hnrr)hftp0.b_message).d = 2;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnro.a).v_newBuilder();
            String s = conversationId0.d().b();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hnro)hftp1.b_message).b = s;
            String s1 = conversationId0.d().a();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hnro)hftp1.b_message).c = s1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnrr hnrr0 = (hnrr)hftp0.b_message;
            hnro hnro0 = (hnro)hftp1.N_build();
            hnro0.getClass();
            hnrr0.c = hnro0;
            hnrr0.b = 103;
            return (hnrr)hftp0.N_build();
        }
        hnry hnry0 = flxa.b(conversationId0.a());
        hnry hnry1 = flxa.b(conversationId0.c());
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnrr.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hnrr)hftp2.b_message).d = 1;
        hnsi hnsi0 = (hnsi)((ProtoLiteMessage)hnsj.a).v_newBuilder();
        hnsi0.a(hnry0);
        hnsi0.a(hnry1);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hnrr hnrr1 = (hnrr)hftp2.b_message;
        hnsj hnsj0 = (hnsj)((ProtoLiteBuilder)hnsi0).N_build();
        hnsj0.getClass();
        hnrr1.c = hnsj0;
        hnrr1.b = 101;
        return (hnrr)hftp2.N_build();
    }
}

