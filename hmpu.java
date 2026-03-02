import java.util.Arrays;

public final class hmpu {
    public int a;
    public final int b;

    public hmpu(byte[] arr_b) {
        boolean z;
        if(arr_b.length >= 2) {
            int v = arr_b[0] & 0xFF;
            if(v == (arr_b[8] & 0xFF)) {
                int v1 = arr_b[1] & 0xFF;
                if(v1 == (arr_b[9] & 0xFF)) {
                    int v2 = arr_b[2] & 0xFF;
                    if(v2 == (arr_b[10] & 0xFF)) {
                        int v3 = arr_b[3] & 0xFF;
                        if(v3 == (arr_b[11] & 0xFF) && (arr_b[4] & 0xFF) == (v ^ 0xFF) && (arr_b[5] & 0xFF) == (v1 ^ 0xFF) && (arr_b[6] & 0xFF) == (v2 ^ 0xFF) && (arr_b[7] & 0xFF) == (v3 ^ 0xFF)) {
                            int v4 = arr_b[12] & 0xFF;
                            if(v4 == (arr_b[14] & 0xFF)) {
                                int v5 = arr_b[13] & 0xFF;
                                z = v5 == (arr_b[15] & 0xFF) && v4 == (v5 ^ 0xFF);
                            }
                            else {
                                z = false;
                            }
                        }
                        else {
                            z = false;
                        }
                    }
                    else {
                        z = false;
                    }
                }
                else {
                    z = false;
                }
            }
            else {
                z = false;
            }
        }
        else {
            z = false;
        }
        hmpb.f(z, 6);
        byte[] arr_b1 = hmpy.L(Arrays.copyOfRange(arr_b, 0, 4));
        this.b = hmpy.y(new byte[]{arr_b[12]});
        this.a = hmpy.y(arr_b1);
    }
}

