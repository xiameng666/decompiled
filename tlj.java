import java.util.Arrays;

public class tlj extends tcb {
    protected static final tch a;

    static {
        tlj.a = new tch(2);
    }

    public tlj(tcj tcj0, byte[] arr_b, tch tch0) {
        super(tcj0, arr_b, tch0);
        boolean z1;
        boolean z = false;
        teb.e(arr_b.length == 60, "data with length %d is expected", new Object[]{((int)60)});
        if(tcj0.a()[0] == 0x3F) {
            switch(tcj0.a()[1]) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: {
                    z1 = true;
                    break;
                }
                default: {
                    z1 = false;
                }
            }
        }
        else {
            z1 = false;
        }
        teb.d(z1, "DGI tag \'3F0x\' is expected where x = \'1\'-\'F\'");
        byte[] arr_b1 = this.a(0, 2);
        teb.d(arr_b1[0] == -33 && arr_b1[1] == tcj0.a()[1], "profile template tag \'DF0x\' corresponding with DGI tag \'3F0x\' is expected");
        if(this.a(2, 1)[0] == 57) {
            z = true;
        }
        teb.d(z, "profile template with length 57 is expected");
    }

    public final byte[] a(int v, int v1) {
        int v2 = v1 + v;
        return this.e().length < v2 ? null : Arrays.copyOfRange(this.e(), v, v2);
    }
}

