import android.util.SparseArray;
import java.util.LinkedList;
import java.util.List;

public final class eqgv {
    private final SparseArray a;
    private final eqgt b;
    private final int c;
    private int d;

    public eqgv(eqgt eqgt0, int v) {
        if(v == 0) {
            throw new IllegalArgumentException("Invalid byte size");
        }
        this.c = v;
        this.b = eqgt0;
        this.a = new SparseArray();
    }

    public final List a(byte[] arr_b) {
        List list0;
        synchronized(this) {
            LinkedList linkedList0 = new LinkedList();
            int v2 = 0;
            while(v2 < arr_b.length) {
                int v3 = arr_b.length - v2;
                byte[] arr_b1 = v3 <= this.c ? new byte[v3] : new byte[this.c];
                System.arraycopy(arr_b, v2, arr_b1, 0, arr_b1.length);
                v2 += arr_b1.length;
                linkedList0.add(arr_b1);
            }
            list0 = new LinkedList();
            int v4 = this.d + 1;
            this.d = v4;
            for(int v1 = 0; v1 < linkedList0.size(); ++v1) {
                byte[] arr_b2 = (byte[])linkedList0.get(v1);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqnz.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eqnz eqnz0 = (eqnz)hftp0.b_message;
                eqnz0.b |= 4;
                eqnz0.e = arr_b.length;
                ByteString hfsf0 = ByteString.copyFrom(arr_b2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((eqnz)hftv0).b |= 8;
                ((eqnz)hftv0).f = hfsf0;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((eqnz)hftv1).b |= 2;
                ((eqnz)hftv1).d = v1;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eqnz eqnz1 = (eqnz)hftp0.b_message;
                eqnz1.b |= 1;
                eqnz1.c = v4;
                list0.add(((eqnz)hftp0.N_build()).toBytesArray());
            }
        }
        return list0;
    }

    public final void b(byte[] arr_b) {
        eqnz eqnz0;
        synchronized(this) {
            if(arr_b.length == 0) {
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Empty byte array");
                this.b.b(illegalArgumentException0);
                return;
            }
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)eqnz.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                eqnz0 = (eqnz)hftv0;
            }
            catch(hfur hfur0) {
                this.b.b(hfur0);
                return;
            }
            SparseArray sparseArray0 = this.a;
            eqgu eqgu0 = (eqgu)sparseArray0.get(eqnz0.c);
            if(eqgu0 == null) {
                eqgu0 = new eqgu();
                sparseArray0.put(eqnz0.c, eqgu0);
            }
            if(eqgu0.a == null) {
                eqgu0.a = new byte[eqnz0.e];
            }
            int v1 = eqnz0.d;
            if(eqgu0.b + 1 == v1) {
                eqgu0.a(eqnz0);
            }
            else {
                eqgu0.d.put(v1, eqnz0);
            }
            byte[] arr_b1 = eqgu0.a;
            if(arr_b1 != null && eqgu0.c == arr_b1.length) {
                this.b.a(arr_b1);
                sparseArray0.remove(eqnz0.c);
            }
        }
    }
}

