final class iayj implements iamn {
    @Override  // iaoe
    public final Object a(byte[] arr_b) {
        if(arr_b.length >= 3) {
            return (int)((arr_b[0] - 0x30) * 100 + (arr_b[1] - 0x30) * 10 + (arr_b[2] - 0x30));
        }
        throw new NumberFormatException("Malformed status code " + new String(arr_b, iamo.a));
    }

    @Override  // iaoe
    public final byte[] b(Object object0) {
        Integer integer0 = (Integer)object0;
        throw new UnsupportedOperationException();
    }
}

