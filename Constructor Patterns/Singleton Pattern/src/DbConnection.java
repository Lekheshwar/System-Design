public final class DbConnection {
    private static DbConnection instance;
    public boolean isConnected;
    private DbConnection(boolean isConnected){
        this.isConnected = isConnected;
    }

    public static DbConnection getInstance(boolean isConnected){
        if(instance == null){
            instance = new DbConnection(isConnected);
        }
        Pair<Integer,Integer> pair = new Pair<>(0, 0);
        System.out.println(pair.first);
        return instance;
    }
}
