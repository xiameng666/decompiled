import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class hmcx {
    public Integer a;
    public boolean b;
    public LinkedHashMap c;
    public List d;
    public List e;
    private static final hmgz f;
    private static final hmgz g;
    private static final hmgz h;
    private static final byte[] i;
    private hmbb j;

    static {
        hmcx.f = new hmgz(0x70);
        hmcx.g = hmgz.e(new byte[]{-97, 105});
        hmcx.h = new hmgz((byte)0x8C);
        hmcx.i = new byte[]{-97, 106};
    }

    public hmcx(hmct hmct0, hmic hmic0, List list0) {
        this.j = hmhe.a();
        int v = hmic0.a;
        if(v == 1) {
            if(hmic0.b == 1) {
                this.b = true;
            }
            v = 1;
        }
        try {
            this.a = hmcx.a(((byte)v), hmic0.b);
            this.j.e();
            hmdk hmdk0 = hmdk.b(hmic0.c);
            if(!hmdk0.a.q(hmcx.f)) {
                throw new hmdn("Invalid Record profile data");
            }
            LinkedHashMap linkedHashMap0 = hmdk.e(hmdk0.c);
            this.c = linkedHashMap0;
            if(this.b) {
                hmgz hmgz1 = hmcx.g;
                if(linkedHashMap0.containsKey(hmgz1)) {
                    this.e = hmgw.h(((hmdk)this.c.get(hmgz1)).c.a);
                    for(Object object0: list0) {
                        hmht hmht0 = (hmht)object0;
                        if(!this.e.contains(hmht0)) {
                            this.e.add(hmht0);
                        }
                    }
                }
                else {
                    this.e = new ArrayList();
                    this.j.e();
                    this.e.add(new hmht(hmcx.i, 4));
                }
                hmct0.i = this.e;
                hmbb hmbb1 = this.j;
                hmhf.a(this.e);
                hmbb1.e();
            }
            else {
                hmgz hmgz0 = hmcx.h;
                if(linkedHashMap0.containsKey(hmgz0)) {
                    List list1 = hmgw.h(((hmdk)this.c.get(hmgz0)).c.a);
                    this.d = list1;
                    hmbb hmbb0 = this.j;
                    hmhf.a(list1);
                    hmbb0.e();
                    List list2 = this.d;
                    if(list2 != null) {
                        hmct0.h = list2;
                    }
                }
            }
            hmbb hmbb2 = this.j;
            hmhf.a(this.c.values());
            hmbb2.e();
        }
        catch(hmdl | hmdm | hmdn exception0) {
            this.j.b(exception0, "Cannot parse the profile record data", new Object[0]);
            throw new hmfq(hmfl.K, ((hmdo)exception0).getMessage());
        }
    }

    public static Integer a(byte b, byte b1) {
        return (int)(b * 0x100 + b1);
    }

    @Override
    public final String toString() {
        hmbb hmbb0 = hmhe.a();
        hmbb0.e();
        hmbb0.e();
        List list0 = this.e;
        if(list0 != null) {
            hmhf.a(list0);
        }
        hmbb0.e();
        List list1 = this.d;
        if(list1 != null) {
            hmhf.a(list1);
        }
        hmbb0.e();
        LinkedHashMap linkedHashMap0 = this.c;
        if(linkedHashMap0 != null) {
            hmhf.a(linkedHashMap0.values());
        }
        hmbb0.e();
        hmbb0.e();
        return "MChipRecord";
    }
}

