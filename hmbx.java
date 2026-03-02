import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class hmbx extends hmbg {
    private static final hmgz a;
    private static final hmgz b;
    private static final hmgz c;
    private List d;
    private List e;
    private HashMap f;

    static {
        hmbx.a = new hmgz(0x70);
        hmbx.b = hmgz.e(new byte[]{-97, 105});
        hmbx.c = new hmgz((byte)0x8C);
    }

    @Override  // hmbg
    public final void a(hmdj hmdj0) {
        try {
            List list0 = this.e;
            if(list0 != null) {
                hmgz hmgz0 = hmgw.d(list0);
                HashMap hashMap0 = this.f;
                hmdk hmdk0 = new hmdk(hmbx.c, hmgz0);
                hashMap0.put(hmbx.c, hmdk0);
            }
            List list1 = this.d;
            if(list1 != null) {
                hmgz hmgz1 = hmgw.d(list1);
                HashMap hashMap1 = this.f;
                hmdk hmdk1 = new hmdk(hmbx.b, hmgz1);
                hashMap1.put(hmbx.b, hmdk1);
            }
            Collection collection0 = this.f.values();
            this.d(new hmdk(hmbx.a, collection0));
        }
        catch(hmdm | hmdl | hmdn exception0) {
            hmhe.a().b(exception0, "Cannot parse TLV Object while building Read Records Response", new Object[0]);
            throw new hmfm(hmfl.as);
        }
    }

    public final void e(LinkedHashMap linkedHashMap0, List list0, List list1) {
        this.f = linkedHashMap0;
        this.e = list1;
        this.d = list0;
    }

    @Override
    public final String toString() {
        this.getClass();
        hmbb hmbb0 = hmhe.a();
        hmbb0.e();
        List list0 = this.d;
        if(list0 != null) {
            hmhf.a(list0);
        }
        hmbb0.e();
        List list1 = this.e;
        if(list1 != null) {
            hmhf.a(list1);
        }
        hmbb0.e();
        HashMap hashMap0 = this.f;
        if(hashMap0 != null) {
            hmhf.a(hashMap0.values());
        }
        hmbb0.e();
        return "ReadRecordResponseApdu";
    }
}

