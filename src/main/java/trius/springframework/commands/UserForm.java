package trius.springframework.commands;




public class UserForm {
    private String email;

    private String parola;

    public UserForm(String email, String parola) {
        this.email = email;
        this.parola = parola;
    }

    public UserForm() {
    }

    public String getEmail() { return email; }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}
