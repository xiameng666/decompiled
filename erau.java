import java.util.concurrent.ExecutionException;

public final class erau implements Runnable {
    public final erav a;
    public final gjkn b;

    public erau(erav erav0, gjkn gjkn0) {
        this.a = erav0;
        this.b = gjkn0;
    }

    @Override
    public final void run() {
        gjkn gjkn1;
        erav erav0;
        gjkn gjkn0;
        try {
            gjkn0 = this.b;
            erav0 = this.a;
            if((gjkn0.b & 0x4000) == 0) {
                int v = (int)(((Integer)((glyq)erav0.e.a()).u()));
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gjkn0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gjkn0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjkn gjkn2 = (gjkn)hftp0.b_message;
                gjkn2.b |= 0x4000;
                gjkn2.p = v;
                gjkn1 = (gjkn)hftp0.N_build();
            }
            else {
                gjkn1 = gjkn0;
            }
            if(erav0.d) {
                erav0.b(gjkn1);
                return;
            }
            erav.a.d("Adding to queue: " + gjkn1, new Object[0]);
            synchronized(erav0.g) {
                erav0.g.add(gjkn1);
            }
        }
        catch(ExecutionException | InterruptedException exception0) {
            erav.a.n("Cannot log event with sequence number: ", exception0, new Object[0]);
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gjkn0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gjkn0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjkn gjkn3 = (gjkn)hftp1.b_message;
            gjkn3.b |= 0x4000;
            gjkn3.p = -1;
            erav0.b(((gjkn)hftp1.N_build()));
        }
    }
}

