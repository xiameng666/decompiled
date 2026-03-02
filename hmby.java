import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

public final class hmby extends hmbg {
    public hmgz a;
    public LinkedHashMap b;
    public hmgz c;
    private static final hmgz d;
    private static final hmgz e;
    private static final hmgz f;

    static {
        hmby.d = new hmgz(0x6F);
        hmby.e = new hmgz((byte)0x84);
        hmby.f = new hmgz(-91);
    }

    @Override  // hmbg
    public final void a(hmdj hmdj0) {
        hmgz hmgz0 = this.c;
        if(hmgz0 != null) {
            try {
                super.c(hmgz0);
            }
            catch(hmdq unused_ex) {
                hmhe.a().a("Null data received for Select C-APDU", new Object[0]);
            }
            return;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            hmgz hmgz1 = this.a;
            if(hmgz1 != null) {
                hmdk hmdk0 = new hmdk(hmby.e, hmgz1);
                hmdj0.b(hmdk0);
                arrayList0.add(hmdk0);
            }
            Collection collection0 = this.b.values();
            hmdk hmdk1 = new hmdk(hmby.f, collection0);
            for(Object object0: this.b.values()) {
                hmdj0.b(((hmdk)object0));
            }
            arrayList0.add(hmdk1);
            super.d(new hmdk(hmby.d, arrayList0));
        }
        catch(hmdn | hmdm | hmdl exception0) {
            hmhe.a().b(exception0, "Cannot parse TLV Object while building Select Response", new Object[0]);
            throw new hmfm(hmfl.as);
        }
    }

    @Override
    public final String toString() {
        this.getClass();
        hmbb hmbb0 = hmhe.a();
        hmbb0.e();
        hmgz hmgz0 = this.c;
        if(hmgz0 != null) {
            hmgz0.i();
        }
        hmbb0.e();
        hmgz hmgz1 = this.a;
        if(hmgz1 != null) {
            hmgz1.i();
        }
        hmbb0.e();
        LinkedHashMap linkedHashMap0 = this.b;
        if(linkedHashMap0 != null) {
            hmhf.a(linkedHashMap0.values());
        }
        hmbb0.e();
        return "SelectResponseApdu";
    }
}

