public class Person 
{
  private String name;
  private String email;
  private String phoneNumber;

public void print()
{

  System.out.println("Name is " + name);
  System.out.println("Email is " + email);
  System.out.println("phoneNumber is " + phoneNumber);
}

public Person(String nameTwo, String emailTwo, String phoneNumberTwo)
  {
    name = nameTwo;
    email = emailTwo;
    phoneNumber = phoneNumberTwo;

  }

}