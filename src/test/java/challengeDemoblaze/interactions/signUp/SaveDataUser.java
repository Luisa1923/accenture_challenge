package challengeDemoblaze.interactions.signUp;

public class SaveDataUser {

    private static String customerName;
    private static String passwordName;

    private SaveDataUser() {
        // Constructor privado para evitar la creación de instancias
    }
    public static void setDatosUsuarioGenerados(String customerName, String passwordName) {
        SaveDataUser.customerName = customerName;
        SaveDataUser.passwordName = passwordName;
    }
    public static String getCustomerName() {
        return customerName;
    }

    public static String getPasswordName() {
        return passwordName;
    }
}