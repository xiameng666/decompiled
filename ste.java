import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class ste {
    public static final ssy a;
    public static final ssy b;
    public static final ssy c;
    public static final ssy d;
    protected final Map e;

    static {
        ste.a = new ssy(0x7C);
        ste.b = new ssy(0x81);
        ste.c = new ssy(130);
        ste.d = new ssy(0xE0);
    }

    public ste(List list0) {
        this.e = new HashMap();
        for(Object object0: list0) {
            this.e.put(((std)object0).a, ((std)object0).b);
        }
    }

    public ste(ssy ssy0, byte[] arr_b) {
        HashMap hashMap0 = new HashMap();
        this.e = hashMap0;
        hashMap0.put(ssy0, stm.a(arr_b));
    }

    public static ste a(byte[] arr_b) {
        if(arr_b.length < 4) {
            throw new IllegalArgumentException("Data too short, expected at least 4 bytes");
        }
        int v = arr_b[0];
        if(v == ((byte)ste.a.a)) {
            try {
                ssv ssv0 = new ssv(new ssv(arr_b).a().a());
                ssw ssw0 = ssv0.a();
                ArrayList arrayList0 = new ArrayList();
                if(ssw0.d().a == ste.d.a) {
                    ArrayList arrayList1 = new ArrayList();
                    ssv ssv1 = new ssv(ssw0.a());
                    for(ssw ssw1 = ssv1.a(); ssw1 != null; ssw1 = ssv1.a()) {
                        arrayList1.add(new std(ssw1.d(), ssw1.a()));
                    }
                    arrayList0.addAll(arrayList1);
                }
                while(ssw0 != null) {
                    arrayList0.add(new std(ssw0.d(), ssw0.a()));
                    ssw0 = ssv0.a();
                }
                return new ste(arrayList0);
            }
            catch(IOException iOException0) {
                throw new stt("Failed to parse authentication template", iOException0);
            }
        }
        throw new IllegalArgumentException("Expected authentication template (7c...), start: " + v);
    }

    public final boolean b(ssy ssy0) {
        return this.e.containsKey(ssy0);
    }

    public final byte[] c(ssy ssy0) {
        return stm.a(((byte[])this.e.get(ssy0)));
    }

    public final byte[] d() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        for(Object object0: this.e.entrySet()) {
            stq.a(((ssy)((Map.Entry)object0).getKey()).e(), byteArrayOutputStream0);
            stq.b(((byte[])((Map.Entry)object0).getValue()).length, byteArrayOutputStream0);
            stq.a(((byte[])((Map.Entry)object0).getValue()), byteArrayOutputStream0);
        }
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
        stq.a(ste.a.e(), byteArrayOutputStream1);
        stq.b(arr_b.length, byteArrayOutputStream1);
        stq.a(arr_b, byteArrayOutputStream1);
        return byteArrayOutputStream1.toByteArray();
    }
}

