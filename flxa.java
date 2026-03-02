import com.google.android.libraries.messaging.lighter.model..AutoValue_ConversationId_GroupId;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;

public final class flxa {
    public static ContactId a(hnry hnry0) {
        fmep fmep0 = new fmep(null);
        switch((hnta.b(hnry0.b) == 0 ? 1 : hnta.b(hnry0.b)) - 2) {
            case 1: {
                fmep0.e(ContactId.ContactType.b);
                break;
            }
            case 2: {
                fmep0.e(ContactId.ContactType.c);
                break;
            }
            case 3: {
                fmep0.e(ContactId.ContactType.d);
                fmep0.b(hnry0.d);
                break;
            }
            case 5: {
                fmep0.e(ContactId.ContactType.e);
                break;
            }
            default: {
                fmep0.e(ContactId.ContactType.a);
            }
        }
        fmep0.c(hnry0.c);
        fmep0.d(hnry0.e);
        return fmep0.a();
    }

    public static hnry b(ContactId contactId0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnry.a).v_newBuilder();
        String s = contactId0.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnry)hftp0.b_message).c = s;
        String s1 = contactId0.e();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnry)hftp0.b_message).e = s1;
        switch(contactId0.b().ordinal()) {
            case 0: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnry)hftp0.b_message).b = 0;
                return (hnry)hftp0.N_build();
            }
            case 1: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnry)hftp0.b_message).b = 1;
                return (hnry)hftp0.N_build();
            }
            case 2: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnry)hftp0.b_message).b = 2;
                return (hnry)hftp0.N_build();
            }
            case 3: {
                if(contactId0.c().i()) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hnry)hftp0.b_message).b = 3;
                    String s2 = (String)contactId0.c().d();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hnry)hftp0.b_message).d = s2;
                    return (hnry)hftp0.N_build();
                }
                return (hnry)hftp0.N_build();
            }
            case 4: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnry)hftp0.b_message).b = 5;
                return (hnry)hftp0.N_build();
            }
            default: {
                return (hnry)hftp0.N_build();
            }
        }
    }

    public static hnry c(fmbc fmbc0) {
        switch(fmbc0.d() - 1) {
            case 1: {
                return flxa.b(fmbc0.a());
            }
            case 2: {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnry.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hnry)hftp1.b_message).b = 4;
                String s = ((.AutoValue_ConversationId_GroupId)fmbc0.b()).b;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hnry)hftp1.b_message).e = s;
                String s1 = ((.AutoValue_ConversationId_GroupId)fmbc0.b()).a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hnry)hftp1.b_message).c = s1;
                return (hnry)hftp1.N_build();
            }
            default: {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnry.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnry)hftp0.b_message).b = 0;
                return (hnry)hftp0.N_build();
            }
        }
    }
}

