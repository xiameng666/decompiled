import j..util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class gprf {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    static {
    }

    public gprf(int v, int v1, List list0, List list1, List list2, List list3) {
        this.a = v;
        this.b = v1;
        this.c = DesugarCollections.unmodifiableList(list0);
        this.d = DesugarCollections.unmodifiableList(list1);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f = DesugarCollections.unmodifiableList(list3);
    }

    public static gprf a(gprh gprh0, int v, int v1) {
        try {
            int v2 = gprh0.b();
            int v3 = gprh0.b();
            int v4 = gprh0.b();
            int v5 = gprh0.b();
            return new gprf(v1, v, gprf.c(gprh0, v2, true), gprf.c(gprh0, v3, false), gprf.c(gprh0, v4, false), gprf.c(gprh0, v5, false));
        }
        catch(EOFException eOFException0) {
            throw new gpre(12, "Reached the end of the mDNS response unexpectedly.", eOFException0);
        }
    }

    private static gprm b(gprh gprh0, boolean z) {
        String[] arr_s;
        try {
            arr_s = gprh0.g();
        }
        catch(IOException iOException0) {
            throw new gpre(3, "Failed to read labels from mDNS response.", iOException0);
        }
        try {
            switch(gprh0.b()) {
                case 1: {
                    return new gpra(arr_s, 1, gprh0, z);
                }
                case 12: {
                    return new gprj(arr_s, gprh0, z);
                }
                case 16: {
                    return new gpsp(arr_s, gprh0, z);
                }
                case 25: {
                    return new gprb(arr_s, gprh0, z);
                }
                case 28: {
                    return new gpra(arr_s, 28, gprh0, z);
                }
                case 33: {
                    return new gpsa(arr_s, gprh0, z);
                }
                case 0x2F: {
                    return new gprd(arr_s, gprh0, z);
                }
                case 0xFF: {
                    return new gpqq(arr_s, gprh0);
                }
            }
        }
        catch(EOFException eOFException0) {
            throw new gpre(12, "Reached the end of the mDNS response unexpectedly.", eOFException0);
        }
        try {
            gprh0.f(2);
            if(!z) {
                gprh0.f(4);
                gprh0.f(gprh0.b());
            }
            return null;
        }
        catch(IOException iOException1) {
            throw new gpre(11, "Failed to skip mDNS record.", iOException1);
        }
        try {
            return new gpra(arr_s, 1, gprh0, z);
        }
        catch(IOException iOException2) {
            throw new gpre(4, "Failed to read A record from mDNS response.", iOException2);
        }
        try {
            return new gprj(arr_s, gprh0, z);
        }
        catch(IOException iOException3) {
            throw new gpre(6, "Failed to read PTR record from mDNS response.", iOException3);
        }
        try {
            return new gpsp(arr_s, gprh0, z);
        }
        catch(IOException iOException4) {
            throw new gpre(10, "Failed to read TXT record from mDNS response.", iOException4);
        }
        try {
            return new gprb(arr_s, gprh0, z);
        }
        catch(IOException iOException5) {
            throw new gpre(15, "Failed to read KEY record from mDNS response.", iOException5);
        }
        try {
            return new gpra(arr_s, 28, gprh0, z);
        }
        catch(IOException iOException6) {
            throw new gpre(5, "Failed to read AAAA record from mDNS response.", iOException6);
        }
        try {
            return new gpsa(arr_s, gprh0, z);
        }
        catch(IOException iOException7) {
            throw new gpre(8, "Failed to read SRV record from mDNS response.", iOException7);
        }
        try {
            return new gprd(arr_s, gprh0, z);
        }
        catch(IOException iOException8) {
            throw new gpre(13, "Failed to read NSEC record from mDNS response.", iOException8);
        }
        try {
            return new gpqq(arr_s, gprh0);
        }
        catch(IOException iOException9) {
            throw new gpre(14, "Failed to read TYPE_ANY record from mDNS response.", iOException9);
        }
    }

    private static ArrayList c(gprh gprh0, int v, boolean z) {
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            gprm gprm0 = gprf.b(gprh0, z);
            if(gprm0 != null) {
                arrayList0.add(gprm0);
            }
        }
        return arrayList0;
    }
}

