public abstract class hnks implements hnkk {
    @Override
    public final String toString() {
        byte[] arr_b = this.a();
        StringBuilder stringBuilder0 = new StringBuilder();
        if(arr_b != null) {
            for(int v = 0; v < arr_b.length; ++v) {
                stringBuilder0.append(String.format("%02X", ((byte)arr_b[v])));
            }
        }
        return a.a(stringBuilder0.toString(), "Apdu { ", " }");
    }
}

