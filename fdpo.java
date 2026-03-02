import android.os.ParcelFileDescriptor;

public final class fdpo {
    public final byte[] a;
    public final String b;
    public final ParcelFileDescriptor c;

    public fdpo(byte[] arr_b, String s, ParcelFileDescriptor parcelFileDescriptor0) {
        this.a = arr_b;
        this.b = s;
        this.c = parcelFileDescriptor0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Asset[");
        String s = this.b;
        if(s == null) {
            stringBuilder0.append("nodigest");
        }
        else {
            stringBuilder0.append(s);
        }
        byte[] arr_b = this.a;
        if(arr_b != null) {
            stringBuilder0.append(", size=");
            stringBuilder0.append(arr_b.length);
        }
        ParcelFileDescriptor parcelFileDescriptor0 = this.c;
        if(parcelFileDescriptor0 != null) {
            stringBuilder0.append(", fd=");
            stringBuilder0.append(parcelFileDescriptor0);
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

