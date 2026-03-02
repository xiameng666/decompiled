import com.google.android.gms.personalsafety.ringing.FinderRingingIntentOperation;

public final class eieg implements fqng {
    public final FinderRingingIntentOperation a;

    public eieg(FinderRingingIntentOperation finderRingingIntentOperation0) {
        this.a = finderRingingIntentOperation0;
    }

    @Override  // fqng
    public final gmcd a(int v) {
        String s;
        if(v - 1 != 4) {
            ggtj ggtj0 = (ggtj)eicd.a.i();
            switch(v) {
                case 1: {
                    s = "RECONNECTING";
                    break;
                }
                case 2: {
                    s = "RESCANNING";
                    break;
                }
                case 3: {
                    s = "SCANNING";
                    break;
                }
                case 4: {
                    s = "CONNECTING";
                    break;
                }
                default: {
                    s = "CONNECTED";
                }
            }
            ggtj0.R("%s Unexpected progress status: %s", "[S]", s);
            return gmbx.a;
        }
        FinderRingingIntentOperation finderRingingIntentOperation0 = this.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwmq.a).v_newBuilder();
        long v1 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwmq)hftv0).b |= 1;
        ((gwmq)hftv0).c = v1;
        gwmp gwmp0 = gwmp.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwmq)hftp0.b_message).d = gwmp0.h;
        ((gwmq)hftp0.b_message).b |= 2;
        gwmq gwmq0 = (gwmq)hftp0.N_build();
        finderRingingIntentOperation0.b.add(gwmq0);
        eiet.a(finderRingingIntentOperation0.getApplicationContext(), Integer.valueOf(5), finderRingingIntentOperation0.a.a, "com.google.android.personalsafety.internal.ringing.CONNECTION_SUCCESSFUL");
        return gmbx.a;
    }
}

