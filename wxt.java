public final class wxt implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        return ((String)object0).startsWith("com.google.android.gms.") ? ((String)object0).substring(23) : ((String)object0);
    }
}

