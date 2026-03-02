import android.os.RemoteException;

public final class aref implements Runnable {
    public final asdm a;

    public aref(asdm asdm0) {
        this.a = asdm0;
    }

    @Override
    public final void run() {
        try {
            this.a.b();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeException(remoteException0);
        }
    }
}

