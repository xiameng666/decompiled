import j..util.Objects;
import java.util.List;

public final class crki {
    final crkk a;

    public crki(crkk crkk0) {
        Objects.requireNonNull(crkk0);
        this.a = crkk0;
        super();
    }

    public final void a(int v, String s, List list0, boolean z, boolean z1) {
        crjg crjg0;
        switch(v - 1) {
            case 0: {
                crjg0 = this.a.aJ().j;
                break;
            }
            case 1: {
                if(z) {
                    crjg0 = this.a.aJ().d;
                }
                else if(z1) {
                    crjg0 = this.a.aJ().c;
                }
                else {
                    crjg0 = this.a.aJ().e;
                }
                break;
            }
            case 3: {
                crjg0 = this.a.aJ().k;
                break;
            }
            default: {
                if(v - 1 != 4) {
                    crjg0 = this.a.aJ().i;
                }
                else if(z) {
                    crjg0 = this.a.aJ().g;
                }
                else if(z1) {
                    crjg0 = this.a.aJ().f;
                }
                else {
                    crjg0 = this.a.aJ().h;
                }
            }
        }
        int v1 = list0.size();
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    crjg0.c(s, list0.get(0), list0.get(1));
                    return;
                }
                case 3: {
                    crjg0.d(s, list0.get(0), list0.get(1), list0.get(2));
                    return;
                }
                default: {
                    crjg0.a(s);
                    return;
                }
            }
        }
        crjg0.b(s, list0.get(0));
    }
}

