import com.google.android.libraries.messaging.lighter.model.AutoValue_MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;

public final class fmgh {
    private ConversationId a;
    private String b;
    private ContactId c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private int j;
    private long k;
    private byte l;

    public fmgh() {
    }

    public fmgh(MessageReceivedNotification messageReceivedNotification0) {
        this.a = messageReceivedNotification0.d();
        this.b = messageReceivedNotification0.i();
        this.c = messageReceivedNotification0.c();
        this.d = messageReceivedNotification0.f();
        this.e = messageReceivedNotification0.k();
        this.f = messageReceivedNotification0.g();
        this.g = messageReceivedNotification0.j();
        this.h = messageReceivedNotification0.h();
        this.i = messageReceivedNotification0.l();
        this.j = messageReceivedNotification0.a();
        this.k = messageReceivedNotification0.b();
        this.l = 7;
    }

    public final MessageReceivedNotification a() {
        if(this.l == 7) {
            ConversationId conversationId0 = this.a;
            if(conversationId0 != null) {
                String s = this.b;
                if(s != null) {
                    ContactId contactId0 = this.c;
                    if(contactId0 != null) {
                        String s1 = this.d;
                        if(s1 != null) {
                            String s2 = this.e;
                            if(s2 != null) {
                                String s3 = this.f;
                                if(s3 != null) {
                                    String s4 = this.g;
                                    if(s4 != null) {
                                        String s5 = this.h;
                                        if(s5 != null) {
                                            return new AutoValue_MessageReceivedNotification(conversationId0, s, contactId0, s1, s2, s3, s4, s5, this.i, this.j, this.k);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" conversationId");
        }
        if(this.b == null) {
            stringBuilder0.append(" messageId");
        }
        if(this.c == null) {
            stringBuilder0.append(" senderId");
        }
        if(this.d == null) {
            stringBuilder0.append(" avatarUrl");
        }
        if(this.e == null) {
            stringBuilder0.append(" title");
        }
        if(this.f == null) {
            stringBuilder0.append(" body");
        }
        if(this.g == null) {
            stringBuilder0.append(" senderName");
        }
        if(this.h == null) {
            stringBuilder0.append(" messageContent");
        }
        if((this.l & 1) == 0) {
            stringBuilder0.append(" disableInlineResponse");
        }
        if((this.l & 2) == 0) {
            stringBuilder0.append(" messageState");
        }
        if((this.l & 4) == 0) {
            stringBuilder0.append(" timestampMs");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null avatarUrl");
        }
        this.d = s;
    }

    public final void c(String s) {
        if(s == null) {
            throw new NullPointerException("Null body");
        }
        this.f = s;
    }

    public final void d(ConversationId conversationId0) {
        if(conversationId0 == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationId0;
    }

    public final void e(boolean z) {
        this.i = z;
        this.l = (byte)(this.l | 1);
    }

    public final void f(String s) {
        if(s == null) {
            throw new NullPointerException("Null messageContent");
        }
        this.h = s;
    }

    public final void g(String s) {
        if(s == null) {
            throw new NullPointerException("Null messageId");
        }
        this.b = s;
    }

    public final void h(int v) {
        this.j = v;
        this.l = (byte)(this.l | 2);
    }

    public final void i(ContactId contactId0) {
        if(contactId0 == null) {
            throw new NullPointerException("Null senderId");
        }
        this.c = contactId0;
    }

    public final void j(String s) {
        if(s == null) {
            throw new NullPointerException("Null senderName");
        }
        this.g = s;
    }

    public final void k(long v) {
        this.k = v;
        this.l = (byte)(this.l | 4);
    }

    public final void l(String s) {
        if(s == null) {
            throw new NullPointerException("Null title");
        }
        this.e = s;
    }
}

