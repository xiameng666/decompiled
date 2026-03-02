import android.database.Observable;

public final class tl extends Observable {
    public final void a() {
        int v = this.mObservers.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            ((tm)this.mObservers.get(v)).a();
        }
    }

    public final void b(int v, int v1) {
        int v2 = this.mObservers.size();
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            ((tm)this.mObservers.get(v2)).g(v, v1);
        }
    }

    public final void c(int v, int v1) {
        this.d(v, v1, null);
    }

    public final void d(int v, int v1, Object object0) {
        int v2 = this.mObservers.size();
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            ((tm)this.mObservers.get(v2)).c(v, v1, object0);
        }
    }

    public final void e(int v, int v1) {
        int v2 = this.mObservers.size();
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            ((tm)this.mObservers.get(v2)).d(v, v1);
        }
    }

    public final void f(int v, int v1) {
        int v2 = this.mObservers.size();
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            ((tm)this.mObservers.get(v2)).e(v, v1);
        }
    }

    public final void g() {
        int v = this.mObservers.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            ((tm)this.mObservers.get(v)).f();
        }
    }

    public final boolean h() {
        return !this.mObservers.isEmpty();
    }
}

