import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

public final class atja implements Runnable {
    public final InputStream a;
    public final gdjh b;
    public final PipedOutputStream c;
    public final atjc d;

    public atja(InputStream inputStream0, gdjh gdjh0, PipedOutputStream pipedOutputStream0, atjc atjc0) {
        this.a = inputStream0;
        this.b = gdjh0;
        this.c = pipedOutputStream0;
        this.d = atjc0;
    }

    @Override
    public final void run() {
        boolean z;
        PipedOutputStream pipedOutputStream0;
        atjc atjc0;
        try {
            atjc0 = this.d;
            pipedOutputStream0 = this.c;
            gdjh gdjh0 = this.b;
            InputStream inputStream0 = this.a;
            gftb.check(gdjh0);
            gdjj gdjj0 = new gdjj(pipedOutputStream0, 0x100000);
            int v1 = gdjh0.b;
            gdji gdji0 = new gdji(v1);
            byte[] arr_b = new byte[0x100];
            int v2;
            while((v2 = inputStream0.read(arr_b)) != -1) {
                for(int v3 = 0; v3 < v2; ++v3) {
                    gdji0.f(arr_b[v3]);
                    if(gdji0.e) {
                        gdjj0.b(gdji0.d);
                    }
                    if(gdji0.h()) {
                        int v4 = gdji0.b();
                        gdjm gdjm0 = gdjh0.a.b;
                        gdjd gdjd0 = null;
                        if(gdjm0.a.i(v4)) {
                            List list0 = gdjm0.a(gdji0.b());
                            if(list0 == null) {
                                list0 = new ArrayList();
                            }
                            String s = null;
                            for(Object object0: list0) {
                                gdjd gdjd1 = (gdjd)object0;
                                if(s == null) {
                                    s = gdji0.d();
                                }
                                if(gdjd1.b.equals(s)) {
                                    gdjd0 = gdjd1;
                                    break;
                                }
                            }
                        }
                        if(gdjd0 != null) {
                            gdjj0.c(gdjd0.a, v1);
                            gdji0.g();
                        }
                    }
                }
            }
            int v5 = gdji0.c;
            byte[] arr_b1 = gdji0.a;
            if(v5 >= arr_b1.length) {
                v5 = arr_b1.length;
            }
            if(v5 != 0) {
                int v6 = gdjh0.c;
                if(v6 == 0) {
                    z = false;
                }
                else if(gdji0.a(v6) == ((int)gdjh0.d)) {
                    String s1 = gdji0.e(v6);
                    if(gdjh0.e.b.equals(s1)) {
                        v5 -= v6;
                        z = true;
                    }
                    else {
                        z = false;
                    }
                }
                else {
                    z = false;
                }
                for(int v7 = 0; v7 < v5; ++v7) {
                    gdjj0.b(arr_b1[(gdji0.c >= arr_b1.length ? (gdji0.b + v7) % arr_b1.length : v7)]);
                }
                if(z) {
                    gdjj0.c(gdjh0.e.a, v6);
                }
            }
            gdjj0.a();
        }
        catch(IOException iOException0) {
            atjb.a.e("Exception ", iOException0, new Object[0]);
            atjc0.a = iOException0;
        }
        finally {
            pipedOutputStream0.close();
        }
        try {
        }
        catch(IOException unused_ex) {
        }
    }
}

