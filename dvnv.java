import com.google.android.gms.tapandpay.firstparty.PassInfo;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class dvnv implements gfsi {
    private static final bboh a;
    private final dvnw b;
    private final dvnu c;

    static {
        dvnv.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvnv(dvnw dvnw0, dvnu dvnu0) {
        this.b = dvnw0;
        this.c = dvnu0;
    }

    public final dvoi a(Set set0) {
        byte[] arr_b = null;
        if(set0 == null) {
            return new dvoi(null, null, Collections.EMPTY_SET);
        }
        HashSet hashSet0 = new HashSet(set0.size());
        byte[] arr_b1 = null;
        for(Object object0: set0) {
            fgxh fgxh0 = (fgxh)object0;
            if((fgxh0 instanceof dvok)) {
                ValuableInfo valuableInfo0 = this.b.a(((dvok)fgxh0).b);
                PassInfo passInfo0 = this.c.a(((dvok)fgxh0).b);
                hashSet0.add(new dvoj(((dvok)fgxh0).b.b, valuableInfo0, passInfo0));
            }
            else if((fgxh0 instanceof dvoh)) {
                byte[] arr_b2 = ((dvoh)fgxh0).b;
                if(arr_b == null) {
                    arr_b = arr_b2;
                }
                else {
                    ((ggtj)dvnv.a.i()).R("Multiple tap IDs seen within tap. First tap ID: %s; Current tap ID: %s", fgzu.b(arr_b), fgzu.b(arr_b2));
                }
                byte[] arr_b3 = ((dvoh)fgxh0).c;
                if(arr_b1 == null) {
                    arr_b1 = arr_b3;
                }
                else {
                    ((ggtj)dvnv.a.i()).R("Multiple customer IDs seen within tap. First ID: %s; Current ID: %s", fgzu.b(arr_b1), fgzu.b(arr_b3));
                }
            }
            else {
                ((ggtj)dvnv.a.i()).B("Unknown ServiceObject type transmitted over Smart Tap: %s", fgxh0.getClass().getName());
            }
        }
        return new dvoi(arr_b, arr_b1, hashSet0);
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return this.a(((Set)object0));
    }
}

