public final class agqo implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = Boolean.valueOf(false);
        if(((ggeo)object0).containsKey("credentials_enable_sync") && !((Boolean)((ggeo)object0).get("credentials_enable_sync")).booleanValue()) {
            return object1;
        }
        return ((ggeo)object0).containsKey("credentials_enable_service") && !((Boolean)((ggeo)object0).get("credentials_enable_service")).booleanValue() ? object1 : Boolean.valueOf(((boolean)(((Boolean)((ggeo)object0).getOrDefault("credentials_need_first_time_welcome", Boolean.valueOf(true))).booleanValue() ^ 1)));
    }
}

