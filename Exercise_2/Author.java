package SF_222.Exercise_2;

class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author(String n, String e, char g)
    {
        name = n;
        email = e;
        gender = g;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String e)
    {
        this.email = e;
    }

    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        return "Author name is " + name + " (" + gender + ") " + " at " + email;
    }
}
