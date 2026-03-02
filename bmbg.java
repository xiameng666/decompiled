import java.util.concurrent.Callable;

public final class bmbg implements Callable {
    public final bmbj a;
    public final boolean b;
    public final bmcf c;
    public final byte[] d;

    public bmbg(bmbj bmbj0, boolean z, bmcf bmcf0, byte[] arr_b) {
        this.a = bmbj0;
        this.b = z;
        this.c = bmcf0;
        this.d = arr_b;
    }

    @Override
    public final Object call() {
        int v2;
        bmcj bmcj2;
        bmbj bmbj0 = this.a;
        if(this.b) {
            bmch bmch0 = bmbj0.b;
            if((bmch0.d & 1) == 1) {
                bmcj bmcj0 = new bmcj(bmbj0.c.get(), bmcf.d, new byte[0]);
                try {
                    bmch0.d(bmcj0);
                    bmch0.c();
                    goto label_12;
                }
                catch(bmcm unused_ex) {
                }
                catch(bmcl unused_ex) {
                    goto label_12;
                }
                try {
                    int v = bmbj0.b.a();
                    bmbj0.c.set(v);
                    bmbj0.b.d(bmcj0);
                    bmbj0.b.c();
                }
                catch(bmcl | bmcm unused_ex) {
                }
            }
        }
    label_12:
        bmcf bmcf0 = this.c;
        bmcj bmcj1 = new bmcj(bmbj0.c.get(), bmcf0, this.d);
        bmch bmch1 = bmbj0.b;
        bmch1.d(bmcj1);
    alab1:
        while(true) {
            try {
                bmcj2 = bmch1.c();
            }
            catch(bmcm unused_ex) {
                int v1 = bmbj0.b.a();
                bmbj0.c.set(v1);
                bmbj0.b.d(bmcj1);
                bmcj2 = bmbj0.b.c();
            }
            v2 = ((bmci)bmcj2.a().get(0)).a;
            bmcf[] arr_bmcf = bmcf.values();
            int v3 = 0;
            while(true) {
                if(v3 >= arr_bmcf.length) {
                    break alab1;
                }
                bmcf bmcf1 = arr_bmcf[v3];
                if(bmcf1.i != v2) {
                    ++v3;
                    continue;
                }
                if(bmcf1.equals(bmcf.g)) {
                    break;
                }
                if(bmcf0.equals(bmcf1)) {
                    return bmcj2.c();
                }
                bxly bxly0 = new bxly();
                bxly0.a = 13;
                bxly0.b = "Encountered a invalid command type HID message in response to a request: " + bmcf1.name();
                throw new gmdd(bxly0.a());
            }
        }
        throw new bmce("Encountered unknown HID command with byte value: " + v2);
    }
}

