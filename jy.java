import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public final class jy {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public na h;
    mw i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    Bundle p;

    public jy(int v) {
        this.a = v;
        this.n = false;
    }

    final void a(na na0) {
        na na1 = this.h;
        if(na0 != na1) {
            if(na1 != null) {
                na1.o(this.i);
            }
            this.h = na0;
            if(na0 != null) {
                mw mw0 = this.i;
                if(mw0 != null) {
                    na0.g(mw0);
                }
            }
        }
    }
}

