package clients;

public class Client
{
    private String firstName;
    private String lastName;
    private String pesel;
    // TODO - change to long to extend range
    private int id;
    private static int generatedId = 0;

    /**
     * Getter
     * @return firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Setter
     * @param firstName
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Getter
     * @return lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Setter
     * @param lastName
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Getter
     * @return id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Setter
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Client constructor
     *
     * Setting firstName and lastName, id is generated by increasing static int attribute.
     * @param firstName
     * @param lastName
     */
    public Client(String firstName, String lastName, String pesel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        //TODO - liczba znaków pesel
        this.pesel = pesel;
        this.id = generatedId++;
    }

    /**
     * Method to compare one object with another
     * @param object
     * @return
     */
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;

        Client client = (Client) object;

        if (!firstName.equals(client.firstName))
            return false;
        if (!lastName.equals(client.lastName))
            return false;
        if (!pesel.equals(client.pesel))
            return false;

        return true;
    }

    /**
     * Unique code of the object based on its attributes
     * @return
     */
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + pesel.hashCode();
        return result;
    }
}
