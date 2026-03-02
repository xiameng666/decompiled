public final class ifsq {
    public static byte[] a(ienr ienr0, idqy idqy0) {
        if(ienr0.a) {
            try {
                return ifok.a(ienr0, idqy0).v("DER");
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
        throw new IllegalArgumentException("public key found");
    }

    public static byte[] b(ienr ienr0) {
        if(!ienr0.a) {
            try {
                return ifpn.a(ienr0).v("DER");
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
        throw new IllegalArgumentException("private key found");
    }
}

