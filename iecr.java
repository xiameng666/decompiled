public interface iecr {
    int doFinal(byte[] arg1, int arg2);

    String getAlgorithmName();

    int getMacSize();

    void init(iebu arg1);

    void reset();

    void update(byte arg1);

    void update(byte[] arg1, int arg2, int arg3);
}

