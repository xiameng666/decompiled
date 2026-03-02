import android.os.RemoteException;
import java.util.concurrent.ConcurrentLinkedDeque;

public final class alay implements Runnable {
    public final albe a;

    public alay(albe albe0) {
        this.a = albe0;
    }

    @Override
    public final void run() {
        albe albe0 = this.a;
        alfw alfw0 = albe0.r;
        if(alfw0 != null) {
            while(true) {
                ConcurrentLinkedDeque concurrentLinkedDeque0 = albe0.b;
                if(concurrentLinkedDeque0.isEmpty()) {
                    break;
                }
                aldj aldj0 = (aldj)concurrentLinkedDeque0.remove();
                try {
                    albe.a.d("Sending a signalling message", new Object[0]);
                    byte[] arr_b = aldj0.b.toByteArray();
                    alfw0.b(aldj0.a, arr_b);
                }
                catch(RemoteException remoteException0) {
                    albe0.b.addFirst(aldj0);
                    albe.a.g("Failed to send a message, G->B", remoteException0, new Object[0]);
                    break;
                }
            }
        }
    }
}

