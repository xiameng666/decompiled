import android.util.SparseArray;

public class eqlu {
    public final ProtoLiteBuilder a;
    private final SparseArray b;

    public eqlu() {
        this.b = new SparseArray();
        this.a = ((ProtoLiteMessage)gjob.a).v_newBuilder();
    }

    public final gjmn[] a() {
        SparseArray sparseArray0 = this.b;
        gjmn[] arr_gjmn = new gjmn[sparseArray0.size()];
        for(int v = 0; v < sparseArray0.size(); ++v) {
            arr_gjmn[v] = (gjmn)((ProtoLiteBuilder)sparseArray0.valueAt(v)).N_build();
        }
        return arr_gjmn;
    }

    public final void b(int v) {
        SparseArray sparseArray0 = this.b;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)sparseArray0.get(v - 1);
        if(hftp0 == null) {
            hftp0 = ((ProtoLiteMessage)gjmn.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjmn)hftp0.b_message).c = v - 1;
            ((gjmn)hftp0.b_message).b |= 1;
            sparseArray0.put(v - 1, hftp0);
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v1 = ((gjmn)hftv0).d + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjmn gjmn0 = (gjmn)hftp0.b_message;
        gjmn0.b |= 2;
        gjmn0.d = v1;
    }
}

