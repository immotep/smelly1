//USER-CLASS
class User {

    private String username;
    private String password;
    private boolean legitimate = false;
    private boolean loggedInStatus = false;

    public void setLegitimate(boolean val) {
        legitimate = val;
        if( val == true )
            loggedInStatus = true;
    }
    public boolean isLegitimate() {
        return this.legitimate;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password ) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;  }

    public String getPassword() {
        return this.password;
    }

    public boolean isAlreadyLoggedin() {
        return loggedInStatus ;
    }
}