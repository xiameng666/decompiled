import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class stc extends ssx implements stb {
    private final boolean a;

    public stc(ssy ssy0, byte[] arr_b) {
        this(ssy0, arr_b, 2);
    }

    public stc(ssy ssy0, byte[] arr_b, int v) {
        this(ssy0, arr_b, true, ssa.f);
        if(ssy0.c()) {
            throw new IllegalArgumentException("Proprietary tag range (primitive DF30 - DF7F and constructed FF30 - FF7F) is reserved for internal use");
        }
        if(ssy0.b() && v - 1 == 1) {
            try(idpv idpv0 = new idpv(arr_b)) {
                while(true) {
                    if(idpv0.b() == null) {
                        return;
                    }
                }
            }
            catch(Exception exception0) {
                throw new IllegalArgumentException("SeosTag is constructed, but the data is not well formed TLV. ASN.1 parser error message: " + exception0.getMessage(), exception0);
            }
        }
    }

    public stc(ssy ssy0, byte[] arr_b, boolean z, ssa ssa0) {
        super(ssy0, arr_b);
        stp.b(ssa0, "amrObjectPriority");
        this.a = z;
    }

    public stc(ssy ssy0, byte[] arr_b, byte[] arr_b1) {
        this(ssy0, arr_b, true, ssa.f);
        stp.b(ssy0, "seosTag");
        stp.b(arr_b, "data");
        if(ssy0.b()) {
            try(ssv ssv0 = new ssv(arr_b)) {
                while(true) {
                    if(ssv0.a() == null) {
                        return;
                    }
                }
            }
            catch(IOException iOException0) {
                throw new IllegalArgumentException("SeosTag is constructed, but the data is not well formed TLV. ASN.1 parser error message: " + iOException0.getMessage(), iOException0);
            }
        }
    }

    @Override  // stb
    public final byte[] e() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = this.a();
        if(this.a || arr_b != null && arr_b.length > 0) {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            stq.a(this.n.e(), byteArrayOutputStream0);
            stq.b(arr_b.length, byteArrayOutputStream0);
            stq.a(arr_b, byteArrayOutputStream0);
        }
        return byteArrayOutputStream0.toByteArray();
    }
}

