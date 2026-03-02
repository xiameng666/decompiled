import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.GroupId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.regex.Pattern;

public final class flwu {
    public static ContactId a(hnxb hnxb0) {
        fmep fmep0 = new fmep(null);
        fmep0.d(hnxb0.e);
        switch((iddq.b(hnxb0.c) == 0 ? 1 : iddq.b(hnxb0.c)) - 2) {
            case 1: {
                fmep0.c(hnxb0.d);
                fmep0.e(ContactId.ContactType.b);
                return fmep0.a();
            }
            case 13: {
                fmep0.c(hnxb0.d);
                fmep0.e(ContactId.ContactType.e);
                return fmep0.a();
            }
            case 16: {
                fmep0.c(hnxb0.d);
                fmep0.e(ContactId.ContactType.c);
                return fmep0.a();
            }
            case 18: {
                String[] arr_s = hnxb0.d.split(Pattern.quote("|"), 2);
                if(arr_s.length == 2) {
                    fmep0.c(arr_s[1]);
                    fmep0.b(arr_s[0]);
                    fmep0.e(ContactId.ContactType.d);
                    return fmep0.a();
                }
                return null;
            }
            default: {
                return null;
            }
        }
    }

    public static ConversationId b(hnxb hnxb0, AccountContext accountContext0) {
        gftb.checkTrue(iddq.b(hnxb0.c) == 4);
        fmex fmex0 = new fmex();
        fmex0.c(hnxb0.d);
        fmex0.b(hnxb0.e);
        ConversationId.GroupId conversationId$GroupId0 = fmex0.a();
        fmew fmew0 = new fmew();
        fmew0.c(conversationId$GroupId0);
        fmew0.b(accountContext0.c().f());
        return fmew0.a();
    }

    public static hnxb c(ContactId contactId0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnxb.a).v_newBuilder();
        String s = contactId0.e();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnxb)hftp0.b_message).e = s;
        int v = contactId0.b().ordinal();
        switch(v) {
            case 0: {
                return null;
            }
            case 1: {
                String s2 = contactId0.d();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((hnxb)hftv1).d = s2;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnxb)hftp0.b_message).c = 1;
                return (hnxb)hftp0.N_build();
            }
            case 2: {
                String s3 = contactId0.d();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((hnxb)hftv2).d = s3;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnxb)hftp0.b_message).c = 16;
                return (hnxb)hftp0.N_build();
            }
            case 3: {
                if(contactId0.c().i()) {
                    String s4 = ((String)contactId0.c().d()) + "|" + contactId0.d();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    ((hnxb)hftv3).d = s4;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hnxb)hftp0.b_message).c = 18;
                    return (hnxb)hftp0.N_build();
                }
                String s5 = contactId0.d();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp0.b_message;
                ((hnxb)hftv4).d = s5;
                if(!hftv4.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnxb)hftp0.b_message).c = 18;
                return (hnxb)hftp0.N_build();
            }
            default: {
                if(v == 4) {
                    String s1 = contactId0.d();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((hnxb)hftv0).d = s1;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hnxb)hftp0.b_message).c = 13;
                    return (hnxb)hftp0.N_build();
                }
                return (hnxb)hftp0.N_build();
            }
        }
    }
}

