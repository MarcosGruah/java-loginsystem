package mapa.core.entity;

/**
 *
 * @author Marcos Almeida - https://github.com/MarcosGruah
 */

public class User {

    private Integer Id;
    private String Name;
    private String Login;
    private String Password;
    private String Email;

    public User(String Name, String Login, String Password, String Email) {
        this.Name = Name;
        this.Login = Login;
        this.Password = Password;
        this.Email = Email;
    }

    public User(String Name, String Login, String Password, String Email, Integer Id) {
        this.Id = Id;
        this.Name = Name;
        this.Login = Login;
        this.Password = Password;
        this.Email = Email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
