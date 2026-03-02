import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class stj {
    public final List a;

    public stj(List list0) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        arrayList0.addAll(list0);
    }

    public final stk a(sti sti0) {
        for(Object object0: this.a) {
            stk stk0 = (stk)object0;
            if(stk0.a == sti0) {
                return stk0;
            }
        }
        return null;
    }

    public final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        for(Object object0: this.a) {
            stq.a(((stk)object0).b(), byteArrayOutputStream0);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public static stj c(byte[] arr_b) {
        sti sti0;
        ArrayList arrayList0 = new ArrayList();
        ssv ssv0 = new ssv(arr_b);
        try {
            ssw ssw0;
            while((ssw0 = ssv0.a()) != null) {
                try {
                    int v = (byte)ssw0.d().a;
                    sti[] arr_sti = sti.values();
                    for(int v1 = 0; true; ++v1) {
                        if(v1 >= arr_sti.length) {
                            String s = str.a(((byte)v));
                            throw new EnumConstantNotPresentException(sti.class, s);
                        }
                        sti0 = arr_sti[v1];
                        if(sti0.f == v) {
                            break;
                        }
                    }
                    arrayList0.add(new stk(sti0, ssw0.a()));
                }
                catch(EnumConstantNotPresentException unused_ex) {
                    throw new stt(a.h(ssw0.d().a, "Invalid tag encountered in secure data: "));
                }
            }
        }
        catch(IOException iOException0) {
            throw new stt("Failed to read tag list from stream, data: " + str.b(arr_b), iOException0);
        }
        return new stj(arrayList0);
    }
}

