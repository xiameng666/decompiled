import android.os.RemoteException;

public final class cpru {
    public final cpta a;

    public cpru(cpta cpta0) {
        this.a = cpta0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof cpru)) {
            return false;
        }
        try {
            return this.a.c(((cpru)object0).a);
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }

    @Override
    public final int hashCode() {
        try {
            return this.a.a();
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }
}

