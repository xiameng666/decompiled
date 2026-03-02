import java.io.FileOutputStream;
import java.io.IOException;

public final class lda {
    public final Object a(FileOutputStream fileOutputStream0, ibrl ibrl0) {
        lcz lcz1;
        long v1;
        lcz lcz0;
        if((ibrl0 instanceof lcz)) {
            lcz0 = (lcz)ibrl0;
            int v = lcz0.e;
            if((v & 0x80000000) == 0) {
                lcz0 = new lcz(this, ibrl0);
            }
            else {
                lcz0.e = v - 0x80000000;
            }
        }
        else {
            lcz0 = new lcz(this, ibrl0);
        }
        Object object0 = lcz0.c;
        Object object1 = ibrx.a;
    alab1:
        switch(lcz0.e) {
            case 0: {
                ibnx.b(object0);
                v1 = 10L;
                lcz1 = lcz0;
                goto label_22;
            }
            case 1: {
                v1 = lcz0.b;
                fileOutputStream0 = lcz0.a;
                ibnx.b(object0);
                lcz1 = lcz0;
                do {
                    v1 += v1;
                label_22:
                    if(Long.compare(v1, 60000L) > 0) {
                        break alab1;
                    }
                    try {
                        Object object2 = lcy.a(fileOutputStream0).lock(0L, 0x7FFFFFFFFFFFFFFFL, false);
                        ibuq.e(object2, "lock(...)");
                        return object2;
                    }
                    catch(IOException iOException0) {
                    }
                    String s = iOException0.getMessage();
                    if(s == null) {
                        throw iOException0;
                    }
                    if(!ibzk.G(s, "Resource deadlock would occur")) {
                        throw iOException0;
                    }
                    lcz1.a = fileOutputStream0;
                    lcz1.b = v1;
                    lcz1.e = 1;
                }
                while(iccv.c(v1, lcz1) != object1);
                return object1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object3 = lcy.a(fileOutputStream0).lock(0L, 0x7FFFFFFFFFFFFFFFL, false);
        ibuq.e(object3, "lock(...)");
        return object3;
    }
}

