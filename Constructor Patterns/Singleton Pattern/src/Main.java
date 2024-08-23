public class Main {
    public static void main(String[] args) {
        DbConnection firstConnect = DbConnection.getInstance(true);
        DbConnection secondConnect = DbConnection.getInstance(false);

        System.out.println(firstConnect.isConnected);
        System.out.println(secondConnect.isConnected);
    }
}