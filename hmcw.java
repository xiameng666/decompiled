import java.util.LinkedHashMap;

public final class hmcw {
    public hmgz a;
    public hmgz b;
    private static final hmgz c;
    private static final hmgz d;
    private static final hmgz e;

    static {
        hmcw.c = new hmgz(0x77);
        hmcw.d = new hmgz((byte)0x82);
        hmcw.e = new hmgz(-108);
    }

    public hmcw(byte[] arr_b, boolean z) {
        if(arr_b != null) {
            try {
                hmdk hmdk0 = hmdk.b(arr_b);
                if(!hmdk0.a.q(hmcw.c)) {
                    throw new hmfq(hmfl.J, "Card Profile GPO Response does not contain tag MChipByteArray");
                }
                LinkedHashMap linkedHashMap0 = hmdk.e(hmdk0.c);
                hmdk hmdk1 = (hmdk)linkedHashMap0.get(hmcw.d);
                if(hmdk1 == null) {
                    throw new hmfq(hmfl.J, "Card Profile GPO Response does not contain tag MChipByteArray");
                }
                this.a = hmdk1.c;
                if(hmdk1.c.b() != 2) {
                    throw new hmfq(hmfl.J, "Card Profile GPO Response AIP has incorrect length (" + this.a.b() + "), expected 2");
                }
                if(z) {
                    this.a.u(1, 7);
                }
                hmdk hmdk2 = (hmdk)linkedHashMap0.get(hmcw.e);
                if(hmdk2 == null) {
                    throw new hmfq(hmfl.J, "Card Profile GPO Response does not contain tag MChipByteArray");
                }
                this.b = hmdk2.c;
                return;
            }
            catch(hmdl | hmdm | hmdn exception0) {
                hmhe.a().b(exception0, "Cannot parse TLV Object while building GPO Command", new Object[0]);
                throw new hmfq(hmfl.J);
            }
        }
        throw new hmfq(hmfl.q);
    }
}

