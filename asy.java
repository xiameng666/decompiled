import java.util.Map.Entry;
import java.util.Objects;

final class asy {
    public final lqi a;
    private final bje b;

    public asy(bje bje0) {
        this.b = bje0;
        lqi lqi0 = new lqi();
        this.a = lqi0;
        lqi0.ii(new bae(5, null));
    }

    public final void a(bim bim0, bac bac0) {
        bae bae0;
        if(bac0 != null && bac0.a == 8) {
            bae0 = new bae(5, bac0);
        }
        else {
        alab1:
            switch(bim0.ordinal()) {
                case 0: 
                case 2: {
                    bae0 = new bae(5, bac0);
                    break;
                }
                case 3: {
                    synchronized(this.b.a) {
                        for(Object object1: this.b.c.entrySet()) {
                            if(((bjd)((Map.Entry)object1).getValue()).a != bim.e) {
                                continue;
                            }
                            bae0 = new bae(2, null);
                            break alab1;
                        }
                    }
                    bae0 = new bae(1, null);
                    break;
                }
                case 1: 
                case 4: {
                    bae0 = new bae(4, bac0);
                    break;
                }
                case 5: {
                    bae0 = new bae(2, bac0);
                    break;
                }
                case 6: 
                case 7: {
                    bae0 = new bae(3, bac0);
                    break;
                }
                default: {
                    Objects.toString(bim0);
                    throw new IllegalStateException("Unknown internal camera state: " + bim0);
                }
            }
        }
        Objects.toString(bim0);
        Objects.toString(bac0);
        bcs.h("CameraStateMachine");
        lqi lqi0 = this.a;
        if(!j..util.Objects.equals(((bae)lqi0.ij()), bae0)) {
            bcs.h("CameraStateMachine");
            lqi0.ii(bae0);
        }
    }
}

