import android.view.MotionEvent;
import java.util.List;

public final class hvt {
    public final List a;
    public final hvo b;
    public final int c;
    public final int d;
    public int e;

    public hvt(List list0) {
        this(list0, null);
    }

    public hvt(List list0, hvo hvo0) {
        this.a = list0;
        this.b = hvo0;
        MotionEvent motionEvent0 = this.a();
        int v = 0;
        this.c = motionEvent0 == null ? 0 : motionEvent0.getClassification();
        MotionEvent motionEvent1 = this.a();
        this.d = motionEvent1 == null ? 0 : motionEvent1.getButtonState();
        MotionEvent motionEvent2 = this.a();
        if(motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = this.a();
        if(motionEvent3 == null) {
            int v1 = list0.size();
            while(v < v1) {
                hwe hwe0 = (hwe)list0.get(v);
                if(!hvu.f(hwe0)) {
                    if(!hvu.d(hwe0)) {
                        ++v;
                        continue;
                    }
                    v = 1;
                    goto label_38;
                }
                v = 2;
                goto label_38;
            }
        label_37:
            v = 3;
        }
        else {
            switch(motionEvent3.getActionMasked()) {
                case 0: 
                case 5: {
                    v = 1;
                    break;
                }
                case 1: 
                case 6: {
                    v = 2;
                    break;
                }
                case 2: 
                case 7: {
                    goto label_37;
                }
                case 8: {
                    v = 6;
                    break;
                }
                case 9: {
                    v = 4;
                    break;
                }
                case 10: {
                    v = 5;
                }
            }
        }
    label_38:
        this.e = v;
    }

    public final MotionEvent a() {
        return this.b == null ? null : this.b.b.b;
    }
}

