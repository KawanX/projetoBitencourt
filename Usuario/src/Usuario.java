public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    public Usuario() {
        this ("","","","");
    }
    
    public Usuario(String email, String login, String nome, String senha) {
        this.email = email;
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void provarExistencia(){
        System.out.println("Oi, meu nome é "+this.getNome()+", e eu existo!!!");
    }

}