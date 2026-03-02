import java.util.Observable;

public final class btiz extends Observable {
    public final void a() {
        synchronized(this) {
            super.setChanged();
            super.notifyObservers();
        }
    }

    public final void b() {
        synchronized(this) {
            this.a();
            super.deleteObservers();
        }
    }
}

