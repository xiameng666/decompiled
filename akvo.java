import java.lang.ref.WeakReference;
import java.util.TimerTask;

final class akvo extends TimerTask {
    private final WeakReference a;
    private final int b;

    public akvo(akvp akvp0, int v) {
        this.a = new WeakReference(akvp0);
        this.b = v;
    }

    @Override
    public final void run() {
        String s;
        akvp akvp0 = (akvp)this.a.get();
        if(akvp0 == null) {
            ((ggtj)akvp.a.j()).x("Channel was destroyed before task began; cannot proceed.");
            return;
        }
        synchronized(akvp0.c) {
            int v1 = this.b;
            if(v1 != akvp0.i) {
                return;
            }
            aliu aliu0 = new aliu();
            switch(v1) {
                case 1: {
                    if(!akvp0.j) {
                        aliu0.C("ble_weave_socket_connection_result", 2);
                        akvp0.j = true;
                    }
                    break;
                }
                case 2: {
                    aliu0.F(3);
                    break;
                }
                case 3: {
                    aliu0.i(3);
                    break;
                }
                case 4: {
                    aliu0.F(4);
                    break;
                }
                case 5: {
                    aliu0.i(4);
                    break;
                }
                case 6: {
                    aliu0.F(5);
                }
            }
            if(akvp0.h == 0) {
                return;
            }
            ggtj ggtj0 = (ggtj)akvp.a.j();
            switch(v1) {
                case 0: {
                    s = "[not waiting]";
                    break;
                }
                case 1: {
                    s = "[waiting for connection]";
                    break;
                }
                case 2: {
                    s = "[waiting for Initiator Hello]";
                    break;
                }
                case 3: {
                    s = "[waiting for Responder Auth]";
                    break;
                }
                case 4: {
                    s = "[waiting for Initiator Auth]";
                    break;
                }
                case 5: {
                    s = "[waiting for Initiator Hello write to finish]";
                    break;
                }
                default: {
                    s = "[waiting for Responder Auth write to finish]";
                }
            }
            ggtj0.B("Timeout occurred waiting; channel will now disconnect. Status: %s.", s);
            akvp0.g();
        }
    }
}

