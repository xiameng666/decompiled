import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class hmcz {
    public hmgz a;
    public LinkedHashMap b;
    public List c;
    private static final hmgz d;
    private static final hmgz e;
    private static final hmgz f;
    private static final hmgz g;
    private static final byte[] h;
    private static final byte[] i;
    private hmbb j;

    static {
        hmcz.d = new hmgz(0x6F);
        hmcz.e = new hmgz((byte)0x84);
        hmcz.f = new hmgz(-91);
        hmcz.g = hmgz.e(new byte[]{-97, 56});
        hmcz.h = new byte[]{-97, 29};
        hmcz.i = new byte[]{-97, 26};
    }

    public hmcz(byte[] arr_b, List list0) {
        hmdk hmdk1;
        this.j = hmhe.a();
        try {
            try {
                hmdk hmdk0 = hmdk.b(arr_b);
                if(!hmdk0.a.q(hmcz.d)) {
                    throw new hmfq(hmfl.r, a.Y(hmdk0.a, "MChipByteArray", "First tag in Payment Fci is not ", ", but "));
                }
                LinkedHashMap linkedHashMap0 = hmdk.e(hmdk0.c);
                hmgz hmgz0 = hmcz.e;
                if(linkedHashMap0.containsKey(hmgz0)) {
                    this.a = ((hmdk)linkedHashMap0.get(hmgz0)).c;
                }
                else {
                    this.j.d("Profile Payment FCI does not contain DF_NAME tag MChipByteArray", new Object[0]);
                }
                hmgz hmgz1 = hmcz.f;
                if(!linkedHashMap0.containsKey(hmgz1)) {
                    throw new hmfq(hmfl.r, a.a("MChipByteArray", "Missing tag ", " in profile Payment Fci data"));
                }
                this.b = hmdk.e(((hmdk)linkedHashMap0.get(hmgz1)).c);
                this.c = new ArrayList();
                if(list0.isEmpty()) {
                    return;
                }
                hmdk1 = (hmdk)this.b.get(hmcz.g);
                if(hmdk1 == null) {
                    this.c.add(new hmht(hmcz.h, 8));
                    this.c.add(new hmht(hmcz.i, 2));
                    this.j.d("Profile Payment FCI PDOLs list is not present. Adding default PDOL List of TERMINAL_RISK_MANAGEMENT_DATA and TERMINAL_COUNTRY_CODE", new Object[0]);
                    goto label_37;
                }
            }
            catch(hmdl | hmdm exception0) {
                goto label_48;
            }
            try {
                List list1 = hmgw.h(hmdk1.c.a);
                for(Object object0: list0) {
                    hmht hmht0 = (hmht)object0;
                    if(!list1.contains(hmht0)) {
                        list1.add(hmht0);
                    }
                }
                this.c.addAll(list1);
                goto label_37;
            }
            catch(hmdl | hmdm exception1) {
                try {
                    this.j.b(exception1, "Profile PDOLs are malformed", new Object[0]);
                    throw new hmfq(hmfl.aa, "Error when parsing profile Payment FCI PDOLs");
                label_37:
                    hmbb hmbb0 = this.j;
                    hmhf.a(this.c);
                    hmbb0.e();
                }
                catch(hmdl | hmdm exception0) {
                    goto label_48;
                }
            }
        }
        catch(hmdn exception0) {
            goto label_48;
        }
        try {
            hmgz hmgz2 = hmgw.d(this.c);
            hmdk hmdk2 = new hmdk(hmcz.g, hmgz2);
            this.b.put(hmcz.g, hmdk2);
            return;
        }
        catch(hmdm | hmdl | hmdn exception2) {
            try {
                this.j.b(exception2, "Wallet PDOLs are malformed", new Object[0]);
                throw new hmfq(hmfl.aa, "Error during profile Payment FCI PDOLs serialization");
            }
            catch(hmdl | hmdm | hmdn exception0) {
            }
        }
    label_48:
        this.j.b(exception0, "Cannot parse the profile FCI data", new Object[0]);
        throw new hmfq(hmfl.h);
    }

    @Override
    public final String toString() {
        hmbb hmbb0 = hmhe.a();
        hmgz hmgz0 = this.a;
        if(hmgz0 != null) {
            hmgz0.i();
        }
        hmbb0.e();
        LinkedHashMap linkedHashMap0 = this.b;
        if(linkedHashMap0 != null) {
            hmhf.a(linkedHashMap0.values());
        }
        hmbb0.e();
        hmbb0.e();
        return "PaymentFci";
    }
}

